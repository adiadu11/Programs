package client;
import com.ds.Queue;

class TestQueue
{
    public static void main(String args[])
    {
        Queue list = new Queue();

        list.add(10);
        assert list.peek() == 10;
        list.add(20);
        assert list.peek() == 20;
//        list.add(10);
        assert list.removeRear() == 20;
//        list.peek();
        assert list.peek() == 10;
        assert list.removeRear() == 10;
        assert list.removeRear() == -999;
        assert list.peek() == -999;
        list.add(50);
        assert list.peek() == 50;
        list.add(40);
        list.add(30);
        list.add(20);
        assert list.removeFront() == 50;
        System.out.println("All test cases passed");
    }
}
