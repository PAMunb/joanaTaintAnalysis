package br.unb.cic.joana.securibench.v2.micro.suite;

import br.unb.cic.joana.securibench.v2.SecuriBenchTestCase;

public class AliasingTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v2.micro.aliasing";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V";
    }
}
