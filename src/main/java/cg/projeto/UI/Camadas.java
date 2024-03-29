package cg.projeto.UI;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cg.projeto.UI.Componentes.ComponenteBase;
import cg.projeto.UI.Componentes.Label;
import cg.projeto.UI.Componentes.Quadrilatero;

public class Camadas {

    // A camada mais baixa fica atrás
    public static List<ComponenteBase> TEXTO = new ArrayList<ComponenteBase>();
    public static List<ComponenteBase> MAIN = new ArrayList<ComponenteBase>();

    public void desenharCamadas(){
        
        for (Field camada : Camadas.class.getDeclaredFields()){

            ArrayList<ComponenteBase> objElementosCamada = null;

            try{ objElementosCamada = (ArrayList<ComponenteBase>) camada.get(this);}
            catch (IllegalAccessException e) {}

            for(int index = objElementosCamada.size() - 1; index >= 0; index--){
                objElementosCamada.get(index).desenharElemento();
            }

        }

    }

    public void limparCamadas(){

        for (Field camada : Camadas.class.getDeclaredFields()){

            ArrayList<ComponenteBase> objElementosCamada = null;

            try{ objElementosCamada = (ArrayList<ComponenteBase>) camada.get(this);}
            catch (IllegalAccessException e) {}

            if (objElementosCamada.size() > 0) objElementosCamada.clear();
        }

    }

}
