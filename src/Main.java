public class Main {
	static User usr = new User();
	static MonsterZoo pz = new MonsterZoo();

	public static void main(String[] args) {

		pz.setMonsterZukan();

		//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
		//手持ちのボールが無くなったら終了
		while(true){
			try {
				Thread.sleep(1000);
				if(usr.getBalls()>0){
					moveUser();
				}else{
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ボールがなくなった！");
		usr.outputMonsters();
	}

	public static void moveUser() {
		usr.move();
		usr.outputStatus();
	}
}
