import java.util.*;
import java.io.*;

public class BillofRights
{
  public static void main(String[] args) throws IOException
  {
    Scanner kbString = new Scanner(System.in);
    Scanner kbNumber = new Scanner(System.in);
    Random rndm = new Random();
    
    String Quiz[][] = new String[11][7];
    int x=1;
    int numQuestions=0;
    int choice=0;
    
    System.out.println("\fWelcome to the Bill of Rights Program");
    System.out.println("");
    
    FileReader fileR = new FileReader("BillofRights.txt");
    Scanner inFile = new Scanner(fileR);
    numQuestions = inFile.nextInt();
    inFile.nextLine( );
    System.out.println("Now reading from file...");
    
    for(x=1; x<=numQuestions; x++)
    {
      for (int y=1; y<=6; y++)
      {
        Quiz[x][y] = inFile.nextLine();
      }
    }
    
    inFile.close();
    fileR.close();
    
    System.out.println(numQuestions);
    
    for(x=1; x<=numQuestions; x++)
    {
      for(int y=1; y<=6; y++)
      {
        System.out.println(Quiz[x][y]);
      }
    }
  }
  
  
  
  
}
