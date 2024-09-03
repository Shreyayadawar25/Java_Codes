public class linearSearch {

    public static int linearsearch(String food[], String key){

        for(int i=0;i<food.length;i++){
            if(food[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int numbers[]= {2,4,1,5,8,6,0,7};
        String food[] ={"Dosa","Idli","wada","Poha"};
        String key = "wada";
        int index = linearsearch(food, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at Index: "+index);
        }
    }
    
}
