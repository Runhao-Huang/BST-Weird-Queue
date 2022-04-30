public class DLinkedList implements MyList
{
    private Node head;
    private Node curr;
    private Node tail;

    public DLinkedList()
    {
        head = null;
        curr = null;
        tail = null;
    }


    //This method insert an object at an index and return boolean about whether the insertion is success.
    //Error 1: Index is smaller than 0.
    //Error 2: This is an empty linked list and nothing can be inserted.
    //Error 3: The index is larger than the range of linked list. No node is there.
    //\theta(n)
    public boolean insert(int index, Object item)
    {
        if(index < 0)
        {
            System.out.println("Error:<This index is invalid.>");
            return false;
        }

        Node newNode = new Node();
        newNode.setValue(item);

        if(head == null)
        {
            System.out.println("Error:<This is an empty list. You can't insert at any index.>");
            return false;
        }
        else
        {
            if(index == 0)
            {
                newNode.setNext(head);
                head = newNode;
                return true;
            }
        }

        curr = head;
        int i = 0;
        for(i = 0; i < index; ++i) {
            if (curr.getNext() == null) {
                System.out.println("Error:<The index is out of the bound.>");
                return false;
            }
            curr = curr.getNext();
        }

        curr = curr.getPrev();
        newNode.setNext(curr.getNext());
        curr.getNext().setPrev(newNode);
        curr.setNext(newNode);
        newNode.setPrev(curr);
        return true;

    }


    //This method append the item as a node to the current linked list. This returns boolean about whether the append process is successful or not.
    //There is no error condition here.
    //\theta(1)
    public boolean append(Object item)
    {
        Node newNode = new Node();
        newNode.setValue(item);

        if(head == null)
        {
            head = newNode;
            tail = newNode;

        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        return true;
    }

    //This method clear the whole linked list and return nothing.
    //There is no error condition.
    //\theta(1)
    public void clear()
    {
        head = null;
        tail = null;
        curr = null;

    }

    //This method check whether the linked list is empty or not. It returns true if the list is empty and otherwise false.
    //There is no error condition.
    //\theta(1)
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    //This method finds the length of the linked list. It returns -1 when this is empty list. Otherwise, it returns the length.
    //There is no error condition.
    //\theta(n)
    public int size()
    {
        int size = 0;
        if(head == null)
        {
            size = -1;
        }
        else
        {
            curr = head;
            while(curr != tail)
            {
                size += 1;
                curr = curr.getNext();
            }
            size += 1;
        }
        System.out.println(size);

        return size;
    }


    //This method changes the item in the node at designated index. It returns boolean about whether the replace process is successful or not.
    //Error 1: Index is smaller than 0.
    //Error 2: This is an empty linked list and nothing can be replaced.
    //Error 3: The index is larger than the range of linked list. No node is there.
    //\theta(n)
    public boolean replace(int index, Object item)
    {
        if(index < 0)
        {
            System.out.println("Error:<This index is invalid.>");
            return false;
        }

        if(head == null)
        {
            System.out.println("Error:<This is an empty list. You can't replace any node.>");
            return false;
        }

        curr = head;
        int i = 0;
        for(i = 0; i < index; ++i) {
            if (curr.getNext() == null) {
                System.out.println("Error:<There is nothing in the index searched.>");
                return false;
            }

            curr = curr.getNext();
        }
        curr.setValue(item);

        return true;
    }


    //This method remove the node at certian index. It returns boolean about whether the remove process is successful or not.
    //Error 1: Index is smaller than 0.
    //Error 2: This is an empty linked list and nothing can be removed.
    //Error 3: The index is larger than the range of linked list. No node is there.
    //\theta(n)
    public boolean remove(int index)
    {
        if(index < 0)
        {
            System.out.println("Error:<This index is invalid.>");
            return false;
        }

        if(head == null)
        {
            System.out.println("Error:<This is an empty list. You can't remove any node.>");
            return false;
        }
        curr = head;
        int i = 0;
        for(i = 0; i < index; ++i) {
            if (curr.getNext() == null) {
                System.out.println("Error:<There is nothing in the index searched.>");
                return false;
            }

            curr = curr.getNext();
        }

        if(curr == head)
        {
            head = head.getNext();
            return true;
        }

        if(curr == tail)
        {
            tail = tail.getPrev();
            tail.setNext(null);
            return true;
        }
        curr = curr.getPrev();
        curr.setNext(curr.getNext().getNext());
        curr.getNext().setPrev(curr);

        return true;
    }


    //This method search and return the Object that is in the node in the linked list at given index.
    //Error 1: Index is smaller than 0.
    //Error 2: This is an empty linked list and nothing can be returned.
    //Error 3: The index is larger than the range of linked list. No node is there.
    //\theta(n)
    public Object get(int index)
    {
        if(index < 0)
        {
            System.out.println("Error:<This index is invalid.>");
            return null;
        }

        if(head == null)
        {
            System.out.println("Error:<This is an empty list. You can't get any node.>");
            return null;
        }
        curr = head;
        int i = 0;
        for(i = 0; i < index; ++i) {
            if (curr.getNext() == null) {
                System.out.println("Error:<The index is out of the list.>");
                return null;
            }

            curr = curr.getNext();
        }
        return curr.getValue();
    }

    //This method is created for testing.
    public void printList()
    {
        if(head == null)
        {
            System.out.println("null");
            return;
        }
        curr = head;
        while(curr != tail)
        {
            System.out.print(curr.getValue() + " ");
            curr = curr.getNext();
        }
        System.out.println(tail.getValue());
    }
}
