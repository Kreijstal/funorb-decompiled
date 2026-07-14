/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static int field_h;
    static boolean field_f;
    static gk[] field_a;
    static wk field_b;
    static String field_d;
    static String field_i;
    static tc field_c;
    static boolean field_e;
    static int field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = SteelSentinels.field_G;
        int var10 = -128 / ((24 - param3) / 54);
        while (true) {
            param7--;
            if (-1 < (param7 ^ -1)) {
                break;
            }
            var11 = param6;
            var12 = param5;
            var13 = param1;
            var14 = param8;
            var15 = param2;
            var16 = var11[var12] >> -2064185599 & 8355711;
            var11[var12] = ec.a(255, var15 >> 757784145) + ec.a(16711680, var13 >> 2018606369) - (-(ec.a(33423850, var14) >> -2137183191) - var16);
            param8 = param8 + param0;
            param5++;
            param2 = param2 + param4;
            param1 = param1 + param9;
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
        ma.a(true, (byte) -99, kf.field_o, bl.field_f);
        nm.field_p = true;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
            lc.a(3);
        }
        field_b = null;
        field_d = null;
        field_i = null;
    }

    final static void a(int param0, int param1, hk param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var8_int = 0;
        qh[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        qh var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        qh[] var17 = null;
        int[] var18 = null;
        qh[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qh[][] stackIn_34_0 = null;
        qh[][] stackIn_35_0 = null;
        qh[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_77_0 = 0;
        qh[][] stackOut_33_0 = null;
        qh[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        qh[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          if (param4 < param3) {
            L1: {
              stackOut_33_0 = un.field_h;
              stackIn_35_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if ((param4 ^ -1) != 0) {
                stackOut_35_0 = (qh[][]) (Object) stackIn_35_0;
                stackOut_35_1 = 4 + param4;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L1;
              } else {
                stackOut_34_0 = (qh[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                break L1;
              }
            }
            L2: {
              var17 = stackIn_36_0[stackIn_36_1];
              var19 = var17;
              var8 = var19;
              var9 = 1;
              if (param7) {
                if (param4 != -1) {
                  var17 = var19;
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (var17.length - 1 <= var10) {
                        break L4;
                      } else {
                        if (0 == (ti.field_s[(var10 + param6) / 8] & 1 << (var10 + param6 & 7))) {
                          var10++;
                          continue L3;
                        } else {
                          var9 = 0;
                          break L4;
                        }
                      }
                    }
                    param6 = param6 + (wb.field_j[param4] & 255);
                    break L2;
                  }
                } else {
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= jg.field_l.length) {
                      break L2;
                    } else {
                      if ((rb.field_i[var10 / 8] & 1 << (7 & var10)) == 0) {
                        var10++;
                        continue L5;
                      } else {
                        var9 = 0;
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            var10 = 0;
            var11 = 0;
            L6: while (true) {
              L7: {
                if (0 == (param4 ^ -1)) {
                  stackOut_53_0 = jg.field_l.length;
                  stackIn_54_0 = stackOut_53_0;
                  break L7;
                } else {
                  stackOut_52_0 = var19.length + -1;
                  stackIn_54_0 = stackOut_52_0;
                  break L7;
                }
              }
              if (stackIn_54_0 <= var11) {
                if (var10 != 0) {
                  break L0;
                } else {
                  var11 = 0;
                  L8: while (true) {
                    if (var11 >= -1 + var19.length) {
                      break L0;
                    } else {
                      L9: {
                        if (0 != (param4 ^ -1)) {
                          dl.field_O[param4] = (byte)var11;
                          break L9;
                        } else {
                          param1 = var11;
                          break L9;
                        }
                      }
                      lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
                      if (ng.field_k) {
                        return;
                      } else {
                        var11++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  if (param4 == -1) {
                    param1 = var11;
                    break L10;
                  } else {
                    dl.field_O[param4] = (byte)var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (-1 != param4) {
                      break L12;
                    } else {
                      if (jg.field_l.length != 1) {
                        break L12;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (!param7) {
                    L13: {
                      if ((param4 ^ -1) != 0) {
                        if ((255 & nf.field_b.field_Sb[param4]) != var11) {
                          stackOut_76_0 = 0;
                          stackIn_77_0 = stackOut_76_0;
                          break L13;
                        } else {
                          stackOut_75_0 = 1;
                          stackIn_77_0 = stackOut_75_0;
                          break L13;
                        }
                      } else {
                        if (jg.field_l[var11] != nf.field_b.field_Ub) {
                          stackOut_73_0 = 0;
                          stackIn_77_0 = stackOut_73_0;
                          break L13;
                        } else {
                          stackOut_72_0 = 1;
                          stackIn_77_0 = stackOut_72_0;
                          break L13;
                        }
                      }
                    }
                    var12 = stackIn_77_0;
                    break L11;
                  } else {
                    if (!var13.field_G) {
                      if (var9 != 0) {
                        if (var13.field_T) {
                          var12 = 1;
                          break L11;
                        } else {
                          var12 = 0;
                          break L11;
                        }
                      } else {
                        var12 = 0;
                        break L11;
                      }
                    } else {
                      var12 = 1;
                      break L11;
                    }
                  }
                }
                L14: {
                  if (var12 != 0) {
                    var10 = 1;
                    lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (ng.field_k) {
                  return;
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L15: while (true) {
              if (m.field_b.length <= var9) {
                if (var8_int != 0) {
                  ng.field_k = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var22 = m.field_b[var9];
                var21 = var22;
                var20 = var21;
                var18 = var20;
                var10_ref_int__ = var18;
                var11 = 0;
                var12 = 0;
                L16: while (true) {
                  if (var22.length <= var12) {
                    L17: {
                      if (var11 != 0) {
                        break L17;
                      } else {
                        if (param4 == be.field_a) {
                          break L17;
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var12 = 0;
                    L18: while (true) {
                      if (var22.length <= var12) {
                        var8_int = 0;
                        var9++;
                        continue L15;
                      } else {
                        var13_int = var22[var12];
                        if ((var13_int ^ -1) != 0) {
                          if (var13_int < param4) {
                            m.field_h[var13_int] = true;
                            var12 += 2;
                            continue L18;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        } else {
                          gi.field_u = true;
                          var12 += 2;
                          continue L18;
                        }
                      }
                    }
                  } else {
                    L19: {
                      var13_int = var22[var12];
                      var14 = var10_ref_int__[var12 + 1];
                      if (var13_int == -1) {
                        if (var14 == jg.field_l[param1]) {
                          break L19;
                        } else {
                          var9++;
                          continue L15;
                        }
                      } else {
                        L20: {
                          if (var13_int != param4) {
                            break L20;
                          } else {
                            if (var14 == param0) {
                              var11 = 1;
                              var12 += 2;
                              continue L16;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (var13_int < param4) {
                          if ((255 & dl.field_O[var13_int]) == var14) {
                            break L19;
                          } else {
                            break L19;
                          }
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var12 += 2;
                    continue L16;
                  }
                }
              }
            }
          }
        }
        L21: {
          if (param5 < -83) {
            break L21;
          } else {
            var16 = null;
            lc.a(112, 77, (hk) null, 38, -87, 68, 43, false);
            break L21;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_d = "Create";
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
        field_g = 2;
    }
}
