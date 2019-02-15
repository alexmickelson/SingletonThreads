public class Item {

    private final int id;

    public Item (int id){
        this.id = id;
    }

    public String Print(){
        return "I am Item " + id;
    }
}
