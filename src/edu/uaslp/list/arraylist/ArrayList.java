package edu.uaslp.list.arraylist;

public class ArrayList {
    private int size=10;
    private int last=0;
    private int arrCounter=1;
    private int arr[]=new int[size*arrCounter];

    public void add(int data){
        int i;

        if(last==size){
            arrCounter++;
            int newArr[]=new int[size*arrCounter];
            for(i=0;i<last;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[last]=data;
        last++;
    }

    public void insert(int data, int index){
        int i;

        if(last==size){
            arrCounter++;
            int newArr[]=new int[size*arrCounter];
            for(i=0;i<last;i++){
                newArr[i]=arr[i];
            }
        }

        for(i=last;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=data;
        last++;
    }

    public void delete(int index){
        int i;

        for(i=index;i<last;i++){
            arr[i]=arr[i+1];
        }
        last--;
    }

    public int getSize(){
        return last;
    }

    public int getAt(int index){
        return arr[index];
    }

    public int getArrCounter() {
        return arrCounter;
    }
}
