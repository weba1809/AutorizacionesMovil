package com.mobile.advance.autorizacionesmovil;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button cmdExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cmdExit=(Button)findViewById(R.id.btnsalir);
        cmdExit.setOnClickListener(salirclick);
    }

    View.OnClickListener salirclick = new View.OnClickListener() {
        public void onClick(View v) {

            AlertDialog.Builder builder = new AlertDialog.Builder(getApplication());

            builder.setTitle("Atencion");
            builder.setMessage("Esta seguro de salir de la aplicacion?");

            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }

            });

            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // I do not need any action here you might
                    dialog.dismiss();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
        }
    };
}
