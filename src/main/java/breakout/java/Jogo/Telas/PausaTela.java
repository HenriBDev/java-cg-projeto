package breakout.java.Jogo.Telas;

import breakout.java.Resolucao;
import breakout.java.Motor.Componentes._2D.QuadrilateroComponente;
import breakout.java.Motor.Componentes._2D.TextoComponente;

public class PausaTela extends BaseTela {
    
    QuadrilateroComponente telaTransparente = new QuadrilateroComponente()
        .redimensionarComponente(Resolucao.SRUxMax - Resolucao.SRUxMin, Resolucao.SRUyMax - Resolucao.SRUyMin)
        .trocarCor(0, 0, 0, 1)
        .moverComponente(Resolucao.SRUxCentral, Resolucao.SRUyCentral, Resolucao.SRUzMax - 1);

    TextoComponente textoPausado;

    public PausaTela()
    {
        textoPausado = new TextoComponente("Jogo pausado (Pressione P para continuar)")
            .moverComponente(Resolucao.SRUxCentral, Resolucao.SRUyCentral, Resolucao.SRUzMax);
        componentes.add(telaTransparente);
        componentes.add(textoPausado);
    }

}
