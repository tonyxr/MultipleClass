package com.example.a301195.lisp;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends ListActivity
{
    private TextView tvInfo;
    private CheckBox cbWebsite;
    private Button btnInfo;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FRIENDS));
        getListView().setTextFilterEnabled(true);
        cbWebsite = (CheckBox) findViewById(R.id.cbWebsite);
        tvInfo = (TextView) findViewById(R.id.tvProjectName);
    }

    static final String[] FRIENDS = new String[]{"website", "Barb", "Chris", "Diane"};

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Intent intent = null;
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String friend = o.toString();
        //Toast.makeText(this, "You have chosen the friend: " + " " + friend, Toast.LENGTH_LONG).show();

        if(position == 0)
        {
            intent = new Intent(this, website.class);
        }

    }

    public void onClickCheckBox(View view)
    {
        Intent intent = null;
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.cbWebsite:
                if (checked)
                {
                    intent = new Intent(this, website.class);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "please choose one page to go...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                // Remove the meat
                break;

            case R.id.cbCheckBox2:
                if (checked)
                {
                    intent = new Intent(this, NFC.class);
                }
                // Cheese me
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "please choose one page to go...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                // I'm lactose intolerant
                break;
        }
    }

}

