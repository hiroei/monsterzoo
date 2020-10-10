public class Main {
	static User usr = new User();
	static MonsterZoo pz = new MonsterZoo();

	public static void main(String[] args) {

		pz.setMonsterZukan();

		//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
		//手持ちのボールが無くなったら終了
		while(true){
			int flag = tryMoveUser();
			if(flag==1) break;
		}

		System.out.println("ボールがなくなった！");
		usr.outputMonsters();
	}

	public static int tryMoveUser() {
		try {
			Thread.sleep(1000);
			if(usr.getBalls()>0){
				usr.move();
				usr.outputStatus();
				return 0;
			}else{
				return 1;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
