public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            if(target > nums[i]){
                a += 1;
            }
            if(nums[i] == target){
                return i;
            }
            else if(nums[i] > target){
                return i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        int position = sip.searchInsert(nums, target);
        System.out.println("Insert position: " + position);
    }
}
