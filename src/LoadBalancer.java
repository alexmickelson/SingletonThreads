import java.util.Vector;

public class Item {
    private static volatile Vector<Item> items;
    private static volatile int count;

    private Item(){
    }

    public static Item getItem(){
        if (count < 3){
            if (count == 0){
                synchronized (Item.class){
                    if (count == 0){
                        items = new Vector<Item>();

                    } else {
                        return uniqueInstance.getNextItem();
                    }
                }
            } else {

            }

        }

    }


    private Item getNextItem(){
        if (3count < ){
            var n = new Item(++count);
            items.add(n);
            return n;
        } else {
            return items.get((++count)%3);
        }
    }

}
