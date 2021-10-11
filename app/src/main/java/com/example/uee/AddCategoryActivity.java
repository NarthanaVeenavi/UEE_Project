package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddCategoryActivity extends AppCompatActivity {

    private CircleImageView chocolate, shaped_cakes, x_mas_cakes, heart;
    private CircleImageView kids_cakes, flowers, weddings, smiley;
    private CircleImageView picture_cakes, cheese, layer_cake, sponge_cakes;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);



        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AddCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AddCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
//                Intent intent = new Intent(AddCategoryActivity.this, AdminNewOrdersActivity.class);
//                startActivity(intent);
            }
        });

        chocolate = (CircleImageView) findViewById(R.id.chocolate);
        shaped_cakes = (CircleImageView) findViewById(R.id.shaped_cakes);
        x_mas_cakes = (CircleImageView) findViewById(R.id.x_mas_cakes);
        heart = (CircleImageView) findViewById(R.id.heart);

        kids_cakes = (CircleImageView) findViewById(R.id.kids_cakes);
        flowers = (CircleImageView) findViewById(R.id.flowers);
        weddings = (CircleImageView) findViewById(R.id.weddings);
        smiley = (CircleImageView) findViewById(R.id.smiley);

        picture_cakes = (CircleImageView) findViewById(R.id.picture_cakes);
//        cheese = (CircleImageView) findViewById(R.id.cheese);
//        layer_cake = (CircleImageView) findViewById(R.id.layer_cake);
//        sponge_cakes = (CircleImageView) findViewById(R.id.sponge_cakes);

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "chocolate_cakes");
                startActivity(intent);
            }
        });

        shaped_cakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "shaped_cakes");
                startActivity(intent);
            }
        });

        x_mas_cakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "x_mas_cakes");
                startActivity(intent);
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "heart_cakes");
                startActivity(intent);
            }
        });

        kids_cakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "kids_cakes");
                startActivity(intent);
            }
        });

        flowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "flower_cakes");
                startActivity(intent);
            }
        });

        weddings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "wedding_cakes");
                startActivity(intent);
            }
        });

        smiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "smiley_cakes");
                startActivity(intent);
            }
        });

        picture_cakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "picture_cakes");
                startActivity(intent);
            }
        });

//        cheese.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
//                intent.putExtra("category", "cheese_cakes");
//                startActivity(intent);
//            }
//        });
//
//        layer_cake.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
//                intent.putExtra("category", "layered_cakes");
//                startActivity(intent);
//            }
//        });
//
//        sponge_cakes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(AddCategoryActivity.this, AddNewProductActivity.class);
//                intent.putExtra("category", "sponge_cakes");
//                startActivity(intent);
//            }
//        });
    }
}