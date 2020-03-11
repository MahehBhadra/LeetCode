class solution
{
        public int minFlips(int a, int b, int c)
        {
            String str1=toBin(a,32);
            String str2=toBin(b,32);
            String str3=toBin(c,32);
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            char[] ch3 = str3.toCharArray();
            int i=0,j=0;
            while(i<32)
            {
                if(ch3[i]=='1' && ch1[i]=='0' && ch2[i]=='0')
                {
                     j++;
                }
                else if(ch3[i]=='0'  && (ch1[i]=='1' || ch2[i]=='1'))
                {
                    if(ch1[i]=='1')
                    {
                        j++;
                    }
                    if(ch2[i]=='1')
                    {
                        j++;
                    }
                }
                i++;
            }
            return j;
        }
        public static String toBin(int x, int len)
        {

		    if (len > 0) 
            {
		        return String.format("%" + len + "s",Integer.toBinaryString(x)).replaceAll(" ", "0");
		    }

		    return null;
	    }
}
