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


public class Mathematics extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        ExpandableListView elv = (ExpandableListView) findViewById(R.id.physicsListView);
        elv.setAdapter(new ExpandableListAdapter());

    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Algebraic Expressions",
                "Exponents and Logarithms",
                "Trigonometric Ratio",
                "Simple Simultaneous Equations with Two Variables",
                "Finite Series",
                "Mensuration",
                "Statistics"
        };

        private int[][] children = {
                {
                        R.drawable.m31,
                        R.drawable.m32,
                        R.drawable.m33,
                        R.drawable.m34,
                        R.drawable.m35,
                        R.drawable.m36,
                        R.drawable.m37,
                        R.drawable.m38,
                        R.drawable.m39,
                        R.drawable.m310,
                        R.drawable.m311,
                        R.drawable.m312,
                        R.drawable.m313,
                        R.drawable.m314,
                        R.drawable.m315,
                        R.drawable.m316,
                        R.drawable.m317,
                },
                {
                        R.drawable.m41,
                        R.drawable.m42,
                        R.drawable.m43,
                        R.drawable.m44,
                        R.drawable.m45,
                        R.drawable.m46,
                        R.drawable.m47,
                        R.drawable.m48,
                        R.drawable.m49,
                        R.drawable.m410,
                        R.drawable.m411,
                        R.drawable.m412
                },
                {
                        R.drawable.m91,
                        R.drawable.m92,
                        R.drawable.m93,
                        R.drawable.m94,
                        R.drawable.m95,
                        R.drawable.m96,
                        R.drawable.m97,
                        R.drawable.m98,
                        R.drawable.m99,
                        R.drawable.m910,
                        R.drawable.m911
                },
                {
                        R.drawable.m121
                },
                {
                        R.drawable.m13p1,
                        R.drawable.m13p2,
                        R.drawable.m13p3,
                        R.drawable.m13p5,
                        R.drawable.m13p6,
                        R.drawable.m13p8,
                        R.drawable.m13p9,
                        R.drawable.m13p10,
                        R.drawable.m13p11,
                        R.drawable.m13p12
                },
                {
                        R.drawable.m16p1,
                        R.drawable.m16p2,
                        R.drawable.m16p3,
                        R.drawable.m16p4,
                        R.drawable.m16p5,
                        R.drawable.m16p6,
                        R.drawable.m16p7,
                        R.drawable.m16p8,
                        R.drawable.m16p9,
                        R.drawable.m16p10,
                        R.drawable.m16p11,
                        R.drawable.m16p12,
                        R.drawable.m16p13,
                        R.drawable.m16p14,
                        R.drawable.m16p15,
                        R.drawable.m16p16,
                        R.drawable.m16p17,
                        R.drawable.m16p18,
                        R.drawable.m16p19,
                        R.drawable.m16p20,
                        R.drawable.m16p21,
                        R.drawable.m16p22,
                        R.drawable.m16p23,
                        R.drawable.m16p24,
                        R.drawable.m16p25,
                        R.drawable.m16p26,
                        R.drawable.m16p27,
                        R.drawable.m16p28,
                },
                {
                        R.drawable.m17p1,
                        R.drawable.m17p2,
                        R.drawable.m17p3,
                        R.drawable.m17p4
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
            TextView textView = new TextView(Mathematics.this);
            textView.setText(getGroup(i).toString());
            textView.setBackgroundColor(Color.parseColor("#66BB6A"));
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(Mathematics.this);
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
        getMenuInflater().inflate(R.menu.menu_mathematics, menu);
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
