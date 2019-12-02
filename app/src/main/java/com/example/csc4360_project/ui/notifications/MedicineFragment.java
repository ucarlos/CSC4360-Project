package com.example.csc4360_project.ui.notifications;

import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.csc4360_project.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MedicineFragment extends Fragment {

    private MedicineViewModel medicineViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        medicineViewModel =
                ViewModelProviders.of(this).get(MedicineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medicine, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        medicineViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


       FloatingActionButton Medicine_Float_Button = root.findViewById(R.id.medicine_form_button);

        Medicine_Float_Button.setOnClickListener((view) -> {
            startActivity(new Intent(getActivity(), Medicine_Form.class));
        });


        return root;
    }
}