package Task;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneBook {
    private String surname;
    private String name;
    private String numberPhone;
    private int data_of_birth;

    public PhoneBook(String surname, String name, String numberPhone, int data_of_birth) {
        this.surname = surname;
        this.name = name;
        this.numberPhone = numberPhone;
        this.data_of_birth = data_of_birth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {

        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {

        this.numberPhone = numberPhone;
    }

    public int getData_of_birth() {
        return data_of_birth;
    }

    public void setData_of_birth(int data_of_birth) {
        this.data_of_birth = data_of_birth;
    }
    public void surSort(ArrayList<PhoneBook> ar){
        Collections.sort(ar,new PhoneBookSurnameComparator());
    }
    public void printList(ArrayList<PhoneBook> ar){
        for (PhoneBook i:ar) {
            StringBuffer v=new StringBuffer(Integer.toString(i.getData_of_birth()));
            v.insert(2,".");
            v.insert(5,".");


            System.out.println(i.getSurname()+" "+i.getName()+" "+i.getNumberPhone()+" "+v);

        }
    }
    public void deleteContact(ArrayList<PhoneBook> ar ,int ind){
        ar.remove(ind);
    }
    public void sortData(ArrayList<PhoneBook> ar){
        Collections.sort(ar,new PhoneBookDataOfBirthComporatar());
    }


}
