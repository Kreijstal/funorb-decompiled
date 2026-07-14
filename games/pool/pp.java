/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp {
    static vh field_c;
    static int field_b;
    static double field_d;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        int var1 = -30 / ((29 - param0) / 47);
    }

    final static void a(eg param0, short param1, boolean param2, int[] param3, int[] param4) {
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
        int var21 = 0;
        var21 = Pool.field_O;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            if (param0.field_K <= var5) {
              break L1;
            } else {
              L2: {
                if (param1 == param0.field_n[var5]) {
                  L3: {
                    L4: {
                      if (null != param0.field_Q) {
                        break L4;
                      } else {
                        L5: {
                          if (null != param0.field_f) {
                            break L5;
                          } else {
                            param0.field_Q = new byte[param0.field_K];
                            param0.field_Q[var5] = (byte)2;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param0.field_f[var5] = (byte)-1;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param0.field_Q[var5] = (byte)2;
                    break L3;
                  }
                  L6: {
                    L7: {
                      var9 = param0.field_g[param0.field_N[var5]];
                      var10 = param0.field_Y[param0.field_N[var5]];
                      var11 = param0.field_q[param0.field_N[var5]];
                      var12 = param0.field_g[param0.field_v[var5]];
                      var13 = param0.field_Y[param0.field_v[var5]];
                      var14 = param0.field_q[param0.field_v[var5]];
                      var15 = param0.field_g[param0.field_X[var5]];
                      var16 = param0.field_Y[param0.field_X[var5]];
                      var17 = param0.field_q[param0.field_X[var5]];
                      var6 = var9 - var12;
                      var8 = -var14 + var11;
                      var7 = -var13 + var10;
                      var18 = var6 * var6 + (var7 * var7 - -(var8 * var8));
                      var6 = var9 - var15;
                      var8 = var11 - var17;
                      var7 = -var16 + var10;
                      var19 = var6 * var6 + (var7 * var7 - -(var8 * var8));
                      var6 = var12 + -var15;
                      var8 = var14 + -var17;
                      var7 = var13 - var16;
                      var20 = var7 * var7 + var6 * var6 + var8 * var8;
                      if (var19 >= var18) {
                        break L7;
                      } else {
                        if (var20 < var18) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var19 <= var20) {
                        break L8;
                      } else {
                        L9: {
                          var6 = var15 + var9 >> 1972551041;
                          if (param4 != null) {
                            param4[2] = -var11 + var17;
                            param4[1] = var16 + -var10;
                            param4[0] = var15 + -var9;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var7 = var16 + var10 >> 1885202209;
                        var8 = var17 + var11 >> 101264257;
                        if (0 == 0) {
                          break L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7 = var13 + var16 >> -278154495;
                    var8 = var14 - -var17 >> 393303105;
                    var6 = var12 + var15 >> 1238386049;
                    if (param4 == null) {
                      break L1;
                    } else {
                      param4[2] = -var14 + var17;
                      param4[0] = -var12 + var15;
                      param4[1] = -var13 + var16;
                      if (0 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L10: {
                    var8 = var11 - -var14 >> 67658753;
                    if (param4 == null) {
                      break L10;
                    } else {
                      param4[0] = -var9 + var12;
                      param4[1] = -var10 + var13;
                      param4[2] = var14 - var11;
                      break L10;
                    }
                  }
                  var7 = var13 + var10 >> -814455775;
                  var6 = var9 - -var12 >> 1259627265;
                  if (0 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var5++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L11: {
            if (param2) {
              break L11;
            } else {
              boolean discarded$2 = pp.a(false);
              break L11;
            }
          }
          L12: {
            L13: {
              if (var6 != 0) {
                break L13;
              } else {
                if (var7 != 0) {
                  break L13;
                } else {
                  if (var8 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
            }
            param3[0] = param3[0] + var6;
            param3[1] = param3[1] + var7;
            param3[2] = param3[2] + var8;
            eg discarded$3 = cq.a(var6, 85, var8, param0, var7);
            break L12;
          }
          return;
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (!param0) {
          return true;
        } else {
          L0: {
            L1: {
              if (fe.a(oa.field_g, -13671, 26)) {
                break L1;
              } else {
                if (!ko.a(0, (byte) -127)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    final static void a(String param0, int param1) {
        int var2 = wn.field_i;
        int var3 = gg.field_f;
        if (param1 != 1259627265) {
            return;
        }
        int var4 = uo.field_Lb.field_I.b(param0, 500);
        int var5 = 6 + uo.field_Lb.field_I.a(param0, 500);
        int var6 = 2 + var4 * ad.field_x;
        int var7 = de.a(var5, 12, var2, 0);
        int var8 = sh.a(var6, var3, -1, 20);
        qh.b(var7, var8, var5, var6, 0);
        qh.f(1 + var7, 1 + var8, var5 + -2, -2 + var6, 16777088);
        int discarded$0 = uo.field_Lb.field_I.a(param0, 3 + var7, wh.field_b + (var8 - -1 + -uo.field_Lb.field_I.field_C), 500, 1000, 0, -1, 0, 0, ad.field_x);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = Math.atan2(1.0, 0.0);
    }
}
