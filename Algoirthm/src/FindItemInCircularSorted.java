/**
 * Created by sgundann on 1/28/2016.
 * This is an implementation to find item in circular sorted list.
 */

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
}

