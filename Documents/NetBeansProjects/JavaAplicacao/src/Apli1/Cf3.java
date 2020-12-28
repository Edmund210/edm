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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Francimar
 */
@Entity
@Table(name = "cf3", catalog = "cf0", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cf3.findAll", query = "SELECT c FROM Cf3 c"),
    @NamedQuery(name = "Cf3.findByMatricula", query = "SELECT c FROM Cf3 c WHERE c.matricula = :matricula"),
    @NamedQuery(name = "Cf3.findByNome", query = "SELECT c FROM Cf3 c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cf3.findByEndereco", query = "SELECT c FROM Cf3 c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cf3.findByTelefone", query = "SELECT c FROM Cf3 c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cf3.findByRg", query = "SELECT c FROM Cf3 c WHERE c.rg = :rg"),
    @NamedQuery(name = "Cf3.findByCpf", query = "SELECT c FROM Cf3 c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cf3.findByObservacao", query = "SELECT c FROM Cf3 c WHERE c.observacao = :observacao")})
public class Cf3 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private String matricula;
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
    @Column(name = "observacao")
    private String observacao;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public Cf3() {
    }

    public Cf3(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        String oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        byte[] oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cf3)) {
            return false;
        }
        Cf3 other = (Cf3) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Apli1.Cf3[ matricula=" + matricula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
