class Solution {
    public int integerReplacement(int n) {
        int count=0;
        while(n>1)
        {
            count+=1;
            if(n==2147483647)
            {
                count=32;
                n=1;
            }
            else if(n==3)
            {
                count=count+1;
                n=1;
            }
            else if((n&1)==1)
            {
                if(((n >> 1) & 1) == 0)
                {
                    --n;
                }
                else
                {
                    ++n;
                }
            }
            else
            {
                n>>=1;
            }
        }
        return count;
        
    }
}
