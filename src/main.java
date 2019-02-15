public class main {
    public static void main(String[] args){
        Thread t;
        for(int i = 0; i < 1000; i++){
            t = new myWorker(Item.getItem());
            t.start();
        }

    }
}
