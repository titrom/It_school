package Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PhoneBookMain {
    public static void main(String[] args) {
        ArrayList<PhoneBook> arrPnBk=new ArrayList<PhoneBook>();
//        String s=".";
//
//        String a="19.02.2008";
//        String b="12.07.2014";
//        for (char c:s.toCharArray()) {
//            a=a.replace(c,' ');
//            b
//
//        }
//
//        System.out.println(a);
        arrPnBk.add(new PhoneBook("Polh","Tonya","8-900-45-75-55",19022008));
        arrPnBk.add(new PhoneBook("Papov","Michael","8-906-231-53-96",26032004));
        arrPnBk.add(new PhoneBook("Averin","Jack","8-921-216-45-67",12072014));
        arrPnBk.add(new PhoneBook("Polh","Timofey","8-906-325-65-47",12082004));
        arrPnBk.add(new PhoneBook("Grizli","Jin","8-906-325-65-47",27032004));

        //arrPnBk.get(0).surSort(arrPnBk);
        //arrPnBk.get(1).printList(arrPnBk);
        //arrPnBk.get(0).deleteContact(arrPnBk,0);
        //System.out.println();
        //arrPnBk.get(1).printList(arrPnBk);
        arrPnBk.get(0).sortData(arrPnBk);
        System.out.println();
        arrPnBk.get(0).printList(arrPnBk);





    }
}
