package client;
import com.ds.WordBST;
import java.util.*;
import java.io.*;
class WordFrequencyTree
{
    public static void main(String args[]) throws Exception
    {
        WordBST tree = new WordBST();
        File file = new File("client/sentences1"); // sentences1 is a file in client directory containing words
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\s");

        while(sc.hasNext())
        {
            tree.insert(sc.next());
        }

        String w = tree.maxFrequency();
        System.out.println(w);
    }
}
