package world;

public class Oak extends Plant {
	public Oak() {
		// Plant.type jest niewidoczny, jest private
		// type = "Tree";
		// size jest protected wi�c dost�p jest w ca�ym pakiecie,
		// w klasie macierzystej i pod klasach
		this.size = "medium";
		// dzia�a bo s� w jednym pakiecie, a height nie ma zaznaczonej specyfiki
		// dost�pu
		this.height = 20;
	}
}
