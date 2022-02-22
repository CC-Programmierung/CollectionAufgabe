package debug;

import car.BMW;
import car.VW;
import sorter.SorterByName;
import sorter.SorterByYear;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        VW vw = new VW(1990,"Golf");
        BMW bmw = new BMW(2000,"Z4");
        System.out.println(vw);
        System.out.println(bmw);
        System.out.println("----------");

        VW vw1 = new VW(2000,"Cuddy");
        VW vw2 = new VW(2021,"T-Rog");
        VW vw3 = new VW(2008,"Käfer");
        VW vw4 = new VW(2020,"Polo");

        LinkedList lList = new LinkedList();

        lList.add(vw);
        lList.add(vw1);
        lList.add(vw2);
        lList.add(vw3);
        lList.add(vw4);

        System.out.println("-----List Name-----");
        Collections.sort(lList, new SorterByName());
        for(Object carsName : lList){
            System.out.println(carsName);
        }

        System.out.println("-----List Jahr-----");
        Collections.sort(lList, new SorterByYear());
        for(Object carsYear : lList){
            System.out.println(carsYear);
        }

        System.out.println("-----HashSet Name-----");
        HashSet hSet = new HashSet();
        hSet.addAll(lList);
        LinkedList hashList = new LinkedList(hSet);
        Collections.sort(hashList, new SorterByName());
        for(Object carsName : hashList){
            System.out.println(carsName);
        }

        System.out.println("-----HashSet Year-----");
        HashSet hSetY = new HashSet();
        hSetY.addAll(lList);
        LinkedList hashListY = new LinkedList(hSetY);
        Collections.sort(hashListY, new SorterByYear());
        for(Object carsYear : hashListY){
            System.out.println(carsYear);
        }

        System.out.println("-----TreeSet Name-----");
        TreeSet tSet = new TreeSet(new SorterByName());
        tSet.addAll(lList);

        for(Object carsName : tSet){
            System.out.println(carsName);
        }

        System.out.println("-----TreeSet Year-----");
        TreeSet tSetY = new TreeSet(new SorterByYear());
        tSetY.addAll(lList);

        for(Object carsYear : tSetY){
            System.out.println(carsYear);

        }
        System.out.println("-----BMW-----");
        BMW bmw1 = new BMW(2006,"Mini");
        BMW bmw2 = new BMW(2015,"X6");

        ArrayList bmwList = new ArrayList();
        bmwList.add(bmw);
        bmwList.add(bmw1);
        bmwList.add(bmw2);
        for(Object bmwListe : bmwList){
            System.out.println(bmwListe);
        }
        HashSet bmwHash = new HashSet(bmwList);
        TreeSet bmwTree = new TreeSet(new SorterByYear());

        bmwHash.addAll(bmwList);
        bmwTree.addAll(bmwList);
        System.out.println("-----BMW Hash-----");
        List arrayBmWlist = new ArrayList(bmwHash);
        Collections.sort(arrayBmWlist, new SorterByName());
        for(Object bmwName : arrayBmWlist){
            System.out.println(bmwName);
        }

        System.out.println("-----BMW Tree-----");
        for(Object bmwYear : bmwTree){
            System.out.println(bmwYear);
        }

        System.out.println("-----BMW Hash suche-----");
        System.out.println("BMW1 Objekt im Hashset? " + bmwHash.contains(bmw1));
        bmw1.setConstructionYear(1940);
        System.out.println("BMW1 Objekt im Hashset nach änderung? " + bmwHash.contains(bmw1));
        /**
         * Warum ist bei der neuen Suche nach änderung des Jahr das Obj "nicht mehr zu finden" ?
         *      -> Wenn das Objekt geändert wird wirkt sich das auf die Gleichheit und dem Hash Code
         *         aus. Das Objekt befindet sich nicht mehr im richtigem Slot im HashSet der Ihrem
         *         Wert entspricht.
         */
        System.out.println("-----Muß mit meinem Sorter angegeben werden. Wenn ich keinen gemacht hätte und es default wäre müßte ich das nicht-----");
        System.out.println("-----BinarySearch-----");
        int search = Collections.binarySearch(lList,vw4, new SorterByYear());
        System.out.println("Die Suche hat folgendes ergeben: " + search);

        System.out.println("----Search all Models by Year------");
        TreeSet listTotal = new TreeSet(new SorterByYear());
        listTotal.add(vw);
        listTotal.add(vw1);
        listTotal.add(vw2);
        listTotal.add(vw3);
        listTotal.add(vw4);
        listTotal.add(bmw);
        listTotal.add(bmw1);
        listTotal.add(bmw2);

        for(Object carsYear : listTotal){
            System.out.println(carsYear);
        }

    }
}
