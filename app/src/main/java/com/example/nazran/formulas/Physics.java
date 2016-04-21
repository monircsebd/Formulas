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
import android.widget.TextView;
import android.widget.Toast;


public class Physics extends ActionBarActivity {

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

        private String[][] children = {
                {"Vernier constant = s / n,\nwhere s is the length of 1 smallest division of the main scale and n the number of vernier divisions.",
                        "L = M + V x VC,\nThe length of the rod = main scale reading + vernier scale reading = main scale reading + vernier scale reding x vernier scale constant.",
                        "Least count = Pitch / no. of division of the circular scale.",
                        "D = L + C x LC,\nDiameter or thickness = Linear scale reading + no. of divisions of the circular scale  x Least count",
                        "L or B or H = M + V x VC,\nLength = Main scale reading (M) + Vernier super imposition (V) x vernier constant (VC)"},
                {"v = d / t,\nSpeed = distance / time",
                        "average speed = total distance / time",
                        "a = (v - u) / t,\nacceleration = change of velocity / time",
                        "s = (u+v)t / 2",
                        "s = ut + (1 / 2)at^2",
                        "v^2 = u^2 + 2as",
                        "g = GM / R^2,\nHere,\nM = mass of the earth\nG = a universal constant, which is called gravitational constant\nR = Radius of the earth",
                        "Equation of falling Body :\nv = u+gt \nh = (u+v)t / 2\nh = ut + (1 / 2)gt^2\nv^2 = u^2 + 2ah"},
                {"Momentum = mv,\nthe mass of a body = m\nVelocity = v",
                        "the rate of change of momentum = (mv - mu) / t",
                        "F = ma\nForce = mass × acceleration"},
                {"Work = Force × displacement",
                        "Kinetic energy = Force × displacement",
                        "Kinetic energy = (1 / 2) × mass × velocity^2",
                        "Potential energy, Ep = mgh",
                        "E = mc^2",
                        "Power = Work / Time",
                        "efficiency, η = (Effective energy/Total input energy) × 100%"},
                {"P = F / A,\nPressure = Force / Area",
                        "ρ = m / v,\nDensity = mass of the body / volume of the body",
                        "P = hρg,\ndensity of the liquid = ρ\ndepth of the liquid = h\nacceleration due to gravity = g",
                        "F2/F1 = A2/A1",
                        "stress = constant × strain",
                        "d = M / v"},
                {"C / 5 = (F-32) / 9 = (K-273) / 5",
                        "α = (l2-l1) / l1(θ2-θ1)",
                        "β = (A2-A1) / A1(θ2-θ1)",
                        "γ = (V2-V1) / V1(θ2-θ1)",
                        "γ = 3α",
                        "β = 2α",
                        "Real expansion = Apparent expansion + expansion of the container",
                        "C = Q / ∆θ",
                        "S = Q / m∆θ",
                        "C = mS"},
                {"ƒ = 1 / T",
                        "v = ƒλ",
                        "h = (V × t) / 2",
                        "d = vt / 2"},
                {"ƒ = r / 2",
                        "m = l' / l"},
                {"sin i1 / sin r1 = sin i2 / sin r2 = sin i3 / sin r3 = constant",
                        "bna = sin r / sin i = 1 / (sin i / sin r) = 1 / anb",
                        "P = 1 / ƒ"},
                {"F = C x (q1 x q)/d^2",
                        "E = F / q",
                        "V = W / q"},
                {"I = Q / t",
                        "I = V / R",
                        "E = W / Q",
                "R = ρ x (L/A)",
                "Rs = R1 + R2 + R3",
                "1/Rp = 1/R1 + 1/R2 + 1/R3",
                "P = W/t",
                "P = VI = RI^2 = V^2/R"},
                {"Ep/Es = np/ns = Is/Ip"},
                {""},
                {""}
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
            TextView textView = new TextView(Physics.this);
            textView.setText(getGroup(i).toString());
            textView.setBackgroundColor(Color.parseColor("#66BB6A"));
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(Physics.this);
            textView.setText(getChild(i, i1).toString());
            textView.setTextColor(Color.BLUE);
            textView.setTextSize(20);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_physics, menu);
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
