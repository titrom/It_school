package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        // add Добовление элемнта в колекцию
        arrayList.add("Vasia");
        arrayList.add(5);
        arrayList.add(55.7);
        System.out.println(arrayList);
        ArrayList<Integer> arrayInteger=new ArrayList<Integer>();
        arrayInteger.add(7);
        arrayInteger.add(8);
        arrayInteger.add(77);
        arrayInteger.add(678);
        System.out.println(arrayInteger);
        //AddAll
        ArrayList<Integer> arrInt=new ArrayList<Integer>();
        arrInt.add(77);
        arrInt.addAll(0,arrayInteger);
        System.out.println(arrInt);
        //get(int index)- Object from List
        System.out.println(arrInt.get(3));
        //indexOf(Object obj)- индекс первого вхождения Object in List. if NOT=-1
        System.out.println(arrInt.indexOf(77));
        //lastIndexOf(Object obj)
        System.out.println(arrInt.lastIndexOf(77));
        //size()-Mas List
        System.out.println(arrInt.size());
        //set(int index,E obj)- replacement
        arrInt.set(2,8);
        System.out.println(arrInt);
        //remove(index||obj)-delete obj
        arrInt.remove(4);
        System.out.println(arrInt);
        arrayList.remove("Vasia");
        System.out.println(arrayList);
        //clear()-deleteAll
        arrayList.clear();
        //out Two fori
        System.out.println(arrayList);
        for (int i = 0; i <arrInt.size() ; i++) {
            System.out.print(arrInt.get(i)+" ");

        }
        //out Three foreach
        System.out.println();
        for (int i:arrInt) {
            System.out.print(i+" ");

        }
        System.out.println();
        // out Four iterator
        Iterator<Integer> iterator=arrInt.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //toArray-converting to an array
        Object[] mas=arrInt.toArray();
        //contains(Object el)- checking the location
        if (arrInt.contains(8)) System.out.println("True");
        else System.out.println("False");
        //containsAll(Collection c) checking the  location on collections
        if (arrInt.containsAll(arrayInteger)) System.out.println("True");
        else System.out.println("False");
        //Collections
        Collections.sort(arrInt);
        for (int i:arrInt) {
            System.out.print(i+" ");

        }


    }
}
