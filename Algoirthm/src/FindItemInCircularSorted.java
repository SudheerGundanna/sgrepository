/**
 * Created by sgundann on 1/28/2016.
 * This is an implementation to find item in circular sorted list.
 */
import java.util.Arrays;
public class FindItemInCircularSorted {

    private int[] input;
    private int m_nVal;

    FindItemInCircularSorted(int[] values)
    {
        input = values;
        m_nVal=0;
    }

    public boolean FindItem(int nVal,int lo,int high)
    {
        m_nVal = nVal;
        int mid = (high + lo )/2;

        if(lo > high)
            return false;
        if(nVal == input[mid])
            return true;
        if(nVal > input[mid] && nVal > input[high])
        {
            high = mid -1;
        }
        else //if((nVal > input[mid] && nVal >= input[high]) || (nVal > input[mid] && nVal <= input[high]))
        {
            lo = mid + 1;
        }
        /*else
        {

            System.out.println(this);
            return false;
        }*/
        return FindItem(nVal,lo,high);
    }



    public String toString()
    {
        String s =  String.format("Element %s not found in array ", m_nVal);
        for (int nval : input)
        {
            s += " " + String.valueOf(nval);

        }
        return s;

    }
    public static void main(String[] args)
    {
        int[] input = {7,8,9,10,1,2,3,4,5};//{6,17,2,2,3};
        int lo = 0;
        int high = input.length -1;

        FindItemInCircularSorted obj = new FindItemInCircularSorted(input);
        System.out.println(obj.FindItem(17,lo,high));
        System.out.println(obj.FindItem(3,lo,high));
        System.out.println(obj.FindItem(1,lo,high));
    }

}

