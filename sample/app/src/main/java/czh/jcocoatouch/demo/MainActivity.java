package czh.jcocoatouch.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import apple.cocoatouch.ui.CocoaTouchActivity;

public class MainActivity extends CocoaTouchActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UIApplicationMain(null, AppDelegate.class);

    }

}
