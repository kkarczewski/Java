//public - wsz�dzie
//protected -  w tej samej klasie, pakiecie, podklasie 
//private - tylko w tej samej klasie
//bez niczego (int hight) - w tym samym pakiecie

import world.Plant;

public class App {
	public static void main(String[] args) {

		Plant plant1 = new Plant();

		System.out.println(plant1.name);
		System.out.println(plant1.ID);
		// nie zadzia�a type jest private
		// System.out.println(plant1.type);

		// size is protected; App w innym package - nie zadzia�a
		// System.out.println(plant.size);
		// nie dzia�a App i Plant w r�nych Pakietach
		// System.out.println(plant.hight);
	}
}
