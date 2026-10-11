/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg extends RuntimeException {
    String field_b;
    Throwable field_e;
    static String field_c;
    static int[] field_f;
    static String field_g;
    static int field_d;
    static int field_a;

    final static void a(boolean param0) {
        em.field_h = 0;
        bo.r(0);
        if (!param0) {
          int[] var2 = (int[]) null;
          rg.a(-36, -67, -120, (int[]) null, (int[]) null);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          gf.f(param3, param1, param4 + 1, 10000536);
          gf.f(param3, param2 + param1, 1 + param4, 12105912);
          var5_int = 1;
          var6 = param2;
          if (var5_int + param1 < gf.field_a) {
            var5_int = -param1 + gf.field_a;
          }
          if (gf.field_f < param1 + var6) {
            var6 = -param1 + gf.field_f;
          }
          var7 = -57 % ((param0 - 36) / 45);
          for (var8 = var5_int; var8 < var6; var8++) {
            var9 = 48 * var8 / param2 + 152;
            var10 = var9 << 8 | var9 << 16 | var9;
            gf.field_h[param3 + gf.field_b * (var8 + param1)] = var10;
            gf.field_h[param4 + param3 + (param1 + var8) * gf.field_b] = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "rg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          field_f = (int[]) null;
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        boolean stackIn_13_0 = false;
        v stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = ah.field_R - ld.field_j;
          ld.field_j = -(var1_int >> 1) + ol.field_e;
          vo.field_b = -(rn.field_b >> 1) + ri.field_O;
          ah.field_R = ld.field_j + var1_int;
          var2 = vo.field_b;
          if (param0 <= 32) {
            return;
          }
          for (var3 = 0; t.field_c.length > var3; var3++) {
            var4 = pr.field_d[var3];
            if (0 > var4) {
              var5 = em.field_j;
            } else {
              if (var4 == ns.field_nb.field_c) {
                var5 = wo.field_a;
              } else {
                var5 = ih.field_b;
              }
            }
            var6 = t.field_c[var3];
            stackIn_13_0 = !(var4 < 0);
            var7 = or.a(stackIn_13_0, var6, true);
            var8 = ol.field_e - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + js.field_e;
              if (ns.field_nb.field_c != var4) {
                stackIn_17_0 = cr.field_e;
              } else {
                stackIn_17_0 = jp.field_Cb;
              }
              var9 = stackIn_17_0;
              if (var9 != null) {
                var9.a((uo.field_g << 1) + vh.field_b, -js.field_g + var8, var2, var7 + (js.field_g << 1), -103);
              }
              var2 = var2 + uo.field_g;
            }
            if (var4 >= 0) {
              kc.field_g.d(var6, var8, var2 + we.field_c, var5, -1);
              var2 = var2 + (vh.field_b + js.field_e + uo.field_g);
            } else {
              lq.field_k.d(var6, var8, var2 + sp.field_r, var5, -1);
              var2 = var2 + fe.field_A;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "rg.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4) {
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -2147483648) {
            return;
          }
          if (param2 > param0) {
            var5_int = (param0 + param2) / 2;
            var6 = param0;
            var7 = param4[var5_int];
            param4[var5_int] = param4[param2];
            param4[param2] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param2];
            param3[param2] = var8;
            stackIn_8_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_8_0;
            for (var10 = param0; param2 > var10; var10++) {
              if ((-(var9 & var10) + var7) < param4[var10]) {
                var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param4[param2] = param4[var6];
            param4[var6] = var7;
            param3[param2] = param3[var6];
            param3[var6] = var8;
            rg.a(param0, -2147483648, -1 + var6, param3, param4);
            rg.a(1 + var6, -2147483648, param2, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 < 81) {
          field_d = -104;
          return hi.a(param0 + (-param1 + 1), tg.field_b, -11) + param1;
        }
        return hi.a(param0 + (-param1 + 1), tg.field_b, -11) + param1;
    }

    public static void b(int param0) {
        if (param0 <= 54) {
          field_d = 111;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_g = null;
        field_c = null;
        field_f = null;
    }

    rg(Throwable param0, String param1) {
        this.field_e = param0;
        this.field_b = param1;
    }

    static {
        field_c = "Logging in...";
        field_a = 56;
        field_g = "Fleets built";
    }
}
