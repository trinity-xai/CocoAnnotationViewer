package CocoAnnotationViewer;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

/**
 * @author Sean Phillips
 */
public class ImageEvent extends Event {

    public Object object;

    public static final EventType<ImageEvent> NEW_COCO_ANNOTATION = new EventType(ANY, "NEW_COCO_ANNOTATION");
    public static final EventType<ImageEvent> CLEAR_COCO_ANNOTATIONS = new EventType(ANY, "CLEAR_COCO_ANNOTATIONS");
    public static final EventType<ImageEvent> SELECT_COCO_IMAGE = new EventType(ANY, "SELECT_COCO_IMAGE");
    public static final EventType<ImageEvent> SELECT_COCO_BBOX = new EventType(ANY, "SELECT_COCO_BBOX");
    public static final EventType<ImageEvent> SELECT_COCO_SEGMENTATION = new EventType(ANY, "SELECT_COCO_SEGMENTATION");

    public ImageEvent(EventType<? extends Event> arg0) {
        super(arg0);
    }

    public ImageEvent(EventType<? extends Event> arg0, Object arg1) {
        this(arg0);
        object = arg1;
    }

    public ImageEvent(Object arg0, EventTarget arg1, EventType<? extends Event> arg2) {
        super(arg0, arg1, arg2);
        object = arg0;
    }
}
