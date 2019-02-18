public class main {
    public static void main(String[] args){
        Thread t;
        for(int i = 0; i < 10000; i++){
            t = new myWorker(i, Item.getItem());
            t.start();
        }

    }
}
