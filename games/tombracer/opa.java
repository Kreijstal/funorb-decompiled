/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opa extends qra {
    private boolean field_o;
    private gsa[] field_r;
    private boolean field_m;
    private boolean field_p;
    private boolean field_q;
    private boolean field_s;
    static mi[] field_n;

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5) {
        kh var8 = null;
        int var7 = 0;
        int discarded$6 = 0;
        try {
            var8 = ql.field_k;
            var8.k(param2, param3 + -35359);
            var8.field_h = var8.field_h + 1;
            if (param3 != 32371) {
                field_n = (mi[]) null;
            }
            var7 = var8.field_h;
            var8.i(param0, 0);
            if (!(param0 != 2)) {
                var8.a(param4, false);
            }
            if (param1 == null) {
                var8.f(-1477662136, param5);
            } else {
                discarded$6 = wq.a(param1, var8, 0);
                if (TombRacer.field_G) {
                    var8.f(-1477662136, param5);
                }
            }
            var8.d(-var7 + var8.field_h, (byte) 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "opa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
            this.field_m = false;
            return false;
        }
        return false;
    }

    public static void f(int param0) {
        field_n = null;
        if (param0 < 73) {
            field_n = (mi[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_22_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_13_0 = false;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 > param1) {
              if (param1 + 1 < param2) {
                L1: {
                  if (param2 <= param1 - -5) {
                    break L1;
                  } else {
                    if (param0 == param5) {
                      break L1;
                    } else {
                      var7_int = (1 & (param5 & param0)) + (param5 >> 1598161089) + (param0 >> -668009087);
                      var8 = param1;
                      var9 = param0;
                      var10 = param5;
                      var11 = param1;
                      L2: while (true) {
                        L3: {
                          if (param2 <= var11) {
                            opa.a(param0, param1, var8, param3, (byte) -100, var9, param6);
                            stackOut_31_0 = var10;
                            stackIn_32_0 = stackOut_31_0;
                            break L3;
                          } else {
                            var12 = boa.field_n[var11];
                            stackOut_21_0 = param6;
                            stackIn_32_0 = stackOut_21_0 ? 1 : 0;
                            stackIn_22_0 = stackOut_21_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_22_0) {
                                  stackOut_24_0 = ic.field_c[var12];
                                  stackIn_25_0 = stackOut_24_0;
                                  break L4;
                                } else {
                                  stackOut_23_0 = jk.field_h[var12];
                                  stackIn_25_0 = stackOut_23_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_25_0;
                                  if (var7_int < var13) {
                                    break L6;
                                  } else {
                                    if (var10 >= var13) {
                                      break L5;
                                    } else {
                                      var10 = var13;
                                      if (var14 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                boa.field_n[var11] = boa.field_n[var8];
                                incrementValue$1 = var8;
                                var8++;
                                boa.field_n[incrementValue$1] = var12;
                                if (var13 >= var9) {
                                  break L5;
                                } else {
                                  var9 = var13;
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        opa.a(stackIn_32_0, var8, param2, param3, param4, param5, param6);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L7: while (true) {
                  stackOut_9_0 = var7_int ^ -1;
                  stackIn_10_0 = stackOut_9_0;
                  L8: while (true) {
                    L9: {
                      if (stackIn_10_0 >= (param1 ^ -1)) {
                        break L9;
                      } else {
                        var8 = param1;
                        L10: while (true) {
                          L11: {
                            if (var8 >= var7_int) {
                              break L11;
                            } else {
                              var9 = boa.field_n[var8];
                              var10 = boa.field_n[var8 + 1];
                              stackOut_13_0 = cl.a(param6, (byte) 119, var10, var9);
                              stackIn_10_0 = stackOut_13_0 ? 1 : 0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var14 != 0) {
                                continue L8;
                              } else {
                                L12: {
                                  if (!stackIn_14_0) {
                                    break L12;
                                  } else {
                                    boa.field_n[var8] = var10;
                                    boa.field_n[var8 - -1] = var9;
                                    break L12;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "opa.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            this.field_m = true;
            return true;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gsa var14_ref_gsa = null;
        int var14 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        String var20_ref_String = null;
        int var20 = 0;
        int var21_int = 0;
        nh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        nh var25 = null;
        int var26 = 0;
        int var27 = 0;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        nh var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        nh var35 = null;
        String var36 = null;
        String var37 = null;
        nh var38 = null;
        String var39 = null;
        String var40 = null;
        nh var41 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_103_0 = 0;
        StringBuilder stackIn_104_0 = null;
        StringBuilder stackIn_105_0 = null;
        StringBuilder stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_127_0 = 0;
        StringBuilder stackIn_128_0 = null;
        StringBuilder stackIn_129_0 = null;
        StringBuilder stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_144_1 = 0;
        int stackIn_151_0 = 0;
        StringBuilder stackIn_152_0 = null;
        StringBuilder stackIn_153_0 = null;
        StringBuilder stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        int stackIn_172_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_102_0 = 0;
        StringBuilder stackOut_103_0 = null;
        StringBuilder stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        StringBuilder stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_125_0 = 0;
        int stackOut_126_0 = 0;
        StringBuilder stackOut_127_0 = null;
        StringBuilder stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        StringBuilder stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_150_0 = 0;
        StringBuilder stackOut_151_0 = null;
        StringBuilder stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        StringBuilder stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_166_1 = 0;
        int stackOut_166_2 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        int stackOut_171_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = TombRacer.field_G ? 1 : 0;
                    if (param0 < -50) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_s = false;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    ura.a(-10985);
                    la.field_j.a(0, 0);
                    ik.field_h.a(0, 0);
                    ng.field_b[1].a(50, -10);
                    var3 = -250 + aaa.a(false);
                    var4 = -10 + ng.field_b[1].c() + -70;
                    ng.field_b[1].a(var3, -10);
                    nm.field_l.a(var3, 0);
                    nm.field_l.a(var3, var4);
                    var5 = 3;
                    var6 = (var3 + -50) / (var5 - -1);
                    var7 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var5 <= var7) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var8 = 50 - -((1 + var7) * var6);
                    ng.field_b[0].a(var8, 0);
                    var7++;
                    if (var27 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var7 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (3 <= var7) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8 = -30 + (var3 + -50 >> 2071501314) * 3;
                    var9 = (var7 + 1) * ((var4 - 0) / 4) + 20;
                    ng.field_b[0].a((float)var8, (float)var9, 4096, 16384, 3, 1610612736, 1);
                    ng.field_b[0].a((float)(var8 - -150), (float)var9, 4096, 16384, 3, 1610612736, 1);
                    var7++;
                    if (var27 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var27 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = this.field_c.field_E;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var8 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (this.field_c.field_k <= var8) {
                        statePc = 63;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var9 = var3 + 32;
                    stackOut_15_0 = 95 * var8;
                    stackOut_15_1 = 70;
                    stackOut_15_2 = -4;
                    stackIn_65_0 = stackOut_15_0;
                    stackIn_65_1 = stackOut_15_1;
                    stackIn_65_2 = stackOut_15_2;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    if (var27 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (stackIn_16_2 >= (this.field_c.field_k ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 95;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var10 = stackIn_19_0 + (stackIn_19_1 - -stackIn_19_2);
                    var11 = -50 + var10;
                    var12 = var10 - 25;
                    eca.field_c[2].a(3 + var9, var11, eca.field_c[2].a() >> 299328994, eca.field_c[2].c() >> 1776428962);
                    var13 = var10;
                    eca.field_c[1].a(var9, var12, eca.field_c[1].a() >> -656139454, eca.field_c[1].c() >> -2106429246);
                    eca.field_c[0].a(2 + var9, var13, eca.field_c[0].a() / 3, eca.field_c[0].c() / 3);
                    var14_ref_gsa = this.field_r[var8];
                    if (!var14_ref_gsa.field_l) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = var14_ref_gsa.field_c;
                    stackIn_22_0 = stackOut_20_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var15 = stackIn_22_0;
                    var28 = Integer.toString(var15);
                    var20_ref_String = var28;
                    var20_ref_String = var28;
                    var16_ref_String = var28;
                    if (var15 < 10) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var16_ref_String = "0" + var28;
                    var20_ref_String = var16_ref_String;
                    var20_ref_String = var16_ref_String;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    ts.a(-1, -73, 20 + var11, var16_ref_String.toUpperCase(), 24 + var9, eda.field_f, 2431750);
                    if (var14_ref_gsa.field_d) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = 0;
                    stackIn_28_0 = stackOut_26_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = var14_ref_gsa.field_r;
                    stackIn_28_0 = stackOut_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var17 = stackIn_28_0;
                    var29 = Integer.toString(var17);
                    var20_ref_String = var29;
                    var20_ref_String = var29;
                    var18_ref_String = var29;
                    if (10 > var17) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var18_ref_String = "0" + var29;
                    var20_ref_String = var18_ref_String;
                    var20_ref_String = var18_ref_String;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    ts.a(-1, -28, var12 - -17, var18_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                    if (var14_ref_gsa.field_k) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = 0;
                    stackIn_34_0 = stackOut_32_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = var14_ref_gsa.field_p;
                    stackIn_34_0 = stackOut_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var19 = stackIn_34_0;
                    var30 = Integer.toString(var19);
                    var20_ref_String = var30;
                    var20_ref_String = var30;
                    var20_ref_String = var30;
                    if (var19 >= 10) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var20_ref_String = "0" + var30;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    ts.a(-1, -29, var13 + 14, var20_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                    var21_int = this.field_c.field_H[var8].z(-104);
                    var22 = 0;
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (2 != bta.field_n[var21_int]) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var14_ref_gsa.field_o) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var22 = 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (0 > var21_int) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((bta.field_n[var21_int] ^ -1) != -2) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!var14_ref_gsa.field_h) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var22 = 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (0 != bta.field_n[var21_int]) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var14_ref_gsa.field_b) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var22 = 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var22 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var23 = 43 + var9;
                    if (bta.field_n[var21_int] != 2) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = -4 + var11;
                    stackIn_58_0 = stackOut_54_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 55: {
                    if ((bta.field_n[var21_int] ^ -1) != -2) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = -6 + var12;
                    stackIn_58_0 = stackOut_56_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = var13 - 10;
                    stackIn_58_0 = stackOut_57_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var24 = stackIn_58_0;
                    var31 = sta.field_y[bta.field_f[var21_int]];
                    var25 = var31;
                    var25.a(var23, var24, var31.a() >> -1701847199, var31.c() >> -888815583);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var23 = 80 + var9;
                    var24 = 32 + var10;
                    var32 = String.valueOf(this.field_r[var8].field_m);
                    ts.a(-1, -59, var24, "$", var23, qr.field_v, 2431750);
                    ts.a(0, -28, -1 + var24, var32.toUpperCase(), 18 + var23, qr.field_v, wga.field_a[var8]);
                    var26 = this.field_c.field_v[var8];
                    if (var8 != this.field_c.e(2)) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var7 >= -100 + fd.field_e) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var26--;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    oka.a(Integer.toString(var26), wga.field_a[var8], qr.field_v, -1, -47 + (var24 + -1), 55, 0);
                    oka.a(Integer.toString(this.field_c.field_L), wga.field_a[var8], qr.field_v, -1, -12 + (var24 + -1), 55, 0);
                    oka.a("_", wga.field_a[var8], qr.field_v, -1, -40 + var24, 55, 0);
                    var8++;
                    if (var27 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var8 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = var8 ^ -1;
                    stackOut_64_1 = this.field_c.field_k;
                    stackOut_64_2 = -1;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    stackIn_65_2 = stackOut_64_2;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1 ^ stackIn_65_2;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 <= stackIn_66_1) {
                        statePc = 171;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = 95 * var8 + 105;
                    stackIn_172_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if (var27 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = stackIn_68_0;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (this.field_c.field_k < 3) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = stackIn_69_0;
                    stackOut_69_1 = 0;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = stackIn_70_0;
                    stackOut_70_1 = 95;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var9 = stackIn_71_0 + stackIn_71_1;
                    if (-100 + fd.field_e > var7) {
                        statePc = 88;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var8 == this.field_c.e(2)) {
                        statePc = 74;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (this.field_c.field_L == this.field_c.field_v[var8]) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9 - 22, (var3 + 50 >> -1164132767) + 20, -1);
                    if (var27 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9 + -22, (var3 + 50 >> 1972141153) - -20, -1);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var10 = 0;
                    var11 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (this.field_r.length <= var11) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = var11;
                    stackOut_80_1 = var8;
                    stackIn_66_0 = stackOut_80_0;
                    stackIn_66_1 = stackOut_80_1;
                    stackIn_81_0 = stackOut_80_0;
                    stackIn_81_1 = stackOut_80_1;
                    if (var27 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 == stackIn_81_1) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_r[var8].field_x != this.field_r[var11].field_x) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var10 = 1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var11++;
                    if (var27 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var10 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9, 20 + (50 + var3 >> -479353247), -1);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    tga.field_a.KA(0, var9 - 100, (int)(2.0 + this.field_r[var8].field_q), var9 - -50);
                    var10 = wga.field_a[var8];
                    gca.field_a.a(62, 10 + var9 + -95, 0, var10 | -1006632960, 1);
                    tga.field_a.la();
                    this.field_c.field_H[var8].n((byte) -42).a(-1, (int)this.field_r[var8].field_q, 1400, 1536, var9);
                    oka.a(this.field_c.field_l[var8].toUpperCase(), var10, kn.field_p, -1, var9, (int)this.field_r[var8].field_q, -1);
                    if (this.field_p) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var7 < var8 * 50 + efa.field_y) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var7 < 50 + efa.field_y - -(this.field_c.field_k * 50)) {
                        statePc = 148;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (this.field_m) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var7 < var8 * 50 + nta.field_d) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (50 + (this.field_c.field_k * 50 + nta.field_d) > var7) {
                        statePc = 124;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (this.field_o) {
                        statePc = 170;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var7 < var8 * 50 + iv.field_ub) {
                        statePc = 170;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var7 < this.field_c.field_k * 50 + iv.field_ub - -50) {
                        statePc = 100;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (50 * var8 + iv.field_ub + 25 > var7) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = 1;
                    stackIn_103_0 = stackOut_101_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = 0;
                    stackIn_103_0 = stackOut_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var11 = stackIn_103_0;
                    var33 = Integer.toString(this.field_r[var8].field_c);
                    stackOut_103_0 = new StringBuilder().append("$");
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var11 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackOut_104_0 = (StringBuilder) ((Object) stackIn_104_0);
                    stackOut_104_1 = this.field_r[var8].field_f;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = (StringBuilder) ((Object) stackIn_105_0);
                    stackOut_105_1 = 0;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var34 = Integer.toString(stackIn_106_1 + this.field_r[var8].field_a);
                    var14 = this.field_c.field_H[var8].z(-113);
                    if (var11 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = 0;
                    stackIn_114_0 = stackOut_107_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 108: {
                    if (0 < this.field_r[var8].field_f) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = 0;
                    stackIn_114_0 = stackOut_109_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 110: {
                    if ((var14 ^ -1) <= -1) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackOut_111_0 = 0;
                    stackIn_114_0 = stackOut_111_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 112: {
                    stackOut_112_0 = 1;
                    stackIn_114_0 = stackOut_112_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var15 = stackIn_114_0;
                    if (var15 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = 20;
                    stackIn_117_0 = stackOut_115_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackOut_116_0 = 0;
                    stackIn_117_0 = stackOut_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var16 = stackIn_117_0 + Math.max(95 + wb.field_a.a("x" + var33, (byte) 45), 70 + wb.field_a.a("+" + var34, (byte) 98));
                    stackOut_117_0 = 40;
                    stackOut_117_1 = (int)this.field_r[var8].field_q;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_119_1 = stackOut_117_1;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    if ((double)(-var16 + var3) > this.field_r[var8].field_q) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = stackIn_118_0;
                    stackOut_118_1 = stackIn_118_1;
                    stackOut_118_2 = var16;
                    stackIn_120_0 = stackOut_118_0;
                    stackIn_120_1 = stackOut_118_1;
                    stackIn_120_2 = stackOut_118_2;
                    statePc = 120;
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = stackIn_119_0;
                    stackOut_119_1 = stackIn_119_1;
                    stackOut_119_2 = 0;
                    stackIn_120_0 = stackOut_119_0;
                    stackIn_120_1 = stackOut_119_1;
                    stackIn_120_2 = stackOut_119_2;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var17 = stackIn_120_0 + (stackIn_120_1 + -stackIn_120_2);
                    var18 = -70 + var9;
                    eca.field_c[2].a(var17, var18 + -5, eca.field_c[2].a() >> 813448290, eca.field_c[2].c() >> 1171533250);
                    ts.a(0, -30, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -100, var18 + 17, var33, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -126, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -24, 55 + var18, var34, 25 + var17, qr.field_v, wga.field_a[var8]);
                    if (var15 != 0) {
                        statePc = 122;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var19 = var17 - -wb.field_a.a("x" + var33, (byte) 36) - -25;
                    var20 = -11 + var18;
                    var35 = sta.field_y[bta.field_f[var14]];
                    var21 = var35;
                    var21.a(var19, var20, var35.a() >> -1516435071, var35.c() >> -1785801471);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (var27 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (25 + (nta.field_d + var8 * 50) > var7) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = 1;
                    stackIn_127_0 = stackOut_125_0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    stackOut_126_0 = 0;
                    stackIn_127_0 = stackOut_126_0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var11 = stackIn_127_0;
                    var36 = Integer.toString(this.field_r[var8].field_r);
                    stackOut_127_0 = new StringBuilder().append("$");
                    stackIn_129_0 = stackOut_127_0;
                    stackIn_128_0 = stackOut_127_0;
                    if (var11 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = (StringBuilder) ((Object) stackIn_128_0);
                    stackOut_128_1 = 0;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = (StringBuilder) ((Object) stackIn_129_0);
                    stackOut_129_1 = this.field_r[var8].field_z;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var37 = Integer.toString(stackIn_130_1 + this.field_r[var8].field_n);
                    var14 = this.field_c.field_H[var8].z(39);
                    if (var11 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = 0;
                    stackIn_138_0 = stackOut_131_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 132: {
                    if (this.field_r[var8].field_z > 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = 0;
                    stackIn_138_0 = stackOut_133_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 134: {
                    if (-1 >= (var14 ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = 0;
                    stackIn_138_0 = stackOut_135_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 136: {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    var15 = stackIn_138_0;
                    stackOut_138_0 = Math.max(95 + wb.field_a.a("x" + var36, (byte) 49), 70 + wb.field_a.a("+" + var37, (byte) 99));
                    stackIn_140_0 = stackOut_138_0;
                    stackIn_139_0 = stackOut_138_0;
                    if (var15 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackOut_139_0 = stackIn_139_0;
                    stackOut_139_1 = 0;
                    stackIn_141_0 = stackOut_139_0;
                    stackIn_141_1 = stackOut_139_1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    stackOut_140_0 = stackIn_140_0;
                    stackOut_140_1 = 20;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var16 = stackIn_141_0 - -stackIn_141_1;
                    stackOut_141_0 = (int)this.field_r[var8].field_q - -40;
                    stackIn_143_0 = stackOut_141_0;
                    stackIn_142_0 = stackOut_141_0;
                    if ((double)(-var16 + var3) <= this.field_r[var8].field_q) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackOut_142_0 = stackIn_142_0;
                    stackOut_142_1 = 0;
                    stackIn_144_0 = stackOut_142_0;
                    stackIn_144_1 = stackOut_142_1;
                    statePc = 144;
                    continue stateLoop;
                }
                case 143: {
                    stackOut_143_0 = stackIn_143_0;
                    stackOut_143_1 = var16;
                    stackIn_144_0 = stackOut_143_0;
                    stackIn_144_1 = stackOut_143_1;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var17 = stackIn_144_0 + -stackIn_144_1;
                    var18 = var9 - 70;
                    eca.field_c[1].a(var17, -5 + var18, eca.field_c[1].a() >> -332879806, eca.field_c[1].c() >> 997498242);
                    ts.a(0, -42, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -124, var18 - -17, var36, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -92, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -119, 55 + var18, var37, var17 + 25, qr.field_v, wga.field_a[var8]);
                    if (var15 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var19 = var17 + (wb.field_a.a("x" + var36, (byte) -122) + 25);
                    var20 = var18 + -11;
                    var38 = sta.field_y[bta.field_f[var14]];
                    var21 = var38;
                    var21.a(var19, var20, var38.a() >> -574488927, var38.c() >> -267027071);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var27 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var8 * 50 + efa.field_y - -25 > var7) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackOut_149_0 = 1;
                    stackIn_151_0 = stackOut_149_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = 0;
                    stackIn_151_0 = stackOut_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var11 = stackIn_151_0;
                    var39 = Integer.toString(this.field_r[var8].field_p);
                    stackOut_151_0 = new StringBuilder().append("$");
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (var11 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    stackOut_152_0 = (StringBuilder) ((Object) stackIn_152_0);
                    stackOut_152_1 = this.field_r[var8].field_u;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 153: {
                    stackOut_153_0 = (StringBuilder) ((Object) stackIn_153_0);
                    stackOut_153_1 = 0;
                    stackIn_154_0 = stackOut_153_0;
                    stackIn_154_1 = stackOut_153_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    var40 = Integer.toString(stackIn_154_1 + this.field_r[var8].field_v);
                    var14 = this.field_c.field_H[var8].z(-124);
                    if (var11 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = 0;
                    stackIn_162_0 = stackOut_155_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 156: {
                    if (this.field_r[var8].field_u > 0) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = 0;
                    stackIn_162_0 = stackOut_157_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 158: {
                    if (-1 < (var14 ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = 1;
                    stackIn_162_0 = stackOut_159_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = 0;
                    stackIn_162_0 = stackOut_160_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var15 = stackIn_162_0;
                    if (var15 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackOut_163_0 = 20;
                    stackIn_165_0 = stackOut_163_0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = 0;
                    stackIn_165_0 = stackOut_164_0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var16 = stackIn_165_0 + Math.max(95 + wb.field_a.a("x" + var39, (byte) -103), wb.field_a.a("+" + var40, (byte) 87) + 70);
                    stackOut_165_0 = 40;
                    stackOut_165_1 = (int)this.field_r[var8].field_q;
                    stackIn_167_0 = stackOut_165_0;
                    stackIn_167_1 = stackOut_165_1;
                    stackIn_166_0 = stackOut_165_0;
                    stackIn_166_1 = stackOut_165_1;
                    if ((double)(-var16 + var3) <= this.field_r[var8].field_q) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackOut_166_0 = stackIn_166_0;
                    stackOut_166_1 = stackIn_166_1;
                    stackOut_166_2 = 0;
                    stackIn_168_0 = stackOut_166_0;
                    stackIn_168_1 = stackOut_166_1;
                    stackIn_168_2 = stackOut_166_2;
                    statePc = 168;
                    continue stateLoop;
                }
                case 167: {
                    stackOut_167_0 = stackIn_167_0;
                    stackOut_167_1 = stackIn_167_1;
                    stackOut_167_2 = var16;
                    stackIn_168_0 = stackOut_167_0;
                    stackIn_168_1 = stackOut_167_1;
                    stackIn_168_2 = stackOut_167_2;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var17 = stackIn_168_0 + (stackIn_168_1 - stackIn_168_2);
                    var18 = var9 + -70;
                    eca.field_c[0].a(var17, -5 + var18, eca.field_c[0].a() >> 1028237665, eca.field_c[0].c() >> 188512449);
                    ts.a(0, -123, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -51, 17 + var18, var39, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -103, var18 - -55, "+", var17 - -2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -65, var18 - -55, var40, 25 + var17, qr.field_v, wga.field_a[var8]);
                    if (var15 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = 25 + wb.field_a.a("x" + var39, (byte) 31) + var17;
                    var20 = -11 + var18;
                    var41 = sta.field_y[bta.field_f[var14]];
                    var21 = var41;
                    var21.a(var19, var20, var41.a() >> 160958305, var41.c() >> 457600321);
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var8++;
                    if (var27 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    stackOut_171_0 = -6;
                    stackIn_172_0 = stackOut_171_0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    se.f((byte) stackIn_172_0);
                    this.d(-27142);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(String param0, byte param1) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        RuntimeException var2 = null;
        mi[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        mi[] var11 = null;
        int stackIn_6_0 = 0;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var11 = ih.a((byte) 126, param0);
            var2_array = var11;
            var3 = new StringBuilder();
            var4 = -99 % ((param1 - 5) / 54);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var11.length) {
                  break L2;
                } else {
                  L3: {
                    var6 = var11[var5];
                    var7 = var6.field_h;
                    if (var5 != var11.length + -1) {
                      stackOut_5_0 = var11[var5 - -1].field_h;
                      stackIn_6_0 = stackOut_5_0;
                      break L3;
                    } else {
                      stackOut_4_0 = param0.length();
                      stackIn_6_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var8 = stackIn_6_0;
                      var9 = param0.substring(var7, var8);
                      if (var6.field_p == ma.field_e) {
                        break L5;
                      } else {
                        L6: {
                          if (nl.field_d == var6.field_p) {
                            break L6;
                          } else {
                            L7: {
                              if (var6.field_p != tr.field_f) {
                                break L7;
                              } else {
                                discarded$6 = var3.append("<col=ffff99>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (dc.field_o != var6.field_p) {
                                break L8;
                              } else {
                                discarded$7 = var3.append("<col=ffaaff>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (var6.field_p != dja.field_r) {
                                break L9;
                              } else {
                                discarded$8 = var3.append("<col=33ffaa>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            discarded$9 = var3.append(var9);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        discarded$10 = var3.append("<col=33bbff>").append(var9).append("</col>");
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    discarded$11 = var3.append("<col=66ffff>").append(var9).append("</col>");
                    break L4;
                  }
                  var5++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_23_0 = var3.toString();
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("opa.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    opa(qh param0, v param1, int[][] param2) {
        super(param0, param1);
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        gsa var14 = null;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        gsa var18_ref_gsa = null;
        double var18 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        int var33 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        double stackIn_26_0 = 0.0;
        double stackIn_30_0 = 0.0;
        double stackIn_34_0 = 0.0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        double stackOut_25_0 = 0.0;
        double stackOut_24_0 = 0.0;
        double stackOut_29_0 = 0.0;
        double stackOut_28_0 = 0.0;
        double stackOut_32_0 = 0.0;
        double stackOut_33_0 = 0.0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var33 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = this.field_c.field_H.length;
            this.field_r = new gsa[var4_int];
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int <= var5_int) {
                  er.b(1, 0);
                  this.field_s = false;
                  mr.field_w = new w();
                  break L2;
                } else {
                  this.field_r[var5_int] = new gsa(this.field_c.field_H[var5_int], param2[var5_int]);
                  var5_int++;
                  if (var33 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var5 = 0.0;
              var7 = 0.0;
              var9 = 0.0;
              var11 = 0.0;
              var13_int = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var13_int >= this.field_r.length) {
                      break L5;
                    } else {
                      var14 = this.field_r[var13_int];
                      var18_ref_gsa = var14;
                      var18_ref_gsa = var14;
                      var15_int = var14.field_v + var14.field_u;
                      var16 = var14.field_n + var14.field_z;
                      var17 = var14.field_a - -var14.field_f;
                      stackOut_8_0 = (var9 < (double)var16 ? -1 : (var9 == (double)var16 ? 0 : 1));
                      stackIn_19_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var33 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_9_0 >= 0) {
                            break L6;
                          } else {
                            var9 = (double)var16;
                            break L6;
                          }
                        }
                        L7: {
                          if (var7 >= (double)var15_int) {
                            break L7;
                          } else {
                            var7 = (double)var15_int;
                            break L7;
                          }
                        }
                        L8: {
                          if ((double)(var15_int - (-var16 + -var17)) <= var5) {
                            break L8;
                          } else {
                            var5 = (double)(var17 + (var15_int - -var16));
                            break L8;
                          }
                        }
                        L9: {
                          if (var11 >= (double)var17) {
                            break L9;
                          } else {
                            var11 = (double)var17;
                            break L9;
                          }
                        }
                        var13_int++;
                        if (var33 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = aaa.a(false) + -250;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                }
                var13 = (double)stackIn_19_0;
                var15 = -50.0 + var13;
                var17 = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (this.field_r.length <= var17) {
                        break L12;
                      } else {
                        var18_ref_gsa = this.field_r[var17];
                        var19 = (double)(var18_ref_gsa.field_u + var18_ref_gsa.field_v);
                        stackOut_21_0 = (var19 < 0.0 ? -1 : (var19 == 0.0 ? 0 : 1));
                        stackIn_36_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var33 != 0) {
                          break L11;
                        } else {
                          L13: {
                            L14: {
                              if (stackIn_22_0 == 0) {
                                break L14;
                              } else {
                                if (0.0 != var5) {
                                  stackOut_25_0 = var19 / var5 * 100.0;
                                  stackIn_26_0 = stackOut_25_0;
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            stackOut_24_0 = 0.0;
                            stackIn_26_0 = stackOut_24_0;
                            break L13;
                          }
                          L15: {
                            L16: {
                              var21 = stackIn_26_0;
                              var23 = var21 * (var15 / 100.0) / 100.0;
                              var25 = (double)(var18_ref_gsa.field_n + var18_ref_gsa.field_z);
                              if (0.0 == var25) {
                                break L16;
                              } else {
                                if (var5 != 0.0) {
                                  stackOut_29_0 = 100.0 * (var25 / var5);
                                  stackIn_30_0 = stackOut_29_0;
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            stackOut_28_0 = 0.0;
                            stackIn_30_0 = stackOut_28_0;
                            break L15;
                          }
                          L17: {
                            L18: {
                              var21 = stackIn_30_0;
                              var27 = var21 * (var15 / 100.0) / 100.0;
                              var29 = (double)(var18_ref_gsa.field_f + var18_ref_gsa.field_a);
                              if (var29 == 0.0) {
                                break L18;
                              } else {
                                if (0.0 == var5) {
                                  break L18;
                                } else {
                                  stackOut_32_0 = 100.0 * (var29 / var5);
                                  stackIn_34_0 = stackOut_32_0;
                                  break L17;
                                }
                              }
                            }
                            stackOut_33_0 = 0.0;
                            stackIn_34_0 = stackOut_33_0;
                            break L17;
                          }
                          var21 = stackIn_34_0;
                          var31 = var21 * (var15 / 100.0) / 100.0;
                          var18_ref_gsa.a(var27, var31, var23, true);
                          var17++;
                          if (var33 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var17 = 50;
                    stackOut_35_0 = (0.0 < var7 ? -1 : (0.0 == var7 ? 0 : 1));
                    stackIn_36_0 = stackOut_35_0;
                    break L11;
                  }
                  L19: {
                    L20: {
                      if (stackIn_36_0 >= 0) {
                        break L20;
                      } else {
                        efa.field_y = var17;
                        var17 = var4_int * 50 + (var17 - -50);
                        ona.field_H = var17;
                        var17 += 100;
                        var17 += 50;
                        if (var33 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    this.field_p = true;
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (var9 > 0.0) {
                        break L22;
                      } else {
                        this.field_m = true;
                        if (var33 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    nta.field_d = var17;
                    var17 = 50 + var4_int * 50 + var17;
                    og.field_m = var17;
                    var17 += 100;
                    var17 += 50;
                    break L21;
                  }
                  L23: {
                    L24: {
                      if (0.0 < var11) {
                        break L24;
                      } else {
                        this.field_o = true;
                        if (var33 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    iv.field_ub = var17;
                    var17 = var17 - -(var4_int * 50) + 50;
                    ema.field_b = var17;
                    var17 += 100;
                    break L23;
                  }
                  L25: {
                    if (!this.field_p) {
                      break L25;
                    } else {
                      if (!this.field_m) {
                        break L25;
                      } else {
                        if (!this.field_o) {
                          break L25;
                        } else {
                          ona.field_H = var17;
                          var17 += 100;
                          var18 = var15 / 100.0;
                          this.field_r[this.field_c.e(2)].field_i = var18;
                          break L25;
                        }
                      }
                    }
                  }
                  var17 += 100;
                  fd.field_e = var17;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var4 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var4);
            stackOut_51_1 = new StringBuilder().append("opa.<init>(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L26;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L26;
            }
          }
          L27: {
            stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L27;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L27;
            }
          }
          L28: {
            stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
            stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L28;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        w stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        w stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        w stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        boolean stackOut_4_0 = false;
        boolean stackOut_8_0 = false;
        w stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        w stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        w stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 80) {
            break L0;
          } else {
            this.b(76, true);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var3 >= this.field_c.field_H.length) {
                break L3;
              } else {
                stackOut_4_0 = this.field_q;
                stackIn_9_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0) {
                      break L4;
                    } else {
                      this.field_c.field_H[var3].n((byte) -98).a(26, 4, true);
                      break L4;
                    }
                  }
                  this.field_c.field_H[var3].n((byte) -127).a(param0 + 21383);
                  this.field_c.field_H[var3].n((byte) -54).f(-4366);
                  var3++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_q = true;
            stackOut_8_0 = param1;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          }
          L5: {
            if (stackIn_9_0) {
              this.c(7);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            this.field_c.field_E = this.field_c.field_E + 1;
            var3 = this.field_c.field_E;
            if (fd.field_e > var3) {
              break L6;
            } else {
              if (!this.field_s) {
                L7: {
                  if (this.field_f == null) {
                    break L7;
                  } else {
                    this.field_f.a(6418);
                    break L7;
                  }
                }
                this.field_s = true;
                break L6;
              } else {
                break L6;
              }
            }
          }
          var4 = 0;
          L8: while (true) {
            L9: {
              L10: {
                if (this.field_r.length <= var4) {
                  break L10;
                } else {
                  this.field_r[var4].a(0, var3, var4);
                  var4++;
                  if (var5 != 0) {
                    break L9;
                  } else {
                    if (var5 == 0) {
                      continue L8;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L11: {
                stackOut_23_0 = mr.field_w;
                stackOut_23_1 = param0 + 35;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1) {
                  stackOut_25_0 = (w) ((Object) stackIn_25_0);
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L11;
                } else {
                  stackOut_24_0 = (w) ((Object) stackIn_24_0);
                  stackOut_24_1 = stackIn_24_1;
                  stackOut_24_2 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L11;
                }
              }
              ((w) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2 != 0);
              break L9;
            }
            return;
          }
        }
    }

    static {
    }
}
