package file.search;
import java.io.*;

public class ReadFile 
{
	public int openFile(String path, String word)
	{
		// counter for counting the occurrence of the word
		int count = 0;
		
		// try block to handle main code
		try
		{
			//opening file
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			// Iterating through the whole file 
			while ((line = bufferedReader.readLine()) != null) 
			{
				// if statement to count the occurrence of the given word in a file 
				if(line.contains(word))
				{
					//Incrementing counter
					count++;
				}

			}
			//closing the file
			fileReader.close();
		}
		// catch block to handle exception
		catch(Exception e)
		{
			System.out.println("Could not find file");
		}
		return count;
	}
	

}
