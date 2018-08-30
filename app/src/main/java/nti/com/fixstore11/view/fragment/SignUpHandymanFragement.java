package nti.com.fixstore11.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import nti.com.fixstore11.R;
import nti.com.fixstore11.model.entities.HandyMan;
import nti.com.fixstore11.presenter.presenterImpl.SignUpHandymanImp;
import nti.com.fixstore11.view.activity.MainActivity;
import nti.com.fixstore11.view.activity.SplashActivity;
import nti.com.fixstore11.view.adapter.WorkManShipAdapter;

public class SignUpHandymanFragement extends Fragment {

    Button btnSubmit;
    EditText etName, etAge, etPhone, etPass;
    HandyMan handyMan;
    SignUpHandymanImp signUpPresenter;

    public SignUpHandymanFragement() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_handyman_signup, container, false);


        init(rootView);
        actions();

        return rootView;
    }

    private void init(View rootView) {
        handyMan = new HandyMan();
        signUpPresenter=new SignUpHandymanImp();

        etName = rootView.findViewById(R.id.ed_hname);
        etAge = rootView.findViewById(R.id.ed_hage);
        etPass = rootView.findViewById(R.id.ed_hpassword);
        etPhone = rootView.findViewById(R.id.ed_hphone);

        btnSubmit = rootView.findViewById(R.id.btn_handyman_submit);
    }

    private void actions() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              handyMan= getHandyMan();
              if(handyMan!=null){
                  signUpPresenter.insert(handyMan);
              }
            }
        });
    }

    private HandyMan getHandyMan() {
        handyMan.setPassword(etPass.getText().toString());
        handyMan.setPhone(etPhone.getText().toString());
        handyMan.setName(etName.getText().toString());
        handyMan.setAge(Integer.parseInt(etAge.getText().toString()));

        return  handyMan;
    }


}
