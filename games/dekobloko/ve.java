/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends w {
    int field_Ub;
    String field_Vb;
    w field_Tb;
    w field_Ec;
    static ck[][] field_uc;
    static String field_Gc;
    boolean field_Cc;
    static int[] field_ic;
    static int field_hc;
    boolean field_Zb;
    int field_mc;
    w field_Pb;
    long field_tc;
    w field_ec;
    int field_Nb;
    w field_yc;
    w field_bc;
    boolean field_wc;
    int field_Wb;
    w field_Sb;
    w field_Fc;
    static boolean field_Qb;
    static boolean field_Hc;
    int field_rc;
    boolean field_lc;
    w field_jc;
    w field_pc;
    boolean field_gc;
    boolean field_Ob;
    static w field_vc;
    String[] field_xc;
    w field_Yb;
    int field_oc;
    w field_Bc;
    w field_zc;
    w field_Ac;
    static String field_cc;
    static boolean field_ac;
    boolean field_Ic;
    w[] field_fc;
    w field_Dc;
    int field_qc;
    long field_Xb;
    static ck field_dc;
    int field_Rb;
    byte[] field_kc;
    w field_sc;
    static int field_nc;

    public static void h(byte param0) {
        field_uc = null;
        if (param0 != 116) {
          boolean discarded$2 = ve.g((byte) 54);
          field_cc = null;
          field_Gc = null;
          field_vc = null;
          field_dc = null;
          field_ic = null;
          return;
        } else {
          field_cc = null;
          field_Gc = null;
          field_vc = null;
          field_dc = null;
          field_ic = null;
          return;
        }
    }

    final static boolean g(byte param0) {
        int var1 = 0;
        var1 = -89 % ((76 - param0) / 36);
        if (vh.field_h != null) {
          if (!vh.field_h.f(261)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean i(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 98) {
          L0: {
            boolean discarded$8 = ve.g((byte) 106);
            if (((ve) this).d((byte) -68)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ve) this).d((byte) -68)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int e(int param0) {
        int var2 = 113 / ((param0 - 24) / 54);
        return (int)((ve) this).c((byte) 57);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = client.field_A ? 1 : 0;
        if (param6 == 9) {
          param5--;
          L0: while (true) {
            if (param5 >= 0) {
              var19 = param7;
              var17 = var19;
              var10 = var17;
              var11 = param1;
              var12 = param4;
              var13 = param0;
              var14 = param8;
              var15 = 8355711 & var19[var11] >> -852264639;
              var10[var11] = var15 + lb.a(65280, var13 >> -1295343735) + (lb.a(var12 >> 1494704929, 16711680) + lb.a(var14 >> 200866833, 255));
              param4 = param4 + param3;
              param1++;
              param8 = param8 + param9;
              param0 = param0 + param2;
              param5--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          ve.h((byte) 90);
          param5--;
          L1: while (true) {
            if (param5 >= 0) {
              var18 = param7;
              var17 = var18;
              var10 = var17;
              var11 = param1;
              var12 = param4;
              var13 = param0;
              var14 = param8;
              var15 = 8355711 & var18[var11] >> -852264639;
              var10[var11] = var15 + lb.a(65280, var13 >> -1295343735) + (lb.a(var12 >> 1494704929, 16711680) + lb.a(var14 >> 200866833, 255));
              param4 = param4 + param3;
              param1++;
              param8 = param8 + param9;
              param0 = param0 + param2;
              param5--;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    ve(int param0) {
        super(0L, (w) null);
        ((ve) this).field_kc = new byte[param0];
    }

    final static String c(int param0, int param1) {
        if (param1 != 26135) {
          return null;
        } else {
          return param0 + 1 + "/" + 4;
        }
    }

    final boolean a(ve param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        boolean stackIn_30_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_32_0 = false;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_86_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackIn_89_0 = false;
        boolean stackIn_90_0 = false;
        int stackIn_90_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_124_0 = 0;
        boolean stackIn_129_0 = false;
        boolean stackIn_130_0 = false;
        boolean stackIn_131_0 = false;
        int stackIn_131_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_197_0 = 0;
        boolean stackIn_199_0 = false;
        boolean stackIn_200_0 = false;
        boolean stackIn_201_0 = false;
        int stackIn_201_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_257_0 = 0;
        boolean stackIn_260_0 = false;
        boolean stackIn_261_0 = false;
        boolean stackIn_262_0 = false;
        int stackIn_262_1 = 0;
        int stackIn_267_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_327_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_31_0 = false;
        int stackOut_31_1 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        boolean stackOut_87_0 = false;
        boolean stackOut_89_0 = false;
        int stackOut_89_1 = 0;
        boolean stackOut_88_0 = false;
        int stackOut_88_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        boolean stackOut_259_0 = false;
        boolean stackOut_261_0 = false;
        int stackOut_261_1 = 0;
        boolean stackOut_260_0 = false;
        int stackOut_260_1 = 0;
        int stackOut_266_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_282_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_276_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_308_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_270_0 = 0;
        boolean stackOut_198_0 = false;
        boolean stackOut_200_0 = false;
        int stackOut_200_1 = 0;
        boolean stackOut_199_0 = false;
        int stackOut_199_1 = 0;
        int stackOut_205_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        boolean stackOut_128_0 = false;
        boolean stackOut_130_0 = false;
        int stackOut_130_1 = 0;
        boolean stackOut_129_0 = false;
        int stackOut_129_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        if (!param1) {
          L0: {
            if (!((ve) this).field_Zb) {
              if ((((ve) this).field_oc ^ -1) == -7) {
                L1: {
                  var3 = 1;
                  if (!param0.field_Zb) {
                    if ((param0.field_oc ^ -1) == -7) {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L1;
                    }
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_12_0 = stackOut_7_0;
                    break L1;
                  }
                }
                var4 = stackIn_12_0;
                if (var4 != var3) {
                  return var3 != 0;
                } else {
                  L2: {
                    if (var3 == 0) {
                      L3: {
                        if (param0.field_gc) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L3;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L3;
                        }
                      }
                      if (stackIn_20_0 != (((ve) this).field_gc ? 1 : 0)) {
                        if (!((ve) this).field_gc) {
                          break L2;
                        } else {
                          if (param0.field_Wb != ((ve) this).field_Wb) {
                            L4: {
                              if (((ve) this).field_Wb >= param0.field_Wb) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                break L4;
                              } else {
                                stackOut_26_0 = 1;
                                stackIn_28_0 = stackOut_26_0;
                                break L4;
                              }
                            }
                            return stackIn_28_0 != 0;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        return ((ve) this).field_gc;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    stackOut_29_0 = ((ve) this).field_lc;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (param0.field_lc) {
                      stackOut_31_0 = stackIn_31_0;
                      stackOut_31_1 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L5;
                    } else {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L5;
                    }
                  }
                  if ((stackIn_32_0 ? 1 : 0) == stackIn_32_1) {
                    L6: {
                      if (((ve) this).field_lc) {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        break L6;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L6;
                      }
                    }
                    return stackIn_37_0 != 0;
                  } else {
                    if (((ve) this).field_lc) {
                      L7: {
                        if (!((ve) this).field_wc) {
                          if ((((ve) this).field_qc ^ -1) == -3) {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L7;
                          } else {
                            stackOut_46_0 = 0;
                            stackIn_49_0 = stackOut_46_0;
                            break L7;
                          }
                        } else {
                          stackOut_44_0 = 1;
                          stackIn_49_0 = stackOut_44_0;
                          break L7;
                        }
                      }
                      L8: {
                        var5 = stackIn_49_0;
                        if (param0.field_wc) {
                          stackOut_53_0 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          break L8;
                        } else {
                          if (param0.field_qc == 2) {
                            stackOut_52_0 = 1;
                            stackIn_55_0 = stackOut_52_0;
                            break L8;
                          } else {
                            stackOut_51_0 = 0;
                            stackIn_55_0 = stackOut_51_0;
                            break L8;
                          }
                        }
                      }
                      L9: {
                        var6 = stackIn_55_0;
                        if (var5 != 0) {
                          stackOut_57_0 = 0;
                          stackIn_58_0 = stackOut_57_0;
                          break L9;
                        } else {
                          stackOut_56_0 = 1;
                          stackIn_58_0 = stackOut_56_0;
                          break L9;
                        }
                      }
                      if (stackIn_58_0 == var6) {
                        return var5 != 0;
                      } else {
                        L10: {
                          if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                            stackOut_63_0 = 0;
                            stackIn_64_0 = stackOut_63_0;
                            break L10;
                          } else {
                            stackOut_62_0 = 1;
                            stackIn_64_0 = stackOut_62_0;
                            break L10;
                          }
                        }
                        return stackIn_64_0 != 0;
                      }
                    } else {
                      L11: {
                        if (param0.field_tc <= ((ve) this).field_tc) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L11;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L11;
                        }
                      }
                      return stackIn_42_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_66_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_66_0 = stackOut_3_0;
              break L0;
            }
          }
          L12: {
            var3 = stackIn_66_0;
            if (!param0.field_Zb) {
              if ((param0.field_oc ^ -1) == -7) {
                var4 = 1;
                if (var4 != var3) {
                  return var3 != 0;
                } else {
                  L13: {
                    if (var3 == 0) {
                      L14: {
                        if (param0.field_gc) {
                          stackOut_77_0 = 0;
                          stackIn_78_0 = stackOut_77_0;
                          break L14;
                        } else {
                          stackOut_76_0 = 1;
                          stackIn_78_0 = stackOut_76_0;
                          break L14;
                        }
                      }
                      if (stackIn_78_0 != (((ve) this).field_gc ? 1 : 0)) {
                        if (!((ve) this).field_gc) {
                          break L13;
                        } else {
                          if (param0.field_Wb != ((ve) this).field_Wb) {
                            L15: {
                              if (((ve) this).field_Wb >= param0.field_Wb) {
                                stackOut_85_0 = 0;
                                stackIn_86_0 = stackOut_85_0;
                                break L15;
                              } else {
                                stackOut_84_0 = 1;
                                stackIn_86_0 = stackOut_84_0;
                                break L15;
                              }
                            }
                            return stackIn_86_0 != 0;
                          } else {
                            break L13;
                          }
                        }
                      } else {
                        return ((ve) this).field_gc;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L16: {
                    stackOut_87_0 = ((ve) this).field_lc;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_88_0 = stackOut_87_0;
                    if (param0.field_lc) {
                      stackOut_89_0 = stackIn_89_0;
                      stackOut_89_1 = 0;
                      stackIn_90_0 = stackOut_89_0;
                      stackIn_90_1 = stackOut_89_1;
                      break L16;
                    } else {
                      stackOut_88_0 = stackIn_88_0;
                      stackOut_88_1 = 1;
                      stackIn_90_0 = stackOut_88_0;
                      stackIn_90_1 = stackOut_88_1;
                      break L16;
                    }
                  }
                  if ((stackIn_90_0 ? 1 : 0) == stackIn_90_1) {
                    L17: {
                      if (((ve) this).field_lc) {
                        stackOut_94_0 = 0;
                        stackIn_95_0 = stackOut_94_0;
                        break L17;
                      } else {
                        stackOut_93_0 = 1;
                        stackIn_95_0 = stackOut_93_0;
                        break L17;
                      }
                    }
                    return stackIn_95_0 != 0;
                  } else {
                    if (((ve) this).field_lc) {
                      L18: {
                        if (((ve) this).field_wc) {
                          stackOut_105_0 = 1;
                          stackIn_107_0 = stackOut_105_0;
                          break L18;
                        } else {
                          if ((((ve) this).field_qc ^ -1) == -3) {
                            stackOut_104_0 = 1;
                            stackIn_107_0 = stackOut_104_0;
                            break L18;
                          } else {
                            stackOut_103_0 = 0;
                            stackIn_107_0 = stackOut_103_0;
                            break L18;
                          }
                        }
                      }
                      L19: {
                        var5 = stackIn_107_0;
                        if (!param0.field_wc) {
                          if (param0.field_qc == 2) {
                            stackOut_111_0 = 1;
                            stackIn_113_0 = stackOut_111_0;
                            break L19;
                          } else {
                            stackOut_110_0 = 0;
                            stackIn_113_0 = stackOut_110_0;
                            break L19;
                          }
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_113_0 = stackOut_108_0;
                          break L19;
                        }
                      }
                      L20: {
                        var6 = stackIn_113_0;
                        if (var5 != 0) {
                          stackOut_115_0 = 0;
                          stackIn_116_0 = stackOut_115_0;
                          break L20;
                        } else {
                          stackOut_114_0 = 1;
                          stackIn_116_0 = stackOut_114_0;
                          break L20;
                        }
                      }
                      if (stackIn_116_0 == var6) {
                        return var5 != 0;
                      } else {
                        L21: {
                          if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                            stackOut_121_0 = 0;
                            stackIn_122_0 = stackOut_121_0;
                            break L21;
                          } else {
                            stackOut_120_0 = 1;
                            stackIn_122_0 = stackOut_120_0;
                            break L21;
                          }
                        }
                        return stackIn_122_0 != 0;
                      }
                    } else {
                      L22: {
                        if (param0.field_tc <= ((ve) this).field_tc) {
                          stackOut_99_0 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          break L22;
                        } else {
                          stackOut_98_0 = 1;
                          stackIn_100_0 = stackOut_98_0;
                          break L22;
                        }
                      }
                      return stackIn_100_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_69_0 = 0;
                stackIn_124_0 = stackOut_69_0;
                break L12;
              }
            } else {
              stackOut_67_0 = 1;
              stackIn_124_0 = stackOut_67_0;
              break L12;
            }
          }
          var4 = stackIn_124_0;
          if (var4 != var3) {
            return var3 != 0;
          } else {
            if (var3 == 0) {
              L23: {
                if (param0.field_gc) {
                  stackOut_189_0 = 0;
                  stackIn_190_0 = stackOut_189_0;
                  break L23;
                } else {
                  stackOut_188_0 = 1;
                  stackIn_190_0 = stackOut_188_0;
                  break L23;
                }
              }
              if (stackIn_190_0 != (((ve) this).field_gc ? 1 : 0)) {
                if (!((ve) this).field_gc) {
                  L24: {
                    stackOut_259_0 = ((ve) this).field_lc;
                    stackIn_261_0 = stackOut_259_0;
                    stackIn_260_0 = stackOut_259_0;
                    if (param0.field_lc) {
                      stackOut_261_0 = stackIn_261_0;
                      stackOut_261_1 = 0;
                      stackIn_262_0 = stackOut_261_0;
                      stackIn_262_1 = stackOut_261_1;
                      break L24;
                    } else {
                      stackOut_260_0 = stackIn_260_0;
                      stackOut_260_1 = 1;
                      stackIn_262_0 = stackOut_260_0;
                      stackIn_262_1 = stackOut_260_1;
                      break L24;
                    }
                  }
                  if ((stackIn_262_0 ? 1 : 0) == stackIn_262_1) {
                    L25: {
                      if (((ve) this).field_lc) {
                        stackOut_266_0 = 0;
                        stackIn_267_0 = stackOut_266_0;
                        break L25;
                      } else {
                        stackOut_265_0 = 1;
                        stackIn_267_0 = stackOut_265_0;
                        break L25;
                      }
                    }
                    return stackIn_267_0 != 0;
                  } else {
                    if (((ve) this).field_lc) {
                      L26: {
                        if (!((ve) this).field_wc) {
                          if ((((ve) this).field_qc ^ -1) == -3) {
                            L27: {
                              var5 = 1;
                              if (!param0.field_wc) {
                                if (param0.field_qc == 2) {
                                  L28: {
                                    var6 = 1;
                                    if (var5 != 0) {
                                      stackOut_283_0 = 0;
                                      stackIn_284_0 = stackOut_283_0;
                                      break L28;
                                    } else {
                                      stackOut_282_0 = 1;
                                      stackIn_284_0 = stackOut_282_0;
                                      break L28;
                                    }
                                  }
                                  if (stackIn_284_0 == var6) {
                                    return var5 != 0;
                                  } else {
                                    L29: {
                                      if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                                        stackOut_289_0 = 0;
                                        stackIn_290_0 = stackOut_289_0;
                                        break L29;
                                      } else {
                                        stackOut_288_0 = 1;
                                        stackIn_290_0 = stackOut_288_0;
                                        break L29;
                                      }
                                    }
                                    return stackIn_290_0 != 0;
                                  }
                                } else {
                                  stackOut_280_0 = 0;
                                  stackIn_292_0 = stackOut_280_0;
                                  break L27;
                                }
                              } else {
                                stackOut_278_0 = 1;
                                stackIn_292_0 = stackOut_278_0;
                                break L27;
                              }
                            }
                            L30: {
                              var6 = stackIn_292_0;
                              if (var5 != 0) {
                                stackOut_294_0 = 0;
                                stackIn_295_0 = stackOut_294_0;
                                break L30;
                              } else {
                                stackOut_293_0 = 1;
                                stackIn_295_0 = stackOut_293_0;
                                break L30;
                              }
                            }
                            if (stackIn_295_0 == var6) {
                              return var5 != 0;
                            } else {
                              L31: {
                                if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                                  stackOut_300_0 = 0;
                                  stackIn_301_0 = stackOut_300_0;
                                  break L31;
                                } else {
                                  stackOut_299_0 = 1;
                                  stackIn_301_0 = stackOut_299_0;
                                  break L31;
                                }
                              }
                              return stackIn_301_0 != 0;
                            }
                          } else {
                            stackOut_276_0 = 0;
                            stackIn_303_0 = stackOut_276_0;
                            break L26;
                          }
                        } else {
                          stackOut_274_0 = 1;
                          stackIn_303_0 = stackOut_274_0;
                          break L26;
                        }
                      }
                      L32: {
                        var5 = stackIn_303_0;
                        if (!param0.field_wc) {
                          if (param0.field_qc == 2) {
                            L33: {
                              var6 = 1;
                              if (var5 != 0) {
                                stackOut_309_0 = 0;
                                stackIn_310_0 = stackOut_309_0;
                                break L33;
                              } else {
                                stackOut_308_0 = 1;
                                stackIn_310_0 = stackOut_308_0;
                                break L33;
                              }
                            }
                            if (stackIn_310_0 == var6) {
                              return var5 != 0;
                            } else {
                              L34: {
                                if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                                  stackOut_315_0 = 0;
                                  stackIn_316_0 = stackOut_315_0;
                                  break L34;
                                } else {
                                  stackOut_314_0 = 1;
                                  stackIn_316_0 = stackOut_314_0;
                                  break L34;
                                }
                              }
                              return stackIn_316_0 != 0;
                            }
                          } else {
                            stackOut_306_0 = 0;
                            stackIn_318_0 = stackOut_306_0;
                            break L32;
                          }
                        } else {
                          stackOut_304_0 = 1;
                          stackIn_318_0 = stackOut_304_0;
                          break L32;
                        }
                      }
                      L35: {
                        var6 = stackIn_318_0;
                        if (var5 != 0) {
                          stackOut_320_0 = 0;
                          stackIn_321_0 = stackOut_320_0;
                          break L35;
                        } else {
                          stackOut_319_0 = 1;
                          stackIn_321_0 = stackOut_319_0;
                          break L35;
                        }
                      }
                      if (stackIn_321_0 == var6) {
                        return var5 != 0;
                      } else {
                        L36: {
                          if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                            stackOut_326_0 = 0;
                            stackIn_327_0 = stackOut_326_0;
                            break L36;
                          } else {
                            stackOut_325_0 = 1;
                            stackIn_327_0 = stackOut_325_0;
                            break L36;
                          }
                        }
                        return stackIn_327_0 != 0;
                      }
                    } else {
                      L37: {
                        if (param0.field_tc <= ((ve) this).field_tc) {
                          stackOut_271_0 = 0;
                          stackIn_272_0 = stackOut_271_0;
                          break L37;
                        } else {
                          stackOut_270_0 = 1;
                          stackIn_272_0 = stackOut_270_0;
                          break L37;
                        }
                      }
                      return stackIn_272_0 != 0;
                    }
                  }
                } else {
                  if (param0.field_Wb == ((ve) this).field_Wb) {
                    L38: {
                      stackOut_198_0 = ((ve) this).field_lc;
                      stackIn_200_0 = stackOut_198_0;
                      stackIn_199_0 = stackOut_198_0;
                      if (param0.field_lc) {
                        stackOut_200_0 = stackIn_200_0;
                        stackOut_200_1 = 0;
                        stackIn_201_0 = stackOut_200_0;
                        stackIn_201_1 = stackOut_200_1;
                        break L38;
                      } else {
                        stackOut_199_0 = stackIn_199_0;
                        stackOut_199_1 = 1;
                        stackIn_201_0 = stackOut_199_0;
                        stackIn_201_1 = stackOut_199_1;
                        break L38;
                      }
                    }
                    if ((stackIn_201_0 ? 1 : 0) == stackIn_201_1) {
                      L39: {
                        if (((ve) this).field_lc) {
                          stackOut_205_0 = 0;
                          stackIn_206_0 = stackOut_205_0;
                          break L39;
                        } else {
                          stackOut_204_0 = 1;
                          stackIn_206_0 = stackOut_204_0;
                          break L39;
                        }
                      }
                      return stackIn_206_0 != 0;
                    } else {
                      if (((ve) this).field_lc) {
                        L40: {
                          if (((ve) this).field_wc) {
                            stackOut_231_0 = 1;
                            stackIn_233_0 = stackOut_231_0;
                            break L40;
                          } else {
                            if ((((ve) this).field_qc ^ -1) == -3) {
                              L41: {
                                var5 = 1;
                                if (!param0.field_wc) {
                                  if (param0.field_qc == 2) {
                                    stackOut_219_0 = 1;
                                    stackIn_221_0 = stackOut_219_0;
                                    break L41;
                                  } else {
                                    stackOut_218_0 = 0;
                                    stackIn_221_0 = stackOut_218_0;
                                    break L41;
                                  }
                                } else {
                                  stackOut_216_0 = 1;
                                  stackIn_221_0 = stackOut_216_0;
                                  break L41;
                                }
                              }
                              L42: {
                                var6 = stackIn_221_0;
                                if (var5 != 0) {
                                  stackOut_223_0 = 0;
                                  stackIn_224_0 = stackOut_223_0;
                                  break L42;
                                } else {
                                  stackOut_222_0 = 1;
                                  stackIn_224_0 = stackOut_222_0;
                                  break L42;
                                }
                              }
                              if (stackIn_224_0 == var6) {
                                return var5 != 0;
                              } else {
                                L43: {
                                  if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                                    stackOut_229_0 = 0;
                                    stackIn_230_0 = stackOut_229_0;
                                    break L43;
                                  } else {
                                    stackOut_228_0 = 1;
                                    stackIn_230_0 = stackOut_228_0;
                                    break L43;
                                  }
                                }
                                return stackIn_230_0 != 0;
                              }
                            } else {
                              stackOut_214_0 = 0;
                              stackIn_233_0 = stackOut_214_0;
                              break L40;
                            }
                          }
                        }
                        L44: {
                          var5 = stackIn_233_0;
                          if (!param0.field_wc) {
                            if (param0.field_qc == 2) {
                              L45: {
                                var6 = 1;
                                if (var5 != 0) {
                                  stackOut_239_0 = 0;
                                  stackIn_240_0 = stackOut_239_0;
                                  break L45;
                                } else {
                                  stackOut_238_0 = 1;
                                  stackIn_240_0 = stackOut_238_0;
                                  break L45;
                                }
                              }
                              if (stackIn_240_0 == var6) {
                                return var5 != 0;
                              } else {
                                L46: {
                                  if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                                    stackOut_245_0 = 0;
                                    stackIn_246_0 = stackOut_245_0;
                                    break L46;
                                  } else {
                                    stackOut_244_0 = 1;
                                    stackIn_246_0 = stackOut_244_0;
                                    break L46;
                                  }
                                }
                                return stackIn_246_0 != 0;
                              }
                            } else {
                              stackOut_236_0 = 0;
                              stackIn_248_0 = stackOut_236_0;
                              break L44;
                            }
                          } else {
                            stackOut_234_0 = 1;
                            stackIn_248_0 = stackOut_234_0;
                            break L44;
                          }
                        }
                        L47: {
                          var6 = stackIn_248_0;
                          if (var5 != 0) {
                            stackOut_250_0 = 0;
                            stackIn_251_0 = stackOut_250_0;
                            break L47;
                          } else {
                            stackOut_249_0 = 1;
                            stackIn_251_0 = stackOut_249_0;
                            break L47;
                          }
                        }
                        if (stackIn_251_0 == var6) {
                          return var5 != 0;
                        } else {
                          L48: {
                            if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                              stackOut_256_0 = 0;
                              stackIn_257_0 = stackOut_256_0;
                              break L48;
                            } else {
                              stackOut_255_0 = 1;
                              stackIn_257_0 = stackOut_255_0;
                              break L48;
                            }
                          }
                          return stackIn_257_0 != 0;
                        }
                      } else {
                        L49: {
                          if (param0.field_tc <= ((ve) this).field_tc) {
                            stackOut_210_0 = 0;
                            stackIn_211_0 = stackOut_210_0;
                            break L49;
                          } else {
                            stackOut_209_0 = 1;
                            stackIn_211_0 = stackOut_209_0;
                            break L49;
                          }
                        }
                        return stackIn_211_0 != 0;
                      }
                    }
                  } else {
                    L50: {
                      if (((ve) this).field_Wb >= param0.field_Wb) {
                        stackOut_196_0 = 0;
                        stackIn_197_0 = stackOut_196_0;
                        break L50;
                      } else {
                        stackOut_195_0 = 1;
                        stackIn_197_0 = stackOut_195_0;
                        break L50;
                      }
                    }
                    return stackIn_197_0 != 0;
                  }
                }
              } else {
                return ((ve) this).field_gc;
              }
            } else {
              L51: {
                stackOut_128_0 = ((ve) this).field_lc;
                stackIn_130_0 = stackOut_128_0;
                stackIn_129_0 = stackOut_128_0;
                if (param0.field_lc) {
                  stackOut_130_0 = stackIn_130_0;
                  stackOut_130_1 = 0;
                  stackIn_131_0 = stackOut_130_0;
                  stackIn_131_1 = stackOut_130_1;
                  break L51;
                } else {
                  stackOut_129_0 = stackIn_129_0;
                  stackOut_129_1 = 1;
                  stackIn_131_0 = stackOut_129_0;
                  stackIn_131_1 = stackOut_129_1;
                  break L51;
                }
              }
              if ((stackIn_131_0 ? 1 : 0) == stackIn_131_1) {
                L52: {
                  if (((ve) this).field_lc) {
                    stackOut_135_0 = 0;
                    stackIn_136_0 = stackOut_135_0;
                    break L52;
                  } else {
                    stackOut_134_0 = 1;
                    stackIn_136_0 = stackOut_134_0;
                    break L52;
                  }
                }
                return stackIn_136_0 != 0;
              } else {
                if (((ve) this).field_lc) {
                  if (!((ve) this).field_wc) {
                    L53: {
                      if ((((ve) this).field_qc ^ -1) != -3) {
                        stackOut_161_0 = 0;
                        stackIn_162_0 = stackOut_161_0;
                        break L53;
                      } else {
                        stackOut_160_0 = 1;
                        stackIn_162_0 = stackOut_160_0;
                        break L53;
                      }
                    }
                    var5 = stackIn_162_0;
                    if (!param0.field_wc) {
                      L54: {
                        if (param0.field_qc != 2) {
                          stackOut_176_0 = 0;
                          stackIn_177_0 = stackOut_176_0;
                          break L54;
                        } else {
                          stackOut_175_0 = 1;
                          stackIn_177_0 = stackOut_175_0;
                          break L54;
                        }
                      }
                      L55: {
                        var6 = stackIn_177_0;
                        if (var5 != 0) {
                          stackOut_179_0 = 0;
                          stackIn_180_0 = stackOut_179_0;
                          break L55;
                        } else {
                          stackOut_178_0 = 1;
                          stackIn_180_0 = stackOut_178_0;
                          break L55;
                        }
                      }
                      if (stackIn_180_0 == var6) {
                        return var5 != 0;
                      } else {
                        L56: {
                          if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                            stackOut_185_0 = 0;
                            stackIn_186_0 = stackOut_185_0;
                            break L56;
                          } else {
                            stackOut_184_0 = 1;
                            stackIn_186_0 = stackOut_184_0;
                            break L56;
                          }
                        }
                        return stackIn_186_0 != 0;
                      }
                    } else {
                      L57: {
                        var6 = 1;
                        if (var5 != 0) {
                          stackOut_165_0 = 0;
                          stackIn_166_0 = stackOut_165_0;
                          break L57;
                        } else {
                          stackOut_164_0 = 1;
                          stackIn_166_0 = stackOut_164_0;
                          break L57;
                        }
                      }
                      if (stackIn_166_0 == var6) {
                        return var5 != 0;
                      } else {
                        L58: {
                          if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                            stackOut_171_0 = 0;
                            stackIn_172_0 = stackOut_171_0;
                            break L58;
                          } else {
                            stackOut_170_0 = 1;
                            stackIn_172_0 = stackOut_170_0;
                            break L58;
                          }
                        }
                        return stackIn_172_0 != 0;
                      }
                    }
                  } else {
                    L59: {
                      var5 = 1;
                      if (!param0.field_wc) {
                        if (param0.field_qc == 2) {
                          stackOut_147_0 = 1;
                          stackIn_149_0 = stackOut_147_0;
                          break L59;
                        } else {
                          stackOut_146_0 = 0;
                          stackIn_149_0 = stackOut_146_0;
                          break L59;
                        }
                      } else {
                        stackOut_144_0 = 1;
                        stackIn_149_0 = stackOut_144_0;
                        break L59;
                      }
                    }
                    L60: {
                      var6 = stackIn_149_0;
                      if (var5 != 0) {
                        stackOut_151_0 = 0;
                        stackIn_152_0 = stackOut_151_0;
                        break L60;
                      } else {
                        stackOut_150_0 = 1;
                        stackIn_152_0 = stackOut_150_0;
                        break L60;
                      }
                    }
                    if (stackIn_152_0 == var6) {
                      return var5 != 0;
                    } else {
                      L61: {
                        if ((param0.field_tc ^ -1L) <= (((ve) this).field_tc ^ -1L)) {
                          stackOut_157_0 = 0;
                          stackIn_158_0 = stackOut_157_0;
                          break L61;
                        } else {
                          stackOut_156_0 = 1;
                          stackIn_158_0 = stackOut_156_0;
                          break L61;
                        }
                      }
                      return stackIn_158_0 != 0;
                    }
                  }
                } else {
                  L62: {
                    if (param0.field_tc <= ((ve) this).field_tc) {
                      stackOut_140_0 = 0;
                      stackIn_141_0 = stackOut_140_0;
                      break L62;
                    } else {
                      stackOut_139_0 = 1;
                      stackIn_141_0 = stackOut_139_0;
                      break L62;
                    }
                  }
                  return stackIn_141_0 != 0;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hc = 10;
        field_uc = new ck[8][];
        field_cc = "You are on <%0>";
        field_ic = new int[]{0, 0, 5, 9, 12, 14, 15, 15, 14, 12, 8, 4, 2, 1};
        field_nc = 1;
    }
}
