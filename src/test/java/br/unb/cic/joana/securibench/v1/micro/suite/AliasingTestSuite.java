package br.unb.cic.joana.securibench.v1.micro.suite;

import br.unb.cic.joana.securibench.v1.SecuriBenchTestCase;

public class AliasingTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro.aliasing";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }
}