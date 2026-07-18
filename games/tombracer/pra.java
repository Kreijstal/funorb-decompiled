/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pra {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 > -113) {
            pra.a(103, 84, 45, -30, 12, 72, 89, 38);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var12 = rp.a(hc.field_h, -16226, gca.field_d, param6);
            var13 = rp.a(hc.field_h, -16226, gca.field_d, param5);
            var14 = rp.a(ss.field_c, -16226, pka.field_b, param0);
            var15 = rp.a(ss.field_c, -16226, pka.field_b, param4);
            var8_int = rp.a(hc.field_h, -16226, gca.field_d, param6 - -param2);
            var9 = rp.a(hc.field_h, -16226, gca.field_d, param5 + -param2);
            var16 = var12;
            L1: while (true) {
              if (var8_int <= var16) {
                var16 = var13;
                L2: while (true) {
                  if (var9 >= var16) {
                    var10 = rp.a(ss.field_c, -16226, pka.field_b, param2 + param0);
                    var11 = rp.a(ss.field_c, -16226, pka.field_b, -param2 + param4);
                    var16 = var8_int;
                    L3: while (true) {
                      if (var16 > var9) {
                        L4: {
                          if (param3 >= 88) {
                            break L4;
                          } else {
                            pra.b(-52);
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        var22 = vaa.field_a[var16];
                        nra.a((byte) -55, param1, var10, var22, var14);
                        nra.a((byte) -55, param7, var11, var22, var10);
                        nra.a((byte) -55, param1, var15, var22, var11);
                        var16++;
                        continue L3;
                      }
                    }
                  } else {
                    nra.a((byte) -55, param1, var15, vaa.field_a[var16], var14);
                    var16--;
                    continue L2;
                  }
                }
              } else {
                nra.a((byte) -55, param1, var15, vaa.field_a[var16], var14);
                var16++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var8, "pra.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void b(int param0) {
        if (!(gn.field_C.field_e == mha.field_E)) {
            tj.field_b = tj.field_b + (-mha.field_E + gn.field_C.field_e);
            mha.field_E = gn.field_C.field_e;
        }
        if (pk.field_r > 0) {
            pk.field_r = pk.field_r - 1;
        }
        if (~pk.field_r < param0) {
            rg.a((byte) 44);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[1];
    }
}
