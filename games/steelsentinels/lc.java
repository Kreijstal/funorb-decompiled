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
        int var10_int = 0;
        RuntimeException var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var17 = SteelSentinels.field_G;
        try {
          L0: {
            var10_int = -128 / ((24 - param3) / 54);
            L1: while (true) {
              param7--;
              if (-1 < (param7 ^ -1)) {
                break L0;
              } else {
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
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var10);
            stackOut_5_1 = new StringBuilder().append("lc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = (String) null;
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
        RuntimeException var8 = null;
        int var8_int = 0;
        qh[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        qh var13 = null;
        int var14 = 0;
        int var15 = 0;
        hk var16 = null;
        qh[] var17 = null;
        int[] var18 = null;
        qh[] var19 = null;
        int[] var20 = null;
        qh[][] stackIn_36_0 = null;
        qh[][] stackIn_37_0 = null;
        qh[][] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qh[][] stackOut_35_0 = null;
        qh[][] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        qh[][] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4 < param3) {
                L2: {
                  stackOut_35_0 = un.field_h;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if ((param4 ^ -1) != 0) {
                    stackOut_37_0 = (qh[][]) ((Object) stackIn_37_0);
                    stackOut_37_1 = 4 + param4;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L2;
                  } else {
                    stackOut_36_0 = (qh[][]) ((Object) stackIn_36_0);
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L2;
                  }
                }
                L3: {
                  var17 = stackIn_38_0[stackIn_38_1];
                  var19 = var17;
                  var8_array = var19;
                  var9 = 1;
                  if (param7) {
                    if (param4 != -1) {
                      var10 = 0;
                      L4: while (true) {
                        L5: {
                          if (var17.length - 1 <= var10) {
                            break L5;
                          } else {
                            if (0 == (ti.field_s[(var10 + param6) / 8] & 1 << (var10 + param6 & 7))) {
                              var10++;
                              continue L4;
                            } else {
                              var9 = 0;
                              break L5;
                            }
                          }
                        }
                        param6 = param6 + (wb.field_j[param4] & 255);
                        break L3;
                      }
                    } else {
                      var10 = 0;
                      L6: while (true) {
                        if (var10 >= jg.field_l.length) {
                          break L3;
                        } else {
                          if ((rb.field_i[var10 / 8] & 1 << (7 & var10)) == 0) {
                            var10++;
                            continue L6;
                          } else {
                            var9 = 0;
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    if (0 == (param4 ^ -1)) {
                      stackOut_55_0 = jg.field_l.length;
                      stackIn_56_0 = stackOut_55_0;
                      break L8;
                    } else {
                      stackOut_54_0 = var19.length + -1;
                      stackIn_56_0 = stackOut_54_0;
                      break L8;
                    }
                  }
                  if (stackIn_56_0 <= var11) {
                    if (var10 != 0) {
                      break L1;
                    } else {
                      var11 = 0;
                      L9: while (true) {
                        if (var11 >= -1 + var19.length) {
                          break L1;
                        } else {
                          L10: {
                            if (0 != (param4 ^ -1)) {
                              dl.field_O[param4] = (byte)var11;
                              break L10;
                            } else {
                              param1 = var11;
                              break L10;
                            }
                          }
                          lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
                          if (!ng.field_k) {
                            var11++;
                            continue L9;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (param4 == -1) {
                        param1 = var11;
                        break L11;
                      } else {
                        dl.field_O[param4] = (byte)var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (-1 != param4) {
                          break L13;
                        } else {
                          if (jg.field_l.length != 1) {
                            break L13;
                          } else {
                            var12 = 1;
                            break L12;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (!param7) {
                        L14: {
                          if ((param4 ^ -1) != 0) {
                            if ((255 & nf.field_b.field_Sb[param4]) != var11) {
                              stackOut_79_0 = 0;
                              stackIn_80_0 = stackOut_79_0;
                              break L14;
                            } else {
                              stackOut_78_0 = 1;
                              stackIn_80_0 = stackOut_78_0;
                              break L14;
                            }
                          } else {
                            if (jg.field_l[var11] != nf.field_b.field_Ub) {
                              stackOut_76_0 = 0;
                              stackIn_80_0 = stackOut_76_0;
                              break L14;
                            } else {
                              stackOut_75_0 = 1;
                              stackIn_80_0 = stackOut_75_0;
                              break L14;
                            }
                          }
                        }
                        var12 = stackIn_80_0;
                        break L12;
                      } else {
                        L15: {
                          if (!var13.field_G) {
                            if (var9 != 0) {
                              if (var13.field_T) {
                                stackOut_70_0 = 1;
                                stackIn_72_0 = stackOut_70_0;
                                break L15;
                              } else {
                                stackOut_69_0 = 0;
                                stackIn_72_0 = stackOut_69_0;
                                break L15;
                              }
                            } else {
                              stackOut_67_0 = 0;
                              stackIn_72_0 = stackOut_67_0;
                              break L15;
                            }
                          } else {
                            stackOut_65_0 = 1;
                            stackIn_72_0 = stackOut_65_0;
                            break L15;
                          }
                        }
                        var12 = stackIn_72_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 != 0) {
                        var10 = 1;
                        lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (ng.field_k) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (m.field_b.length <= var9) {
                    if (var8_int != 0) {
                      ng.field_k = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var20 = m.field_b[var9];
                    var18 = var20;
                    var10_ref_int__ = var18;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      if (var20.length <= var12) {
                        L19: {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (param4 == be.field_a) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            if (var20.length <= var12) {
                              var8_int = 0;
                              break L19;
                            } else {
                              L22: {
                                var13_int = var20[var12];
                                if ((var13_int ^ -1) != 0) {
                                  if (var13_int >= param4) {
                                    break L22;
                                  } else {
                                    m.field_h[var13_int] = true;
                                    break L22;
                                  }
                                } else {
                                  gi.field_u = true;
                                  break L22;
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        }
                        var9++;
                        continue L17;
                      } else {
                        L23: {
                          var13_int = var20[var12];
                          var14 = var10_ref_int__[var12 + 1];
                          if (var13_int == -1) {
                            if (var14 == jg.field_l[param1]) {
                              break L23;
                            } else {
                              var9++;
                              continue L17;
                            }
                          } else {
                            L24: {
                              if (var13_int != param4) {
                                break L24;
                              } else {
                                if (var14 == param0) {
                                  var11 = 1;
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            if (var13_int < param4) {
                              if ((255 & dl.field_O[var13_int]) == var14) {
                                break L23;
                              } else {
                                var9++;
                                continue L17;
                              }
                            } else {
                              var9++;
                              continue L17;
                            }
                          }
                        }
                        var12 += 2;
                        continue L18;
                      }
                    }
                  }
                }
              }
            }
            L25: {
              if (param5 < -83) {
                break L25;
              } else {
                var16 = (hk) null;
                lc.a(112, 77, (hk) null, 38, -87, 68, 43, false);
                break L25;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var8);
            stackOut_100_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param2 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L26;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L26;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_f = false;
        field_d = "Create";
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
        field_g = 2;
    }
}
