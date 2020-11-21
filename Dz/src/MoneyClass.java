import java.util.Scanner;

public class MoneyClass {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long rub = in.nextLong();
        int cop=in.nextInt();
        Money money=new Money(rub,(char)cop);
        money.print();
        long rub2 = in.nextLong();
        int cop2=in.nextInt();
        Money money2=new Money(rub2,(char)cop2);
        money2.print();
        Money money3=money.Add(money2);
        money3.print();
        Money money4=money.Sub(money2);
        money4.print();
        Money money5=money.Del(money2);
        money5.print();
        long ch= in.nextInt();
        int zn= in.nextInt();
        Money drob=new Money(ch, (char) zn);
        drob.print1();
        Money money6=money.DelDrob(money3,drob);
        money6.print();
        Money money7=money.Rov(money2);
    }
}
