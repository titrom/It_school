import java.util.Arrays;
import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {
        int[] mas=new int[10];
        Arrays.fill(mas,4);
        for (int i:mas) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.fill(mas,3,mas.length-1,5);
        for (int i:mas) {
            System.out.print(i+" ");
        }
        System.out.println();
        Random rnd=new Random();
        for (int i=0;i<mas.length;i++){
            mas[i]=rnd.nextInt(90)+10;
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        Arrays.sort(mas);
        for (int i:mas) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0;i<mas.length;i++){
            mas[i]=rnd.nextInt(90)+10;
            System.out.print(mas[i]+" ");
        }
        Arrays.sort(mas,mas.length/2,mas.length);
        System.out.println();
        for (int i:mas) {
            System.out.print(i+" ");
        }
//        Comp comp=new Comp();
//        Arrays.sort(new int[][]{mas},comp);
        Person[] p=new Person[3];
        p[0]=new Person("Vasia",34,67,180);
        p[1]=new Person("Boria",46,87,189);
        p[2]=new Person("Liza",20,32,160);
        System.out.println();
        Arrays.sort(p,new PersonAgeComparator().thenComparing(new PersonNameComporator()));
        for (Person i:p){
            System.out.print(i.getName()+" "+i.getAge()+" ");
        }
        Arrays.sort(mas);
        System.out.println(Arrays.binarySearch(mas,96));
        int[] b=new int[10];
        for (int i=0;i<b.length;i++){
            b[i]=rnd.nextInt(90)+10;
            System.out.print(b[i]+" ");
        }
        for (int i:b) {
            System.out.print(i+" ");
        }
        System.out.println(Arrays.equals(mas,b));







    }
}
