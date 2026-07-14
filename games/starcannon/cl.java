/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends od {
    static int field_j;
    static pf field_k;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    cl(long param0, String param1) {
        super(param0, param1);
    }

    final s b(byte param0) {
        if (param0 != 1) {
            Object var3 = null;
            hl discarded$0 = cl.a(-8, (hl) null, false, true, (int[]) null, -126);
        }
        return ef.field_e;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        wj.b(param0);
        ki.c(param2, param3, param4, param1);
    }

    final static hl a(int param0, hl param1, boolean param2, boolean param3, int[] param4, int param5) {
        int[] var7 = null;
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
        hl var21 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        var19 = StarCannon.field_A;
        if (!param3) {
          var21 = new hl(param0 + (param0 + param1.field_u), param0 + param1.field_v - -param0);
          var21.field_x = param0 + (param1.field_x - -param0);
          var21.field_q = param0 + (param0 + param1.field_q);
          var21.field_y = -param0 + param1.field_y;
          var21.field_w = param1.field_w - param0;
          var29 = var21.field_B;
          var27 = var29;
          var25 = var27;
          var23 = var25;
          var7 = var23;
          var28 = param1.field_B;
          var9 = param0 * param0;
          var10 = (param0 << -1565736703) + (var9 + 1) << 1071048673;
          var11 = -param0;
          L0: while (true) {
            if (param0 < var11) {
              var29 = var27;
              var20 = 0;
              var11 = var20;
              L1: while (true) {
                if (var20 >= var29.length) {
                  return var21;
                } else {
                  var12 = var29[var20];
                  if (-2147483648 != (var12 ^ -1)) {
                    if (var12 != 0) {
                      var7[var20] = param4[var12];
                      var20++;
                      continue L1;
                    } else {
                      var20++;
                      continue L1;
                    }
                  } else {
                    var29[var20] = 0;
                    var20++;
                    continue L1;
                  }
                }
              }
            } else {
              var10 = var10 + (var11 * 2 - 1);
              var12 = var10;
              var13 = -param0;
              L2: while (true) {
                if (param0 < var13) {
                  var11++;
                  continue L0;
                } else {
                  var12 = var12 + (var13 * 2 + -1);
                  if (var12 <= var9) {
                    L3: {
                      var14 = (var9 + -var12) * param5 / var9;
                      if (!param2) {
                        break L3;
                      } else {
                        if (0 != var13) {
                          break L3;
                        } else {
                          if (-1 == (var11 ^ -1)) {
                            var14 = 2147483647;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var15 = 0;
                    var16 = (var11 - -param0) * var21.field_u + (param0 + var13);
                    var17 = 0;
                    L4: while (true) {
                      if (var17 < param1.field_v) {
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= param1.field_u) {
                            var16 = var16 + (param0 << -1681923039);
                            var17++;
                            continue L4;
                          } else {
                            if (0 != var28[var15]) {
                              if (var14 > var29[var16]) {
                                var29[var16] = var14;
                                var15++;
                                var16++;
                                var18++;
                                continue L5;
                              } else {
                                var15++;
                                var16++;
                                var18++;
                                continue L5;
                              }
                            } else {
                              var15++;
                              var16++;
                              var18++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        var13++;
                        continue L2;
                      }
                    }
                  } else {
                    var13++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void d(byte param0) {
        if (param0 < 81) {
            field_k = null;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pf();
    }
}
