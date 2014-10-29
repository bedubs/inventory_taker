
/**
 * 
 * This class is for handling serialized products in inventory.
 * This will extend the Products class
 * 
 * */

public class Serialized extends Products {
		
		String itemName;
		String itemNum;
		int totalStock = 0;
		
		public Serialized ( String num, String name ) {
			super( num, name );
		}
		
		
}
