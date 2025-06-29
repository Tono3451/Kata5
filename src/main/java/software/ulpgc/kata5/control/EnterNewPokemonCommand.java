package software.ulpgc.kata5.control;

import software.ulpgc.kata5.view.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import static com.google.gson.internal.bind.TypeAdapters.URI;

public class EnterNewPokemonCommand implements Command {
    private MainFrame mainFrame;

    public EnterNewPokemonCommand(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void execute() {
        /*
        String pokemon = mainFrame.getTextInput();
        mainFrame.updatePokemonInfo(pokemon, stringToImageIcon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"));
         */
    }

    private ImageIcon stringToImageIcon(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage bufferedImage = ImageIO.read(url);

            if (bufferedImage == null) {
                return null;
            }

            Image scaledImage = bufferedImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
