/*
Best case of Quicksort: T(n) = 2T(n/2) + \theta(n)
This is when the median value of the array is always chosen to be the pivot and then separate the array into two equal or almost
equal length parts.
a=2, b=2, f(n)=n, c=1
log(2) = 1 = c
n^(log_b(a)) = n^c
So Master Theorem Case 2: T(n) = \theta(nlog(n))

 */


public class QuickSort
{
    public QuickSort(){}

    //This constructor is used for testing the algorithm
    public QuickSort(int[] array)
    {
        my_quicksort(array);
        printArray(array);
    }


    public void my_quicksort(int[] array)
    {
        int high = array.length - 1;
        quicksort_helper(array, 0, high);

    }
    private void quicksort_helper(int[] array, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(array, low, high);
            quicksort_helper(array, low, pivot - 1);
            quicksort_helper(array, pivot + 1, high);
        }

    }
    private int partition(int[] array, int low, int high)
    {
        int pivot = array[low];
        int i = low;


        for(int j = low + 1; j <= high; j++)
        {
            if (array[j] > pivot)
            {
                i += 1;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        int temp = array[i];
        array[i] = array[low];
        array[low] = temp;

        return (i);

    }



    //This method is used to test the algorithm. It prints out the sorted array.
    public static void printArray(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

