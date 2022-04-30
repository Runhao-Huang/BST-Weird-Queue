public class Test2
{
    public static void main(String[] args)
    {
        DLinkedList test = new DLinkedList();
        test.append(1);
        test.append(2);
        test.append(3);
        test.append(4);
        test.append(5);

        test.printList();
        test.insert(2,9);
        test.printList();
        test.insert(0,0);
        test.printList();
        test.insert(6,11);
        test.printList();
        test.size();

        test.replace(3,100);
        test.printList();
        test.size();

        test.remove(7);
        test.printList();
        test.size();

        test.remove(0);
        test.printList();

        System.out.println(test.get(0));
        System.out.println(test.get(6));
        System.out.println(test.get(-1));








    }
}
