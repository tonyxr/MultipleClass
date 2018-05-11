package com.example.a301195.lisp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;


public class website extends AppCompatActivity {
    private WebView wbGoogle;
    private Button btnGoogle;
    private WebView wbHomePage;
    private Button btnHomePage;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        wbGoogle = (WebView) findViewById(R.id.wbGoogle);
        wbHomePage = (WebView) findViewById(R.id.wbHomePage);
        wbHomePage.loadUrl("https://tonyxr.com/");
        wbGoogle.loadUrl("https://docs.google.com/document/d/1_ocOXMcywnR0WPEnJhEEaeMw1fl8XIQ2LDfu2LSYjPc/edit#heading=h.gjdgxs");
        wbGoogle.setVisibility(View.INVISIBLE);
        btnGoogle = (Button) findViewById(R.id.btnGoogle);
        btnGoogle.setVisibility(View.INVISIBLE);
        btnGoogle.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                wbGoogle.setVisibility(View.VISIBLE);
                wbHomePage.setVisibility(View.INVISIBLE);
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                wbGoogle.setVisibility(View.INVISIBLE);
                btnGoogle.setVisibility(View.INVISIBLE);
                wbHomePage.setVisibility(View.INVISIBLE);
            }
        });

        btnHomePage = (Button) findViewById(R.id.btnHomePage);
        btnHomePage.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                wbHomePage.setVisibility(View.VISIBLE);
            }
        });


    }


}
