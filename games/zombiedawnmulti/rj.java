/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends id {
    private boolean field_H;
    static int field_J;
    static ja[] field_I;
    static int field_F;
    private boolean field_G;

    final void f(byte param0) {
        if (param0 >= -79) {
          rj.i(14);
        }
    }

    rj(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int var4;
        this.field_G = false;
        this.field_H = false;
        var4 = hp.a((byte) 104, g.field_a, 2);
        if (var4 == 1) {
          this.field_G = true;
        } else {
          if (2 == var4) {
            this.field_H = true;
          }
        }
    }

    final static void a(int param0, byte param1, String param2) {
        try {
          er.field_i = un.field_k;
          int var3_int = 75 % ((43 - param1) / 55);
          b.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rj.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = param1.c(this.g(65) - 24, -20126);
          var4 = param1.d(this.h(96) - 24, 106);
          if (var3_int >= -48 &&
            var4 >= -48 &&
            !(640.0f * param1.field_d < (float)var3_int) &&
            !(480.0f * param1.field_d < (float)var4)) {
            if (!this.field_G) {
              if (!this.field_H) {
                cp.field_X[this.field_C].g(var3_int, var4);
              } else {
                cp.field_X[this.field_C].a(var3_int, var4);
              }
            } else {
              cp.field_X[this.field_C].b(var3_int, var4);
            }
            if (param0 != -10136) {
              rj.i(-46);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("rj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != 8784) {
          field_F = -106;
        }
    }

    final static void i(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        nh var4 = null;
        kj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ga var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != 3) {
            rj.j(-22);
          }
          var28 = s.field_e;
          var2 = var28.g(param0 + 31362);
          if (var2 == 0) {
            var3 = var28.d((byte) 69);
            var4 = (nh) (pn.field_f.c(71));
            while (var4 != null) {
              if (var3 != var4.field_l) {
                var4 = (nh) (pn.field_f.b(6));
                continue;
              }
              break;
            }
            if (var4 == null) {
              ak.a((byte) -119);
              return;
            }
            var5 = var28.g(param0 ^ 31366);
            if (var5 == 0) {
              var4.a(true);
              return;
            }
            var6 = var4.field_k;
            ha.field_j[0].field_g = false;
            ha.field_j[0].field_d = ta.field_lb;
            ha.field_j[0].field_c = null;
            var7 = var4.field_f;
            for (var8_int = 1; var5 > var8_int; var8_int++) {
              ha.field_j[var8_int].field_d = var28.f((byte) -121);
              ha.field_j[var8_int].field_g = false;
              if (1 != var28.g(31365)) {
                ha.field_j[var8_int].field_c = null;
              } else {
                ha.field_j[var8_int].field_c = var28.f((byte) -81);
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var35 = new long[3][var6];
            var36 = new int[3][var7 * var6];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var28.g(31365);
            if (var18 <= 0) {
              var4.a(true);
              return;
            }
            for (var19 = 0; var18 > var19; var19++) {
              var20 = var28.g(31365);
              var21 = ha.field_j[var20].field_d;
              var22 = var28.a((byte) -30);
              var24 = var28.field_j;
              if (var6 > var19) {
                var8[0][var12] = var21;
                var9[0][var12] = ha.field_j[var20].field_c;
                var35[0][var12] = var22;
                var12++;
                for (var25 = 0; var7 > var25; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var36[0][incrementValue$0] = var28.i(-1478490344);
                }
              }
              if (var21 != null &&
                sf.a(1, var21)) {
                var8[1][var13] = ta.field_lb;
                var9[1][var13] = null;
                var35[1][var13] = var22;
                var13++;
                var28.field_j = var24;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var36[1][incrementValue$1] = var28.i(-1478490344);
                }
              }
              if (var14 < var6 &&
                !ha.field_j[var20].field_g) {
                ha.field_j[var20].field_g = true;
                var8[2][var14] = var21;
                var9[2][var14] = ha.field_j[var20].field_c;
                var35[2][var14] = var22;
                var14++;
                var28.field_j = var24;
                for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var36[2][incrementValue$2] = var28.i(-1478490344);
                }
              }
            }
            var4.a(true);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.d((byte) 69);
            var28.a((byte) -30);
            var4_ref = (kj) (md.field_u.c(102));
            while (var4_ref != null) {
              if (var4_ref.field_i != var3Lifetime1) {
                var4_ref = (kj) (md.field_u.b(6));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              ak.a((byte) -115);
              return;
            }
            var4_ref.a(true);
            return;
          }
          bd.a("HS1: " + ci.a(param0 ^ 3), (Throwable) null, false);
          ak.a((byte) -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rj.J(" + param0 + ')');
        }
    }

    static {
    }
}
