public class AscendDescend {

  public static String ascendDescend(int length, int min, int max) {
    String s = "" ;  
    for (int i = min ; i <=max ; i ++) s = s + i ; 
    for (int i = max-1 ; i >min ; i--) s = s+i ; 
    if (s.length()==0) return s ;
    s = s.repeat ( length/s.length() + 1  ); 
    return s.substring(0 , length);
    }
  }