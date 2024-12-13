import java.util.Scanner;

public class casestudy2 {

    static String customer[][] = new String[100][7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1.Add order list");
            System.out.println("2.Display all order list");
            System.out.println("3.Exit");
            System.out.print("Choose a menu : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: inputList();   
                    break;
                case 2: 
                    break;
                default:
                    break;
            }

        }
    }

    static void inputList(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < customer.length; i++){
            System.out.print("enter customer name : ");
            customer[i][0] = sc.nextLine();
            System.out.print("enter table number : ");
            int table = sc.nextInt();
            customer[i][1] = String.valueOf(table);   
            break;       
        }       

        System.out.println("=== MENU CAFE ===");
        System.out.println("1.Black coffe - Rp 15000");
        System.out.println("2.Latte - Rp 22000");
        System.out.println("3.Teh tarik - 12000");
        System.out.println("4.Noodles - Rp 18000");

        int chooseMenu;
            for (int i = 0; i < customer.length; i++){
            System.out.print("choose a menu (enter number of menu or enter 0 to finish) : ");
            chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 0: 
                        System.out.println("your order is succes!");
                    return;
                case 1: System.out.print("enter number of black coffe :");
                        int coffe = sc.nextInt();
                        customer[i][2] = String.valueOf(coffe);
                    break;
                case 2: System.out.print("enter number of latte : ");
                        int latte = sc.nextInt();
                        customer[i][3] = String.valueOf(latte);
                    break;
                case 3: System.out.print("enter number of teh tarik : ");
                        int teh = sc.nextInt();
                        customer[i][4] = String.valueOf(teh);
                    break;
                case 4: System.out.print("enter number of noodles : ");
                        int noodles = sc.nextInt();
                        customer[i][5] = String.valueOf(noodles);
                    break;
                default: System.out.print("menu not avalaible, please enter again");
                    break;
                }
            }          
        }
}