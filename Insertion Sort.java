class Solution
{
  static void insert(int arr[],int n)
  {
       // Your code here
       for(int i=1;i<n;i++)
       {
           int k = arr[i];
           int j = i-1;
           
           while(j>=0 && arr[j]>k)
           {
               arr[j+1] = arr[j];
               j = j-1;
           }
           
           arr[j+1] = k;
       }
  }
  
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      insert(arr,n);
  }
  
}
