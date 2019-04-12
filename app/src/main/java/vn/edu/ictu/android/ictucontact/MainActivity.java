package vn.edu.ictu.android.ictucontact;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import vn.edu.ictu.android.ictucontact.contact.ContactFragment;
import vn.edu.ictu.android.ictucontact.phone.PhoneFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showFragment(new ContactFragment());

        findViewById(R.id.btnContactFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new ContactFragment());
            }
        });

        findViewById(R.id.btnLogFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new LogFragment());
            }
        });

        findViewById(R.id.btnPhoneFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new PhoneFragment());
            }
        });

    }

    void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.layoutFragment, fragment)
                .commit();
    }
}
