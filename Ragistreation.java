package patel.giftshoppy11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Ragistreation extends AppCompatActivity {
    TextView t1, t2, t3;
    EditText edt1, edt2, edt3, edt4, edt5, edt6;
    Button b1;
    Spinner spinner;
    String city[] = {"select city", "rajkot", "baroda", "surat", "ahemdabad", "jamnagar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragistreation);
        spinner = findViewById(R.id.s1);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        edt6 = findViewById(R.id.edt6);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname = edt1.getText().toString();
                String lname = edt2.getText().toString();
                String email = edt3.getText().toString();
                String number = edt4.getText().toString();
                String password = edt5.getText().toString();
                String cpassword = edt6.getText().toString();

                if (fname.length() == 0 && lname.length() == 0 && email.length() == 0 && number.length() == 0 && password.length() == 0 && cpassword.length() == 0) {
                    edt1.setError("Please enter your First Name");
                    edt2.setError("Please enter your Last Name");
                    edt3.setError("Please enter your Email");
                    edt4.setError("Please enter your Phone number");
                    edt5.setError("Please enter your password");
                    edt6.setError("Please enter your Confirm password");
                } else if (fname.length() == 0) {
                    edt1.setError("Please enter your First Name");
                } else if (lname.length() == 0) {
                    edt2.setError("Please enter your Last Name");
                } else if (email.length() == 0) {
                    edt3.setError("Please enter your Email");
                } else if (number.length() == 0) {
                    edt4.setError("Please enter your Phone number");
                } else if (password.length() == 0) {
                    edt5.setError("Please enter your Password");
                } else if (cpassword.length() == 0) {
                    edt6.setError("Please enter your Confirm password");
                } else
                {
                    if (fname.equals("Darshan") && lname.equals("Marviya") && email.equals("d5145@gmail.com") && number.equals("9714537484") && password.equals("200801138") && cpassword.equals("200801138") )
                    {
                        Toast.makeText(Ragistreation.this, "Success", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(Ragistreation.this, dashbord.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Ragistreation.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                    }
                }


                ArrayAdapter arrayAdapter = new ArrayAdapter(Ragistreation.this, android.R.layout.simple_spinner_dropdown_item, city);
                spinner.setAdapter(arrayAdapter);

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        Toast.makeText(Ragistreation.this, "your selected city is " + city[i], Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

            }
        });
    }
}