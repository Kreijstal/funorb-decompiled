/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static IntrusiveDeque field_d;
    String host;
    int port;
    static String field_c;

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 3) {
          return ec.a(3, 5, param3, param1, 1, param4, 1, param0, 1);
        }
        field_c = (String) null;
        return ec.a(3, 5, param3, param1, 1, param4, 1, param0, 1);
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    public static void c(int param0) {
        field_c = null;
        if (param0 != 1) {
          field_d = (IntrusiveDeque) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static int b(int param0) {
        if (param0 != 1) {
          return 75;
        }
        return SauceOfFlameSpecial.field_p;
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 == 3332) {
          return new java.net.Socket(this.host, this.port);
        }
        SocketConnector.b(-5);
        return new java.net.Socket(this.host, this.port);
    }

    static {
        field_c = "Creating your account";
        field_d = new IntrusiveDeque();
    }
}
