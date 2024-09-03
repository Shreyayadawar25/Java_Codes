public class lexicographicOrder {

    /*lexicography == comparing the alphabets


     * for a given set of string print the largest string.
     * "apple", "mango", "banana"
     */
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};

        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
