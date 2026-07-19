/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends mk {
    private fn field_k;
    private fn field_l;
    static int field_j;

    final String a(byte param0, String param1) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        String stackOut_28_0 = null;
        String stackOut_33_0 = null;
        String stackOut_31_0 = null;
        String stackOut_24_0 = null;
        String stackOut_21_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 89) {
                break L1;
              } else {
                discarded$2 = ib.a(false, -126, -33, 30, 79, -34, 49, -91, -77);
                break L1;
              }
            }
            var6 = this.field_l.field_v.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (!pd.a(var5, 0)) {
                if (ab.a(var5, 0)) {
                  stackOut_10_0 = ea.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (ph.a(var5, (byte) 113)) {
                    stackOut_14_0 = cv.field_v;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.a(param1, 127)) {
                      stackOut_18_0 = p.field_d;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var6.length() > 0) {
                        if (!rb.a(var6, var5, -76)) {
                          if (e.a(-110, var6, var5)) {
                            stackOut_28_0 = er.field_b;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!ha.a(var5, (byte) -26, var6)) {
                              stackOut_33_0 = mp.field_Pb;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackOut_31_0 = de.field_c;
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackOut_24_0 = de.field_c;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_21_0 = vk.field_b;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = mp.field_Pb;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("ib.O(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L2;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          return stackIn_34_0;
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

    final gu a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        gu stackIn_3_0 = null;
        gu stackIn_8_0 = null;
        gu stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gu stackOut_2_0 = null;
        gu stackOut_11_0 = null;
        gu stackOut_7_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3 = this.field_l.field_v.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackOut_2_0 = rn.field_e;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -3137) {
                  break L1;
                } else {
                  field_j = 109;
                  break L1;
                }
              }
              if (qd.a(var4, var3, false)) {
                if (this.a(param1, 127)) {
                  stackOut_11_0 = rn.field_e;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return oo.field_g;
                }
              } else {
                stackOut_7_0 = rn.field_e;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("ib.R(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        ru stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        ru stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        ru stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        ru stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        ru stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        ru stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        ru stackIn_80_0 = null;
        ru stackIn_81_0 = null;
        ru stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        ru stackIn_84_0 = null;
        ru stackIn_85_0 = null;
        ru stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_126_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        ru stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        ru stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        ru stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        ru stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        ru stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        ru stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        ru stackOut_79_0 = null;
        ru stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        ru stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        ru stackOut_83_0 = null;
        ru stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        ru stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_21_0 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = fs.a(param3, 24340, param2, param8, param4, param5, param1);
                fe.a(param2, param8, param5, param1, tb.field_j, jh.field_k, 0, 128, false);
                fe.a(param2 + 4, param8 + 4, param5 + -8, 40, tb.field_j, jh.field_k, 0, 128, false);
                fe.a(param2 - -4, -40 + (param1 + param8 + -4), -8 + param5, 40, tb.field_j, jh.field_k, 0, 128, false);
                if ((var9_int ^ -1) != 2) {
                  break L2;
                } else {
                  if (param3 + -param8 >= 40) {
                    break L2;
                  } else {
                    if (0 >= dd.field_e) {
                      break L2;
                    } else {
                      L3: {
                        if (!param0) {
                          break L3;
                        } else {
                          fe.a(param2 + 8, param8 + 8, param5 + -16, 32, il.field_s, nd.field_b, 0, 128, true);
                          if (var17 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      fe.a(8 + param2, param8 - -8, param5 + -16, 32, il.field_s, ci.field_e, 0, 128, true);
                      if (var17 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              fe.a(8 + param2, 8 + param8, -16 + param5, 32, il.field_s, jh.field_k, 0, 128, true);
              break L1;
            }
            L4: {
              L5: {
                L6: {
                  if (var9_int != -3) {
                    break L6;
                  } else {
                    if (-param8 + param3 + 40 <= param1) {
                      break L6;
                    } else {
                      if (uk.field_q > dd.field_e) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                fe.a(8 + param2, -40 + param1 + param8, param5 - 16, 32, il.field_s, jh.field_k, 0, 128, true);
                if (var17 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
              L7: {
                if (param0) {
                  break L7;
                } else {
                  fe.a(8 + param2, -40 + param1 + param8, -16 + param5, 32, il.field_s, ci.field_e, 0, 128, true);
                  if (var17 == 0) {
                    break L4;
                  } else {
                    break L7;
                  }
                }
              }
              fe.a(param2 + 8, param8 + (param1 + -40), -16 + param5, 32, il.field_s, nd.field_b, 0, 128, true);
              break L4;
            }
            sa.field_a.e(param2 + ((param5 >> -786087711) - 29), param8 + 14, 128);
            sa.field_a.e(11 + ((param5 >> -1565080063) + param2), 14 + param8, 128);
            sa.field_a.c();
            sa.field_a.e(-29 + param2 - -(param5 >> 1309938081), param7 + (param1 + param8 + 9), 128);
            sa.field_a.e(11 + ((param5 >> -10388575) + param2), 9 + param1 + (param8 + -40), 128);
            sa.field_a.c();
            if (kd.field_X >= 0) {
              L8: {
                var10 = param8 - (dd.field_e + -44);
                var11 = 0;
                if (!od.field_c[kd.field_X]) {
                  break L8;
                } else {
                  var11 = -1;
                  break L8;
                }
              }
              var12_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (!od.field_c[kd.field_X]) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L11;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_31_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var17 != 0) {
                        break L10;
                      } else {
                        stackOut_28_0 = stackIn_28_0;
                        stackIn_30_0 = stackOut_28_0;
                        break L11;
                      }
                    }
                  }
                  stackOut_30_0 = stackIn_30_0 + bc.field_j[kd.field_X].length ^ -1;
                  stackIn_31_0 = stackOut_30_0;
                  break L10;
                }
                L12: {
                  if (stackIn_31_0 >= (var12_int ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      qn.f(8 + param2, 44 + param8, param2 + param5 + -8, param1 + (param8 - 40 - 4));
                      if (-2 != (var12_int % 2 ^ -1)) {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        break L13;
                      } else {
                        stackOut_33_0 = param5 / 2 + -7;
                        stackIn_35_0 = stackOut_33_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var13 = stackIn_35_0 + (param2 - -8);
                        var14 = 1 + var10;
                        if (var11 != param6) {
                          break L15;
                        } else {
                          fe.a(var13, var14, (param5 >> 969103905) + -9, 78, io.field_m, nd.field_b, 0, 128, false);
                          if (var17 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if ((var9_int ^ -1) == (var11 ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            stackOut_39_0 = kd.field_X;
                            stackOut_39_1 = pg.field_d.a(0);
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            if (hi.field_j < 2) {
                              stackOut_41_0 = stackIn_41_0;
                              stackOut_41_1 = stackIn_41_1;
                              stackOut_41_2 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              stackIn_42_2 = stackOut_41_2;
                              break L17;
                            } else {
                              stackOut_40_0 = stackIn_40_0;
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_42_1 = stackOut_40_1;
                              stackIn_42_2 = stackOut_40_2;
                              break L17;
                            }
                          }
                          L18: {
                            if (ue.a(stackIn_42_0, stackIn_42_1, stackIn_42_2 == 0, var11, -1208926000, ei.field_e[0])) {
                              break L18;
                            } else {
                              fe.a(var13, var14, -9 + (param5 >> 1110882977), 78, io.field_m, jh.field_k, 0, 128, false);
                              if (var17 == 0) {
                                break L14;
                              } else {
                                break L18;
                              }
                            }
                          }
                          fe.a(var13, var14, (param5 >> 1417052129) + -9, 78, io.field_m, dh.field_l, 0, 128, false);
                          if (var17 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L19: {
                        stackOut_47_0 = kd.field_X;
                        stackOut_47_1 = pg.field_d.a(param7 ^ -40);
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (2 > hi.field_j) {
                          stackOut_49_0 = stackIn_49_0;
                          stackOut_49_1 = stackIn_49_1;
                          stackOut_49_2 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          stackIn_50_2 = stackOut_49_2;
                          break L19;
                        } else {
                          stackOut_48_0 = stackIn_48_0;
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_50_2 = stackOut_48_2;
                          break L19;
                        }
                      }
                      L20: {
                        if (ue.a(stackIn_50_0, stackIn_50_1, stackIn_50_2 == 0, var11, -1208926000, ei.field_e[0])) {
                          break L20;
                        } else {
                          fe.a(var13, var14, -9 + (param5 >> -656287551), 78, io.field_m, ci.field_e, 0, 128, false);
                          if (var17 == 0) {
                            break L14;
                          } else {
                            break L20;
                          }
                        }
                      }
                      fe.a(var13, var14, (param5 >> 1576811617) + -9, 78, io.field_m, ld.field_x, 0, 128, false);
                      break L14;
                    }
                    L21: {
                      if (var12_int % 2 != 1) {
                        stackOut_56_0 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        break L21;
                      } else {
                        stackOut_55_0 = param5 / 2 + -7;
                        stackIn_57_0 = stackOut_55_0;
                        break L21;
                      }
                    }
                    L22: {
                      var15 = stackIn_57_0 + (11 + param2);
                      if ((44 + param8 ^ -1) <= (var14 ^ -1)) {
                        stackOut_59_0 = param8 + 40 - -4;
                        stackIn_60_0 = stackOut_59_0;
                        break L22;
                      } else {
                        stackOut_58_0 = var14;
                        stackIn_60_0 = stackOut_58_0;
                        break L22;
                      }
                    }
                    L23: {
                      var16 = stackIn_60_0;
                      stackOut_60_0 = var15;
                      stackOut_60_1 = var16;
                      stackOut_60_2 = -15 + ((param5 >> 1334064385) + var15);
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_62_1 = stackOut_60_1;
                      stackIn_62_2 = stackOut_60_2;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      stackIn_61_2 = stackOut_60_2;
                      if (78 + var16 < param8 + param1 - 40 + -4) {
                        stackOut_62_0 = stackIn_62_0;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = stackIn_62_2;
                        stackOut_62_3 = var16 - -78;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        break L23;
                      } else {
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = stackIn_61_2;
                        stackOut_61_3 = -44 + (param8 - -param1);
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        stackIn_63_3 = stackOut_61_3;
                        break L23;
                      }
                    }
                    L24: {
                      L25: {
                        qn.f(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_63_3);
                        if (-1 >= ((uh.field_e[kd.field_X][1] >> -1064618047) + var10 ^ -1)) {
                          break L25;
                        } else {
                          var11++;
                          if ((var12_int % 2 ^ -1) != -2) {
                            break L24;
                          } else {
                            var10 += 80;
                            if (var17 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      L26: {
                        if (0 <= (var11 ^ -1)) {
                          break L26;
                        } else {
                          L27: {
                            if (kd.field_X != 1) {
                              break L27;
                            } else {
                              L28: {
                                stackOut_69_0 = bc.field_j[1][var11];
                                stackOut_69_1 = param2;
                                stackOut_69_2 = param5 / 4;
                                stackOut_69_3 = uh.field_e[1][0] >> -1109246653;
                                stackIn_71_0 = stackOut_69_0;
                                stackIn_71_1 = stackOut_69_1;
                                stackIn_71_2 = stackOut_69_2;
                                stackIn_71_3 = stackOut_69_3;
                                stackIn_70_0 = stackOut_69_0;
                                stackIn_70_1 = stackOut_69_1;
                                stackIn_70_2 = stackOut_69_2;
                                stackIn_70_3 = stackOut_69_3;
                                if (0 != var12_int % 2) {
                                  stackOut_71_0 = (ru) ((Object) stackIn_71_0);
                                  stackOut_71_1 = stackIn_71_1;
                                  stackOut_71_2 = stackIn_71_2;
                                  stackOut_71_3 = stackIn_71_3;
                                  stackOut_71_4 = param5 / 2;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  stackIn_72_2 = stackOut_71_2;
                                  stackIn_72_3 = stackOut_71_3;
                                  stackIn_72_4 = stackOut_71_4;
                                  break L28;
                                } else {
                                  stackOut_70_0 = (ru) ((Object) stackIn_70_0);
                                  stackOut_70_1 = stackIn_70_1;
                                  stackOut_70_2 = stackIn_70_2;
                                  stackOut_70_3 = stackIn_70_3;
                                  stackOut_70_4 = 0;
                                  stackIn_72_0 = stackOut_70_0;
                                  stackIn_72_1 = stackOut_70_1;
                                  stackIn_72_2 = stackOut_70_2;
                                  stackIn_72_3 = stackOut_70_3;
                                  stackIn_72_4 = stackOut_70_4;
                                  break L28;
                                }
                              }
                              ((ru) (Object) stackIn_72_0).c(stackIn_72_1 + (stackIn_72_2 - (stackIn_72_3 - stackIn_72_4)), 40 + (var10 - (uh.field_e[1][1] >> 225496579)));
                              if (var17 == 0) {
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          L29: {
                            if (-3 == (kd.field_X ^ -1)) {
                              break L29;
                            } else {
                              L30: {
                                if ((kd.field_X ^ -1) == -4) {
                                  break L30;
                                } else {
                                  L31: {
                                    stackOut_75_0 = bc.field_j[kd.field_X][var11];
                                    stackOut_75_1 = param5 / 4 + param2;
                                    stackOut_75_2 = uh.field_e[kd.field_X][0] / 4;
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_77_2 = stackOut_75_2;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    stackIn_76_2 = stackOut_75_2;
                                    if ((var12_int % 2 ^ -1) != -1) {
                                      stackOut_77_0 = (ru) ((Object) stackIn_77_0);
                                      stackOut_77_1 = stackIn_77_1;
                                      stackOut_77_2 = stackIn_77_2;
                                      stackOut_77_3 = param5 / 2;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      stackIn_78_2 = stackOut_77_2;
                                      stackIn_78_3 = stackOut_77_3;
                                      break L31;
                                    } else {
                                      stackOut_76_0 = (ru) ((Object) stackIn_76_0);
                                      stackOut_76_1 = stackIn_76_1;
                                      stackOut_76_2 = stackIn_76_2;
                                      stackOut_76_3 = 0;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackIn_78_1 = stackOut_76_1;
                                      stackIn_78_2 = stackOut_76_2;
                                      stackIn_78_3 = stackOut_76_3;
                                      break L31;
                                    }
                                  }
                                  ((ru) (Object) stackIn_78_0).d(stackIn_78_1 - (stackIn_78_2 - stackIn_78_3), var10 - -40 - (uh.field_e[kd.field_X][1] >> -1449293342));
                                  if (var17 == 0) {
                                    break L26;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              L32: {
                                stackOut_79_0 = bc.field_j[3][var11];
                                stackIn_81_0 = stackOut_79_0;
                                stackIn_80_0 = stackOut_79_0;
                                if (var12_int % 2 != 0) {
                                  stackOut_81_0 = (ru) ((Object) stackIn_81_0);
                                  stackOut_81_1 = param5 / 2;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  break L32;
                                } else {
                                  stackOut_80_0 = (ru) ((Object) stackIn_80_0);
                                  stackOut_80_1 = 0;
                                  stackIn_82_0 = stackOut_80_0;
                                  stackIn_82_1 = stackOut_80_1;
                                  break L32;
                                }
                              }
                              ((ru) (Object) stackIn_82_0).a(stackIn_82_1 + -(uh.field_e[3][0] >> -1168461853) + param2 + param5 / 4, -(uh.field_e[3][1] >> -1284151903) + (40 + var10));
                              if (var17 == 0) {
                                break L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                          L33: {
                            stackOut_83_0 = bc.field_j[2][var11];
                            stackIn_85_0 = stackOut_83_0;
                            stackIn_84_0 = stackOut_83_0;
                            if (-1 == (var12_int % 2 ^ -1)) {
                              stackOut_85_0 = (ru) ((Object) stackIn_85_0);
                              stackOut_85_1 = 0;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              break L33;
                            } else {
                              stackOut_84_0 = (ru) ((Object) stackIn_84_0);
                              stackOut_84_1 = param5 / 2;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_86_1 = stackOut_84_1;
                              break L33;
                            }
                          }
                          ((ru) (Object) stackIn_86_0).c(stackIn_86_1 + (param5 / 4 + param2) - (uh.field_e[2][0] >> -1509032413), 40 + (var10 - (uh.field_e[2][1] >> 426578851)));
                          break L26;
                        }
                      }
                      L34: {
                        if (u.a(80 + param1, (byte) 94) >= var10) {
                          break L34;
                        } else {
                          if (var17 == 0) {
                            break L12;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (1 != var12_int % 2) {
                          break L35;
                        } else {
                          var10 += 80;
                          break L35;
                        }
                      }
                      qn.f(param2 + 8, 40 + param8 - -4, param2 - -param5 + -8, -4 + param8 - (-param1 - -40));
                      var11++;
                      break L24;
                    }
                    var12_int++;
                    if (var17 == 0) {
                      continue L9;
                    } else {
                      break L12;
                    }
                  }
                }
                L36: {
                  qn.a();
                  if (0 <= (kd.field_X ^ -1)) {
                    break L36;
                  } else {
                    L37: {
                      stackOut_95_0 = kd.field_X;
                      stackOut_95_1 = pg.field_d.a(0);
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      stackIn_96_0 = stackOut_95_0;
                      stackIn_96_1 = stackOut_95_1;
                      if (hi.field_j < 2) {
                        stackOut_97_0 = stackIn_97_0;
                        stackOut_97_1 = stackIn_97_1;
                        stackOut_97_2 = 0;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        stackIn_98_2 = stackOut_97_2;
                        break L37;
                      } else {
                        stackOut_96_0 = stackIn_96_0;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = 1;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        stackIn_98_2 = stackOut_96_2;
                        break L37;
                      }
                    }
                    if (ue.a(stackIn_98_0, stackIn_98_1, stackIn_98_2 != 0, var9_int, -1208926000, ei.field_e[0])) {
                      break L36;
                    } else {
                      L38: {
                        L39: {
                          param4 += 10;
                          param3 += 30;
                          var12 = null;
                          if (el.field_f[kd.field_X][var9_int] <= pg.field_d.a(param7 ^ -40)) {
                            if (-1 < (ve.field_a[kd.field_X][var9_int] ^ -1)) {
                              var12 = "Unavailable to lowly players";
                              break L39;
                            } else {
                              if ((ve.field_a[kd.field_X][var9_int] & 504) != 504) {
                                var13 = 0;
                                var14 = 0;
                                L40: while (true) {
                                  L41: {
                                    if (16 <= var14) {
                                      break L41;
                                    } else {
                                      stackOut_106_0 = 0;
                                      stackOut_106_1 = 1 << var14 & ve.field_a[kd.field_X][var9_int];
                                      stackIn_120_0 = stackOut_106_0;
                                      stackIn_120_1 = stackOut_106_1;
                                      stackIn_107_0 = stackOut_106_0;
                                      stackIn_107_1 = stackOut_106_1;
                                      if (var17 != 0) {
                                        break L38;
                                      } else {
                                        L42: {
                                          if (stackIn_107_0 == stackIn_107_1) {
                                            break L42;
                                          } else {
                                            L43: {
                                              L44: {
                                                L45: {
                                                  if (var13 == 0) {
                                                    break L45;
                                                  } else {
                                                    if (var12 != null) {
                                                      break L44;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                var12 = so.field_a[var14];
                                                if (var17 == 0) {
                                                  break L43;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                              var12 = fo.a(param7 + 4840, gk.field_L, new String[]{(String) (var12), so.field_a[var14]});
                                              break L43;
                                            }
                                            var13 = 1;
                                            break L42;
                                          }
                                        }
                                        var14++;
                                        if (var17 == 0) {
                                          continue L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                  break L39;
                                }
                              } else {
                                var12 = vs.field_i;
                                break L39;
                              }
                            }
                          } else {
                            var12 = fo.a(4800, ll.field_Jb, new String[]{Integer.toString(el.field_f[kd.field_X][var9_int])});
                            break L39;
                          }
                        }
                        if (var12 != null) {
                          var18 = fo.a(4800, co.field_s, new String[]{(String) (var12)});
                          var12 = var18;
                          var13 = en.field_E.a(var18);
                          stackOut_119_0 = var13 + param4;
                          stackOut_119_1 = db.a(true, 620);
                          stackIn_120_0 = stackOut_119_0;
                          stackIn_120_1 = stackOut_119_1;
                          break L38;
                        } else {
                          break L36;
                        }
                      }
                      L46: {
                        if (stackIn_120_0 <= stackIn_120_1) {
                          break L46;
                        } else {
                          param4 = db.a(true, 620) - var13;
                          break L46;
                        }
                      }
                      L47: {
                        if (10 + param3 <= u.a(480, (byte) 94)) {
                          break L47;
                        } else {
                          param3 -= 30;
                          break L47;
                        }
                      }
                      qn.a(-6 + param4, param3 - 11, var13 + 12, 15, 5, 0, 128);
                      en.field_E.b((String) (var12), param4, param3, 16777215, -1);
                      break L36;
                    }
                  }
                }
                stackOut_125_0 = var9_int;
                stackIn_126_0 = stackOut_125_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_21_0 = var9_int;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var9), "ib.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          return stackIn_126_0;
        }
    }

    private final boolean a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_k.field_v.toLowerCase();
              var4 = param0.toLowerCase();
              var5 = 53 / ((82 - param1) / 44);
              if (var3.length() <= 0) {
                break L1;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var6 = var3.lastIndexOf("@");
                  if (var6 < 0) {
                    break L1;
                  } else {
                    if (var6 < var3.length() + -1) {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 - -1);
                      if (0 > var4.indexOf(var7)) {
                        if (-1 < (var4.indexOf(var8) ^ -1)) {
                          break L1;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("ib.N(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    ib(fn param0, fn param1, fn param2) {
        super(param0);
        try {
            this.field_k = param2;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 == 40) {
            break L0;
          } else {
            ib.a(127, true, 27, -95);
            break L0;
          }
        }
        if (!iu.field_h) {
          return;
        } else {
          L1: {
            as.field_E.a(true, param1);
            var4 = qd.field_I.d((byte) 91) ? 1 : 0;
            if ((tr.field_A ^ -1) == -1) {
              break L1;
            } else {
              if (var4 == 0) {
                param1 = false;
                qu.e(-3);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!param1) {
              break L2;
            } else {
              qd.field_I.a(param3, (byte) -42, param2);
              break L2;
            }
          }
          L3: {
            if (var4 == 0) {
              break L3;
            } else {
              as.field_E.a(true, param1);
              break L3;
            }
          }
          L4: {
            L5: {
              var5 = qd.field_I.e((byte) -123) + qd.field_I.field_V;
              if (-641 <= (var5 ^ -1)) {
                break L5;
              } else {
                kn.field_z = kn.field_z + 5;
                if (!ArmiesOfGielinor.field_M) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            if (635 <= var5) {
              break L4;
            } else {
              if (0 < kn.field_z) {
                kn.field_z = kn.field_z - 5;
                break L4;
              } else {
                break L4;
              }
            }
          }
          return;
        }
    }

    static {
    }
}
