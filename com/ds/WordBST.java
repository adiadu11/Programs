package com.ds;

public class WordBST
{

    private int max = 0;

    class Node
    {
        private int frequency;
        private String word;
        Node left, right;

        private Node(String w)
        {
            frequency = 1;
            word = w;
            left = right = null;
        }
    }

    private Node root;
    private Node maxNode;

    public WordBST()
    {
        root = null;
        maxNode = null;
    }

    private boolean isEmpty()
    {
        if (root == null)
            return true;
        return false;
    }

    public void insert(String w)
    {
        if (isEmpty())
        {
            root = new Node(w);
        }
        insert(root, w);
    }

    public Node insert(Node x, String w)
    {

        if (x == null)
        {
            Node temp = new Node(w);
            return temp;
        }

        if (w.compareTo(x.word) > 0)
        {
            x.right = insert(x.right, w);
        }

        else if (w.compareTo(x.word) < 0)
        {
            x.left = insert(x.left, w);
        }

        else if (w.compareTo(x.word) == 0)
        {
            x.frequency = x.frequency + 1;
            return x;
        }

        return x;
    }

    public int get(String w)
    {
        return get(root, w);
    }

    public int get(Node x, String w)
    {

        if (isEmpty() || x == null)
        {
            return -999;
        }

        if (w.compareTo(x.word) == 0)
            return x.frequency;

        if (w.compareTo(x.word) > 0)
        {
            return get(x.right, w);
        }

        if (w.compareTo(x.word) > 0)
        {
            return get(x.left, w);
        }

        return -999;
    }

    public void maxFrequency(Node x)
    {
        if (x == null)
            return;

        maxFrequency(x.left);

        if (x.frequency > max && x.word.length() >= 10)
        {
            maxNode = x;
            max = x.frequency;
        }

        maxFrequency(x.right);
    }

    public String maxFrequency()
    {
        maxFrequency(root);
        return maxNode.word;
    }

}
