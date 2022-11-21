package elements;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Cross {

    public Cross() {
    }


    public void drawCross(Canvas canvas, int cell) {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        switch (cell) {
            case 1 -> {
                graphicsContext.strokeLine(15, 15, 85, 85);
                graphicsContext.strokeLine(15, 85, 85, 15);
            }
            case 2 -> {
                graphicsContext.strokeLine(115, 15, 185, 85);
                graphicsContext.strokeLine(115, 85, 185, 15);
            }
            case 3 -> {
                graphicsContext.strokeLine(215, 15, 285, 85);
                graphicsContext.strokeLine(215, 85, 285, 15);
            }
            case 4 -> {
                graphicsContext.strokeLine(15, 115, 85, 185);
                graphicsContext.strokeLine(15, 185, 85, 115);
            }
            case 5 -> {
                graphicsContext.strokeLine(115, 115, 185, 185);
                graphicsContext.strokeLine(115, 185, 185, 115);
            }
            case 6 -> {
                graphicsContext.strokeLine(215, 115, 285, 185);
                graphicsContext.strokeLine(215, 185, 285, 115);
            }
            case 7 -> {
                graphicsContext.strokeLine(15, 215, 85, 285);
                graphicsContext.strokeLine(15, 285, 85, 215);
            }
            case 8 -> {
                graphicsContext.strokeLine(115, 215, 185, 285);
                graphicsContext.strokeLine(115, 285, 185, 215);
            }
            case 9 -> {
                graphicsContext.strokeLine(215, 215, 285, 285);
                graphicsContext.strokeLine(215, 285, 285, 215);
            }
        }

    }

}
