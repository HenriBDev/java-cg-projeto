package breakout.java.Motor.Componentes._2D;

import breakout.java.Motor.Componentes.BaseComponente;

public abstract class BaseComponente2D<tipoComponente> extends BaseComponente<tipoComponente> 
{
    public tipoComponente redimensionarComponente(float novaLargura, float novaAltura)
    {
        this.largura = novaLargura;
        this.altura = novaAltura;
        return (tipoComponente) this;
    }
    
    public tipoComponente alterarEspessuraBorda(float novaEspessura)
    {
        this.espessuraBorda = novaEspessura;
        return (tipoComponente) this;
    }
}
