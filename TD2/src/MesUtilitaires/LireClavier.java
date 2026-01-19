package MesUtilitaires;
import java.io.*;
public class LireClavier {
	public static String litChaine(String message){
		String ligneEntree="";
		System.out.print(message + " ");
		try{
		BufferedReader fluxEntree = new BufferedReader(new
		InputStreamReader(System.in));
		ligneEntree = fluxEntree.readLine();
		if(ligneEntree.length()==0) return null;
		}
		catch (IOException e){
		System.out.println("IOException "+e);
		}
		return ligneEntree;
		 }
}
