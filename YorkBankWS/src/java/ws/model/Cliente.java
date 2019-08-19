/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.model;

import java.io.Serializable;

/**
 *
 * @author joaov
 */
public class Cliente implements Serializable{
    private int id;
    private String cpf;
    private String nome;
    private String pin;
    private Double saldo_incial;

    public Double getSaldo_incial() {
        return saldo_incial;
    }

    public void setSaldo_incial(Double saldo_incial) {
        this.saldo_incial = saldo_incial;
    }
   
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
