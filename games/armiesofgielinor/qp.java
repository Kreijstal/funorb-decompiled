/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qp extends dr {
    static String field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                qp.g(125);
                break L1;
              }
            }
            stackOut_2_0 = new nd(sq.a(param1[2].a(param0 ^ -24870), (byte) -2, param1[0].a(2), param1[1].a(2)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("qp.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int e(byte param0) {
        if (param0 >= -123) {
            Random var2 = (Random) null;
            qp.a(-126, -81, -63, -13, -70, -42, (ha) null, -51, (Random) null);
        }
        return nm.field_z;
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, wk param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              if (param0 == 1) {
                break L1;
              } else {
                qp.g(111);
                break L1;
              }
            }
            L2: {
              no.field_P.field_y = qn.field_l;
              no.field_P.field_B = qn.field_d;
              if (!param6) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (dv.field_k == null) {
                      break L4;
                    } else {
                      if (t.field_f == param7) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  t.field_f = param7;
                  dv.field_k = a.field_m[0].g();
                  var19 = dv.field_k.field_B;
                  var18 = var19;
                  var17 = var18;
                  var10_array = var17;
                  var11 = 0;
                  L5: while (true) {
                    if (var19.length <= var11) {
                      break L3;
                    } else {
                      var12 = 255 & var19[var11];
                      var13 = (255 & param7 >> 770024240) * var12 >> 244453928;
                      var14 = ((65280 & param7) >> -1541240920) * var12 >> 1533665416;
                      var15 = (255 & param7) * var12 >> 15505352;
                      var17[var11] = (var14 << 2068828936) + (var13 << -391340688) - -var15;
                      var11++;
                      if (var16 != 0) {
                        break L2;
                      } else {
                        if (var16 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                dv.field_k.d(param3 - 20, -15 + param2, 92, 92, 256);
                break L2;
              }
            }
            L6: {
              L7: {
                if (!param5) {
                  break L7;
                } else {
                  L8: {
                    L9: {
                      ku.field_J.b();
                      qn.b();
                      param9.g(0, 0);
                      if (!param1) {
                        break L9;
                      } else {
                        a.field_m[1].e(0, 0);
                        if (var16 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param8) {
                        break L10;
                      } else {
                        if (param4) {
                          a.field_m[3].e(0, 0);
                          if (var16 == 0) {
                            break L8;
                          } else {
                            break L10;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    fe.a(a.field_m[2], 0, 0, 56, 56);
                    a.field_m[2].d(0, 0, 56, 56, 228);
                    break L8;
                  }
                  no.field_P.b();
                  ku.field_J.h(param3, param2);
                  if (var16 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L11: {
                param9.g(param3, param2);
                if (!param1) {
                  break L11;
                } else {
                  a.field_m[1].e(param3, param2);
                  if (var16 == 0) {
                    break L6;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                if (param8) {
                  break L12;
                } else {
                  if (param4) {
                    a.field_m[3].e(param3, param2);
                    if (var16 == 0) {
                      break L6;
                    } else {
                      break L12;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              fe.a(a.field_m[2], param3, param2, 56, 56);
              a.field_m[2].d(param3, param2, 56, 56, 228);
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var10 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var10);
            stackOut_32_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param9 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    qp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 < 114) {
            wk var2 = (wk) null;
            qp.a(-47, true, -89, 99, true, true, false, -24, false, (wk) null);
        }
        field_E = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ha param6, int param7, Random param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_144_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_183_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        RuntimeException stackIn_200_0 = null;
        StringBuilder stackIn_200_1 = null;
        RuntimeException stackIn_201_0 = null;
        StringBuilder stackIn_201_1 = null;
        RuntimeException stackIn_202_0 = null;
        StringBuilder stackIn_202_1 = null;
        String stackIn_202_2 = null;
        RuntimeException stackIn_203_0 = null;
        StringBuilder stackIn_203_1 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_205_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_172_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_171_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_182_0 = 0;
        int stackOut_182_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_193_1 = 0;
        int stackOut_192_0 = 0;
        int stackOut_192_1 = 0;
        RuntimeException stackOut_199_0 = null;
        StringBuilder stackOut_199_1 = null;
        RuntimeException stackOut_201_0 = null;
        StringBuilder stackOut_201_1 = null;
        String stackOut_201_2 = null;
        RuntimeException stackOut_200_0 = null;
        StringBuilder stackOut_200_1 = null;
        String stackOut_200_2 = null;
        RuntimeException stackOut_202_0 = null;
        StringBuilder stackOut_202_1 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        String stackOut_204_2 = null;
        RuntimeException stackOut_203_0 = null;
        StringBuilder stackOut_203_1 = null;
        String stackOut_203_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (5 != param5) {
              L1: {
                L2: {
                  var9_int = -param4 + param1;
                  var10 = param3 + -param0;
                  var11 = 0;
                  var12 = 0;
                  var13 = 0;
                  var14 = 0;
                  if (param1 != param4) {
                    break L2;
                  } else {
                    L3: {
                      if (0 >= var10) {
                        stackOut_6_0 = -1;
                        stackIn_7_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        break L3;
                      }
                    }
                    var11 = stackIn_7_0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          L7: {
                            if (var11 >= var10) {
                              break L7;
                            } else {
                              stackOut_9_0 = 0;
                              stackOut_9_1 = var10;
                              stackIn_13_0 = stackOut_9_0;
                              stackIn_13_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                if (stackIn_10_0 < stackIn_10_1) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_12_0 = var10;
                          stackOut_12_1 = var11;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L6;
                        }
                        if (stackIn_13_0 >= stackIn_13_1) {
                          break L1;
                        } else {
                          if (var10 > 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        if (null == param6.field_Eb[(param0 + var11) * param6.field_v + var12 - -param4]) {
                          break L8;
                        } else {
                          if (param6.field_Eb[param6.field_v * (var11 + param0) + (var12 + param4)].field_h != param7) {
                            break L8;
                          } else {
                            var14 = 1;
                            if (var15 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      L9: {
                        var13++;
                        if (null != param6.field_Eb[var12 - (-param4 - param6.field_v * (var11 - -param0))]) {
                          break L9;
                        } else {
                          param6.field_Eb[param6.field_v * (var11 - -param0) + (param4 + var12)] = new ne(param7, param6);
                          break L9;
                        }
                      }
                      L10: {
                        stackOut_21_0 = var11;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var10 > 0) {
                          stackOut_23_0 = stackIn_23_0;
                          stackOut_23_1 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          break L10;
                        } else {
                          stackOut_22_0 = stackIn_22_0;
                          stackOut_22_1 = -1;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          break L10;
                        }
                      }
                      var11 = stackIn_24_0 + stackIn_24_1;
                      if (var15 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L11: {
                  if (param3 != param0) {
                    break L11;
                  } else {
                    L12: {
                      if (0 < var9_int) {
                        stackOut_28_0 = 1;
                        stackIn_29_0 = stackOut_28_0;
                        break L12;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L12;
                      }
                    }
                    var12 = stackIn_29_0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          L16: {
                            if (var9_int <= var12) {
                              break L16;
                            } else {
                              stackOut_31_0 = var9_int ^ -1;
                              stackOut_31_1 = -1;
                              stackIn_35_0 = stackOut_31_0;
                              stackIn_35_1 = stackOut_31_1;
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              if (var15 != 0) {
                                break L15;
                              } else {
                                if (stackIn_32_0 < stackIn_32_1) {
                                  break L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          stackOut_34_0 = var9_int;
                          stackOut_34_1 = var12;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          break L15;
                        }
                        if (stackIn_35_0 >= stackIn_35_1) {
                          break L1;
                        } else {
                          if (-1 > (var9_int ^ -1)) {
                            break L1;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L17: {
                        if (null == param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                          break L17;
                        } else {
                          if (param7 != param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                            break L17;
                          } else {
                            var14 = 1;
                            if (var15 == 0) {
                              break L1;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L18: {
                        if (param6.field_Eb[param4 + (var12 + param6.field_v * (var11 - -param0))] == null) {
                          param6.field_Eb[param4 + (var12 - -(param6.field_v * (var11 + param0)))] = new ne(param7, param6);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        var13++;
                        stackOut_44_0 = var12;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_45_0 = stackOut_44_0;
                        if (-1 > (var9_int ^ -1)) {
                          stackOut_46_0 = stackIn_46_0;
                          stackOut_46_1 = 1;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          break L19;
                        } else {
                          stackOut_45_0 = stackIn_45_0;
                          stackOut_45_1 = -1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          break L19;
                        }
                      }
                      var12 = stackIn_47_0 + stackIn_47_1;
                      if (var15 == 0) {
                        continue L13;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L20: {
                  L21: {
                    if (var9_int >= 2) {
                      break L21;
                    } else {
                      if (var9_int > -2) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    L23: {
                      if (-3 >= (var10 ^ -1)) {
                        break L23;
                      } else {
                        if (var10 > -2) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if ((ns.a(false, 100, param8) ^ -1) < -51) {
                        break L24;
                      } else {
                        L25: {
                          if (-1 <= (var10 ^ -1)) {
                            stackOut_57_0 = -1;
                            stackIn_58_0 = stackOut_57_0;
                            break L25;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L25;
                          }
                        }
                        var11 = stackIn_58_0;
                        L26: while (true) {
                          L27: {
                            L28: {
                              L29: {
                                if (var10 <= var11) {
                                  break L29;
                                } else {
                                  stackOut_60_0 = -1;
                                  stackOut_60_1 = var10 ^ -1;
                                  stackIn_64_0 = stackOut_60_0;
                                  stackIn_64_1 = stackOut_60_1;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  if (var15 != 0) {
                                    break L28;
                                  } else {
                                    if (stackIn_61_0 > stackIn_61_1) {
                                      break L27;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              stackOut_63_0 = var10;
                              stackOut_63_1 = var11;
                              stackIn_64_0 = stackOut_63_0;
                              stackIn_64_1 = stackOut_63_1;
                              break L28;
                            }
                            if (stackIn_64_0 >= stackIn_64_1) {
                              break L1;
                            } else {
                              if ((var10 ^ -1) < -1) {
                                break L1;
                              } else {
                                break L27;
                              }
                            }
                          }
                          L30: {
                            if (null == param6.field_Eb[param4 + (var12 + (param0 + var11) * param6.field_v)]) {
                              break L30;
                            } else {
                              if (param6.field_Eb[var12 - -param4 - -(param6.field_v * (var11 - -param0))].field_h == param7) {
                                var14 = 1;
                                if (var15 == 0) {
                                  break L1;
                                } else {
                                  break L30;
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (null != param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                              break L31;
                            } else {
                              param6.field_Eb[var12 - -param4 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                              break L31;
                            }
                          }
                          L32: {
                            var13++;
                            if (var11 != var10 >> -1345275039) {
                              break L32;
                            } else {
                              L33: {
                                if (-1 > (var9_int ^ -1)) {
                                  stackOut_76_0 = 1;
                                  stackIn_77_0 = stackOut_76_0;
                                  break L33;
                                } else {
                                  stackOut_75_0 = -1;
                                  stackIn_77_0 = stackOut_75_0;
                                  break L33;
                                }
                              }
                              var12 = stackIn_77_0;
                              L34: while (true) {
                                L35: {
                                  L36: {
                                    L37: {
                                      L38: {
                                        if (var9_int < var12) {
                                          break L38;
                                        } else {
                                          stackOut_79_0 = 0;
                                          stackOut_79_1 = var9_int;
                                          stackIn_83_0 = stackOut_79_0;
                                          stackIn_83_1 = stackOut_79_1;
                                          stackIn_80_0 = stackOut_79_0;
                                          stackIn_80_1 = stackOut_79_1;
                                          if (var15 != 0) {
                                            break L37;
                                          } else {
                                            if (stackIn_80_0 < stackIn_80_1) {
                                              break L36;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_82_0 = var9_int ^ -1;
                                      stackOut_82_1 = var12 ^ -1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      break L37;
                                    }
                                    if (stackIn_83_0 < stackIn_83_1) {
                                      break L35;
                                    } else {
                                      if (var9_int > 0) {
                                        break L35;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)] == null) {
                                      break L39;
                                    } else {
                                      if (param7 != param6.field_Eb[(var11 - -param0) * param6.field_v + (param4 + var12)].field_h) {
                                        break L39;
                                      } else {
                                        if (var15 == 0) {
                                          break L35;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  L40: {
                                    var13++;
                                    if (null != param6.field_Eb[param6.field_v * (param0 + var11) + (param4 + var12)]) {
                                      break L40;
                                    } else {
                                      param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] = new ne(param7, param6);
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    stackOut_92_0 = var12;
                                    stackIn_94_0 = stackOut_92_0;
                                    stackIn_93_0 = stackOut_92_0;
                                    if (var9_int > 0) {
                                      stackOut_94_0 = stackIn_94_0;
                                      stackOut_94_1 = 1;
                                      stackIn_95_0 = stackOut_94_0;
                                      stackIn_95_1 = stackOut_94_1;
                                      break L41;
                                    } else {
                                      stackOut_93_0 = stackIn_93_0;
                                      stackOut_93_1 = -1;
                                      stackIn_95_0 = stackOut_93_0;
                                      stackIn_95_1 = stackOut_93_1;
                                      break L41;
                                    }
                                  }
                                  var12 = stackIn_95_0 + stackIn_95_1;
                                  if (var15 == 0) {
                                    continue L34;
                                  } else {
                                    break L35;
                                  }
                                }
                                L42: {
                                  stackOut_96_0 = var12;
                                  stackIn_98_0 = stackOut_96_0;
                                  stackIn_97_0 = stackOut_96_0;
                                  if ((var9_int ^ -1) >= -1) {
                                    stackOut_98_0 = stackIn_98_0;
                                    stackOut_98_1 = 1;
                                    stackIn_99_0 = stackOut_98_0;
                                    stackIn_99_1 = stackOut_98_1;
                                    break L42;
                                  } else {
                                    stackOut_97_0 = stackIn_97_0;
                                    stackOut_97_1 = -1;
                                    stackIn_99_0 = stackOut_97_0;
                                    stackIn_99_1 = stackOut_97_1;
                                    break L42;
                                  }
                                }
                                var12 = stackIn_99_0 + stackIn_99_1;
                                break L32;
                              }
                            }
                          }
                          L43: {
                            stackOut_100_0 = var11;
                            stackIn_102_0 = stackOut_100_0;
                            stackIn_101_0 = stackOut_100_0;
                            if ((var10 ^ -1) < -1) {
                              stackOut_102_0 = stackIn_102_0;
                              stackOut_102_1 = 1;
                              stackIn_103_0 = stackOut_102_0;
                              stackIn_103_1 = stackOut_102_1;
                              break L43;
                            } else {
                              stackOut_101_0 = stackIn_101_0;
                              stackOut_101_1 = -1;
                              stackIn_103_0 = stackOut_101_0;
                              stackIn_103_1 = stackOut_101_1;
                              break L43;
                            }
                          }
                          var11 = stackIn_103_0 + stackIn_103_1;
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L44: {
                      if (var9_int > 0) {
                        stackOut_106_0 = 1;
                        stackIn_107_0 = stackOut_106_0;
                        break L44;
                      } else {
                        stackOut_105_0 = -1;
                        stackIn_107_0 = stackOut_105_0;
                        break L44;
                      }
                    }
                    var12 = stackIn_107_0;
                    L45: while (true) {
                      L46: {
                        L47: {
                          L48: {
                            if (var12 >= var9_int) {
                              break L48;
                            } else {
                              stackOut_109_0 = var9_int;
                              stackIn_113_0 = stackOut_109_0;
                              stackIn_110_0 = stackOut_109_0;
                              if (var15 != 0) {
                                break L47;
                              } else {
                                if (stackIn_110_0 > 0) {
                                  break L46;
                                } else {
                                  break L48;
                                }
                              }
                            }
                          }
                          stackOut_112_0 = var12 ^ -1;
                          stackIn_113_0 = stackOut_112_0;
                          break L47;
                        }
                        if (stackIn_113_0 >= (var9_int ^ -1)) {
                          break L1;
                        } else {
                          if (-1 > (var9_int ^ -1)) {
                            break L1;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L49: {
                        if (param6.field_Eb[param4 + (var12 - -(param6.field_v * (param0 + var11)))] == null) {
                          break L49;
                        } else {
                          if (param6.field_Eb[var12 + (param4 - -(param6.field_v * (var11 + param0)))].field_h != param7) {
                            break L49;
                          } else {
                            var14 = 1;
                            if (var15 == 0) {
                              break L1;
                            } else {
                              break L49;
                            }
                          }
                        }
                      }
                      L50: {
                        if (param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] != null) {
                          break L50;
                        } else {
                          param6.field_Eb[param4 + var12 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                          break L50;
                        }
                      }
                      L51: {
                        var13++;
                        if (var12 == var9_int >> -1080653279) {
                          L52: {
                            if (-1 <= (var10 ^ -1)) {
                              stackOut_125_0 = -1;
                              stackIn_126_0 = stackOut_125_0;
                              break L52;
                            } else {
                              stackOut_124_0 = 1;
                              stackIn_126_0 = stackOut_124_0;
                              break L52;
                            }
                          }
                          var11 = stackIn_126_0;
                          L53: while (true) {
                            L54: {
                              L55: {
                                L56: {
                                  L57: {
                                    if (var10 < var11) {
                                      break L57;
                                    } else {
                                      stackOut_128_0 = -1;
                                      stackOut_128_1 = var10 ^ -1;
                                      stackIn_132_0 = stackOut_128_0;
                                      stackIn_132_1 = stackOut_128_1;
                                      stackIn_129_0 = stackOut_128_0;
                                      stackIn_129_1 = stackOut_128_1;
                                      if (var15 != 0) {
                                        break L56;
                                      } else {
                                        if (stackIn_129_0 > stackIn_129_1) {
                                          break L55;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_131_0 = var11;
                                  stackOut_131_1 = var10;
                                  stackIn_132_0 = stackOut_131_0;
                                  stackIn_132_1 = stackOut_131_1;
                                  break L56;
                                }
                                if (stackIn_132_0 < stackIn_132_1) {
                                  break L54;
                                } else {
                                  if (var10 > 0) {
                                    break L54;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              L58: {
                                if (param6.field_Eb[var12 - -param4 - -((var11 - -param0) * param6.field_v)] == null) {
                                  break L58;
                                } else {
                                  if (param7 == param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                                    break L54;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              L59: {
                                var13++;
                                if (null == param6.field_Eb[(param0 + var11) * param6.field_v + (param4 + var12)]) {
                                  param6.field_Eb[param6.field_v * (var11 - -param0) + param4 + var12] = new ne(param7, param6);
                                  break L59;
                                } else {
                                  break L59;
                                }
                              }
                              L60: {
                                stackOut_141_0 = var11;
                                stackIn_143_0 = stackOut_141_0;
                                stackIn_142_0 = stackOut_141_0;
                                if (var10 <= 0) {
                                  stackOut_143_0 = stackIn_143_0;
                                  stackOut_143_1 = -1;
                                  stackIn_144_0 = stackOut_143_0;
                                  stackIn_144_1 = stackOut_143_1;
                                  break L60;
                                } else {
                                  stackOut_142_0 = stackIn_142_0;
                                  stackOut_142_1 = 1;
                                  stackIn_144_0 = stackOut_142_0;
                                  stackIn_144_1 = stackOut_142_1;
                                  break L60;
                                }
                              }
                              var11 = stackIn_144_0 + stackIn_144_1;
                              if (var15 == 0) {
                                continue L53;
                              } else {
                                break L54;
                              }
                            }
                            L61: {
                              stackOut_145_0 = var11;
                              stackIn_147_0 = stackOut_145_0;
                              stackIn_146_0 = stackOut_145_0;
                              if (0 < var10) {
                                stackOut_147_0 = stackIn_147_0;
                                stackOut_147_1 = -1;
                                stackIn_148_0 = stackOut_147_0;
                                stackIn_148_1 = stackOut_147_1;
                                break L61;
                              } else {
                                stackOut_146_0 = stackIn_146_0;
                                stackOut_146_1 = 1;
                                stackIn_148_0 = stackOut_146_0;
                                stackIn_148_1 = stackOut_146_1;
                                break L61;
                              }
                            }
                            var11 = stackIn_148_0 + stackIn_148_1;
                            break L51;
                          }
                        } else {
                          break L51;
                        }
                      }
                      L62: {
                        stackOut_149_0 = var12;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (-1 > (var9_int ^ -1)) {
                          stackOut_151_0 = stackIn_151_0;
                          stackOut_151_1 = 1;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L62;
                        } else {
                          stackOut_150_0 = stackIn_150_0;
                          stackOut_150_1 = -1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L62;
                        }
                      }
                      var12 = stackIn_152_0 + stackIn_152_1;
                      if (var15 == 0) {
                        continue L45;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L63: {
                    if (-1 > (var9_int ^ -1)) {
                      stackOut_155_0 = 1;
                      stackIn_156_0 = stackOut_155_0;
                      break L63;
                    } else {
                      stackOut_154_0 = -1;
                      stackIn_156_0 = stackOut_154_0;
                      break L63;
                    }
                  }
                  var12 = stackIn_156_0;
                  L64: while (true) {
                    L65: {
                      L66: {
                        L67: {
                          if (var12 > var9_int) {
                            break L67;
                          } else {
                            stackOut_158_0 = var9_int;
                            stackIn_162_0 = stackOut_158_0;
                            stackIn_159_0 = stackOut_158_0;
                            if (var15 != 0) {
                              break L66;
                            } else {
                              if (stackIn_159_0 > 0) {
                                break L65;
                              } else {
                                break L67;
                              }
                            }
                          }
                        }
                        stackOut_161_0 = var9_int;
                        stackIn_162_0 = stackOut_161_0;
                        break L66;
                      }
                      if (stackIn_162_0 > var12) {
                        break L1;
                      } else {
                        if (var9_int > 0) {
                          break L1;
                        } else {
                          break L65;
                        }
                      }
                    }
                    L68: {
                      if (null == param6.field_Eb[var12 + param4 + (var11 - -param0) * param6.field_v]) {
                        break L68;
                      } else {
                        if (param7 != param6.field_Eb[var12 + param4 - -((param0 + var11) * param6.field_v)].field_h) {
                          break L68;
                        } else {
                          var14 = 1;
                          if (var15 == 0) {
                            break L1;
                          } else {
                            break L68;
                          }
                        }
                      }
                    }
                    L69: {
                      var13++;
                      if (null != param6.field_Eb[param6.field_v * (var11 - -param0) + (var12 - -param4)]) {
                        break L69;
                      } else {
                        param6.field_Eb[param6.field_v * (param0 + var11) + param4 + var12] = new ne(param7, param6);
                        break L69;
                      }
                    }
                    L70: {
                      stackOut_170_0 = var12;
                      stackIn_172_0 = stackOut_170_0;
                      stackIn_171_0 = stackOut_170_0;
                      if (var9_int > 0) {
                        stackOut_172_0 = stackIn_172_0;
                        stackOut_172_1 = 1;
                        stackIn_173_0 = stackOut_172_0;
                        stackIn_173_1 = stackOut_172_1;
                        break L70;
                      } else {
                        stackOut_171_0 = stackIn_171_0;
                        stackOut_171_1 = -1;
                        stackIn_173_0 = stackOut_171_0;
                        stackIn_173_1 = stackOut_171_1;
                        break L70;
                      }
                    }
                    var12 = stackIn_173_0 + stackIn_173_1;
                    if (var15 == 0) {
                      continue L64;
                    } else {
                      break L20;
                    }
                  }
                }
                L71: {
                  if (-1 > (var10 ^ -1)) {
                    stackOut_176_0 = 1;
                    stackIn_177_0 = stackOut_176_0;
                    break L71;
                  } else {
                    stackOut_175_0 = -1;
                    stackIn_177_0 = stackOut_175_0;
                    break L71;
                  }
                }
                var11 = stackIn_177_0;
                L72: while (true) {
                  L73: {
                    L74: {
                      L75: {
                        if (var10 < var11) {
                          break L75;
                        } else {
                          stackOut_179_0 = -1;
                          stackOut_179_1 = var10 ^ -1;
                          stackIn_183_0 = stackOut_179_0;
                          stackIn_183_1 = stackOut_179_1;
                          stackIn_180_0 = stackOut_179_0;
                          stackIn_180_1 = stackOut_179_1;
                          if (var15 != 0) {
                            break L74;
                          } else {
                            if (stackIn_180_0 > stackIn_180_1) {
                              break L73;
                            } else {
                              break L75;
                            }
                          }
                        }
                      }
                      stackOut_182_0 = var11 ^ -1;
                      stackOut_182_1 = var10 ^ -1;
                      stackIn_183_0 = stackOut_182_0;
                      stackIn_183_1 = stackOut_182_1;
                      break L74;
                    }
                    if (stackIn_183_0 > stackIn_183_1) {
                      break L1;
                    } else {
                      if ((var10 ^ -1) < -1) {
                        break L1;
                      } else {
                        break L73;
                      }
                    }
                  }
                  L76: {
                    if (null == param6.field_Eb[(var11 - -param0) * param6.field_v + (var12 + param4)]) {
                      break L76;
                    } else {
                      if (param6.field_Eb[param4 + (var12 - -((var11 - -param0) * param6.field_v))].field_h != param7) {
                        break L76;
                      } else {
                        var14 = 1;
                        if (var15 == 0) {
                          break L1;
                        } else {
                          break L76;
                        }
                      }
                    }
                  }
                  L77: {
                    var13++;
                    if (param6.field_Eb[(var11 + param0) * param6.field_v + var12 - -param4] != null) {
                      break L77;
                    } else {
                      param6.field_Eb[var12 + param4 + (param0 + var11) * param6.field_v] = new ne(param7, param6);
                      break L77;
                    }
                  }
                  L78: {
                    stackOut_191_0 = var11;
                    stackIn_193_0 = stackOut_191_0;
                    stackIn_192_0 = stackOut_191_0;
                    if (-1 <= (var10 ^ -1)) {
                      stackOut_193_0 = stackIn_193_0;
                      stackOut_193_1 = -1;
                      stackIn_194_0 = stackOut_193_0;
                      stackIn_194_1 = stackOut_193_1;
                      break L78;
                    } else {
                      stackOut_192_0 = stackIn_192_0;
                      stackOut_192_1 = 1;
                      stackIn_194_0 = stackOut_192_0;
                      stackIn_194_1 = stackOut_192_1;
                      break L78;
                    }
                  }
                  var11 = stackIn_194_0 + stackIn_194_1;
                  if (var15 == 0) {
                    continue L72;
                  } else {
                    break L1;
                  }
                }
              }
              L79: {
                if (param2 != (var13 ^ -1)) {
                  break L79;
                } else {
                  if (var14 != 0) {
                    break L79;
                  } else {
                    var13 = 1;
                    qp.a(param0, param1, param2 ^ 0, param3, param4, param5 - -1, param6, param7, param8);
                    break L79;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L80: {
            var9 = decompiledCaughtException;
            stackOut_199_0 = (RuntimeException) (var9);
            stackOut_199_1 = new StringBuilder().append("qp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_201_0 = stackOut_199_0;
            stackIn_201_1 = stackOut_199_1;
            stackIn_200_0 = stackOut_199_0;
            stackIn_200_1 = stackOut_199_1;
            if (param6 == null) {
              stackOut_201_0 = (RuntimeException) ((Object) stackIn_201_0);
              stackOut_201_1 = (StringBuilder) ((Object) stackIn_201_1);
              stackOut_201_2 = "null";
              stackIn_202_0 = stackOut_201_0;
              stackIn_202_1 = stackOut_201_1;
              stackIn_202_2 = stackOut_201_2;
              break L80;
            } else {
              stackOut_200_0 = (RuntimeException) ((Object) stackIn_200_0);
              stackOut_200_1 = (StringBuilder) ((Object) stackIn_200_1);
              stackOut_200_2 = "{...}";
              stackIn_202_0 = stackOut_200_0;
              stackIn_202_1 = stackOut_200_1;
              stackIn_202_2 = stackOut_200_2;
              break L80;
            }
          }
          L81: {
            stackOut_202_0 = (RuntimeException) ((Object) stackIn_202_0);
            stackOut_202_1 = ((StringBuilder) (Object) stackIn_202_1).append(stackIn_202_2).append(',').append(param7).append(',');
            stackIn_204_0 = stackOut_202_0;
            stackIn_204_1 = stackOut_202_1;
            stackIn_203_0 = stackOut_202_0;
            stackIn_203_1 = stackOut_202_1;
            if (param8 == null) {
              stackOut_204_0 = (RuntimeException) ((Object) stackIn_204_0);
              stackOut_204_1 = (StringBuilder) ((Object) stackIn_204_1);
              stackOut_204_2 = "null";
              stackIn_205_0 = stackOut_204_0;
              stackIn_205_1 = stackOut_204_1;
              stackIn_205_2 = stackOut_204_2;
              break L81;
            } else {
              stackOut_203_0 = (RuntimeException) ((Object) stackIn_203_0);
              stackOut_203_1 = (StringBuilder) ((Object) stackIn_203_1);
              stackOut_203_2 = "{...}";
              stackIn_205_0 = stackOut_203_0;
              stackIn_205_1 = stackOut_203_1;
              stackIn_205_2 = stackOut_203_2;
              break L81;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_205_0), stackIn_205_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = "Find opponents";
    }
}
