import java.util.Arrays;

class removeDuplicate{

    public static void main(String[] args) {
        int [] numbers = {1,1,2};
        System.out.println(removeDuplicates(numbers));
    }

    public static int removeDuplicates(int [] nums){

        int k = 0;
        
        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 101){
                continue;
            }

            int target = nums[i];
            k++;
            for(int j = i + 1; j < nums.length; j++){

                if (target == nums[j]){
                    nums[j] = 101;
                    
                }
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return (k);
    }
}