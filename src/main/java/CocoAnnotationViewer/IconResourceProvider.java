package CocoAnnotationViewer;

import java.io.InputStream;
/**
 *
 * @author Sean Phillips
 */
public class IconResourceProvider {

    public static InputStream getResourceAsStream(String name) {
        return IconResourceProvider.class.getResourceAsStream(name);
    }

}
