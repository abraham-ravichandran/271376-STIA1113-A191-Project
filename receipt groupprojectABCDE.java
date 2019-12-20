import java.util.Scanner;

public class GroupProjectABCDE {
    private static GroupProjectA groupprojectA= new GroupProjectA();
    public static double ChargeA[]= groupprojectA.TotalCharge();
    private static GroupProjectAB groupprojectAB= new GroupProjectAB();
    public static double ChargeAB[]= groupprojectAB.TotalCharge();
    private static GroupProjectABC groupprojectABC= new GroupProjectABC();
    public static double ChargeABC[]= groupprojectABC.TotalCharge();
    private static GroupProjectABCD groupprojectABCD= new GroupProjectABCD();
        public static double ChargeABCD[]= groupprojectABCD.TotalCharge();


    public static void receipt() {

        Scanner input=new Scanner(System.in);
        int customer,line,choice=0;
        double total=0;

        /* Menu */
        System.out.printf("1. Display Receipt\n");
        System.out.printf("2. Return to Main Menu\n");

        System.out.printf("Enter your choice\t:");
        choice=input.nextInt();
        while(choice>2){
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice=input.nextInt();
        }while(choice<=2){
            break;
        }

        if(choice==1) {

            for (customer = 0; customer < ChargeA.length; customer++) {

                /*Display Customer*/
                System.out.printf("\nCustomer %d:\n", customer + 1);
                System.out.printf("------------------\n");

                //Calculate Grand Total
                total=ChargeA[customer]+ChargeAB[customer]+ChargeABC[customer]+ChargeABCD[customer];

                //Display Receipt
                System.out.printf("Total Charge:\n");
                System.out.printf("Next-Day Delivery\t\t\tRM%10.2f\n",ChargeA[customer]);
                System.out.printf("Same-Day Delivery\t\t\tRM%10.2f\n",ChargeAB[customer]);
                System.out.printf("Prepaid Box & Envelope\t\tRM%10.2f\n",ChargeABC[customer]);
                System.out.printf("Pos Ekspres\t\t\t\t\tRM%10.2f\n",ChargeABCD[customer]);
                line=1;
                while(line<=60){
                    System.out.printf("%c",45);
                    line++;
                }
                System.out.printf("\nTotal \t\t\t\t\t\tRM%10.2f\n\n",total);

            }
            System.out.printf("Enter your choice\t:");
            choice=input.nextInt();
            while(choice>2){
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                choice=input.nextInt();
            }while(choice<=2){
                break;
            }

        }if(choice==2){
            main.choice();

        }

    }
}
