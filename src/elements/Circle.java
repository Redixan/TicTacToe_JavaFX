package elements;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;


public class Circle {

    public Circle() {

    }
    

    public void drawCircle(Canvas canvas, int cell) {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        
        switch (cell) {
            case 1 -> {
                graphicsContext.strokeOval(15, 15, 70, 70);
            }
            case 2 -> {
                graphicsContext.strokeOval(115, 15, 70, 70);
            }
            case 3 -> {
                graphicsContext.strokeOval(215, 15, 70, 70);
            }
            case 4 -> {
                graphicsContext.strokeOval(15, 115, 70, 70);
            }
            case 5 -> {
                graphicsContext.strokeOval(115, 115, 70, 70);
            }
            case 6 -> {
                graphicsContext.strokeOval(215, 115, 70, 70);
            }
            case 7 -> {
                graphicsContext.strokeOval(15, 215, 70, 70);
            }
            case 8 -> {
                graphicsContext.strokeOval(115, 215, 70, 70);
            }
            case 9 -> {
                graphicsContext.strokeOval(215, 215, 70, 70);
            }
        }

    }

}
