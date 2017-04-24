package file.search;
import javax.swing.JOptionPane;

public class FindMostOccurrence 
{
	public void sort(int result1, int result2, int result3)
	{
		if ((result1 > result2 && result1 > result3))
        {
            if(result2 > result3)
            {
                JOptionPane.showMessageDialog(null, "Item found in" + "\n" + 
                		"first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the first file then second and then third file.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Item found" + "\n" + 
                		"in first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the first file then third and then second file.");
            }
        }
        else if ((result2 > result1 && result2 > result3))
        {
            if(result1 > result3)
            {
                JOptionPane.showMessageDialog(null, "Item found" + "\n" + 
                		"in first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the second file then first and then third file.");
            	//JOptionPane.showMessageDialog(null, result2 + " " + result1 + " " + result3);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Item found" + "\n" + 
                		"in first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the second file then third and then first file.");
            	//JOptionPane.showMessageDialog(null, result2 + " " + result3 + " " + result1);
            }
        }
        else if ((result3 > result1 && result3 > result2))
        {
            if(result1 > result2)
            {
                JOptionPane.showMessageDialog(null, "Item found" + "\n" + 
                		"in first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the third file then first and then second file.");
                //JOptionPane.showMessageDialog(null, result3 + " " + result1 + " " + result2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Item found" + "\n" + 
                		"in first file " + result1 + " times" + "\n"+
                		"in second file "+ result2 + " times " + "\n" +
                		"in third file "+ result3 +" times " + "\n" +
                		"So highest match found in the third file then second and then first file.");
            	//JOptionPane.showMessageDialog(null, result3 + " " + result2 + " " + result1);
            }
        }
        else
        {
            System.out.println("ERROR!");
        }

    }
}
