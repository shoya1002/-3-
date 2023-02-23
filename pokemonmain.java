package pokemonPT;

import java.util.ArrayList;
import java.util.List;

public class pokemonmain {
	public static void main(String[] args) {
		List<String> pokemon = new ArrayList<>();
		pokemon.add("ピカチュウ");
		pokemon.add("ネギガナイト");
		pokemon.add("ゲンガー");
		pokemon.add("ウオノドラゴン");
		pokemon.add("ルカリオ");
		pokemon.add("カイリュー");

		System.out.println("手持ちのポケモンから３体選出してください");
		System.out.println(pokemon.get(0));
		System.out.println(pokemon.get(5));
		System.out.println(pokemon.get(1));
	}

}
