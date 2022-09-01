package main.enums;

/**
 *When we add values like (1) and (2) for the enums we are passing parameters for the constructor, so then we have to add the constructor and the attribute  for the parameter
 */
public enum TipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALUE;

    TipoCliente(int value){
        this.VALUE = value;
    }

}
