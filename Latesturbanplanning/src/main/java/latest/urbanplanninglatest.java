package latest;

import java.util.Random;
import java.util.Scanner;

public class urbanplanninglatest {

    public static void main(String[] args) {
        String[] sym={"A","H","S","M","U","C","R","T","B","P"};
        String r1="_";
        String r2="|";
        String r4=" ";
        String[] sym1={"^",">","<","v"};
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of blueprint:\t(80/100)");
        int size=sc.nextInt();
        String[][] arr1 = new String[size][size];
        
        
        Random rand = new Random();
        
        System.out.println("rows and columns of building: ");
        System.out.println("U: ");
        int num1=sc.nextInt();
        int num11=sc.nextInt();
        System.out.println("T");
        int num2=sc.nextInt();
        int num21=sc.nextInt();
        System.out.println("C");
        int num3=sc.nextInt();
        int num31=sc.nextInt();
        System.out.println("A");
        int num4=sc.nextInt();
        int num41=sc.nextInt();
        System.out.println("S");
        int num5=sc.nextInt();
        int num51=sc.nextInt();
        System.out.println("M");
        int num6=sc.nextInt();
        int num61=sc.nextInt();
        System.out.println("H");
        int num7=sc.nextInt();
        int num71=sc.nextInt();
        
        System.out.println("Area: ");
        System.out.println("U: "+num1+"x"+num11);
        System.out.println("T: "+num2+"x"+num21);
        System.out.println("C: "+num3+"x"+num31);
        System.out.println("A: "+num4+"x"+num41);
        System.out.println("S: "+num5+"x"+num51);
        System.out.println("M: "+num6+"x"+num61);
        System.out.println("H: "+num7+"x"+num71);
        int a1=rand.nextInt(19-num1)+24;//U//3
        int a2=rand.nextInt(17-num11)+61; //5
        int a3=rand.nextInt(15-num2)+35;//T5
        int b4=rand.nextInt(26-num21)+25;//2
        int a4=rand.nextInt(29-num31)+25;//C4
        int a5=rand.nextInt(12-num3)+51;//4
        int a6=rand.nextInt(11-num41)+3;//A4
        int a7=rand.nextInt(32-num4)+18;//4
        int a8=rand.nextInt(19-num5)+46;//S2
        int b2=rand.nextInt(12-num51)+61;//5
        int a9=rand.nextInt(14-num6)+65;//M5
        int a10=rand.nextInt(20-num61)+2;//2
        int a11=rand.nextInt(12-num7)+18;//H3
        int a12=rand.nextInt(26-num71)+28;//6
        
        
     
       //blocks
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                    arr1[i][j]=r4;
                   
                    int change=rand.nextInt(3)+1;
                    if(change==1){
                    for(int m=a11;m<a11+num7;m++){
                    for(int n=a12;n<a12+num71;n++){
                            arr1[m][n]=sym[1];//H
                       }
                       }
                    for(int c=a9;c<a9+num6;c++){
                    for(int d=a10;d<a10+num61;d++){
                            arr1[c][d]=sym[3];//M
                       }
                       }
                    for(int a=a8;a<a8+num5;a++){
                    for(int b=b2;b<b2+num51;b++){
                            arr1[a][b]=sym[2];//S
                       }
                       }
                    for(int e=a1;e<a1+num1;e++){
                    for(int f=a2;f<a2+num11;f++){
                            arr1[e][f]=sym[4];//U
                       }
                       }
                        for(int k=a3+2;k<a3+2+num2;k++){
                    for(int l=b4+2;l<b4+2+num21;l++){
                        arr1[k][l]=sym[7];//T
                    }}
                    for(int g=a5;g<a5+num3;g++){
                    for(int h=a4;h<a4+num31;h++){
                            arr1[g][h]=sym[5];//C
                       }
                       }
                        for(int k=a7;k<a7+num4;k++){
                    for(int l=a6;l<a6+num41;l++){
                        arr1[k][l]=sym[0];//A
                    }}
                    }
                    
                    else if(change==2){
                        for(int m=a11;m<a11+num7;m++){
                    for(int n=a12;n<a12+num71;n++){
                            arr1[m][n]=sym[5];//C
                       }
                       }
                    for(int c=a9;c<a9+num6;c++){
                    for(int d=a10;d<a10+num61;d++){
                            arr1[c][d]=sym[2];//S
                       }
                       }
                    for(int a=a8;a<a8+num5;a++){
                    for(int b=b2;b<b2+num51;b++){
                            arr1[a][b]=sym[3];//M
                       }
                       }
                    for(int e=a1;e<a1+num1;e++){
                    for(int f=a2;f<a2+num11;f++){
                            arr1[e][f]=sym[1];//H
                       }
                       }
                        for(int k=a3+2;k<a3+2+num2;k++){
                    for(int l=b4+2;l<b4+2+num21;l++){
                        arr1[k][l]=sym[7];//T
                    }}
                    for(int g=a5;g<a5+num3;g++){
                    for(int h=a4;h<a4+num31;h++){
                            arr1[g][h]=sym[4];//U
                       }
                       }
                        for(int k=a7;k<a7+num4;k++){
                    for(int l=a6;l<a6+num41;l++){
                        arr1[k][l]=sym[0];//A
                    }}
                    }
                    
                    else{
                        for(int m=a11;m<a11+num7;m++){
                    for(int n=a12;n<a12+num71;n++){
                            arr1[m][n]=sym[5];//H
                       }
                       }
                    for(int c=a9;c<a9+num6;c++){
                    for(int d=a10;d<a10+num61;d++){
                            arr1[c][d]=sym[2];//M
                       }
                       }
                    for(int a=a8;a<a8+num5;a++){
                    for(int b=b2;b<b2+num51;b++){
                            arr1[a][b]=sym[3];//S
                       }
                       }
                    for(int e=a1;e<a1+num1;e++){
                    for(int f=a2;f<a2+num11;f++){
                            arr1[e][f]=sym[4];//U
                       }
                       }
                        for(int k=a3+2;k<a3+2+num2;k++){
                    for(int l=b4+2;l<b4+2+num21;l++){
                        arr1[k][l]=sym[7];//T
                    }}
                    for(int g=a5;g<a5+num3;g++){
                    for(int h=a4;h<a4+num31;h++){
                            arr1[g][h]=sym[1];//C
                       }
                       }
                        for(int k=a7;k<a7+num4;k++){
                    for(int l=a6;l<a6+num41;l++){
                        arr1[k][l]=sym[0];//A
                    }}
                    }
                    
                
                arr1[i][arr1.length-1]=r2;
                arr1[i][0]=r2;
                arr1[0][j]=r1;
                arr1[arr1.length-1][j]=r1;
                
            }            
            }
            
        if(size==100){
            System.out.println("B");
            int num8=sc.nextInt();
            int num81=sc.nextInt();
            int c2=rand.nextInt(18-num81)+81;
            int c1=rand.nextInt(26-num8)+6;
            for(int i=80;i<arr1.length;i++){
            for(int j=80;j<arr1.length;j++){
                //
                for(int a=80;a<80+1;a++){
                    for(int b=23;b<arr1.length-1;b++){
                        arr1[a][b]=sym1[2];
                    }
                }
                for (int a = 81; a < arr1.length-2; a++) {
                    for (int b = 23; b < 23+1; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                for (int a = arr1.length-2; a < arr1.length-1; a++) {
                    for (int b = 23; b < arr1.length-1; b++) {
                        arr1[a][b]=sym1[1];
                    }
                }
                for (int a = arr1.length-2; a > 79; a--) {
                    for (int b = arr1.length-2; b <arr1.length-1 ; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                for (int a = 70; a < 80; a++) {
                    for (int b = 57; b < 57+1; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                for (int a = 82; a < arr1.length-3; a++) {
                    for (int b = 25; b < arr1.length-3; b++) {
                        arr1[a][b]=sym[6];
                        
                            arr1[81+4][b]=" ";
                            arr1[81+5][b]=sym1[1];
                            arr1[81+6][b]=" ";
                            arr1[81+10][b]=" ";
                            arr1[81+11][b]=sym1[1];
                            arr1[81+12][b]=" ";
                            
                            arr1[a][25+14]=" ";
                            arr1[a][25+15]=sym1[3];
                            arr1[a][25+16]=" ";
                            arr1[a][25+34]=" ";
                            arr1[a][25+35]=sym1[3];
                            arr1[a][25+36]=" ";
                            arr1[a][25+54]=" ";
                            arr1[a][25+55]=sym1[3];
                            arr1[a][25+56]=" ";
                        
                    }
                }
                
                for (int a = 6; a < 68; a++) {
                    for (int b = 79; b < 81; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                for(int a=33;a<33+2;a++){
                    for(int b=81;b<arr1.length-1;b++){
                        if(a==33){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                    }
                }
                for(int k=c1;k<c1+num8;k++){
                    for(int l=c2;l<c2+num81;l++){
                        arr1[k][l]=sym[8];//B
                    }}
                for (int a = 71 ; a < 79; a++) {
                    for (int b = 59; b < arr1.length-3; b++) {
                        arr1[a][b]=sym[9];
                        if(arr1[a][b]==arr1[(a+1)][(b+1)]){
                            arr1[a][b]=" ";
                    }
                }
                
                }
            }
            }
        }
           
        //roads
        //0-atas
       //1-kanan
       //2-kiri
       //3-bawah
        for(int i=1;i<arr1.length-1;i++){
            for(int j=1;j<arr1.length-1;j++){
                arr1[1][j]=sym1[1];
                arr1[2][j]=sym1[1];         //from highway;
                arr1[3][j]=sym1[1];         //kiri
                arr1[4][j]=sym1[2];         //kanan
                arr1[5][j]=sym1[2];
                arr1[6][j]=sym1[2];
                
                for(int a=6;a<64;a++){      //keluar highway ke city
                    for(int b=59;b<61;b++){
                        arr1[a][b]=sym1[3];
                    }
                }
                for(int a=6;a<64;a++){      //keluar city ke highway
                    for(int b=55;b<57;b++){
                        arr1[a][b]=sym1[0];
                    }
                }
                
                for(int a=64;a<70;a++){//roundabout
                    for(int b=62;b>62-9;b--){
                        
                        arr1[69][b]=sym1[2];
                        arr1[a][62]=sym1[3];
                        arr1[64][b]=sym1[1];
                        arr1[a][62-9]=sym1[0];
                        
                        }
                        }
                for(int a=66;a<68;a++){//s3sambung
                    for(int b=(53);b>53-31;b--){
                        arr1[66][53]=sym1[0];
                        arr1[66][53-30]=sym1[0];
                        if(a==66){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                    }
                }
                for(int a=6;a<18;a++){
                for(int b=11;b<13;b++){
                    if(b==11){
                        arr1[a][b]=sym1[0];
                        }
                        else
                        arr1[a][b]=sym1[3];
                    }
                }
                for(int a=18;a<50;a++){//border airport;
                    for(int b=2;b<15;b++){
                    arr1[a][2]=r2;
                    arr1[a][14]=r2;
                    arr1[18][b]=r1;
                    arr1[49][b]=r1;
                    }
                }
                for(int a=23;a<25;a++){//sairport
                    for(int b=15;b<25;b++){
                        if(a==23){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                        arr1[24][24]=sym1[3];
                    }
                }
                
                for(int a=25;a<31;a++){
                for(int b=23;b<25;b++){
                    if(b==23){
                        arr1[a][b]=sym1[0];
                        }
                        else
                        arr1[a][b]=sym1[3];
                    }
                }
            
                for(int a=31;a<37;a++){//roundabout2
                    for(int b=21;b<26;b++){
                        
                        arr1[31][b]=sym1[1];
                        arr1[a][21]=sym1[0];
                        arr1[36][b]=sym1[2];
                        arr1[a][26]=sym1[3];
                        
                        }
                        }
                for(int a=37;a<66;a++){
                for(int b=23;b<25;b++){
                    if(b==23){
                        arr1[a][b]=sym1[0];
                        }
                        else
                        arr1[a][b]=sym1[3];
                    }
                }
                
                for(int a=33;a<33+2;a++){//s4
                    for(int b=54;b>54-28;b--){
                        if(a==33){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                    }
                }
                
                for(int a=22;a<24;a++){//s1
                    for(int b=78;b>60;b--){
                        if(a==22){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                    }
                }
                for(int a=44;a<46;a++){//s2
                    for(int b=(78);b>60;b--){
                        if(a==44){
                        arr1[a][b]=sym1[1];
                        }
                        else
                        arr1[a][b]=sym1[2];
                    }
                }
                for(int a=66;a<68;a++){//s3
                    for(int b=(78);b>62;b--){
                        arr1[a][b]=sym1[1];
                       
                    }
                }
                
                    }
                }
                //check(arr1);
                /*if(check(arr1)==0){
                    System.out.print("0");
                }
                if(check(arr1)==1){
                    System.out.print("2");
                }
                if(check(arr1)==2){
                    System.out.print("2");
                }
                if(check(arr1)==3){
                    System.out.print("3");
                }*/
        //display
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                
                System.out.print(" "+arr1[i][j]);
       
            }System.out.println();
        }
        
        System.out.println();
        System.out.println("Legend: ");
        System.out.println("U=University");
        System.out.println("T=Transportation//Subway Station");
        System.out.println("C=Condominium");
        System.out.println("A=Airport");
        System.out.println("S=School");
        System.out.println("M=Mall");
        System.out.println("H=Hospital");
        System.out.println("<>=Roads");
        System.out.println();
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=r4;
                
                for(int k=a3+2;k<a3+2+num2;k++){
                    for(int l=b4+2;l<b4+2+num21;l++){
                        arr1[k][l]=sym[7];//T
                    }}
                
                 arr1[i][arr1.length-1]=r2;
                arr1[i][0]=r2;
                arr1[0][j]=r1;
                arr1[arr1.length-1][j]=r1;
                
                for(int a=35;a<51;a++){//border subway;
                    for(int b=25;b<54;b++){
                    arr1[a][25]=r2;
                    arr1[a][53]=r2;
                    arr1[35][b]=r1;
                    arr1[50][b]=r1;
                    }
                }
                
                for (int a=51; a<65; a++) {
                    for (int b= 30; b< 30+1; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                //
                for (int a=65; a <66; a++) {
                    for (int b=1; b<31;b++) {
                        arr1[a][b]=sym1[2];
                    }
                }
                //
                for (int a=44; a <45; a++) {
                    for (int b = 13; b<25; b++) {
                        arr1[a][b]=sym1[2];
                    }
                }
                for (int a=1;a<45;a++) {
                    for (int b=13; b<14; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                 for (int a=45;a<80;a++) {
                    for (int b=13; b<14; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                //
                for (int a=1;a<36;a++) {
                    for (int b=36; b<37; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                for (int a=6;a<36;a++) {
                    for (int b = 30; b < 31; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                for (int a=6;a<7;a++) {
                    for (int b =1 ; b < 30; b++) {
                        arr1[a][b]=sym1[2];
                    }
                }
                //
                for (int a=1;a<36;a++) {
                    for (int b=43; b<44; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                //
                for (int a =1; a <36 ; a++) {
                    for (int b =48; b < 49; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                
                for (int a =51; a <80 ; a++) {
                    for (int b = 38; b < 39; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                
                for (int a=43; a<44; a++) {
                    for (int b = 54; b <57; b++) {
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=10; a<44; a++){      //keluar city ke highway
                    for(int b=57; b<58; b++){
                        arr1[a][b]=sym1[0];
                    }
                }
                for(int a=10; a<11; a++){      
                    for(int b=57; b<65; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=36; a<37;a++){     
                    for(int b=57; b<65; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=44; a<54; a++){      
                    for(int b=57; b<58;  b++){
                        arr1[a][b]=sym1[3];
                    }
                }
                for(int a=54; a<55; a++){      
                    for(int b=57; b<65; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                //
                for (int a =51; a<80; a++) {
                    for (int b=48; b<49; b++) {
                        arr1[a][b]=sym1[3];
                    }
                }
                for (int a =51; a<80; a++) {
                    for (int b=43; b<44; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                for (int a=65; a <66; a++) {
                    for (int b=49; b<64; b++) {
                        arr1[a][b]=sym1[1];
                    }
                }
                for (int a=1; a<66; a++) {
                    for (int b=64; b<65; b++) {
                        arr1[a][b]=sym1[0];
                    }
                }
                for(int a=10; a<11; a++){      
                    for(int b=65; b<80; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=36; a<37; a++){     
                    for(int b=65; b<80; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=54; a<55; a++){      
                    for(int b=65; b<80; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=65; a<66; a++){      
                    for(int b=65; b<80; b++){
                        arr1[a][b]=sym1[1];
                    }
                }
                for(int a=66; a<80; a++){      
                    for(int b=64; b<65; b++){
                        arr1[a][b]=sym1[3];
                    }
                }
                
                
              
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                
                System.out.print(" "+arr1[i][j]);
       
            }System.out.println();
        }
    }
    
    public static void check(String[][] array){
        //String r=" ";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]==" "){
                    System.out.print("0");
                    //return 0;
                }
                else if(array[i][j]=="^"||array[i][j]=="v"||array[i][j]=="<"||array[i][j]==">"){
                System.out.print("1");
                //return 1;
                }
                else if(array[i][j]=="U"||array[i][j]=="T"||array[i][j]=="C"||array[i][j]=="A"||array[i][j]=="S"||array[i][j]=="^M"||array[i][j]=="H"){
                    System.out.print("2");
                    //return 2;
                }
                else
                    System.out.print("3");
                    //return 3;
            }
            System.out.println("");
        }
        
         //return 4;
    }
   
}