package sorter;

import car.Car;

import java.util.Comparator;

public class SorterByYear implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(((Car)o1).getConstructionYear() > ((Car)o2).getConstructionYear()){
            return  1;
        }else if(((Car)o1).getConstructionYear() < ((Car)o2).getConstructionYear()){
            return -1;
        }else{
            return 0;
        }
    }
}
