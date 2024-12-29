import java.util.Scanner;

public class Player {
    int playerNum;
    public int PlayerNumb(){
        Scanner scan = new Scanner(System.in);
        playerNum = scan.nextInt();
        return playerNum;
    }
}

