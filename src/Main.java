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
		printResult();
	}

	public static void moveUser() {
		usr.move();
		System.out.println("手持ちのボールは"+usr.getBalls()+"個，フルーツは"+usr.getFruits()+"個, 卵は"+usr.getEggs()+"個");
		System.out.println(usr.getDistance()+"km歩いた．");
	}

	public static void printResult() {
		for(int i=0;i<usr.getUserMonster().size();i++){
			if(usr.getUserMonster().get(i)!=null){
				System.out.println(usr.getUserMonster().get(i)+"を捕まえた．");
			}
		}
	}
}
