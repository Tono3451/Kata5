package software.ulpgc.kata5.control;

import software.ulpgc.kata5.view.MainFrame;

import javax.swing.*;
import java.awt.*;

public class EnterNewPokemonCommand implements Command {
    private MainFrame mainFrame;

    public EnterNewPokemonCommand(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void execute() {
        /*
        String pokemon = mainFrame.getTextInput();
        mainFrame.updatePokemonInfo(pokemon, stringToImageIcon());
         */
    }

    private ImageIcon stringToImageIcon(String png) {
        try {
            ImageIcon originalIcon = new ImageIcon(png);
            if (originalIcon.getIconWidth() == -1) {
                return null;
            }

            Image image = originalIcon.getImage();
            Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
