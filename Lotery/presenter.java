
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import models.Gamer;
import models.GamersList;
import models.LoteryBox;
import models.Toys;
import view.display;


public class presenter{
    
    public static void Menu() throws IOException {

        LoteryBox<Toys> box = new LoteryBox<>();
        GamersList<Gamer> gamerList = new GamersList<>();
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        while (true){
            int a;
            // вывод меню лотереи
            display.showInfo("Выберите команду:\n"+
            "1. Добавить игрушку в лотерею\n"+
            "2. Добавить игрока\n"+
            "3. Сделать ход\n"+
            "4. Выход");
            if (in.hasNextInt()){
            a = in.nextInt();
            in.nextLine();
            
            if (a==1) // добавление игрушки в лотерею
            {
                ArrayList<Object> temp = view.toyView.getToyInfo();
                Toys toy = new Toys((int)temp.get(0), (String)(temp.get(1)), (int)temp.get(2), (double)temp.get(3), (String)temp.get(4));
                box.add(toy);
                box.sortBox();
                box.printBox(box);
                
            } 
            else if (a==2) //добавление игрока 
            {
                ArrayList<Object> temp = view.gamerView.getGamerInfo();
                Gamer gamer = new Gamer((int)temp.get(0), (String)(temp.get(1)));
                gamerList.add(gamer);

            }
            else if (a==3) // розыгрыш
            {
                int gamer_count; // номер игрока
                int size_box = box.getLength(box); //кол-во игрушек в ящике
                if ( size_box != 0) //проверка на наличие игрушек в лотерее 
                {
                    display.showInfo("Выберите ID игрока: ");
                    int size_gamerList = gamerList.getLength(gamerList);
                    if (size_gamerList!=0) //проверка на наличие игроков
                    {
                    gamerList.printList(gamerList);
                    gamer_count = in.nextInt();
                    }else{
                        display.showInfo("Список игороков пуст, сначала добавьте игрока");
                        continue;
                    }
                    // розыгрыш с рандомом
                    int move = rnd.nextInt(100);
                    for (Toys toy : box) {
                        if (move <= toy.getWeigh()){
                            display.showInfo(move);
                            String winner = String.format("Игрок под номером %d выйграл %s\n", gamer_count, toy.getName());
                            display.showInfo(winner);
                            display.showInfo("-----------------");
                            //уменьшение кол-ва игрушек в случае выйгрыша
                            if (toy.getCount()>1){
                                toy.setCount(toy.getCount()-1);
                            }else{
                                box.remove(toy);
                            }
                            // запись результата розыгрыша в файл
                            try (FileWriter writer = new FileWriter("winners.txt", true)){
                                String result = String.format("Игрок под номером %d выйграл %s", gamer_count, toy.getName());
                                writer.write(result +"\n");
                                
                            }
                            break;
                        }
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