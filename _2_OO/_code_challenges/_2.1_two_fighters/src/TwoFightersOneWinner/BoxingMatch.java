package TwoFightersOneWinner;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        if(fighter1.getHealth()/fighter2.getDamagePerAttack() >= fighter1.getHealth()/fighter2.getDamagePerAttack()){
            return "Fighter "+fighter1.getName()+" won";
        }else{
            return"Fighter "+fighter2.getName()+" won";
        }
    }

}
