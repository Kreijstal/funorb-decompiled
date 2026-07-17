/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    final static void a(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        ll.a(param0, 256, 0);
    }

    private final static void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var5 = (param2 & 16711935) * 0 >>> 8 & 16711935;
        param2 = var5 | (param2 & 65280) * 0 >>> 8 & 65280;
        var8 = 0;
        var6 = 0;
        var7 = 0;
        var9 = var7 * mi.field_a + var6;
        var10 = mi.field_a * param0 - (mi.field_a + param0 - 1) / param0 * param0;
        var11 = var7;
        L0: while (true) {
          if (var11 >= mi.field_d) {
            return;
          } else {
            var12 = var6;
            L1: while (true) {
              if (var12 >= mi.field_a) {
                var9 = var9 + var10;
                var11 = var11 + param0;
                continue L0;
              } else {
                L2: {
                  var13 = mi.field_f[var9];
                  var14 = (var13 & 16711935) * 256 >>> 8 & 16711935;
                  var13 = (var14 | (var13 & 65280) * 256 >>> 8 & 65280) + param2;
                  var15 = param0;
                  var16 = param0;
                  var17 = var9 - var8;
                  var18 = mi.field_a;
                  if (var15 <= mi.field_a - var12) {
                    break L2;
                  } else {
                    var15 = mi.field_a - var12;
                    break L2;
                  }
                }
                L3: {
                  if (var16 <= mi.field_d - var11) {
                    break L3;
                  } else {
                    var16 = mi.field_d - var11;
                    break L3;
                  }
                }
                var18 = var18 - var15;
                var15 = -var15;
                var16 = -var16;
                var19 = var16;
                L4: while (true) {
                  if (var19 >= 0) {
                    var9 = var9 + param0;
                    var12 = var12 + param0;
                    continue L1;
                  } else {
                    var20 = var15;
                    L5: while (true) {
                      if (var20 >= 0) {
                        var17 = var17 + var18;
                        var19++;
                        continue L4;
                      } else {
                        int incrementValue$1 = var17;
                        var17++;
                        mi.field_f[incrementValue$1] = var13;
                        var20++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }
}
