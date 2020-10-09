

public class MonsterZoo {
	//モンスター図鑑．モンスターの名前とレア度(0.0~9.0)がそれぞれの配列に保存されている
	//レア度が高いほうが捕まえにくい
	static String monsterZukan[] = new String[22];
	static double monsterRare[] = new double[22];

	public void setMonsterZukan(String[] monsterZukan) {
		MonsterZoo.monsterZukan = monsterZukan;
	}

	public void setMonsterRare(double[] monsterRare) {
		MonsterZoo.monsterRare = monsterRare;
	}
}
