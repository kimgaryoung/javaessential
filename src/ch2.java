import java.util.Scanner;
public class ch2 {

    public void test2(){
         //이론 #4
        /*
        int i=67;
        double j=12.8;
        System.out.println(i+j);//실수 + 정수 =실수

        char c='c';
        System.out.println(c+1);

        */
        //실전
        Scanner s=new Scanner(System.in);
        System.out.println("두정수를 입력하세요>>");

        int num1=s.nextInt();
        int num2=s.nextInt();

        System.out.println("10+20은"+" "+(num1+num2));


    }
}
