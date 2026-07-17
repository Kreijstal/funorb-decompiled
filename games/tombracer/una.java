/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class una {
    int field_e;
    static una field_a;
    static una field_k;
    static una field_m;
    static una field_g;
    static una field_f;
    static una field_i;
    static una field_l;
    static una field_h;
    static jea field_j;
    static int field_c;
    static String field_d;
    static int field_b;

    final static boolean a(byte param0) {
        int var1 = -97 / (param0 / 40);
        return qoa.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private una(int param0) {
        ((una) this).field_e = param0;
    }

    final static int a(BitSet param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2_int = ml.a(41);
            int discarded$2 = 83;
            var3 = qda.a(param0);
            var4 = aq.a(-5640);
            var5 = var3 * var2_int / var4;
            var5 = Math.min(2 + var5, var2_int);
            stackOut_2_0 = var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("una.C(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 20297 + 41);
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_m = null;
        field_a = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_j = null;
        field_d = null;
        field_l = null;
        field_k = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new una(1);
        field_k = new una(2);
        field_m = new una(4);
        field_g = new una(1);
        field_f = new una(2);
        field_i = new una(4);
        field_l = new una(2);
        field_h = new una(4);
        field_d = "Your game";
        field_c = 1;
    }
}
