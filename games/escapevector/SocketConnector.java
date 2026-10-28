/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static int field_e;
    static volatile int pendingClickButton;
    int port;
    static String field_g;
    static int field_d;
    static Sprite field_c;
    String host;

    public static void releaseStatics(boolean guard) {
        field_g = null;
        field_c = null;
        if (!guard) {
          field_e = -18;
        }
    }

    abstract java.net.Socket connect(int firstProxyIndex) throws IOException;

    final java.net.Socket connectDirect(boolean guard) throws IOException {
        if (guard) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.host, this.port);
    }

    static {
        pendingClickButton = 0;
        field_g = "Resume Game";
    }
}
