/*             1
            1  2
        1   2  3
    1   2   3  4
    */
   public class Pattern
   {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int val=1;
            for(int j=1;j<=n;j++)
            {
                
                if(i+j>=n+1)
                {
                    System.out.print(val);
                    val++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   }