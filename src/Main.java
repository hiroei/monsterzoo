import java.util.List;
import java.util.ArrayList;

public class Main {
	static User usr = new User();
	static MonsterZoo pz = new MonsterZoo();

	public static void main(String[] args) {

		setMonsterZukan();

		//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
		//手持ちのボールが無くなったら終了
		while(true){
			try {
				Thread.sleep(1000);
				if(usr.getBalls()>0){
					usr.move();
					System.out.println("手持ちのボールは"+usr.getBalls()+"個，フルーツは"+usr.getFruits()+"個, 卵は"+usr.getEggs()+"個");
					System.out.println(usr.getDistance()+"km歩いた．");
				}else{
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ボールがなくなった！");

		for(int i=0;i<usr.getUserMonster().size();i++){
			if(usr.getUserMonster().get(i)!=null){
				System.out.println(usr.getUserMonster().get(i)+"を捕まえた．");
			}
		}
	}

	//テスト用のモンスターデータを登録するメソッド
	public static void setMonsterZukan(){
		// String tempMonster[] = new String[22];
		List<String> tempMonster = new ArrayList<String>();

		// double tempMonsterRare[] = new double[22];
		List<Double> tempMonsterRare = new ArrayList<Double>();
		tempMonster.add("イガキン");	tempMonsterRare.add(9.0);
		tempMonster.add("ナマチュウ");	tempMonsterRare.add(3.0);
		tempMonster.add("イノウエン");	tempMonsterRare.add(1.0);
		tempMonster.add("リョージィ");	tempMonsterRare.add(2.0);
		tempMonster.add("アキモトン");	tempMonsterRare.add(5.0);
		tempMonster.add("ゴージマ");	tempMonsterRare.add(4.0);
		tempMonster.add("チュウデン");	tempMonsterRare.add(6.0);
		tempMonster.add("ヅカホン");	tempMonsterRare.add(8.0);
		tempMonster.add("ニシムラー");	tempMonsterRare.add(7.0);
		tempMonster.add("サコーデン");	tempMonsterRare.add(2.0);
		tempMonster.add("ウッチー");	tempMonsterRare.add(5.0);
		tempMonster.add("ハヤッシー");	tempMonsterRare.add(4.0);
		tempMonster.add("キーチー");	tempMonsterRare.add(3.0);
		tempMonster.add("リョクン");	tempMonsterRare.add(1.0);
		tempMonster.add("デコポン");	tempMonsterRare.add(6.0);
		tempMonster.add("カミサン");	tempMonsterRare.add(5.0);
		tempMonster.add("シスイ");	    tempMonsterRare.add(1.0);
		tempMonster.add("ジョナ"); 	    tempMonsterRare.add(7.0);
		tempMonster.add("ギダギダ");	tempMonsterRare.add(2.0);
		tempMonster.add("ミッツー");	tempMonsterRare.add(8.0);
		tempMonster.add("ゾエサン");	tempMonsterRare.add(5.0);
		tempMonster.add("キタバー");	tempMonsterRare.add(3.0);

		pz.setMonsterZukan(tempMonster);
		pz.setMonsterRare(tempMonsterRare);
	}

}
