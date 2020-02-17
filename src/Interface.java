import java.util.Scanner;

public class Interface {

    Scanner input = new Scanner(System.in);

    private int menuTela = 0;
//=====================================================================================================================
    public Interface(){

    }
//=====================================================================================================================
    public void menuTela(){
        System.out.println("\n\tA Silly Program\n");

        do {
            System.out.println("\n\t••• Home Menu •••\n");
            System.out.println("0 - Exit");
            System.out.println("1 - My Age");
            System.out.println("2 - Year I Was Born");
            System.out.println("3 - Today's Day");
            System.out.print("\nChoose One Of The Options: ");
            menuTela = input.nextInt();

            if (menuTela < 0 || menuTela > 3){
                System.out.println("\n\t!! Invalid Option !!");
            }
            else {
                if (menuTela == 1){
                    myAge();
                }
                if (menuTela == 2){
                    myYear();
                }
                if (menuTela == 3){
                    dayToday();
                }
            }
        }while (menuTela != 0);
        System.out.println("\n\t∞∞ See You Next Time! ∞∞\n");
    }
//=====================================================================================================================
    private void myAge(){
        System.out.println("\n\t≠≠ Menu My Age ≠≠\n");

        Codigo code = new Codigo();
        code.myAgeCode();
    }
//=====================================================================================================================
    private void myYear(){
        System.out.println("\n\t≠≠ Menu Year I Was Born ≠≠\n");

        Codigo code = new Codigo();
        code.myYearCode();
    }
//=====================================================================================================================
    private void dayToday(){
        System.out.println("\n\t≠≠ Today's Day ≠≠\n");

        Codigo code = new Codigo();
        code.todaysDay();
    }
//=====================================================================================================================
}
