
import static java.lang.Math.max;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danish
 */
import java.io.*;

public class GenerateQuote
{
    
    static ArrayList<String> quotes = new ArrayList<String>();
    
    
    public static void populateQuotes()
    {
		try 
		{
			File file = new File("texts.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine())!=null)
			{
				quotes.add(line);
			}	
			br.close();
		} 
		catch( IOException e)
		{
                        System.out.println("NOT ABLE TO READ");
			System.err.println("Error: " + e.getMessage());
		}
    }   
    public static String getQuote()
    {
        int r = (int) (Math.random()*quotes.size());
        return quotes.get(r);
    }
    public static void addNewQuote(String q)
    {
        quotes.add(q);
    }
    
        
}
