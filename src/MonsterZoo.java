import java.util.List;
import java.util.ArrayList;

public class MonsterZoo {
	//モンスター図鑑．モンスターの名前とレア度(0.0~9.0)がそれぞれの配列に保存されている
	//レア度が高いほうが捕まえにくい
	static List<String> monsterZukan = new ArrayList<String>();
	static List<Double> monsterRare = new ArrayList<Double>();

	//テスト用のモンスターデータを登録するメソッド
	public void setMonsterZukan(){
		List<String> tempMonster = new ArrayList<String>();

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

		// setMonsterZukan(tempMonster);
		MonsterZoo.monsterZukan = tempMonster;
		// setMonsterRare(tempMonsterRare);
		MonsterZoo.monsterRare = tempMonsterRare;
	}
}
