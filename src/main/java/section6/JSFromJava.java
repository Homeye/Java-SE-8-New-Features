package section6;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSFromJava {

    public static void main(String[] args) {

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");

        String script = "var welcome = 'Hello';" +
                "welcome += ', Máté'; " +
                "welcome;";

        Object result = null;
        try {
            result = scriptEngine.eval(script);
//            result = (String) scriptEngine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
