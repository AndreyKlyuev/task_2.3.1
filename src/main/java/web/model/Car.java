package web.model;

public class Car {
    private String model;
    private int series;
    private int HP;

    public Car(String model, int series, int HP) {
        this.model = model;
        this.series = series;
        this.HP = HP;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
