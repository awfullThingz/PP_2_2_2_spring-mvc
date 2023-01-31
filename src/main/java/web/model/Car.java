package web.model;

public class Car {
    private int id;
    private String model;
    private int series;

    public Car(int id, String model, int series){
        this.id = id;
        this.series = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
