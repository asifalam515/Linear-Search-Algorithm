package com.company;

public class Code {
    public static void main(String[] args) {
        int []arr={34,56,778,45,454};
        int target=454;
        int ans=linearCode(arr,target);
        System.out.println(ans);
    }
    static int linearCode(int []arr,int target)
    {
        if (arr.length==0){
            return -1;

        }
        for (int indexNumber = 0; indexNumber < arr.length; indexNumber++) {
            int element=arr[indexNumber];

            if (element==target){
                return indexNumber;
            }
        }
      return -1;
    }

}
