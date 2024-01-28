public class Concatenation_of_array_1929
{
    public static int[] getConcatenation(int[] nums)  
    {
        int ans[]=new int[2*nums.length];    
        for(int i=0;i<ans.length/2;i++)      
        {
            ans[i]=nums[i];                  
            ans[nums.length+i]=nums[i];      
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int a[]={1,3,2,1};
        System.out.println(getConcatenation(a));
    }
}