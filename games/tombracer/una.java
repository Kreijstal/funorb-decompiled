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
        ((una) this).field_e = param0;
    }

    final static int a(BitSet param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param1 != 20297) {
          return -19;
        } else {
          var2 = ml.a(41);
          var3 = qda.a(param0, 83);
          var4 = aq.a(-5640);
          var5 = var3 * var2 / var4;
          var5 = Math.min(2 + var5, var2);
          return var5;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_m = null;
        if (!param0) {
          var2 = null;
          int discarded$2 = una.a((BitSet) null, -34);
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
