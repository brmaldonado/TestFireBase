package com.example.curacao.miapp.DataBase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

//FirebaseMesaagingService es el metodo que se ejecuta cuando recibimos un mensaje

public class MiFireBaseMessagingService  extends FirebaseMessagingService {

    public static final String TAG = "Noticias";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String from = remoteMessage.getFrom();
        Log.d(TAG, "Mensaje recibido de: " + from);


        if(remoteMessage.getNotification()!= null){
            Log.d(TAG, "Notificacion" + remoteMessage.getNotification().getBody());
        }
    }
}
