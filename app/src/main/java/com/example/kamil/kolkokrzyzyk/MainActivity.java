package com.example.kamil.kolkokrzyzyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public Integer[] stany;
    boolean kolej_gracza1;

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    Button reset_button;
    TextView textview;
    int wygrany;

    public void reset() {
        this.stany = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.kolej_gracza1 = true;
        this.button1.setImageResource(R.mipmap.szary);
        this.button2.setImageResource(R.mipmap.szary);
        this.button3.setImageResource(R.mipmap.szary);
        this.button4.setImageResource(R.mipmap.szary);
        this.button5.setImageResource(R.mipmap.szary);
        this.button6.setImageResource(R.mipmap.szary);
        this.button7.setImageResource(R.mipmap.szary);
        this.button8.setImageResource(R.mipmap.szary);
        this.button9.setImageResource(R.mipmap.szary);
        this.textview.setText("");
        wygrany = 0;
    }

    void koniec_gry(Integer gracz) {
        wygrany = gracz;
        this.textview.setText("Wygrywa gracz " + this.wygrany);
    }

    void sprawdz_koniec_gry() {
        // III
        // III
        // III
        if (this.stany[0].equals(this.stany[3]) && this.stany[3].equals(this.stany[6]) && this.stany[0] != 0 && this.stany[3] != 0 && this.stany[6] != 0) {
            koniec_gry(this.stany[0]);
        }
        if (this.stany[1].equals(this.stany[4]) && this.stany[4].equals(this.stany[7]) && this.stany[1] != 0 && this.stany[4] != 0 && this.stany[7] != 0) {
            koniec_gry(this.stany[1]);
        }
        if (this.stany[2].equals(this.stany[5]) && this.stany[5].equals(this.stany[8]) && this.stany[2] != 0 && this.stany[5] != 0 && this.stany[8] != 0) {
            koniec_gry(this.stany[2]);
        }

        // X
        // X
        if (this.stany[0].equals(this.stany[4]) && this.stany[4].equals(this.stany[8]) && this.stany[0] != 0 && this.stany[4] != 0 && this.stany[8] != 0) {
            koniec_gry(this.stany[0]);
        }
        if (this.stany[2].equals(this.stany[4]) && this.stany[4].equals(this.stany[6]) && this.stany[2] != 0 && this.stany[4] != 0 && this.stany[6] != 0) {
            koniec_gry(this.stany[2]);
        }

        // ---
        // ---
        // ---
        if (this.stany[0].equals(this.stany[1]) && this.stany[1].equals(this.stany[2]) && this.stany[0] != 0 && this.stany[1] != 0 && this.stany[2] != 0) {
            koniec_gry(this.stany[0]);
        }
        if (this.stany[3].equals(this.stany[4]) && this.stany[4].equals(this.stany[5]) && this.stany[3] != 0 && this.stany[4] != 0 && this.stany[5] != 0) {
            koniec_gry(this.stany[3]);
        }
        if (this.stany[6].equals(this.stany[7]) && this.stany[7].equals(this.stany[8]) && this.stany[6] != 0 && this.stany[7] != 0 && this.stany[8] != 0) {
            koniec_gry(this.stany[6]);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button1 = (ImageButton) findViewById(R.id.imageButton1);
        this.button2 = (ImageButton) findViewById(R.id.imageButton2);
        this.button3 = (ImageButton) findViewById(R.id.imageButton3);
        this.button4 = (ImageButton) findViewById(R.id.imageButton4);
        this.button5 = (ImageButton) findViewById(R.id.imageButton5);
        this.button6 = (ImageButton) findViewById(R.id.imageButton6);
        this.button7 = (ImageButton) findViewById(R.id.imageButton7);
        this.button8 = (ImageButton) findViewById(R.id.imageButton8);
        this.button9 = (ImageButton) findViewById(R.id.imageButton9);
        this.reset_button = (Button) findViewById(R.id.reset_button);
        this.textview = (TextView) findViewById(R.id.textView);

        reset();

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[0] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button1.setImageResource(R.mipmap.kolko);
                } else {
                    button1.setImageResource(R.mipmap.krzyzyk);
                }
                stany[0] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[1] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button2.setImageResource(R.mipmap.kolko);
                } else {
                    button2.setImageResource(R.mipmap.krzyzyk);
                }
                stany[1] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[2] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button3.setImageResource(R.mipmap.kolko);
                } else {
                    button3.setImageResource(R.mipmap.krzyzyk);
                }
                stany[2] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[3] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button4.setImageResource(R.mipmap.kolko);
                } else {
                    button4.setImageResource(R.mipmap.krzyzyk);
                }
                stany[3] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[4] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button5.setImageResource(R.mipmap.kolko);
                } else {
                    button5.setImageResource(R.mipmap.krzyzyk);
                }
                stany[4] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[5] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button6.setImageResource(R.mipmap.kolko);
                } else {
                    button6.setImageResource(R.mipmap.krzyzyk);
                }
                stany[5] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[6] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button7.setImageResource(R.mipmap.kolko);
                } else {
                    button7.setImageResource(R.mipmap.krzyzyk);
                }
                stany[6] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[7] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button8.setImageResource(R.mipmap.kolko);
                } else {
                    button8.setImageResource(R.mipmap.krzyzyk);
                }
                stany[7] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stany[8] != 0 || wygrany != 0) return;
                if (kolej_gracza1) {
                    button9.setImageResource(R.mipmap.kolko);
                } else {
                    button9.setImageResource(R.mipmap.krzyzyk);
                }
                stany[8] = kolej_gracza1 ? 1 : 2;
                sprawdz_koniec_gry();
                kolej_gracza1 = !kolej_gracza1;
            }
        });
    }
}
