import java.io.*; 
import java.util.*;

public class FileHandling {

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter words you would like to add to the file: ");
		String words = in.nextLine();
				
		//MAKE AND WRITE TO A FILE
		try {
			FileWriter writer = new FileWriter ("Testing.txt");
			writer.write (words); //takes in string
			writer.close();
			
		} catch (IOException ex) {
				System.out.println (ex);
		}
		
		//READ A FILE 
		try {
			
			File myFile = new File ("Testing.txt");
			FileReader fileReader = new FileReader (myFile);
			BufferedReader reader = new BufferedReader (fileReader);
			String line = null; //string variable to hold each line
			
			while ((line = reader.readLine()) != null){ //prints input while there is something to print
				System.out.println ("You added: " + line);
				
			}
			
			reader.close(); 
					
		} catch (Exception ex) {
			System.out.println (ex);
		
		}
		//APPEND FILE
		try {
			
			System.out.println ("Please enter some text to append to the file: ");
			String appendedWord = in.nextLine();	       
		    FileWriter writer =  new FileWriter ("Testing.txt", true);    
		    writer.write(appendedWord);
		    System.out.println ("You added: "  + appendedWord);
		    System.out.println ("There is now these strings in the file: " + words + " & " +  appendedWord);   
		    writer.close();
		    
		} catch (Exception ex) {
			System.out.println (ex);
	}
}
}
