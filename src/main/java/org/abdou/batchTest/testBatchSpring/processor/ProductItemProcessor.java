package org.abdou.batchTest.testBatchSpring.processor;

import org.abdou.batchTest.testBatchSpring.bussness.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

//permet de recuperer un donne et transformer 
public class ProductItemProcessor  implements ItemProcessor<Product, Product>{

    private static final Logger log = LoggerFactory.getLogger(ProductItemProcessor.class);
    
   //  public static int id=7;
	@Override
	public Product process(Product item) throws Exception {
		item.setNom(item.getNom().toUpperCase());
		item.setId(9);//penser a le gerer auto ? hibernate auto
		//id++;
		log.debug("le produit :" +item.getNom()+" "+ "a comme id:" +item.getId());
		return item;
	}

}
