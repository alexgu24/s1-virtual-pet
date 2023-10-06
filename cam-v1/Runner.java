import javax.swing.*;

public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();
        p.exercise();

    }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            "Your Message",
            "Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

         public void takeABeat (int milliseconds) {
            try {
                Thread.sleep(1000); //milliseconds
        }   catch(Exception e){
        
        }
        }

    public static void main(String[] args) {
        VirtualPet p = new VirtualPet();
        p.exercise();
    }
}