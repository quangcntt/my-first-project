package vn.edu.ictu.android.ictucontact.contact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ictu.android.ictucontact.R;

public class ContactFragment extends Fragment {

    private ContactAdapter adapter;
    private List<MyContact> contactList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);

        RecyclerView rvContact = view.findViewById(R.id.rvContact);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvContact.setLayoutManager(layoutManager);

        contactList.add(new MyContact("Nguyen Van Thanh", "09854321"));
        contactList.add(new MyContact("Ms.Quy", "098654321"));
        contactList.add(new MyContact("Ms.Loan", "012345789"));

        adapter = new ContactAdapter(getContext(), contactList);
        rvContact.setAdapter(adapter);

        return view;
    }
}
