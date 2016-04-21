package com.example.nazran.formulas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Chemistry extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        ExpandableListView elv = (ExpandableListView) findViewById(R.id.physicsListView);
        elv.setAdapter(new ExpandableListAdapter());

    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "PHYSICAL QUANTITIES AND MEASUREMENT",
                "MOTION",
                "FORCE",
                "WORK, POWER AND ENERGY",
                "PRESSURE AND STATES OF MATTER",
                "EFFECT OF HEAT ON SUBSTANCES",
                "WAVES AND SOUND",
                "REFLECTION OF LIGHT",
                "REFRACTION OF LIGHT",
                "STATICAL ELECTRICITY",
                "CURRENT ELECTRICITY",
                "MAGNETIC EFFECT OF CURRENT",
                "MODERN PHYSICS AND ELECTRONICS",
                "PHYSICS TO SAVE LIFE"
        };

        private int[][] children = {
                {R.drawable.m41,
                        R.drawable.m41,
                },
                {R.drawable.m41,
                        R.drawable.m41,
                }
        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(Chemistry.this);
            textView.setText(getGroup(i).toString());
            textView.setBackgroundColor(Color.parseColor("#66BB6A"));
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(Chemistry.this);
            imageView.setImageResource(children[i][i1]);
            //imageView.setScaleType(ImageView.ScaleType.FIT_START);
            return imageView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chemistry, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
