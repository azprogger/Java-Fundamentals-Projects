package variable;

public class Variables {
    public static void main(String[] args) {

        // step-0.    int - primitive type
        int number = 100;
        double sum = 930.32;
        char  letter = 'a';
        boolean tellMe = true;
        String name = "Piter";
        float size = 3.4f;
        //var


        //step - 1 .  Long type
        long bigSize = 100L;


        //step - 2 . Math

        int num2 = number + 100 ;
        System.out.println("num2 " + num2);  // mathic add

        System.out.println("More values " + num2 + number);  //just add as string
        System.out.println("More values " + (num2 + number));  //just add as math

        String result = name + tellMe;
        System.out.println("result  " + result);

        double door = sum + size;
        System.out.println("Door  " + door);

        //float window = sum + door;

        boolean sayHi = tellMe;
        System.out.println(sayHi);


    }
}


// Zadacha . Task.
/*
*  1. Type.
*  2. Comment
*  3. Math ( daraja  )
* */
