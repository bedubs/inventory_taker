
/**
 * 
 * This class is for handling nonserialized products in inventory.
 * This will extend the Products class
 * 
 * */
 
import java.util.Scanner;

public class NonSerialized extends Products {
		
		Scanner input = new Scanner( System.in );
		String itemName;
		String itemNum;
		int totalStock = 0;
		
		public NonSerialized ( String num, String name ) {
			super( num, name );
		}
		
		public void addStock () {
			System.out.println( "[1]Add quantity or [2]scan?" );
			int choice = input.nextInt();
			if (choice == 1 ) {
				System.out.println( "Enter the quantity: " );
				int quantity = input.nextInt();
				totalStock += quantity;
			} else if (choice == 2) {
				
				System.out.println( "Scan now or 'q' to quit:" );
				String scan = input.next();
				
				while ( !scan.equals("q") ) {		 
							
					totalStock += 1;
					
					System.out.println( "Scan now or zzz to quit:" );
					scan = input.next();
				
				} 
			} else {
				System.out.println( "That is not an option" );
			}
			
			
		}
		
		public int getStockTotal(){
			return totalStock;
		}
}
