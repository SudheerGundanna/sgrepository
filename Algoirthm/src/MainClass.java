public class MainClass {
    public static void main(String[] args) {
        Integer[] input = {1, 8, 9, 10, 7, 9, 3, 11, 5};//{6,17,2,2,3};//
        int lo = 0;
        int high = input.length - 1;
      /*  for(Comparable i : input)
        {
            System.out.print(i + " ");
        }*/
        // MergeSort ms = new MergeSort();
        // ms.SortMe(input);


        QuickSort qs = new QuickSort();
        qs.sort(input, lo, high);
 /*
            FindItemInCircularSorted obj = new FindItemInCircularSorted(input);
            System.out.println(obj.FindItem(17,lo,high));
            System.out.println(obj.FindItem(3,lo,high));
            System.out.println(obj.FindItem(1,lo,high))

            MyStack myStack = new MyStack(50);
            myStack.printStack();*/

    }
}