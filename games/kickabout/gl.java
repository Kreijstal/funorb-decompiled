/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    byte[] field_m;
    int field_h;
    int field_g;
    byte[] field_b;
    static iw field_a;
    int field_k;
    int field_j;
    int field_l;
    static hd field_c;
    static int[] field_d;
    static String field_f;
    static String field_i;
    int field_n;

    final static int a(int param0, byte param1, int param2, int param3, ml param4, int param5, int param6, int param7, int param8, int param9) {
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        try {
          if (param1 <= 32) {
            field_a = (iw) null;
          }
          var10_int = param4.l(2, 59);
          if (0 == var10_int) {
            if (0 == param2) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = param4.l(param2, 59);
            }
            return stackIn_25_0;
          }
          if (1 == var10_int) {
            if (0 == param5) {
              stackIn_7_0 = 0;
            } else {
              stackIn_7_0 = param4.l(param5, 59);
            }
            stackIn_8_0 = stackIn_7_0 + param8;
            return stackIn_8_0;
          }
          if (var10_int == 2) {
            stackIn_12_0 = param8;
            if (param9 != 0) {
              stackIn_13_1 = param4.l(param9, 59);
            } else {
              stackIn_13_1 = 0;
            }
            stackIn_14_0 = stackIn_12_0 + stackIn_13_1 + param0;
            return stackIn_14_0;
          }
          if (var10_int != 3) {
            throw new IllegalStateException();
          }
          stackIn_19_0 = param8;
          if (param3 != 0) {
            stackIn_20_1 = param4.l(param3, 59);
          } else {
            stackIn_20_1 = 0;
          }
          stackIn_21_0 = stackIn_19_0 + stackIn_20_1 + param7 + param0;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_28_0 = var10;
          stackIn_28_1 = new StringBuilder().append("gl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0, nu param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nu var12 = null;
        var11 = Kickabout.field_G;
        try {
          if (param0 != 6711) {
            var12 = (nu) null;
            gl.a(-102, (nu) null);
          }
          if (in.field_c == null) {
            in.field_c = new int[2][4][4][10][2];
          }
          if (nd.field_d == param1) {
            return;
          }
          nd.field_d = param1;
          for (var2_int = 0; var2_int < 2; var2_int++) {
            for (var3 = 0; var3 < 4; var3++) {
              for (var4 = 0; 4 > var4; var4++) {
                var5 = in.field_c[var2_int][var3][var4].length;
                for (var6 = 0; var5 > var6; var6++) {
                  if (var4 != 0) {
                    if (var4 != 2) {
                      var7 = var6 * 896 / (-1 + var5);
                    } else {
                      var7 = 896;
                    }
                  } else {
                    var7 = 0;
                  }
                  if (var4 == 1) {
                    var8 = 0;
                  } else {
                    if (var4 != 3) {
                      var8 = 1344 * var6 / (-1 + var5);
                    } else {
                      var8 = 1344;
                    }
                  }
                  var9 = param1.field_V.field_t;
                  var10 = param1.field_V.field_p;
                  param1.field_V.field_t = var7 << 16;
                  param1.field_V.field_p = var8 << 16;
                  vl.a(param1, (byte) -75);
                  param1.field_V.field_t = var9;
                  param1.field_V.field_p = var10;
                  gt.a(var3 + 1, var2_int, (byte) 112, param1.field_r[var2_int]);
                  in.field_c[var2_int][var3][var4][var6][0] = ge.field_m[0];
                  in.field_c[var2_int][var3][var4][var6][1] = ge.field_m[1];
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("gl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static ut[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 34 % ((param1 - 38) / 37);
        return q.a(1, 1, param2, 1, 3, -1481, param4, param0, param3);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 <= 25) {
          return;
        }
        field_i = null;
    }

    static {
        field_a = new iw(256);
        field_i = "help";
        field_f = "Starting price";
    }
}
