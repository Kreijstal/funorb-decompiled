/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iq {
    private int field_c;
    private String field_d;
    private int field_f;
    static Random field_e;
    int field_i;
    static long field_h;
    static int[] field_g;
    static String field_b;
    static pu[] field_a;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1.length() != 1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var2_int = param1.charAt(0);
              if (!Character.isLowerCase((char) var2_int)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("iq.C(").append(30).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(int param0) {
        if (wg.a(-33, db.a(true, ((iq) this).field_f), db.a(true, ((iq) this).field_f + ((iq) this).field_i), u.a(((iq) this).field_c, (byte) 94), u.a(30 + ((iq) this).field_c, (byte) 94))) {
          fe.a(db.a(true, ((iq) this).field_f), u.a(((iq) this).field_c, (byte) 94), ((iq) this).field_i, 30, il.field_s, ci.field_e, 0, 0);
          int discarded$2 = 1;
          fe.c(((iq) this).field_d, db.a(true, ((iq) this).field_i / 2 + ((iq) this).field_f), u.a(((iq) this).field_c - -30, (byte) 94), param0);
          return;
        } else {
          fe.a(db.a(true, ((iq) this).field_f), u.a(((iq) this).field_c, (byte) 94), ((iq) this).field_i, 30, il.field_s, nd.field_b, 0, 0);
          int discarded$3 = 1;
          fe.c(((iq) this).field_d, db.a(true, ((iq) this).field_i / 2 + ((iq) this).field_f), u.a(((iq) this).field_c - -30, (byte) 94), param0);
          return;
        }
    }

    final static void b() {
        if (!bl.field_b) {
            throw new IllegalStateException();
        }
        it.field_b = true;
        wc.a(false, -49);
        p.field_b = 0;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != 0) {
          field_e = null;
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    iq(String param0, int param1, int param2, int param3) {
        try {
            ((iq) this).field_c = param2;
            ((iq) this).field_f = param1;
            ((iq) this).field_i = param3;
            ((iq) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "iq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = -106 / ((param0 - 17) / 39);
        return wg.a(-33, db.a(true, ((iq) this).field_f), db.a(true, ((iq) this).field_f - -((iq) this).field_i), u.a(((iq) this).field_c, (byte) 94), u.a(((iq) this).field_c + 30, (byte) 94));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new Random();
        field_b = "Owned";
    }
}
