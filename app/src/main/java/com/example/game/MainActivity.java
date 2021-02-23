package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int cpuPoints=0,playerPoints=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have two images left dice and right dice
        // link the code to those two image view inside your layout.....(activity main)
        final ImageView cpuDie = findViewById(R.id.cpu_die);
        final ImageView playerDie = findViewById(R.id.player_die);
        final TextView tv_cpu = findViewById(R.id.cpu);
        final TextView tv_player = findViewById(R.id.player);
        final TextView tv_result = findViewById(R.id.result);
        Button Button1 = findViewById(R.id.btn_higher);
        Button Button2 = findViewById(R.id.btn_lower);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();
                int randCpuDie = rand.nextInt(6);
                int randPlayerDie = rand.nextInt(6);
                Log.d("cpu die",String.valueOf(randCpuDie));
                Log.d("player die",String.valueOf(randPlayerDie));

                cpuDie.setImageResource(diceArray[randCpuDie]);
                playerDie.setImageResource(diceArray[randPlayerDie]);
                // we need to create a random integer for picking the dices randomly!

                if(randPlayerDie>randCpuDie)
                {
                    tv_result.setText("USER WIN! ");
                    //   Toast.makeText(MainActivity.this,"YOU WIN!", Toast.LENGTH_SHORT).show();
                    //playerPoints++;
                }
                if(randPlayerDie<randCpuDie) {
                    tv_result.setText("COMPUTER WIN! ");
                }
                if(randCpuDie==randPlayerDie)
                {
                    tv_result.setText("IT'S A TIE!! ");
                    // Toast.makeText(MainActivity.this,"IT'S A TIE!", Toast.LENGTH_SHORT).show();
                }
                tv_cpu.setText("CPU : "+(int)(randCpuDie+1));
                tv_player.setText("YOU : "+(int)(randPlayerDie+1));

            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();
                int randCpuDie = rand.nextInt(6);
                int randPlayerDie = rand.nextInt(6);
                Log.d("cpu die",String.valueOf(randCpuDie));
                Log.d("player die",String.valueOf(randPlayerDie));

                cpuDie.setImageResource(diceArray[randCpuDie]);
                playerDie.setImageResource(diceArray[randPlayerDie]);
                // we need to create a random integer for picking the dices randomly!

                if(randPlayerDie<randCpuDie)
                {
                    tv_result.setText("USER WIN!");
                    //Toast.makeText(MainActivity.this,"COMPUTER WIN!", Toast.LENGTH_SHORT).show();
                    //playerPoints++;
                }
                if(randPlayerDie>randCpuDie) {
                    tv_result.setText("COMPUTER WIN!");
                }
                if(randCpuDie==randPlayerDie)
                {
                    tv_result.setText("IT'S A TIE!");
                    //Toast.makeText(MainActivity.this,"IT'S A TIE!", Toast.LENGTH_LONG).show();
                }
                tv_cpu.setText("CPU : "+(int)(randCpuDie+1));
                tv_player.setText("YOU : "+(int)(randPlayerDie+1));

            }
        });
    }



}
