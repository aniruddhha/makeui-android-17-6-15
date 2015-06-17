package com.melayer.presentation;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

//    private LinearLayout layoutRoot;
//    private LayoutParams paramsRoot;

    private EditText edtName;
//    private LayoutParams paramsEdt;

    private Button btnOkay;
//    private LayoutParams paramsBtn;

    private final Click click = new Click();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        layoutRoot = new LinearLayout(this);
        paramsRoot = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        layoutRoot.setLayoutParams(paramsRoot);
        layoutRoot.setOrientation(LinearLayout.VERTICAL);

        edtName = new EditText(this);
        paramsEdt = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        edtName.setLayoutParams(paramsEdt);
        edtName.setHint("Name");
        layoutRoot.addView(edtName);

        btnOkay = new Button(this);
        paramsBtn = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        btnOkay.setLayoutParams(paramsBtn);
        btnOkay.setText("Okay");
        layoutRoot.addView(btnOkay);

        setContentView(layoutRoot);*/

        setContentView(R.layout.activity_main);

        /*edtName =*/ /*obj ref from above method*/

        edtName = (EditText)findViewById(R.id.edtName);

        btnOkay = (Button)findViewById(R.id.btnTemp);
        btnOkay.setOnClickListener(click);
    }

    private final class Click implements  View.OnClickListener{

        @Override
        public void onClick(View v) {

            String data = edtName.getText().toString();

            edtName.setText(data.toUpperCase());
        }
    }
}
