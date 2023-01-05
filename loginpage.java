package patel.giftshoppy11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
    EditText o2, o3;
    Button btn1,bn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        btn1 = findViewById(R.id.btn1);
        bn2 = findViewById(R.id.bn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String Num=o2.getText().toString();
                String pass=o3.getText().toString();

                if(Num.length()==0 && pass.length()==0)
                {
                    o2.setError("Please enter your Mobile Number");
                    o3.setError("please enter your Password");
                }
                else if(Num.length()==0)
                {
                    o2.setError("Please enter your Mobile Number");
                }
                else if(pass.length()==0)
                {
                    o3.setError("please enter your Password");
                }
                else
                {
                    if(Num.equals("9714537484") && pass.equals("200801138"))
                    {
                        Toast.makeText(loginpage.this, "Success", Toast.LENGTH_SHORT).show();

                        Intent i =new Intent(loginpage.this,Ragistreation.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(loginpage.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });
        bn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(loginpage.this, Ragistreation.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder alter = new AlertDialog.Builder(loginpage.this);
        alter.setTitle("Do you want to close this app ?");
        alter.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                finishAffinity();
            }
        });
        alter.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alter.show();
    }
}
