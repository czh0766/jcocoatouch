# jcocoatouch
Develop Android Apps with iOS API ! The library includes **foundation**, **ui** and **coregraphics** packages, that is easy to migrate iOS app to the Android platform. If you are familiar with iOS development, and new to Android or dislike it, jcocoatouch is your best solution.

# Usage
- Import the jcocoatouch aar package to your project in Android Studio.
- Change the theme of application to be **@style/Theme.AppCompat.NoActionBar** in the AndroidManifest.xml.
- Let your main activity inherit from **CocoaTouchActivity**, and invoke **UIApplicationMain** method when activity created.
```java
public class MainActivity extends CocoaTouchActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIApplicationMain(null, AppDelegate.class);
    }

}
```
- Create a app delegate that inherit from **UIApplicationDelegate**. Now you can use the iOS API to write your android app !
```java
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

    ...
}
```
