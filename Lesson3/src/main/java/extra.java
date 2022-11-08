public class extra {
    public static void main(String[] args) {
        byte a1 = 3;
        short b1 = 4;
        int result = a1 - b1;
        System.out.println(result);
        System.out.println("------");
        {
            byte a11 = -127;
            byte b11 = 4;
            int resultt = a11 - b11;
            System.out.println(resultt);
            System.out.println("------");
        }
        {
            char a12 = 'a';
            byte b12 = 4;
            char result1 = (char) (a12 + b12);
            System.out.println(result1);
            System.out.println("--------");
        }

    }
}
