import java.util.Scanner;

public class main{

    public static void main(String[]args){

    choice();
    }
    public static void choice(){

        GroupProjectA groupprojectA= new GroupProjectA();
        GroupProjectAB groupprojectAB= new GroupProjectAB();
        GroupProjectABC groupprojectABC= new GroupProjectABC();
        GroupProjectABCD groupprojectABCD= new GroupProjectABCD();
        GroupProjectABCDE groupprojectABCDE= new GroupProjectABCDE();
        Scanner input=new Scanner(System.in);
        int choice,line;

        /*Display Main Menu*/
        System.out.printf("Main Menu\n");
        line();
        /*Display Main Menu*/
        System.out.printf("\n1. Next-Day Delivery\n");
        System.out.printf("2. Same-Day Delivery\n");
        System.out.printf("3. Prepaid Box & Envelope\n");
        System.out.printf("4. Pos Ekspres\n");
        System.out.printf("5. Receipt\n");
        System.out.printf("6. Exit\n\n");

        System.out.printf("Please select your choice\t:");
        choice=input.nextInt();
        while(choice>6){
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Please select your choice:");
            choice=input.nextInt();
        }while(choice<=6){
            break;
        }
        /*Selection*/
        if(choice==1){
            groupprojectA.choice();

        }if (choice==2){
            groupprojectAB.choice();

        }if(choice==3){
            groupprojectABC.choice();

        }if(choice==4){
            groupprojectABCD.choice();

        }if(choice==5){
            groupprojectABCDE.receipt();

        }if(choice==6){
            System.out.printf("Thank You for Using Our System.\n");
        }

    }
    public static void line() {
        int line = 1;
        while (line <= 100) {
            System.out.printf("%c", 45);
            line++;
        }
    }

}
