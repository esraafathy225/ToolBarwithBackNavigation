package com.esraa.hp.toolbarwithbacknavigation;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment{
    Button btn;
    TextView title;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.fragment_one,container,false);
       btn=v.findViewById(R.id.btn);
       title=getActivity().findViewById(R.id.title);
       title.setText("From Fragment One");
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentTwo fragmentTwo=new FragmentTwo();
               FragmentManager manager=getActivity().getSupportFragmentManager();
               FragmentTransaction transaction=manager.beginTransaction();
               transaction.replace(R.id.linear,fragmentTwo,"ff").addToBackStack("ff");
               transaction.commit();
           }
       });
       return v;
    }
}
