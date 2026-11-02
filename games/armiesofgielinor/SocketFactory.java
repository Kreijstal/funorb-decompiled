/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketFactory {
    String host;
    int port;
    static QuickChatCommandDefinition field_e;
    static wm nameCheckPending;
    static boolean field_h;
    static String field_f;
    static String[] field_b;
    static String[] field_g;

    final static boolean c(int param0) {
        if (param0 != 10) {
          field_h = true;
          return true;
        }
        return true;
    }

    public static void releaseStatics(int obfuscationGuard) {
        nameCheckPending = null;
        field_e = null;
        if (obfuscationGuard != 16) {
          return;
        }
        field_b = null;
        field_g = null;
        field_f = null;
    }

    abstract java.net.Socket openSocket(int obfuscationGuard) throws IOException;

    final java.net.Socket openDirectSocket(byte obfuscationGuard) throws IOException {
        if (obfuscationGuard != 15) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.host, this.port);
    }

    static {
        field_e = new QuickChatCommandDefinition(10, 2, 2, 0);
        nameCheckPending = new wm();
        field_f = "No special attribute";
        field_b = new String[16];
    }
}
