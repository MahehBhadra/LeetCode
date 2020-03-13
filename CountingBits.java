class Solution {
    public int[] countBits(int num) 
    {
       int x[]=new int[num+1];
       for(int i=0;i<=num;i++)
          {
              x[i]=setBits(i);
          }
        return x;
    }
    static int setBits(int n)
    {
        int count = 0; 
        while (n > 0)
        { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    }
}
