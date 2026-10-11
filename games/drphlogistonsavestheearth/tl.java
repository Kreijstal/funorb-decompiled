/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends hf {
    private rb field_M;
    static he field_P;
    static he[] field_I;
    static bb field_O;
    int field_K;
    private int field_N;
    static String field_J;
    static he[] field_Q;
    int field_L;

    final int a(int param0, byte param1) {
        if (param1 != 4) {
          return -25;
        }
        if (param0 < 0 ||
          param0 >= this.field_M.a(false)) {
          return -1;
        }
        return this.field_M.b(param1 - 39, param0);
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, (byte) 123, param4, param5, param6)) {
            if (param3 <= 113) {
              this.field_K = 36;
            }
            return false;
          }
          var8_int = -this.field_L + (param4 - param5);
          var9 = this.field_w - 2 * this.field_L;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = this.field_N * var8_int / var9;
          if (param2 == 1) {
            this.field_M.c(var8_int, -106);
          } else {
            if (param2 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_M.a(false) > var12; var12++) {
                var13 = this.field_M.b(-126, var12) - var8_int;
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_M.d(-19, var11);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_29_0 = var8;
          stackIn_29_1 = new StringBuilder().append("tl.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_O = null;
        if (param0 >= -14) {
          field_J = (String) null;
        }
        field_I = null;
        field_Q = null;
        field_P = null;
        field_J = null;
    }

    final int h(int param0) {
        if (param0 > -19) {
          vg var3 = (vg) null;
          this.a(-21, (vg) null, -12, (byte) -12, -64, -54, -43);
        }
        return this.field_M.a(false);
    }

    final int i(int param0) {
        if (param0 >= -28) {
          return -25;
        }
        return this.field_N;
    }

    final static ja a(lh param0, byte param1) {
        int var7 = 0;
        ja stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param0.e(8, (byte) -110);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = ti.a(param0, false) ? 1 : 0;
          var4 = ti.a(param0, false) ? 1 : 0;
          var5 = new ja();
          var5.field_q = (short)param0.e(16, (byte) -99);
          var5.field_J = uj.a(param0, (byte) 45, 16, var5.field_J);
          var5.field_w = uj.a(param0, (byte) -122, 16, var5.field_w);
          var5.field_P = uj.a(param0, (byte) -112, 16, var5.field_P);
          var5.field_m = (short)param0.e(16, (byte) 78);
          var5.field_h = uj.a(param0, (byte) 39, 16, var5.field_h);
          var5.field_a = uj.a(param0, (byte) 70, 16, var5.field_a);
          var5.field_K = uj.a(param0, (byte) 71, 16, var5.field_K);
          if (param1 < 91) {
            tl.a((byte) -124);
          }
          if (var3 != 0) {
            var5.field_H = (short)param0.e(16, (byte) -112);
            var5.field_k = uj.a(param0, (byte) 108, 16, var5.field_k);
            var5.field_B = uj.a(param0, (byte) -110, 16, var5.field_B);
            var5.field_E = uj.a(param0, (byte) 24, 16, var5.field_E);
            var5.field_A = uj.a(param0, (byte) 103, 16, var5.field_A);
            var5.field_l = uj.a(param0, (byte) -107, 16, var5.field_l);
            var5.field_e = uj.a(param0, (byte) -100, 16, var5.field_e);
          }
          if (var4 != 0) {
            param0.e(16, (byte) 82);
            var5.field_z = uj.a(param0, (byte) 44, 16, var5.field_z);
            var5.field_v = uj.a(param0, (byte) -116, 16, var5.field_v);
            var5.field_R = uj.a(param0, (byte) 63, 16, var5.field_R);
            var5.field_D = uj.a(param0, (byte) -113, 16, var5.field_D);
            var5.field_L = uj.a(param0, (byte) 60, 16, var5.field_L);
          }
          if (ti.a(param0, false)) {
            var5.field_M = uj.a(param0, (byte) 13, 16, var5.field_M);
          }
          if (ti.a(param0, false)) {
            var5.field_O = nl.a((byte) 65, 16, param0, var5.field_O);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_O.length; var7++) {
              if ((var5.field_O[var7] & 255) > var6) {
                var6 = 255 & var5.field_O[var7];
              }
            }
            if (0 != var6) {
              var5.field_G = (byte)(1 + var6);
            } else {
              var5.field_O = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("tl.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private tl() throws Throwable {
        throw new Error();
    }

    static {
        field_J = "Please wait...";
    }
}
