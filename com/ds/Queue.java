package com.ds;
import com.ds.DoublyLL;

public class Queue
{

     DoublyLL q;

    public Queue()
    {
        q = new DoublyLL();
    }

    public void add(int d)
    {
        q.add(d);
    }

    public int removeFront()
    {
        return q.removeFirst();
    }

    public int removeRear()
    {
        return q.removeLast();
    }


    public int peek()
    {
        return q.peek();
    }
}
