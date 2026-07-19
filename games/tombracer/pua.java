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
              L2: {
                if (var7_int <= var15) {
                  var15 = var12;
                  break L2;
                } else {
                  nra.a((byte) -55, param5, var14, vaa.field_a[var15], var13);
                  var15++;
                  if (var17 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (var8 >= var15) {
                    stackOut_11_0 = ss.field_c;
                    stackOut_11_1 = -16226;
                    stackOut_11_2 = pka.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L4;
                  } else {
                    stackOut_8_0 = -55;
                    stackOut_8_1 = param5;
                    stackOut_8_2 = var14;
                    stackIn_12_0 = stackOut_8_0;
                    stackIn_12_1 = stackOut_8_1;
                    stackIn_12_2 = stackOut_8_2;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    if (var17 != 0) {
                      break L4;
                    } else {
                      nra.a((byte) stackIn_9_0, stackIn_9_1, stackIn_9_2, vaa.field_a[var15], var13);
                      var15--;
                      continue L3;
                    }
                  }
                }
                L5: {
                  var9 = rp.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, param4 + param1);
                  var10 = rp.a(ss.field_c, -16226, pka.field_b, -param4 + param6);
                  if (param0 < -11) {
                    break L5;
                  } else {
                    pua.a((byte) -34);
                    break L5;
                  }
                }
                var15 = var7_int;
                L6: while (true) {
                  if (var15 > var8) {
                    break L0;
                  } else {
                    var21 = vaa.field_a[var15];
                    nra.a((byte) -55, param5, var9, var21, var13);
                    nra.a((byte) -55, param5, var14, var21, var10);
                    var15++;
                    if (var17 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "pua.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_d = new String[2];
        field_d[0] = "Boulder 2x2";
        field_d[1] = "Sawblade";
    }
}
