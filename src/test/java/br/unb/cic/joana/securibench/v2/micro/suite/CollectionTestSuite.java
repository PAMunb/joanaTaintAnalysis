package br.unb.cic.joana.securibench.v2.micro.suite;

import br.unb.cic.joana.securibench.v2.SecuriBenchTestCase;

public class CollectionTestSuite extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v2.micro.collections";
    }

    @Override
    public String entryPointMethod() {
        return "doGet(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V";
    }
}
