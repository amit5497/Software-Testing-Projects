package learning_java.lab012_AbstractInterface;

public class TataSafari extends Car {

    @Override
    public void musicPlayer(){
        System.out.println("Play Tata Safari music ");
    }

    @Override
    String start() {
        return "Test Safari";
    }




}
