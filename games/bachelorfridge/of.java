/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends td {
    final static kv a(kv param0, int[] param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int[] var8 = null;
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
        int var21 = 0;
        kv var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        var20 = BachelorFridge.field_y;
        var22 = new kv(param0.field_q + (param5 + param5), param5 + param0.field_p + param5);
        var22.field_t = -param5 + param0.field_t;
        var22.field_o = param5 + param0.field_o - -param5;
        var22.field_u = param0.field_u + -param5;
        var7 = 107 / ((param4 - 43) / 36);
        var22.field_n = param5 + (param0.field_n + param5);
        var30 = var22.field_v;
        var28 = var30;
        var26 = var28;
        var24 = var26;
        var8 = var24;
        var29 = param0.field_v;
        var10 = param5 * param5;
        var11 = (param5 << -1694650271) + var10 + 1 << -47069983;
        var12 = -param5;
        L0: while (true) {
          if (var12 > param5) {
            var30 = var28;
            var21 = 0;
            var12 = var21;
            L1: while (true) {
              if (var30.length <= var21) {
                return var22;
              } else {
                var13 = var30[var21];
                if (-2147483648 != (var13 ^ -1)) {
                  if (0 != var13) {
                    var8[var21] = param1[var13];
                    var21++;
                    continue L1;
                  } else {
                    var21++;
                    continue L1;
                  }
                } else {
                  var30[var21] = 0;
                  var21++;
                  continue L1;
                }
              }
            }
          } else {
            var11 = var11 + (-1 + var12 * 2);
            var13 = var11;
            var14 = -param5;
            L2: while (true) {
              if (var14 > param5) {
                var12++;
                continue L0;
              } else {
                var13 = var13 + (-1 + var14 * 2);
                if (var10 >= var13) {
                  L3: {
                    var15 = (-var13 + var10) * param3 / var10;
                    if (!param2) {
                      break L3;
                    } else {
                      if (var14 != -1) {
                        break L3;
                      } else {
                        if (-1 == var12) {
                          var15 = 2147483647;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var16 = 0;
                  var17 = var14 - (-param5 - (param5 + var12) * var22.field_q);
                  var18 = 0;
                  L4: while (true) {
                    if (var18 < param0.field_p) {
                      var19 = 0;
                      L5: while (true) {
                        if (var19 >= param0.field_q) {
                          var17 = var17 + (param5 << -633914751);
                          var18++;
                          continue L4;
                        } else {
                          if (var29[var16] != 0) {
                            if (var30[var17] < var15) {
                              var30[var17] = var15;
                              var16++;
                              var17++;
                              var19++;
                              continue L5;
                            } else {
                              var16++;
                              var17++;
                              var19++;
                              continue L5;
                            }
                          } else {
                            var16++;
                            var17++;
                            var19++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      var14++;
                      continue L2;
                    }
                  }
                } else {
                  var14++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final ii a(op param0, int param1) {
        sm var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        op stackIn_4_0 = null;
        op stackOut_2_0 = null;
        op stackOut_3_0 = null;
        var8 = BachelorFridge.field_y;
        var9 = ((of) this).field_h.a(19, param0);
        var4 = new sm(((of) this).field_g, new nq(var9));
        var5 = 0;
        if (param1 == 3) {
          stackOut_2_0 = (op) param0;
          stackIn_4_0 = stackOut_2_0;
          L0: while (true) {
            if (((op) (Object) stackIn_4_0).field_z <= var5) {
              return (ii) (Object) var4;
            } else {
              var6 = 0;
              L1: while (true) {
                if (var6 >= param0.field_B) {
                  var5++;
                  stackOut_3_0 = (op) param0;
                  stackIn_4_0 = stackOut_3_0;
                  continue L0;
                } else {
                  if (param0.field_a[var5][var6].field_l != null) {
                    var7 = param0.field_a[var5][var6].field_l;
                    var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 5), true);
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        bp.d(18);
        if (param0 < 79) {
            Object var2 = null;
            kv discarded$0 = of.a((kv) null, (int[]) null, false, -80, -115, 44);
        }
    }

    of(int param0, aga param1) {
        super(param0, param1);
    }

    static {
    }
}
