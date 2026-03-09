package if_else;
import java.util.Scanner;
public class profitLoss2ndMethod {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter Cp: ");
            int cp = sc.nextInt();
            System.out.print("Enter Sp: ");
            int sp = sc.nextInt();

            if(sp>cp)
                System.out.println("profit is " + (sp-cp) );
            else if(sp<cp)
                System.out.println("loss is " + (cp - sp));
            else
                System.out.println(" no loss no profit ");
        }
    }

