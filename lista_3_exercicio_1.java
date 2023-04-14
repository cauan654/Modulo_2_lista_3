import java.util.ArrayList;
public class Main {
    public class Inimigo{
        int ataque = 1;
        int defesa = 1;
        int pontos = 1;
    }
    public class Heroi {
        int ataque = 1;
        int defesa = 1;
        int pontos = 1;
    }
    public class Mapa {
        String nome;
        int altura = 1;
        int largura = 1;
        ArrayList<Inimigo> inimigos;
        ArrayList<Heroi> herois;

        Inimigo getInimigoMaiorAtaque() {
            InimigoMaior = new Inimigo();
            for(int i=0; i < Inimigo; i++){
                if(inimigos.get(i).ataque > maior.ataque){
                    InimigoMaior = inimigos.get(i);
                }
            }
            return InimigoMaior;
        }
    }
}