package com.example.ja.squares;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.Random;

import static android.R.color.transparent;


public class Game extends AppCompatActivity {
    ImageButton[][] imageButton;
    int res_table[];
    int view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = 1;
        setContentView(R.layout.activity_start);
    }

    public void _newgame(View v) {
        view = 2;
        setContentView(R.layout.activity_levels);
    }

    public void _exit(View v) {
        finish();
        System.exit(0);
    }

    public void _back(View V) {
        view = 1;
        setContentView(R.layout.activity_start);
    }

    public void _back_to_levels(View V) {
        view = 2;
        setContentView(R.layout.activity_levels);
    }

    public void _easy(final View v) {
        int size = 3;
        int id_number = 0;
        view = 3;
        setContentView(R.layout.activity_game);
        TableLayout tableLayout = new TableLayout(this);
        imageButton = new ImageButton[size][size];
        tableLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        TableRow[] tableRow = new TableRow[size];
        for (int i = 0; i < size; i++) {
            tableRow[i] = new TableRow(this);
            tableRow[i].setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < size; j++) {
                imageButton[i][j] = new ImageButton(this);
                imageButton[i][j].setTag(1);
                imageButton[i][j].setId(0 + id_number);
                imageButton[i][j].setImageResource(R.drawable.zwykleon);
                imageButton[i][j].setOnClickListener(getOnClickDoSomething(imageButton[i][j]));
                imageButton[i][j].setBackgroundResource(transparent);
                tableRow[i].addView(imageButton[i][j]);
                id_number++;

                ViewGroup.LayoutParams params = imageButton[i][j].getLayoutParams();
                params.width = 210;
                params.height = 210;
                ViewGroup.MarginLayoutParams params2 = (ViewGroup.MarginLayoutParams) imageButton[i][j].getLayoutParams();
                params2.setMargins(2, 2, 2, 2);
                imageButton[i][j].setLayoutParams(params);
            }
            tableLayout.addView(tableRow[i]);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.easy_id);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        Button backButton = new Button(this);
        backButton.setText("Back");
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                _back_to_levels(v);
            }
        });

        tableLayout.addView(backButton, params);
        linearLayout.addView(tableLayout);
        shuffle();
    }

    public void _medium(View v) {
        int size = 4;
        int id_number = 0;
        view = 3;
        setContentView(R.layout.activity_game);
        TableLayout tableLayout = new TableLayout(this);
        imageButton = new ImageButton[size][size];
        tableLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        TableRow[] tableRow = new TableRow[size];
        for (int i = 0; i < size; i++) {
            tableRow[i] = new TableRow(this);
            tableRow[i].setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < size; j++) {
                imageButton[i][j] = new ImageButton(this);
                imageButton[i][j].setTag(1);
                imageButton[i][j].setId(0 + id_number);
                imageButton[i][j].setImageResource(R.drawable.zwykleon);
                imageButton[i][j].setOnClickListener(getOnClickDoSomething(imageButton[i][j]));
                imageButton[i][j].setBackgroundResource(transparent);
                tableRow[i].addView(imageButton[i][j]);
                id_number++;

                ViewGroup.LayoutParams params = imageButton[i][j].getLayoutParams();
                params.width = 150;
                params.height = 150;
                ViewGroup.MarginLayoutParams params2 = (ViewGroup.MarginLayoutParams) imageButton[i][j].getLayoutParams();
                params2.setMargins(5, 5, 5, 5);
                imageButton[i][j].setLayoutParams(params);

            }
            tableLayout.addView(tableRow[i]);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.easy_id);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        Button backButton = new Button(this);
        backButton.setText("Back");
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                _back_to_levels(v);
            }
        });

        tableLayout.addView(backButton, params);
        linearLayout.addView(tableLayout);
        shuffle();
    }

    public void _hard(View v) {
        int size = 5;
        int id_number = 0;
        view = 3;
        setContentView(R.layout.activity_game);
        TableLayout tableLayout = new TableLayout(this);
        imageButton = new ImageButton[size][size];
        tableLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        TableRow[] tableRow = new TableRow[size];
        for (int i = 0; i < size; i++) {
            tableRow[i] = new TableRow(this);
            tableRow[i].setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < size; j++) {
                imageButton[i][j] = new ImageButton(this);
                imageButton[i][j].setTag(1);
                imageButton[i][j].setId(0 + id_number);
                imageButton[i][j].setImageResource(R.drawable.zwykleon);
                imageButton[i][j].setOnClickListener(getOnClickDoSomething(imageButton[i][j]));
                imageButton[i][j].setBackgroundResource(transparent);
                tableRow[i].addView(imageButton[i][j]);
                id_number++;

                ViewGroup.LayoutParams params = imageButton[i][j].getLayoutParams();
                params.width = 120;
                params.height = 120;
                ViewGroup.MarginLayoutParams params2 = (ViewGroup.MarginLayoutParams) imageButton[i][j].getLayoutParams();
                params2.setMargins(5, 5, 5, 5);
                imageButton[i][j].setLayoutParams(params);

            }
            tableLayout.addView(tableRow[i]);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.easy_id);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        Button backButton = new Button(this);
        backButton.setText("Back");
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                _back_to_levels(v);
            }
        });

        tableLayout.addView(backButton, params);
        linearLayout.addView(tableLayout);
        shuffle();
    }

    View.OnClickListener getOnClickDoSomething(final ImageButton clickedButton) {
        return new View.OnClickListener() {
            public void onClick(View v) {
                change_parents(clickedButton);
                System.out.println(check_if_win());
                if (check_if_win()) {
                    win();
                }
            }
        };
    }

    public void shuffle() {
        int times_shuffle = 50;
        ImageButton[][] temp_table;
        temp_table = new ImageButton[imageButton.length][imageButton.length];
        for (int i = 0; i < imageButton.length; i++) {
            for (int j = 0; j < imageButton.length; j++) {
                temp_table[i][j] = (ImageButton) findViewById(imageButton[i][j].getId());
            }
        }
        for (int i = 0; i < times_shuffle; i++) {
            Random random = new Random();
            int n = random.nextInt(25);
            for (int k = 0; k < imageButton.length; k++) {
                for (int l = 0; l < imageButton.length; l++) {
                    if (temp_table[k][l].getId() == n) {
                        change_color(temp_table[k][l]);
                    }
                }
            }
        }
    }

    public void change_color(ImageButton imageButton) {
        if ((int) imageButton.getTag() == 1) {
            imageButton.setImageResource(R.drawable.zwykleoff);
            imageButton.setBackgroundResource(transparent);
            imageButton.setTag(0);
        } else {
            imageButton.setImageResource(R.drawable.zwykleon);
            imageButton.setBackgroundResource(transparent);
            imageButton.setTag(1);
        }
    }

    public void change_parents(ImageButton clickedButton) {
        change_color(clickedButton);
        ImageButton[][] temp_table;
        temp_table = new ImageButton[imageButton.length][imageButton.length];
        for (int i = 0; i < imageButton.length; i++) {
            for (int j = 0; j < imageButton.length; j++) {
                temp_table[i][j] = (ImageButton) findViewById(imageButton[i][j].getId());
            }
        }
        for (int i = 0; i < imageButton.length; i++) {
            for (int j = 0; j < imageButton.length; j++) {
                if (temp_table[i][j] == clickedButton) {
                    try {
                        change_color(temp_table[i - 1][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        change_color(temp_table[i][j - 1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        change_color(temp_table[i][j + 1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        change_color(temp_table[i + 1][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
        }
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing application")
                .setMessage("Do you want to close the application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public boolean check_if_win() {
        ImageButton[][] temp_table;
        temp_table = new ImageButton[imageButton.length][imageButton.length];
        for (int i = 0; i < imageButton.length; i++) {
            for (int j = 0; j < imageButton.length; j++) {
                temp_table[i][j] = (ImageButton) findViewById(imageButton[i][j].getId());
            }
        }
        for (int i = 0; i < imageButton.length; i++) {
            for (int j = 0; j < imageButton.length; j++) {
                if ((int) temp_table[i][j].getTag() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void win() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("You Won!!!")
                .setMessage("Want to play another one?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setContentView(R.layout.activity_levels);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setContentView(R.layout.activity_start);
                    }
                })
                .show();
    }

    public void onSaveInstanceState(Bundle outState) {
        if (view == 3) {
            super.onSaveInstanceState(outState);
            res_table = new int[imageButton.length * imageButton.length];
            for (int i = 0; i < imageButton.length; i++) {
                for (int j = 0; j < imageButton.length; j++) {
                    res_table[(i * imageButton.length) + j] = (int) imageButton[i][j].getTag();
                }
            }
            outState.putIntArray("restore", res_table);
        }
        outState.putInt("view", view);

    }

    protected void onRestoreInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        view = outState.getInt("view");
        if (view == 1) {
            setContentView(R.layout.activity_start);
        } else if (view == 2) {
            setContentView(R.layout.activity_levels);
        } else {
            res_table = outState.getIntArray("restore");
            int size = (int) Math.sqrt(res_table.length);
            int id_number = 0;
            setContentView(R.layout.activity_game);
            TableLayout tableLayout = new TableLayout(this);
            imageButton = new ImageButton[size][size];
            tableLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
            TableRow[] tableRow = new TableRow[size];
            for (int i = 0; i < size; i++) {
                tableRow[i] = new TableRow(this);
                tableRow[i].setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
                for (int j = 0; j < size; j++) {
                    imageButton[i][j] = new ImageButton(this);
                    imageButton[i][j].setTag(res_table[(i * imageButton.length) + j]);
                    imageButton[i][j].setId(0 + id_number);
                    if ((int) imageButton[i][j].getTag() == 0) {
                        imageButton[i][j].setImageResource(R.drawable.zwykleoff);
                        imageButton[i][j].setBackgroundResource(transparent);
                    } else if ((int) imageButton[i][j].getTag() == 1) {
                        imageButton[i][j].setImageResource(R.drawable.zwykleon);
                        imageButton[i][j].setBackgroundResource(transparent);
                    }
                    imageButton[i][j].setOnClickListener(getOnClickDoSomething(imageButton[i][j]));
                    tableRow[i].addView(imageButton[i][j]);
                    id_number++;

                    ViewGroup.LayoutParams params = imageButton[i][j].getLayoutParams();

                    if (_getScreenOrientation() == Configuration.ORIENTATION_LANDSCAPE) {
                        if (size == 3) {
                            params.width = 210;
                            params.height = 210;
                        } else if (size == 4) {
                            params.width = 150;
                            params.height = 150;
                        } else if (size == 5) {
                            params.width = 120;
                            params.height = 120;
                        }
                    } else {
                        if (size == 3) {
                            params.width = 210;
                            params.height = 210;
                        } else if (size == 4) {
                            params.width = 150;
                            params.height = 150;
                        } else if (size == 5) {
                            params.width = 120;
                            params.height = 120;
                        }
                    }
                    ViewGroup.MarginLayoutParams params2 = (ViewGroup.MarginLayoutParams) imageButton[i][j].getLayoutParams();
                    params2.setMargins(5, 5, 5, 5);
                    imageButton[i][j].setLayoutParams(params);

                }
                tableLayout.addView(tableRow[i]);
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.easy_id);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            Button backButton = new Button(this);
            backButton.setText("Back");
            backButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    _back_to_levels(v);
                }
            });
            tableLayout.addView(backButton, params);
            linearLayout.addView(tableLayout);

        }
    }

    private int _getScreenOrientation() {
        return getResources().getConfiguration().orientation;
    }
}