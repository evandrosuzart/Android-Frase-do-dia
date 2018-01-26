package frasesdodia.studio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    String segunda = "Bendito quem inventou o belo truque do calendário, pois o bom da segunda-feira, do dia 1.º do mês e de cada ano novo é que nos dão a impressão de que a vida não continua, mas apenas recomeça.";
    String terca= "Uma Feliz Terça-Feira de reforçar fé, recompor forças e restaurar sonhos. Para uma vida plena, restriturada e abençoada debaixo da unção de Deus.";
    String quarta="Se quer ser feliz hoje é um bom dia para começar lutando por isso. Boa quarta-feira!";
    String quinta = "Se você deseja começar algo, não espere por semana que vem. \nPor que não começar em uma quinta-feira, ou até mesmo no sábado? \nNão deixe que o \"tarde demais\" te alcance.";
    String sexta = "Sozinho em casa em uma sexta-feira, deitado no chão pensando em um velho amor... Ou na falta de um.";
    String sabado = "Sábado. Uma taça de champagne. O CD que toca a mesma música. Um pote de nutella na geladeira. O bom e velho sorvete de flocos. O telefone ao alcance da mão. Um número decorado na cabeça. O desejo no corpo. E uma aflição no coração. Meninas, é aí que mora o perigo!";
    String domingo = "Amanhã vou estar mais suave\n" +
            "E quarta vai ser o meu dia\n" +
            "O fim-de-semana promete\n" +
            "Domingo vai ter que dar sol\n" +
            "Segunda vou acontecer\n" +
            "Não posso perder o teu show\n" +
            "Pro mês vou te visitar\n" +
            "É agora que eu saio de vez\n" +
            "Que bom que eu vou te encontrar\n" +
            "Amanhã vou estar mais feliz";
    private String[] frases = {domingo,segunda,terca,quarta,quinta,sexta,sabado};
    Date dia = new Date(System.currentTimeMillis());
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_WEEK);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.texto_nova_frase_id);
        botaoNovaFrase = (Button) findViewById(R.id.botao_nova_frase_id);

        textoNovaFrase.setText("Ao clicar no botão acima, teremos a frase de hoje! ");

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoNovaFrase.setText(frases[day-1]);
            }
        });




    }
}
