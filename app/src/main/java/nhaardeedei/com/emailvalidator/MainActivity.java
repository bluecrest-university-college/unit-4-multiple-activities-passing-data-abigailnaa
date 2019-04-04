package nhaardeedei.com.emailvalidator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    Button enter;
    TextView result;
    TableLayout activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = new TableLayout(this);





        email = new EditText(this);
        email.setHint("Please enter your email");


        result = new TextView(this);

        enter = new Button(this);
        enter.setText("Validate");

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmail = email.getText().toString();
                if (enteredEmail.contains("@")){
                    result.setText("VALID");
                }else{
                    result.setText("INVALID");
                }
            }
        });



        activity.addView(email);
        activity.addView(result);
        activity.addView(enter);


        setContentView(activity);




    }
}
