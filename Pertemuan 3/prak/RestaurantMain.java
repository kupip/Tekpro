package prak;
public class RestaurantMain {
	public static void main(String[] args) {
		// KAMUS DATA
		Restaurant menu= new Restaurant ();
		
		// ALGORITMA
		menu.tambahMenuMakanan ("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan ("Gehu", 1_000, 20);
		menu.tambahMenuMakanan ("Tahu", 1_000, 0);
		menu.tambahMenuMakanan ("Molen", 1_000, 20);
		
		menu.tampilMenuPesan();
	}
}