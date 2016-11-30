package konox.di_evaluacioninicial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public mainController Controller;
    public Button btnCambiarImg;
    public Button btnCambiarColor;
    public Button btnOcultar;
    public Button btnEliminarImg;
    public Button btnCambiarTxt;
    public Button btnMostrar;
    public Button btnFinalizar;;
    public TextView txtTitle;
    public ImageView imgView;
    public RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controller = new mainController(this);

        btnCambiarImg=(Button) this.findViewById(R.id.btCambiarImg);
        btnCambiarColor=(Button) this.findViewById(R.id.btCambiarCLR);
        btnOcultar=(Button) this.findViewById(R.id.bt_Ocul);
        btnEliminarImg=(Button) this.findViewById(R.id.btDelImg);
        btnCambiarTxt=(Button) this.findViewById(R.id.btCambiarTxt);
        btnMostrar=(Button) this.findViewById(R.id.btMostar);
        btnFinalizar=(Button) this.findViewById(R.id.btFinalizar);
        txtTitle=(TextView) this.findViewById(R.id.textView_Title);
        imgView = (ImageView) this.findViewById(R.id.imgView);
        relativeLayout = (RelativeLayout) this.findViewById(R.id.activity_main);

        btnCambiarColor.setOnClickListener(Controller);
        btnOcultar.setOnClickListener(Controller);
        btnCambiarImg.setOnClickListener(Controller);
        btnFinalizar.setOnClickListener(Controller);
    }
}
