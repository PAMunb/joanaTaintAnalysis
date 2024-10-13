package br.unb.cic.joana.securibench.micro.suite;

import br.unb.cic.joana.securibench.SecuriBenchTestCase;

public class ArrayTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro.arrays";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }
}
