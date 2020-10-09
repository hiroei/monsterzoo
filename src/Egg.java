public class Egg{
    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
	//移動するたびに,eggDistanceに1.0kmずつ加算される．
	//3km移動するとランダムでモンスターが孵る
    Double distance;
    Boolean exist;

    Egg(){
        this.distance=0.0;
        this.exist=false;
    }

    void setEgg() {
        exist=true;
    }

    void updateDistance(){
        distance++;
    }

    void resetDistance() {
        distance = 0.0;
    }

    void clearAllStatus() {
        exist=false;
        distance=0.0;
    }

    int checkStatus() {
		if(exist==true&&distance>=3){
			System.out.println("卵が孵った！");
			int m = (int)(MonsterZoo.monsterZukan.size()*Math.random());
			System.out.println(MonsterZoo.monsterZukan.get(m)+"が産まれた！");
            clearAllStatus();
            return m;
        }
        return -1;
	}
}