import java.io.*;

public class Task2
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);

        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);

        String number3 = reader.readLine();
        int num3 = Integer.parseInt(number3);

        String number4 = reader.readLine();
        int num4 = Integer.parseInt(number4);

        String number5 = reader.readLine();
        int num5 = Integer.parseInt(number5);

        int PosCount=0;

        if(num1>=0)
        {
            PosCount++;
        }
        if(num2>=0)
        {
            PosCount++;
        }
        if(num3>=0)
        {
            PosCount++;
        }
        if(num4>=0)
        {
            PosCount++;
        }
        if(num5>=0)
        {
            PosCount++;
        }

        System.out.println("количество положительных чисел: "+PosCount);
    }
}

