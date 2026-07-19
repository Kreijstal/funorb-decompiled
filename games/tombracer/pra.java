/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pra {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 > -113) {
            pra.a(103, 84, 45, -30, 12, 72, 89, 38);
            field_a = null;
            return;
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
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
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
              L2: {
                if (var8_int <= var16) {
                  var16 = var13;
                  break L2;
                } else {
                  nra.a((byte) -55, param1, var15, vaa.field_a[var16], var14);
                  var16++;
                  if (var18 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (var9 >= var16) {
                    stackOut_11_0 = ss.field_c;
                    stackOut_11_1 = -16226;
                    stackOut_11_2 = pka.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L4;
                  } else {
                    stackOut_8_0 = -55;
                    stackOut_8_1 = param1;
                    stackOut_8_2 = var15;
                    stackIn_12_0 = stackOut_8_0;
                    stackIn_12_1 = stackOut_8_1;
                    stackIn_12_2 = stackOut_8_2;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    if (var18 != 0) {
                      break L4;
                    } else {
                      nra.a((byte) stackIn_9_0, stackIn_9_1, stackIn_9_2, vaa.field_a[var16], var14);
                      var16--;
                      continue L3;
                    }
                  }
                }
                var10 = rp.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, param2 + param0);
                var11 = rp.a(ss.field_c, -16226, pka.field_b, -param2 + param4);
                var16 = var8_int;
                L5: while (true) {
                  L6: {
                    if (var16 > var9) {
                      if (param3 >= 88) {
                        break L6;
                      } else {
                        pra.b(-52);
                        return;
                      }
                    } else {
                      var22 = vaa.field_a[var16];
                      nra.a((byte) -55, param1, var10, var22, var14);
                      nra.a((byte) -55, param7, var11, var22, var10);
                      nra.a((byte) -55, param1, var15, var22, var11);
                      var16++;
                      if (var18 != 0) {
                        break L6;
                      } else {
                        continue L5;
                      }
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "pra.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void b(int param0) {
        L0: {
          if (gn.field_C.field_e != mha.field_E) {
            tj.field_b = tj.field_b + (-mha.field_E + gn.field_C.field_e);
            mha.field_E = gn.field_C.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 <= (pk.field_r ^ -1)) {
          if ((pk.field_r ^ -1) >= param0) {
            return;
          } else {
            rg.a((byte) 44);
            return;
          }
        } else {
          pk.field_r = pk.field_r - 1;
          if ((pk.field_r ^ -1) >= param0) {
            return;
          } else {
            rg.a((byte) 44);
            return;
          }
        }
    }

    static {
        field_a = new int[1];
    }
}
