public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String sRetValue = "";

        for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
            sRetValue += c;
            }   
            else{
                  sRetValue += c;
            }
          }
      
          return sRetValue;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean bRetValue = false;
        int nLengthStr1 = str1.length();
        int nLengthStr2 = str2.length();
         int nLastIndexToCheck = nLengthStr1 - nLengthStr2 + 1;
        
         for(int i = 0; i < nLastIndexToCheck && !bRetValue; i++) {

            boolean bIsContained = true;
            for(int j = 0; j <nLengthStr2; j++)
            {
               if(str2.charAt(j) != str1.charAt(j + i)){
                bIsContained = false;
                break;
               }
            }
            bRetValue = bIsContained;
         }

        return bRetValue;
    }
}
