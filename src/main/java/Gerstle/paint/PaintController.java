package Gerstle.paint;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PaintController
{
    @FXML
    private Canvas canvas;
    @FXML
    private ColorPicker colorPic;
    @FXML
    private Button LineButton;
    @FXML
    private CheckBox EraseCheckBox;
    @FXML
    private Text brushSizeText;

    public void initialize()
    {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        canvas.setOnMouseDragged(event ->
        {
            double size = checkSize(brushSizeText.getText());
            brushSizeText.setText(Double.toString(size));
            double x = event.getX() - size/2;
            double y = event.getY() - size/2;

            if(EraseCheckBox.isSelected())
            {
                graphics.clearRect(x, y, size, size);
            }
            else
            {
                graphics.setFill(colorPic.getValue());
                graphics.fillRect(x, y, size, size);
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
