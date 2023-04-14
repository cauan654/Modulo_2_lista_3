import java.util.ArrayList;
public class Musica {
    String nome;
    int duracaoSegundos;
    int popularidade;
    String genero;
}

public class Album {
    String nome;
    String nomeArtista;
    Arraylist<Musica> musicas;

    getMusicaMaiorPopularidade() {
        MaiorPopularidade = new Musica();
        for(int i=0; i < Musica; i++){
            if(musicas.get(i).popularidade > maior.popularidade){
                MaiorPopularidade = musicas.get(i);
            }
        }
        return MaiorPopularidade;
    }

    getMusicaMenorDuracao(){
        MenorDuracao = new Musica();
        for(int i=0; i < Musica; i++){
            if(musicas.get(i).duracao > menor.duracao) {
                MenorDuracao = musicas.get(i);
            }
            return MenorDuracao
    }
}
