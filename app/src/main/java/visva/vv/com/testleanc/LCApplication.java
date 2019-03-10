package visva.vv.com.testleanc;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

public class LCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this,"HFDOKHhkgvUWMrf8ErkOt5kL-gzGzoHsz",
                "fTzSnKOibMElBfRFvany3Mz8");
        AVOSCloud.setDebugLogEnabled(true);
    }
}
