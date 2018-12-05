package monopoly.vue.partieclassique.action;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 * Created by maxim on 03/12/2018.
 */
public class PanelActionLabel extends Label {

    public PanelActionLabel(String text, double size) {

        // Paramètres du label de prix
        this.setPrefWidth(200);
        this.setPrefHeight(50);
        this.setText(text);
        this.setFont(new Font("System", size));
        this.setAlignment(Pos.TOP_CENTER);
        this.setTextAlignment(TextAlignment.CENTER);
        this.setWrapText(true);

    }

    public PanelActionLabel() {
        this("", 20);
    }

}
