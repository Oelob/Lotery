
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import models.Gamer;
import models.GamersList;
import models.LoteryBox;
import models.Toys;
import view.display;
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
            GamersList<Gamer> gamerList = new GamersList<>();
            Scanner in = new Scanner(System.in);
            while (true){
                int a;
                display.showInfo("Выберите команду:\n"+
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
                    box.sortBox();
                    box.printBox(box);
                    
                } 
                else if (a==2){
                    ArrayList<Object> temp = view.gamerView.getGamerInfo();
                    Gamer gamer = new Gamer((int)temp.get(0), (String)(temp.get(1)));
                    gamerList.add(gamer);

                }
                else if (a==3){
                    // int size_box = getLength(box);
                    int size_box = box.getLength(box);
                    if ( size_box != 0) //проверка на наличие игрушек в лотерее 
                    {
                        display.showInfo("Выберите ID игрока: ");
                        int size_gamerList = gamerList.getLength(gamerList);
                        if (size_gamerList!=0) //проверка на наличие игроков
                        {
                        gamerList.printList(gamerList);
                        int gamer_count = in.nextInt();
                        }else{
                            display.showInfo("Список игороков пуст, сначала добавьте игрока");
                            continue;
                        }
                        
                        

                    }else{
                        display.showInfo("Лотерейный ящик пуст, добавьте игрушек!");
                    }
                }


                else if (a==4){
                    break;
                } else {
                    display.showInfo("Неверная комнда, попробуйте снова: ");
                    in.nextLine();
                } 
            }
            
            else {
                display.showInfo("Неверная команда, попробуйте снова: ");
                in.nextLine();
            }         
        }
        in.close();
    }
}