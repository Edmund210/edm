/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Apli1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Francimar
 */
@Entity
@Table(name = "cf5", catalog = "cf0", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cf5.findAll", query = "SELECT c FROM Cf5 c"),
    @NamedQuery(name = "Cf5.findByCodigo", query = "SELECT c FROM Cf5 c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cf5.findByNome", query = "SELECT c FROM Cf5 c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cf5.findByEndereco", query = "SELECT c FROM Cf5 c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cf5.findByTelefone", query = "SELECT c FROM Cf5 c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cf5.findByRg", query = "SELECT c FROM Cf5 c WHERE c.rg = :rg"),
    @NamedQuery(name = "Cf5.findByCpf", query = "SELECT c FROM Cf5 c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cf5.findByProduto", query = "SELECT c FROM Cf5 c WHERE c.produto = :produto"),
    @NamedQuery(name = "Cf5.findByValor", query = "SELECT c FROM Cf5 c WHERE c.valor = :valor"),
    @NamedQuery(name = "Cf5.findByDesconto", query = "SELECT c FROM Cf5 c WHERE c.desconto = :desconto"),
    @NamedQuery(name = "Cf5.findByTotal", query = "SELECT c FROM Cf5 c WHERE c.total = :total"),
    @NamedQuery(name = "Cf5.findByObservacao", query = "SELECT c FROM Cf5 c WHERE c.observacao = :observacao")})
public class Cf5 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "rg")
    private String rg;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "produto")
    private String produto;
    @Column(name = "valor")
    private String valor;
    @Column(name = "desconto")
    private String desconto;
    @Column(name = "total")
    private String total;
    @Column(name = "observacao")
    private String observacao;

    public Cf5() {
    }

    public Cf5(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        changeSupport.firePropertyChange("produto", oldProduto, produto);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        String oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        String oldDesconto = this.desconto;
        this.desconto = desconto;
        changeSupport.firePropertyChange("desconto", oldDesconto, desconto);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        String oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cf5)) {
            return false;
        }
        Cf5 other = (Cf5) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Apli1.Cf5[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
