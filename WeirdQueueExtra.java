public class WeirdQueueExtra
{
    private MyStack stack1;
    private MyStack stack2;

    //This is the constructor of the class.
    //\theta(1)
    public WeirdQueueExtra()
    {
        stack1= new MyStack();
        stack2 = new MyStack();
    }

    //This method append item to the end of WeirdQueueExtra and return nothing.
    //There is no error condition.
    //\theta(1)
    public void enqueue(Object item)
    {
        stack1.push(item);
    }

    //This method return the first item in the WeirdQueueExtra and remove this item from the queue.
    //Error1: When this is an empty WeirdQueueExtra, there is nothing to dequeue. It returns null.
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
            System.out.println("There is nothing in the WeirdQueueExtra.");
            return null;
        }
        return stack2.pop();
    }

}
