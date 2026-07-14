/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends oh {
    private int field_P;
    static int[] field_J;
    private String field_U;
    static nj field_N;
    private int field_I;
    private boolean field_H;
    private cc field_K;
    static nk[][] field_S;
    private int field_Q;
    static boolean field_O;
    static String field_T;
    static String field_L;
    static String field_G;
    static od field_R;
    static cr[] field_M;

    mg(int param0, int param1, int param2, int param3, iq param4, boolean param5, int param6, int param7, cc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ur) null, (uf) null);
        ((mg) this).field_P = param9;
        ((mg) this).field_I = param6;
        ((mg) this).field_Q = param7;
        ((mg) this).field_K = param8;
        ((mg) this).field_C = param4;
        ((mg) this).field_U = param10;
        ((mg) this).field_H = param5 ? true : false;
        int var12 = ((mg) this).field_I + -((mg) this).field_Q;
        int var13 = ((mg) this).field_K.a(param10, var12, ((mg) this).field_K.field_z) + ((mg) this).field_Q * 2;
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((mg) this).a(false, param0, param1, var13, param2);
        }
        int var14 = !((mg) this).field_H ? ((mg) this).field_I - -(((mg) this).field_Q * 2) : 0;
        ((mg) this).field_C.a(false, var14, (-param3 + var13 >> 165415681) + ((mg) this).field_Q, -(2 * ((mg) this).field_Q) + param3, param2 - ((mg) this).field_I - 3 * ((mg) this).field_Q);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = param2 + ((mg) this).field_o;
        int var6 = param3 + ((mg) this).field_t;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = ((mg) this).field_H ? -(2 * ((mg) this).field_Q) + -((mg) this).field_I + ((mg) this).field_n : 0;
        int discarded$0 = ((mg) this).field_K.a(((mg) this).field_U, ((mg) this).field_Q + var7 + var5, var6 - -((mg) this).field_Q, -((mg) this).field_Q + ((mg) this).field_I, -(2 * ((mg) this).field_Q) + ((mg) this).field_s, ((mg) this).field_P, -1, !((mg) this).field_H ? 2 : 0, 1, ((mg) this).field_K.field_z);
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
            ch.field_e.b((iq) (Object) bb.field_F, 0);
        }
        bb.field_F.a(param2, 4210752, param1, param3);
        if (param0 != 1) {
            return;
        }
        bi.c();
        mh.a(true, false);
    }

    final static void a(boolean param0, int param1, boolean param2, uh param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        nk[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        int var22_int = 0;
        String var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        nk var28 = null;
        nk var29 = null;
        nk[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        nk stackIn_21_0 = null;
        nk stackIn_22_0 = null;
        nk stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        nk stackIn_28_0 = null;
        nk stackIn_29_0 = null;
        nk stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        nk stackIn_74_0 = null;
        nk stackIn_75_0 = null;
        nk stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        nk stackIn_79_0 = null;
        nk stackIn_80_0 = null;
        nk stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        nk stackIn_85_0 = null;
        boolean stackIn_85_1 = false;
        nk stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        nk stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        int stackIn_87_2 = 0;
        nk stackIn_89_0 = null;
        nk stackIn_90_0 = null;
        nk stackIn_91_0 = null;
        nk stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_96_0 = 0;
        nk stackIn_111_0 = null;
        nk stackIn_112_0 = null;
        nk stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        nk stackIn_115_0 = null;
        nk stackIn_116_0 = null;
        nk stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        nk stackIn_119_0 = null;
        nk stackIn_120_0 = null;
        nk stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        nk stackIn_123_0 = null;
        nk stackIn_124_0 = null;
        nk stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        String stackIn_140_0 = null;
        nk stackIn_143_0 = null;
        nk stackIn_144_0 = null;
        nk stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        nk stackIn_146_0 = null;
        nk stackIn_147_0 = null;
        nk stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_218_0 = 0;
        nk stackIn_311_0 = null;
        boolean stackIn_311_1 = false;
        nk stackIn_312_0 = null;
        boolean stackIn_312_1 = false;
        nk stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        int stackIn_313_2 = 0;
        nk stackIn_315_0 = null;
        nk stackIn_316_0 = null;
        nk stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        nk stackIn_319_0 = null;
        nk stackIn_320_0 = null;
        nk stackIn_321_0 = null;
        nk stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        nk stackIn_324_0 = null;
        nk stackIn_325_0 = null;
        nk stackIn_326_0 = null;
        nk stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        nk stackOut_20_0 = null;
        nk stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        nk stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        nk stackOut_27_0 = null;
        nk stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        nk stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        nk stackOut_84_0 = null;
        boolean stackOut_84_1 = false;
        nk stackOut_86_0 = null;
        boolean stackOut_86_1 = false;
        int stackOut_86_2 = 0;
        nk stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        int stackOut_85_2 = 0;
        nk stackOut_78_0 = null;
        nk stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        nk stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        nk stackOut_73_0 = null;
        nk stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        nk stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        nk stackOut_88_0 = null;
        nk stackOut_89_0 = null;
        nk stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        nk stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        Object stackOut_139_0 = null;
        String stackOut_138_0 = null;
        nk stackOut_142_0 = null;
        nk stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        nk stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        nk stackOut_145_0 = null;
        nk stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        nk stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        nk stackOut_318_0 = null;
        nk stackOut_319_0 = null;
        nk stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        nk stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        nk stackOut_314_0 = null;
        nk stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        nk stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        nk stackOut_310_0 = null;
        boolean stackOut_310_1 = false;
        nk stackOut_312_0 = null;
        boolean stackOut_312_1 = false;
        int stackOut_312_2 = 0;
        nk stackOut_311_0 = null;
        boolean stackOut_311_1 = false;
        int stackOut_311_2 = 0;
        nk stackOut_323_0 = null;
        nk stackOut_324_0 = null;
        nk stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        nk stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        nk stackOut_118_0 = null;
        nk stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        nk stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        nk stackOut_114_0 = null;
        nk stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        nk stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        nk stackOut_110_0 = null;
        nk stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        nk stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        nk stackOut_122_0 = null;
        nk stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        nk stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        L0: {
          var26 = Vertigo2.field_L ? 1 : 0;
          if (param2) {
            L1: {
              if (qn.field_q) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (cn.b(false)) {
                if (!param3.field_kc) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            break L0;
          }
        }
        L3: {
          var5 = param0 ? 1 : 0;
          if (param2) {
            break L3;
          } else {
            var6 = 0;
            L4: while (true) {
              if (var6 >= 5) {
                if (field_S[0][2].field_G) {
                  if (cn.b(false)) {
                    ko.field_S = qn.field_z;
                    break L3;
                  } else {
                    ko.field_S = Vertigo2.a(new String[1], e.field_e, 77);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    if (field_S[0][1 + var6].field_tb == 0) {
                      break L5;
                    } else {
                      if (var6 != param3.field_Ub) {
                        param3.field_Ub = var6;
                        var5 = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  stackOut_20_0 = field_S[0][var6 + 1];
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var4 == 0) {
                    stackOut_22_0 = (nk) (Object) stackIn_22_0;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L6;
                  } else {
                    stackOut_21_0 = (nk) (Object) stackIn_21_0;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L6;
                  }
                }
                L7: {
                  stackIn_23_0.field_lb = stackIn_23_1 != 0;
                  if (db.field_S) {
                    break L7;
                  } else {
                    if (var6 == 3) {
                      field_S[0][1 + var6].field_lb = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  stackOut_27_0 = field_S[0][1 + var6];
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (var6 != param3.field_Ub) {
                    stackOut_29_0 = (nk) (Object) stackIn_29_0;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L8;
                  } else {
                    stackOut_28_0 = (nk) (Object) stackIn_28_0;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L8;
                  }
                }
                stackIn_30_0.field_V = stackIn_30_1 != 0;
                var6++;
                continue L4;
              }
            }
          }
        }
        L9: {
          if (2 > rc.field_a.length) {
            break L9;
          } else {
            L10: {
              if (param2) {
                if (-1 != np.field_Ob) {
                  stackOut_41_0 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  break L10;
                } else {
                  stackOut_40_0 = 0;
                  stackIn_43_0 = stackOut_40_0;
                  break L10;
                }
              } else {
                stackOut_38_0 = 0;
                stackIn_43_0 = stackOut_38_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_43_0;
              if (var6 == 0) {
                break L11;
              } else {
                var7 = np.field_Ob;
                var8_int = 0;
                L12: while (true) {
                  if (qc.field_w.length <= var8_int) {
                    qc.field_w[var7 / 8] = (byte)om.a((int) qc.field_w[var7 / 8], 1 << var7 % 8);
                    break L11;
                  } else {
                    qc.field_w[var8_int] = (byte) 0;
                    var8_int++;
                    continue L12;
                  }
                }
              }
            }
            L13: {
              if (!param2) {
                stackOut_50_0 = 0;
                stackIn_51_0 = stackOut_50_0;
                break L13;
              } else {
                stackOut_49_0 = -1;
                stackIn_51_0 = stackOut_49_0;
                break L13;
              }
            }
            var7 = stackIn_51_0;
            L14: while (true) {
              if (rc.field_a.length <= var7) {
                break L9;
              } else {
                L15: {
                  if (var6 != 0) {
                    if (var7 != np.field_Ob) {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L15;
                    } else {
                      stackOut_56_0 = 0;
                      stackIn_59_0 = stackOut_56_0;
                      break L15;
                    }
                  } else {
                    stackOut_54_0 = 0;
                    stackIn_59_0 = stackOut_54_0;
                    break L15;
                  }
                }
                L16: {
                  var8_int = stackIn_59_0;
                  if (var4 == 0) {
                    break L16;
                  } else {
                    if (field_S[1][1 + var7].field_tb != 0) {
                      if (param2) {
                        if (var6 != 0) {
                          break L16;
                        } else {
                          if ((var7 ^ -1) == 0) {
                            var9 = 0;
                            L17: while (true) {
                              if (var9 >= qc.field_w.length) {
                                break L16;
                              } else {
                                qc.field_w[var9] = (byte) 0;
                                var9++;
                                continue L17;
                              }
                            }
                          } else {
                            qc.field_w[var7 / 8] = (byte)tk.a((int) qc.field_w[var7 / 8], 1 << b.a(var7, 7));
                            break L16;
                          }
                        }
                      } else {
                        var9 = rc.field_a[var7];
                        if (var9 != param3.field_uc) {
                          param3.field_uc = var9;
                          var5 = 1;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L18: {
                  if (param2) {
                    if (var7 == -1) {
                      field_S[1][var7 + 1].field_V = true;
                      var9 = 0;
                      L19: while (true) {
                        if (var9 >= rc.field_a.length) {
                          break L18;
                        } else {
                          L20: {
                            stackOut_84_0 = field_S[1][1 + var7];
                            stackOut_84_1 = field_S[1][1 + var7].field_V;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_85_0 = stackOut_84_0;
                            stackIn_85_1 = stackOut_84_1;
                            if ((qc.field_w[var9 / 8] & 1 << (7 & var9)) != 0) {
                              stackOut_86_0 = (nk) (Object) stackIn_86_0;
                              stackOut_86_1 = stackIn_86_1;
                              stackOut_86_2 = 0;
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              stackIn_87_2 = stackOut_86_2;
                              break L20;
                            } else {
                              stackOut_85_0 = (nk) (Object) stackIn_85_0;
                              stackOut_85_1 = stackIn_85_1;
                              stackOut_85_2 = 1;
                              stackIn_87_0 = stackOut_85_0;
                              stackIn_87_1 = stackOut_85_1;
                              stackIn_87_2 = stackOut_85_2;
                              break L20;
                            }
                          }
                          stackIn_87_0.field_V = stackIn_87_1 & stackIn_87_2 != 0;
                          var9++;
                          continue L19;
                        }
                      }
                    } else {
                      L21: {
                        stackOut_78_0 = field_S[1][var7 + 1];
                        stackIn_80_0 = stackOut_78_0;
                        stackIn_79_0 = stackOut_78_0;
                        if ((qc.field_w[var7 / 8] & 1 << (var7 & 7)) == 0) {
                          stackOut_80_0 = (nk) (Object) stackIn_80_0;
                          stackOut_80_1 = 0;
                          stackIn_81_0 = stackOut_80_0;
                          stackIn_81_1 = stackOut_80_1;
                          break L21;
                        } else {
                          stackOut_79_0 = (nk) (Object) stackIn_79_0;
                          stackOut_79_1 = 1;
                          stackIn_81_0 = stackOut_79_0;
                          stackIn_81_1 = stackOut_79_1;
                          break L21;
                        }
                      }
                      stackIn_81_0.field_V = stackIn_81_1 != 0;
                      break L18;
                    }
                  } else {
                    L22: {
                      var9 = rc.field_a[var7];
                      stackOut_73_0 = field_S[1][1 + var7];
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_74_0 = stackOut_73_0;
                      if (param3.field_uc != var9) {
                        stackOut_75_0 = (nk) (Object) stackIn_75_0;
                        stackOut_75_1 = 0;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        break L22;
                      } else {
                        stackOut_74_0 = (nk) (Object) stackIn_74_0;
                        stackOut_74_1 = 1;
                        stackIn_76_0 = stackOut_74_0;
                        stackIn_76_1 = stackOut_74_1;
                        break L22;
                      }
                    }
                    stackIn_76_0.field_V = stackIn_76_1 != 0;
                    break L18;
                  }
                }
                L23: {
                  L24: {
                    stackOut_88_0 = field_S[1][1 + var7];
                    stackIn_91_0 = stackOut_88_0;
                    stackIn_89_0 = stackOut_88_0;
                    if (var4 == 0) {
                      break L24;
                    } else {
                      stackOut_89_0 = (nk) (Object) stackIn_89_0;
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if (var8_int != 0) {
                        break L24;
                      } else {
                        stackOut_90_0 = (nk) (Object) stackIn_90_0;
                        stackOut_90_1 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        stackIn_92_1 = stackOut_90_1;
                        break L23;
                      }
                    }
                  }
                  stackOut_91_0 = (nk) (Object) stackIn_91_0;
                  stackOut_91_1 = 0;
                  stackIn_92_0 = stackOut_91_0;
                  stackIn_92_1 = stackOut_91_1;
                  break L23;
                }
                stackIn_92_0.field_lb = stackIn_92_1 != 0;
                var7++;
                continue L14;
              }
            }
          }
        }
        L25: {
          if (!param2) {
            stackOut_95_0 = 1;
            stackIn_96_0 = stackOut_95_0;
            break L25;
          } else {
            stackOut_94_0 = 0;
            stackIn_96_0 = stackOut_94_0;
            break L25;
          }
        }
        var6 = stackIn_96_0;
        L26: while (true) {
          if (3 <= var6) {
            L27: {
              if (!param2) {
                break L27;
              } else {
                if (sp.field_O > 1) {
                  var6 = 0;
                  L28: while (true) {
                    if (var6 >= sp.field_O - -1) {
                      break L27;
                    } else {
                      L29: {
                        var29 = field_S[3][var6];
                        if (var4 == 0) {
                          break L29;
                        } else {
                          if (var29.field_tb == 0) {
                            break L29;
                          } else {
                            ua.field_a = var6;
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (!var29.field_G) {
                          break L30;
                        } else {
                          if ((var6 ^ -1) < -1) {
                            L31: {
                              if (lh.field_c == null) {
                                stackOut_139_0 = null;
                                stackIn_140_0 = (String) (Object) stackOut_139_0;
                                break L31;
                              } else {
                                stackOut_138_0 = lh.field_c[var6 - 1];
                                stackIn_140_0 = stackOut_138_0;
                                break L31;
                              }
                            }
                            var8_ref = stackIn_140_0;
                            if (var8_ref == null) {
                              break L30;
                            } else {
                              ko.field_S = var8_ref;
                              break L30;
                            }
                          } else {
                            break L30;
                          }
                        }
                      }
                      L32: {
                        stackOut_142_0 = (nk) var29;
                        stackIn_144_0 = stackOut_142_0;
                        stackIn_143_0 = stackOut_142_0;
                        if (var4 == 0) {
                          stackOut_144_0 = (nk) (Object) stackIn_144_0;
                          stackOut_144_1 = 0;
                          stackIn_145_0 = stackOut_144_0;
                          stackIn_145_1 = stackOut_144_1;
                          break L32;
                        } else {
                          stackOut_143_0 = (nk) (Object) stackIn_143_0;
                          stackOut_143_1 = 1;
                          stackIn_145_0 = stackOut_143_0;
                          stackIn_145_1 = stackOut_143_1;
                          break L32;
                        }
                      }
                      L33: {
                        stackIn_145_0.field_lb = stackIn_145_1 != 0;
                        stackOut_145_0 = (nk) var29;
                        stackIn_147_0 = stackOut_145_0;
                        stackIn_146_0 = stackOut_145_0;
                        if (var6 != ua.field_a) {
                          stackOut_147_0 = (nk) (Object) stackIn_147_0;
                          stackOut_147_1 = 0;
                          stackIn_148_0 = stackOut_147_0;
                          stackIn_148_1 = stackOut_147_1;
                          break L33;
                        } else {
                          stackOut_146_0 = (nk) (Object) stackIn_146_0;
                          stackOut_146_1 = 1;
                          stackIn_148_0 = stackOut_146_0;
                          stackIn_148_1 = stackOut_146_1;
                          break L33;
                        }
                      }
                      stackIn_148_0.field_V = stackIn_148_1 != 0;
                      var6++;
                      continue L28;
                    }
                  }
                } else {
                  break L27;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L34: while (true) {
              if (ol.field_A <= var7) {
                L35: {
                  if (var5 == 0) {
                    break L35;
                  } else {
                    if (param2) {
                      break L35;
                    } else {
                      ar.a(953354214, param1);
                      break L35;
                    }
                  }
                }
                return;
              } else {
                L36: {
                  var30 = field_S[var7 + 4];
                  var8 = var30;
                  if (!param2) {
                    stackOut_153_0 = 0;
                    stackIn_154_0 = stackOut_153_0;
                    break L36;
                  } else {
                    stackOut_152_0 = -1;
                    stackIn_154_0 = stackOut_152_0;
                    break L36;
                  }
                }
                var9 = stackIn_154_0;
                L37: while (true) {
                  if (var30.length + -1 <= var9) {
                    var6 = var6 + (kr.field_c[var7] & 255);
                    var7++;
                    continue L34;
                  } else {
                    L38: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L38;
                      } else {
                        if ((var9 ^ -1) <= -1) {
                          L39: {
                            if (il.field_b == null) {
                              break L39;
                            } else {
                              if (null != il.field_b[var7]) {
                                if ((il.field_b[var7][var9] & (ob.field_L ^ -1) ^ -1) >= -1) {
                                  break L39;
                                } else {
                                  var15 = ib.a((ob.field_L ^ -1) & il.field_b[var7][var9], (byte) 79);
                                  var14 = 1;
                                  break L39;
                                }
                              } else {
                                break L39;
                              }
                            }
                          }
                          L40: {
                            if (null == sf.field_f) {
                              break L40;
                            } else {
                              if (sf.field_f[var7] == null) {
                                break L40;
                              } else {
                                if (-1 > (q.field_y ^ -1)) {
                                  break L40;
                                } else {
                                  if (sf.field_f[var7][var9]) {
                                    var10 = 1;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if (null == te.field_D) {
                              break L41;
                            } else {
                              if (te.field_D[var7] == null) {
                                break L41;
                              } else {
                                L42: {
                                  var16 = te.field_D[var7][var9];
                                  if (var16 >= -1) {
                                    break L42;
                                  } else {
                                    if (rp.field_a < var16) {
                                      var12 = 1;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L41;
                                } else {
                                  if (vb.field_g) {
                                    break L41;
                                  } else {
                                    if (-1 >= q.field_y) {
                                      var10 = 1;
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L43: {
                            if (null == qh.field_e) {
                              break L43;
                            } else {
                              if (null != qh.field_e[var7]) {
                                L44: {
                                  var16 = qh.field_e[var7][var9];
                                  if (0 == var16) {
                                    break L44;
                                  } else {
                                    if (vb.field_g) {
                                      break L44;
                                    } else {
                                      if (q.field_y > 0) {
                                        break L44;
                                      } else {
                                        var10 = 1;
                                        break L44;
                                      }
                                    }
                                  }
                                }
                                if (0 >= var16) {
                                  break L43;
                                } else {
                                  if (qn.field_w < var16) {
                                    var11 = 1;
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                              } else {
                                break L43;
                              }
                            }
                          }
                          L45: {
                            if (param2) {
                              if (null != dl.field_b) {
                                if (dl.field_b[var7] != null) {
                                  if (!dl.field_b[var7][var9]) {
                                    stackOut_200_0 = 0;
                                    stackIn_202_0 = stackOut_200_0;
                                    break L45;
                                  } else {
                                    stackOut_199_0 = 1;
                                    stackIn_202_0 = stackOut_199_0;
                                    break L45;
                                  }
                                } else {
                                  stackOut_197_0 = 0;
                                  stackIn_202_0 = stackOut_197_0;
                                  break L45;
                                }
                              } else {
                                stackOut_195_0 = 0;
                                stackIn_202_0 = stackOut_195_0;
                                break L45;
                              }
                            } else {
                              stackOut_193_0 = 0;
                              stackIn_202_0 = stackOut_193_0;
                              break L45;
                            }
                          }
                          var13 = stackIn_202_0;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L46: {
                      if (2 > fn.field_z) {
                        break L46;
                      } else {
                        if (!cr.field_eb[12]) {
                          break L46;
                        } else {
                          var13 = 0;
                          var14 = 0;
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          break L46;
                        }
                      }
                    }
                    L47: {
                      gd.field_r = true;
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_216_0 = 1;
                                stackIn_218_0 = stackOut_216_0;
                                break L47;
                              } else {
                                stackOut_215_0 = 0;
                                stackIn_218_0 = stackOut_215_0;
                                break L47;
                              }
                            } else {
                              stackOut_213_0 = 1;
                              stackIn_218_0 = stackOut_213_0;
                              break L47;
                            }
                          } else {
                            stackOut_211_0 = 1;
                            stackIn_218_0 = stackOut_211_0;
                            break L47;
                          }
                        } else {
                          stackOut_209_0 = 1;
                          stackIn_218_0 = stackOut_209_0;
                          break L47;
                        }
                      } else {
                        stackOut_207_0 = 1;
                        stackIn_218_0 = stackOut_207_0;
                        break L47;
                      }
                    }
                    L48: {
                      var16 = stackIn_218_0;
                      if (var16 != 0) {
                        break L48;
                      } else {
                        if (var9 < 0) {
                          break L48;
                        } else {
                          if (gr.field_W == null) {
                            break L48;
                          } else {
                            L49: {
                              if (!param2) {
                                break L49;
                              } else {
                                if (qn.field_q) {
                                  break L48;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            L50: {
                              ng.field_a = false;
                              if (null != e.field_c) {
                                break L50;
                              } else {
                                mn.field_t = new boolean[ol.field_A];
                                e.field_c = new byte[ol.field_A];
                                break L50;
                              }
                            }
                            gd.field_r = false;
                            var17_int = 0;
                            L51: while (true) {
                              if (var17_int >= var7) {
                                L52: {
                                  uq.a(param3, var7, 20473, 0, -1, var9, -1, param2);
                                  if (fn.field_z < 2) {
                                    break L52;
                                  } else {
                                    if (!cr.field_eb[12]) {
                                      break L52;
                                    } else {
                                      gd.field_r = true;
                                      break L52;
                                    }
                                  }
                                }
                                if (gd.field_r) {
                                  break L48;
                                } else {
                                  var16 = 1;
                                  break L48;
                                }
                              } else {
                                mn.field_t[var17_int] = false;
                                var17_int++;
                                continue L51;
                              }
                            }
                          }
                        }
                      }
                    }
                    L53: {
                      var17 = var8[var9 + 1];
                      if (var4 == 0) {
                        if (!param2) {
                          break L53;
                        } else {
                          dj.field_a[(var6 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6 + var9) / 8], 1 << b.a(7, var6 + var9) ^ -1);
                          break L53;
                        }
                      } else {
                        if (!param2) {
                          break L53;
                        } else {
                          if (var16 == 0) {
                            break L53;
                          } else {
                            dj.field_a[(var6 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6 + var9) / 8], 1 << b.a(7, var6 + var9) ^ -1);
                            break L53;
                          }
                        }
                      }
                    }
                    L54: {
                      if ((var9 ^ -1) > -1) {
                        break L54;
                      } else {
                        if (var17.field_G) {
                          L55: {
                            if (null != rf.field_m) {
                              if (rf.field_m[var7] != null) {
                                var18_ref_String = rf.field_m[var7][var9];
                                break L55;
                              } else {
                                var18_ref_String = null;
                                break L55;
                              }
                            } else {
                              var18_ref_String = null;
                              break L55;
                            }
                          }
                          L56: {
                            if (an.field_f == null) {
                              var19 = null;
                              break L56;
                            } else {
                              if (null != an.field_f[var7]) {
                                var19_ref = an.field_f[var7][var9];
                                break L56;
                              } else {
                                var19_ref = null;
                                break L56;
                              }
                            }
                          }
                          L57: {
                            var20 = null;
                            if (var19 == null) {
                              break L57;
                            } else {
                              if (!((String) var19).equals((Object) (Object) var18_ref_String)) {
                                var20 = (String) var19;
                                break L57;
                              } else {
                                break L57;
                              }
                            }
                          }
                          L58: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L59: {
                                  if (var11 != 0) {
                                    var22_int = qh.field_e[var7][var9] - qn.field_w;
                                    if (var22_int == 1) {
                                      var21 = jm.field_D;
                                      break L59;
                                    } else {
                                      var21 = Vertigo2.a(new String[1], kk.field_h, 53);
                                      break L59;
                                    }
                                  } else {
                                    break L59;
                                  }
                                }
                                L60: {
                                  if (var12 != 0) {
                                    var31 = Vertigo2.a(new String[2], mf.field_a, -120);
                                    var21 = var31;
                                    var21 = var31;
                                    if (var21 == null) {
                                      var21 = var31;
                                      break L60;
                                    } else {
                                      var21 = var21 + "<br>" + var31;
                                      break L60;
                                    }
                                  } else {
                                    break L60;
                                  }
                                }
                                if (var14 != 0) {
                                  L61: {
                                    var22 = ld.field_c;
                                    if (0 >= var15) {
                                      break L61;
                                    } else {
                                      if (null == ck.field_H) {
                                        break L61;
                                      } else {
                                        if (var15 > ck.field_H.length) {
                                          break L61;
                                        } else {
                                          if (ck.field_H[var15 + -1] != null) {
                                            var22_ref = ck.field_H[var15 + -1][0];
                                            break L61;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = var22_ref;
                                    break L58;
                                  } else {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L58;
                                  }
                                } else {
                                  break L58;
                                }
                              } else {
                                var21 = tr.field_d;
                                break L58;
                              }
                            } else {
                              var21 = le.field_b;
                              break L58;
                            }
                          }
                          L62: {
                            if (var4 == 0) {
                              break L62;
                            } else {
                              if (!gd.field_r) {
                                L63: {
                                  var22_ref = null;
                                  if (ng.field_a) {
                                    var22 = "</col>" + rq.field_v + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L64: while (true) {
                                  if (var24 >= var7) {
                                    if (var23 != 0) {
                                      var21 = qc.field_u + var22;
                                      break L62;
                                    } else {
                                      var21 = Vertigo2.a(new String[1], ir.field_b, -124);
                                      break L62;
                                    }
                                  } else {
                                    if (mn.field_t[var24]) {
                                      var25 = "</col>" + md.field_C[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 != null) {
                                        var22 = var22 + ", " + var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var23 = 1;
                                        var24++;
                                        continue L64;
                                      } else {
                                        var22 = var25;
                                        var24++;
                                        continue L64;
                                      }
                                    } else {
                                      var24++;
                                      continue L64;
                                    }
                                  }
                                }
                              } else {
                                break L62;
                              }
                            }
                          }
                          L65: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = uj.a("<br>", "<br><col=A00000>", 0, var32);
                              if (var20 == null) {
                                var20 = var33;
                                break L65;
                              } else {
                                var20 = var20 + "<br>" + var33;
                                break L65;
                              }
                            } else {
                              break L65;
                            }
                          }
                          if (var20 == null) {
                            break L54;
                          } else {
                            ko.field_S = var20;
                            break L54;
                          }
                        } else {
                          break L54;
                        }
                      }
                    }
                    L66: {
                      if (!param2) {
                        L67: {
                          L68: {
                            stackOut_318_0 = (nk) var17;
                            stackIn_321_0 = stackOut_318_0;
                            stackIn_319_0 = stackOut_318_0;
                            if (!gd.field_r) {
                              break L68;
                            } else {
                              stackOut_319_0 = (nk) (Object) stackIn_319_0;
                              stackIn_321_0 = stackOut_319_0;
                              stackIn_320_0 = stackOut_319_0;
                              if (param3.field_fc[var7] != (byte)var9) {
                                break L68;
                              } else {
                                stackOut_320_0 = (nk) (Object) stackIn_320_0;
                                stackOut_320_1 = 1;
                                stackIn_322_0 = stackOut_320_0;
                                stackIn_322_1 = stackOut_320_1;
                                break L67;
                              }
                            }
                          }
                          stackOut_321_0 = (nk) (Object) stackIn_321_0;
                          stackOut_321_1 = 0;
                          stackIn_322_0 = stackOut_321_0;
                          stackIn_322_1 = stackOut_321_1;
                          break L67;
                        }
                        stackIn_322_0.field_V = stackIn_322_1 != 0;
                        break L66;
                      } else {
                        if (-1 != var9) {
                          L69: {
                            stackOut_314_0 = (nk) var17;
                            stackIn_316_0 = stackOut_314_0;
                            stackIn_315_0 = stackOut_314_0;
                            if ((dj.field_a[(var9 + var6) / 8] & 1 << (7 & var6 - -var9)) == 0) {
                              stackOut_316_0 = (nk) (Object) stackIn_316_0;
                              stackOut_316_1 = 0;
                              stackIn_317_0 = stackOut_316_0;
                              stackIn_317_1 = stackOut_316_1;
                              break L69;
                            } else {
                              stackOut_315_0 = (nk) (Object) stackIn_315_0;
                              stackOut_315_1 = 1;
                              stackIn_317_0 = stackOut_315_0;
                              stackIn_317_1 = stackOut_315_1;
                              break L69;
                            }
                          }
                          stackIn_317_0.field_V = stackIn_317_1 != 0;
                          break L66;
                        } else {
                          var17.field_V = true;
                          var27 = var6;
                          var18 = var27;
                          L70: while (true) {
                            if (var27 >= var30.length + var6 - 1) {
                              break L66;
                            } else {
                              L71: {
                                stackOut_310_0 = (nk) var17;
                                stackOut_310_1 = var17.field_V;
                                stackIn_312_0 = stackOut_310_0;
                                stackIn_312_1 = stackOut_310_1;
                                stackIn_311_0 = stackOut_310_0;
                                stackIn_311_1 = stackOut_310_1;
                                if (-1 != (dj.field_a[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                  stackOut_312_0 = (nk) (Object) stackIn_312_0;
                                  stackOut_312_1 = stackIn_312_1;
                                  stackOut_312_2 = 0;
                                  stackIn_313_0 = stackOut_312_0;
                                  stackIn_313_1 = stackOut_312_1;
                                  stackIn_313_2 = stackOut_312_2;
                                  break L71;
                                } else {
                                  stackOut_311_0 = (nk) (Object) stackIn_311_0;
                                  stackOut_311_1 = stackIn_311_1;
                                  stackOut_311_2 = 1;
                                  stackIn_313_0 = stackOut_311_0;
                                  stackIn_313_1 = stackOut_311_1;
                                  stackIn_313_2 = stackOut_311_2;
                                  break L71;
                                }
                              }
                              stackIn_313_0.field_V = stackIn_313_1 & stackIn_313_2 != 0;
                              var27++;
                              continue L70;
                            }
                          }
                        }
                      }
                    }
                    L72: {
                      L73: {
                        stackOut_323_0 = (nk) var17;
                        stackIn_326_0 = stackOut_323_0;
                        stackIn_324_0 = stackOut_323_0;
                        if (var4 == 0) {
                          break L73;
                        } else {
                          stackOut_324_0 = (nk) (Object) stackIn_324_0;
                          stackIn_326_0 = stackOut_324_0;
                          stackIn_325_0 = stackOut_324_0;
                          if (var16 != 0) {
                            break L73;
                          } else {
                            stackOut_325_0 = (nk) (Object) stackIn_325_0;
                            stackOut_325_1 = 1;
                            stackIn_327_0 = stackOut_325_0;
                            stackIn_327_1 = stackOut_325_1;
                            break L72;
                          }
                        }
                      }
                      stackOut_326_0 = (nk) (Object) stackIn_326_0;
                      stackOut_326_1 = 0;
                      stackIn_327_0 = stackOut_326_0;
                      stackIn_327_1 = stackOut_326_1;
                      break L72;
                    }
                    stackIn_327_0.field_lb = stackIn_327_1 != 0;
                    var9++;
                    continue L37;
                  }
                }
              }
            }
          } else {
            L74: {
              var28 = field_S[2][var6];
              if (var4 == 0) {
                break L74;
              } else {
                if (0 != var28.field_tb) {
                  if (!param2) {
                    if (param3.field_xc != var6) {
                      param3.field_xc = var6;
                      var5 = 1;
                      break L74;
                    } else {
                      break L74;
                    }
                  } else {
                    if (var6 != 0) {
                      kg.field_y = kg.field_y ^ var6;
                      break L74;
                    } else {
                      kg.field_y = 0;
                      break L74;
                    }
                  }
                } else {
                  break L74;
                }
              }
            }
            L75: {
              if (!param2) {
                L76: {
                  stackOut_118_0 = (nk) var28;
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_119_0 = stackOut_118_0;
                  if (0 == (param3.field_xc & var6)) {
                    stackOut_120_0 = (nk) (Object) stackIn_120_0;
                    stackOut_120_1 = 0;
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    break L76;
                  } else {
                    stackOut_119_0 = (nk) (Object) stackIn_119_0;
                    stackOut_119_1 = 1;
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_121_1 = stackOut_119_1;
                    break L76;
                  }
                }
                stackIn_121_0.field_V = stackIn_121_1 != 0;
                break L75;
              } else {
                if (var6 != -1) {
                  L77: {
                    stackOut_114_0 = (nk) var28;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_115_0 = stackOut_114_0;
                    if ((var6 & kg.field_y) == 0) {
                      stackOut_116_0 = (nk) (Object) stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L77;
                    } else {
                      stackOut_115_0 = (nk) (Object) stackIn_115_0;
                      stackOut_115_1 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      stackIn_117_1 = stackOut_115_1;
                      break L77;
                    }
                  }
                  stackIn_117_0.field_V = stackIn_117_1 != 0;
                  break L75;
                } else {
                  L78: {
                    stackOut_110_0 = (nk) var28;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_111_0 = stackOut_110_0;
                    if (-1 != kg.field_y) {
                      stackOut_112_0 = (nk) (Object) stackIn_112_0;
                      stackOut_112_1 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      break L78;
                    } else {
                      stackOut_111_0 = (nk) (Object) stackIn_111_0;
                      stackOut_111_1 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      break L78;
                    }
                  }
                  stackIn_113_0.field_V = stackIn_113_1 != 0;
                  break L75;
                }
              }
            }
            L79: {
              stackOut_122_0 = (nk) var28;
              stackIn_124_0 = stackOut_122_0;
              stackIn_123_0 = stackOut_122_0;
              if (var4 == 0) {
                stackOut_124_0 = (nk) (Object) stackIn_124_0;
                stackOut_124_1 = 0;
                stackIn_125_0 = stackOut_124_0;
                stackIn_125_1 = stackOut_124_1;
                break L79;
              } else {
                stackOut_123_0 = (nk) (Object) stackIn_123_0;
                stackOut_123_1 = 1;
                stackIn_125_0 = stackOut_123_0;
                stackIn_125_1 = stackOut_123_1;
                break L79;
              }
            }
            stackIn_125_0.field_lb = stackIn_125_1 != 0;
            var6++;
            continue L26;
          }
        }
    }

    public static void h(int param0) {
        field_L = null;
        field_G = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_S = null;
        field_N = null;
        if (param0 != 2) {
            Object var2 = null;
            mg.a(true, 49, false, (uh) null);
        }
        field_T = null;
    }

    final String a(boolean param0) {
        int var2 = ((mg) this).field_C.field_p ? 1 : 0;
        ((mg) this).field_C.field_p = ((mg) this).field_p;
        String var3 = ((mg) this).field_C.a(param0);
        ((mg) this).field_C.field_p = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[8192];
        field_N = new nj();
        field_T = "Cancel draw";
        field_G = "The following settings need to be changed:  ";
        field_L = "Breaking real-world laws";
    }
}
