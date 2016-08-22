package czh.jcocoatouch.demo;

import apple.cocoatouch.coregraphics.CGRect;
import apple.cocoatouch.ui.UIColor;
import apple.cocoatouch.ui.UIFont;
import apple.cocoatouch.ui.UILabel;
import apple.cocoatouch.ui.UITextAlignment;
import apple.cocoatouch.ui.UIViewController;

/**
 * Created by czh0766 on 16/8/22.
 */
public class RootViewController extends UIViewController {

    @Override
    protected void viewDidLoad() {
        super.viewDidLoad();

        setTitle("JCocoaTouchDemo");

        UILabel label = new UILabel(new CGRect(0, 0, 200, 50));
        label.setTextAlignment(UITextAlignment.Center);
        label.setFont(UIFont.boldSystemFontOfSize(20));
        label.setTextColor(UIColor.redColor);
        label.setBackgroundColor(UIColor.yellowColor);

        label.setText("Hello World !");

        view().addSubview(label);
    }
}
