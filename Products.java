
/**
 * 
 * This is the parent class of all types of products
 * 
 * */

public class Products {
		
		String itemName;
		String itemNum;
		int totalStock = 0;
		
		public Products ( String num, String name ) {
			this.itemName = name;
			this.itemNum = num;
		}
		
		public String getItemName(){
			return itemName;
		}
		
		public String getItemNum(){
			return itemNum;
				
		}
		
		public int getStockTotal() {
			return totalStock;
		}
		
}
