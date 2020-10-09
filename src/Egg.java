public class Egg{
    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
	//移動するたびに,eggDistanceに1.0kmずつ加算される．
	//3km移動するとランダムでモンスターが孵る
    Double distance;
    Boolean exist;

    Egg(){
        distance=0.0;
        exist=false;
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
}