public class MainClass {
    public static void main(String[] args) {
        Integer[] input = {7, 8, 9, 10, 1, 2, 3, 4, 5};//{6,17,2,2,3};//
        int lo = 0;
        int high = input.length - 1;
        MergeSort ms = new MergeSort();
        ms.SortMe(input);
 /*
            FindItemInCircularSorted obj = new FindItemInCircularSorted(input);
            System.out.println(obj.FindItem(17,lo,high));
            System.out.println(obj.FindItem(3,lo,high));
            System.out.println(obj.FindItem(1,lo,high))

            MyStack myStack = new MyStack(50);
            myStack.printStack();*/

    }
}