/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static IntrusiveDeque debugArrows;
    int port;
    String host;

    final static boolean a(int param0, int param1, int param2) {
        if (param0 == -6070) {
          return 0 != (2048 & param2) ? true : false;
        }
        SocketConnector.a(-47, -38, 120);
        return 0 != (2048 & param2) ? true : false;
    }

    final java.net.Socket openDirectSocket(boolean param0) throws IOException {
        if (!param0) {
          return new java.net.Socket(this.host, this.port);
        }
        this.port = 48;
        return new java.net.Socket(this.host, this.port);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 >= -71) {
          SocketConnector.a(-112, -32, -122);
          debugArrows = null;
          return;
        }
        debugArrows = null;
    }

    abstract java.net.Socket openSocket(int param0) throws IOException;

    static {
    }
}
