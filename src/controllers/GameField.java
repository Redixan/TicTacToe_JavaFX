package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Game;
import entities.Player;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class GameField {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelTextCoordination;

    @FXML
    private Canvas canvas;

    private Game game = new Game();
    private Player player = new Player();
    private int playerId;

    @FXML
    void initialize() {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        fieldInitialize(graphicsContext);
    }


    public void seeLocationMouse(javafx.scene.input.MouseEvent mouseEvent) {
        Double x = mouseEvent.getSceneX();
        Double y = mouseEvent.getSceneY();


        String string = x.toString() + "  " + y.toString();
        labelTextCoordination.setText(string);
    }

    public void fieldInitialize(GraphicsContext graphicsContext) {
        graphicsContext.strokeRect(1, 1, 298, 298);
        graphicsContext.strokeRect(0, 100, 300, 100);
        graphicsContext.strokeRect(100, 0, 100, 300);
    }

    public void gameplay(MouseEvent mouseEvent) {

        playerId = Player.getID;
        game.setParametersField(canvas, player, mouseEvent.getSceneX(), mouseEvent.getSceneY(), playerId);

    }



}
