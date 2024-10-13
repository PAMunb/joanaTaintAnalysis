package br.unb.cic.joana.securibench.v1.micro.suite;

import br.unb.cic.joana.securibench.v1.SecuriBenchTestCase;
import securibench.v1.micro.MicroTestCase;

import java.util.HashSet;
import java.util.Set;

public class SpecificTest extends SecuriBenchTestCase {
    @Override
    public String basePackage() {
        return "securibench.v1.micro.basic";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }

    @Override
    protected Set<Class<? extends MicroTestCase>> findClassesInBasePackage() {
        try {
            Class c = Class.forName("securibench.micro.basic.Basic42");
            Set<Class<? extends MicroTestCase>> res = new HashSet<>();
            res.add(c);
            return res;
        }catch(Exception e) {
            return null;
        }
    }
}
