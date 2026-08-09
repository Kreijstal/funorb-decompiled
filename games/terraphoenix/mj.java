/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class mj {
    static String field_a;
    static String field_c;
    int field_b;
    String field_d;

    abstract java.net.Socket b(boolean param0) throws IOException;

    final static ci[] a(fa param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vh.a(param1, param2, param0, param3)) {
            return uc.l(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("mj.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          mj.a(28);
          return new java.net.Socket(this.field_d, this.field_b);
        } else {
          return new java.net.Socket(this.field_d, this.field_b);
        }
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
