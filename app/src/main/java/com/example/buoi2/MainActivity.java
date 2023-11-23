package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtMSSV, edtTuoi;
    TextView txtThongtin;
    RadioButton radNam, radNu ;
    Button btnLuu;
    CheckBox chkDabong, chkChoigame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ các biến tới các control thông qua id
        edtTen = findViewById(R.id.edtTen);
        edtMSSV = findViewById(R.id.edtMSSV);
        edtTuoi = findViewById(R.id.edtTuoi);
        btnLuu = findViewById(R.id.btnLuu);
        txtThongtin = findViewById(R.id.txtThongtin);
        radNam = findViewById(R.id.radNam);
        radNu = findViewById(R.id.radNu);
        chkDabong = findViewById(R.id.chkDabong);
        chkChoigame = findViewById(R.id.chkChoigame);

        //xử lý dữ kiện khi ấn LƯu
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = (edtTen.getText().toString()) ;
                String mssv = (edtMSSV.getText().toString()) ;
                String tuoi = (edtTuoi.getText().toString()) ;
                String gioitinh, dabong, choigame;
                // Is the button now checked?
                boolean checkedgt = (radNam).isChecked();
                if( checkedgt == true)
                {
                    gioitinh = "Nam";
                }else{
                    gioitinh = "Nu";
                }
                boolean checkeddb = (chkDabong).isChecked();
                boolean checkedcg = (chkChoigame).isChecked();
                if( checkeddb == true)
                {
                    dabong = "Đá bóng, ";
                }else{
                    dabong = "";
                }
                if( checkedcg == true)
                {
                    choigame = "Chơi game";
                }else{
                    choigame="";
                }
                // Check which radio button was clicked

               txtThongtin.setText("Tôi tên: " + ten + "\n" +
                                    "MSSV: " + mssv +"\n"+
                                    "Tuổi: "+tuoi+ "\n" +
                                    "Giới tính: "+ gioitinh + "\n"+
                                    "Sở thích: "+ dabong+choigame);
            }
        });
    }
}