//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Part2.java
import java.util.*;
import java.io.*; 
class Part2 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Vector<Entry<String, Time24>> v =new Vector<Entry<String, Time24>>();
        Scanner input = new Scanner(new File("data.txt"));
        while (input.hasNextLine())
        {
            String s=input.nextLine();
            String t=input.nextLine();
            v.add(new Entry<String, Time24>(s.trim(), Time24.parseTime(t)));
        }
        Collections.sort(v);
        Iterator<Entry<String, Time24>> iter= v.iterator();		
        while (iter.hasNext())			
            System.out.println(iter.next());
    }
}