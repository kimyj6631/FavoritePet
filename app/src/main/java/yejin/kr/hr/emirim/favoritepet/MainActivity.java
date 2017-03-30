package yejin.kr.hr.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioChi_1, radioChi_2, radioChi_3;
    Button butok;
    ImageView imgvpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        rg=(RadioGroup)findViewById(R.id.rg);
        radioChi_1=(RadioButton) findViewById(R.id.radio_chi1);
        radioChi_2=(RadioButton) findViewById(R.id.radio_chi2);
        radioChi_3=(RadioButton) findViewById(R.id.radio_chi3);
        butok=(Button)findViewById(R.id.but_ok);
        imgvpet=(ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvpet.setVisibility(View.VISIBLE);

        }else{
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvpet.setVisibility(View.VISIBLE);
        }
    }
}
