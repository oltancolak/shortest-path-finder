package main;
import java.util.HashMap;

public class Messages {
	
	private HashMap<Integer, String> messages;
	
	public Messages() {
	    messages = new HashMap<Integer, String>();
		//Info and Success Messages
	    messages.put(200, "[INFO] Program succesfully started.");
		messages.put(201,"[INFO] Checking the txt file path.");
		messages.put(202,"[INFO] TXT parsing started.");
		messages.put(203,"[SUCCESS]  Finished txt parsing.");
		messages.put(204,"[INFO] Finding shortest path...");
		messages.put(205,"[SUCCESS] Shortest path finding ended.");
		
		
		//Error and Warning Messages
		messages.put(401, "[WARNING] Program did not started correctly! \n[INFO] Example Usage [City1] [City2] ");
		messages.put(402, "[ERROR] Parse process failed.");
		messages.put(403, "[ERROR]  input.txt missing!");	
	}
	
	public void showMessage(int messageCode) {
		System.out.println(messages.get(messageCode));
	} 
}
