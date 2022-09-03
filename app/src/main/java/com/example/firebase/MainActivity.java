package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button mandar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mandar=findViewById(R.id.item3);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
      getMenuInflater().inflate(R.menu.menu,menu);
      return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int num=item.getItemId();
        if(num==R.id.item1)
        {
             Toast.makeText(this,"estoy en el item1",Toast.LENGTH_SHORT).show();

        }
        int num2=item.getItemId();
        if(num2==R.id.item2)
        {
            Toast.makeText(this,"estoy en el item2",Toast.LENGTH_SHORT).show();

        }
        int num3=item.getItemId();
        if(num3==R.id.item3)
        {
            Toast.makeText(this,"estoy en el item3",Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
    public void Mandar(View view)
    {
       Intent otrapag = new Intent( this,Menu_Despegable.class);
       startActivity(otrapag);
    }
}