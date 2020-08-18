package Easy;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataLogFiles {

    public static String[] reorderLogFiles(String[] logs){
        Arrays.sort(logs, new MyComparator());
        return logs;
    }

    public static void main(String[] args){
        String[] logs = new  String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};

        System.out.println(String.format( "Before reorder: %s", Arrays.toString( logs ) ));
        System.out.println( String.format( "After reorder: %s", Arrays.toString( reorderLogFiles(logs) ) ) );
    }

    private static class MyComparator implements Comparator<String> {
        public int compare(String a, String b){
            String[] s1 = a.split( " ", 2 );
            String[] s2 = b.split( " ", 2 );
            boolean isChar1 = Character.isLetter( s1[1].charAt( 0 ) );
            boolean isChar2 = Character.isLetter( s2[1].charAt(0) );

            if(isChar1 && isChar2){
                return s1[1].compareTo( s2[1] ) != 0 ? s1[1].compareTo( s2[1] ) : s1[0].compareTo( s2[0] );
            }
            return isChar1 ? -1 : (isChar2 ? 1 : 0);
        }
    }
}
