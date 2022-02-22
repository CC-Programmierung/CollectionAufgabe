package car;

import java.util.Objects;

public abstract class Car {
    protected int constructionYear;
    protected String model;

    public Car(int constructionYear, String model) {
        this.constructionYear = constructionYear;
        this.model = model;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return constructionYear == car.constructionYear && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constructionYear, model);
    }

    @Override
    public String toString() {
        return "Modell: " + model + ", Baujahr: " + constructionYear;
    }
}
