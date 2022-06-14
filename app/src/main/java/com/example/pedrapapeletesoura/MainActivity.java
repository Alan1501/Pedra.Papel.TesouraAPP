package com.example.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void SelecionarPedra(View view){
    System.out.println("Selecionou Pedra");
    this.SelecionarOP("Pedra");


    }

    public void SelecionarPapel(View view){
        System.out.println("Selecionou Papel");
        this.SelecionarOP("Papel");


    }
    public void SelecionarTesoura(View view){
        System.out.println("Selecionou tesoura");
        this.SelecionarOP("Tesoura");


    }
    public void SelecionarOP(String SelecionarOP){

        ImageView TView = findViewById(R.id.TView);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[ numero];

        switch (opcaoApp) {
            case "Pedra":
                    TView.setImageResource(R.drawable.pedra);
                break;
            case "Tesoura":
                TView.setImageResource(R.drawable.tesoura);
                break;
            case "Papel":
                TView.setImageResource(R.drawable.papel);
                break;
        }

        if(
                (opcaoApp == "Tesoura" && SelecionarOP == "Papel") ||
                        (opcaoApp == "Papel" && SelecionarOP == "Pedra") ||
        (opcaoApp == "Pedra" && SelecionarOP == "Tesoura")

        ){//App ganhador
            System.out.println("App Venceu");
            TextView texto = findViewById(R.id.Resultado);
            texto.setText("App Venceu");
        }else if (
                (opcaoApp == "Papel" && SelecionarOP == "Tesoura") ||
                         (opcaoApp == "Pedra" && SelecionarOP == "Papel") ||
                        (opcaoApp == "Tesoura" && SelecionarOP == "Pedra")
        )
        {//Usuario ganhador
            System.out.println("Voce Ganhou");
            TextView texto = findViewById(R.id.Resultado);
            texto.setText( "Voce Ganhou" );
        }else {
            System.out.println("Empate");
            TextView texto = findViewById(R.id.Resultado);
            texto.setText( "Empate");
        } {// empate

        }
        System.out.println( "item clicado: " + numero );
        TextView texto = findViewById(R.id.ResultadoAPP);
        texto.setText( " " + opcaoApp);
    }
}