public class linear_search{
    public static void main(String[] args) {
        int nums[] = {4,9,3,45,64,31,78,63,41};
        int result = linearSearch(nums, 6);
        if(result!=-1)
            System.out.println("element found at index : "+result);
        else
            System.out.println("element not found");
    }

    public static int linearSearch(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            return i+1;
        }
        return -1;
    }
}