package models;
@FunctionalInterface
public interface Promocional {

     boolean aplicarDesconto(double percentagem);
    default boolean aplicarDescontoDefault(double percentagem){
        return aplicarDesconto(10);
    }
}
