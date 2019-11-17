//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Part4.java
import java.util.*;
import java.io.*; 
public class Part4 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Vector<Entry<String, Time24>> v =new Vector<Entry<String, Time24>>();
        Scanner keyboard = new Scanner(System.in);
        Scanner input = new Scanner(new File("data.txt"));
        while (input.hasNextLine())
        {
            String s=input.nextLine();
            String t=input.nextLine();
            v.add(new Entry<String, Time24>(s.trim(), Time24.parseTime(t)));
        }
        while (true)
        {
            System.out.print("Enter name: "); 
            String name=keyboard.nextLine();
            if (name.equals("DONE")) break;
            Entry<String, Time24> temp=
                               new Entry<String, Time24>(name, new Time24(0,0));
            Collections.sort(v);
            int index=Collections.binarySearch(v, temp);
            if(index<0)
                System.out.println("No Such Person");
            else
            {
                Entry<String, Time24> runner=v.get(index);
                System.out.println(runner.toString());
            }
        }
    }
}
