public class movingZeros 
{
    public void solution(int nums [])
    {
        int n = nums.length;
        int index = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int nums [] = {0,1,0,3,12};
        movingZeros m = new movingZeros();
        m.solution(nums);
        for(int n:nums)
        {
            System.out.print(n+" ");
        }        
    }
}
