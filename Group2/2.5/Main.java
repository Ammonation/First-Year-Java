class Main{
    private static int startValue;
    private static int coins[]={200,100,50,20,10,5,2,1};
    private static int one;
    private static int two;
    private static int five;
    private static int ten;
    private static int twenty;
    private static int fifty;	
    private static int oneHundred;
    private static int twoHundred;
    public static void main(String args[]){
        System.out.println("#**************CHANGE CALC**************#");
        System.out.println("#Value must be in pence between 1p-500p");
        System.out.println("#There is no need to include the 'p' symbol");
        startValue = BIO.getInt();
        Boolean check;
        check = rangeCheck();
        System.out.println("Amount Coins");
        while (startValue!=0){
            if (check){
                //  System.out.println("Amount Coins");
                if (changeCalc()==1){
                    System.out.println(startValue+"p     "+ changeCalc() +" coin "+coinsUsed());
                }
                else{
                    System.out.println(startValue+"p     "+ changeCalc() +" coins "+coinsUsed());
                }
            }            
            else{
                String output = "Invalid amount "+startValue+"p";
                System.out.println(output);
            }
            startValue = BIO.getInt();
            check = rangeCheck();
        }
    }
    private static Boolean rangeCheck(){
        if (startValue>500 || startValue<1){
            //String output = "Invalid amount "+startValue+"p";
            //System.out.println(output);
            return false;
        }
        else{
            return true;
        }
    }
    private static int changeCalc(){
        int i = 0;
        int NoCoins=0;
        int startValueCopy = startValue;
        one=0;
        two=0;
        five=0;
        ten=0;
        twenty=0;
        fifty=0;
        oneHundred=0;
        twoHundred=0;
        while (startValueCopy!=0){            
            if (startValueCopy>=coins[i]){
                //System.out.println("This is the starting value: "+startValueCopy); //DELETE ME

                startValueCopy=startValueCopy-coins[i];
                NoCoins=NoCoins+1;
                //System.out.println("Value of i is: "+i); //DELETE ME
                if (coins[i]==200){
                    twoHundred++;

                }
                else if(coins[i]==100){
                    oneHundred++;
                }
                else if(coins[i]==50){
                    fifty++;
                }
                else if(coins[i]==20){
                    twenty++;
                }
                else if(coins[i]==10){
                    ten++;
                }
                else if(coins[i]==5){
                    five++;
                }
                else if(coins[i]==2){
                    two++;
                }
                else if(coins[i]==1){
                    one++;
                }                
            }
            else{
                i=i+1;
            }            
        }
        return NoCoins;
    }
    private static String coinsUsed(){
        String output;
        //output = (twoHundred+"*200p "+oneHundred+"*100p "+fifty+"*50p "+twenty+"*20p "+ten+"*10p "+five+"*5p "+two+"*2p "+one+"*1p");
        output = "";
        if (twoHundred>1){
            output = output + twoHundred+"*200p ";
        }
        else if(twoHundred==1){
            output = output + "200p ";
        }
        else{}
        if (oneHundred>1){
            output=output+oneHundred+"*100p ";
        }
        else if (oneHundred==1){
            output=output+"100p ";
        }
        else{}
        if (fifty>1){
            output=output+fifty+"*50p ";   
        }
        else if (fifty==1){
            output=output+"50p ";
        }
        else{}
        if (twenty>1){
            output=output+twenty+"*20p ";
        }
        else if (twenty==1){
            output=output+"20p ";
        }
        else{}
        if (ten>1){
            output=output+ten+"*10p ";
        }
        else if (ten==1){
            output=output+"10p ";
        }
        else{}
        if (five>1){
            output=output+five+"*5p ";
        }
        else if (five==1){
            output=output+"5p ";
        }
        else{}
        if (two>1){
            output=output+two+"*2p ";
        }
        else if (two==1){
            output=output+"2p ";
        }
        else{}
        if (one>1){
            output=output+one+"*1p ";
        }
        else if (one==1){
            output=output+"1p ";
        }
        else{}
        return output;
    }
}