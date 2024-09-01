public class linearsearch {
    public static void main(String [] args){

        int nums[] = {1,8,56,67,91,94};
        int target=94;

        // int result = linear_serach(nums,target);
        int result = binary_search(nums,target);
        if(result!=-1)
            System.out.println("element found at index: "+result);
        else 
            System.out.println("Elemrnt not found!");
        }    
    public static int linear_serach(int [] nums , int target){
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            return i;
        }

        return -1;
    }
    public static int binary_search(int[]nums,int target){
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
