package czh.jcocoatouch.demo;

import android.content.Context;
import android.graphics.Canvas;

import apple.cocoatouch.ui.CocoaTouchView;
import apple.cocoatouch.ui.UIView;

/**
 * Created by czh0766 on 16/8/23.
 */
public class CustomView extends UIView {

    @Override
    public Class<? extends CocoaTouchView> layerClass() {
        return CustomViewLayer.class;
    }

    private static class CustomViewLayer extends CocoaTouchView {

        public CustomViewLayer(Context context) {
            super(context);

            //add the Android native view
        }
    }

}
