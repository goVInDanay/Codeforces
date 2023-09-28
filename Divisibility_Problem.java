import java.util.Scanner;
public class divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int div=sc.nextInt();
            int c=0;
            if(n%div==0)
            System.out.println("0");
            else{
                int rem=n%div;
                c+=div-rem;
                System.out.println(c);
            }
        }
    }    
}
