
import ij.IJ;
import ij.plugin.PlugIn;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Riyafas
 */
public class Test_Plugin implements PlugIn{

    @Override
    public void run(String string) {
        //IJ.showMessage("This is the StackRegPlus plugin");
        test();
    }
    public static void main(String[] args) {
        new ij.ImageJ();
        new Test_Plugin().run("");
    }
    
    public void test(){
        Object maxima_imageJ=IJ.runPlugIn("Maxima_ImageJ", null);
        Object maxima_connect=IJ.runPlugIn("Maxima_Connect", null);
        try {
            Method method = maxima_connect.getClass().getMethod("startMaxima",
                    (Class[])null);
        } catch (NoSuchMethodException ex) {
            System.err.println(ex);
        } catch (SecurityException ex) {
            System.err.println(ex);
        }
    }
}
