/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static int field_f;
    static int[] decodedSpriteOffsetY;
    int targetPort;
    static int field_b;
    String targetHost;
    static String field_e;

    abstract java.net.Socket connect(int obfuscationGuard) throws IOException;

    public static void b(int param0) {
        decodedSpriteOffsetY = null;
        field_e = null;
        if (param0 != -9125) {
          field_b = 15;
        }
    }

    final java.net.Socket connectDirect(byte obfuscationGuard) throws IOException {
        if (obfuscationGuard == -76) {
          return new java.net.Socket(this.targetHost, this.targetPort);
        }
        SocketConnector.b(53);
        return new java.net.Socket(this.targetHost, this.targetPort);
    }

    static {
        field_f = 0;
    }
}
