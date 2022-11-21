package entities;

import elements.Circle;
import elements.Cross;
import javafx.scene.canvas.Canvas;

public class Game {

    private Player player;
    private AI ai = new AI();
    private Cross cross = new Cross();
    private Circle circle = new Circle();
    private Checker checker = new Checker();

    public Canvas canvas;
    public double sceneX;
    public double sceneY;
    public int id;

    public void setParametersField(Canvas canvasMain, Player playerMain, double x, double y, int playerId) {
        canvas = canvasMain;
        player = playerMain;
        sceneX = x;
        sceneY = y;
        id = playerId;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public Player getPlayer() {
        return player;
    }

    public double getSceneX() {
        return sceneX;
    }

    public double getSceneY() {
        return sceneY;
    }

    public int getId() {
        return id;
    }

    public void chooseCell(Canvas canvas, double x, double y, int id) {

        int edgeOneX = 150;
        int edgeTwoX = 250;
        int edgeThreeX = 350;
        int edgeFourX = 455;

        int edgeOneY = 66;
        int edgeTwoY = 166;
        int edgeThreeY = 266;
        int edgeFourY = 366;

        int cell = 0;


        if ((x > edgeOneX && x < edgeFourX) && (y > edgeOneY && y < edgeFourY)) {

            if ((x > edgeOneX && x < edgeTwoX) && (y > edgeOneY && y < edgeTwoY)) {
                cell = 1;
            }
            if ((x > edgeTwoX && x < edgeThreeX) && (y > edgeOneY && y < edgeTwoY)) {
                cell = 2;
            }
            if ((x > edgeThreeX && x < edgeFourX) && (y > edgeOneY && y < edgeTwoY)) {
                cell = 3;
            }
            if ((x > edgeOneX && x < edgeTwoX) && (y > edgeTwoY && y < edgeThreeY)) {
                cell = 4;
            }
            if ((x > edgeTwoX && x < edgeThreeX) && (y > edgeTwoY && y < edgeThreeY)) {
                cell = 5;
            }
            if ((x > edgeThreeX && x < edgeFourX) && (y > edgeTwoY && y < edgeThreeY)) {
                cell = 6;
            }
            if ((x > edgeOneX && x < edgeTwoX) && (y > edgeThreeY && y < edgeFourY)) {
                cell = 7;
            }
            if ((x > edgeTwoX && x < edgeThreeX) && (y > edgeThreeY && y < edgeFourY)) {
                cell = 8;
            }
            if ((x > edgeThreeX && x < edgeFourX) && (y > edgeThreeY && y < edgeFourY)) {
                cell = 9;
            }

            checker.blockCell(cell, id);
            logic(canvas, cell, id, checker);
        }
    }


    void logic(Canvas canvas, int cell, int id, Checker checker) {
        player.doMove(checker, canvas);
        ai.doMove(checker, canvas);
    }


}
