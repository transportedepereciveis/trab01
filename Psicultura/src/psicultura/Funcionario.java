/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psicultura;

/**
 *
 * @author marcelo
 */
public class Funcionario extends Pessoa{
    public Tanque tanque_do_func;
      public Funcionario(String nome, String cpf, String turno, String cidade, String bairro, String lorgadouro, String complemento, String cep, boolean permissao,Tanque tanque_do_func,String email,String telefone){
        super.nome=nome;
        super.cpf=cpf;
        super.turno=turno;
        super.cidade=cidade;  
        super.bairro=bairro;
        super.lorgadouro=lorgadouro;
        super.complemento=complemento;
        super.cep=cep;
        super.permissao=permissao;        
        this.tanque_do_func=tanque_do_func;
        super.listadecontatos=new String[2];
        super.listadecontatos[0] = email;
        super.listadecontatos[1] = telefone;
    }    
        
}
