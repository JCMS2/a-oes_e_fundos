
package projeto.açoes.e.fundo;

import javax.swing.JOptionPane;


public class ProjetoAçoesEFundo {

    
    public static void main(String[] args) {
     String numeroa,a1,a2,a3,a4,a5,cre,numerof,f1,f2,f3,f4,f5,kf,ganho; 
        float valora,total,a6,a7,a8,a9,a10,totalcre,cre2,totaldiv,valorf,f6,f7,f8,f9,f10,k,totalf,totalfu,ganhof,ganhofu,ganhototal;
        int opçao;
      opçao = Integer.parseInt( JOptionPane.showInputDialog("muito bem-vindo(a)aqui nos calculamos o preço das açoes e dos fundo imobiliario digite 1 para açoes e 2 para fundo imobiliario" ));
       
     switch(opçao){
        
        case 1:
           numeroa = JOptionPane.showInputDialog("qual o valor da açao? ");
            valora= Float.parseFloat(numeroa);
            JOptionPane.showMessageDialog(null,"coloque os redimentos dos ultimos 5 anos, ano por ano a seguir ");
            a1=JOptionPane.showInputDialog("digite o primeiro numero: ");
            a6= Float.parseFloat(a1);
            a2=JOptionPane.showInputDialog("digite o segundo numero: ");
            a7 = Float.parseFloat(a2);
            a3=JOptionPane.showInputDialog("digite o terceiro numero: ");
            a8 = Float.parseFloat(a3);
            a4=JOptionPane.showInputDialog("digite o quarto numero: ");
            a9= Float.parseFloat(a4);
            a5=JOptionPane.showInputDialog("digite o quinto numero: ");
            a10 = Float.parseFloat(a5);
            total = (a6+a7+a8+a9+a10)/5;
            cre= JOptionPane.showInputDialog("quantos porcento voce acha que a empresa vai crecer esse ano? ");
           cre2 = Float.parseFloat(cre);
            totalcre=(cre2/100);
            totaldiv= (total/totalcre);
            if (valora > totaldiv){
                JOptionPane.showMessageDialog(null,"a sua açao no mercado esta vendo \n"+numeroa+"\nmas de acorod com o nosso calculo o preço teto dessa açao para voce é de\n "+totaldiv+ " \n essa açao passou do seu preço teto, melhor esperar");
            } else if (valora == totaldiv){
                JOptionPane.showMessageDialog(null,"a sua açao no mercado esta vendo \n"+numeroa+"\nmas de acorod com o nosso calculo o preço teto dessa açao para voce é de\n "+totaldiv+ " \n essa açao esta no valor que ela vale,podes er uma boa hora para comprar");
            }
            else{
                JOptionPane.showMessageDialog(null, "a sua açao no mercado esta vendo \n"+numeroa+"\nmas de acorod com o nosso calculo o preço teto dessa açao para voce é de\n "+totaldiv+" \n essa açao esta abaixo do seu preço teto, pode ser uma boa escolhar comprar agora");
            }
            
            break;
        case 2 :
            numerof =JOptionPane.showInputDialog("qual o valor do fundo imobiliario: ");
            valorf = Float.parseFloat(numerof);
            JOptionPane.showMessageDialog(null, "coloque os redimentos dos ultimos 5 anos, ano por ano a seguir  ");
            f1 =JOptionPane.showInputDialog("digite o primeiro numero: ");
            f6=     Float.parseFloat(f1);
            f2 =JOptionPane.showInputDialog("digite o segundo numero: ");
            f7=     Float.parseFloat(f2);
            f3 =JOptionPane.showInputDialog("digite o terceiro numero: ");
            f8=     Float.parseFloat(f3);
            f4 =JOptionPane.showInputDialog("digite o quarto numero: ");
            f9=     Float.parseFloat(f4);
            f5 =JOptionPane.showInputDialog("digite o quinto numero: ");
            f10=     Float.parseFloat(f5);
            totalf= (f6+f7+f8+f9+f10)/5;
            ganho = JOptionPane.showInputDialog("quando voce acha que essa açao vai crecer esse ano? ");
             ganhof=Float.parseFloat(ganho);
             ganhofu= (ganhof/100);
            kf = JOptionPane.showInputDialog("coloque o valor da Rentabilidade anual \n (se nao sabe o que é isso voce pode pegar o site do tesouro direto no site a seguir https://www.tesourodireto.com.br/titulos/precos-e-taxas.htm): ");
            k = Float.parseFloat(kf);
            totalfu=(k+ganhof);
            ganhototal= totalf / totalfu;
           if (valorf > totalfu ){
               JOptionPane.showMessageDialog(null,"o fundo no mercado esta velendo \n "+valorf+ "\n de acordo com os nossos calculos o preço teto desse fundo é \n"+totalfu +"\n esse fundo imobiliario passou do seu preço teto, melhor esperar");
           
           } else if (valorf == totalfu) {
                  JOptionPane.showMessageDialog(null,"o fundo no mercado esta velendo \n "+valorf+ "\n de acordo com os nossos calculos o preço teto desse fundo é \n"+totalfu +"\n esse fundo imobiliario esta no valor que vale, pode ser uma boa escolhar comprar agora" );
                   } 
           else {
               JOptionPane.showMessageDialog(null, "o fundo no mercado esta velendo \n "+valorf+ "\n de acordo com os nossos calculos o preço teto desse fundo é \n"+totalfu +"\n esse fundo imobiliario esta abaixo do seu preço teto, pode ser uma boa escolhar comprar agora");
           }
            break;
            
        default:
           JOptionPane.showMessageDialog(null, "ESSA OPÇAO NAO EXISTE ","ERRO", JOptionPane.ERROR_MESSAGE);
            
    }
    }

   
    }
    

