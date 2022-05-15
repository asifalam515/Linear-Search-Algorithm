package com.company;

public class Code {
    public static void main(String[] args) {
        int []nums={34,7,768,7,23};
        int target=2345;

        System.out.println(linearCode(nums,target));
    }


    static int linearCode(int []arr,int target){
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
 return  -1;
    }

}
