package com.company;

public class SearchInRange {
    public static void main(String[] args) {
//search in array with a range
        int []nums={2,34,67,6879,6};
        int target=2;
        System.out.println(searchWithRange(nums,target,1,3));
    }
    static int searchWithRange(int []arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            }
        }

        return -1;
    }
}
