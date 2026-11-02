/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static String field_a;
    static String field_c;
    int port;
    String host;

    abstract java.net.Socket createSocket(boolean obfuscationGuard) throws IOException;

    final static Sprite[] a(Archive param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (DualLinkNode.a(param1, param2, param0, param3)) {
            return uc.l(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mj.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        hj.field_K = null;
        wb.field_a = null;
        sb.field_m = null;
        ha.field_s = null;
        qc.field_b = (byte[][]) null;
        if (param0 <= 68) {
          return;
        }
        rf.field_p = null;
    }

    final java.net.Socket createDirectSocket(boolean obfuscationGuard) throws IOException {
        if (obfuscationGuard) {
          return new java.net.Socket(this.host, this.port);
        }
        SocketConnector.a(28);
        return new java.net.Socket(this.host, this.port);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 11147) {
          field_c = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_c = "You can press undo to cancel the last landing location.";
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
