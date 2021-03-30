import java.net.*;
import java.io.*;

public class Client{
	
	public static void main(String[] args){



		try(Socket socket = new Socket("www.google.com", Integer.parseInt(args[1]))){

		}
		catch (UnknownHostException ex){
			System.out.println("Server not found: " + ex.getMessage());
		}
		catch (IOException ex){
			System.out.println("I/O error: " + ex.getMessage());
		}
		
		
	}
}