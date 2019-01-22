package client;
import com.ds.Stack;

class TestStack
{
    public static void main(String[] args)
    {
        Stack stk = new Stack();
        stk.add('a');
        /*stk.add(20);
        stk.add(30);
        stk.add(40);
        assert stk.remove() == 40;
        stk.add(50);
        stk.add(60);
        stk.add(70);
        stk.add(80);
        stk.add(90);
        stk.add(100);
        stk.add(110);
        stk.add(120);*/
        assert stk.peek() == 'b';// : "Wrong";
/*
        assert stk.remove() == 120;
        assert stk.peek() == 110;
        assert stk.remove() == 110;
        assert stk.remove() == 100;
*/
        System.out.println("All test cases passed");
    }
}
