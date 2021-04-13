package Gerstle.paint;

import javafx.scene.control.TextField;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PaintControllerTest
{
    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void initialize()
    {
        PaintController controller = new PaintController();
        controller.brushSize = mock(TextField.class);
//        brushSize.setText("10");
        controller.initialize();
        verify(controller.brushSize).getText().equals("10");
    }

    @Test
    public void checkSize()
    {

    }
//    private void givenPaintController()
//    {
//        controller = new PaintController();
//        canvas = mock(PaintCanvas.class);
//        eraserCheckbox = mock(CheckBox.class);
//        brushSize = mock(TextField.class);
//        controller.brushSize = brushSize;
//        colorPic = mock(ColorPicker.class);
//        clearAll = mock(Button.class);
//    }
}

