public class Test3
{
    public static void main(String[] args)
    {
        WeirdQueue test = new WeirdQueue();
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
        test.enqueue(6);
        test.enqueue(7);

        for(int i = 0; i < 5; ++i)
        {
            System.out.println(test.dequeue());
        }

        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);

        for(int i = 0; i < 5; ++i)
        {
            System.out.println(test.dequeue());
        }

    }
}
