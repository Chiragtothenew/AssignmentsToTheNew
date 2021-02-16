public class Question6 {

    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,3,4,4};

        int max = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        max++;
        int arr1[] = new int[max];

        for(int j=0;j<arr.length;j++)
        {
            arr1[arr[j]]++;
        }

        for(int k=0;k<arr1.length;k++)
        {
            if(arr1[k]==1)
            {
                System.out.println(k);
            }
        }

    }
    
}
