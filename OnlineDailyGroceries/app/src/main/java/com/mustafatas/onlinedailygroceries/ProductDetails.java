package com.mustafatas.onlinedailygroceries;

import static com.mustafatas.onlinedailygroceries.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView img, back;
    TextView proName, proPrice, proDesc;
    String name, price, desc;
    int image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_product_details);

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", drawable.b1);
        price = i.getStringExtra("price");
        desc = i.getStringExtra("desc");

        proName = findViewById(id.productName);
        proDesc = findViewById(id.prodDesc);
        proPrice = findViewById(id.prodPrice);
        img = findViewById(id.big_image);
        back = findViewById(id.back);


        proName.setText(name);
        proPrice.setText(price);
        proDesc.setText(desc);

        img.setImageResource(image);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProductDetails.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
}