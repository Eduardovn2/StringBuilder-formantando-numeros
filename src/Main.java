import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String cel1 = "21987863935";
        String cel2 = "987863935";
       String tel1 = "2187863935";
       String tel2= "87863935";


        System.out.println(numberFormatted(tel1));
        System.out.println(numberFormatted(tel2));
        System.out.println(numberFormatted(cel1));
        System.out.println(numberFormatted(cel2));
        System.out.println(numberFormatted("(21)98582-5097"));
        System.out.println(numberFormatted("(2)1234567"));

    }

    public static StringBuilder numberFormatted(String number){

        StringBuilder stringBuilder = new StringBuilder(number);

        //If number.matches ter "(" entre 2 caracteres ")", depois {4} numeros um "-" e {5} numero no final:
        if(number.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}$")){
            return stringBuilder;
        }

        //Se nao number.matches ter {7 a 12} digitos.
        else if (number.matches("\\d{7,12}")){

            switch (number.length()) {
                case 8:
                    stringBuilder = stringBuilder.insert(4, "-");
                    break;
                case 9:
                    stringBuilder = stringBuilder.insert(5, "-");
                    break;
                case 10:
                    stringBuilder = stringBuilder.insert(6, "-").insert(0, "(").insert(3, ")");
                    break;
                case 11:
                    stringBuilder = stringBuilder.insert(7, "-").insert(0, "(").insert(3, ")");
                    break;
            }
        }
        return stringBuilder;
    }
}