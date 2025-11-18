public class MadLib {
    //these are all my variables/boolean/string/double

    public String classmate;
    public String city;
    public String noun;
    public String adjective;
    public String pluralNoun;
    public String pluralAnimal;
    public boolean trueOrFalse;
    public double decimalBiggerThan1;
    public int number1;
    public double number2;
    public int wholeNumberBetween1And4;
    public String miltonTeacher;
    public String miltonDean;
    public String letterGrade;
    public String season;



    //this is my main constructor v
    public static void main(String[] args) {
        System.out.println("Hello World");
        MadLib myStory = new MadLib();

    }
public MadLib(){
    System.out.println("halo vorld");
    classmate = "Julia";
    city = "New York";
    noun = "table";
    adjective = "blue";
    pluralNoun = "candles";
    pluralAnimal = "cats";
    trueOrFalse = true;
    decimalBiggerThan1 = 25.10;
    number1 = 17;
    number2 = 13;
    wholeNumberBetween1And4 = 3;
    miltonTeacher = "Mr.A";
    miltonDean = "Ms. Latham";
    letterGrade = "A";
    season = "winter";

    //define a string called story for mad lib
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";

//now print story to the dos window
    System.out.println(story);


}

}
