///////////////////////////
//Ruoting Li
//Jan 31st, 2015
//CSE002
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{

//  add main method
  public static void main(String[ ] args) {
     
//  my input data
    int nSocks=3;  //Number of pairs of socks
    double sockCost$=2.58;  //Cost per pair of socks
                            //('$'is part of the variable name)
    int nGlasses=6;  //Number of drinking glasses
    double glassCost$=2.29;  //Cost per glass
                            //('$'is part of the variable name)
    int nEnvelopes=1;  //Number of boxes of envelopes
    double envelopeCost$=3.25;  //Cost per box of envelopes
                            //('$'is part of the variable name)
    double taxPercent=0.06; //tax rates 
    
//  input
    System.out.println("Numbers of socks:"+nSocks);
    System.out.println("each socks (in $)="+sockCost$);
    System.out.println("                                  ");
    
    System.out.println("Numbers of glasses:"+nGlasses);
    System.out.println("each glasses (in $)="+glassCost$);
    System.out.println("                                  ");
    
    
    System.out.println("Numbers of envelopes:"+nEnvelopes);
    System.out.println("each envelopes (in $)="+envelopeCost$);
    System.out.println("                                  ");
    

//  new variables (part1)
    double totalSockCost$; //total costs of the socks
    double aTaxofSock$;     //sales taxes of the socks
    
    double totalGlassCost$;//total costs of the glasses
    double aTaxofGlass$;    //total taxes of the glasses
    
    double totalEnvelopeCost$; //total costs of the envelopes
    double aTaxofenvelope$;     //total taxes of the envelopes

//  Calculations  (part1)
    totalSockCost$=nSocks*sockCost$;
    System.out.println("totalSockCost$:"+totalSockCost$);
    
    aTaxofSock$=totalSockCost$*taxPercent*100;
    int bTaxofSock$=(int) aTaxofSock$;
    double TaxofSock$=bTaxofSock$*0.01;
    System.out.println("total sales taxes of socks$:"+TaxofSock$);
    System.out.println("                                  ");
    
    
    
    totalGlassCost$=nGlasses*glassCost$;
    System.out.println("totalGlassCost$:"+totalGlassCost$);

    aTaxofGlass$=totalGlassCost$*taxPercent*100;
    int bTaxofGlass$=(int) aTaxofGlass$;
    double TaxofGlass$=bTaxofGlass$*0.01;
    TaxofGlass$=TaxofGlass$*100;
    int TaxofGlass1$=(int) TaxofGlass$;
    double TaxofGlass2$=TaxofGlass1$/100.0;
    System.out.println("total sales taxes of glasses$:"+TaxofGlass2$);
    System.out.println("                                  ");
    
    
    
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    System.out.println("totalEnvelopeCost$:"+totalEnvelopeCost$);
    
    aTaxofenvelope$=totalEnvelopeCost$*taxPercent*100;
    int bTaxofEnvelope$=(int) aTaxofenvelope$;
    double Taxofenvelope$=bTaxofEnvelope$*0.01;
    System.out.println("total sales taxes of envelopes$:"+Taxofenvelope$);
    System.out.println("                                  ");
    
    
    
//  new variables  (part2)
    double totalCost$; //total costs of all the three kind of objects
    double totalSalesTax$; //total sales taxes of the three kind of objects
    double totalCostafterTax$;//total costs after adding the sales taxes
    
//  Calculations   (part2)
    totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    System.out.println("Total costs before taxes$:"+totalCost$);
    System.out.println("                                  ");
    
    totalSalesTax$=TaxofSock$+TaxofGlass2$+Taxofenvelope$;
    System.out.println("Total sales taxes$:"+totalSalesTax$);
    System.out.println("                                  ");
    
    totalCostafterTax$=totalCost$+totalSalesTax$;
    System.out.println("Total costs after adding the sales taxes$:"+totalCostafterTax$);
    System.out.println("                                  ");
    
    
      
  }   //end of main method
}  //end of class 
