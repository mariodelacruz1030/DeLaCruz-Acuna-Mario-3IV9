Algoritmo sin_titulo
	total<-0
	horastotal<-0
	horasext<-0
	horain<-0
	horaout<-0
	apoyo<-0
	apoyo2<-0
	
	Escribir "Bienvenido, por favor indique sus horas de entrada y salida hagalo en formato militar"
	Escribir "Ejemplo: 16:00=1600, 21:35=2135, 2:07=0207"
	
	Escribir "Digame su hora de entrada"
	Leer horain
	Escribir "Digame su hora de salida"
	Leer horaout
	horastotal<-horaout-horain
	
	Si horastotal<=100 Entonces
		total<-10
	SiNo
		horasext<-horastotal-100
		apoyo<-trunc(horasext/100)
		apoyo2<-(horasext/100)-(trunc(horasext/100))
		
		Si apoyo2<1 y apoyo2>0 Entonces
			total<-10+60+(apoyo*60)
		SiNo
			total<-10+(apoyo*60)
		FinSi
	FinSi
	
	Escribir "Su total a pagar es de: $", total
FinAlgoritmo
