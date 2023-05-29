package models;

import java.util.Comparator;

public class Toys implements Comparable<Toys>{

    protected int id;
    protected String name;
    protected int count;
    protected double weigh;
    protected String toy_category;

    public Toys (int id, String name, int count, double weigh, String toy_category) {
        this.id = id;
        this.name = name; 
        this.count = count;
        this.weigh = weigh;
        this.toy_category = toy_category;
    }

    public String getName(){
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getCount() {
        return this.count;
    }

    public double getWeigh() {
        return this.weigh;
    }

    public String getToyCategory(){
        return this.toy_category;
    }
    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("Игрушка:\n ID - %d\n Name - %s\n Count - %d\n Weigh - %.2f%%\n Toy category - %s", 
        this.id, this.name, this.count, this.weigh, this.toy_category);
    }

    @Override
    public int compareTo(Toys o) {
        return (int) (this.weigh - o.getWeigh());
    }
    
    // @Override
    // public int compare(Toys o1, Toys o2) {
    //     return (int) (o1.getWeigh() - o2.getWeigh());
    // }

}

