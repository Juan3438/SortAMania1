public class Team4SortCompetition extends SortCompetition {

    // Use Selection sort in order to organize the integer array + Helper Methods

   public int challengeOne(int[] arr) {
       int left = 0;
       int right = arr.length-1;
        sort(arr,left,right);
        return (findMedian(arr));
    }
    public void sort(int[] arr,int left,int right)
    {
        if(left<right){
            int pivot = partition(arr,left,right);
            sort(arr,left,pivot-1);
            sort(arr,pivot+1,right);
        }
    }
    public int partition(int[] arr, int left, int right)
    {
        int temp;
       int pivot = arr[right];
       int i = left-1;
       for(int j = left ;j<right;j++){
           if(arr[j]<= pivot){
               i++;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
        temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }
    /*
    public int[] sort(int[] arr) {
        int l = arr.length;
        int[] sorted = new int[l];
        int idx = 0;
        int min = arr[0];
        int cont = arr[0];
        boolean sort = false;
        while(!sort) {
            sort = true;
            findMin(arr, sorted, min, cont, idx,sort);
        }
        return sorted;
    }
    public void findMin(int[]arr,int[] sorted,int min, int cont,int idx,boolean sort)
    {
        int x =0;
        while(idx < arr.length) {
            if(min > arr[idx]) {
                sort = false;
                min = cont;
                sorted[x] = arr[idx];
            }
            idx++;
        }
    }

    */
    public int findMedian(int[] arr)
    {
        int med =0;
        int l = arr.length;
        if(l%2 > 0){
            l++;
        }
        l = l/2;
        med = arr[l];
        return med;
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
