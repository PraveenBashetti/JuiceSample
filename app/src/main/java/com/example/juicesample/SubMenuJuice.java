package com.example.juicesample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubMenuJuice extends AppCompatActivity implements ProductAdapter.CallBackUs, ProductAdapter.HomeCallBack {

    public static ArrayList<ProductModel> arrayList = new ArrayList<>();
    public static int cart_count = 0;
    ProductAdapter productAdapter;
    RecyclerView productRecyclerView;
    int key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu_activity_main);
        Bundle extra=getIntent().getExtras();

        if(extra!=null)
        {
            key=extra.getInt("type");
        }
        switch (key) {
            case 1:
                addJuiceProduct();
                break;
            case 2:
                addMilkShake();
                break;
        }
        productAdapter = new ProductAdapter(arrayList, this,  this);
        productRecyclerView = findViewById(R.id.product_recycler_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1, LinearLayoutManager.VERTICAL, false);
        productRecyclerView.setLayoutManager(gridLayoutManager);
        productRecyclerView.setAdapter(productAdapter);

    }

    private void addMilkShake() {
        ProductModel productModem = new ProductModel("Chikoo", "60", "20", R.drawable.apple);
        arrayList.add(productModem);
        ProductModel productModem1 = new ProductModel("Apple", "60", "10", R.drawable.orange);
        arrayList.add(productModem1);
        ProductModel productModem2 = new ProductModel("Rose", "60", "10", R.drawable.grape);
        arrayList.add(productModem2);
        ProductModel productModem3 = new ProductModel("Vanilla", "60", "20", R.drawable.pineapple);
        arrayList.add(productModem3);
        ProductModel productModelm2 = new ProductModel("chacolate", "60", "10", R.drawable.strawberry);
        arrayList.add(productModelm2);
        ProductModel productModelm3 = new ProductModel("Mixfruit", "70", "10", R.drawable.papaya);
        arrayList.add(productModelm3);
        ProductModel productModelm4 = new ProductModel("Strawberry", "70", "20", R.drawable.mango);
        arrayList.add(productModelm4);
        ProductModel productModelm5 = new ProductModel("Sitafal", "70", "10", R.drawable.banana);
        arrayList.add(productModelm5);
        ProductModel productModelm6 = new ProductModel("Chocolate Badam", "70", "10", R.drawable.kiwi);
        arrayList.add(productModelm6);
        ProductModel productModelm7 = new ProductModel("Mango", "70", "20", R.drawable.guava);
        arrayList.add(productModelm7);
        ProductModel productModelm8 = new ProductModel("Dry Anjir", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm8);
        ProductModel productModelm9 = new ProductModel("kaju Anjir", "99", "10", R.drawable.watermelon);
        arrayList.add(productModelm9);
        ProductModel productModelm10 = new ProductModel("Badam Anjir", "99", "10", R.drawable.watermelon);
        arrayList.add(productModelm10);
        ProductModel productModelm11 = new ProductModel("Oreo", "70", "10", R.drawable.watermelon);
        arrayList.add(productModelm11);
        ProductModel productModelm12 = new ProductModel("Dry Fruit Icecream", "120", "10", R.drawable.watermelon);
        arrayList.add(productModelm12);
        ProductModel productModelm13 = new ProductModel("Banana", "60", "10", R.drawable.watermelon);
        arrayList.add(productModelm13);
        ProductModel productModelm14 = new ProductModel("Banana Chocolate", "70", "10", R.drawable.watermelon);
        arrayList.add(productModelm14);
        ProductModel productModelm15 = new ProductModel("Banana Strawberry", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm15);
        ProductModel productModelm16 = new ProductModel("Cashoo Nut", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm16);
        ProductModel productModelm17 = new ProductModel("Almond", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm17);
        ProductModel productModelm18 = new ProductModel("Pista", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm18);
        ProductModel productModelm19 = new ProductModel("ButterScotch", "60", "10", R.drawable.watermelon);
        arrayList.add(productModelm19);
        ProductModel productModelm20 = new ProductModel("kitkat", "70", "10", R.drawable.watermelon);
        arrayList.add(productModelm20);
        ProductModel productModelm21 = new ProductModel("5 star", "70", "10", R.drawable.watermelon);
        arrayList.add(productModelm21);
        ProductModel productModelm22 = new ProductModel("Green Apple", "50", "10", R.drawable.watermelon);
        arrayList.add(productModelm22);
        ProductModel productModelm23 = new ProductModel("Lichi", "50", "10", R.drawable.watermelon);
        arrayList.add(productModelm23);
        ProductModel productModelm24 = new ProductModel("Pineapple", "50", "10", R.drawable.watermelon);
        arrayList.add(productModelm24);
        ProductModel productModelm25 = new ProductModel("Kiwi", "80", "10", R.drawable.watermelon);
        arrayList.add(productModelm25);


    }


    private void addJuiceProduct() {
        ProductModel productModel = new ProductModel("apple", "70", "20", R.drawable.apple);
        arrayList.add(productModel);
        ProductModel productModel1 = new ProductModel("orange", "60", "10", R.drawable.orange);
        arrayList.add(productModel1);
        ProductModel productModel2 = new ProductModel("grapes", "70", "10", R.drawable.grape);
        arrayList.add(productModel2);

        ProductModel productModel3 = new ProductModel("pineapple", "70", "20", R.drawable.pineapple);
        arrayList.add(productModel3);
        ProductModel productModel12 = new ProductModel("strawberry", "80", "10", R.drawable.strawberry);
        arrayList.add(productModel12);
        ProductModel productModel23 = new ProductModel("papaya", "70", "10", R.drawable.papaya);
        arrayList.add(productModel23);

        ProductModel productModel4 = new ProductModel("mango", "70", "20", R.drawable.mango);
        arrayList.add(productModel4);
        ProductModel productModel14 = new ProductModel("bannana", "80", "10", R.drawable.banana);
        arrayList.add(productModel14);
        ProductModel productModel25 = new ProductModel("kiwi", "90", "10", R.drawable.kiwi);
        arrayList.add(productModel25);

        ProductModel productModel5 = new ProductModel("guava", "100", "20", R.drawable.guava);
        arrayList.add(productModel5);
        ProductModel productModel16 = new ProductModel("watermelon", "80", "10", R.drawable.watermelon);
        arrayList.add(productModel16);

    }
    @Override
    public void addCartItemView() {
        //addItemToCartMethod();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.cart_action);
        menuItem.setIcon(Converter.convertLayoutToImage(SubMenuJuice.this, cart_count, R.drawable.ic_shopping_cart_white_24dp));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.cart_action:
                if (cart_count < 1) {
                    Toast.makeText(this, "there is no item in cart", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(this, CartActivity.class));
                }
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    @Override
    public void updateCartCount(Context context) {
        invalidateOptionsMenu();
    }

    @Override
    protected void onStart() {
        super.onStart();
        invalidateOptionsMenu();
    }



}
