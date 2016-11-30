package konox.di_evaluacioninicial;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.View;

/**
 * Created by konox on 30/11/2016.
 */

public class mainController implements View.OnClickListener {
    MainActivity vista;
    public  mainController(MainActivity vista){
        this.vista=vista;
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == vista.btnCambiarColor.getId()){
            vista.relativeLayout.setBackgroundColor(Color.parseColor("#5ec466"));
        } else if (view.getId() == vista.btnOcultar.getId()){
            vista.imgView.setVisibility(View.INVISIBLE);
        } else if (view.getId() == vista.btnFinalizar.getId()){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(vista);
            builder1.setMessage("La aplicacion se va ha cerrar");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            System.exit(0);
                        }
                    });

            builder1.setNegativeButton(
                    "Cancelar",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();

        }

        if (view.getId() == vista.btnCambiarImg.getId()){
            vista.imgView.setImageResource(R.drawable.android);
        }

    }
}
