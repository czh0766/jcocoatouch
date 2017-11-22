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
# Custom View
- You can just create your own view that inherit form **UIView**, and override **drawRect** method.
```java
public class CustomView extends UIView {

    @Override
    public void drawRect(Canvas canvas) {
        //todo
    }
    
}
```
- If you want to use Android native view, you should overrid **layerClass** method, and create the layer that inherit form **CocoaTouchView**.
```java
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
```
# Proguard
jcocoatouch uses some reflection functions, so you should specific keep options for it when proguard your app.
```java
-keep public class apple.cocoatouch.**{
    public *;
}

-keepclassmembers class * {
    void *(apple.cocoatouch.foundation.NSSender);
    void *(apple.cocoatouch.foundation.NSNotification);
    void *(apple.cocoatouch.ui.UIGestureRecognizer);
    void *(apple.cocoatouch.ui.UIMenuItem);
}

-keepclassmembers class * extends apple.cocoatouch.ui.CocoaTouchView {
    public <init>(android.content.Context);
}

-keep class * implements apple.cocoatouch.foundation.NSCoding {

}
```

# History
We have migrated MindLine(https://itunes.apple.com/us/app/mindline/id1025462912?mt=8), the popular iOS app to the Android platform based on jcocoatouch. You can download it on http://fir.im/968p or other Android markets.

# Contact
If any question or suggestion, please contact us with e-mail czh0766@163.com, or QQ 452527750. Thanks!

# Updates
- **0.9.2** (2017.11.22)
    It's long time to update with many improvements and bug fixes.
    
- **0.9.1** (2016.09.13)
    - Supports nib file loading to build complex views.
    - The **ScrollView** could be decelerated and zoomed in or out.
    - The **NSObject** supports **setValueForKey** and **valueForKey** methods. 
    - The **UIView** adds **multipleTouchEnabled** and **userData** properties.
    - The **UIImage** implements **NSCoding**.
    - The selector methods should be kept public and not proguard.
    
