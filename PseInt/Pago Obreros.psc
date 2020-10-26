Algoritmo Salario_Semanal
	nombre<-""
	horas<-0
	horasext<-0
	pago<-0
	pagoext<-0
	total<-0

	Escribir "Por favor digame su nombre: "
	leer nombre
	Escribir ""
	Escribir "Digame cúantas horas trabajó esta semana"
	leer horas 
	Escribir ""
	 Si horas<0  o horas>72 Entonces
		 
	 Mientras horas<0  o horas>72 Hacer
		 Escribir "Ese numero de horas es invalido, por favor escribalo de nuevo"
		 leer horas
	 Fin Mientras
 SiNo
	 Si horas<=40 Entonces
		 pago<-horas*16
		 total<-pago+pagoext
		 Escribir "Su paga total de la seman es de: $", total
		 
	 SiNo
		 horase<-horas-40
		 horas<-horas-horasext
		 pago<-horas*16
		 pagoext<-horasext*20
		 total<-pago+pagoext
		 Escribir nombre, ", su paga total de la semana es de: $", total
	 Fin Si
 Fin Si
	

FinAlgoritmo
