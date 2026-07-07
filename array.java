public class array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(nums[1]);

        System.out.println(nums[2]);
        nums[2] = 10;
        System.out.println(nums[2]);

        System.out.println(nums.length);

        String[] names = new String[3];

        names[0] = "Moiz";
        names[1] = "Ronaldo";
        names[2] = "Messi";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int[] nums1 = new int[] {1,2,3,4,5};
        int[] nums2 = {1,2,3,5,4};

        for(int n:nums1){
            System.out.println(n);
        }
        System.out.println("------------------------------------------");
        for(int n:nums2){
            System.out.println(n);
        }

        for(int i = 0;i<5;i++){
            System.out.println(nums[i]);
        }
        int sum=0;
        for(int i =0;i<5;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
