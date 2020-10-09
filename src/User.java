import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class User {
    Double distance;//歩いた距離
	Integer balls;//モンスターを捕まえられるボールの数
	Integer fruits;//ぶつけるとモンスターが捕まえやすくなるフルーツ

	//卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
	//移動するたびに,eggDistanceに1.0kmずつ加算される．
	//3km移動するとランダムでモンスターが孵る
	private Egg[] egg; //ユーザが持っている卵

    //ユーザがGetしたモンスター一覧
	List<String> userMonster;

	public User() {
		egg = new Egg[9];
		// for(int i=0;i<9;i++) {
		IntStream.range(0, 9)
			.forEach(value -> egg[value] = new Egg());
			// egg[i] = new Egg();
		// }

		this.distance=0.0;
		this.balls=10;
		this.fruits=0;
		this.userMonster = new ArrayList<String>();
	}

	void updateEggDistance() {
		for(int i=0;i<this.egg.length;i++){//卵は移動距離が進むと孵化するため，何km移動したかを更新する
			if(this.egg[i].exist==true){
				this.egg[i].updateDistance();
			}
		}
	}

	void addEggToUser(int i) {
		if(this.egg[i].exist==false){
			this.egg[i].setEgg();
			this.egg[i].resetDistance();
		}
	}

	void checkUserEggStatus(int e) {
		if(e>=1){//卵を1つ以上Getしたら
			//egg[]に10個以上卵がない場合は新しい卵データをセットする
			for(int i=0;i<this.egg.length;i++){
				this.addEggToUser(i);
				break;
			}
		}
	}

	void runZooStation() {
		System.out.println("ズーstationを見つけた！");
		int b=(int)(Math.random()*3);//ball,fruits,eggがランダムに出る
		int f=(int)(Math.random()*2);
		int e=(int)(Math.random()*2);
		System.out.println("ボールを"+b+"個，"+"フルーツを"+f+"個"+"卵を"+e+"個Getした！");
		this.balls=this.balls+b;
		this.fruits=this.fruits+f;
		checkUserEggStatus(e);
	}

	int throwFluitsToMonster(int r) {
		if(this.fruits>0){
			System.out.println("フルーツを投げた！捕まえやすさが倍になる！");
			this.fruits--;
			r = r * 2;
		}
		return r;
	}

	void addUserMonster(int m) {
		String addMonster = MonsterZoo.monsterZukan.get(m);
		userMonster.add(addMonster);
	}

	int throwBallToMonster(int m, int r) {
		System.out.println(MonsterZoo.monsterZukan.get(m)+"にボールを投げた");
		this.balls--;
		if(MonsterZoo.monsterRare.get(m)<=r){//monsterRare[m]の値がr以下の場合
			System.out.println(MonsterZoo.monsterZukan.get(m)+"を捕まえた！");
			addUserMonster(m);
			return 0;//ボール投げ終了
		}else{
			System.out.println(MonsterZoo.monsterZukan.get(m)+"に逃げられた！");
			return 1;
		}
	}

	void meetMonster() {
		int m = (int)(MonsterZoo.monsterZukan.size()*Math.random());//monsterZukanからランダムにモンスターを出す
		System.out.println(MonsterZoo.monsterZukan.get(m)+"が現れた！");
		for(int i=0;i<3&&this.balls>0;i++){//捕まえる or 3回ボールを投げるまで繰り返す
			int r = (int)(6*Math.random());//0~5までの数字をランダムに返す
			r = throwFluitsToMonster(r);
			int status = throwBallToMonster(m, r);
			if(status==0) break;
		}
	}

	void checkEggStatus() {
		for(int i=0;i<this.egg.length;i++){
			int mons = this.egg[i].checkStatus();
			if(mons>-1) {
				addUserMonster(mons);
			}
		}
	}

	//呼び出すと1km distanceが増える
	void move(){
		this.distance++;
		updateEggDistance();

		int flg1 = (int)(Math.random()*10);//0,1の場合はズーstation，7~9の場合はモンスター
		if(flg1<=1){
			runZooStation();
		}else if(flg1>=7){
			meetMonster();
		}
		checkEggStatus();
	}

	public double getDistance() {
		return distance;
	}

	public int getBalls() {
		return balls;
	}

	public int getFruits() {
		return fruits;
	}

	public int getEggs() {
		int eggCount=0;
		for(Egg b : this.egg) {
			if(b.exist==true) eggCount++;
		}
		return eggCount;
	}

	public List<String> getUserMonster() {
		return userMonster;
	}
	
}