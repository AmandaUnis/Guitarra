/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amand
 */
package guitarra;
// declaração de classe
public class Guitarra {
    
    private String numeroSerie, fabricante, modelo, tipo, madeira;
    private double preco; 

    // criação do construtor da classe guitarra
    public Guitarra(
            String numeroSerie, String fabricante,
            String modelo, String tipo, 
            String madeira, double preco){
       this.numeroSerie = numeroSerie;
       this.fabricante = fabricante; 
       this.modelo = modelo;
       this.tipo = tipo;
       this.madeira = madeira;
       this.preco = preco;              
}
public String getNumeroSerie(){
        return numeroSerie;
}
public void setNumeroserie(String numeroSerie){
    this.numeroSerie = numeroSerie;
}
public String getFabricante(){
        return fabricante;
}
public void setFabricante(String fabricante){
    this.fabricante = fabricante;
}
public String getModelo(){
        return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public String getTipo(){
        return tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
public String getMadeira(){
        return madeira;
}
public void setMadeira(String madeira){
    this.madeira = madeira;
}
public double getPreco(){
        return preco;
}
public void setPreco(double preco){
    this.preco = preco;
}
// O método main() é o método principal da classe 
public static void main(String[] args) {
    //Instanciamos um objeto chamado "minhaGuitarra" que será do tipo Guitarrra
    //Os valores passados são usados pelo construtor da classe para criar 
    //o objeto
    
    Guitarra MinhaGuitarra = new Guitarra("01020304", "fender", "Telecaster", 
                                 "Elétrica", "Magno", 1500);
    
//Testando os dados da classe, imprimindo a saía simples no terminal
    System.out.println(minhaGuitarra.getNumeroSerie());
    System.out.println(minhaGuitarra.getMadeira());
    System.out.println(minhaGuitarra.getPreço());
    System.out.println(minhaGuitarra.getTipo());
    }
}
