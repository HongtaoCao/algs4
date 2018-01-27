import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exe1_1_3
{
    public static void main(String[] args)
    {
    	int[] a= new int[3];
    	for (int i = 0; i < 3; i++)
    	{
    		a[i] = StdIn.readInt();
    	}
        
        if ((a[0] == a[1]) && ( a[0] == a[2]))
            StdOut.printf("Equal\n");
        else
            StdOut.printf("Not equal\n");
    }
}