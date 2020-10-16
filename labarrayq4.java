package com.strathextra;

public class labarrayq4 {

    public static void main(String[] args) {
        int [] given_array = {95, 55, 103, 12, 30, 124, 72, 180, 39, 48, 28, 18, 8, 19, 65, 71, 70, 64, 196, 18, 53};

        for (int i=0;i<given_array.length;i++){
            boolean isPrime = true;

            int num = given_array[i];

            for(int j=2;j<(num/2);j++){
                if(num!=3 || num!=5 || num!=7) {
                    if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num == 1 || num == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }
            if(isPrime){
                System.out.println(num);

            }
            else{
                continue;
            }

        }


    }
}
