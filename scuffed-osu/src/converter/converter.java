package converter;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class converter 
{
	private Scanner x;
	private Formatter y;
	
	public static void main(String[] args)
	{
		String read;
		String write;
		Scanner scan = new Scanner(System.in);
		converter g = new converter();
		
		read = scan.nextLine();
		write = read;
		write = write.replaceAll(".osu", ".wiz");
		g.openFile(read, write);
		g.readwriteFile();
		g.closeFiles();
		
	}
	public void openFile(String r, String w)
	{
		try
		{
			x = new Scanner(new File(r));
			y = new Formatter("converted files/" + w);
		}
		catch(Exception e)
		{
			System.out.println("could not find file");
		}
	}
	
	public void readwriteFile()
	{
		while(x.hasNext())
		{
			String note = x.next();
			String bruh = ",1,0,0:0:0:0:";
			System.out.print(note + " changed to ");
			note = note.replaceAll(bruh, "");
			note = note.replaceAll(",", " ");
			System.out.println(note);
			addNotes(note);
		}
	}
	
	public void addNotes(String not)
	{
		y.format("%s\n", not);
	}
	
	public void closeFiles()
	{
		x.close();
		y.close();
	}
}
