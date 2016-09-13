package czh.jcocoatouch.demo;

import android.util.Log;

import apple.cocoatouch.coregraphics.CGRect;
import apple.cocoatouch.foundation.NSObject;
import apple.cocoatouch.ui.UIApplication;
import apple.cocoatouch.ui.UIApplicationDelegate;
import apple.cocoatouch.ui.UINavigationController;
import apple.cocoatouch.ui.UIScreen;
import apple.cocoatouch.ui.UIViewController;
import apple.cocoatouch.ui.UIWindow;

/**
 * Created by czh0766 on 16/8/22.
 */
public class AppDelegate extends NSObject implements UIApplicationDelegate {


    @Override
    public void applicationDidFinishLaunching(UIApplication uiApplication) {

        CGRect bounds = UIScreen.mainScreen().boundsExcludeStatusBar();

        UIWindow window = new UIWindow(bounds);
        window.makeKeyAndVisible();

        UIViewController root = new RootViewController();
        UINavigationController navi = new UINavigationController(root);

        window.setRootViewController(navi);

    }

    @Override
    public void applicationDidBecomeActive(UIApplication uiApplication) {

    }

    @Override
    public void applicationWillResignActive(UIApplication uiApplication) {

    }

    @Override
    public void applicationWillEnterForeground(UIApplication uiApplication) {

    }

    @Override
    public void applicationDidEnterBackground(UIApplication uiApplication) {

    }
}
