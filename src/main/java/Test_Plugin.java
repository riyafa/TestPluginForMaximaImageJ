
import ij.plugin.PlugIn;

/**
 *
 * @author Riyafas
 */
public class Test_Plugin implements PlugIn {

    @Override
    public void run(String string) {
        //IJ.showMessage("This is the StackRegPlus plugin");
      new Maxima_ImageJ_UI().start();
    }

    public static void main(String[] args) {
        new ij.ImageJ();
        new Test_Plugin().run("");
    }
}
