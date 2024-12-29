public class Umpire {
    // to collect all nums 
    // 1. guesser 
    // 2. player
    // 3rd task comapring
    // creating req instance variables

    int GusserNum;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;

    public void CollectNumFromGuesser(){
        Guesser Gu = new Guesser();
        GusserNum = Gu.GuesserNumb();
    }

    public void CollectNumFromPlayers(){
        System.out.print("Player 1 Guess Your Number: ");
        Player P1 = new Player();
        PlayerNum1 = P1.PlayerNumb();

        System.out.print("Player 2 Guess Your Number: ");
        Player P2 = new Player();
        PlayerNum2 = P2.PlayerNumb();

        System.out.print("Player 3 Guess Your Number: ");
        Player P3 = new Player();
        PlayerNum3 = P3.PlayerNumb();
    }

    public void Compare(){
        // Scenarios
        // p1,p2,p3
        // p1, np2, p3
        // p1, np2, np3 
        if(GusserNum==PlayerNum1){
            if(GusserNum==PlayerNum2 && GusserNum==PlayerNum3) System.out.println("ALL PLAYERS WON THE GAME!...");
            else if(GusserNum==PlayerNum2) System.out.println("PLAYER 1 AND PLAYER 2 WON THE GAME...");
            else if(GusserNum==PlayerNum3) System.out.println("PLAYER 1 AND PLAYER 3 WON THE GAME...");
            else System.out.println("PLAYER 1 WON THE GAME...");
        }   
        // np1, p2, p3
        // np1, p2, np3
        else if (GusserNum==PlayerNum2) {
            if(GusserNum==PlayerNum3) System.out.println("PLAYER 2 AND PLAYER 3 WON THE GAME...");
            else System.out.println("PLAYER 2 WON THE GAME...");
        }
        // np1,np2,np3
        else if(GusserNum==PlayerNum3) System.out.println("PLAYER 3 WON THE GAME...");
        // no one
        else System.out.println("EVERYONE LOST!...");    
    }

}
