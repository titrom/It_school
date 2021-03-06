package Task;

import java.util.Comparator;

public class PhoneBookSurnameComparator implements Comparator<PhoneBook> {
    @Override
    public int compare(PhoneBook o1, PhoneBook o2) {


        return o1.getSurname().compareTo(o2.getSurname());
    }
}
