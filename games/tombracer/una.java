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
        int var1 = -97 / ((param0 - 0) / 40);
        return qoa.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private una(int param0) {
        this.field_e = param0;
    }

    final static int a(BitSet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 20297) {
              var2_int = ml.a(41);
              var3 = qda.a(param0, 83);
              var4 = aq.a(-5640);
              var5 = var3 * var2_int / var4;
              var5 = Math.min(2 + var5, var2_int);
              stackIn_4_0 = var5;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -19;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("una.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        BitSet var2;
        field_m = null;
        if (!param0) {
          var2 = (BitSet) null;
          una.a((BitSet) null, -34);
          field_a = null;
          field_g = null;
          field_f = null;
          field_i = null;
          field_j = null;
          field_d = null;
          field_l = null;
          field_k = null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_f = null;
          field_i = null;
          field_j = null;
          field_d = null;
          field_l = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    static {
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
