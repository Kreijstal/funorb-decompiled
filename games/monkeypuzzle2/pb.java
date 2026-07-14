/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pb implements ml {
    private int field_o;
    private int field_k;
    static java.security.SecureRandom field_b;
    private int field_m;
    private int field_f;
    private int field_c;
    private int field_e;
    static String field_i;
    private ta field_l;
    private int field_h;
    static Random field_n;
    private int field_g;
    private int field_a;
    private int field_j;
    private int field_d;

    final static void a(boolean param0) {
        ei.field_b = null;
        if (param0) {
            field_b = null;
            de.field_o = null;
            return;
        }
        de.field_o = null;
    }

    public static void a(byte param0) {
        field_n = null;
        field_i = null;
        if (param0 <= 43) {
            return;
        }
        field_b = null;
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        em var11 = null;
        we stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        we stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof em)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (we) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (we) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (em) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_w;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          ge.d(param3 + param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, ((pb) this).field_g);
          if (!param0) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          var8 = ((pb) this).field_k + (param1.field_r + param3);
          var9 = param2 + (param1.field_e + ((pb) this).field_m);
          ge.a(var8, var9, ((pb) this).field_o, ((pb) this).field_d, 5592405);
          ge.d(var8, var9, ((pb) this).field_o, ((pb) this).field_d, var7);
          if (var11.field_u) {
            ge.e(var8, var9, var8 - -((pb) this).field_o, var9 - -((pb) this).field_d, 1);
            ge.e(var8 + ((pb) this).field_o, var9, var8, var9 + ((pb) this).field_d, 1);
            break L3;
          } else {
            break L3;
          }
        }
        if (param4 < 19) {
          return;
        } else {
          L4: {
            if (((pb) this).field_l != null) {
              var10 = ((pb) this).field_k + (((pb) this).field_o + ((pb) this).field_a);
              int discarded$1 = ((pb) this).field_l.a(param1.field_s, var10 + param1.field_r + param3, param1.field_e + (param2 - -((pb) this).field_h), param1.field_l + -((pb) this).field_a + -var10, param1.field_p + -(((pb) this).field_a << 378045761), ((pb) this).field_j, ((pb) this).field_f, ((pb) this).field_c, ((pb) this).field_e, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    pb(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((pb) this).field_c = 1;
        ((pb) this).field_e = 1;
        ((pb) this).field_d = param7;
        ((pb) this).field_f = param4;
        ((pb) this).field_h = param2;
        ((pb) this).field_k = param5;
        ((pb) this).field_j = param3;
        ((pb) this).field_a = param1;
        ((pb) this).field_l = param0;
        ((pb) this).field_g = param9;
        ((pb) this).field_m = param6;
        ((pb) this).field_o = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Password is valid";
        field_n = new Random();
    }
}
