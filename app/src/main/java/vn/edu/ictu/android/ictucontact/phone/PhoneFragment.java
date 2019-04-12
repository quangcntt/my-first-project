package vn.edu.ictu.android.ictucontact.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import vn.edu.ictu.android.ictucontact.R;

public class PhoneFragment extends Fragment {

    TextView tvPhone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.phone_fragment, container, false);
        bindView(view);
        return view;
    }

    private void bindView(View view) {
        tvPhone = view.findViewById(R.id.tvPhone);
        view.findViewById(R.id.btnCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + tvPhone.getText().toString()));
                startActivity(callIntent);
            }
        });
        int btnIds[] = {
                R.id.btn0,
                R.id.btn1, R.id.btn2, R.id.btn3,
                R.id.btn4, R.id.btn5, R.id.btn6,
                R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btnTag, R.id.btnStar
        };

        for (int i = 0; i < btnIds.length; i++) {
            int id = btnIds[i];
            view.findViewById(id).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button btn = (Button) v;
                    tvPhone.append(btn.getText().toString());
                }
            });
        }
    }
}
