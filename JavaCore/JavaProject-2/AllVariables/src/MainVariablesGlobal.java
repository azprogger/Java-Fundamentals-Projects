public class MainVariablesGlobal {

    // Static varib
    public static int staticNumber=19;

    public static void main(String[] args) {
        System.out.println("Umnajeniya  " + (staticNumber*4));

        calSumma(11);
    }

    public static void calSumma(int num){
        int mySum = staticNumber+num;
        System.out.println("summa "  + mySum);
    }
}
