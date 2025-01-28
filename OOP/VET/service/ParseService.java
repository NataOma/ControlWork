package service;

public class ParseService {
    public int StringToInt(String s) throws Exception{
            int result = Integer.parseInt(s);
        return result;
    }

    public boolean HasInt(String s){
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
