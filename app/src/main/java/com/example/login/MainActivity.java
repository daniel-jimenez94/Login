package com.example.login;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BasicToast(View view) {
        Context context = getApplicationContext();
        CharSequence text ="Bienvenido";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText( context, text, duration);

        Context context2 = getApplicationContext();
        CharSequence text2 = ("Intentalo de nuevo") ;
        int duration2 = Toast.LENGTH_SHORT;

        Toast toast2 = Toast.makeText (context2, text2, duration2);

        String usuario = ((EditText) findViewById(R.id.user)).getText().toString();
        String password = ((EditText) findViewById(R.id.contra)).getText().toString();

        if (usuario.equals("root") && password.equals("admin")){
            toast.show();
        }
        else{
            toast2.show();
        }



    }

}
