package Gerstle.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintController
{
    @FXML
    CheckBox eraserCheckbox;
    @FXML
    TextField brushSize;
    @FXML
    ColorPicker colorPic;
    @FXML
    Button clearAll;
    @FXML
    PaintCanvas paintCanvas;

    public void initialize()
    {
        GraphicsContext graphics = paintCanvas.getGraphicsContext2D();

        paintCanvas.setOnMouseDragged(event ->
        {
            double size = checkSize(brushSize.getText());
            brushSize.setText(Double.toString(size));
            double x = event.getX() - size/2;
            double y = event.getY() - size/2;

            if(eraserCheckbox.isSelected())
            {
                graphics.clearRect(x, y, size, size);
            }
            else
            {
                graphics.setFill(colorPic.getValue());
                graphics.fillRoundRect(x, y, size, size, size, size);
            }
        });
    }
    public double checkSize(String size)
    {
        try
        {
            return Double.parseDouble(size);
        }
        catch(Exception e)
        {
            return 10;
        }
    }
}
