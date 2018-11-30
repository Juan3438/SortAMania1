public abstract class Team4SortCompetition extends SortCompetition {

    // Use Merge sort in order to organize the integer array + Helper Methods

   public int challengeOne(int[] arr) {
        sort(arr);
        return 0;
    }
    public int[] sort(int[] arr) {
        int l = arr.length;
        int[] sorted = new int[l];
        int idx = 0;
        int i = 0;
        int min = arr[i];
        int cont = arr[idx];
        int min1 = findMin(arr,min,cont);
        return sorted;
    }
    public int findMin(int[]arr,int min, int cont)
    {
        while(idx < l) {
            if(min < cont) {
                min = cont;
            }
            else{

            }
        }
    }
    /*
    public int merge(int[] arr)
    {
        int r = arr.length;
        int l = 0;
        int[] temp = new int[r];
        boolean even = true;
        int idx = 0;
        if(r%2 > 0)
        {
            r++;
        }
        divideArr(arr,temp,l,r,even,idx);
        return 0;
    }
    public void divideArr(int[] arr,int[] temp,int l,int r,boolean even,int idx)
    {
        while(l<r)
        {
            int mid = (r/2)-1;
            if(even)
            {
                r--;
            }
            even = false;
            divideArr(arr,temp,l,mid,even,idx);
            divideArr(arr,temp,mid+1,r,even,idx);
        }
        combine(arr,temp,idx);
    }
    public void combine(int[] arr,int[] temp,int idx)
    {
    }

    */

    //  Set a  temporary numerical array in order to be able to sort easier

    public int challengeTwo(String[] arr, String query)
    {
        return 0;
    }

    //  Regular sort

    public int challengeThree(int[] arr)
    {
        return 0;
    }

    // Create a multi dimensional sorting algorithm

    public int challengeFour(int[][] arr)
    {
        return 0;
    }

    // Use a regular sort and createanother method for searching.

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }
}
