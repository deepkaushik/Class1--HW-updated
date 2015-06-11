package edu.nyu.scps.bed;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Insert your Java code between the two horizontal lines.
        //-----------------------------
        //Demonstrate the class Date we created in the file Data.java.
        for (;;) {
            int month = getInt("Month", "Type in the month (1 to 12).");
            int day = getInt("Day", "Type in the day of the month.");
            int year = getInt("Year", "Type in the year.");
            Date d = new Date(month, day, year);
            String output = "The day before " + d;
            d.prev();
            output += " is " + d + ".\n";
            display("Previous day", output);
        }
        //-----------------------------
    }

    private int intResult;

    private int getInt(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    String string = editable.toString();
                    try {
                        intResult = Integer.parseInt(string);
                    } catch (NumberFormatException numberFormatException) {
                        Toast toast = Toast.makeText(MainActivity.this, "bad integer " + string, Toast.LENGTH_LONG);
                        toast.show();
                        intResult = 0;
                    }

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return intResult;
    }

    private long longResult;

    private long getLong(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    String string = editable.toString();
                    try {
                        longResult = Long.parseLong(string);
                    } catch (NumberFormatException numberFormatException) {
                        Toast toast = Toast.makeText(MainActivity.this, "bad long " + string, Toast.LENGTH_LONG);
                        toast.show();
                        longResult = 0L;
                    }

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return longResult;
    }

    private boolean booleanResult;

    private boolean getBoolean(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    String string = editable.toString();
                    try {
                        booleanResult = Boolean.parseBoolean(string);
                    } catch (NumberFormatException numberFormatException) {
                        Toast toast = Toast.makeText(MainActivity.this, "bad boolean " + string, Toast.LENGTH_LONG);
                        toast.show();
                        booleanResult = false;
                    }

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return booleanResult;
    }

    private float floatResult;

    private float getFloat(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED
                | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    String string = editable.toString();
                    try {
                        floatResult = Float.parseFloat(string);
                    } catch (NumberFormatException numberFormatException) {
                        Toast toast = Toast.makeText(MainActivity.this, "bad float " + string, Toast.LENGTH_LONG);
                        toast.show();
                        floatResult = 0.0f;
                    }

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return floatResult;
    }


    private double doubleResult;

    private double getDouble(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED
                | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    String string = editable.toString();
                    try {
                        doubleResult = Double.parseDouble(string);
                    } catch (NumberFormatException numberFormatException) {
                        Toast toast = Toast.makeText(MainActivity.this, "bad double " + string, Toast.LENGTH_LONG);
                        toast.show();
                        doubleResult = 0.0;
                    }

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return doubleResult;
    }

    private String stringResult;

    private String getString(String title, String message) {

        //A builder object can create a dialog object.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);

        //This inflater reads the dialog.xml and creates the objects described therein.
        //Pass null as the parent view because it's going in the dialog layout.
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);
        //Must be final to be mentioned in the anonymous inner class.
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(view);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER) {

                    Editable editable = editText.getText();
                    stringResult = editable.toString();

                    //Sending this message will break us out of the loop below.
                    Message message = handler.obtainMessage();
                    handler.sendMessage(message);
                }
                return false;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }

        alertDialog.dismiss();
        return stringResult;
    }

    //The handleMessage method of this object will be called when we call the sendMessage method of
    //this object.  It throws an exception to break us out of the infinite loops below.

    private final Handler handler = new Handler() {
        @Override
        public void handleMessage(Message message) {
            throw new RuntimeException();
        }
    };

    private void display(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Sending this message will break us out of the loop below.
                Message message = handler.obtainMessage();
                handler.sendMessage(message);
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Loop until the user presses the EditText's Done button.
        try {
            Looper.loop();
        } catch (RuntimeException runtimeException) {
        }
    }

    private void display(String title, int i) {
        display(title, Integer.toString(i));
    }

    private void display(String title, long l) {
        display(title, Long.toString(l));
    }

    private void display(String title, boolean b) {
        display(title, Boolean.toString(b));
    }

    private void display(String title, float f) {
        display(title, Float.toString(f));
    }

    public void display(String title, double d) {
        display(title, Double.toString(d));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
