import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        { //Базовый уровень

            { //Вариант 11
                //задание а
                {
                    double x = 1;
                    double y=2;
                    System.out.println((!(x*y<1))&&(y>x));

                }
                //задание б
                {
                    double x=2;
                    double y=1;
                    System.out.println((x*y!=0)||(y<x));
                }
            }


            {  //Вариант 1
                boolean A = true;
                boolean B = false;
                boolean C = false;

                boolean a = (A || !A && B && C);
                System.out.println(a);
                boolean b = !A || A && (B || C);
                System.out.println(b);
                boolean c = (A || B && !C) && C;
                System.out.println(c);
            }
            //Вариант 2
            {
                boolean X = false;
                boolean Y = true;
                boolean Z = false;
                boolean a = X && !(Z || Y) || !Z;
                System.out.println(a);
                boolean b = !X || X && (Y || Z);
                System.out.println(b);
                boolean c = (X || Y && !Z) && Z;
                System.out.println(c);
            }
            //Вариант 3
            {
                {
                    //Задание а
                    double x = 2;
                    double y = 1;
                    boolean r1 =(!(x * y < 0)) && (y > x);

                    System.out.println(r1);
                }
                {
                    //Задания б
                    double x = 2;
                    double y = -2;
                    boolean r2=(x >= 2) || (y * y != 5);
                    System.out.println(r2);

                }


            }
            //Вариант 4

            {
                try {
                    int A = in.nextInt();
                    if (A % 2 == 0 && A % 3 == 0) System.out.println("Yes");
                    else System.out.println("No");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 5
            {
                try {
                    int A = in.nextInt();
                    int B = in.nextInt();
                    if (A % 2 != 0 && B % 2 != 0) System.out.println("Yes");
                    else System.out.println("No");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 6
            {
                boolean X = false;
                boolean Y = false;
                boolean Z = true;
                boolean a = X || Y && !Z;
                System.out.println(a);
                boolean b = !X && !Y;
                System.out.println(b);
                Boolean c = !(X && Z) || Y;
                System.out.println(c);

            }
            //Вариат 7
            {


            }
            { //Вариант 8
                //задание а
                {
                    double x = 1;
                    double y=2;
                    System.out.println((x>=0)&&(y*y!=4));

                }
                //задание б
                {
                 double x=2;
                 double y=1;
                    System.out.println((x*y!=0)||(y>x));
                }
            }
            { //Вариант 9
                //задание а
                {
                    double x = 1;
                    double y=2;
                    System.out.println((!(x*y<0))||(y>x));

                }
                //задание б
                {
                    double x=2;
                    double y=1;
                    System.out.println((x*y!=0)&&(y<x));
                }
            }
            //Вариант 10
            {
                boolean A=true;
                boolean B=false;
                boolean C=true;
                boolean a=A||!(A&&B)||C;
                System.out.println(a);
                boolean b=!A||C&&!(B||C);
                System.out.println(b);
                boolean c=(A||B&&!C)||A;
                System.out.println(c);
            }
        }
        // Средний
        {
            //Вариант 11
            {
                try {
                    double V= in.nextDouble();
                    double year= in.nextDouble();
                    if(V>=400&&V<600) System.out.println(V+(year*(V/(100/5))));
                    else if (V>=600&&V<1000) System.out.println(V+(year*(V/(100/10))));
                    else if (V<400) System.out.println(V);
                    else System.out.println("No");



                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

            //Вариант 1
            {
                try {
                    int A = in.nextInt();
                    int B = in.nextInt();
                    int C = in.nextInt();

                    if (A % 2 == 0 ^ B % 2 == 0) System.out.println("Yes");
                    else System.out.println("No");
                    if (A % 3 == 0 && B % 3 == 0 && C % 3 == 0) System.out.println("Yes");
                    else System.out.println("No");

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 2
            {
                try {
                    int N = in.nextInt();
                    if (N % 4 == 0 || N % 7 == 0) System.out.println("Yes");
                    else System.out.println("No");
                    if (N % 5 == 0 && N % 10 != 0) System.out.println("Yes");
                    else System.out.println("No");


                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 3
            {
                try {
                    double n= in.nextDouble();
                    double m= in.nextDouble();
                    double k= in.nextDouble();
                    double l= in.nextDouble();
                    if (n+m>k||n>k&&m<l) System.out.println("Yes");
                    else System.out.println("No");
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 4
            {
                try {
                    int N= in.nextInt();
                    if (N%3==0&&N%9!=0||N%4==0&&N%5==0&&N%24==24)System.out.println("Yes");
                    else System.out.println("No");

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 5
            {
                try {
                    double n= in.nextDouble();
                    double m= in.nextDouble();
                    double k= in.nextDouble();
                    double l= in.nextDouble();
                    if ((n>1||m<=l&&k==0)||n>2&&m*m>l*l) System.out.println("Yes");
                    else System.out.println("No");
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 6
            {
                try {
                    double V= in.nextDouble();
                    double year= in.nextDouble();
                    if(V<5000) System.out.println(V+(year*(V/(100/20))));
                    else  if (V>=5000&&V<=10000) System.out.println(V+(year*(V/(100/22))));
                    else System.out.println("No");

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 7
            {
                try {
                    int N= in.nextInt();
                    if (N%2==0&&(N%7==0&&N%11!=0&&N%13!=0))System.out.println("Yes");
                    else System.out.println("No");

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 8
            {
                try {
                    int N= in.nextInt();
                    if (N%3!=0&&(N%7==0&&N%10==0))System.out.println("Yes");
                    else System.out.println("No");

                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Вариант 9
            {
                try {
                    double n= in.nextDouble();
                    double m= in.nextDouble();
                    double k= in.nextDouble();
                    double l= in.nextDouble();
                    if ((k==0&&l>m)||(k<0&&2*l-3*n<m)) System.out.println("Yes");
                    else System.out.println("No");
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            //Вариант 10
            {
                try {
                    int N= in.nextInt();
                    if (N%2==0&&(N%3!=0&&N%7==0)&&(N%5!=0&&N%4!=0)&&(N%8==0&&N%11==0))System.out.println("Yes");
                    else System.out.println("No");

                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        //Высокий
        {
            // Вариант 11
            {
                try {
                    int x= in.nextInt();
                    int y= in.nextInt();
                    if (((y>=-1||y<=1))&&(x>-1&&x<1)) System.out.println("Yes");
                    else System.out.println("No");

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }



        }




    }



}
