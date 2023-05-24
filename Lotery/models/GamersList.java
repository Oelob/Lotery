package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GamersList<Gamer> implements Iterable<Gamer> {

    private List<Gamer> gamerList = new ArrayList<>();

    public void add(Gamer gamer){
        gamerList.add(gamer);
    }

    public void remove(Gamer el){
        gamerList.remove(el);
    }
    public int getLength(GamersList<Gamer> arr){
        int result = 0;
        for (Gamer toy : arr){
            result++;
        }
        return result;
        
    }

   

    public void printList(GamersList<Gamer> arr){
        for (Gamer gamer : arr) {
            System.out.println(gamer);
            System.out.println("===============");
        }
    }
    @Override
    public Iterator<Gamer> iterator() {
        return new CustomIterator<Gamer>(gamerList);
    }
    public class CustomIterator<T> implements Iterator<T>{
        int current_pos = 0; 
        List<T> temp_list;

        public CustomIterator(List<T> gamerList) {
            this.temp_list = gamerList;

        }
        @Override
        public boolean hasNext() {
            if (temp_list.size() >= current_pos+1){
                return true;
            }
            return false;
        }
        
        @Override
        public T next() {
            T value = temp_list.get(current_pos);
            current_pos++;
            return value;
        }
    }
}
