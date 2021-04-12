package Gerstle.paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * Sets up a canvas for the paint app
 */
public class PaintCanvas extends Canvas
{
    Canvas canvas = new Canvas(1600, 900);

    public void clear ()
    {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 900, getWidth(), getHeight());
    }
}
