public class Question6 {

    public void leapyear(int input){
        if ((input % 4 == 0 && input % 100 != 0) || (input % 400 == 0))
            System.out.println("It is a leap year");
        else
            System.out.println("Not a leap year");

    }
}
