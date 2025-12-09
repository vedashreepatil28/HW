public class Conditionals {
    String question;


    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }//this is the main method


    public Conditionals(){
        question = "Do you wear wiggs? ";
        System.out.println(question);

        int randomInt = (int)(Math.random()*10)+1;
        randomInt = (int) (Math.random()*10)+1;
        if(randomInt == 2 || randomInt == 4) {
            System.out.println("Obviously!");
        }
        if(randomInt == 1 || randomInt == 5 ) {
            System.out.println("Possibly...");
        }
        if(randomInt == 7 || randomInt == 10) {
            System.out.println("Nah...");
        }
        if(randomInt == 3 || randomInt == 8 ) {
            System.out.println("Seems like it");
        }
        if( randomInt == 9 || randomInt == 6) {
            System.out.println("Sometimes!");
        }

        question = "Will it snow tomorrow? ";
        System.out.println(question);

        int randomInt2 = (int)(Math.random()*10)+1;
        randomInt2 = (int) (Math.random()*10)+1;
        if(randomInt2 == 2 || randomInt2 == 4) {
            System.out.println("Without a doubt!");
        }
        if(randomInt2 == 1 || randomInt2 == 5 ) {
            System.out.println("Ask again later!");
        }
        if(randomInt2 == 7 || randomInt2 == 10) {
            System.out.println("Very doubtful!");
        }
        if(randomInt2 == 3 || randomInt2 == 8 || randomInt2 == 6) {
            System.out.println("Most likely");
        }
        if( randomInt2 == 9 || randomInt2 == 6) {
            System.out.println("Maybe...");
        }
    }//constructor method

}
