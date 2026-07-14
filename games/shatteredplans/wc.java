/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_b;
    static hc[] field_a;

    final static void a(int param0, int param1, int param2, bi param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 < 128) {
          L0: {
            if (128 <= param1) {
              stackOut_16_0 = -128 + param1;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = 0;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          var6 = stackIn_17_0;
          var7 = param1;
          if (param0 != -27030) {
            field_b = null;
            var8 = var6;
            L1: while (true) {
              if (var7 <= var8) {
                gf.a();
                return;
              } else {
                gf.d(param2 - -var8, 0, param2 + (var8 + 1), 480 + param4);
                var9 = param5 * (-var8 + param1) >> 518924039;
                param3.c(param2, param4, var9);
                var8++;
                continue L1;
              }
            }
          } else {
            var8 = var6;
            L2: while (true) {
              if (var7 <= var8) {
                gf.a();
                return;
              } else {
                gf.d(param2 - -var8, 0, param2 + (var8 + 1), 480 + param4);
                var9 = param5 * (-var8 + param1) >> 518924039;
                param3.c(param2, param4, var9);
                var8++;
                continue L2;
              }
            }
          }
        } else {
          L3: {
            gf.d(param2, 0, -128 + (param2 - -param1), param4 - -480);
            param3.c(param2, param4, param5);
            if (128 <= param1) {
              stackOut_3_0 = -128 + param1;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          var6 = stackIn_4_0;
          var7 = param1;
          if (param0 != -27030) {
            field_b = null;
            var8 = var6;
            L4: while (true) {
              if (var7 <= var8) {
                gf.a();
                gf.a();
                return;
              } else {
                gf.d(param2 - -var8, 0, param2 + (var8 + 1), 480 + param4);
                var9 = param5 * (-var8 + param1) >> 518924039;
                param3.c(param2, param4, var9);
                var8++;
                continue L4;
              }
            }
          } else {
            var8 = var6;
            L5: while (true) {
              if (var7 <= var8) {
                gf.a();
                gf.a();
                return;
              } else {
                gf.d(param2 - -var8, 0, param2 + (var8 + 1), 480 + param4);
                var9 = param5 * (-var8 + param1) >> 518924039;
                param3.c(param2, param4, var9);
                var8++;
                continue L5;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -23092) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "ERROR!";
    }
}
