# Batch Application using SPRING
## @author: Serigne abdou Khadre Gueye

Cet projet permet recuperer des données, dans un fichier, et d'inserer ces donées  dans une base de données Mysql.

*	Packaging on: **orb.abdou.batchTest.**

1.  . 		**TestBatSpring**
	C'est la classe de demarrager de l'application 
2.	.*bussness*. 		** Product**
	C'est la classe model qui va consommer les données du fichier en instance de Product
3.	.*jobs*.		** BatchConfiguration**
	comme son nom l'indiue elle permet de configurer l'application grace aux annotations
4.	.*listenerResult*.
		
5.	.*processor*. **ProductItemProcessor**
	cette classe fait du mappage ici on recupere juste le nom on le met en majuscule

	