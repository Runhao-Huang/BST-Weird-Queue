public class Node
{
    private Object value;
    private Node prev;
    private Node next;

    //This is the constructor of the class.
    //There is no error condition.
    //\theta(1)
    public Node()
    {
        value = null;
        prev = null;
        next = null;
    }

    //This method sets the value of a node with an object.
    //There is no error condition.
    //\theta(1)
    public void setValue(Object value)
    {
        this.value = value;
    }

    //This method sets the previous node of this node.
    //There is no error condition.
    //\theta(1)
    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    //This method sets the next node of this node.
    //There is no error condition.
    //\theta(1)
    public void setNext(Node next)
    {
        this.next = next;
    }

    //This method returns the object contained in this node.
    //There is no error condition.
    //\theta(1)
    public Object getValue()
    {
        return this.value;
    }

    //This method returns the previous node of this node.
    //There is no error condition.
    //\theta(1)
    public Node getPrev()
    {
        return this.prev;
    }

    //This method returns the next node of this node.
    //There is no error condition.
    //\theta(1)
    public Node getNext()
    {
        return this.next;
    }



}
