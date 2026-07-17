/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pua extends hq {
    static apa field_c;
    private static String[] field_d;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -45) {
            return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var11 = rp.a(hc.field_h, -16226, gca.field_d, param2);
            var12 = rp.a(hc.field_h, -16226, gca.field_d, param3);
            var13 = rp.a(ss.field_c, -16226, pka.field_b, param1);
            var14 = rp.a(ss.field_c, -16226, pka.field_b, param6);
            var7_int = rp.a(hc.field_h, -16226, gca.field_d, param4 + param2);
            var8 = rp.a(hc.field_h, -16226, gca.field_d, param3 + -param4);
            var15 = var11;
            L1: while (true) {
              if (var7_int <= var15) {
                var15 = var12;
                L2: while (true) {
                  if (var8 >= var15) {
                    L3: {
                      var9 = rp.a(ss.field_c, -16226, pka.field_b, param4 + param1);
                      var10 = rp.a(ss.field_c, -16226, pka.field_b, -param4 + param6);
                      if (param0 < -11) {
                        break L3;
                      } else {
                        pua.a((byte) -34);
                        break L3;
                      }
                    }
                    var15 = var7_int;
                    L4: while (true) {
                      if (var15 > var8) {
                        break L0;
                      } else {
                        var21 = vaa.field_a[var15];
                        nra.a((byte) -55, param5, var9, var21, var13);
                        nra.a((byte) -55, param5, var14, var21, var10);
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    nra.a((byte) -55, param5, var14, vaa.field_a[var15], var13);
                    var15--;
                    continue L2;
                  }
                }
              } else {
                nra.a((byte) -55, param5, var14, vaa.field_a[var15], var13);
                var15++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "pua.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[2];
        field_d[0] = "Boulder 2x2";
        field_d[1] = "Sawblade";
    }
}
