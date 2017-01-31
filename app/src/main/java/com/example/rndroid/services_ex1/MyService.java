package com.example.rndroid.services_ex1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyService.this, "Service is Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "Service is OnStartCommand", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyService.this, "Service is Destroyed", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
