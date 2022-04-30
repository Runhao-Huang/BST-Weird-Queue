public class MyStack
{
    private DLinkedList list;

    //This is the constructor of the class.
    //\theta(1)
    public MyStack()
    {
        list = new DLinkedList();
    }

    //This method put the item at the start of the list and return nothing.
    //\theta(1)
    public void push(Object item)
    {
        if(list.isEmpty())
        {
            list.append(item);
        }
        else
        {
            list.insert(0, item);
        }
    }

    //This method return the first object in the list.
    //Error 1: When the list is empty, there is nothing to pop out. It returns null.
    //\theta(1)
    public Object pop()
    {
        if(list.isEmpty())
        {
            System.out.println("There is nothing to pop.");
            return null;
        }
        else
        {
            Object temp = list.get(0);
            list.remove(0);
            return temp;
        }

    }

    //This method return the boolean about whether the list is empty or not.
    //There is no error condition here.
    //\theta(1)
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
}
