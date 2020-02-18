package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleExplicitIntent (View view) {
        Intent iten = new Intent(MainActivity.this, ExplicitIntentActivity.class);
        startActivity(iten);
    }
    public void handleExit (View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent iten = new Intent (MainActivity.this, ImplicitIntentActivity.class);
        startActivity(iten);
    }
    public void handleAndroidBundle(View view){
        Intent iten = new Intent (MainActivity.this, BundleActivity.class);
        startActivity(iten);
    }
    public void handleParcelable (View view) {
        Intent iten = new Intent(MainActivity.this, ParcelableActivity.class);
        startActivity(iten);
    }
}
