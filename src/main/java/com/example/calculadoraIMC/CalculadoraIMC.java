package com.example.calculadoraIMC;

import java.util.Objects;

public class CalculadoraIMC{



    public String calcularImc(double peso, double altura, int idade, String sexo){


        double imc = peso/(altura*altura);
        String fraseResultado = "";

        if(idade >= 20 && idade <= 65){

            if(imc<16){
                fraseResultado = "Baixo peso muito grave";
            }
            if(imc>=16 && imc< 16.99){
                fraseResultado = "Baixo peso grave";
            }

            if(imc>=16.99 && imc< 18.49){
                fraseResultado = "Baixo peso";
            }

            if(imc>=18.49 && imc< 24.99){
                fraseResultado = "Peso normal";
            }

            if(imc>=24.99 && imc< 29.99){
                fraseResultado = "Sobrepeso";
            }

            if(imc>=29.99 && imc< 34.99){
                fraseResultado = "Obesidade grau I";
            }

            if(imc>=34.99 && imc<= 39.99){
                fraseResultado = "Obesidade grau II";
            }

            if(imc> 39.99){
                fraseResultado = "Obesidade grau III (obesidade mórbida)";
            }

        }


        if(idade>65){

            if(Objects.equals(sexo, "masculino")){

                if(imc<21.9){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=21.9 && imc <27){
                    fraseResultado = "Peso normal";
                }
                if(imc>=27 && imc <30){
                    fraseResultado = "Sobrepeso";
                }
                if(imc>=30 && imc <35){
                    fraseResultado = "Obesidade grau I";
                }

                if(imc>=35 && imc <=39.9){
                    fraseResultado = "Obesidade grau II";
                }

                if(imc >39.9){
                    fraseResultado = "Obesidade grau III (obesidade mórbida)";
                }


            }

            else{
                if(imc<21.9){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=21.9 && imc<27){
                    fraseResultado = "Peso normal";
                }
                if(imc>=27 && imc <32){
                    fraseResultado = "Sobrepeso";
                }
                if(imc>=32 && imc <37){
                    fraseResultado = "Obesidade grau I";
                }

                if(imc>=37 && imc <=41.9){
                    fraseResultado = "Obesidade grau II";
                }

                if(imc >41.9){
                    fraseResultado = "Obesidade grau III (obesidade mórbida)";
                }
            }


        }

        if(idade == 2){
            if(Objects.equals(sexo, "masculino")){
                if(imc<14.8){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=14.8 && imc <18.2){
                    fraseResultado = "Peso normal";
                }
                if(imc>=18.2 && imc <=19.2){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >19.2){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<14.4){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=14.4 && imc <18){
                    fraseResultado = "Peso normal";
                }
                if(imc>=18 && imc <=19){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >19){
                    fraseResultado = "Obesidade";
                }

            }

        }




        if(idade == 4){
            if(Objects.equals(sexo, "masculino")){
                if(imc<14){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=14 && imc <17){
                    fraseResultado = "Peso normal";
                }
                if(imc>=17 && imc <=18){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >18){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<13.8){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=13.8 && imc <16.8){
                    fraseResultado = "Peso normal";
                }
                if(imc>=16.8 && imc <=18){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >18){
                    fraseResultado = "Obesidade";
                }

            }

        }


        if(idade == 6){
            if(Objects.equals(sexo, "masculino")){
                if(imc<13.6){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=13.6 && imc <17){
                    fraseResultado = "Peso normal";
                }
                if(imc>=17 && imc <=18.3){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >18.3){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<13.4){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=13.4 && imc <17){
                    fraseResultado = "Peso normal";
                }
                if(imc>=17 && imc <=18.7){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >18.7){
                    fraseResultado = "Obesidade";
                }

            }

        }


        if(idade == 8){
            if(Objects.equals(sexo, "masculino")){
                if(imc<13.8){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=13.8 && imc <18){
                    fraseResultado = "Peso normal";
                }
                if(imc>=18 && imc <=20){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >20){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<13.6){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=13.6 && imc <18.3){
                    fraseResultado = "Peso normal";
                }
                if(imc>=18.3 && imc <=20.6){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >20.6){
                    fraseResultado = "Obesidade";
                }

            }

        }


        if(idade == 10){
            if(Objects.equals(sexo, "masculino")){
                if(imc<14.2){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=14.2 && imc <19.4){
                    fraseResultado = "Peso normal";
                }
                if(imc>=19.4 && imc <=22){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >22){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<14){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=14 && imc <20){
                    fraseResultado = "Peso normal";
                }
                if(imc>=20 && imc <=23){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >23){
                    fraseResultado = "Obesidade";
                }

            }

        }


        if(idade == 12){
            if(Objects.equals(sexo, "masculino")){
                if(imc<15){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=15 && imc <21){
                    fraseResultado = "Peso normal";
                }
                if(imc>=21 && imc <=24){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >24){
                    fraseResultado = "Obesidade";
                }
            }
            else{
                if(imc<15){
                    fraseResultado = "Baixo peso";
                }
                if(imc>=15 && imc <21.7){
                    fraseResultado = "Peso normal";
                }
                if(imc>=21.7 && imc <=25){
                    fraseResultado = "Sobrepeso";
                }
                if(imc >25){
                    fraseResultado = "Obesidade";
                }

            }

        }

        return fraseResultado;

    }
}
