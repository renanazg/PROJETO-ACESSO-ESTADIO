/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menu;

import java.util.Scanner;

/**
 *
 * @author LUCAS
 */
public class Menu {


    public static void main(String[] args) {
        
        Bilheteria vender = new Bilheteria();  
       Funcionario removerFuncionario = new Funcionario(1, "Carla", 7, "Empregada", "556.632.255-32", "Rua Campinas, 88", "F", 26,"Topo do estádio");
       Funcionario op = new Funcionario(2, "SÉRGiO", 10, "Empregado", "321.998.124-77", "Rua Godfrey, 63", "M", 31,"Subsolo");
        
        
        for(int i=0; i<3;i++){
        System.out.println("Bem viando ao U.P. STADIUM\n");
        System.out.println("Por favor digite a opção que você deseja: \n");
        System.out.println("[1] BILHETERIA       [2] PESSOA             [3] JOGADOR");
        System.out.println("[4] JUIZ             [5] TORCEDOR           [6] CIDADE");
        System.out.println("[7] ESTADIO          [8] TIME               [9] JOGO");
        System.out.println("[10] VENDEDOR        [11] FUNCIONARIO       [12] ACESSO");
        Scanner ler = new Scanner (System.in);
        
         String escolha = ler.next();
      
    
        
        String Bilheteria = "BILHETERIA ";
        String Pessoa = "PESSOA";
        String Jogador = "JOGADOR";
        String Juiz = "JUIZ";
        String Torcedor = "TORCEDOR";
        String Cidade = "CIDADE";
        String Estadio = "ESTADIO";
        String Time = "TIME";
        String Jogo = "JOGO";
        String Vendedor = "VENDEDOR";
        String Funcionario = "FUNCIONARIO";
        String Acesso = "ACESSO";
                
        
        switch (escolha) {
            case "1":
                System.out.println("SUA ESCOLHA FOI: "+Bilheteria);
                i=4;
                vender.venderIngressos(200.58,100.29,850.69);
                vender.validarIngressoPorPessoa();
                break;
            case "2":
                System.out.println("SUA ESCOLHA FOI: " + Pessoa);
                i=4;
             
                break;
            case "3":
                System.out.println("SUA ESCOLHA FOI: " + Jogador);
                i=4;
                break;
            case "4":
                System.out.println("SUA ESCOLHA FOI: " + Juiz);
                
                i=4;
                break;
            case "5":
                System.out.println("SUA ESCOLHA FOI: " + Torcedor);
                i=4;
                break;
            case "6":
                System.out.println("SUA ESCOLHA FOI: " + Cidade);
                i=4;
                break;
                
             case "7":
             System.out.println("SUA ESCOLHA FOI: " + Estadio);
                i=4;
                break;
            case "8":
                System.out.println("SUA ESCOLHA FOI: " + Time);
                i=4;
                break;
                
                case "9":
                System.out.println("SUA ESCOLHA FOI: " + Jogo);
                i=4;
                break;
                
                case "10":
                System.out.println("SUA ESCOLHA FOI: " + Vendedor);
                i=4;
                break;
                
                case "11":
                System.out.println("SUA ESCOLHA FOI: " + Funcionario);
              
                Scanner ler2 = new Scanner(System.in);
                
                
                System.out.println("Escolha uma das opções:\n \n[1]REMOVER FUNCIONÁRIO");
                System.out.println("[2]ATUALIZAR FUNCIONÁRIO");
                String escolher = ler2.nextLine();
                
                
                 if(escolher.equals("1" )){
                     System.out.println("Escolha a pessoa a ser removida: [1]CARLOS, [2]SÉRGIO,");
                     escolher = ler2.nextLine();
                     if(escolher.equals("1")){
                         System.out.println(removerFuncionario+" foi removido");
                     } if(escolher.equals("2")){
                         System.out.println(op+" foi removido");
                     }else{
                         System.out.println("");
                     }
                    
                
                 if(escolher.equals("2")){
                    
                 }
                   
            
                 }
                 else{
            System.out.println("Selecione uma opção válida");
           
        }
                i=4;
                break;
                
                case "12":
                System.out.println("Sua escolha foi: " + Acesso);
                i=4;
                break;             
               
                
                default: 
                    System.out.println("\n\nA OPÇÃO DIGITADA É INVALIDA, INFORME UM NUMERO DE 1 Á 12!!\n\n");
                     i=0;                      
                break;
        }
        }

    }
}
