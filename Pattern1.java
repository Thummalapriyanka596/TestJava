/*https://www.simplilearn.com/tutorials/java-tutorial/pattern-programs-in-java
https://www.educba.com/number-patterns-in-java/ */
//patern program
class Pattern1
{
    public static void main(String args[])
    {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}