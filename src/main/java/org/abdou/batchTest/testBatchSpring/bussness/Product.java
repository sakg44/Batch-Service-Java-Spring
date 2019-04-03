package org.abdou.batchTest.testBatchSpring.bussness;


public class Product {
	
	private int id;
	

    private String nom;
	

    private int prix;
	
	private int prixDachat;
    
    
    
	public Product() {
		super();
	}
	
	



	public Product(int id, String nom, int prix, int prixDachat) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.prixDachat = prixDachat;
	}





	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public int getPrixDachat() {
		return prixDachat;
	}



	public void setPrixDachat(int prixDachat) {
		this.prixDachat = prixDachat;
	}





    
    
    

}
