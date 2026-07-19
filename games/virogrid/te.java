/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class te extends IOException {
    static String field_g;
    static jd field_b;
    static p field_f;
    static wl field_d;
    static String field_c;
    static String[] field_e;
    static int field_i;
    static String field_a;
    static int field_h;

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 <= 122) {
          return;
        } else {
          field_g = null;
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    te(String param0) {
        super(param0);
    }

    final static void a(int param0, sa param1, int param2) {
        hg var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = gk.field_g;
            var5.g(param2, 8);
            var5.field_l = var5.field_l + 1;
            var4 = var5.field_l;
            var5.a(param0, 98);
            var5.a(param1.field_i, 88);
            var5.a(param1.field_k, param0 + -124);
            var5.a(param1.field_j, (byte) -42);
            var5.a(param1.field_h, (byte) -42);
            var5.a(param1.field_g, (byte) -42);
            var5.a(param1.field_n, (byte) -42);
            discarded$0 = var5.b((byte) -111, var4);
            var5.b(-var4 + var5.field_l, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "te.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (null == km.field_yb) {
            break L0;
          } else {
            var3 = km.field_yb.a(2105376, param0);
            if ((var3 ^ -1) != 1) {
              L1: {
                if (var3 != -1) {
                  var4 = km.field_yb.h(140) ? 1 : 0;
                  kf.a(param2, var3, km.field_yb.field_Mb, 125, km.field_yb.e((byte) -72), var4 != 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              km.field_yb = null;
              ch.a(true);
              break L0;
            } else {
              if (param1 < -118) {
                return;
              } else {
                field_f = (p) null;
                return;
              }
            }
          }
        }
        if (param1 >= -118) {
          field_f = (p) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_g = "Waiting for music";
        field_b = new jd();
        field_d = new wl();
        field_c = "Start Game";
        field_a = "Service unavailable";
        field_i = 0;
    }
}
