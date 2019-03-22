package com.example.curacao.miapp.DataBase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MiFareBaseInstanceIdService extends FirebaseInstanceIdService {
    public static final String TAG = "Noticias";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG, "Token " + token);
    }
}
