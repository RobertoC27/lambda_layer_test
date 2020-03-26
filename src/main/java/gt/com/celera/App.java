package gt.com.celera;

import java.security.Security;

import com.amazonaws.services.lambda.runtime.Context;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Hello world!
 *
 */
public class App {
    public String testBC(String name, Context context) {
        System.out.println("Hello World!");
        Security.addProvider(new BouncyCastleProvider());
        return String.format("tutto bene ", name);
    }
}
