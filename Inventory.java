
/**
 *
 *  This program is for taking a simple inventory in a warehouse setting.
 *  William E. Williamson, Jr.
 * 
 **/
 
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Date;

public class Inventory {
	
	public static void main( String[] args ) throws Exception {
		
		Scanner input = new Scanner( System.in );
		String fileName = new Date() + ".txt";
		Date date = new Date();
		PrintWriter output = new PrintWriter( fileName );
		
		System.out.println( "Please enter the Item Number: " );
		String itemNumber = input.nextLine();
		
		System.out.println( "Please enter the Item Name: " );
		String itemName = input.nextLine();
		
		NonSerialized item = new NonSerialized( itemNumber, itemName );
		
		/*
		System.out.println( "Is this product serialized? \n\t1. Yes\n\t2. No" );
		int choice = input.nextInt();
		
		if ( choice == 1 ) {
			
			Serialized item = new Serialized( itemNumber, itemName );
		
		} else {
		
			NonSerialized item = new NonSerialized( itemNumber, itemName );
		
		}
		*/
		
		item.addStock();
		
		System.out.println( "Item Number: " + item.getItemNum() + "\nItem Name: " + item.getItemName() + "\nTotal Count: " + item.getStockTotal() );

		}

	
	
	}
