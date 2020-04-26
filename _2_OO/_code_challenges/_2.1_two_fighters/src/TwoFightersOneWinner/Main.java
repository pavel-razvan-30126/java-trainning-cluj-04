package TwoFightersOneWinner;


public class Main {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Fighter1",100,23.6);
        Fighter fighter2 = new Fighter("Fighter2",135,16.2);

        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2);
        System.out.println(boxingMatch.fight());

    }
}
