/*
 * 
 * Student: Dona AlThunayan - ID: 2110395
 * Student: Rogayah Garout - ID: 2112035
 * 
 */

package businessmenu;

public class InvalidInputException extends Exception {
    
   public InvalidInputException(String e){
   
  super("Invalid input:"+e);
   }
           
}