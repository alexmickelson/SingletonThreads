import java.util.Vector;

public class Item {
    private static volatile Vector<Item> items;
    private static volatile int count;
    private int id;

    private Item(int id){
        this.id = id;
    }

    public static Item getItem(){
        if (count == 0){ 
            synchronized (Item.class){
                if (count == 0){
                    items = new Vector<Item>();
                    return getNextItem();
                } 
            }
        } 
        synchronized(Item.getNextItem()){
            return getNextItem();
        }

    }


    private static Item getNextItem(){
        if (count < 3){
            var n = new Item(++count);
            items.add(n);
            return n;
        } else {
            return items.get((++count)%3);
        }
    }

    public String Print(){
        return "I am item #" + id;
    }

}
