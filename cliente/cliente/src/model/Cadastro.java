/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "cadastro")
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c"),
    @NamedQuery(name = "Cadastro.findByIdcadastro", query = "SELECT c FROM Cadastro c WHERE c.idcadastro = :idcadastro"),
    @NamedQuery(name = "Cadastro.findByNomecliente", query = "SELECT c FROM Cadastro c WHERE c.nomecliente = :nomecliente")})
public class Cadastro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcadastro")
    private Integer idcadastro;
    @Basic(optional = false)
    @Column(name = "nomecliente")
    private String nomecliente;

    public Cadastro() {
    }

    public Cadastro(Integer idcadastro) {
        this.idcadastro = idcadastro;
    }

    public Cadastro(Integer idcadastro, String nomecliente) {
        this.idcadastro = idcadastro;
        this.nomecliente = nomecliente;
    }

    public Integer getIdcadastro() {
        return idcadastro;
    }

    public void setIdcadastro(Integer idcadastro) {
        this.idcadastro = idcadastro;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcadastro != null ? idcadastro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.idcadastro == null && other.idcadastro != null) || (this.idcadastro != null && !this.idcadastro.equals(other.idcadastro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cadastro[ idcadastro=" + idcadastro + " ]";
    }
    
}
