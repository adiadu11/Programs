package com.ds;

public class Stack
{
    private int top;
    private char arr[];
    private int capacity = 10;

    public Stack()
    {
        top = -1;
        arr = new char[capacity];
    }
    private boolean isFull()
    {
        if (top == capacity - 1)
            return true;
        return false;
    }

    private boolean isEmpty()
    {
        if (top == -1)
            return true;
        return false;
    }

    public void resizeDouble()
    {
        char temparr[] = new char[2 * capacity];
        capacity = 2 * capacity;
        for(int i = 0; i <= top; i++)
            temparr[i] = arr[i];

        arr = temparr;

    }

    public void resizeHalf()
    {
        char temparr[] = new char[(capacity * 3)/ 4];
        capacity = (capacity * 3) / 4;
        for(int i = 0; i <= top; i++)
            temparr[i] = arr[i];

        arr = temparr;

    }

    public void add(char data)
    {
        if (isFull())
        {
            resizeDouble();
        }

        top++;
        arr[top] = data;
    }

    public char remove()
    {
        if (isEmpty())
        {
            //System.out.println("Stack Empty");
            return '0';
        }

        char temp = arr[top];
        top--;

        if (top == (capacity - 1) / 2)
        {
           resizeHalf();
        }
        return temp;
    }

    public char peek()
    {
        if (isEmpty())
        {
            //System.out.println("Stack Empty");
            return '0';
        }

        return arr[top];
    }



    public void print()
    {
        for (int i = 0; i <= top; i++)
            System.out.println(arr[i]);
    }
}
