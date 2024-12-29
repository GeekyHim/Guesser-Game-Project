import java.util.Scanner;
public class Guesser {
    int guesserNum;
    public int GuesserNumb(){
        System.out.print("Guesser please enter the number: ");
        Scanner scan = new Scanner(System.in);
        guesserNum = scan.nextInt();
        return guesserNum;
    }
}
