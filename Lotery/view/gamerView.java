package view;

import java.util.ArrayList;
import java.util.Scanner;

public class gamerView {
    
    public static ArrayList<Object> getGamerInfo(){
        ArrayList<Object> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ID игрока: ");
        int id = scan.nextInt();
        scan.nextLine();
        result.add(id);
        System.out.println("Введите имя игрока: ");
        String name = scan.nextLine();
        result.add(name);
        return result;
    }
}
