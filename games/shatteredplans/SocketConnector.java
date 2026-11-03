/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    int port;
    static String field_e;
    static Star field_b;
    static String field_c;
    String host;
    static qr field_d;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != 23) {
          SocketConnector.a((byte) 79);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final java.net.Socket connectDirect(int param0) throws IOException {
        if (param0 > 108) {
          return new java.net.Socket(this.host, this.port);
        }
        field_c = (String) null;
        return new java.net.Socket(this.host, this.port);
    }

    abstract java.net.Socket connect(int param0) throws IOException;

    static {
        field_e = "Select a system adjacent to a friendly system to cause a destructive stellar flare, or right click to cancel this project.";
        field_c = "The Achievements system is currently unavailable.";
        field_b = new Star(-1, -1, -1, -1);
    }
}
