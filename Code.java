import java.util.Scanner;
public class Code {

    static int f(int base,int pow){
        /*//SOLUTION WITH LOOP FUNCTION
        int result=1;
        for(int i=1;i<=pow;i++){
            result*=base;
        }
        System.out.println(base+" ^ "+pow+" = "+result);
        return;*/
        if (pow==0){
            return 1;
        }else if(pow==1){
            return base;
        }
         return base*f(base,(pow-1));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input Base : ");
        int base=input.nextInt();
        System.out.print("Input Pow : ");
        int pow=input.nextInt();
        System.out.println(base+" ^ "+pow+" = "+f(base, pow));

    }
    
}
