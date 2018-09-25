/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Pessoa {
    private String nome;
    private ArrayList<String> apelidos;
    private ArrayList<Integer> numeros;
    private ArrayList<Endereco> enderecos;
    
    
    public Pessoa(){
        this.apelidos = new ArrayList<>();
        this.numeros = new ArrayList<>();
        this.enderecos = new ArrayList<>();
              
    }
    public void setNumero(int numero){
        this.numeros.add(numero);
    }
    public void setApelido(String apelido){
        this.apelidos.add(apelido);
    }
    public void setEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
   
     public ArrayList<Endereco> getEnderecos(){
        return this.enderecos;
    }
    
    public ArrayList<Integer> getNumeros(){
        return this.numeros;
    }
    public ArrayList<String> getApelidos(){
        return this.apelidos;
    }
    
    
}
