
/* *
 *This class will generate an array that will 
 * hold each item scanned. Each shelf object 
 * will hold its own array.
 * */
 
 import java.util.ArrayList;
 
 public class Shelf 
 {
	 
	 String shelfNumber;
	 
	 
	 public Shelf()
	 {
		this.shelfNumber = this.getShelfNumber();	
	 }
	 
	 public void setShelfNumber( String shelfNumber )
	 {
		 this.shelfNumber = shelfNumber;
	 }
	 
	 public String getShelfNumber()
	 {
		 return this.shelfNumber;
	 
	 }


 }
