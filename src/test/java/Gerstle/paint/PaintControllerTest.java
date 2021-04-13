package Gerstle.paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaintControllerTest
{
    private PaintController controller;
    private Canvas canvas;
    private GraphicsContext graphics;
    private CheckBox eraserCheckbox;
    private TextField brushSize;
    private ColorPicker colorPic;
    private PaintCanvas paintCanvas;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void initialize()
    {
        //given
        givenPaintController();
        doReturn(graphics).when(canvas).getGraphicsContext2D();
        //when
        controller.initialize();
        //then
        verify(controller.brushSize).getText().equals("10");
    }

    @Test
    public void checkSize()
    {

    }
    private void givenPaintController()
    {
        controller = new PaintController();
        canvas = mock(Canvas.class);
        paintCanvas = mock(PaintCanvas.class);
        graphics = mock(GraphicsContext.class);
        eraserCheckbox = mock(CheckBox.class);
        brushSize = mock(TextField.class);
        controller.brushSize = brushSize;
        colorPic = mock(ColorPicker.class);
    }
}

