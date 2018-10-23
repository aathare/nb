package com.bfs.nbpocdao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "acbk")
public class AccountBook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tdate")
	@DateTimeFormat
    private Date tdate ;
	
	@Column(name = "drcr")
	private String drcr;
	  
	@Column(name = "cashtrf")
	private String cashtrf;
	  
	@Column(name = "prtclr")
	private String prtclr;
	  
	@Column(name = "acmastcode")
	private Integer glcode;
	  
	@Column(name = "ac_no")
	private Integer acno;
	
	 
	@Column(name = "debit")
	private Integer debit;
	
	@Column(name = "credit")

	private Integer credit;

	  
	
	@Override
	public String toString() {
		return "acbk [id=" + id + ", tdate=" + tdate + ", drcr=" + drcr + ", cashtrf=" + cashtrf + ", prtclr=" + prtclr
				+ ", glcode=" + glcode + ", acno=" + acno + ", debit=" + debit + ", credit=" + credit + "]";
	}

	  
		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public Date getTdate() {
			return tdate;
		}



		public void setTdate(Date tdate) {
			this.tdate = tdate;
		}



		public String getDrcr() {
			return drcr;
		}



		public void setDrcr(String drcr) {
			this.drcr = drcr;
		}



		public String getCashtrf() {
			return cashtrf;
		}



		public void setCashtrf(String cashtrf) {
			this.cashtrf = cashtrf;
		}



		public String getPrtclr() {
			return prtclr;
		}



		public void setPrtclr(String prtclr) {
			this.prtclr = prtclr;
		}



		public Integer getGlcode() {
			return glcode;
		}



		public void setGlcode(Integer glcode) {
			this.glcode = glcode;
		}



		public Integer getAcno() {
			return acno;
		}



		public void setAcno(Integer acno) {
			this.acno = acno;
		}



		public Integer getDebit() {
			return debit;
		}



		public void setDebit(Integer debit) {
			this.debit = debit;
		}



		public Integer getCredit() {
			return credit;
		}



		public void setCredit(Integer credit) {
			this.credit = credit;
		}

	
	
}
