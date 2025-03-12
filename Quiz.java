import java.util.*;

public class Quiz
{
    // start of the code 

    

    static int c=0,score=0;

    //too exit loop  
    void exit() {

        System.out.println("-------------------Exit The Game-----------------------"); 
    }
    //for any kind of help 
    void support() {

        System.out.println("contact on this number 635xxxxxxx for any quari or feedback ");

        System.out.println("contact on this mail id xyz@gmail.com for any quari or feedback ");
    }
    static{    // static block to display the welcome message
             
             System.out.println("-------------------  Welcome to Quiz Game -----------------------");
        
             
    }
    public static void QuizRound(){


                System.out.println("---------------------------QUIZ GAME START NOW----------------------------------");
        int Choice=0;

        Scanner n=new Scanner(System.in);

           

        System.out.println("Q1) What is the Day on Mars Called ");

        System.out.println("1: Uranian Day");
        System.out.println("2: Solar Day");
        System.out.println("3: Day");
        System.out.println("4: Sol");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice = n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==4){ //cheaking the answer

            System.out.println("Answer Is Correct");
            c++;  // [point systerm]
            score++;
            System.out.println("You got a point in:"+""+c);
        }
        else{

            System.out.println("Answer is InCorrect");
        }
    }
        else{
        QuizRound();
    }


    
        System.out.println("Q2) What is the currency of Japan?");

        System.out.println("1: Yen");
        System.out.println("2: Rupees");
        System.out.println("3: Usd");
        System.out.println("4: Pound");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice = n.nextInt();

        if (Choice >= 1&& Choice<=4){
        if(Choice==1){

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else {

            System.out.println("Answer is InCorrect");
        }

    }
        else {
            QuizRound();
        }

        System.out.println("Q3) Which country is known as the land of the rising sun?");

        System.out.println("1: South korea");
        System.out.println("2: Russia");
        System.out.println("3: Japan");
        System.out.println("4: China");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice = n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==3){

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }
        else{

            System.out.println("Answer is not Correct");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q4) Which Mammal is known to have the most power full bite force ?");

        System.out.println("1: Elephant");
        System.out.println("2: Crocodile");
        System.out.println("3: Hippopotamus");
        System.out.println("4: Bear");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==3) {

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }
        else{

            System.out.println("Answer is  InCorrect");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q5) Which Butter Fly Migrates ?");

        System.out.println("1: Monarchs");
        System.out.println("2: Morpho");
        System.out.println("3: Hawk Moths");
        System.out.println("4: Owlet Moths");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==1){

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else {

            System.out.println("Answer is InCorrect");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q6) What is the Coldest place in the universe ");

        System.out.println("1: Black Hole");
        System.out.println("2: The Dying Star");
        System.out.println("3: The Boomerang Nebula");
        System.out.println("4: Warm Hole");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==3) {

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else{

            System.out.println("Answer is  InCorrect");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q7) Who invented the language JAVA ");

        System.out.println("1: James Gosling");
        System.out.println("2: Guido van Rossum");
        System.out.println("3: Dennis M. Ritchie");
        System.out.println("4: None of these");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==1){

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else {

            System.out.println("Answer is  InCorrect");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q8) Who was the first emperor of the Maurya Empire");

        System.out.println("1: Chandragupta Maurya");
        System.out.println("2: Ashoka Maurya");
        System.out.println("3: Samudragupta Maurya");
        System.out.println("4: Bimbimsar Maurya");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==1) {

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else {

            System.out.println("Answer is InCorrect");
        }
    }
        else{
            QuizRound();
        }

        System.out.println("Q9) The Gnadiva was the weapon of");

        System.out.println("1: Arjun");
        System.out.println("2: Karn");
        System.out.println("3: Krishn");
        System.out.println("4: Abhimanyu");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice =n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==1) {

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in:"+""+c);
        }

        else{

            System.out.println("Answer is InCorrect");
        }
    }
        else{
            QuizRound();
        }
        
        System.out.println("Q10) Which of the following phenomena cannot be observed on the surface of the Moon?");

        System.out.println("1: Rising  of the Sun ");
        System.out.println("2: Solar eclipse");
        System.out.println("3: setting of the Sun");
        System.out.println("4: Twinkling of the stars");

        System.out.println("Enter Your Choice(1 to 4)");
        Choice = n.nextInt();
        if (Choice >= 1&& Choice<=4){
        if(Choice==4) {

            System.out.println("Answer Is Correct");
            c++;
            score++;
            System.out.println("You got a point in :"+""+c);
        }

        else {

            System.out.println("Answer is InCorrect");

            System.out.println("Your total point are : "+ c + "/10"); // total score to be display
        }
    }
        else{
            QuizRound();
        }
        System.out.println("------------------End Quiz Round---------------------------");
       
    }
    public static void main(String args[]) {
        int Choice=0;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter User Name: ");

        String user = sc1.next();

       

        boolean b=true;

        // to rotate the loop for user to play the game
        while(b) {
            System.out.println(" In This Quiz There are Total 10 Quesion ");

            System.out.println(" Please Press 1 To start Quiz Game ");

            System.out.println(" Press 2 for any query or feedback ");

            System.out.println(" Press 3 exit ");

            Scanner sc=new Scanner(System.in);

            Quiz q=new Quiz();

            int a =sc.nextInt();

            // to add the methord in the loop
            switch(a) {

                case 1:
                q.QuizRound();
                break;
                
                case 2:
                q.support();
                break;

                case 3:
                System.out.println("-------------------Thank You For Playing This Game-----------------------");
                System.out.println("        -------------------Exit The Game-----------------------");
                b=false;
                break;

                default:
                System.out.println(" The number you chose is not valid ");
                break;

                // end of the code
            }

        
        }
    }   
}