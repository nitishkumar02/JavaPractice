class Solution
 {
    public int findNumbers(int[] nums) 
    {
        int c=0;
        for(int num : nums)
        {
            if(countDigit(num)%2==0)
            {
                c++;
            }
        }
        return c;
    }

    public int countDigit(int num)
    {
        int c=0;
        while(num>0)
        {
            c++;
            num /= 10;
        }
        return c;
    }
}
