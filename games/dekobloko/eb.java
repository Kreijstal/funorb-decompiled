/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    int field_e;
    String[] field_q;
    static ji field_k;
    int field_l;
    lk[] field_p;
    int field_o;
    int field_i;
    boolean field_j;
    static String field_n;
    int[] field_f;
    int field_a;
    int field_d;
    static String field_g;
    int field_h;
    static String field_r;
    int field_m;
    static String field_c;
    int field_b;

    final int d(int param0) {
        if (param0 != 6) {
            ((eb) this).field_p = null;
        }
        int var2 = 2;
        if (!(3 > ((eb) this).field_m)) {
            var2 = 4;
        }
        if (!(((eb) this).field_m < 4)) {
            var2 = 6;
        }
        return ka.a((byte) 81, var2, tf.field_cb) + 24;
    }

    public static void b(int param0) {
        field_g = null;
        field_n = null;
        field_r = null;
        field_c = null;
        field_k = null;
    }

    final static void c(int param0) {
        be.field_w[93] = 43;
        be.field_w[59] = 57;
        be.field_w[45] = 26;
        be.field_w[46] = 72;
        be.field_w[61] = 27;
        be.field_w[92] = 74;
        int var1 = 0;
        be.field_w[520] = 59;
        be.field_w[192] = 28;
        be.field_w[222] = 58;
        be.field_w[47] = 73;
        be.field_w[91] = 42;
        be.field_w[44] = 71;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        lk var4 = null;
        int var5 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param1 <= -49) {
            break L0;
          } else {
            ((eb) this).field_h = 43;
            break L0;
          }
        }
        ((eb) this).field_e = param0;
        ((eb) this).field_j = true;
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((eb) this).field_b) {
            return;
          } else {
            var4 = ((eb) this).field_p[var3];
            if (var4 != null) {
              var4.k(-9897);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        j.a(8225);
    }

    eb(int param0, boolean param1, int param2, int param3, int param4, int param5, String[] param6) {
        int var8_int = 0;
        try {
            ((eb) this).field_l = param0;
            ((eb) this).field_m = param5;
            ((eb) this).field_b = param6 != null ? param6.length : 1;
            ((eb) this).field_f = new int[((eb) this).field_b];
            ((eb) this).field_o = 0;
            ((eb) this).field_q = param6;
            ((eb) this).field_p = new lk[((eb) this).field_b];
            for (var8_int = 0; ((eb) this).field_b > var8_int; var8_int++) {
                ((eb) this).field_p[var8_int] = new lk(param1, param2, param3, param4, ((eb) this).field_m);
                ((eb) this).field_p[var8_int].field_Q = var8_int;
                ((eb) this).field_f[var8_int] = -1;
            }
            ((eb) this).field_i = ((eb) this).field_b;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "eb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You need to play <%0> more rated games to unlock this option.";
        field_r = "Quick Chat game";
        field_c = "SPEED UP!";
    }
}
