import java.util.HashMap;

class Main {

    public static void main(String[] args){
        String r = "III";
        System.out.print(romanToInt(r));
    }
    
    public static int romanToInt(String s){
        int total = 0;

        HashMap<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            int currentValue = romanMap.get(s.charAt(i));

            if(i < s.length() - 1 && currentValue < romanMap.get(s.charAt(i + 1))){
                total -= currentValue;
            }else{
                total += currentValue;
            }
        }



        return total;
    }
}
