Algoritmo OTX0
	precio<-0
	cantidad<-0
	productos<-1
	resultado<-0
	
	Escribir "¿Cuantos productos llevas?"
	Leer cantidad
	Mientras productos<=cantidad Hacer
		Escribir "Dame el precio del producto #", + productos
		Leer precio
		resultado<-resultado+precio
	     productos<-productos+1
	Fin Mientras

	Si resultado>500 Entonces
		resultado<-resultado-(resultado*0.20)
		Escribir "Tu Total a pagar es de: $",+resultado
		
	SiNo
		Escribir "Tu Total a pagar es de: $",+resultado
	Fin Si
FinAlgoritmo
