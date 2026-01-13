public class Loops {
    int x;
    public static void main(String[] args) {
        Loops myCount= new Loops();
    }//main method

    public Loops(){
    countingUp();
    countByThree();
    countingDown();
    nestedLoop();
    }//constructor method

    public void countingUp(){
        for(int x=1; x<6; x=x+1){
        System.out.println(x);}

        System.out.println(" ");
    }

    public void countByThree(){
        for(int x=1; x<6; x=x+1){
            System.out.print( x*3 +" ");
        }
        System.out.println(" ");
    }

    public void countingDown(){
        System.out.println(" ");
        for(int x=10; x>0; x=x-1){
            System.out.print(x+", ");
        }
        System.out.println(" ");
        System.out.println("Happy Loop Year!!!");
    }

    public void nestedLoop(){
       for(int y = 1; y < 6; y=y+1) {
           System.out.println(" ");
           for(int x =1; x <= y; x=x+1){
               System.out.print(y+ " ");

           }
       }
    }

}
