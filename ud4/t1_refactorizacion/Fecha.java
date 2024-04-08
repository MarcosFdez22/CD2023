package com.example.project;

public class Fecha {
	
private int dia;
private int mes;
private int ano;

public Fecha(int dia, int mes, int ano) {
	
this.dia = dia;
this.mes = mes;
this.ano = ano;

}

public boolean esValido(){
	
	if ((dia < 1 || dia > 31)||(mes < 1 || mes > 12)) { 
		return false;
	}

// determinamos la cantidad de días del mes:

int diasMes = 0;

	if(mes==1 || mes==3 || mes==5 || mes==7|| mes==8|| mes==10 || mes== 12) {
		diasMes = 31;	
	}else if(mes==4||mes==6||mes==9||mes==11){
		diasMes = 30;
	}else if(mes==2){
		if ( (ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) ) ) {
			diasMes = 29;
		}else{
			diasMes = 28;}
    }
	
	if(dia > diasMes) {
		return false;
	}else{
		return true;	
	}
	}
}
