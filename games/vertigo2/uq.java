/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    static fe field_a;
    static String field_b;
    static int field_d;
    int field_e;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -6872) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(uh param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var8_int = 0;
        nk[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        nk var13 = null;
        int var14 = 0;
        int var15 = 0;
        nk[] var16 = null;
        int[] var17 = null;
        nk[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        nk[][] stackIn_33_0 = null;
        nk[][] stackIn_34_0 = null;
        nk[][] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        nk[][] stackOut_32_0 = null;
        nk[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        nk[][] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          if (param4 < param1) {
            L1: {
              stackOut_32_0 = mg.field_S;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if (param4 == -1) {
                stackOut_34_0 = (nk[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L1;
              } else {
                stackOut_33_0 = (nk[][]) (Object) stackIn_33_0;
                stackOut_33_1 = 4 + param4;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L1;
              }
            }
            L2: {
              var16 = stackIn_35_0[stackIn_35_1];
              var18 = var16;
              var8 = var18;
              var9 = 1;
              if (param7) {
                if (0 == (param4 ^ -1)) {
                  var10 = 0;
                  L3: while (true) {
                    if (var10 >= rc.field_a.length) {
                      break L2;
                    } else {
                      if ((qc.field_w[var10 / 8] & 1 << (var10 & 7)) != 0) {
                        var9 = 0;
                        break L2;
                      } else {
                        var10++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var16.length - 1 <= var10) {
                        break L5;
                      } else {
                        if (0 == (dj.field_a[(var10 + param3) / 8] & 1 << (var10 + param3 & 7))) {
                          var10++;
                          continue L4;
                        } else {
                          var9 = 0;
                          break L5;
                        }
                      }
                    }
                    param3 = param3 + (255 & kr.field_c[param4]);
                    break L2;
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
                if (-1 != param4) {
                  var18 = var8;
                  stackOut_53_0 = -1 + var18.length;
                  stackIn_54_0 = stackOut_53_0;
                  break L7;
                } else {
                  stackOut_52_0 = rc.field_a.length;
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
                    if (var11 >= -1 + var18.length) {
                      break L0;
                    } else {
                      L9: {
                        if (0 != (param4 ^ -1)) {
                          e.field_c[param4] = (byte)var11;
                          break L9;
                        } else {
                          param6 = var11;
                          break L9;
                        }
                      }
                      uq.a(param0, param1, 20473, param3, param4 - -1, param5, param6, param7);
                      if (gd.field_r) {
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
                  if (-1 != param4) {
                    e.field_c[param4] = (byte)var11;
                    break L10;
                  } else {
                    param6 = var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if ((param4 ^ -1) != 0) {
                      break L12;
                    } else {
                      if (rc.field_a.length != -2) {
                        break L12;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (param7) {
                    L13: {
                      if (!var13.field_V) {
                        if (var9 != 0) {
                          if (var13.field_lb) {
                            stackOut_76_0 = 1;
                            stackIn_78_0 = stackOut_76_0;
                            break L13;
                          } else {
                            stackOut_75_0 = 0;
                            stackIn_78_0 = stackOut_75_0;
                            break L13;
                          }
                        } else {
                          stackOut_73_0 = 0;
                          stackIn_78_0 = stackOut_73_0;
                          break L13;
                        }
                      } else {
                        stackOut_71_0 = 1;
                        stackIn_78_0 = stackOut_71_0;
                        break L13;
                      }
                    }
                    var12 = stackIn_78_0;
                    break L11;
                  } else {
                    if (0 == param4) {
                      L14: {
                        if (rc.field_a[var11] != gd.field_j.field_uc) {
                          stackOut_68_0 = 0;
                          stackIn_69_0 = stackOut_68_0;
                          break L14;
                        } else {
                          stackOut_67_0 = 1;
                          stackIn_69_0 = stackOut_67_0;
                          break L14;
                        }
                      }
                      var12 = stackIn_69_0;
                      break L11;
                    } else {
                      if (var11 != (255 & gd.field_j.field_fc[param4])) {
                        var12 = 0;
                        break L11;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                }
                L15: {
                  if (var12 != 0) {
                    uq.a(param0, param1, param2 ^ 0, param3, 1 + param4, param5, param6, param7);
                    var10 = 1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (!gd.field_r) {
                  var11++;
                  continue L6;
                } else {
                  return;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L16: while (true) {
              if (gr.field_W.length <= var9) {
                if (var8_int == 0) {
                  break L0;
                } else {
                  gd.field_r = true;
                  break L0;
                }
              } else {
                var21 = gr.field_W[var9];
                var20 = var21;
                var19 = var20;
                var17 = var19;
                var10_ref_int__ = var17;
                var11 = 0;
                var12 = 0;
                L17: while (true) {
                  if (var12 >= var21.length) {
                    L18: {
                      if (var11 != 0) {
                        break L18;
                      } else {
                        if (ol.field_A == param4) {
                          break L18;
                        } else {
                          var9++;
                          continue L16;
                        }
                      }
                    }
                    var8_int = 0;
                    var12 = 0;
                    L19: while (true) {
                      if (var21.length > var12) {
                        var13_int = var21[var12];
                        if (0 != (var13_int ^ -1)) {
                          if (var13_int < param4) {
                            mn.field_t[var13_int] = true;
                            var12 += 2;
                            continue L19;
                          } else {
                            var12 += 2;
                            continue L19;
                          }
                        } else {
                          ng.field_a = true;
                          var12 += 2;
                          continue L19;
                        }
                      } else {
                        var9++;
                        continue L16;
                      }
                    }
                  } else {
                    L20: {
                      var13_int = var21[var12];
                      var14 = var10_ref_int__[var12 + 1];
                      if ((var13_int ^ -1) == 0) {
                        if (rc.field_a[param6] != var14) {
                          break L20;
                        } else {
                          var12 += 2;
                          continue L17;
                        }
                      } else {
                        L21: {
                          if (var13_int != param4) {
                            break L21;
                          } else {
                            if (param5 == var14) {
                              var11 = 1;
                              var12 += 2;
                              continue L17;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var13_int < param4) {
                          if ((e.field_c[var13_int] & 255) != var14) {
                            break L20;
                          } else {
                            var12 += 2;
                            continue L17;
                          }
                        } else {
                          var9++;
                          continue L16;
                        }
                      }
                    }
                    var9++;
                    continue L16;
                  }
                }
              }
            }
          }
        }
        L22: {
          if (param2 == 20473) {
            break L22;
          } else {
            field_a = null;
            break L22;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 24;
        field_b = "<col=ee9d32>Items - Blocks 1/2</col>";
        field_c = "You need a rating of <%1> to play with the current options.";
    }
}
