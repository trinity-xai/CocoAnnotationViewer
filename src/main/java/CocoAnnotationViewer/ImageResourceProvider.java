package CocoAnnotationViewer;

import java.io.InputStream;
import java.net.URL;
/**
 *
 * @author Sean Phillips
 */
public class ImageResourceProvider {

    public static InputStream getResourceAsStream(String name) {
        return ImageResourceProvider.class.getResourceAsStream(name);
    }

    public static URL getResource(String name) {
        return ImageResourceProvider.class.getResource(name);
    }

}
