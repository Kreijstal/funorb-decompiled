/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends gh {
    String field_Xb;
    boolean field_cc;
    gh field_Lc;
    gh field_gc;
    static gk[] field_Ec;
    boolean field_nc;
    gh field_Cc;
    boolean field_dc;
    boolean field_vc;
    int field_mc;
    static wk[] field_Tb;
    gh field_zc;
    static String field_Yb;
    static String field_Kc;
    gh field_Fc;
    gh field_qc;
    long field_fc;
    gh field_Ic;
    int field_sc;
    int field_wc;
    gh field_tc;
    gh field_Bc;
    int field_Ac;
    gh field_kc;
    gh[] field_Gc;
    boolean field_rc;
    String[] field_hc;
    static String field_Jc;
    int field_Ub;
    static cb field_oc;
    static int[] field_Zb;
    gh field_Wb;
    static String field_jc;
    int field_yc;
    static String field_pc;
    int field_Nc;
    gh field_xc;
    static int field_ic;
    int field_Mc;
    static int[] field_Vb;
    long field_Hc;
    gh field_ac;
    gh field_Dc;
    boolean field_bc;
    gh field_lc;
    byte[] field_Sb;
    boolean field_ec;
    gh field_uc;

    final static String a(char param0, String param1, boolean param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = SteelSentinels.field_G;
        var4 = param3.length();
        if (param2) {
          var5 = param1.length();
          var6 = var4;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param3.indexOf((int) param0, var9);
                  if (var10 >= 0) {
                    StringBuilder discarded$9 = var13.append(param3.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$10 = var13.append(param1);
                    continue L1;
                  } else {
                    StringBuilder discarded$11 = var13.append(param3.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (var10 >= 0) {
                StringBuilder discarded$12 = var12.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$13 = var12.append(param1);
                continue L2;
              } else {
                StringBuilder discarded$14 = var12.append(param3.substring(var9));
                return var12.toString();
              }
            }
          }
        } else {
          L3: {
            field_pc = null;
            var5 = param1.length();
            var6 = var4;
            var7 = -1 + var5;
            if (var7 != 0) {
              var8_int = 0;
              L4: while (true) {
                var8_int = param3.indexOf((int) param0, var8_int);
                if (var8_int >= 0) {
                  var6 = var6 + var7;
                  var8_int++;
                  continue L4;
                } else {
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L3;
                }
              }
            } else {
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            }
          }
          L5: while (true) {
            var10 = param3.indexOf((int) param0, var9);
            if (var10 >= 0) {
              StringBuilder discarded$15 = var8.append(param3.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$16 = var8.append(param1);
              continue L5;
            } else {
              StringBuilder discarded$17 = var8.append(param3.substring(var9));
              return var8.toString();
            }
          }
        }
    }

    public static void d(byte param0) {
        Object var2 = null;
        if (param0 != -65) {
          var2 = null;
          String discarded$1 = hk.a('l', (String) null, true, (String) null);
          field_Jc = null;
          field_Yb = null;
          field_Zb = null;
          field_oc = null;
          field_pc = null;
          field_Vb = null;
          field_jc = null;
          field_Kc = null;
          field_Tb = null;
          field_Ec = null;
          return;
        } else {
          field_Jc = null;
          field_Yb = null;
          field_Zb = null;
          field_oc = null;
          field_pc = null;
          field_Vb = null;
          field_jc = null;
          field_Kc = null;
          field_Tb = null;
          field_Ec = null;
          return;
        }
    }

    final boolean a(hk param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_28_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_30_0 = false;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        boolean stackIn_105_0 = false;
        boolean stackIn_106_0 = false;
        boolean stackIn_107_0 = false;
        int stackIn_107_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_163_0 = 0;
        boolean stackIn_167_0 = false;
        boolean stackIn_168_0 = false;
        boolean stackIn_169_0 = false;
        int stackIn_169_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_234_0 = 0;
        boolean stackIn_239_0 = false;
        boolean stackIn_240_0 = false;
        boolean stackIn_241_0 = false;
        int stackIn_241_1 = 0;
        int stackIn_246_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_278_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_307_0 = 0;
        boolean stackIn_309_0 = false;
        boolean stackIn_310_0 = false;
        boolean stackIn_311_0 = false;
        int stackIn_311_1 = 0;
        int stackIn_316_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_333_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_343_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_350_0 = 0;
        int stackIn_357_0 = 0;
        int stackIn_362_0 = 0;
        int stackIn_364_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_372_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_27_0 = false;
        boolean stackOut_29_0 = false;
        int stackOut_29_1 = 0;
        boolean stackOut_28_0 = false;
        int stackOut_28_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        boolean stackOut_104_0 = false;
        boolean stackOut_106_0 = false;
        int stackOut_106_1 = 0;
        boolean stackOut_105_0 = false;
        int stackOut_105_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_232_0 = 0;
        boolean stackOut_308_0 = false;
        boolean stackOut_310_0 = false;
        int stackOut_310_1 = 0;
        boolean stackOut_309_0 = false;
        int stackOut_309_1 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_331_0 = 0;
        int stackOut_337_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_327_0 = 0;
        int stackOut_342_0 = 0;
        int stackOut_341_0 = 0;
        int stackOut_347_0 = 0;
        int stackOut_346_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_356_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_361_0 = 0;
        int stackOut_360_0 = 0;
        int stackOut_353_0 = 0;
        int stackOut_351_0 = 0;
        int stackOut_366_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_371_0 = 0;
        int stackOut_370_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_305_0 = 0;
        boolean stackOut_238_0 = false;
        boolean stackOut_240_0 = false;
        int stackOut_240_1 = 0;
        boolean stackOut_239_0 = false;
        int stackOut_239_1 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_276_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        boolean stackOut_166_0 = false;
        boolean stackOut_168_0 = false;
        int stackOut_168_1 = 0;
        boolean stackOut_167_0 = false;
        int stackOut_167_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        if (param1 <= 0) {
          L0: {
            if (!((hk) this).field_vc) {
              if (-7 == ((hk) this).field_Ac) {
                L1: {
                  var3 = 1;
                  if (!param0.field_vc) {
                    if (-7 == param0.field_Ac) {
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
                if (var4 == var3) {
                  L2: {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (((hk) this).field_cc) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L3;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L3;
                        }
                      }
                      if (stackIn_18_0 == (param0.field_cc ? 1 : 0)) {
                        return ((hk) this).field_cc;
                      } else {
                        if (!((hk) this).field_cc) {
                          break L2;
                        } else {
                          if (((hk) this).field_Nc == param0.field_Nc) {
                            break L2;
                          } else {
                            L4: {
                              if (param0.field_Nc <= ((hk) this).field_Nc) {
                                stackOut_25_0 = 0;
                                stackIn_26_0 = stackOut_25_0;
                                break L4;
                              } else {
                                stackOut_24_0 = 1;
                                stackIn_26_0 = stackOut_24_0;
                                break L4;
                              }
                            }
                            return stackIn_26_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    stackOut_27_0 = param0.field_rc;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (((hk) this).field_rc) {
                      stackOut_29_0 = stackIn_29_0;
                      stackOut_29_1 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L5;
                    } else {
                      stackOut_28_0 = stackIn_28_0;
                      stackOut_28_1 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L5;
                    }
                  }
                  if ((stackIn_30_0 ? 1 : 0) == stackIn_30_1) {
                    L6: {
                      if (((hk) this).field_rc) {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        break L6;
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        break L6;
                      }
                    }
                    return stackIn_35_0 != 0;
                  } else {
                    if (((hk) this).field_rc) {
                      if (!((hk) this).field_dc) {
                        L7: {
                          if (-3 != (((hk) this).field_sc ^ -1)) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L7;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L7;
                          }
                        }
                        var5 = stackIn_61_0;
                        if (!param0.field_dc) {
                          L8: {
                            if (2 != param0.field_sc) {
                              stackOut_74_0 = 0;
                              stackIn_75_0 = stackOut_74_0;
                              break L8;
                            } else {
                              stackOut_73_0 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              break L8;
                            }
                          }
                          L9: {
                            var6 = stackIn_75_0;
                            if (var6 != 0) {
                              stackOut_77_0 = 0;
                              stackIn_78_0 = stackOut_77_0;
                              break L9;
                            } else {
                              stackOut_76_0 = 1;
                              stackIn_78_0 = stackOut_76_0;
                              break L9;
                            }
                          }
                          if (stackIn_78_0 != var5) {
                            L10: {
                              if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                stackOut_82_0 = 0;
                                stackIn_83_0 = stackOut_82_0;
                                break L10;
                              } else {
                                stackOut_81_0 = 1;
                                stackIn_83_0 = stackOut_81_0;
                                break L10;
                              }
                            }
                            return stackIn_83_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        } else {
                          L11: {
                            var6 = 1;
                            if (var6 != 0) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L11;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L11;
                            }
                          }
                          if (stackIn_65_0 == var5) {
                            return var5 != 0;
                          } else {
                            L12: {
                              if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                stackOut_68_0 = 0;
                                stackIn_69_0 = stackOut_68_0;
                                break L12;
                              } else {
                                stackOut_67_0 = 1;
                                stackIn_69_0 = stackOut_67_0;
                                break L12;
                              }
                            }
                            return stackIn_69_0 != 0;
                          }
                        }
                      } else {
                        L13: {
                          var5 = 1;
                          if (!param0.field_dc) {
                            if (2 == param0.field_sc) {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L13;
                            } else {
                              stackOut_45_0 = 0;
                              stackIn_48_0 = stackOut_45_0;
                              break L13;
                            }
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_48_0 = stackOut_43_0;
                            break L13;
                          }
                        }
                        L14: {
                          var6 = stackIn_48_0;
                          if (var6 != 0) {
                            stackOut_50_0 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            break L14;
                          } else {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L14;
                          }
                        }
                        if (stackIn_51_0 == var5) {
                          return var5 != 0;
                        } else {
                          L15: {
                            if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                              stackOut_54_0 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              break L15;
                            } else {
                              stackOut_53_0 = 1;
                              stackIn_55_0 = stackOut_53_0;
                              break L15;
                            }
                          }
                          return stackIn_55_0 != 0;
                        }
                      }
                    } else {
                      L16: {
                        if (param0.field_Hc <= ((hk) this).field_Hc) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L16;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L16;
                        }
                      }
                      return stackIn_40_0 != 0;
                    }
                  }
                } else {
                  return var3 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_85_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_85_0 = stackOut_3_0;
              break L0;
            }
          }
          L17: {
            var3 = stackIn_85_0;
            if (!param0.field_vc) {
              if (-7 == (param0.field_Ac ^ -1)) {
                var4 = 1;
                if (var4 == var3) {
                  L18: {
                    if (var3 != 0) {
                      break L18;
                    } else {
                      L19: {
                        if (((hk) this).field_cc) {
                          stackOut_94_0 = 0;
                          stackIn_95_0 = stackOut_94_0;
                          break L19;
                        } else {
                          stackOut_93_0 = 1;
                          stackIn_95_0 = stackOut_93_0;
                          break L19;
                        }
                      }
                      if (stackIn_95_0 == (param0.field_cc ? 1 : 0)) {
                        return ((hk) this).field_cc;
                      } else {
                        if (!((hk) this).field_cc) {
                          break L18;
                        } else {
                          if (((hk) this).field_Nc == param0.field_Nc) {
                            break L18;
                          } else {
                            L20: {
                              if (param0.field_Nc <= ((hk) this).field_Nc) {
                                stackOut_102_0 = 0;
                                stackIn_103_0 = stackOut_102_0;
                                break L20;
                              } else {
                                stackOut_101_0 = 1;
                                stackIn_103_0 = stackOut_101_0;
                                break L20;
                              }
                            }
                            return stackIn_103_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  L21: {
                    stackOut_104_0 = param0.field_rc;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (((hk) this).field_rc) {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L21;
                    } else {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L21;
                    }
                  }
                  if ((stackIn_107_0 ? 1 : 0) == stackIn_107_1) {
                    L22: {
                      if (((hk) this).field_rc) {
                        stackOut_111_0 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        break L22;
                      } else {
                        stackOut_110_0 = 1;
                        stackIn_112_0 = stackOut_110_0;
                        break L22;
                      }
                    }
                    return stackIn_112_0 != 0;
                  } else {
                    if (((hk) this).field_rc) {
                      L23: {
                        if (((hk) this).field_dc) {
                          stackOut_137_0 = 1;
                          stackIn_139_0 = stackOut_137_0;
                          break L23;
                        } else {
                          if (-3 == (((hk) this).field_sc ^ -1)) {
                            L24: {
                              var5 = 1;
                              if (!param0.field_dc) {
                                if (2 == param0.field_sc) {
                                  stackOut_125_0 = 1;
                                  stackIn_127_0 = stackOut_125_0;
                                  break L24;
                                } else {
                                  stackOut_124_0 = 0;
                                  stackIn_127_0 = stackOut_124_0;
                                  break L24;
                                }
                              } else {
                                stackOut_122_0 = 1;
                                stackIn_127_0 = stackOut_122_0;
                                break L24;
                              }
                            }
                            L25: {
                              var6 = stackIn_127_0;
                              if (var6 != 0) {
                                stackOut_129_0 = 0;
                                stackIn_130_0 = stackOut_129_0;
                                break L25;
                              } else {
                                stackOut_128_0 = 1;
                                stackIn_130_0 = stackOut_128_0;
                                break L25;
                              }
                            }
                            if (stackIn_130_0 != var5) {
                              L26: {
                                if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                  stackOut_134_0 = 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  break L26;
                                } else {
                                  stackOut_133_0 = 1;
                                  stackIn_135_0 = stackOut_133_0;
                                  break L26;
                                }
                              }
                              return stackIn_135_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_120_0 = 0;
                            stackIn_139_0 = stackOut_120_0;
                            break L23;
                          }
                        }
                      }
                      L27: {
                        var5 = stackIn_139_0;
                        if (!param0.field_dc) {
                          if (2 == param0.field_sc) {
                            L28: {
                              var6 = 1;
                              if (var6 != 0) {
                                stackOut_145_0 = 0;
                                stackIn_146_0 = stackOut_145_0;
                                break L28;
                              } else {
                                stackOut_144_0 = 1;
                                stackIn_146_0 = stackOut_144_0;
                                break L28;
                              }
                            }
                            if (stackIn_146_0 != var5) {
                              L29: {
                                if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                  stackOut_150_0 = 0;
                                  stackIn_151_0 = stackOut_150_0;
                                  break L29;
                                } else {
                                  stackOut_149_0 = 1;
                                  stackIn_151_0 = stackOut_149_0;
                                  break L29;
                                }
                              }
                              return stackIn_151_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_142_0 = 0;
                            stackIn_153_0 = stackOut_142_0;
                            break L27;
                          }
                        } else {
                          stackOut_140_0 = 1;
                          stackIn_153_0 = stackOut_140_0;
                          break L27;
                        }
                      }
                      L30: {
                        var6 = stackIn_153_0;
                        if (var6 != 0) {
                          stackOut_155_0 = 0;
                          stackIn_156_0 = stackOut_155_0;
                          break L30;
                        } else {
                          stackOut_154_0 = 1;
                          stackIn_156_0 = stackOut_154_0;
                          break L30;
                        }
                      }
                      if (stackIn_156_0 != var5) {
                        L31: {
                          if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                            stackOut_160_0 = 0;
                            stackIn_161_0 = stackOut_160_0;
                            break L31;
                          } else {
                            stackOut_159_0 = 1;
                            stackIn_161_0 = stackOut_159_0;
                            break L31;
                          }
                        }
                        return stackIn_161_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    } else {
                      L32: {
                        if (param0.field_Hc <= ((hk) this).field_Hc) {
                          stackOut_116_0 = 0;
                          stackIn_117_0 = stackOut_116_0;
                          break L32;
                        } else {
                          stackOut_115_0 = 1;
                          stackIn_117_0 = stackOut_115_0;
                          break L32;
                        }
                      }
                      return stackIn_117_0 != 0;
                    }
                  }
                } else {
                  return var3 != 0;
                }
              } else {
                stackOut_88_0 = 0;
                stackIn_163_0 = stackOut_88_0;
                break L17;
              }
            } else {
              stackOut_86_0 = 1;
              stackIn_163_0 = stackOut_86_0;
              break L17;
            }
          }
          var4 = stackIn_163_0;
          if (var4 == var3) {
            if (var3 == 0) {
              L33: {
                if (((hk) this).field_cc) {
                  stackOut_233_0 = 0;
                  stackIn_234_0 = stackOut_233_0;
                  break L33;
                } else {
                  stackOut_232_0 = 1;
                  stackIn_234_0 = stackOut_232_0;
                  break L33;
                }
              }
              if (stackIn_234_0 == (param0.field_cc ? 1 : 0)) {
                return ((hk) this).field_cc;
              } else {
                if (((hk) this).field_cc) {
                  if (((hk) this).field_Nc == param0.field_Nc) {
                    L34: {
                      stackOut_308_0 = param0.field_rc;
                      stackIn_310_0 = stackOut_308_0;
                      stackIn_309_0 = stackOut_308_0;
                      if (((hk) this).field_rc) {
                        stackOut_310_0 = stackIn_310_0;
                        stackOut_310_1 = 0;
                        stackIn_311_0 = stackOut_310_0;
                        stackIn_311_1 = stackOut_310_1;
                        break L34;
                      } else {
                        stackOut_309_0 = stackIn_309_0;
                        stackOut_309_1 = 1;
                        stackIn_311_0 = stackOut_309_0;
                        stackIn_311_1 = stackOut_309_1;
                        break L34;
                      }
                    }
                    if ((stackIn_311_0 ? 1 : 0) == stackIn_311_1) {
                      L35: {
                        if (((hk) this).field_rc) {
                          stackOut_315_0 = 0;
                          stackIn_316_0 = stackOut_315_0;
                          break L35;
                        } else {
                          stackOut_314_0 = 1;
                          stackIn_316_0 = stackOut_314_0;
                          break L35;
                        }
                      }
                      return stackIn_316_0 != 0;
                    } else {
                      if (((hk) this).field_rc) {
                        L36: {
                          if (!((hk) this).field_dc) {
                            if (-3 == (((hk) this).field_sc ^ -1)) {
                              L37: {
                                var5 = 1;
                                if (!param0.field_dc) {
                                  if (2 == param0.field_sc) {
                                    L38: {
                                      var6 = 1;
                                      if (var6 != 0) {
                                        stackOut_332_0 = 0;
                                        stackIn_333_0 = stackOut_332_0;
                                        break L38;
                                      } else {
                                        stackOut_331_0 = 1;
                                        stackIn_333_0 = stackOut_331_0;
                                        break L38;
                                      }
                                    }
                                    if (stackIn_333_0 != var5) {
                                      L39: {
                                        if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                          stackOut_337_0 = 0;
                                          stackIn_338_0 = stackOut_337_0;
                                          break L39;
                                        } else {
                                          stackOut_336_0 = 1;
                                          stackIn_338_0 = stackOut_336_0;
                                          break L39;
                                        }
                                      }
                                      return stackIn_338_0 != 0;
                                    } else {
                                      return var5 != 0;
                                    }
                                  } else {
                                    stackOut_329_0 = 0;
                                    stackIn_340_0 = stackOut_329_0;
                                    break L37;
                                  }
                                } else {
                                  stackOut_327_0 = 1;
                                  stackIn_340_0 = stackOut_327_0;
                                  break L37;
                                }
                              }
                              L40: {
                                var6 = stackIn_340_0;
                                if (var6 != 0) {
                                  stackOut_342_0 = 0;
                                  stackIn_343_0 = stackOut_342_0;
                                  break L40;
                                } else {
                                  stackOut_341_0 = 1;
                                  stackIn_343_0 = stackOut_341_0;
                                  break L40;
                                }
                              }
                              if (stackIn_343_0 != var5) {
                                L41: {
                                  if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                    stackOut_347_0 = 0;
                                    stackIn_348_0 = stackOut_347_0;
                                    break L41;
                                  } else {
                                    stackOut_346_0 = 1;
                                    stackIn_348_0 = stackOut_346_0;
                                    break L41;
                                  }
                                }
                                return stackIn_348_0 != 0;
                              } else {
                                return var5 != 0;
                              }
                            } else {
                              stackOut_325_0 = 0;
                              stackIn_350_0 = stackOut_325_0;
                              break L36;
                            }
                          } else {
                            stackOut_323_0 = 1;
                            stackIn_350_0 = stackOut_323_0;
                            break L36;
                          }
                        }
                        L42: {
                          var5 = stackIn_350_0;
                          if (!param0.field_dc) {
                            if (2 == param0.field_sc) {
                              L43: {
                                var6 = 1;
                                if (var6 != 0) {
                                  stackOut_356_0 = 0;
                                  stackIn_357_0 = stackOut_356_0;
                                  break L43;
                                } else {
                                  stackOut_355_0 = 1;
                                  stackIn_357_0 = stackOut_355_0;
                                  break L43;
                                }
                              }
                              if (stackIn_357_0 != var5) {
                                L44: {
                                  if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                    stackOut_361_0 = 0;
                                    stackIn_362_0 = stackOut_361_0;
                                    break L44;
                                  } else {
                                    stackOut_360_0 = 1;
                                    stackIn_362_0 = stackOut_360_0;
                                    break L44;
                                  }
                                }
                                return stackIn_362_0 != 0;
                              } else {
                                return var5 != 0;
                              }
                            } else {
                              stackOut_353_0 = 0;
                              stackIn_364_0 = stackOut_353_0;
                              break L42;
                            }
                          } else {
                            stackOut_351_0 = 1;
                            stackIn_364_0 = stackOut_351_0;
                            break L42;
                          }
                        }
                        L45: {
                          var6 = stackIn_364_0;
                          if (var6 != 0) {
                            stackOut_366_0 = 0;
                            stackIn_367_0 = stackOut_366_0;
                            break L45;
                          } else {
                            stackOut_365_0 = 1;
                            stackIn_367_0 = stackOut_365_0;
                            break L45;
                          }
                        }
                        if (stackIn_367_0 != var5) {
                          L46: {
                            if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                              stackOut_371_0 = 0;
                              stackIn_372_0 = stackOut_371_0;
                              break L46;
                            } else {
                              stackOut_370_0 = 1;
                              stackIn_372_0 = stackOut_370_0;
                              break L46;
                            }
                          }
                          return stackIn_372_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        L47: {
                          if (param0.field_Hc <= ((hk) this).field_Hc) {
                            stackOut_320_0 = 0;
                            stackIn_321_0 = stackOut_320_0;
                            break L47;
                          } else {
                            stackOut_319_0 = 1;
                            stackIn_321_0 = stackOut_319_0;
                            break L47;
                          }
                        }
                        return stackIn_321_0 != 0;
                      }
                    }
                  } else {
                    L48: {
                      if (param0.field_Nc <= ((hk) this).field_Nc) {
                        stackOut_306_0 = 0;
                        stackIn_307_0 = stackOut_306_0;
                        break L48;
                      } else {
                        stackOut_305_0 = 1;
                        stackIn_307_0 = stackOut_305_0;
                        break L48;
                      }
                    }
                    return stackIn_307_0 != 0;
                  }
                } else {
                  L49: {
                    stackOut_238_0 = param0.field_rc;
                    stackIn_240_0 = stackOut_238_0;
                    stackIn_239_0 = stackOut_238_0;
                    if (((hk) this).field_rc) {
                      stackOut_240_0 = stackIn_240_0;
                      stackOut_240_1 = 0;
                      stackIn_241_0 = stackOut_240_0;
                      stackIn_241_1 = stackOut_240_1;
                      break L49;
                    } else {
                      stackOut_239_0 = stackIn_239_0;
                      stackOut_239_1 = 1;
                      stackIn_241_0 = stackOut_239_0;
                      stackIn_241_1 = stackOut_239_1;
                      break L49;
                    }
                  }
                  if ((stackIn_241_0 ? 1 : 0) == stackIn_241_1) {
                    L50: {
                      if (((hk) this).field_rc) {
                        stackOut_245_0 = 0;
                        stackIn_246_0 = stackOut_245_0;
                        break L50;
                      } else {
                        stackOut_244_0 = 1;
                        stackIn_246_0 = stackOut_244_0;
                        break L50;
                      }
                    }
                    return stackIn_246_0 != 0;
                  } else {
                    if (((hk) this).field_rc) {
                      L51: {
                        if (!((hk) this).field_dc) {
                          if (-3 == (((hk) this).field_sc ^ -1)) {
                            L52: {
                              var5 = 1;
                              if (!param0.field_dc) {
                                if (2 == param0.field_sc) {
                                  L53: {
                                    var6 = 1;
                                    if (var6 != 0) {
                                      stackOut_262_0 = 0;
                                      stackIn_263_0 = stackOut_262_0;
                                      break L53;
                                    } else {
                                      stackOut_261_0 = 1;
                                      stackIn_263_0 = stackOut_261_0;
                                      break L53;
                                    }
                                  }
                                  if (stackIn_263_0 != var5) {
                                    L54: {
                                      if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                        stackOut_267_0 = 0;
                                        stackIn_268_0 = stackOut_267_0;
                                        break L54;
                                      } else {
                                        stackOut_266_0 = 1;
                                        stackIn_268_0 = stackOut_266_0;
                                        break L54;
                                      }
                                    }
                                    return stackIn_268_0 != 0;
                                  } else {
                                    return var5 != 0;
                                  }
                                } else {
                                  stackOut_259_0 = 0;
                                  stackIn_270_0 = stackOut_259_0;
                                  break L52;
                                }
                              } else {
                                stackOut_257_0 = 1;
                                stackIn_270_0 = stackOut_257_0;
                                break L52;
                              }
                            }
                            L55: {
                              var6 = stackIn_270_0;
                              if (var6 != 0) {
                                stackOut_272_0 = 0;
                                stackIn_273_0 = stackOut_272_0;
                                break L55;
                              } else {
                                stackOut_271_0 = 1;
                                stackIn_273_0 = stackOut_271_0;
                                break L55;
                              }
                            }
                            if (stackIn_273_0 != var5) {
                              L56: {
                                if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                  stackOut_277_0 = 0;
                                  stackIn_278_0 = stackOut_277_0;
                                  break L56;
                                } else {
                                  stackOut_276_0 = 1;
                                  stackIn_278_0 = stackOut_276_0;
                                  break L56;
                                }
                              }
                              return stackIn_278_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_255_0 = 0;
                            stackIn_280_0 = stackOut_255_0;
                            break L51;
                          }
                        } else {
                          stackOut_253_0 = 1;
                          stackIn_280_0 = stackOut_253_0;
                          break L51;
                        }
                      }
                      L57: {
                        var5 = stackIn_280_0;
                        if (!param0.field_dc) {
                          if (2 == param0.field_sc) {
                            L58: {
                              var6 = 1;
                              if (var6 != 0) {
                                stackOut_286_0 = 0;
                                stackIn_287_0 = stackOut_286_0;
                                break L58;
                              } else {
                                stackOut_285_0 = 1;
                                stackIn_287_0 = stackOut_285_0;
                                break L58;
                              }
                            }
                            if (stackIn_287_0 != var5) {
                              L59: {
                                if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                  stackOut_291_0 = 0;
                                  stackIn_292_0 = stackOut_291_0;
                                  break L59;
                                } else {
                                  stackOut_290_0 = 1;
                                  stackIn_292_0 = stackOut_290_0;
                                  break L59;
                                }
                              }
                              return stackIn_292_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_283_0 = 0;
                            stackIn_294_0 = stackOut_283_0;
                            break L57;
                          }
                        } else {
                          stackOut_281_0 = 1;
                          stackIn_294_0 = stackOut_281_0;
                          break L57;
                        }
                      }
                      L60: {
                        var6 = stackIn_294_0;
                        if (var6 != 0) {
                          stackOut_296_0 = 0;
                          stackIn_297_0 = stackOut_296_0;
                          break L60;
                        } else {
                          stackOut_295_0 = 1;
                          stackIn_297_0 = stackOut_295_0;
                          break L60;
                        }
                      }
                      if (stackIn_297_0 != var5) {
                        L61: {
                          if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                            stackOut_301_0 = 0;
                            stackIn_302_0 = stackOut_301_0;
                            break L61;
                          } else {
                            stackOut_300_0 = 1;
                            stackIn_302_0 = stackOut_300_0;
                            break L61;
                          }
                        }
                        return stackIn_302_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    } else {
                      L62: {
                        if (param0.field_Hc <= ((hk) this).field_Hc) {
                          stackOut_250_0 = 0;
                          stackIn_251_0 = stackOut_250_0;
                          break L62;
                        } else {
                          stackOut_249_0 = 1;
                          stackIn_251_0 = stackOut_249_0;
                          break L62;
                        }
                      }
                      return stackIn_251_0 != 0;
                    }
                  }
                }
              }
            } else {
              L63: {
                stackOut_166_0 = param0.field_rc;
                stackIn_168_0 = stackOut_166_0;
                stackIn_167_0 = stackOut_166_0;
                if (((hk) this).field_rc) {
                  stackOut_168_0 = stackIn_168_0;
                  stackOut_168_1 = 0;
                  stackIn_169_0 = stackOut_168_0;
                  stackIn_169_1 = stackOut_168_1;
                  break L63;
                } else {
                  stackOut_167_0 = stackIn_167_0;
                  stackOut_167_1 = 1;
                  stackIn_169_0 = stackOut_167_0;
                  stackIn_169_1 = stackOut_167_1;
                  break L63;
                }
              }
              if ((stackIn_169_0 ? 1 : 0) == stackIn_169_1) {
                L64: {
                  if (((hk) this).field_rc) {
                    stackOut_173_0 = 0;
                    stackIn_174_0 = stackOut_173_0;
                    break L64;
                  } else {
                    stackOut_172_0 = 1;
                    stackIn_174_0 = stackOut_172_0;
                    break L64;
                  }
                }
                return stackIn_174_0 != 0;
              } else {
                if (((hk) this).field_rc) {
                  L65: {
                    if (!((hk) this).field_dc) {
                      if (-3 == (((hk) this).field_sc ^ -1)) {
                        L66: {
                          var5 = 1;
                          if (!param0.field_dc) {
                            if (2 == param0.field_sc) {
                              L67: {
                                var6 = 1;
                                if (var6 != 0) {
                                  stackOut_190_0 = 0;
                                  stackIn_191_0 = stackOut_190_0;
                                  break L67;
                                } else {
                                  stackOut_189_0 = 1;
                                  stackIn_191_0 = stackOut_189_0;
                                  break L67;
                                }
                              }
                              if (stackIn_191_0 != var5) {
                                L68: {
                                  if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                                    stackOut_195_0 = 0;
                                    stackIn_196_0 = stackOut_195_0;
                                    break L68;
                                  } else {
                                    stackOut_194_0 = 1;
                                    stackIn_196_0 = stackOut_194_0;
                                    break L68;
                                  }
                                }
                                return stackIn_196_0 != 0;
                              } else {
                                return var5 != 0;
                              }
                            } else {
                              stackOut_187_0 = 0;
                              stackIn_198_0 = stackOut_187_0;
                              break L66;
                            }
                          } else {
                            stackOut_185_0 = 1;
                            stackIn_198_0 = stackOut_185_0;
                            break L66;
                          }
                        }
                        L69: {
                          var6 = stackIn_198_0;
                          if (var6 != 0) {
                            stackOut_200_0 = 0;
                            stackIn_201_0 = stackOut_200_0;
                            break L69;
                          } else {
                            stackOut_199_0 = 1;
                            stackIn_201_0 = stackOut_199_0;
                            break L69;
                          }
                        }
                        if (stackIn_201_0 != var5) {
                          L70: {
                            if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                              stackOut_205_0 = 0;
                              stackIn_206_0 = stackOut_205_0;
                              break L70;
                            } else {
                              stackOut_204_0 = 1;
                              stackIn_206_0 = stackOut_204_0;
                              break L70;
                            }
                          }
                          return stackIn_206_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        stackOut_183_0 = 0;
                        stackIn_208_0 = stackOut_183_0;
                        break L65;
                      }
                    } else {
                      stackOut_181_0 = 1;
                      stackIn_208_0 = stackOut_181_0;
                      break L65;
                    }
                  }
                  L71: {
                    var5 = stackIn_208_0;
                    if (!param0.field_dc) {
                      if (2 == param0.field_sc) {
                        L72: {
                          var6 = 1;
                          if (var6 != 0) {
                            stackOut_214_0 = 0;
                            stackIn_215_0 = stackOut_214_0;
                            break L72;
                          } else {
                            stackOut_213_0 = 1;
                            stackIn_215_0 = stackOut_213_0;
                            break L72;
                          }
                        }
                        if (stackIn_215_0 != var5) {
                          L73: {
                            if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                              stackOut_219_0 = 0;
                              stackIn_220_0 = stackOut_219_0;
                              break L73;
                            } else {
                              stackOut_218_0 = 1;
                              stackIn_220_0 = stackOut_218_0;
                              break L73;
                            }
                          }
                          return stackIn_220_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        stackOut_211_0 = 0;
                        stackIn_222_0 = stackOut_211_0;
                        break L71;
                      }
                    } else {
                      stackOut_209_0 = 1;
                      stackIn_222_0 = stackOut_209_0;
                      break L71;
                    }
                  }
                  L74: {
                    var6 = stackIn_222_0;
                    if (var6 != 0) {
                      stackOut_224_0 = 0;
                      stackIn_225_0 = stackOut_224_0;
                      break L74;
                    } else {
                      stackOut_223_0 = 1;
                      stackIn_225_0 = stackOut_223_0;
                      break L74;
                    }
                  }
                  if (stackIn_225_0 != var5) {
                    L75: {
                      if ((((hk) this).field_Hc ^ -1L) >= (param0.field_Hc ^ -1L)) {
                        stackOut_229_0 = 0;
                        stackIn_230_0 = stackOut_229_0;
                        break L75;
                      } else {
                        stackOut_228_0 = 1;
                        stackIn_230_0 = stackOut_228_0;
                        break L75;
                      }
                    }
                    return stackIn_230_0 != 0;
                  } else {
                    return var5 != 0;
                  }
                } else {
                  L76: {
                    if (param0.field_Hc <= ((hk) this).field_Hc) {
                      stackOut_178_0 = 0;
                      stackIn_179_0 = stackOut_178_0;
                      break L76;
                    } else {
                      stackOut_177_0 = 1;
                      stackIn_179_0 = stackOut_177_0;
                      break L76;
                    }
                  }
                  return stackIn_179_0 != 0;
                }
              }
            }
          } else {
            return var3 != 0;
          }
        } else {
          return true;
        }
    }

    final int j(int param0) {
        if (param0 > -2) {
            boolean discarded$0 = ((hk) this).k(-29);
            return (int)((hk) this).d(94);
        }
        return (int)((hk) this).d(94);
    }

    hk(int param0) {
        super(0L, (gh) null);
        ((hk) this).field_Sb = new byte[param0];
    }

    final static void a(int param0, int param1, int param2) {
        pe.field_d = param1;
        jj.field_c = param0;
        if (param2 == 17237) {
            return;
        }
        field_Vb = null;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if (0 != var2) {
          if (-2 != (var2 ^ -1)) {
            if ((var2 ^ -1) != -3) {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (5 != var2) {
                    if (var2 != 6) {
                      if (var2 != -8) {
                        if (var2 != 8) {
                          if (-11 != var2) {
                            if (-10 != (var2 ^ -1)) {
                              if (var2 != 19) {
                                if (param0) {
                                  hk.d((byte) -31);
                                  return 17;
                                } else {
                                  return 17;
                                }
                              } else {
                                return 18;
                              }
                            } else {
                              return 16;
                            }
                          } else {
                            return 15;
                          }
                        } else {
                          return 15;
                        }
                      } else {
                        return 15;
                      }
                    } else {
                      return 14;
                    }
                  } else {
                    return 13;
                  }
                } else {
                  return 13;
                }
              } else {
                return 13;
              }
            } else {
              return 13;
            }
          } else {
            return 12;
          }
        } else {
          return 12;
        }
    }

    final static void a(byte param0, int param1) {
        ck var2 = null;
        int var3 = 0;
        cf var4 = null;
        var3 = SteelSentinels.field_G;
        var4 = (cf) (Object) jb.field_A.e(param0 ^ 13140);
        L0: while (true) {
          if (var4 == null) {
            var2 = ic.field_D.e(param0 ^ 13140);
            if (param0 != 86) {
              field_Yb = null;
              L1: while (true) {
                if (var2 != null) {
                  eh.a(param1, -17274);
                  var2 = ic.field_D.a((byte) -110);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              L2: while (true) {
                if (var2 != null) {
                  eh.a(param1, -17274);
                  var2 = ic.field_D.a((byte) -110);
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            ml.a(param0 ^ 87, var4, param1);
            var4 = (cf) (Object) jb.field_A.a((byte) -124);
            continue L0;
          }
        }
    }

    final boolean k(int param0) {
        if (param0 != 4219) {
            return false;
        }
        return !((hk) this).a((byte) 30) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kc = "Chat is currently disabled.";
        field_Jc = "Creating your account";
        field_Zb = new int[]{0, 50, 101, 151, 201, 251, 302, 352, 402, 452, 503, 553, 603, 653, 704, 754, 804, 854, 905, 955, 1005, 1056, 1106, 1156, 1206, 1257, 1307, 1357, 1407, 1458, 1508, 1558, 1608, 1659, 1709, 1759, 1809, 1860, 1910, 1960, 2010, 2061, 2111, 2161, 2211, 2261, 2312, 2362, 2412, 2462, 2513, 2563, 2613, 2663, 2714, 2764, 2814, 2864, 2914, 2965, 3015, 3065, 3115, 3165, 3216, 3266, 3316, 3366, 3417, 3467, 3517, 3567, 3617, 3667, 3718, 3768, 3818, 3868, 3918, 3969, 4019, 4069, 4119, 4169, 4219, 4270, 4320, 4370, 4420, 4470, 4520, 4570, 4621, 4671, 4721, 4771, 4821, 4871, 4921, 4972, 5022, 5072, 5122, 5172, 5222, 5272, 5322, 5372, 5422, 5473, 5523, 5573, 5623, 5673, 5723, 5773, 5823, 5873, 5923, 5973, 6023, 6073, 6123, 6173, 6224, 6274, 6324, 6374, 6424, 6474, 6524, 6574, 6624, 6674, 6724, 6774, 6824, 6874, 6924, 6974, 7024, 7074, 7124, 7174, 7224, 7273, 7323, 7373, 7423, 7473, 7523, 7573, 7623, 7673, 7723, 7773, 7823, 7873, 7923, 7972, 8022, 8072, 8122, 8172, 8222, 8272, 8322, 8371, 8421, 8471, 8521, 8571, 8621, 8670, 8720, 8770, 8820, 8870, 8919, 8969, 9019, 9069, 9119, 9168, 9218, 9268, 9318, 9367, 9417, 9467, 9517, 9566, 9616, 9666, 9716, 9765, 9815, 9865, 9914, 9964, 10014, 10063, 10113, 10163, 10212, 10262, 10312, 10361, 10411, 10461, 10510, 10560, 10609, 10659, 10709, 10758, 10808, 10857, 10907, 10956, 11006, 11056, 11105, 11155, 11204, 11254, 11303, 11353, 11402, 11452, 11501, 11551, 11600, 11650, 11699, 11749, 11798, 11847, 11897, 11946, 11996, 12045, 12095, 12144, 12193, 12243, 12292, 12341, 12391, 12440, 12490, 12539, 12588, 12638, 12687, 12736, 12785, 12835, 12884, 12933, 12983, 13032, 13081, 13130, 13180, 13229, 13278, 13327, 13376, 13426, 13475, 13524, 13573, 13622, 13672, 13721, 13770, 13819, 13868, 13917, 13966, 14016, 14065, 14114, 14163, 14212, 14261, 14310, 14359, 14408, 14457, 14506, 14555, 14604, 14653, 14702, 14751, 14800, 14849, 14898, 14947, 14996, 15045, 15094, 15143, 15192, 15240, 15289, 15338, 15387, 15436, 15485, 15534, 15582, 15631, 15680, 15729, 15778, 15826, 15875, 15924, 15973, 16021, 16070, 16119, 16168, 16216, 16265, 16314, 16362, 16411, 16460, 16508, 16557, 16606, 16654, 16703, 16751, 16800, 16849, 16897, 16946, 16994, 17043, 17091, 17140, 17188, 17237, 17285, 17334, 17382, 17431, 17479, 17528, 17576, 17625, 17673, 17721, 17770, 17818, 17867, 17915, 17963, 18012, 18060, 18108, 18156, 18205, 18253, 18301, 18350, 18398, 18446, 18494, 18543, 18591, 18639, 18687, 18735, 18783, 18832, 18880, 18928, 18976, 19024, 19072, 19120, 19168, 19216, 19264, 19313, 19361, 19409, 19457, 19505, 19553, 19600, 19648, 19696, 19744, 19792, 19840, 19888, 19936, 19984, 20032, 20080, 20127, 20175, 20223, 20271, 20319, 20366, 20414, 20462, 20510, 20557, 20605, 20653, 20701, 20748, 20796, 20844, 20891, 20939, 20987, 21034, 21082, 21129, 21177, 21224, 21272, 21320, 21367, 21415, 21462, 21510, 21557, 21604, 21652, 21699, 21747, 21794, 21842, 21889, 21936, 21984, 22031, 22078, 22126, 22173, 22220, 22268, 22315, 22362, 22409, 22457, 22504, 22551, 22598, 22645, 22693, 22740, 22787, 22834, 22881, 22928, 22975, 23022, 23069, 23116, 23163, 23210, 23257, 23304, 23351, 23398, 23445, 23492, 23539, 23586, 23633, 23680, 23727, 23774, 23820, 23867, 23914, 23961, 24008, 24054, 24101, 24148, 24195, 24241, 24288, 24335, 24381, 24428, 24475, 24521, 24568, 24614, 24661, 24708, 24754, 24801, 24847, 24894, 24940, 24987, 25033, 25080, 25126, 25172, 25219, 25265, 25312, 25358, 25404, 25451, 25497, 25543, 25589, 25636, 25682, 25728, 25774, 25821, 25867, 25913, 25959, 26005, 26051, 26098, 26144, 26190, 26236, 26282, 26328, 26374, 26420, 26466, 26512, 26558, 26604, 26650, 26696, 26742, 26787, 26833, 26879, 26925, 26971, 27017, 27062, 27108, 27154, 27200, 27245, 27291, 27337, 27382, 27428, 27474, 27519, 27565, 27611, 27656, 27702, 27747, 27793, 27838, 27884, 27929, 27975, 28020, 28066, 28111, 28156, 28202, 28247, 28293, 28338, 28383, 28429, 28474, 28519, 28564, 28610, 28655, 28700, 28745, 28790, 28835, 28881, 28926, 28971, 29016, 29061, 29106, 29151, 29196, 29241, 29286, 29331, 29376, 29421, 29466, 29511, 29555, 29600, 29645, 29690, 29735, 29780, 29824, 29869, 29914, 29959, 30003, 30048, 30093, 30137, 30182, 30226, 30271, 30316, 30360, 30405, 30449, 30494, 30538, 30583, 30627, 30672, 30716, 30760, 30805, 30849, 30893, 30938, 30982, 31026, 31071, 31115, 31159, 31203, 31248, 31292, 31336, 31380, 31424, 31468, 31512, 31556, 31600, 31644, 31688, 31732, 31776, 31820, 31864, 31908, 31952, 31996, 32040, 32084, 32127, 32171, 32215, 32259, 32303, 32346, 32390, 32434, 32477, 32521, 32565, 32608, 32652, 32695, 32739, 32783, 32826, 32870, 32913, 32956, 33000, 33043, 33087, 33130, 33173, 33217, 33260, 33303, 33347, 33390, 33433, 33476, 33520, 33563, 33606, 33649, 33692, 33735, 33778, 33821, 33865, 33908, 33951, 33994, 34037, 34079, 34122, 34165, 34208, 34251, 34294, 34337, 34380, 34422, 34465, 34508, 34551, 34593, 34636, 34679, 34721, 34764, 34806, 34849, 34892, 34934, 34977, 35019, 35062, 35104, 35146, 35189, 35231, 35274, 35316, 35358, 35401, 35443, 35485, 35527, 35570, 35612, 35654, 35696, 35738, 35781, 35823, 35865, 35907, 35949, 35991, 36033, 36075, 36117, 36159, 36201, 36243, 36284, 36326, 36368, 36410, 36452, 36493, 36535, 36577, 36619, 36660, 36702, 36744, 36785, 36827, 36868, 36910, 36951, 36993, 37034, 37076, 37117, 37159, 37200, 37241, 37283, 37324, 37365, 37407, 37448, 37489, 37530, 37572, 37613, 37654, 37695, 37736, 37777, 37818, 37859, 37900, 37941, 37982, 38023, 38064, 38105, 38146, 38187, 38228, 38269, 38309, 38350, 38391, 38432, 38472, 38513, 38554, 38594, 38635, 38675, 38716, 38757, 38797, 38838, 38878, 38919, 38959, 38999, 39040, 39080, 39120, 39161, 39201, 39241, 39282, 39322, 39362, 39402, 39442, 39482, 39523, 39563, 39603, 39643, 39683, 39723, 39763, 39803, 39843, 39882, 39922, 39962, 40002, 40042, 40082, 40121, 40161, 40201, 40241, 40280, 40320, 40359, 40399, 40439, 40478, 40518, 40557, 40597, 40636, 40675, 40715, 40754, 40794, 40833, 40872, 40912, 40951, 40990, 41029, 41068, 41108, 41147, 41186, 41225, 41264, 41303, 41342, 41381, 41420, 41459, 41498, 41537, 41576, 41614, 41653, 41692, 41731, 41770, 41808, 41847, 41886, 41924, 41963, 42002, 42040, 42079, 42117, 42156, 42194, 42233, 42271, 42309, 42348, 42386, 42424, 42463, 42501, 42539, 42578, 42616, 42654, 42692, 42730, 42768, 42806, 42844, 42882, 42920, 42958, 42996, 43034, 43072, 43110, 43148, 43186, 43223, 43261, 43299, 43337, 43374, 43412, 43450, 43487, 43525, 43562, 43600, 43638, 43675, 43713, 43750, 43787, 43825, 43862, 43899, 43937, 43974, 44011, 44049, 44086, 44123, 44160, 44197, 44234, 44271, 44308, 44345, 44382, 44419, 44456, 44493, 44530, 44567, 44604, 44641, 44677, 44714, 44751, 44788, 44824, 44861, 44898, 44934, 44971, 45007, 45044, 45080, 45117, 45153, 45190, 45226, 45262, 45299, 45335, 45371, 45408, 45444, 45480, 45516, 45552, 45589, 45625, 45661, 45697, 45733, 45769, 45805, 45841, 45877, 45912, 45948, 45984, 46020, 46056, 46091, 46127, 46163, 46199, 46234, 46270, 46305, 46341, 46376, 46412, 46447, 46483, 46518, 46554, 46589, 46624, 46660, 46695, 46730, 46765, 46801, 46836, 46871, 46906, 46941, 46976, 47011, 47046, 47081, 47116, 47151, 47186, 47221, 47256, 47291, 47325, 47360, 47395, 47430, 47464, 47499, 47534, 47568, 47603, 47637, 47672, 47706, 47741, 47775, 47809, 47844, 47878, 47912, 47947, 47981, 48015, 48049, 48084, 48118, 48152, 48186, 48220, 48254, 48288, 48322, 48356, 48390, 48424, 48458, 48491, 48525, 48559, 48593, 48626, 48660, 48694, 48727, 48761, 48795, 48828, 48862, 48895, 48929, 48962, 48995, 49029, 49062, 49095, 49129, 49162, 49195, 49228, 49262, 49295, 49328, 49361, 49394, 49427, 49460, 49493, 49526, 49559, 49592, 49624, 49657, 49690, 49723, 49756, 49788, 49821, 49854, 49886, 49919, 49951, 49984, 50016, 50049, 50081, 50114, 50146, 50178, 50211, 50243, 50275, 50307, 50340, 50372, 50404, 50436, 50468, 50500, 50532, 50564, 50596, 50628, 50660, 50692, 50724, 50756, 50787, 50819, 50851, 50882, 50914, 50946, 50977, 51009, 51041, 51072, 51104, 51135, 51166, 51198, 51229, 51260, 51292, 51323, 51354, 51386, 51417, 51448, 51479, 51510, 51541, 51572, 51603, 51634, 51665, 51696, 51727, 51758, 51789, 51819, 51850, 51881, 51911, 51942, 51973, 52003, 52034, 52065, 52095, 52126, 52156, 52186, 52217, 52247, 52277, 52308, 52338, 52368, 52398, 52429, 52459, 52489, 52519, 52549, 52579, 52609, 52639, 52669, 52699, 52729, 52759, 52788, 52818, 52848, 52878, 52907, 52937, 52967, 52996, 53026, 53055, 53085, 53114, 53144, 53173, 53202, 53232, 53261, 53290, 53319, 53349, 53378, 53407, 53436, 53465, 53494, 53523, 53552, 53581, 53610, 53639, 53668, 53697, 53726, 53754, 53783, 53812, 53840, 53869, 53898, 53926, 53955, 53983, 54012, 54040, 54069, 54097, 54125, 54154, 54182, 54210, 54239, 54267, 54295, 54323, 54351, 54379, 54407, 54435, 54463, 54491, 54519, 54547, 54575, 54603, 54630, 54658, 54686, 54714, 54741, 54769, 54796, 54824, 54852, 54879, 54906, 54934, 54961, 54989, 55016, 55043, 55071, 55098, 55125, 55152, 55179, 55206, 55233, 55260, 55288, 55314, 55341, 55368, 55395, 55422, 55449, 55476, 55502, 55529, 55556, 55582, 55609, 55636, 55662, 55689, 55715, 55742, 55768, 55794, 55821, 55847, 55873, 55900, 55926, 55952, 55978, 56004, 56030, 56056, 56082, 56108, 56134, 56160, 56186, 56212, 56238, 56264, 56289, 56315, 56341, 56367, 56392, 56418, 56443, 56469, 56494, 56520, 56545, 56571, 56596, 56621, 56647, 56672, 56697, 56722, 56747, 56773, 56798, 56823, 56848, 56873, 56898, 56923, 56948, 56972, 56997, 57022, 57047, 57072, 57096, 57121, 57145, 57170, 57195, 57219, 57244, 57268, 57293, 57317, 57341, 57366, 57390, 57414, 57438, 57463, 57487, 57511, 57535, 57559, 57583, 57607, 57631, 57655, 57679, 57703, 57726, 57750, 57774, 57798, 57821, 57845, 57869, 57892, 57916, 57939, 57963, 57986, 58009, 58033, 58056, 58079, 58103, 58126, 58149, 58172, 58195, 58219, 58242, 58265, 58288, 58311, 58334, 58356, 58379, 58402, 58425, 58448, 58470, 58493, 58516, 58538, 58561, 58583, 58606, 58628, 58651, 58673, 58696, 58718, 58740, 58763, 58785, 58807, 58829, 58851, 58873, 58896, 58918, 58940, 58962, 58983, 59005, 59027, 59049, 59071, 59093, 59114, 59136, 59158, 59179, 59201, 59222, 59244, 59265, 59287, 59308, 59330, 59351, 59372, 59393, 59415, 59436, 59457, 59478, 59499, 59520, 59541, 59562, 59583, 59604, 59625, 59646, 59667, 59687, 59708, 59729, 59750, 59770, 59791, 59811, 59832, 59852, 59873, 59893, 59914, 59934, 59954, 59975, 59995, 60015, 60035, 60055, 60075, 60096, 60116, 60136, 60156, 60175, 60195, 60215, 60235, 60255, 60275, 60294, 60314, 60334, 60353, 60373, 60392, 60412, 60431, 60451, 60470, 60490, 60509, 60528, 60547, 60567, 60586, 60605, 60624, 60643, 60662, 60681, 60700, 60719, 60738, 60757, 60776, 60794, 60813, 60832, 60851, 60869, 60888, 60906, 60925, 60943, 60962, 60980, 60999, 61017, 61035, 61054, 61072, 61090, 61108, 61127, 61145, 61163, 61181, 61199, 61217, 61235, 61253, 61270, 61288, 61306, 61324, 61341, 61359, 61377, 61394, 61412, 61429, 61447, 61464, 61482, 61499, 61517, 61534, 61551, 61568, 61586, 61603, 61620, 61637, 61654, 61671, 61688, 61705, 61722, 61739, 61756, 61772, 61789, 61806, 61823, 61839, 61856, 61873, 61889, 61906, 61922, 61939, 61955, 61971, 61988, 62004, 62020, 62036, 62053, 62069, 62085, 62101, 62117, 62133, 62149, 62165, 62181, 62197, 62212, 62228, 62244, 62260, 62275, 62291, 62307, 62322, 62338, 62353, 62369, 62384, 62400, 62415, 62430, 62445, 62461, 62476, 62491, 62506, 62521, 62536, 62551, 62566, 62581, 62596, 62611, 62626, 62641, 62655, 62670, 62685, 62699, 62714, 62729, 62743, 62758, 62772, 62787, 62801, 62815, 62830, 62844, 62858, 62872, 62886, 62901, 62915, 62929, 62943, 62957, 62971, 62985, 62998, 63012, 63026, 63040, 63054, 63067, 63081, 63095, 63108, 63122, 63135, 63149, 63162, 63175, 63189, 63202, 63215, 63229, 63242, 63255, 63268, 63281, 63294, 63307, 63320, 63333, 63346, 63359, 63372, 63385, 63397, 63410, 63423, 63435, 63448, 63461, 63473, 63486, 63498, 63510, 63523, 63535, 63547, 63560, 63572, 63584, 63596, 63608, 63621, 63633, 63645, 63657, 63668, 63680, 63692, 63704, 63716, 63728, 63739, 63751, 63763, 63774, 63786, 63797, 63809, 63820, 63832, 63843, 63854, 63866, 63877, 63888, 63899, 63910, 63922, 63933, 63944, 63955, 63966, 63976, 63987, 63998, 64009, 64020, 64031, 64041, 64052, 64062, 64073, 64084, 64094, 64105, 64115, 64125, 64136, 64146, 64156, 64167, 64177, 64187, 64197, 64207, 64217, 64227, 64237, 64247, 64257, 64267, 64277, 64287, 64296, 64306, 64316, 64325, 64335, 64344, 64354, 64363, 64373, 64382, 64392, 64401, 64410, 64420, 64429, 64438, 64447, 64456, 64465, 64474, 64483, 64492, 64501, 64510, 64519, 64528, 64536, 64545, 64554, 64563, 64571, 64580, 64588, 64597, 64605, 64614, 64622, 64630, 64639, 64647, 64655, 64663, 64672, 64680, 64688, 64696, 64704, 64712, 64720, 64728, 64735, 64743, 64751, 64759, 64766, 64774, 64782, 64789, 64797, 64804, 64812, 64819, 64827, 64834, 64841, 64849, 64856, 64863, 64870, 64877, 64884, 64892, 64899, 64905, 64912, 64919, 64926, 64933, 64940, 64947, 64953, 64960, 64967, 64973, 64980, 64986, 64993, 64999, 65006, 65012, 65018, 65025, 65031, 65037, 65043, 65049, 65055, 65061, 65067, 65073, 65079, 65085, 65091, 65097, 65103, 65109, 65114, 65120, 65126, 65131, 65137, 65142, 65148, 65153, 65159, 65164, 65169, 65175, 65180, 65185, 65190, 65195, 65200, 65205, 65210, 65215, 65220, 65225, 65230, 65235, 65240, 65245, 65249, 65254, 65259, 65263, 65268, 65272, 65277, 65281, 65286, 65290, 65294, 65299, 65303, 65307, 65311, 65315, 65320, 65324, 65328, 65332, 65336, 65339, 65343, 65347, 65351, 65355, 65358, 65362, 65366, 65369, 65373, 65376, 65380, 65383, 65387, 65390, 65393, 65397, 65400, 65403, 65406, 65410, 65413, 65416, 65419, 65422, 65425, 65428, 65430, 65433, 65436, 65439, 65442, 65444, 65447, 65449, 65452, 65455, 65457, 65460, 65462, 65464, 65467, 65469, 65471, 65473, 65476, 65478, 65480, 65482, 65484, 65486, 65488, 65490, 65492, 65493, 65495, 65497, 65499, 65500, 65502, 65504, 65505, 65507, 65508, 65510, 65511, 65512, 65514, 65515, 65516, 65517, 65519, 65520, 65521, 65522, 65523, 65524, 65525, 65526, 65527, 65527, 65528, 65529, 65530, 65530, 65531, 65532, 65532, 65533, 65533, 65534, 65534, 65534, 65535, 65535, 65535, 65536, 65536, 65536, 65536, 65536, 65536};
        field_pc = "Energy loss";
        field_Yb = "No spectators";
        field_Vb = new int[]{108, 71, 33, 28, 4, 9, 14, 17, -1, -1, -1, -1};
        field_jc = "CALAMITY IN <%0> SECONDS";
    }
}
