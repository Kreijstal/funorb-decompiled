/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int field_a;
    static int field_b;

    final static boolean a(dm param0, int param1, int param2, dm param3, int param4, int param5) {
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
        int var22 = 0;
        int var23 = 0;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          param1 = param1 + param0.field_u;
          param4 = param4 + param3.field_u;
          var6 = param4 - param1;
          var7 = param0.field_r;
          if (var6 >= param0.field_r) {
            break L0;
          } else {
            var8 = param3.field_r;
            if (var6 > -param3.field_r) {
              L1: {
                param2 = param2 + param0.field_p;
                param5 = param5 + param3.field_p;
                var9 = param5 - param2;
                var10 = param0.field_m;
                if (var9 >= param0.field_m) {
                  break L1;
                } else {
                  var11 = param3.field_m;
                  if (var9 > -param3.field_m) {
                    L2: {
                      if (var6 > 0) {
                        stackOut_8_0 = var6;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var12 = stackIn_9_0;
                      var13 = var6 + var8;
                      if (var13 <= var7) {
                        break L3;
                      } else {
                        var13 = var7;
                        break L3;
                      }
                    }
                    L4: {
                      if (var9 > 0) {
                        stackOut_13_0 = var9;
                        stackIn_14_0 = stackOut_13_0;
                        break L4;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                    L5: {
                      var14 = stackIn_14_0;
                      var15 = var9 + var11;
                      if (var15 <= var10) {
                        break L5;
                      } else {
                        var15 = var10;
                        break L5;
                      }
                    }
                    var13 = var13 - var12;
                    var15 = var15 - var14;
                    var16 = var14 * var7 + var12;
                    var17 = var7 - var13;
                    var18 = (var14 - var9) * var8 + (var12 - var6);
                    var19 = var8 - var13;
                    var30 = param0.field_v;
                    var31 = param3.field_v;
                    var22 = var15;
                    L6: while (true) {
                      if (var22 > 0) {
                        var23 = var13;
                        L7: while (true) {
                          if (var23 <= 0) {
                            var16 = var16 + var17;
                            var18 = var18 + var19;
                            var22--;
                            continue L6;
                          } else {
                            if (var30[var16] != 0) {
                              if (var31[var18] != 0) {
                                field_a = param1 + var12 + var13 - var23;
                                field_b = param2 + var14 + var15 - var22;
                                return true;
                              } else {
                                var16++;
                                var18++;
                                var23--;
                                continue L7;
                              }
                            } else {
                              var16++;
                              var18++;
                              var23--;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return false;
            } else {
              break L0;
            }
          }
        }
        return false;
    }
}
