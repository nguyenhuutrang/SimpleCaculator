package homework.android.simplecaculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mem;
    String pheptinh;
    Boolean check;
    TextView show;
    Button zero,one,two,three,four,five,six,seven,eight,nine,dau,dot,result,ce,c,bs,div,mul,plus,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        show = (TextView) findViewById( R.id.txtv_show );

        zero = (Button) findViewById( R.id.btn_0 );
        one = (Button) findViewById( R.id.btn_1 );
        two = (Button) findViewById( R.id.btn_2 );
        three = (Button) findViewById( R.id.btn_3 );
        four = (Button) findViewById( R.id.btn_4 );
        five = (Button) findViewById( R.id.btn_5 );
        six = (Button) findViewById( R.id.btn_6 );
        seven = (Button) findViewById( R.id.btn_7 );
        eight = (Button) findViewById( R.id.btn_8 );
        nine = (Button) findViewById( R.id.btn_9 );
        dau = (Button) findViewById( R.id.btn_dau );
        dot = (Button) findViewById( R.id.btn_dot );
        result = (Button) findViewById( R.id.btn_result );
        ce = (Button) findViewById( R.id.btn_ce );
        c = (Button) findViewById( R.id.btn_c );
        bs = (Button) findViewById( R.id.btn_bs );
        div = (Button) findViewById( R.id.btn_div );
        mul = (Button) findViewById( R.id.btn_mul );
        plus = (Button) findViewById( R.id.btn_plus );
        sub = (Button) findViewById( R.id.btn_sub );

        pheptinh = null;
        mem = 0;
        check = false;


        show.setText( "0" );

        zero.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "0" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "0";
                }
                show.setText( str );
            }
        } );

        one.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "1" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "1";
                }else{
                    str = "1";
                }
                show.setText( str );
            }
        } );

        two.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "2" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "2";
                }else{
                    str = "2";
                }
                show.setText( str );
            }
        } );

        three.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "3" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "3";
                }else{
                    str = "3";
                }
                show.setText( str );
            }
        } );

        four.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "4" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "4";
                }else{
                    str = "4";
                }
                show.setText( str );
            }
        } );

        five.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "5" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "5";
                }else{
                    str = "5";
                }
                show.setText( str );
            }
        } );

        six.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "6" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "6";
                }else{
                    str = "6";
                }
                show.setText( str );
            }
        } );

        seven.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "7" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "7";
                }else{
                    str = "7";
                }
                show.setText( str );
            }
        } );

        eight.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "8" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "8";
                }else{
                    str = "8";
                }
                show.setText( str );
            }
        } );

        nine.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    show.setText( "9" );
                    check = false;
                    return;
                }
                String str = String.valueOf( show.getText() );
                if(str != "0") {
                    str = str + "9";
                }else{
                    str = "9";
                }
                show.setText( str );
            }
        } );

        dot.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                str = str + ".";
                show.setText( str );
            }
        } );

        dau.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(str.charAt( 0 ) == '-'){
                    str = str.substring( 1 );
                }else{
                    str = "-" + str;
                }
                show.setText( str );
            }
        } );


        ce.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText( "0" );
            }
        } );

        c.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = 0;
                pheptinh = null;
                show.setText( "0" );
            }
        } );

        bs.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(str.length() == 1){
                    str = "0";
                }else{
                    str = str.substring( 0,str.length() - 1 );
                }
                show.setText( str );
            }
        } );

        div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(pheptinh == null){
                    mem = Integer.parseInt( str );
                }else{
                    int temp = Integer.parseInt( str );
                    if(pheptinh == "+"){
                        mem += temp;
                    }else if(pheptinh == "-"){
                        mem -= temp;
                    }else if(pheptinh == "X"){
                        mem *= temp;
                    }else if(pheptinh == "/"){
                        mem /= temp;
                    }
                }
                pheptinh = "/";
                str = String.valueOf( mem );
                show.setText( str );
                check = true;
            }
        } );


        mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(pheptinh == null){
                    mem = Integer.parseInt( str );
                }else{
                    int temp = Integer.parseInt( str );
                    if(pheptinh == "+"){
                        mem += temp;
                    }else if(pheptinh == "-"){
                        mem -= temp;
                    }else if(pheptinh == "X"){
                        mem *= temp;
                    }else if(pheptinh == "/"){
                        mem /= temp;
                    }
                }
                pheptinh = "X";
                str = String.valueOf( mem );
                show.setText( str );
                check = true;
            }
        } );

        sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(pheptinh == null){
                    mem = Integer.parseInt( str );
                }else{
                    int temp = Integer.parseInt( str );
                    if(pheptinh == "+"){
                        mem += temp;
                    }else if(pheptinh == "-"){
                        mem -= temp;
                    }else if(pheptinh == "X"){
                        mem *= temp;
                    }else if(pheptinh == "/"){
                        mem /= temp;
                    }
                }
                pheptinh = "-";
                str = String.valueOf( mem );
                show.setText( str );
                check = true;
            }
        } );

        plus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf( show.getText() );
                if(pheptinh == null){
                    mem = Integer.parseInt( str );
                }else{
                    int temp = Integer.parseInt( str );
                    if(pheptinh == "+"){
                        mem += temp;
                    }else if(pheptinh == "-"){
                        mem -= temp;
                    }else if(pheptinh == "X"){
                        mem *= temp;
                    }else if(pheptinh == "/"){
                        mem /= temp;
                    }
                }
                pheptinh = "+";
                str = String.valueOf( mem );
                show.setText( str );
                check = true;
            }
        } );

        result.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pheptinh != null) {
                    String str = String.valueOf( show.getText() );
                    int temp = Integer.parseInt( str );
                    if(pheptinh == "+"){
                        mem += temp;
                    }else if(pheptinh == "-"){
                        mem -= temp;
                    }else if(pheptinh == "X"){
                        mem *= temp;
                    }else if(pheptinh == "/"){
                        mem /= temp;
                    }
                    str = String.valueOf( mem );
                    show.setText( str );
                    pheptinh = null;
                    mem = 0;
                }
                check = true;
            }
        } );


    }
}
