/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static RenderSprite[] levelRingSprites;
    int port;
    static String field_b;
    static String field_c;
    String host;
    static int field_d;

    public static void a(int param0) {
        if (param0 >= 21) {
          field_b = null;
          levelRingSprites = null;
          field_c = null;
          return;
        }
        SocketConnector.a(-62);
        field_b = null;
        levelRingSprites = null;
        field_c = null;
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final java.net.Socket connectDirect(byte obfuscationGuard) throws IOException {
        int var2 = -124 / ((obfuscationGuard + 69) / 34);
        return new java.net.Socket(this.host, this.port);
    }

    static {
        field_b = "Not yet achieved";
        field_d = 5;
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
