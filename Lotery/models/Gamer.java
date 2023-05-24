package models;

import java.util.ArrayList;

import javax.xml.validation.ValidatorHandler;

public class Gamer {
    
   protected int id;
   protected String name;

   public Gamer(int id, String name) {
        this.id = id;
        this.name = name;

   }

   public int getId() {
       return id;
   }
   public String getName() {
       return name;
   }
   @Override
   public String toString() {
       return String.format("ID игрока - %d\nИмя игрока - %s", this.id, this.name);
   }

   public void gamersList(ArrayList<Gamer> arr){
    for (Gamer gamer : arr) {
        System.out.println(gamer);
        System.out.println("============");
    }

   }

}
