/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ji {
    static pm field_y;
    static int field_z;
    static String field_B;
    static String field_A;

    final static ch a(int param0, boolean param1, String param2) {
        ch var3 = null;
        var3 = new ch(false);
        var3.field_j = param2;
        if (!param1) {
          fn.g(-82);
          var3.field_h = param0;
          return var3;
        } else {
          var3.field_h = param0;
          return var3;
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11) {
        Object var13 = null;
        ok.a(param6, param10, param1, param5, param11, param7, 16777215, 12423, param2, param3, param9, param8, param4, 16777215);
        if (param0 > 84) {
          return;
        } else {
          var13 = null;
          ch discarded$2 = fn.a(113, true, (String) null);
          return;
        }
    }

    public static void g(int param0) {
        field_B = null;
        field_y = null;
        field_A = null;
        if (param0 == 4096) {
            return;
        }
        fn.g(36);
    }

    public fn() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 57 * param2 + param0;
        if (param1 != 2147483647) {
          fn.a(42, 102, 48, -125, -26, (byte) 110, 39, -15);
          var4 = var4 << 1592357409 ^ var4;
          return -(((15731 * (var4 * var4) + 789221) * var4 - -1376312589 & 2147483647) / 262144) + 4096;
        } else {
          var4 = var4 << 1592357409 ^ var4;
          return -(((15731 * (var4 * var4) + 789221) * var4 - -1376312589 & 2147483647) / 262144) + 4096;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var7 = ((fn) this).field_x.a(param0, (byte) -108);
          var3 = var7;
          if (((fn) this).field_x.field_i) {
            var4 = lf.field_y[param0];
            var5 = 0;
            L0: while (true) {
              if (we.field_M > var5) {
                var7[var5] = this.d(rh.field_O[var5], 2147483647, var4) % 4096;
                var5++;
                continue L0;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var19 = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param5 == -11) {
          var9 = param3 - param4;
          var8 = param2 - -param4;
          var12 = param2;
          L0: while (true) {
            if (var8 <= var12) {
              var11 = param0 + -param4;
              var10 = param1 - -param4;
              var12 = param3;
              L1: while (true) {
                if (var12 <= var9) {
                  var12 = var8;
                  L2: while (true) {
                    if (var9 >= var12) {
                      var19 = vl.field_e[var12];
                      ki.a(-87, param1, var19, var10, param7);
                      ki.a(-90, var10, var19, var11, param6);
                      ki.a(-83, var11, var19, param0, param7);
                      var12++;
                      continue L2;
                    } else {
                      return;
                    }
                  }
                } else {
                  ki.a(-83, param1, vl.field_e[var12], param0, param7);
                  var12--;
                  continue L1;
                }
              }
            } else {
              ki.a(-75, param1, vl.field_e[var12], param0, param7);
              var12++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Resign";
        field_A = "<%0> has been removed.";
    }
}
