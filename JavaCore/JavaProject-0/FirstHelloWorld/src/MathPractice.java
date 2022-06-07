public class MathPractice {
    public static void main(String[] args) {

        String name = "Husniddin"; // type
        String  className = "Java Backend";
        int age = 32;
        int position = 5;

        System.out.println("Name:" + name + " " + "className" + className);
        System.out.println("------------------");
        System.out.println("Name" + name + " my age: " + age + " My position: " + position);

        int num1 = 289;
        int num2 = 281;
        int sum = 0;

        System.out.println("Summa:" + sum);

        // step-0 Adding two numbers
        sum = num1+num2;
        System.out.println("Summa0: " + sum);

        // step-1: Adding two numbers inside out
        System.out.println("Summa1: " + (num1 + num2));

        //step-2: Adding with sout
        System.out.println("Summa2: " + num1 + num2);

        //step-3 Boolean Type
        boolean tellMe = false;
        System.out.println("Tell me: " + tellMe);
    }
}
