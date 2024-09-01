public class binary_search {
    public static void main(String [] args){
        int nums[] = {4,9,3,45,64,31,78,63,41};
        int result = binarysearch(nums, 9);
        if(result!=-1)
            System.out.println("element found at index : "+result);
        else
            System.out.println("element not found");
    }
    public static int binarysearch(int nums[],int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]==target)
                return mid+1;
            else if(nums[mid]<target)
                left = mid+1;
            else 
                right = mid-1;
        }
        return -1;
    }
}
