/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends ag {
    int field_T;
    static String field_H;
    static volatile int field_K;
    static nf field_O;
    static String[] field_I;
    static String field_S;
    static String field_J;
    static String field_R;
    static String field_N;
    int field_Q;
    static String field_L;
    int field_M;
    int field_P;
    int field_U;
    int field_V;

    final static void g(int param0) {
        int var16 = 0;
        int var20 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var22Lifetime1;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (0 == vn.field_b.field_A.length) {
            return;
          }
          var1_int = -1;
          var2 = 0;
          var3 = -1;
          var4 = 0;
          if (16777215 != vn.field_b.field_A[0]) {
            var5 = 16777062;
            var6 = 13985024;
            var7 = 10027008;
            var8 = 16750848;
            var9 = 16577194;
            var10 = 16777113;
            var11 = 0;
            var14 = new int[]{(16711680 & var7) >> 16, (var7 & 65280) >> 8, var7 & 255, (16711680 & var8) >> 16, (65280 & var8) >> 8, var8 & 255};
            var15 = new int[]{var5 >> 16 & 255, (65280 & var5) >> 8, var5 & 255, 255 & var6 >> 16, (65280 & var6) >> 8, var6 & 255};
            for (var16 = 0; vn.field_b.field_y > var16; var16++) {
              var17 = -var16 + vn.field_b.field_y;
              var18 = (var14[2] * var16 + var14[5] * var17) / vn.field_b.field_y + ((var17 * var14[3] + var16 * var14[0]) / vn.field_b.field_y * 65536 + 256 * ((var14[4] * var17 + var14[1] * var16) / vn.field_b.field_y));
              var13 = sm.field_d.field_w * (var16 % sm.field_d.field_w);
              var19 = (var17 * var15[2] + var15[5] * var16) / vn.field_b.field_y + (256 * ((var17 * var15[1] + var15[4] * var16) / vn.field_b.field_y) + (var15[0] * var17 + var16 * var15[3]) / vn.field_b.field_y * 65536);
              var12 = g.field_a.field_w * (var16 % g.field_a.field_w);
              for (var20 = 0; var20 < vn.field_b.field_q; var20++) {
                var21 = vn.field_b.field_A[var11];
                if (16711680 == var21 ||
                  var21 == 16646144) {
                  var21 = var18;
                  var22 = 255 & g.field_a.field_A[var12];
                  var22 = (3 * var22 + 4352) / 20;
                  vn.field_b.field_A[var11] = dg.a(dg.a(16711680, var21) * var22 >> 8, 16711680) + (dg.a(16711874, dg.a(var21, 65280) * var22) >> 8) + dg.a(255, var22 * dg.a(255, var21) >> 8);
                  var22 = 256 - var22;
                  vn.field_b.field_A[var11] = vn.field_b.field_A[var11] + (dg.a(var22 * dg.a(var10, 16711680) >> 8, 16711680) + (dg.a(65280, var22 * dg.a(65280, var10) >> 8) + (dg.a(65495, dg.a(var10, 255) * var22) >> 8)));
                  if (vn.field_b.field_A[var11] == 0) {
                    vn.field_b.field_A[var11] = 1;
                  }
                }
                if (var21 == 65280 ||
                  var21 == 65024) {
                  var21 = var19;
                  var22Lifetime1 = 255 & sm.field_d.field_A[var13];
                  var22Lifetime1 = (var22Lifetime1 + 256) / 2;
                  vn.field_b.field_A[var11] = (dg.a(dg.a(var21, 255) * var22Lifetime1, 65435) >> 8) + (dg.a(16711680, dg.a(16711680, var21) * var22Lifetime1 >> 8) + (dg.a(dg.a(var21, 65280) * var22Lifetime1, 16711725) >> 8));
                  var22Lifetime1 = -var22Lifetime1 + 256;
                  vn.field_b.field_A[var11] = vn.field_b.field_A[var11] + (dg.a(65280, var22Lifetime1 * dg.a(var9, 65280) >> 8) + dg.a(dg.a(16711680, var9) * var22Lifetime1 >> 8, 16711680) + dg.a(255, var22Lifetime1 * dg.a(255, var9) >> 8));
                  if (vn.field_b.field_A[var11] == 0) {
                    vn.field_b.field_A[var11] = 1;
                  }
                }
                if (65535 == var21 ||
                  var21 == 65278) {
                  if (var1_int == -1) {
                    var2 = var16;
                    var1_int = var20;
                  } else {
                    var4 = var16;
                    var3 = var20;
                  }
                }
                var11++;
                var12++;
                if (var12 >= g.field_a.field_A.length) {
                  var12 = 0;
                }
                var13++;
                if (sm.field_d.field_A.length <= var13) {
                  var13 = 0;
                }
              }
            }
          }
          vn.field_b.field_A[0] = 0;
          for (var5 = -3; var5 <= 3; var5++) {
            vn.field_b.a(-4, 0 + var5, 1);
            vn.field_b.a(4, var5 + 0, 1);
            vn.field_b.a(var5, -4, 1);
            vn.field_b.a(var5, 4, 1);
          }
          for (var5 = -2; var5 <= 2; var5++) {
            vn.field_b.a(-3, var5 + 0, 13421772);
            vn.field_b.a(3, 0 + var5, 13421772);
            vn.field_b.a(var5, -3, 13421772);
            vn.field_b.a(var5, 3, 13421772);
          }
          for (var5 = -1; var5 <= 1; var5++) {
            vn.field_b.a(-2, var5 + 0, 16777215);
            vn.field_b.a(2, 0 + var5, 16777215);
            vn.field_b.a(var5, -2, 16777215);
            vn.field_b.a(var5, 2, 16777215);
          }
          vn.field_b.a(1, -1, 14540253);
          if (param0 != 491697968) {
            return;
          }
          vn.field_b.a(1, 0, 13421772);
          vn.field_b.a(0, 1, 12303291);
          vn.field_b.a(1, 1, 11184810);
          vn.field_b.c(0, 0);
          if (-1 != var1_int) {
            var1_int = var1_int + vn.field_b.field_x;
            var2 = var2 + vn.field_b.field_o;
            for (var5 = 0; var5 < 50; var5++) {
              gn.a(2, (byte) 92, 50 - var5, var1_int, var5 + var2);
              gn.a(2, (byte) 93, -var5 + 50, var1_int, -var5 + var2);
              gn.a(2, (byte) 76, -var5 + 50, var5 + var1_int, var2);
              gn.a(2, (byte) 87, -var5 + 50, -var5 + var1_int, var2);
            }
            for (var5 = 0; var5 < 100; var5++) {
              var6 = (int)(Math.sin(3.141592653589793 * (double)var5 / 50.0) * 40.0 + (double)var1_int);
              var7 = (int)(Math.cos((double)var5 * 3.141592653589793 / 50.0) * 40.0 + (double)var2);
              gn.a(2, (byte) 61, 16, var6, var7);
            }
            gn.a(16, (byte) 99, 32, var1_int, var2);
          }
          if (var3 != -1) {
            var4 = var4 + vn.field_b.field_o;
            var3 = var3 + vn.field_b.field_x;
            for (var5 = 0; var5 < 30; var5++) {
              gn.a(2, (byte) 72, -var5 + 30, var3, var4 + var5);
              gn.a(2, (byte) 72, 30 - var5, var3, var4 - var5);
              gn.a(2, (byte) 88, -var5 + 30, var3 + var5, var4);
              gn.a(2, (byte) 109, -var5 + 30, var3 - var5, var4);
            }
            for (var5 = 0; var5 < 100; var5++) {
              var6 = (int)((double)var3 + 20.0 * Math.sin(3.141592653589793 * (double)var5 / 50.0));
              var7 = (int)(20.0 * Math.cos((double)var5 * 3.141592653589793 / 50.0) + (double)var4);
              gn.a(2, (byte) 126, 8, var6, var7);
            }
          }
          vn.field_b.field_A[0] = 16777215;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rk.G(" + param0 + ')');
        }
    }

    final static void f(int param0) {
        jb.field_m = null;
        int var1 = 91 % ((param0 - 47) / 56);
        ik.field_e = null;
    }

    final static boolean a(byte param0, int param1, int param2) {
        int var3 = -66 / ((param0 - 8) / 46);
        int var4 = om.field_x != null ? 1 : 0;
        if (vn.field_d == 9 &&
          wj.a(of.field_c, ao.field_e, gd.field_rb, 2, fo.field_h)) {
          if (2 != gd.field_rb &&
            var4 != 0) {
            return false;
          }
          return va.a(fo.field_h, 1, ao.field_e, of.field_c, gd.field_rb);
        }
        if (vn.field_d == 10) {
          if (var4 != 0) {
            return false;
          }
          gj.a((byte) 103);
          return true;
        }
        if (vn.field_d == 11 &&
          bo.field_c) {
          if (2 == qj.field_c &&
            !kg.a(rf.field_n, true, vh.field_A)) {
            return false;
          }
          if (qj.field_c != 2 &&
            var4 != 0) {
            return false;
          }
          if (!le.a((byte) 82)) {
            return true;
          }
          String var5 = (String) null;
          sd.a(hi.field_g, (String) null, 68, param1, qj.field_c, vh.field_A);
          return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var8_int = -57 / ((param4 + 42) / 35);
          if (!super.a(param0, param1, param2, param3, 92, param5, param6)) {
            return false;
          }
          var9 = -this.field_T - this.field_n - (param6 - param5);
          var10 = param0 - (this.field_U + this.field_j) - param3;
          if (var9 * var9 + var10 * var10 >= this.field_V * this.field_V) {
            return true;
          }
          var11 = Math.atan2((double)var10, (double)var9) - jh.field_h;
          if (0.0 > var11) {
            var11 = var11 - 3.141592653589793 / (double)this.field_P;
          } else {
            if (0.0 < var11) {
              var11 = var11 + 3.141592653589793 / (double)this.field_P;
            }
          }
          this.field_Q = (int)(var11 * (double)this.field_P / 6.283185307179586);
          while (this.field_Q >= this.field_P) {
            this.field_Q = this.field_Q - this.field_P;
          }
          while (this.field_Q < 0) {
            this.field_Q = this.field_Q + this.field_P;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("rk.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2;
        boolean stackIn_7_0 = false;
        var2 = 50 / ((65 - param0) / 52);
        stackIn_7_0 = (param1 == 160) || (32 == param1) || (param1 == 95) || (45 == param1);
        return stackIn_7_0;
    }

    public static void h(int param0) {
        field_R = null;
        field_O = null;
        field_J = null;
        if (param0 > -100) {
          field_H = (String) null;
        }
        field_L = null;
        field_S = null;
        field_I = null;
        field_H = null;
        field_N = null;
    }

    final static long a(int param0) {
        if (param0 >= -45) {
          rk.a((byte) -44, 74, 126);
        }
        return -hi.field_d + qj.b(-26572);
    }

    private rk() throws Throwable {
        throw new Error();
    }

    static {
        field_K = 0;
        field_H = "Achieved";
        field_J = "Elven Isles:";
        field_S = "MOST FIT - ";
        field_R = "Service unavailable";
        field_N = "Chat is currently disabled.";
        field_L = "Unable to delete name - system busy";
    }
}
