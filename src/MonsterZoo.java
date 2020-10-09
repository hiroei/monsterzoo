import java.util.List;
import java.util.ArrayList;

public class MonsterZoo {
	//モンスター図鑑．モンスターの名前とレア度(0.0~9.0)がそれぞれの配列に保存されている
	//レア度が高いほうが捕まえにくい
	// static String monsterZukan[] = new String[22];
	// static double monsterRare[] = new double[22];
	static List<String> monsterZukan = new ArrayList<String>();
	static List<Double> monsterRare = new ArrayList<Double>();

	public void setMonsterZukan(List<String> monsterZukan) {
		MonsterZoo.monsterZukan = monsterZukan;
	}

	public void setMonsterRare(List<Double> monsterRare) {
		MonsterZoo.monsterRare = monsterRare;
	}
}
