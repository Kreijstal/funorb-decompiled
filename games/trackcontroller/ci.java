/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    final static void a(int param0, int param1, int param2, boolean param3, boolean param4) {
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
        L0: {
          var5 = (param2 & 16711935) * (256 - param1) >>> 8 & 16711935;
          param2 = var5 | (param2 & 65280) * (256 - param1) >>> 8 & 65280;
          var8 = 0;
          if (!param3) {
            var6 = 0;
            break L0;
          } else {
            var6 = (ll.field_d - 1) % param0;
            var8 = var8 + (param0 - 1);
            break L0;
          }
        }
        var7 = 0;
        var9 = var7 * ll.field_d + var6;
        var10 = ll.field_d * param0 - (ll.field_d + param0 - 1) / param0 * param0;
        var11 = var7;
        L1: while (true) {
          if (var11 >= ll.field_k) {
            return;
          } else {
            var12 = var6;
            L2: while (true) {
              if (var12 >= ll.field_d) {
                var9 = var9 + var10;
                var11 = var11 + param0;
                continue L1;
              } else {
                L3: {
                  var13 = ll.field_i[var9];
                  var14 = (var13 & 16711935) * param1 >>> 8 & 16711935;
                  var13 = (var14 | (var13 & 65280) * param1 >>> 8 & 65280) + param2;
                  var15 = param0;
                  var16 = param0;
                  var17 = var9 - var8;
                  var18 = ll.field_d;
                  if (!param3) {
                    if (var15 <= ll.field_d - var12) {
                      break L3;
                    } else {
                      var15 = ll.field_d - var12;
                      break L3;
                    }
                  } else {
                    if (var15 <= var12 + 1) {
                      break L3;
                    } else {
                      var17 = var17 + (var15 - var12 - 1);
                      var15 = var12 + 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var16 <= ll.field_k - var11) {
                    break L4;
                  } else {
                    var16 = ll.field_k - var11;
                    break L4;
                  }
                }
                var18 = var18 - var15;
                var15 = -var15;
                var16 = -var16;
                var19 = var16;
                L5: while (true) {
                  if (var19 >= 0) {
                    var9 = var9 + param0;
                    var12 = var12 + param0;
                    continue L2;
                  } else {
                    var20 = var15;
                    L6: while (true) {
                      if (var20 >= 0) {
                        var17 = var17 + var18;
                        var19++;
                        continue L5;
                      } else {
                        int incrementValue$1 = var17;
                        var17++;
                        ll.field_i[incrementValue$1] = var13;
                        var20++;
                        continue L6;
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
