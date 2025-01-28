package controller;

import service.ParseService;

public class ParseController{
    ParseService p = new ParseService();
    public int StringToInt(String s) throws Exception{
        int result;
        try {
            result = p.StringToInt(s);
        } catch (Exception e) {
            System.out.println("Ошибка конвертации чисел");
            throw e;
        }
        return result;
    }

    public boolean HasInt(String s){
        return p.HasInt(s);
    }
}
