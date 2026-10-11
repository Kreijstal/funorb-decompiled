/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends ph {
    private df field_O;
    int field_G;
    static int field_N;
    static vi field_M;
    static int[] field_K;
    int field_H;
    static bd field_I;
    static bd field_L;
    private int field_J;
    static int field_P;

    final int a(byte param0) {
        if (param0 != 65) {
          return 117;
        }
        return this.field_O.b(-25);
    }

    final int j(int param0) {
        if (param0 != 11884) {
          field_I = (bd) null;
          return this.field_J;
        }
        return this.field_J;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 != -24224) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (param0 == null) {
            stackIn_6_0 = hm.field_n;
            return stackIn_6_0;
          }
          var3_int = param0.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = mf.a(false, param0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!rg.a((byte) -109, var4.charAt(0)) &&
                !rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!rg.a((byte) -109, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_30_0 = mm.field_k;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = ui.field_g;
                return stackIn_35_0;
              }
              stackIn_21_0 = ui.field_g;
              return stackIn_21_0;
            }
            stackIn_16_0 = hm.field_n;
            return stackIn_16_0;
          }
          stackIn_11_0 = hm.field_n;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("tb.B(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private tb() throws Throwable {
        throw new Error();
    }

    final static void f(byte param0) {
        if (null == wa.field_q) {
          return;
        }
        v.a(8, wa.field_q);
        wa.field_q.a(true, gf.field_b);
        if (param0 < -84) {
          wa.field_q = null;
          if (ie.field_c != null) {
            ie.field_c.c(73);
          }
          se.field_h.requestFocus();
          return;
        }
        tb.e((byte) -36);
        wa.field_q = null;
        if (ie.field_c != null) {
          ie.field_c.c(73);
        }
        se.field_h.requestFocus();
    }

    public static void e(byte param0) {
        field_K = null;
        field_I = null;
        field_L = null;
        field_M = null;
        if (param0 <= 47) {
          field_L = (bd) null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_G + (-param1 + param0);
          var9 = this.field_s - this.field_G * 2;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_J / var9;
          if (param6 != 1) {
            if (param6 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_O.b(-25) > var12; var12++) {
                var13 = this.field_O.a(var12, -2262) - var8_int;
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 >= 0) {
                this.field_O.a(var11, (byte) 35);
              }
            }
          } else {
            this.field_O.b(true, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("tb.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (0 > param0) {
          return -1;
        }
        if (this.field_O.b(param1 + 24559) <= param0) {
          return -1;
        }
        if (param1 == -24584) {
          return this.field_O.a(param0, param1 ^ 26834);
        }
        field_L = (bd) null;
        return this.field_O.a(param0, param1 ^ 26834);
    }

    static {
        field_N = 0;
        field_K = new int[8192];
    }
}
