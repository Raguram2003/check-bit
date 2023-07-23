import java.util.Scanner;



public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(findCheckBit(A,B));
    }
    public static int findCheckBit(int A,int B)
    {
        if((A & (1<<B))!=0)
            return 1;
        return 0;

    }
}



/*
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 */