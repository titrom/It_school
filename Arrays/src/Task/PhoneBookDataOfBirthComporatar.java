package Task;

import java.util.Comparator;

public class PhoneBookDataOfBirthComporatar implements Comparator<PhoneBook> {
    @Override
    public int compare(PhoneBook o1, PhoneBook o2) {
        if (o1.getData_of_birth()%1000>o2.getData_of_birth()%1000){
            return -1;
        }
        else if (o1.getData_of_birth()%1000<o2.getData_of_birth()%1000){
            return 1;
        }
        else if ((o1.getData_of_birth()%1000==o2.getData_of_birth()%1000)&&(o1.getData_of_birth()/1000%100>o2.getData_of_birth()/1000%100)){
            return -1;
        }
        else if ((o1.getData_of_birth()%1000==o2.getData_of_birth()%1000)&&(o1.getData_of_birth()/1000%100<o2.getData_of_birth()/1000%100)){
            return 1;
        }
        else if ((o1.getData_of_birth()%1000==o2.getData_of_birth()%1000)&&(o1.getData_of_birth()/1000%100==o2.getData_of_birth()/1000%10)&&(o1.getData_of_birth()/1000000>o2.getData_of_birth()/1000000)){
            return -1;
        }
        else if ((o1.getData_of_birth()%1000==o2.getData_of_birth()%1000)&&(o1.getData_of_birth()/1000%100==o2.getData_of_birth()/1000%10)&&(o1.getData_of_birth()/1000000<o2.getData_of_birth()/1000000)){
            return 1;
        }else return 0;



    }
}
