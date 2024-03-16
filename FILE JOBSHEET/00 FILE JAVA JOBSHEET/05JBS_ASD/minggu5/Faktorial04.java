package minggu5;

public class Faktorial04 {

    public int nilai;

    public int faktorialBF(int n){ //iterasi dan (*)
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public int faktorialDC(int n){ //rekursif
        if (n == 1) {
            return 1;
        }
        else{
            int faktor = n * faktorialDC(n-1);
            return faktor;
        }
    }

    public int countVowels(char[] word){
        char[] vowels = {'a','i', 'u', 'e', 'o'};
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word[i] == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkItemInList(String item, String[] list){
        for (int i = 0; i < list.length; i++) {
            if (list[i] ==  item) {
                return true;
            }
        }
        return false;
    }

    
}
