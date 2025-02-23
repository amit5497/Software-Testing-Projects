package learning_java.lab012_AbstractInterface;

public class Main {

    public static void main(String args[]){
        TataSafari tsafari = new TataSafari();
        tsafari.musicPlayer();

        tsafari.stop();


        TataNano tnano =new TataNano();
        tnano.musicPlayer();
         tnano.start();

         tnano.handBreak();



    }
}
