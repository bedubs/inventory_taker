
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
import java.util.ArrayList;

public class Inventory {
	
	public static void main( String[] args ) throws Exception {
		
		Scanner input = new Scanner( System.in );
        ArrayList<String> serials = new ArrayList<String>();
        Shelf shelf = new Shelf();
		 
		//This will handle printing to a file
		//String fileName = new Date() + ".txt";
		//Date date = new Date();
		//PrintWriter output = new PrintWriter( fileName );
		/*
		System.out.println( "Please enter the Item Number: " );
		String itemNumber = input.nextLine();
		
		System.out.println( "Please enter the Item Name: " );
		String itemName = input.nextLine();
		
		NonSerialized item = new NonSerialized( itemNumber, itemName );
		
		
		System.out.println( "Is this product serialized? \n\t1. Yes\n\t2. No" );
		int choice = input.nextInt();
		
		if ( choice == 1 ) {
			
			Serialized item = new Serialized( itemNumber, itemName );
		
		} else {
		
			NonSerialized item = new NonSerialized( itemNumber, itemName );
		
		}
		
		
		item.addStock();
		
		System.out.println( "Item Number: " + item.getItemNum() + "\nItem Name: " + item.getItemName() + "\nTotal Count: " + item.getStockTotal() );

		}
		*/
        
        String shelfNumber;
        String itemNumber = "";
		
		do
		{
            System.out.println( "Please enter the Shelf Number or 'xx' to quit: " );
            shelfNumber = input.next();
            
            if ( !shelfNumber.equals("xx") )
            {
                shelf.setShelfNumber( shelfNumber );
                System.out.println( "Is the item serialized? \n\t1.Yes\n\t2.No" );
                int choice = input.nextInt();
                System.out.println( "Enter the Item Number: " );
                itemNumber = input.next();
                System.out.println( "\n" );
                            
                if ( choice == 1 )
                {
                    System.out.println( "Enter Serial Number or 'xx' to quit: " );
                    String serialNumber = input.next();
                    while( !serialNumber.equals( "xx" ))
                    {
                       serials.add( serialNumber );
                       
                       System.out.println( "Enter Serial Number or 'xx' to quit: " );
                       serialNumber = input.next(); 
                    }
                    
                }
            }
            
            
            
		} while ( !shelfNumber.equals( "xx" ) );
        
        System.out.println( "Shelf: " + shelf.getShelfNumber() );
        System.out.println( itemNumber + " has " + serials.size() + " items in it." );
        
        for(String d : serials)
        {
            System.out.println( "\t" + itemNumber + " : " + d );
        }
	
	
	}
    
 }
