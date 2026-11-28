/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    String field_b;
    static int field_d;
    static String field_e;
    static PcmSample field_a;
    int field_c;

    final static PcmStreamMixer a(int param0) {
        if (param0 != 21146) {
          SocketConnector.a(124);
          return CipherPacketBuffer.field_r;
        }
        return CipherPacketBuffer.field_r;
    }

    final java.net.Socket openDirectSocket(int param0) throws IOException {
        if (param0 != -8463) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_c);
    }

    abstract java.net.Socket openSocket(int param0) throws IOException;

    public static void clearStaticReferences(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 < 112) {
          field_a = (PcmSample) null;
        }
    }

    static {
        field_e = "Secret achievement";
    }
}
