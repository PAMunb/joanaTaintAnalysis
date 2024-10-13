package br.unb.cic.joana.securibench.v1.micro.suite;

import br.unb.cic.joana.securibench.v1.SecuriBenchTestCase;

public class FactoryTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro.factories";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }
}
