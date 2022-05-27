package com.sparta.ay;

public class EnumExample {

    public enum Fighters {

        Ryu("Hadouken"),
        Ken("Shoryuken"),
        Dhalsim("Yoga Flame"),
        MBison("Psycho Crusher");

       private String move;

       Fighters(String move) {
           this.move = move;
       }

       public String getMove() {
            return move;
       }

       public void setMove(String move) {
           this.move = move;
       }

        public static void main(String[] args) {
            Fighters bestFighter = Fighters.MBison;
            System.out.println("The best Street Fighter is" + " " + bestFighter);
        }
    }
}
