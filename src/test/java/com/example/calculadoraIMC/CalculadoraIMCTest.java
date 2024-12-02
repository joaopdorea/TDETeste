package com.example.calculadoraIMC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    CalculadoraIMC calculadora = new CalculadoraIMC();

    //Adulto 1
    @Test
    void testAdultoBaixoPesoMuitoGrave() {
        String resultado = calculadora.calcularImc(48.69, 1.75, 30, "masculino");
        assertEquals("Baixo peso muito grave", resultado);
    }
    //Adulto 2
    @Test
    void testAdultoBaixoPesoGraveInferior() {
        String resultado = calculadora.calcularImc(49, 1.75, 30, "feminino");
        assertEquals("Baixo peso grave", resultado);
    }
    //Adulto 3
    @Test
    void testAdultoBaixoPesoGraveSuperior() {
        String resultado = calculadora.calcularImc(52, 1.75, 30, "feminino");
        assertEquals("Baixo peso grave", resultado);
    }
    //Adulto 4
    @Test
    void testAdultoBaixoPesoInferior() {
        String resultado = calculadora.calcularImc(52.04, 1.75, 25, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Adulto 5
    @Test
    void testAdultoBaixoPesoSuperior() {
        String resultado = calculadora.calcularImc(56.59, 1.75, 25, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Adulto 6
    @Test
    void testAdultoPesoNormalInferior() {
        String resultado = calculadora.calcularImc(56.63, 1.75, 30, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Adulto 7
    @Test
    void testAdultoPesoNormalSuperior() {
        String resultado = calculadora.calcularImc(76.5, 1.75, 30, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Adulto 8
    @Test
    void testAdultoSobrepesoInferior() {
        String resultado = calculadora.calcularImc(76.54, 1.75, 40, "masculino");
        assertEquals("Sobrepeso", resultado);
    }
    //Adulto 9
    @Test
    void testAdultoSobrepesoSuperior() {
        String resultado = calculadora.calcularImc(91.8, 1.75, 40, "masculino");
        assertEquals("Sobrepeso", resultado);
    }
    //Adulto 10
    @Test
    void testAdultoObesidadeGrauIInferior() {
        String resultado = calculadora.calcularImc(91.85, 1.75, 35, "feminino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Adulto 11
    @Test
    void testAdultoObesidadeGrauISuperior() {
        String resultado = calculadora.calcularImc(107.12, 1.75, 35, "feminino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Adulto 12
    @Test
    void testAdultoObesidadeGrauIIInferior() {
        String resultado = calculadora.calcularImc(107.2, 1.75, 30, "masculino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Adulto 13
    @Test
    void testAdultoObesidadeGrauIISuperior() {
        String resultado = calculadora.calcularImc(122.4, 1.75, 30, "masculino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Adulto 14
    @Test
    void testAdultoObesidadeGrauIII() {
        String resultado = calculadora.calcularImc(122.5, 1.75, 40, "feminino");
        assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    // Testes para Idosos (> 65 anos)
    //Homem Idoso 1
    @Test
    void testIdosoMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(67.03, 1.75, 70, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Homem Idoso 2
    @Test
    void testIdosoMasculinoPesoNormalInferior() {
        String resultado = calculadora.calcularImc(67.07, 1.75, 70, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Homem Idoso 3
    @Test
    void testIdosoMasculinoPesoNormalSuperior() {
        String resultado = calculadora.calcularImc(82.65, 1.75, 70, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Homem Idoso 4
    @Test
    void testIdosoMasculinoSobrepesoInferior() {
        String resultado = calculadora.calcularImc(82.69, 1.75, 70, "masculino");
        assertEquals("Sobrepeso", resultado);
    }
    //Homem Idoso 5
    @Test
    void testIdosoMasculinoSobrepesoSuperior() {
        String resultado = calculadora.calcularImc(91.84, 1.75, 70, "masculino");
        assertEquals("Sobrepeso", resultado);
    }
    //Homem Idoso 6
    @Test
    void testIdosoMasculinoObesidadeGrauIInferior() {
        String resultado = calculadora.calcularImc(91.88, 1.75, 70, "masculino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Homem Idoso 7
    @Test
    void testIdosoMasculinoObesidadeGrauISuperior() {
        String resultado = calculadora.calcularImc(107.15, 1.75, 70, "masculino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Homem Idoso 8
    @Test
    void testIdosoMasculinoObesidadeGrauIIInferior() {
        String resultado = calculadora.calcularImc(107.19, 1.75, 70, "masculino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Homem Idoso 9
    @Test
    void testIdosoMasculinoObesidadeGrauIISuperior() {
        String resultado = calculadora.calcularImc(122.16, 1.75, 70, "masculino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Homem Idoso 10
    @Test
    void testIdosoMasculinoObesidadeGrauIII() {
        String resultado = calculadora.calcularImc(122.23, 1.75, 70, "masculino");
        assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }


    //Mulher Idosa 1
    @Test
    void testIdosoFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(56.03, 1.6, 70, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Mulher Idosa 2
    @Test
    void testIdosoFemininoPesoNormalInferior() {
        String resultado = calculadora.calcularImc(56.07, 1.6, 70, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Mulher Idosa 3
    @Test
    void testIdosoFemininoPesoNormalSuperior() {
        String resultado = calculadora.calcularImc(69.09, 1.6, 70, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Mulher Idosa 4
    @Test
    void testIdosoFemininoSobrepesoInferior() {
        String resultado = calculadora.calcularImc(69.2, 1.6, 70, "feminino");
        assertEquals("Sobrepeso", resultado);
    }
    //Mulher Idosa 5
    @Test
    void testIdosoFemininoSobrepesoSuperior() {
        String resultado = calculadora.calcularImc(81.89, 1.6, 70, "feminino");
        assertEquals("Sobrepeso", resultado);
    }
    //Mulher Idosa 6
    @Test
    void testIdosoFemininoObesidadeGrauIInferior() {
        String resultado = calculadora.calcularImc(82.2, 1.6, 70, "feminino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Mulher Idosa 7
    @Test
    void testIdosoFemininoObesidadeGrauISuperior() {
        String resultado = calculadora.calcularImc(94.69, 1.6, 70, "feminino");
        assertEquals("Obesidade grau I", resultado);
    }
    //Mulher Idosa 8
    @Test
    void testIdosoFemininoObesidadeGrauIIInferior() {
        String resultado = calculadora.calcularImc(94.8, 1.6, 70, "feminino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Mulher Idosa 9
    @Test
    void testIdosoFemininoObesidadeGrauIISuperior() {
        String resultado = calculadora.calcularImc(107.23, 1.6, 70, "feminino");
        assertEquals("Obesidade grau II", resultado);
    }
    //Mulher Idosa 10
    @Test
    void testIdosoFemininoObesidadeGrauIII() {
        String resultado = calculadora.calcularImc(107.3, 1.6, 70, "feminino");
        assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }



    //Criança 2 anos sexo masculino 1
    @Test
    void testCrianca2AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(9.46, 0.8, 2, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 2 anos sexo masculino 2
    @Test
    void testCrianca2AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(9.48, 0.8, 2, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 2 anos sexo masculino 3
    @Test
    void testCrianca2AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(11.65, 0.8, 2, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 2 anos sexo masculino 4
    @Test
    void testCrianca2AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(12.3, 0.8, 2, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 2 anos sexo feminino 1
    @Test
    void testCrianca2AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(5.18, 0.6, 2, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 2 anos sexo feminino 2
    @Test
    void testCrianca2AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(5.19, 0.6, 2, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 2 anos sexo feminino 3
    @Test
    void testCrianca2AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(6.48, 0.6, 2, "feminino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 2 anos sexo feminino 4
    @Test
    void testCrianca2AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(6.88, 0.6, 2, "feminino");
        assertEquals("Obesidade", resultado);
    }


    //Criança 4 anos sexo masculino 1
    @Test
    void testCrianca4AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(13.9, 1, 4, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 4 anos sexo masculino 2
    @Test
    void testCrianca4AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(14, 1, 4, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 4 anos sexo masculino 3
    @Test
    void testCrianca4AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(17, 1, 4, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 4 anos sexo masculino 4
    @Test
    void testCrianca4AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(18.1, 1, 4, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 4 anos sexo feminino 1
    @Test
    void testCrianca4AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(11.16, 0.9, 4, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 4 anos sexo feminino 2
    @Test
    void testCrianca4AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(11.18, 0.9, 4, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 4 anos sexo feminino 3
    @Test
    void testCrianca4AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(13.61, 0.9, 4, "feminino");
        assertEquals("Sobrepeso", resultado);
    }
    //Criança 4 anos sexo feminino 4

    @Test
    void testCrianca4AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(14.59, 0.9, 4, "feminino");
        assertEquals("Obesidade", resultado);
    }


    //Criança 6 anos sexo masculino 1
    @Test
    void testCrianca6AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(22.96, 1.3, 6, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 6 anos sexo masculino 2
    @Test
    void testCrianca6AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(22.99, 1.3, 6, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 6 anos sexo masculino 3
    @Test
    void testCrianca6AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(28.73, 1.3, 6, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 6 anos sexo masculino 4
    @Test
    void testCrianca6AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(30.95, 1.3, 6, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 6 anos sexo feminino 1
    @Test
    void testCrianca6AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(22.6, 1.3, 6, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 6 anos sexo feminino 2
    @Test
    void testCrianca6AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(22.7, 1.3, 6, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 6 anos sexo feminino 3
    @Test
    void testCrianca6AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(28.73, 1.3, 6, "feminino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 6 anos sexo feminino 4
    @Test
    void testCrianca6AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(31.62, 1.3, 6, "feminino");
        assertEquals("Obesidade", resultado);
    }


    //Criança 8 anos sexo masculino 1
    @Test
    void testCrianca8AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(27, 1.4, 8, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 8 anos sexo masculino 2
    @Test
    void testCrianca8AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(27.1, 1.4, 8, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 8 anos sexo masculino 3
    @Test
    void testCrianca8AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(35.3, 1.4, 8, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 8 anos sexo masculino 4
    @Test
    void testCrianca8AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(39.4, 1.4, 8, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 8 anos sexo feminino 1
    @Test
    void testCrianca8AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(26.63, 1.4, 8, "feminino");
        assertEquals("Baixo peso", resultado);
    }

    //Criança 8 anos sexo feminino 2
    @Test
    void testCrianca8AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(26.66, 1.4, 8, "feminino");
        assertEquals("Peso normal", resultado);
    }

    //Criança 8 anos sexo feminino 3
    @Test
    void testCrianca8AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(35.87, 1.4, 8, "feminino");
        assertEquals("Sobrepeso", resultado);
    }

//Criança 8 anos sexo feminino 4
    @Test
    void testCrianca8AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(40.4, 1.4, 8, "feminino");
        assertEquals("Obesidade", resultado);
    }


    //Criança 10 anos sexo masculino 1
    @Test
    void testCrianca10AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(29.83, 1.45, 10, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 10 anos sexo masculino 2
    @Test
    void testCrianca10AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(29.86, 1.45, 10, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 10 anos sexo masculino 3
    @Test
    void testCrianca10AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(40.8, 1.45, 10, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 10 anos sexo masculino 4
    @Test
    void testCrianca10AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(46.3, 1.45, 10, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 10 anos sexo feminino 1
    @Test
    void testCrianca10AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(29.41, 1.45, 10, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 10 anos sexo feminino 2
    @Test
    void testCrianca10AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(29.44, 1.45, 10, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 10 anos sexo feminino 3
    @Test
    void testCrianca10AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(42.08, 1.45, 10, "feminino");
        assertEquals("Sobrepeso", resultado);
    }
    //Criança 10 anos sexo feminino 4

    @Test
    void testCrianca10AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(48.4, 1.45, 10, "feminino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 12 anos sexo masculino 1
    @Test
    void testCrianca12AnosMasculinoBaixoPeso() {
        String resultado = calculadora.calcularImc(36.01, 1.55, 12, "masculino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 12 anos sexo masculino 2
    @Test
    void testCrianca12AnosMasculinoPesoNormal() {
        String resultado = calculadora.calcularImc(36.04, 1.55, 12, "masculino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 12 anos sexo masculino 3
    @Test
    void testCrianca12AnosMasculinoSobrepeso() {
        String resultado = calculadora.calcularImc(50.46, 1.55, 12, "masculino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 12 anos sexo masculino 4
    @Test
    void testCrianca12AnosMasculinoObesidade() {
        String resultado = calculadora.calcularImc(57.69, 1.55, 12, "masculino");
        assertEquals("Obesidade", resultado);
    }

    //Criança 12 anos sexo feminino 1
    @Test
    void testCrianca12AnosFemininoBaixoPeso() {
        String resultado = calculadora.calcularImc(38.37, 1.6, 12, "feminino");
        assertEquals("Baixo peso", resultado);
    }
    //Criança 12 anos sexo feminino 2
    @Test
    void testCrianca12AnosFemininoPesoNormal() {
        String resultado = calculadora.calcularImc(38.5, 1.6, 12, "feminino");
        assertEquals("Peso normal", resultado);
    }
    //Criança 12 anos sexo feminino 3
    @Test
    void testCrianca12AnosFemininoSobrepeso() {
        String resultado = calculadora.calcularImc(55.56, 1.6, 12, "feminino");
        assertEquals("Sobrepeso", resultado);
    }

    //Criança 12 anos sexo feminino 4
    @Test
    void testCrianca12AnosFemininoObesidade() {
        String resultado = calculadora.calcularImc(64.03, 1.6, 12, "feminino");
        assertEquals("Obesidade", resultado);
    }




}
