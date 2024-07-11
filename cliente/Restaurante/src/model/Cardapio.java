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
@Table(name = "cardapio")
@NamedQueries({
    @NamedQuery(name = "Cardapio.findAll", query = "SELECT c FROM Cardapio c"),
    @NamedQuery(name = "Cardapio.findByIdcardapio", query = "SELECT c FROM Cardapio c WHERE c.idcardapio = :idcardapio"),
    @NamedQuery(name = "Cardapio.findByPratoproteico", query = "SELECT c FROM Cardapio c WHERE c.pratoproteico = :pratoproteico"),
    @NamedQuery(name = "Cardapio.findByOvolactovegetariano", query = "SELECT c FROM Cardapio c WHERE c.ovolactovegetariano = :ovolactovegetariano"),
    @NamedQuery(name = "Cardapio.findByGuarnicao", query = "SELECT c FROM Cardapio c WHERE c.guarnicao = :guarnicao"),
    @NamedQuery(name = "Cardapio.findBySaladas", query = "SELECT c FROM Cardapio c WHERE c.saladas = :saladas"),
    @NamedQuery(name = "Cardapio.findBySuco", query = "SELECT c FROM Cardapio c WHERE c.suco = :suco"),
    @NamedQuery(name = "Cardapio.findBySobremesa", query = "SELECT c FROM Cardapio c WHERE c.sobremesa = :sobremesa"),
    @NamedQuery(name = "Cardapio.findByDia", query = "SELECT c FROM Cardapio c WHERE c.dia = :dia")})
public class Cardapio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcardapio")
    private Integer idcardapio;
    @Basic(optional = false)
    @Column(name = "pratoproteico")
    private String pratoproteico;
    @Basic(optional = false)
    @Column(name = "ovolactovegetariano")
    private String ovolactovegetariano;
    @Basic(optional = false)
    @Column(name = "guarnicao")
    private String guarnicao;
    @Basic(optional = false)
    @Column(name = "saladas")
    private String saladas;
    @Basic(optional = false)
    @Column(name = "suco")
    private String suco;
    @Basic(optional = false)
    @Column(name = "sobremesa")
    private String sobremesa;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;

    public Cardapio() {
    }

    public Cardapio(Integer idcardapio) {
        this.idcardapio = idcardapio;
    }

    public Cardapio(Integer idcardapio, String pratoproteico, String ovolactovegetariano, String guarnicao, String saladas, String suco, String sobremesa, String dia) {
        this.idcardapio = idcardapio;
        this.pratoproteico = pratoproteico;
        this.ovolactovegetariano = ovolactovegetariano;
        this.guarnicao = guarnicao;
        this.saladas = saladas;
        this.suco = suco;
        this.sobremesa = sobremesa;
        this.dia = dia;
    }

    public Integer getIdcardapio() {
        return idcardapio;
    }

    public void setIdcardapio(Integer idcardapio) {
        this.idcardapio = idcardapio;
    }

    public String getPratoproteico() {
        return pratoproteico;
    }

    public void setPratoproteico(String pratoproteico) {
        this.pratoproteico = pratoproteico;
    }

    public String getOvolactovegetariano() {
        return ovolactovegetariano;
    }

    public void setOvolactovegetariano(String ovolactovegetariano) {
        this.ovolactovegetariano = ovolactovegetariano;
    }

    public String getGuarnicao() {
        return guarnicao;
    }

    public void setGuarnicao(String guarnicao) {
        this.guarnicao = guarnicao;
    }

    public String getSaladas() {
        return saladas;
    }

    public void setSaladas(String saladas) {
        this.saladas = saladas;
    }

    public String getSuco() {
        return suco;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcardapio != null ? idcardapio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cardapio)) {
            return false;
        }
        Cardapio other = (Cardapio) object;
        if ((this.idcardapio == null && other.idcardapio != null) || (this.idcardapio != null && !this.idcardapio.equals(other.idcardapio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cardapio[ idcardapio=" + idcardapio + " ]";
    }
    
}
