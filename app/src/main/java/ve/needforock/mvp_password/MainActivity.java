package ve.needforock.mvp_password;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements VerificationCallBack{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.validationTv);
        final EditText editText = (EditText) findViewById(R.id.inputEt);
        Button button = (Button) findViewById(R.id.resultBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new PasswordVerification(MainActivity.this).Verification(String.valueOf(editText.getText()));

            }
        });

    }

    @Override
    public void PasswordVerification(String value) {
        textView.setText(value);
    }

    @Override
    public void BlankInput() {
        textView.setText("Debe ingresar un password");
    }
}
