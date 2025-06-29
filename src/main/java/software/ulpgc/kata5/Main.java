package software.ulpgc.kata5;

import software.ulpgc.kata5.control.EnterNewPokemonCommand;
import software.ulpgc.kata5.view.MainFrame;

public class Main {
    public static void main(String[] args){
        MainFrame mainFrame = new MainFrame();
        mainFrame.put("send", new EnterNewPokemonCommand(mainFrame));
        mainFrame.setVisible(true);
    }
}
