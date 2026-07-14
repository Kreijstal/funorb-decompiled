/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ci {
    ci field_gc;
    long field_Fb;
    ci field_Ib;
    int field_Mb;
    ci field_fc;
    ci field_Nb;
    int field_ic;
    int field_Xb;
    boolean field_dc;
    byte[] field_sc;
    boolean field_Vb;
    long field_Jb;
    boolean field_Yb;
    ci field_Qb;
    ci field_uc;
    ci field_Lb;
    int field_Hb;
    ci field_nc;
    int field_jc;
    ci field_Sb;
    int field_hc;
    static int field_rc;
    boolean field_Tb;
    ci field_tc;
    static ci field_cc;
    ci[] field_Ob;
    boolean field_lc;
    static ci field_vc;
    ci field_Rb;
    static String field_bc;
    static String[][] field_qc;
    ci field_mc;
    String field_Gb;
    int field_Ub;
    static int field_oc;
    boolean field_Pb;
    ci field_Zb;
    String[] field_ec;
    boolean field_ac;
    ci field_Wb;
    ci field_kc;
    int field_pc;
    static boolean field_Kb;
    ci field_Eb;

    final static hg[] l(int param0) {
        if (param0 != 2) {
          return null;
        } else {
          return new hg[]{ej.field_c, ig.field_d, ah.field_g, ka.field_j, an.field_b, ql.field_g, wg.field_r, me.field_b, ob.field_v, mf.field_m, ag.field_g, nj.field_v, ua.field_a, dm.field_c};
        }
    }

    final int g(byte param0) {
        if (param0 >= -74) {
            return 25;
        }
        return (int)((ln) this).a(0);
    }

    public static void k(int param0) {
        field_cc = null;
        field_vc = null;
        if (param0 != 0) {
          field_cc = null;
          field_qc = null;
          field_bc = null;
          return;
        } else {
          field_qc = null;
          field_bc = null;
          return;
        }
    }

    ln(int param0) {
        super(0L, (ci) null);
        ((ln) this).field_sc = new byte[param0];
    }

    final boolean a(int param0, ln param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_33_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_35_0 = false;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        boolean stackIn_76_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_110_0 = 0;
        boolean stackIn_115_0 = false;
        boolean stackIn_116_0 = false;
        boolean stackIn_117_0 = false;
        int stackIn_117_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_151_0 = 0;
        boolean stackIn_153_0 = false;
        boolean stackIn_154_0 = false;
        boolean stackIn_155_0 = false;
        int stackIn_155_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_211_0 = 0;
        boolean stackIn_217_0 = false;
        boolean stackIn_218_0 = false;
        boolean stackIn_219_0 = false;
        int stackIn_219_1 = 0;
        int stackIn_223_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_266_0 = 0;
        boolean stackIn_268_0 = false;
        boolean stackIn_269_0 = false;
        boolean stackIn_270_0 = false;
        int stackIn_270_1 = 0;
        int stackIn_274_0 = 0;
        int stackIn_279_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_298_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_311_0 = 0;
        int stackIn_316_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_32_0 = false;
        boolean stackOut_34_0 = false;
        int stackOut_34_1 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_33_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        boolean stackOut_152_0 = false;
        boolean stackOut_154_0 = false;
        int stackOut_154_1 = 0;
        boolean stackOut_153_0 = false;
        int stackOut_153_1 = 0;
        int stackOut_181_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        boolean stackOut_114_0 = false;
        boolean stackOut_116_0 = false;
        int stackOut_116_1 = 0;
        boolean stackOut_115_0 = false;
        int stackOut_115_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        boolean stackOut_75_0 = false;
        boolean stackOut_77_0 = false;
        int stackOut_77_1 = 0;
        boolean stackOut_76_0 = false;
        int stackOut_76_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_264_0 = 0;
        boolean stackOut_216_0 = false;
        boolean stackOut_218_0 = false;
        int stackOut_218_1 = 0;
        boolean stackOut_217_0 = false;
        int stackOut_217_1 = 0;
        int stackOut_244_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_221_0 = 0;
        boolean stackOut_267_0 = false;
        boolean stackOut_269_0 = false;
        int stackOut_269_1 = 0;
        boolean stackOut_268_0 = false;
        int stackOut_268_1 = 0;
        int stackOut_299_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_297_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_310_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_273_0 = 0;
        int stackOut_272_0 = 0;
        if (param0 == -7) {
          L0: {
            if (!((ln) this).field_dc) {
              if (6 == ((ln) this).field_jc) {
                L1: {
                  var3 = 1;
                  if (!param1.field_dc) {
                    if (-7 == (param1.field_jc ^ -1)) {
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
                L2: {
                  var4 = stackIn_12_0;
                  if (var4 != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L2;
                  }
                }
                if (stackIn_15_0 == var3) {
                  return var3 != 0;
                } else {
                  L3: {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (param1.field_Pb) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L4;
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          break L4;
                        }
                      }
                      if (stackIn_22_0 == (((ln) this).field_Pb ? 1 : 0)) {
                        return ((ln) this).field_Pb;
                      } else {
                        if (!((ln) this).field_Pb) {
                          break L3;
                        } else {
                          if (param1.field_ic != ((ln) this).field_ic) {
                            L5: {
                              if (param1.field_ic <= ((ln) this).field_ic) {
                                stackOut_30_0 = 0;
                                stackIn_31_0 = stackOut_30_0;
                                break L5;
                              } else {
                                stackOut_29_0 = 1;
                                stackIn_31_0 = stackOut_29_0;
                                break L5;
                              }
                            }
                            return stackIn_31_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    stackOut_32_0 = ((ln) this).field_Vb;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (param1.field_Vb) {
                      stackOut_34_0 = stackIn_34_0;
                      stackOut_34_1 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L6;
                    } else {
                      stackOut_33_0 = stackIn_33_0;
                      stackOut_33_1 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L6;
                    }
                  }
                  if ((stackIn_35_0 ? 1 : 0) != stackIn_35_1) {
                    if (((ln) this).field_Vb) {
                      L7: {
                        if (!((ln) this).field_ac) {
                          if (2 == ((ln) this).field_Mb) {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L7;
                          } else {
                            stackOut_48_0 = 0;
                            stackIn_51_0 = stackOut_48_0;
                            break L7;
                          }
                        } else {
                          stackOut_46_0 = 1;
                          stackIn_51_0 = stackOut_46_0;
                          break L7;
                        }
                      }
                      L8: {
                        var5 = stackIn_51_0;
                        if (param1.field_ac) {
                          stackOut_55_0 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          break L8;
                        } else {
                          if (param1.field_Mb == 2) {
                            stackOut_54_0 = 1;
                            stackIn_57_0 = stackOut_54_0;
                            break L8;
                          } else {
                            stackOut_53_0 = 0;
                            stackIn_57_0 = stackOut_53_0;
                            break L8;
                          }
                        }
                      }
                      var6 = stackIn_57_0;
                      if (var6 != var5) {
                        return var5 != 0;
                      } else {
                        L9: {
                          if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L9;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L9;
                          }
                        }
                        return stackIn_61_0 != 0;
                      }
                    } else {
                      L10: {
                        if (((ln) this).field_Jb >= param1.field_Jb) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L10;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L10;
                        }
                      }
                      return stackIn_44_0 != 0;
                    }
                  } else {
                    L11: {
                      if (((ln) this).field_Vb) {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        break L11;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        break L11;
                      }
                    }
                    return stackIn_39_0 != 0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_64_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_64_0 = stackOut_3_0;
              break L0;
            }
          }
          L12: {
            var3 = stackIn_64_0;
            if (!param1.field_dc) {
              if (-7 == (param1.field_jc ^ -1)) {
                L13: {
                  var4 = 1;
                  if (var4 != 0) {
                    stackOut_70_0 = 0;
                    stackIn_71_0 = stackOut_70_0;
                    break L13;
                  } else {
                    stackOut_69_0 = 1;
                    stackIn_71_0 = stackOut_69_0;
                    break L13;
                  }
                }
                if (stackIn_71_0 == var3) {
                  return var3 != 0;
                } else {
                  if (var3 == 0) {
                    L14: {
                      if (param1.field_Pb) {
                        stackOut_109_0 = 0;
                        stackIn_110_0 = stackOut_109_0;
                        break L14;
                      } else {
                        stackOut_108_0 = 1;
                        stackIn_110_0 = stackOut_108_0;
                        break L14;
                      }
                    }
                    if (stackIn_110_0 == (((ln) this).field_Pb ? 1 : 0)) {
                      return ((ln) this).field_Pb;
                    } else {
                      if (((ln) this).field_Pb) {
                        if (param1.field_ic != ((ln) this).field_ic) {
                          L15: {
                            if (param1.field_ic <= ((ln) this).field_ic) {
                              stackOut_150_0 = 0;
                              stackIn_151_0 = stackOut_150_0;
                              break L15;
                            } else {
                              stackOut_149_0 = 1;
                              stackIn_151_0 = stackOut_149_0;
                              break L15;
                            }
                          }
                          return stackIn_151_0 != 0;
                        } else {
                          L16: {
                            stackOut_152_0 = ((ln) this).field_Vb;
                            stackIn_154_0 = stackOut_152_0;
                            stackIn_153_0 = stackOut_152_0;
                            if (param1.field_Vb) {
                              stackOut_154_0 = stackIn_154_0;
                              stackOut_154_1 = 0;
                              stackIn_155_0 = stackOut_154_0;
                              stackIn_155_1 = stackOut_154_1;
                              break L16;
                            } else {
                              stackOut_153_0 = stackIn_153_0;
                              stackOut_153_1 = 1;
                              stackIn_155_0 = stackOut_153_0;
                              stackIn_155_1 = stackOut_153_1;
                              break L16;
                            }
                          }
                          if ((stackIn_155_0 ? 1 : 0) != stackIn_155_1) {
                            if (((ln) this).field_Vb) {
                              L17: {
                                if (((ln) this).field_ac) {
                                  stackOut_181_0 = 1;
                                  stackIn_183_0 = stackOut_181_0;
                                  break L17;
                                } else {
                                  if (2 == ((ln) this).field_Mb) {
                                    L18: {
                                      var5 = 1;
                                      if (!param1.field_ac) {
                                        if (param1.field_Mb == 2) {
                                          stackOut_172_0 = 1;
                                          stackIn_174_0 = stackOut_172_0;
                                          break L18;
                                        } else {
                                          stackOut_171_0 = 0;
                                          stackIn_174_0 = stackOut_171_0;
                                          break L18;
                                        }
                                      } else {
                                        stackOut_169_0 = 1;
                                        stackIn_174_0 = stackOut_169_0;
                                        break L18;
                                      }
                                    }
                                    var6 = stackIn_174_0;
                                    if (var6 != var5) {
                                      return var5 != 0;
                                    } else {
                                      L19: {
                                        if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                          stackOut_177_0 = 0;
                                          stackIn_178_0 = stackOut_177_0;
                                          break L19;
                                        } else {
                                          stackOut_176_0 = 1;
                                          stackIn_178_0 = stackOut_176_0;
                                          break L19;
                                        }
                                      }
                                      return stackIn_178_0 != 0;
                                    }
                                  } else {
                                    stackOut_167_0 = 0;
                                    stackIn_183_0 = stackOut_167_0;
                                    break L17;
                                  }
                                }
                              }
                              L20: {
                                var5 = stackIn_183_0;
                                if (!param1.field_ac) {
                                  if (param1.field_Mb == 2) {
                                    var6 = 1;
                                    if (var6 == var5) {
                                      L21: {
                                        if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                          stackOut_191_0 = 0;
                                          stackIn_192_0 = stackOut_191_0;
                                          break L21;
                                        } else {
                                          stackOut_190_0 = 1;
                                          stackIn_192_0 = stackOut_190_0;
                                          break L21;
                                        }
                                      }
                                      return stackIn_192_0 != 0;
                                    } else {
                                      return var5 != 0;
                                    }
                                  } else {
                                    stackOut_186_0 = 0;
                                    stackIn_194_0 = stackOut_186_0;
                                    break L20;
                                  }
                                } else {
                                  stackOut_184_0 = 1;
                                  stackIn_194_0 = stackOut_184_0;
                                  break L20;
                                }
                              }
                              var6 = stackIn_194_0;
                              if (var6 == var5) {
                                L22: {
                                  if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                    stackOut_198_0 = 0;
                                    stackIn_199_0 = stackOut_198_0;
                                    break L22;
                                  } else {
                                    stackOut_197_0 = 1;
                                    stackIn_199_0 = stackOut_197_0;
                                    break L22;
                                  }
                                }
                                return stackIn_199_0 != 0;
                              } else {
                                return var5 != 0;
                              }
                            } else {
                              L23: {
                                if (((ln) this).field_Jb >= param1.field_Jb) {
                                  stackOut_163_0 = 0;
                                  stackIn_164_0 = stackOut_163_0;
                                  break L23;
                                } else {
                                  stackOut_162_0 = 1;
                                  stackIn_164_0 = stackOut_162_0;
                                  break L23;
                                }
                              }
                              return stackIn_164_0 != 0;
                            }
                          } else {
                            L24: {
                              if (((ln) this).field_Vb) {
                                stackOut_158_0 = 0;
                                stackIn_159_0 = stackOut_158_0;
                                break L24;
                              } else {
                                stackOut_157_0 = 1;
                                stackIn_159_0 = stackOut_157_0;
                                break L24;
                              }
                            }
                            return stackIn_159_0 != 0;
                          }
                        }
                      } else {
                        L25: {
                          stackOut_114_0 = ((ln) this).field_Vb;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_115_0 = stackOut_114_0;
                          if (param1.field_Vb) {
                            stackOut_116_0 = stackIn_116_0;
                            stackOut_116_1 = 0;
                            stackIn_117_0 = stackOut_116_0;
                            stackIn_117_1 = stackOut_116_1;
                            break L25;
                          } else {
                            stackOut_115_0 = stackIn_115_0;
                            stackOut_115_1 = 1;
                            stackIn_117_0 = stackOut_115_0;
                            stackIn_117_1 = stackOut_115_1;
                            break L25;
                          }
                        }
                        if ((stackIn_117_0 ? 1 : 0) != stackIn_117_1) {
                          if (((ln) this).field_Vb) {
                            L26: {
                              if (!((ln) this).field_ac) {
                                if (2 == ((ln) this).field_Mb) {
                                  stackOut_131_0 = 1;
                                  stackIn_133_0 = stackOut_131_0;
                                  break L26;
                                } else {
                                  stackOut_130_0 = 0;
                                  stackIn_133_0 = stackOut_130_0;
                                  break L26;
                                }
                              } else {
                                stackOut_128_0 = 1;
                                stackIn_133_0 = stackOut_128_0;
                                break L26;
                              }
                            }
                            L27: {
                              var5 = stackIn_133_0;
                              if (param1.field_ac) {
                                stackOut_137_0 = 1;
                                stackIn_139_0 = stackOut_137_0;
                                break L27;
                              } else {
                                if (param1.field_Mb == 2) {
                                  stackOut_136_0 = 1;
                                  stackIn_139_0 = stackOut_136_0;
                                  break L27;
                                } else {
                                  stackOut_135_0 = 0;
                                  stackIn_139_0 = stackOut_135_0;
                                  break L27;
                                }
                              }
                            }
                            var6 = stackIn_139_0;
                            if (var6 != var5) {
                              return var5 != 0;
                            } else {
                              L28: {
                                if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                  stackOut_142_0 = 0;
                                  stackIn_143_0 = stackOut_142_0;
                                  break L28;
                                } else {
                                  stackOut_141_0 = 1;
                                  stackIn_143_0 = stackOut_141_0;
                                  break L28;
                                }
                              }
                              return stackIn_143_0 != 0;
                            }
                          } else {
                            L29: {
                              if (((ln) this).field_Jb >= param1.field_Jb) {
                                stackOut_125_0 = 0;
                                stackIn_126_0 = stackOut_125_0;
                                break L29;
                              } else {
                                stackOut_124_0 = 1;
                                stackIn_126_0 = stackOut_124_0;
                                break L29;
                              }
                            }
                            return stackIn_126_0 != 0;
                          }
                        } else {
                          L30: {
                            if (((ln) this).field_Vb) {
                              stackOut_120_0 = 0;
                              stackIn_121_0 = stackOut_120_0;
                              break L30;
                            } else {
                              stackOut_119_0 = 1;
                              stackIn_121_0 = stackOut_119_0;
                              break L30;
                            }
                          }
                          return stackIn_121_0 != 0;
                        }
                      }
                    }
                  } else {
                    L31: {
                      stackOut_75_0 = ((ln) this).field_Vb;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_76_0 = stackOut_75_0;
                      if (param1.field_Vb) {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        break L31;
                      } else {
                        stackOut_76_0 = stackIn_76_0;
                        stackOut_76_1 = 1;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        break L31;
                      }
                    }
                    if ((stackIn_78_0 ? 1 : 0) != stackIn_78_1) {
                      if (((ln) this).field_Vb) {
                        L32: {
                          if (((ln) this).field_ac) {
                            stackOut_92_0 = 1;
                            stackIn_94_0 = stackOut_92_0;
                            break L32;
                          } else {
                            if (2 == ((ln) this).field_Mb) {
                              stackOut_91_0 = 1;
                              stackIn_94_0 = stackOut_91_0;
                              break L32;
                            } else {
                              stackOut_90_0 = 0;
                              stackIn_94_0 = stackOut_90_0;
                              break L32;
                            }
                          }
                        }
                        L33: {
                          var5 = stackIn_94_0;
                          if (!param1.field_ac) {
                            if (param1.field_Mb == 2) {
                              stackOut_98_0 = 1;
                              stackIn_100_0 = stackOut_98_0;
                              break L33;
                            } else {
                              stackOut_97_0 = 0;
                              stackIn_100_0 = stackOut_97_0;
                              break L33;
                            }
                          } else {
                            stackOut_95_0 = 1;
                            stackIn_100_0 = stackOut_95_0;
                            break L33;
                          }
                        }
                        var6 = stackIn_100_0;
                        if (var6 != var5) {
                          return var5 != 0;
                        } else {
                          L34: {
                            if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                              stackOut_103_0 = 0;
                              stackIn_104_0 = stackOut_103_0;
                              break L34;
                            } else {
                              stackOut_102_0 = 1;
                              stackIn_104_0 = stackOut_102_0;
                              break L34;
                            }
                          }
                          return stackIn_104_0 != 0;
                        }
                      } else {
                        L35: {
                          if (((ln) this).field_Jb >= param1.field_Jb) {
                            stackOut_86_0 = 0;
                            stackIn_87_0 = stackOut_86_0;
                            break L35;
                          } else {
                            stackOut_85_0 = 1;
                            stackIn_87_0 = stackOut_85_0;
                            break L35;
                          }
                        }
                        return stackIn_87_0 != 0;
                      }
                    } else {
                      L36: {
                        if (((ln) this).field_Vb) {
                          stackOut_81_0 = 0;
                          stackIn_82_0 = stackOut_81_0;
                          break L36;
                        } else {
                          stackOut_80_0 = 1;
                          stackIn_82_0 = stackOut_80_0;
                          break L36;
                        }
                      }
                      return stackIn_82_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_67_0 = 0;
                stackIn_201_0 = stackOut_67_0;
                break L12;
              }
            } else {
              stackOut_65_0 = 1;
              stackIn_201_0 = stackOut_65_0;
              break L12;
            }
          }
          L37: {
            var4 = stackIn_201_0;
            if (var4 != 0) {
              stackOut_203_0 = 0;
              stackIn_204_0 = stackOut_203_0;
              break L37;
            } else {
              stackOut_202_0 = 1;
              stackIn_204_0 = stackOut_202_0;
              break L37;
            }
          }
          if (stackIn_204_0 == var3) {
            return var3 != 0;
          } else {
            L38: {
              if (var3 != 0) {
                break L38;
              } else {
                L39: {
                  if (param1.field_Pb) {
                    stackOut_210_0 = 0;
                    stackIn_211_0 = stackOut_210_0;
                    break L39;
                  } else {
                    stackOut_209_0 = 1;
                    stackIn_211_0 = stackOut_209_0;
                    break L39;
                  }
                }
                if (stackIn_211_0 == (((ln) this).field_Pb ? 1 : 0)) {
                  return ((ln) this).field_Pb;
                } else {
                  if (!((ln) this).field_Pb) {
                    break L38;
                  } else {
                    if (param1.field_ic != ((ln) this).field_ic) {
                      L40: {
                        if (param1.field_ic <= ((ln) this).field_ic) {
                          stackOut_265_0 = 0;
                          stackIn_266_0 = stackOut_265_0;
                          break L40;
                        } else {
                          stackOut_264_0 = 1;
                          stackIn_266_0 = stackOut_264_0;
                          break L40;
                        }
                      }
                      return stackIn_266_0 != 0;
                    } else {
                      L41: {
                        stackOut_216_0 = ((ln) this).field_Vb;
                        stackIn_218_0 = stackOut_216_0;
                        stackIn_217_0 = stackOut_216_0;
                        if (param1.field_Vb) {
                          stackOut_218_0 = stackIn_218_0;
                          stackOut_218_1 = 0;
                          stackIn_219_0 = stackOut_218_0;
                          stackIn_219_1 = stackOut_218_1;
                          break L41;
                        } else {
                          stackOut_217_0 = stackIn_217_0;
                          stackOut_217_1 = 1;
                          stackIn_219_0 = stackOut_217_0;
                          stackIn_219_1 = stackOut_217_1;
                          break L41;
                        }
                      }
                      if ((stackIn_219_0 ? 1 : 0) != stackIn_219_1) {
                        if (((ln) this).field_Vb) {
                          L42: {
                            if (((ln) this).field_ac) {
                              stackOut_244_0 = 1;
                              stackIn_246_0 = stackOut_244_0;
                              break L42;
                            } else {
                              if (2 == ((ln) this).field_Mb) {
                                L43: {
                                  var5 = 1;
                                  if (!param1.field_ac) {
                                    if (param1.field_Mb == 2) {
                                      stackOut_236_0 = 1;
                                      stackIn_238_0 = stackOut_236_0;
                                      break L43;
                                    } else {
                                      stackOut_235_0 = 0;
                                      stackIn_238_0 = stackOut_235_0;
                                      break L43;
                                    }
                                  } else {
                                    stackOut_233_0 = 1;
                                    stackIn_238_0 = stackOut_233_0;
                                    break L43;
                                  }
                                }
                                var6 = stackIn_238_0;
                                if (var6 == var5) {
                                  L44: {
                                    if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                      stackOut_242_0 = 0;
                                      stackIn_243_0 = stackOut_242_0;
                                      break L44;
                                    } else {
                                      stackOut_241_0 = 1;
                                      stackIn_243_0 = stackOut_241_0;
                                      break L44;
                                    }
                                  }
                                  return stackIn_243_0 != 0;
                                } else {
                                  return var5 != 0;
                                }
                              } else {
                                stackOut_231_0 = 0;
                                stackIn_246_0 = stackOut_231_0;
                                break L42;
                              }
                            }
                          }
                          L45: {
                            var5 = stackIn_246_0;
                            if (!param1.field_ac) {
                              if (param1.field_Mb == 2) {
                                var6 = 1;
                                if (var6 == var5) {
                                  L46: {
                                    if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                      stackOut_254_0 = 0;
                                      stackIn_255_0 = stackOut_254_0;
                                      break L46;
                                    } else {
                                      stackOut_253_0 = 1;
                                      stackIn_255_0 = stackOut_253_0;
                                      break L46;
                                    }
                                  }
                                  return stackIn_255_0 != 0;
                                } else {
                                  return var5 != 0;
                                }
                              } else {
                                stackOut_249_0 = 0;
                                stackIn_257_0 = stackOut_249_0;
                                break L45;
                              }
                            } else {
                              stackOut_247_0 = 1;
                              stackIn_257_0 = stackOut_247_0;
                              break L45;
                            }
                          }
                          var6 = stackIn_257_0;
                          if (var6 == var5) {
                            L47: {
                              if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                stackOut_261_0 = 0;
                                stackIn_262_0 = stackOut_261_0;
                                break L47;
                              } else {
                                stackOut_260_0 = 1;
                                stackIn_262_0 = stackOut_260_0;
                                break L47;
                              }
                            }
                            return stackIn_262_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        } else {
                          L48: {
                            if (((ln) this).field_Jb >= param1.field_Jb) {
                              stackOut_227_0 = 0;
                              stackIn_228_0 = stackOut_227_0;
                              break L48;
                            } else {
                              stackOut_226_0 = 1;
                              stackIn_228_0 = stackOut_226_0;
                              break L48;
                            }
                          }
                          return stackIn_228_0 != 0;
                        }
                      } else {
                        L49: {
                          if (((ln) this).field_Vb) {
                            stackOut_222_0 = 0;
                            stackIn_223_0 = stackOut_222_0;
                            break L49;
                          } else {
                            stackOut_221_0 = 1;
                            stackIn_223_0 = stackOut_221_0;
                            break L49;
                          }
                        }
                        return stackIn_223_0 != 0;
                      }
                    }
                  }
                }
              }
            }
            L50: {
              stackOut_267_0 = ((ln) this).field_Vb;
              stackIn_269_0 = stackOut_267_0;
              stackIn_268_0 = stackOut_267_0;
              if (param1.field_Vb) {
                stackOut_269_0 = stackIn_269_0;
                stackOut_269_1 = 0;
                stackIn_270_0 = stackOut_269_0;
                stackIn_270_1 = stackOut_269_1;
                break L50;
              } else {
                stackOut_268_0 = stackIn_268_0;
                stackOut_268_1 = 1;
                stackIn_270_0 = stackOut_268_0;
                stackIn_270_1 = stackOut_268_1;
                break L50;
              }
            }
            if ((stackIn_270_0 ? 1 : 0) != stackIn_270_1) {
              if (((ln) this).field_Vb) {
                L51: {
                  if (((ln) this).field_ac) {
                    stackOut_299_0 = 1;
                    stackIn_301_0 = stackOut_299_0;
                    break L51;
                  } else {
                    if (2 != ((ln) this).field_Mb) {
                      stackOut_300_0 = 0;
                      stackIn_301_0 = stackOut_300_0;
                      break L51;
                    } else {
                      L52: {
                        var5 = 1;
                        if (!param1.field_ac) {
                          if (param1.field_Mb == 2) {
                            var6 = 1;
                            if (var6 == var5) {
                              L53: {
                                if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                                  stackOut_290_0 = 0;
                                  stackIn_291_0 = stackOut_290_0;
                                  break L53;
                                } else {
                                  stackOut_289_0 = 1;
                                  stackIn_291_0 = stackOut_289_0;
                                  break L53;
                                }
                              }
                              return stackIn_291_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_285_0 = 0;
                            stackIn_293_0 = stackOut_285_0;
                            break L52;
                          }
                        } else {
                          stackOut_283_0 = 1;
                          stackIn_293_0 = stackOut_283_0;
                          break L52;
                        }
                      }
                      var6 = stackIn_293_0;
                      if (var6 == var5) {
                        L54: {
                          if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                            stackOut_297_0 = 0;
                            stackIn_298_0 = stackOut_297_0;
                            break L54;
                          } else {
                            stackOut_296_0 = 1;
                            stackIn_298_0 = stackOut_296_0;
                            break L54;
                          }
                        }
                        return stackIn_298_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    }
                  }
                }
                L55: {
                  var5 = stackIn_301_0;
                  if (param1.field_ac) {
                    stackOut_309_0 = 1;
                    stackIn_311_0 = stackOut_309_0;
                    break L55;
                  } else {
                    if (param1.field_Mb != 2) {
                      stackOut_310_0 = 0;
                      stackIn_311_0 = stackOut_310_0;
                      break L55;
                    } else {
                      var6 = 1;
                      if (var6 == var5) {
                        L56: {
                          if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                            stackOut_307_0 = 0;
                            stackIn_308_0 = stackOut_307_0;
                            break L56;
                          } else {
                            stackOut_306_0 = 1;
                            stackIn_308_0 = stackOut_306_0;
                            break L56;
                          }
                        }
                        return stackIn_308_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    }
                  }
                }
                var6 = stackIn_311_0;
                if (var6 == var5) {
                  L57: {
                    if ((((ln) this).field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                      stackOut_315_0 = 0;
                      stackIn_316_0 = stackOut_315_0;
                      break L57;
                    } else {
                      stackOut_314_0 = 1;
                      stackIn_316_0 = stackOut_314_0;
                      break L57;
                    }
                  }
                  return stackIn_316_0 != 0;
                } else {
                  return var5 != 0;
                }
              } else {
                L58: {
                  if (((ln) this).field_Jb >= param1.field_Jb) {
                    stackOut_278_0 = 0;
                    stackIn_279_0 = stackOut_278_0;
                    break L58;
                  } else {
                    stackOut_277_0 = 1;
                    stackIn_279_0 = stackOut_277_0;
                    break L58;
                  }
                }
                return stackIn_279_0 != 0;
              }
            } else {
              L59: {
                if (((ln) this).field_Vb) {
                  stackOut_273_0 = 0;
                  stackIn_274_0 = stackOut_273_0;
                  break L59;
                } else {
                  stackOut_272_0 = 1;
                  stackIn_274_0 = stackOut_272_0;
                  break L59;
                }
              }
              return stackIn_274_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final static void f(byte param0) {
        if (param0 != -74) {
            ln.k(-24);
            bo.a(bh.i(81), (byte) -12);
            return;
        }
        bo.a(bh.i(81), (byte) -12);
    }

    final boolean m(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -23901) {
          L0: {
            ((ln) this).field_gc = null;
            if (((ln) this).e(-4)) {
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
            if (((ln) this).e(-4)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rc = 0;
        field_bc = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
