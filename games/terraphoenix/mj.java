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

    final static ci[] a(fa param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          int discarded$9 = 1;
          if (vh.a(param1, param2, param0)) {
            int discarded$10 = 0;
            return uc.l();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("mj.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
    }

    final static void a(byte param0) {
        hj.field_K = null;
        wb.field_a = null;
        sb.field_m = null;
        ha.field_s = null;
        qc.field_b = null;
        if (param0 <= 68) {
            return;
        }
        rf.field_p = null;
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          mj.a(28);
          return new java.net.Socket(((mj) this).field_d, ((mj) this).field_b);
        } else {
          return new java.net.Socket(((mj) this).field_d, ((mj) this).field_b);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 11147) {
            field_c = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You can press undo to cancel the last landing location.";
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
