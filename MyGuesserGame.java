public class MyGuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        System.out.println("----- WELCOME TO NUMBER GUESSER GAME ------");
        System.out.println();
        umpire.CollectNumFromGuesser();
        umpire.CollectNumFromPlayers();
        System.out.println();
        System.out.println("-- RESULTS --");
        umpire.Compare();
        System.out.println();
        System.out.println();
        System.out.println("----- THANK YOU FOR PLAYING -----");
    }
}
