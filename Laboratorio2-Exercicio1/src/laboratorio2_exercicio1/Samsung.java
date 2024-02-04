package laboratorio2_exercicio1;

public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("galaxy8")){
            return new Galaxy8();
        }
        return null;
    }
    
}