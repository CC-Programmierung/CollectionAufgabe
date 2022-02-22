package sorter;

import car.Car;

import java.util.Comparator;

public class SorterByName implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        return((Car)o1).getModel().compareTo(((Car)o2).getModel());
    }
}
