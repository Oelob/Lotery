package view;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class toyView {
    
    // public static String[] getToyInfo(){
        
    //     String[] result = new String [4] ;
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Введите ID игрушки: ");
    //     String id = in.nextLine();
    //     result[0] = id;
    //     System.out.println("Введите название игрушки: ");
    //     String name = in.nextLine();
    //     result[1] = name;
    //     System.out.println("Введите количество игрушек: ");
    //     String count = in.nextLine();
    //     result[2] = count;
    //     System.out.println("Введите вероятность выпадения игрушки: ");
    //     String weigh = in.nextLine();
    //     result[3] = weigh;
    //     System.out.println("Введите категорию игрушки: ");
    //     String category = in.nextLine();
    //     result[4] = category;
    //     in.close();

    //     return result;
    // }

    // public HashMap<String, Object> getToyInfo(){
        
    //     HashMap<String, Object> result = new HashMap<>();
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Введите ID игрушки: ");
    //     String id = in.nextLine();

        
        
    //     return null;
        
    // }

    public static ArrayList<Object> getToyInfo(){
        ArrayList<Object> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ID игрушки: ");
        int id = scan.nextInt();
        scan.nextLine();
        result.add(id);
        System.out.println("Введите название игрушки: ");
        String name = scan.nextLine();
        result.add(name);
        System.out.println("Введите количество игрушек: ");
        int count = scan.nextInt();
        result.add(count);
        System.out.println("Введите вероятность выпадения игрушки: ");
        double weigh = scan.nextDouble();
        scan.nextLine();
        result.add(weigh);
        System.out.println("Введите категорию игрушки: ");
        String category = scan.nextLine();
        result.add(category);
        // scan.close();
    

        return result;
    }
}
