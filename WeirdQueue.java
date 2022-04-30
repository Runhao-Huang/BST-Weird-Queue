import java.util.Stack;

public class WeirdQueue
{

    private Stack stack1;
    private Stack stack2;

    public WeirdQueue()
    {
        stack1= new Stack<Object>();
        stack2 = new Stack<Object>();
    }

    //This method append item to the end of weirdqueue and return nothing.
    //There is no error condition.
    //\theta(1)
    public void enqueue(Object item)
    {
        stack1.push(item);
    }

    //This method return the first item in the weirdqueue and remove this item from the queue.
    //Error1: When this is an empty weirdqueue, there is nothing to dequeue. It returns null.
    //\theta(n)
    public Object dequeue()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty())
        {
            System.out.println("Error:<There is nothing in the WeirdQueue.>");
            return null;
        }
        return stack2.pop();
    }


}
