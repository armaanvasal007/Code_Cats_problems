public class Build_Array_from_Permutation_1920
{
    public static int[] buildArray(int[] nums) 
    {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int a[]={0,2,1,5,3,4};
        System.out.println(buildArray(a));
    }
}