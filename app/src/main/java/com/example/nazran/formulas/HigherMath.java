package com.example.nazran.formulas;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;


public class HigherMath extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        ExpandableListView elv = (ExpandableListView) findViewById(R.id.physicsListView);
        elv.setAdapter(new ExpandableListAdapter());

    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Sets and Functions",
                "Algebraic Expressions",
                "Trigonometry",
                "Exponential & Logarithmic Functions",
                "Binomial Expansion",
                "Coordinate Geometry",
                "Solid  Geometry",
                "Probability"
        };

        private int [][] children = {
                {
                        R.drawable.hm1p1,
                        R.drawable.hm1p2,
                        R.drawable.hm1p3,
                        R.drawable.hm1p4,
                        R.drawable.hm1p5,
                        R.drawable.hm1p6,
                        R.drawable.hm1p7,
                        R.drawable.hm1p8,
                        R.drawable.hm1p9,
                        R.drawable.hm1p10,
                        R.drawable.hm1p11,
                        R.drawable.hm1p12,
                        R.drawable.hm1p13,
                        R.drawable.hm1p14,
                        R.drawable.hm1p15
                },
                {
                        R.drawable.hm2p1,
                        R.drawable.hm2p2,
                        R.drawable.hm2p3
                },
                {
                        R.drawable.hm8p1,
                        R.drawable.hm8p2,
                        R.drawable.hm8p3,
                        R.drawable.hm8p4,
                        R.drawable.hm8p5,
                        R.drawable.hm8p6,
                        R.drawable.hm8p7,
                        R.drawable.hm8p8,
                        R.drawable.hm8p9,
                        R.drawable.hm8p10,
                        R.drawable.hm8p12,
                },
                {
                        R.drawable.hm9p1,
                        R.drawable.hm9p2,
                        R.drawable.hm9p3,
                        R.drawable.hm9p4,
                        R.drawable.hm9p5,
                        R.drawable.hm9p7,
                        R.drawable.hm9p8,
                        R.drawable.hm9p9,
                        R.drawable.hm9p10,
                        R.drawable.hm9p11,
                        R.drawable.hm9p13,
                        R.drawable.hm9p14,
                        R.drawable.hm9p15,
                        R.drawable.hm9p16,
                        R.drawable.hm9p17
                },
                {
                        R.drawable.hm10p1,
                        R.drawable.hm10p2,
                        R.drawable.hm10p3
                },
                {
                        R.drawable.hm11p1,
                        R.drawable.hm11p2,
                        R.drawable.hm11p3,
                        R.drawable.hm11p4,
                        R.drawable.hm11p5,
                },
                {
                        R.drawable.hm13p1,
                        R.drawable.hm13p2,
                        R.drawable.hm13p3,
                        R.drawable.hm13p4,
                        R.drawable.hm13p5,
                        R.drawable.hm13p6,
                        R.drawable.hm13p7,
                        R.drawable.hm13p8,
                        R.drawable.hm13p9,
                        R.drawable.hm13p10,
                        R.drawable.hm13p11,
                        R.drawable.hm13p12,
                        R.drawable.hm13p13,
                        R.drawable.hm13p14,
                        R.drawable.hm13p15,
                        R.drawable.hm13p16,
                        R.drawable.hm13p17,
                        R.drawable.hm13p18,
                        R.drawable.hm13p19,
                        R.drawable.hm13p20,
                        R.drawable.hm13p21,
                        R.drawable.hm13p22,
                        R.drawable.hm13p23,
                        R.drawable.hm13p24,
                        R.drawable.hm13p25,
                        R.drawable.hm13p26
                },
                {
                        R.drawable.hm14p1
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
            TextView textView = new TextView(HigherMath.this);
            textView.setText(getGroup(i).toString());
            textView.setBackgroundColor(Color.parseColor("#66BB6A"));
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(HigherMath.this);
            imageView.setImageResource(children[i][i1]);
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
        getMenuInflater().inflate(R.menu.menu_higher_mathematics, menu);
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
