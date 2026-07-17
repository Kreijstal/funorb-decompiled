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
        de.field_o = null;
    }

    public static void a() {
        field_n = null;
        field_i = null;
        field_b = null;
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        em var11 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        we stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof em)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (we) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (we) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (em) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_w;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              ge.d(param3 + param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, ((pb) this).field_g);
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = ((pb) this).field_k + (param1.field_r + param3);
              var9 = param2 + (param1.field_e + ((pb) this).field_m);
              ge.a(var8, var9, ((pb) this).field_o, ((pb) this).field_d, 5592405);
              ge.d(var8, var9, ((pb) this).field_o, ((pb) this).field_d, var7);
              if (var11.field_u) {
                ge.e(var8, var9, var8 - -((pb) this).field_o, var9 - -((pb) this).field_d, 1);
                ge.e(var8 + ((pb) this).field_o, var9, var8, var9 + ((pb) this).field_d, 1);
                break L4;
              } else {
                break L4;
              }
            }
            if (param4 >= 19) {
              if (((pb) this).field_l != null) {
                var10 = ((pb) this).field_k + (((pb) this).field_o + ((pb) this).field_a);
                int discarded$1 = ((pb) this).field_l.a(param1.field_s, var10 + param1.field_r + param3, param1.field_e + (param2 - -((pb) this).field_h), param1.field_l + -((pb) this).field_a + -var10, param1.field_p + -(((pb) this).field_a << 1), ((pb) this).field_j, ((pb) this).field_f, ((pb) this).field_c, ((pb) this).field_e, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("pb.C(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    pb(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((pb) this).field_c = 1;
        ((pb) this).field_e = 1;
        try {
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
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Password is valid";
        field_n = new Random();
    }
}
