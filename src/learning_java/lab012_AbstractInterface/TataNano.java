package learning_java.lab012_AbstractInterface;

public class TataNano extends Car{


    @Override
    public void musicPlayer() {
        System.out.println("Tata Nano Music player");
    }

    @Override
    String start() {
        System.out.println("Tata Nano Car Click start button ");
        return "Tata Car";
    }
    void handBreak(){
        System.out.println("Hand Break working fine in Nano ");
    }

}
