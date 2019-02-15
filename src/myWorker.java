public class myWorker extends Thread {
    Item item;
    public myWorker(Item item){
        this.item = item;
    }
    
    public void run (){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            
        }
        System.out.println(" I am a Worker, " + item.Print());
    }
}