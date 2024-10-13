package br.unb.cic.joana.securibench.micro.suite;

import br.unb.cic.joana.securibench.SecuriBenchTestCase;

public class CollectionTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro.collections";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }
}
