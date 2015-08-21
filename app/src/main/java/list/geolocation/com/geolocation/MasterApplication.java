package list.geolocation.com.geolocation;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by rajendhiran on 8/12/2015.
 */
public class MasterApplication extends Application {

    private static MasterApplication masterApplication;
    private RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        mRequestQueue = Volley.newRequestQueue(this);
        masterApplication = this;
    }

    public synchronized static MasterApplication getMasterApplication() {
        return masterApplication;
    }

    public RequestQueue getmRequestQueue() {
        return mRequestQueue;
    }
}
