package client;
import com.ds.BST;

public class TestBST
{
    public static void main(String args[])
    {
        BST root = new BST();

        assert root.get(7) == -999;
        root.insert(5, 50);
        root.insert(4, 40);
        assert root.get(5) == 50;
        assert root.get(7) == -999;
        root.insert(7, 70);
        assert root.get(7) == 70;
        assert root.get(4) == 40;
        assert root.get(8) == -999;
        root.insert(8, 80);
        root.insert(1, 10);
        root.insert(2, 20);
        root.insert(10, 100);
        assert root.get(1) == 10;
        assert root.get(10) == 100;
        assert root.get(2) == 20;
        assert root.get(8) == 80;
        System.out.println("All test cases passed");
    }
}
