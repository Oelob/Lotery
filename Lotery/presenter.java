
import java.util.ArrayList;
import java.util.Scanner;

import models.Gamer;
import models.LoteryBox;
import models.Toys;
import view.toyView;


public class presenter{
    public static void main(String[] args) {

        Toys toy = new Toys(1, "tiger", 5, 80, "fluffy");
        Toys toy2 = new Toys(2, "lion", 4, 60, "fluffy");
        Toys toy3 = new Toys(3, "cat", 3, 50, "plastic");
        Toys toy4 = new Toys(4, "bycicle", 1, 20, "transport");
        Gamer gamer1 = new Gamer(1, "Ivan");
        Gamer gamer2 = new Gamer(2, "David");

       

        // LoteryBox<Toys> box = new LoteryBox<>();
        // ArrayList<Double> weight = new ArrayList<>();
        // box.add(toy);
        // box.add(toy2);
        // box.add(toy3);
        // box.add(toy4);
        // box.printBox(box);
        // for (Toys toys : box) {
        //     int a = toys.getCount();
        //     for (int i = 0; i < a; i++) {
        //         weight.add(toys.getWeigh());
        //     }
        // }
        // weight.sort(null);
        // System.out.println(weight.toString());
    
}
    
        public static void Menu() {

            LoteryBox<Toys> box = new LoteryBox<>();
            Scanner in = new Scanner(System.in);
            while (true){
                int a;
                System.out.print("Выберите команду:\n"+
                "1. Добавить игрушку в лотерею\n"+
                "2. Добавить игрока\n"+
                "3. Сделать ход\n"+
                "4. Выход");
                if (in.hasNextInt()){
                a = in.nextInt();
                in.nextLine();
                
                if (a==1){
                    ArrayList<Object> temp = view.toyView.getToyInfo();
                    Toys toy = new Toys((int)temp.get(0), (String)(temp.get(1)), (int)temp.get(2), (double)temp.get(3), (String)temp.get(4));
                    box.add(toy);
                    box.printBox(box);
                    
                } 
                else if (a==2){
                    System.out.println("Good");
                }

                else if (a==4){
                    break;
                } else {
                    System.out.println("Неверная комнда, попробуйте снова: ");
                    in.nextLine();
                } 
            }
            
            else {
                System.out.println("Неверная команда, попробуйте снова: ");
                in.nextLine();
            }         
        }
        in.close();
    }
}