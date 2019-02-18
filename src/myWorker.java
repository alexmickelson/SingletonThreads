public class myWorker extends Thread {
    Item item;
    int id;
    public myWorker(int id, Item item){
        this.item = item;
        this.id = id;
    }
    
    public void run (){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            
        }
        System.out.println(" I am a Worker " + id + " " + item.Print());
        System.out.flush();
    }
}