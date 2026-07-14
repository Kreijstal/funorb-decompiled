/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends sna {
    sna field_wb;
    sna field_xb;
    sna field_Ib;
    static String field_Vb;
    boolean field_Bb;
    boolean field_Fb;
    long field_Sb;
    int field_Pb;
    sna field_ac;
    sna field_Tb;
    sna field_Qb;
    sna field_yb;
    sna field_Hb;
    String[] field_Cb;
    sna field_cc;
    sna field_Ub;
    boolean field_gc;
    static kv[][] field_Xb;
    sna field_hc;
    byte[] field_Eb;
    long field_Ob;
    sna field_Yb;
    sna field_Gb;
    boolean field_Zb;
    sna field_vb;
    boolean field_dc;
    sna field_Db;
    String field_Jb;
    sna field_fc;
    int field_Rb;
    int field_Lb;
    boolean field_Wb;
    int field_Mb;
    int field_Kb;
    sna[] field_Ab;
    boolean field_zb;
    int field_ec;
    int field_bc;
    int field_Nb;

    public static void g(byte param0) {
        if (param0 <= 32) {
            field_Vb = null;
            field_Vb = null;
            field_Xb = null;
            return;
        }
        field_Vb = null;
        field_Xb = null;
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = qi.a(param0, (byte) 90);
        if (param1 != -7) {
          L0: {
            uha.g((byte) 6);
            if (-2 == param0.b(16711935)) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return (pp) (Object) new mh(var2, var3 != 0);
        } else {
          L1: {
            if (-2 == param0.b(16711935)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return (pp) (Object) new mh(var2, var3 != 0);
        }
    }

    final boolean a(int param0, uha param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_195_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_234_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        int stackIn_244_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_264_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_287_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_297_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_305_0 = 0;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        int stackIn_311_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_314_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_316_1 = 0;
        int stackIn_321_0 = 0;
        int stackIn_326_0 = 0;
        int stackIn_332_0 = 0;
        int stackIn_333_0 = 0;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        int stackIn_339_0 = 0;
        int stackIn_342_0 = 0;
        int stackIn_343_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_345_0 = 0;
        int stackIn_345_1 = 0;
        int stackIn_350_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_356_0 = 0;
        int stackIn_357_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_363_0 = 0;
        int stackIn_366_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_369_0 = 0;
        int stackIn_369_1 = 0;
        int stackIn_374_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_251_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_258_1 = 0;
        int stackOut_257_0 = 0;
        int stackOut_257_1 = 0;
        int stackOut_263_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_351_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_340_0 = 0;
        int stackOut_341_0 = 0;
        int stackOut_331_0 = 0;
        int stackOut_333_0 = 0;
        int stackOut_333_1 = 0;
        int stackOut_332_0 = 0;
        int stackOut_332_1 = 0;
        int stackOut_338_0 = 0;
        int stackOut_337_0 = 0;
        int stackOut_342_0 = 0;
        int stackOut_344_0 = 0;
        int stackOut_344_1 = 0;
        int stackOut_343_0 = 0;
        int stackOut_343_1 = 0;
        int stackOut_349_0 = 0;
        int stackOut_348_0 = 0;
        int stackOut_364_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_357_0 = 0;
        int stackOut_357_1 = 0;
        int stackOut_356_0 = 0;
        int stackOut_356_1 = 0;
        int stackOut_362_0 = 0;
        int stackOut_361_0 = 0;
        int stackOut_366_0 = 0;
        int stackOut_368_0 = 0;
        int stackOut_368_1 = 0;
        int stackOut_367_0 = 0;
        int stackOut_367_1 = 0;
        int stackOut_373_0 = 0;
        int stackOut_372_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_281_1 = 0;
        int stackOut_280_0 = 0;
        int stackOut_280_1 = 0;
        int stackOut_286_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_276_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_291_1 = 0;
        int stackOut_290_0 = 0;
        int stackOut_290_1 = 0;
        int stackOut_296_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_303_0 = 0;
        int stackOut_305_0 = 0;
        int stackOut_305_1 = 0;
        int stackOut_304_0 = 0;
        int stackOut_304_1 = 0;
        int stackOut_310_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_313_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_315_1 = 0;
        int stackOut_314_0 = 0;
        int stackOut_314_1 = 0;
        int stackOut_320_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_268_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_213_0 = 0;
        int stackOut_213_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_227_0 = 0;
        int stackOut_227_1 = 0;
        int stackOut_233_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_238_1 = 0;
        int stackOut_237_0 = 0;
        int stackOut_237_1 = 0;
        int stackOut_243_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        L0: {
          if (!((uha) this).field_Wb) {
            if (-7 == ((uha) this).field_ec) {
              L1: {
                var3 = 1;
                if (!param1.field_Wb) {
                  if (-7 == param1.field_ec) {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_10_0 = stackOut_7_0;
                    break L1;
                  }
                } else {
                  stackOut_5_0 = 1;
                  stackIn_10_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var4 = stackIn_10_0;
                stackOut_10_0 = var4;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var3 != 0) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L2;
                }
              }
              if (stackIn_13_0 == stackIn_13_1) {
                return var3 != 0;
              } else {
                L3: {
                  if (var3 == 0) {
                    if (param1.field_zb == ((uha) this).field_zb) {
                      if (!((uha) this).field_zb) {
                        break L3;
                      } else {
                        if (((uha) this).field_Kb == param1.field_Kb) {
                          break L3;
                        } else {
                          L4: {
                            if (((uha) this).field_Kb >= param1.field_Kb) {
                              stackOut_24_0 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              break L4;
                            } else {
                              stackOut_23_0 = 1;
                              stackIn_25_0 = stackOut_23_0;
                              break L4;
                            }
                          }
                          return stackIn_25_0 != 0;
                        }
                      }
                    } else {
                      return ((uha) this).field_zb;
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (param1.field_Zb) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L5;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L5;
                  }
                }
                L6: {
                  stackOut_29_0 = stackIn_29_0;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (((uha) this).field_Zb) {
                    stackOut_31_0 = stackIn_31_0;
                    stackOut_31_1 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L6;
                  } else {
                    stackOut_30_0 = stackIn_30_0;
                    stackOut_30_1 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L6;
                  }
                }
                if (stackIn_32_0 != stackIn_32_1) {
                  L7: {
                    if (((uha) this).field_Zb) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L7;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L7;
                    }
                  }
                  return stackIn_37_0 != 0;
                } else {
                  L8: {
                    if (param0 == -7) {
                      break L8;
                    } else {
                      var7 = null;
                      pp discarded$4 = uha.b((lu) null, -6);
                      break L8;
                    }
                  }
                  if (((uha) this).field_Zb) {
                    L9: {
                      if (!((uha) this).field_Fb) {
                        if (2 == ((uha) this).field_Lb) {
                          stackOut_49_0 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L9;
                        } else {
                          stackOut_48_0 = 0;
                          stackIn_51_0 = stackOut_48_0;
                          break L9;
                        }
                      } else {
                        stackOut_46_0 = 1;
                        stackIn_51_0 = stackOut_46_0;
                        break L9;
                      }
                    }
                    L10: {
                      var5 = stackIn_51_0;
                      if (param1.field_Fb) {
                        stackOut_55_0 = 1;
                        stackIn_57_0 = stackOut_55_0;
                        break L10;
                      } else {
                        if (2 == param1.field_Lb) {
                          stackOut_54_0 = 1;
                          stackIn_57_0 = stackOut_54_0;
                          break L10;
                        } else {
                          stackOut_53_0 = 0;
                          stackIn_57_0 = stackOut_53_0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      var6 = stackIn_57_0;
                      stackOut_57_0 = var5;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_58_0 = stackOut_57_0;
                      if (var6 != 0) {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        break L11;
                      } else {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        break L11;
                      }
                    }
                    if (stackIn_60_0 == stackIn_60_1) {
                      return var5 != 0;
                    } else {
                      L12: {
                        if (((uha) this).field_Ob <= param1.field_Ob) {
                          stackOut_63_0 = 0;
                          stackIn_64_0 = stackOut_63_0;
                          break L12;
                        } else {
                          stackOut_62_0 = 1;
                          stackIn_64_0 = stackOut_62_0;
                          break L12;
                        }
                      }
                      return stackIn_64_0 != 0;
                    }
                  } else {
                    L13: {
                      if (((uha) this).field_Ob >= param1.field_Ob) {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    return stackIn_44_0 != 0;
                  }
                }
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_67_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_67_0 = stackOut_1_0;
            break L0;
          }
        }
        L14: {
          var3 = stackIn_67_0;
          if (!param1.field_Wb) {
            if (-7 == (param1.field_ec ^ -1)) {
              L15: {
                var4 = 1;
                stackOut_71_0 = var4;
                stackIn_73_0 = stackOut_71_0;
                stackIn_72_0 = stackOut_71_0;
                if (var3 != 0) {
                  stackOut_73_0 = stackIn_73_0;
                  stackOut_73_1 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  break L15;
                } else {
                  stackOut_72_0 = stackIn_72_0;
                  stackOut_72_1 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  break L15;
                }
              }
              if (stackIn_74_0 == stackIn_74_1) {
                return var3 != 0;
              } else {
                L16: {
                  if (var3 == 0) {
                    if (param1.field_zb == ((uha) this).field_zb) {
                      if (!((uha) this).field_zb) {
                        break L16;
                      } else {
                        if (((uha) this).field_Kb == param1.field_Kb) {
                          break L16;
                        } else {
                          L17: {
                            if (((uha) this).field_Kb >= param1.field_Kb) {
                              stackOut_85_0 = 0;
                              stackIn_86_0 = stackOut_85_0;
                              break L17;
                            } else {
                              stackOut_84_0 = 1;
                              stackIn_86_0 = stackOut_84_0;
                              break L17;
                            }
                          }
                          return stackIn_86_0 != 0;
                        }
                      }
                    } else {
                      return ((uha) this).field_zb;
                    }
                  } else {
                    break L16;
                  }
                }
                L18: {
                  if (param1.field_Zb) {
                    stackOut_89_0 = 0;
                    stackIn_90_0 = stackOut_89_0;
                    break L18;
                  } else {
                    stackOut_88_0 = 1;
                    stackIn_90_0 = stackOut_88_0;
                    break L18;
                  }
                }
                L19: {
                  stackOut_90_0 = stackIn_90_0;
                  stackIn_92_0 = stackOut_90_0;
                  stackIn_91_0 = stackOut_90_0;
                  if (((uha) this).field_Zb) {
                    stackOut_92_0 = stackIn_92_0;
                    stackOut_92_1 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    break L19;
                  } else {
                    stackOut_91_0 = stackIn_91_0;
                    stackOut_91_1 = 1;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    break L19;
                  }
                }
                if (stackIn_93_0 != stackIn_93_1) {
                  L20: {
                    if (((uha) this).field_Zb) {
                      stackOut_97_0 = 0;
                      stackIn_98_0 = stackOut_97_0;
                      break L20;
                    } else {
                      stackOut_96_0 = 1;
                      stackIn_98_0 = stackOut_96_0;
                      break L20;
                    }
                  }
                  return stackIn_98_0 != 0;
                } else {
                  L21: {
                    if (param0 == -7) {
                      break L21;
                    } else {
                      var7 = null;
                      pp discarded$5 = uha.b((lu) null, -6);
                      break L21;
                    }
                  }
                  if (((uha) this).field_Zb) {
                    if (!((uha) this).field_Fb) {
                      L22: {
                        if (2 != ((uha) this).field_Lb) {
                          stackOut_125_0 = 0;
                          stackIn_126_0 = stackOut_125_0;
                          break L22;
                        } else {
                          stackOut_124_0 = 1;
                          stackIn_126_0 = stackOut_124_0;
                          break L22;
                        }
                      }
                      var5 = stackIn_126_0;
                      if (!param1.field_Fb) {
                        L23: {
                          if (2 != param1.field_Lb) {
                            stackOut_139_0 = 0;
                            stackIn_140_0 = stackOut_139_0;
                            break L23;
                          } else {
                            stackOut_138_0 = 1;
                            stackIn_140_0 = stackOut_138_0;
                            break L23;
                          }
                        }
                        L24: {
                          var6 = stackIn_140_0;
                          stackOut_140_0 = var5;
                          stackIn_142_0 = stackOut_140_0;
                          stackIn_141_0 = stackOut_140_0;
                          if (var6 != 0) {
                            stackOut_142_0 = stackIn_142_0;
                            stackOut_142_1 = 0;
                            stackIn_143_0 = stackOut_142_0;
                            stackIn_143_1 = stackOut_142_1;
                            break L24;
                          } else {
                            stackOut_141_0 = stackIn_141_0;
                            stackOut_141_1 = 1;
                            stackIn_143_0 = stackOut_141_0;
                            stackIn_143_1 = stackOut_141_1;
                            break L24;
                          }
                        }
                        if (stackIn_143_0 != stackIn_143_1) {
                          L25: {
                            if (((uha) this).field_Ob <= param1.field_Ob) {
                              stackOut_147_0 = 0;
                              stackIn_148_0 = stackOut_147_0;
                              break L25;
                            } else {
                              stackOut_146_0 = 1;
                              stackIn_148_0 = stackOut_146_0;
                              break L25;
                            }
                          }
                          return stackIn_148_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        L26: {
                          var6 = 1;
                          stackOut_127_0 = var5;
                          stackIn_129_0 = stackOut_127_0;
                          stackIn_128_0 = stackOut_127_0;
                          if (var6 != 0) {
                            stackOut_129_0 = stackIn_129_0;
                            stackOut_129_1 = 0;
                            stackIn_130_0 = stackOut_129_0;
                            stackIn_130_1 = stackOut_129_1;
                            break L26;
                          } else {
                            stackOut_128_0 = stackIn_128_0;
                            stackOut_128_1 = 1;
                            stackIn_130_0 = stackOut_128_0;
                            stackIn_130_1 = stackOut_128_1;
                            break L26;
                          }
                        }
                        if (stackIn_130_0 == stackIn_130_1) {
                          return var5 != 0;
                        } else {
                          L27: {
                            if (((uha) this).field_Ob <= param1.field_Ob) {
                              stackOut_133_0 = 0;
                              stackIn_134_0 = stackOut_133_0;
                              break L27;
                            } else {
                              stackOut_132_0 = 1;
                              stackIn_134_0 = stackOut_132_0;
                              break L27;
                            }
                          }
                          return stackIn_134_0 != 0;
                        }
                      }
                    } else {
                      L28: {
                        var5 = 1;
                        if (param1.field_Fb) {
                          stackOut_111_0 = 1;
                          stackIn_113_0 = stackOut_111_0;
                          break L28;
                        } else {
                          if (2 == param1.field_Lb) {
                            stackOut_110_0 = 1;
                            stackIn_113_0 = stackOut_110_0;
                            break L28;
                          } else {
                            stackOut_109_0 = 0;
                            stackIn_113_0 = stackOut_109_0;
                            break L28;
                          }
                        }
                      }
                      L29: {
                        var6 = stackIn_113_0;
                        stackOut_113_0 = var5;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_114_0 = stackOut_113_0;
                        if (var6 != 0) {
                          stackOut_115_0 = stackIn_115_0;
                          stackOut_115_1 = 0;
                          stackIn_116_0 = stackOut_115_0;
                          stackIn_116_1 = stackOut_115_1;
                          break L29;
                        } else {
                          stackOut_114_0 = stackIn_114_0;
                          stackOut_114_1 = 1;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          break L29;
                        }
                      }
                      if (stackIn_116_0 == stackIn_116_1) {
                        return var5 != 0;
                      } else {
                        L30: {
                          if (((uha) this).field_Ob <= param1.field_Ob) {
                            stackOut_119_0 = 0;
                            stackIn_120_0 = stackOut_119_0;
                            break L30;
                          } else {
                            stackOut_118_0 = 1;
                            stackIn_120_0 = stackOut_118_0;
                            break L30;
                          }
                        }
                        return stackIn_120_0 != 0;
                      }
                    }
                  } else {
                    L31: {
                      if (((uha) this).field_Ob >= param1.field_Ob) {
                        stackOut_104_0 = 0;
                        stackIn_105_0 = stackOut_104_0;
                        break L31;
                      } else {
                        stackOut_103_0 = 1;
                        stackIn_105_0 = stackOut_103_0;
                        break L31;
                      }
                    }
                    return stackIn_105_0 != 0;
                  }
                }
              }
            } else {
              stackOut_70_0 = 0;
              stackIn_150_0 = stackOut_70_0;
              break L14;
            }
          } else {
            stackOut_68_0 = 1;
            stackIn_150_0 = stackOut_68_0;
            break L14;
          }
        }
        L32: {
          var4 = stackIn_150_0;
          stackOut_150_0 = var4;
          stackIn_152_0 = stackOut_150_0;
          stackIn_151_0 = stackOut_150_0;
          if (var3 != 0) {
            stackOut_152_0 = stackIn_152_0;
            stackOut_152_1 = 0;
            stackIn_153_0 = stackOut_152_0;
            stackIn_153_1 = stackOut_152_1;
            break L32;
          } else {
            stackOut_151_0 = stackIn_151_0;
            stackOut_151_1 = 1;
            stackIn_153_0 = stackOut_151_0;
            stackIn_153_1 = stackOut_151_1;
            break L32;
          }
        }
        if (stackIn_153_0 == stackIn_153_1) {
          return var3 != 0;
        } else {
          if (var3 == 0) {
            if (param1.field_zb == ((uha) this).field_zb) {
              L33: {
                if (!((uha) this).field_zb) {
                  break L33;
                } else {
                  if (((uha) this).field_Kb == param1.field_Kb) {
                    break L33;
                  } else {
                    L34: {
                      if (((uha) this).field_Kb >= param1.field_Kb) {
                        stackOut_251_0 = 0;
                        stackIn_252_0 = stackOut_251_0;
                        break L34;
                      } else {
                        stackOut_250_0 = 1;
                        stackIn_252_0 = stackOut_250_0;
                        break L34;
                      }
                    }
                    return stackIn_252_0 != 0;
                  }
                }
              }
              L35: {
                if (param1.field_Zb) {
                  stackOut_255_0 = 0;
                  stackIn_256_0 = stackOut_255_0;
                  break L35;
                } else {
                  stackOut_254_0 = 1;
                  stackIn_256_0 = stackOut_254_0;
                  break L35;
                }
              }
              L36: {
                stackOut_256_0 = stackIn_256_0;
                stackIn_258_0 = stackOut_256_0;
                stackIn_257_0 = stackOut_256_0;
                if (((uha) this).field_Zb) {
                  stackOut_258_0 = stackIn_258_0;
                  stackOut_258_1 = 0;
                  stackIn_259_0 = stackOut_258_0;
                  stackIn_259_1 = stackOut_258_1;
                  break L36;
                } else {
                  stackOut_257_0 = stackIn_257_0;
                  stackOut_257_1 = 1;
                  stackIn_259_0 = stackOut_257_0;
                  stackIn_259_1 = stackOut_257_1;
                  break L36;
                }
              }
              if (stackIn_259_0 != stackIn_259_1) {
                L37: {
                  if (((uha) this).field_Zb) {
                    stackOut_263_0 = 0;
                    stackIn_264_0 = stackOut_263_0;
                    break L37;
                  } else {
                    stackOut_262_0 = 1;
                    stackIn_264_0 = stackOut_262_0;
                    break L37;
                  }
                }
                return stackIn_264_0 != 0;
              } else {
                if (param0 == -7) {
                  if (((uha) this).field_Zb) {
                    L38: {
                      if (((uha) this).field_Fb) {
                        stackOut_351_0 = 1;
                        stackIn_353_0 = stackOut_351_0;
                        break L38;
                      } else {
                        if (2 != ((uha) this).field_Lb) {
                          stackOut_352_0 = 0;
                          stackIn_353_0 = stackOut_352_0;
                          break L38;
                        } else {
                          L39: {
                            var5 = 1;
                            if (param1.field_Fb) {
                              stackOut_340_0 = 1;
                              stackIn_342_0 = stackOut_340_0;
                              break L39;
                            } else {
                              if (2 != param1.field_Lb) {
                                stackOut_341_0 = 0;
                                stackIn_342_0 = stackOut_341_0;
                                break L39;
                              } else {
                                L40: {
                                  var6 = 1;
                                  stackOut_331_0 = var5;
                                  stackIn_333_0 = stackOut_331_0;
                                  stackIn_332_0 = stackOut_331_0;
                                  if (var6 != 0) {
                                    stackOut_333_0 = stackIn_333_0;
                                    stackOut_333_1 = 0;
                                    stackIn_334_0 = stackOut_333_0;
                                    stackIn_334_1 = stackOut_333_1;
                                    break L40;
                                  } else {
                                    stackOut_332_0 = stackIn_332_0;
                                    stackOut_332_1 = 1;
                                    stackIn_334_0 = stackOut_332_0;
                                    stackIn_334_1 = stackOut_332_1;
                                    break L40;
                                  }
                                }
                                if (stackIn_334_0 != stackIn_334_1) {
                                  L41: {
                                    if (((uha) this).field_Ob <= param1.field_Ob) {
                                      stackOut_338_0 = 0;
                                      stackIn_339_0 = stackOut_338_0;
                                      break L41;
                                    } else {
                                      stackOut_337_0 = 1;
                                      stackIn_339_0 = stackOut_337_0;
                                      break L41;
                                    }
                                  }
                                  return stackIn_339_0 != 0;
                                } else {
                                  return var5 != 0;
                                }
                              }
                            }
                          }
                          L42: {
                            var6 = stackIn_342_0;
                            stackOut_342_0 = var5;
                            stackIn_344_0 = stackOut_342_0;
                            stackIn_343_0 = stackOut_342_0;
                            if (var6 != 0) {
                              stackOut_344_0 = stackIn_344_0;
                              stackOut_344_1 = 0;
                              stackIn_345_0 = stackOut_344_0;
                              stackIn_345_1 = stackOut_344_1;
                              break L42;
                            } else {
                              stackOut_343_0 = stackIn_343_0;
                              stackOut_343_1 = 1;
                              stackIn_345_0 = stackOut_343_0;
                              stackIn_345_1 = stackOut_343_1;
                              break L42;
                            }
                          }
                          if (stackIn_345_0 != stackIn_345_1) {
                            L43: {
                              if (((uha) this).field_Ob <= param1.field_Ob) {
                                stackOut_349_0 = 0;
                                stackIn_350_0 = stackOut_349_0;
                                break L43;
                              } else {
                                stackOut_348_0 = 1;
                                stackIn_350_0 = stackOut_348_0;
                                break L43;
                              }
                            }
                            return stackIn_350_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        }
                      }
                    }
                    L44: {
                      var5 = stackIn_353_0;
                      if (param1.field_Fb) {
                        stackOut_364_0 = 1;
                        stackIn_366_0 = stackOut_364_0;
                        break L44;
                      } else {
                        if (2 != param1.field_Lb) {
                          stackOut_365_0 = 0;
                          stackIn_366_0 = stackOut_365_0;
                          break L44;
                        } else {
                          L45: {
                            var6 = 1;
                            stackOut_355_0 = var5;
                            stackIn_357_0 = stackOut_355_0;
                            stackIn_356_0 = stackOut_355_0;
                            if (var6 != 0) {
                              stackOut_357_0 = stackIn_357_0;
                              stackOut_357_1 = 0;
                              stackIn_358_0 = stackOut_357_0;
                              stackIn_358_1 = stackOut_357_1;
                              break L45;
                            } else {
                              stackOut_356_0 = stackIn_356_0;
                              stackOut_356_1 = 1;
                              stackIn_358_0 = stackOut_356_0;
                              stackIn_358_1 = stackOut_356_1;
                              break L45;
                            }
                          }
                          if (stackIn_358_0 != stackIn_358_1) {
                            L46: {
                              if (((uha) this).field_Ob <= param1.field_Ob) {
                                stackOut_362_0 = 0;
                                stackIn_363_0 = stackOut_362_0;
                                break L46;
                              } else {
                                stackOut_361_0 = 1;
                                stackIn_363_0 = stackOut_361_0;
                                break L46;
                              }
                            }
                            return stackIn_363_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        }
                      }
                    }
                    L47: {
                      var6 = stackIn_366_0;
                      stackOut_366_0 = var5;
                      stackIn_368_0 = stackOut_366_0;
                      stackIn_367_0 = stackOut_366_0;
                      if (var6 != 0) {
                        stackOut_368_0 = stackIn_368_0;
                        stackOut_368_1 = 0;
                        stackIn_369_0 = stackOut_368_0;
                        stackIn_369_1 = stackOut_368_1;
                        break L47;
                      } else {
                        stackOut_367_0 = stackIn_367_0;
                        stackOut_367_1 = 1;
                        stackIn_369_0 = stackOut_367_0;
                        stackIn_369_1 = stackOut_367_1;
                        break L47;
                      }
                    }
                    if (stackIn_369_0 != stackIn_369_1) {
                      L48: {
                        if (((uha) this).field_Ob <= param1.field_Ob) {
                          stackOut_373_0 = 0;
                          stackIn_374_0 = stackOut_373_0;
                          break L48;
                        } else {
                          stackOut_372_0 = 1;
                          stackIn_374_0 = stackOut_372_0;
                          break L48;
                        }
                      }
                      return stackIn_374_0 != 0;
                    } else {
                      return var5 != 0;
                    }
                  } else {
                    L49: {
                      if (((uha) this).field_Ob >= param1.field_Ob) {
                        stackOut_325_0 = 0;
                        stackIn_326_0 = stackOut_325_0;
                        break L49;
                      } else {
                        stackOut_324_0 = 1;
                        stackIn_326_0 = stackOut_324_0;
                        break L49;
                      }
                    }
                    return stackIn_326_0 != 0;
                  }
                } else {
                  var7 = null;
                  pp discarded$6 = uha.b((lu) null, -6);
                  if (((uha) this).field_Zb) {
                    L50: {
                      if (!((uha) this).field_Fb) {
                        if (2 == ((uha) this).field_Lb) {
                          L51: {
                            var5 = 1;
                            if (!param1.field_Fb) {
                              if (2 == param1.field_Lb) {
                                L52: {
                                  var6 = 1;
                                  stackOut_279_0 = var5;
                                  stackIn_281_0 = stackOut_279_0;
                                  stackIn_280_0 = stackOut_279_0;
                                  if (var6 != 0) {
                                    stackOut_281_0 = stackIn_281_0;
                                    stackOut_281_1 = 0;
                                    stackIn_282_0 = stackOut_281_0;
                                    stackIn_282_1 = stackOut_281_1;
                                    break L52;
                                  } else {
                                    stackOut_280_0 = stackIn_280_0;
                                    stackOut_280_1 = 1;
                                    stackIn_282_0 = stackOut_280_0;
                                    stackIn_282_1 = stackOut_280_1;
                                    break L52;
                                  }
                                }
                                if (stackIn_282_0 != stackIn_282_1) {
                                  L53: {
                                    if (((uha) this).field_Ob <= param1.field_Ob) {
                                      stackOut_286_0 = 0;
                                      stackIn_287_0 = stackOut_286_0;
                                      break L53;
                                    } else {
                                      stackOut_285_0 = 1;
                                      stackIn_287_0 = stackOut_285_0;
                                      break L53;
                                    }
                                  }
                                  return stackIn_287_0 != 0;
                                } else {
                                  return var5 != 0;
                                }
                              } else {
                                stackOut_278_0 = 0;
                                stackIn_289_0 = stackOut_278_0;
                                break L51;
                              }
                            } else {
                              stackOut_276_0 = 1;
                              stackIn_289_0 = stackOut_276_0;
                              break L51;
                            }
                          }
                          L54: {
                            var6 = stackIn_289_0;
                            stackOut_289_0 = var5;
                            stackIn_291_0 = stackOut_289_0;
                            stackIn_290_0 = stackOut_289_0;
                            if (var6 != 0) {
                              stackOut_291_0 = stackIn_291_0;
                              stackOut_291_1 = 0;
                              stackIn_292_0 = stackOut_291_0;
                              stackIn_292_1 = stackOut_291_1;
                              break L54;
                            } else {
                              stackOut_290_0 = stackIn_290_0;
                              stackOut_290_1 = 1;
                              stackIn_292_0 = stackOut_290_0;
                              stackIn_292_1 = stackOut_290_1;
                              break L54;
                            }
                          }
                          if (stackIn_292_0 != stackIn_292_1) {
                            L55: {
                              if (((uha) this).field_Ob <= param1.field_Ob) {
                                stackOut_296_0 = 0;
                                stackIn_297_0 = stackOut_296_0;
                                break L55;
                              } else {
                                stackOut_295_0 = 1;
                                stackIn_297_0 = stackOut_295_0;
                                break L55;
                              }
                            }
                            return stackIn_297_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        } else {
                          stackOut_274_0 = 0;
                          stackIn_299_0 = stackOut_274_0;
                          break L50;
                        }
                      } else {
                        stackOut_272_0 = 1;
                        stackIn_299_0 = stackOut_272_0;
                        break L50;
                      }
                    }
                    L56: {
                      var5 = stackIn_299_0;
                      if (!param1.field_Fb) {
                        if (2 == param1.field_Lb) {
                          L57: {
                            var6 = 1;
                            stackOut_303_0 = var5;
                            stackIn_305_0 = stackOut_303_0;
                            stackIn_304_0 = stackOut_303_0;
                            if (var6 != 0) {
                              stackOut_305_0 = stackIn_305_0;
                              stackOut_305_1 = 0;
                              stackIn_306_0 = stackOut_305_0;
                              stackIn_306_1 = stackOut_305_1;
                              break L57;
                            } else {
                              stackOut_304_0 = stackIn_304_0;
                              stackOut_304_1 = 1;
                              stackIn_306_0 = stackOut_304_0;
                              stackIn_306_1 = stackOut_304_1;
                              break L57;
                            }
                          }
                          if (stackIn_306_0 != stackIn_306_1) {
                            L58: {
                              if (((uha) this).field_Ob <= param1.field_Ob) {
                                stackOut_310_0 = 0;
                                stackIn_311_0 = stackOut_310_0;
                                break L58;
                              } else {
                                stackOut_309_0 = 1;
                                stackIn_311_0 = stackOut_309_0;
                                break L58;
                              }
                            }
                            return stackIn_311_0 != 0;
                          } else {
                            return var5 != 0;
                          }
                        } else {
                          stackOut_302_0 = 0;
                          stackIn_313_0 = stackOut_302_0;
                          break L56;
                        }
                      } else {
                        stackOut_300_0 = 1;
                        stackIn_313_0 = stackOut_300_0;
                        break L56;
                      }
                    }
                    L59: {
                      var6 = stackIn_313_0;
                      stackOut_313_0 = var5;
                      stackIn_315_0 = stackOut_313_0;
                      stackIn_314_0 = stackOut_313_0;
                      if (var6 != 0) {
                        stackOut_315_0 = stackIn_315_0;
                        stackOut_315_1 = 0;
                        stackIn_316_0 = stackOut_315_0;
                        stackIn_316_1 = stackOut_315_1;
                        break L59;
                      } else {
                        stackOut_314_0 = stackIn_314_0;
                        stackOut_314_1 = 1;
                        stackIn_316_0 = stackOut_314_0;
                        stackIn_316_1 = stackOut_314_1;
                        break L59;
                      }
                    }
                    if (stackIn_316_0 != stackIn_316_1) {
                      L60: {
                        if (((uha) this).field_Ob <= param1.field_Ob) {
                          stackOut_320_0 = 0;
                          stackIn_321_0 = stackOut_320_0;
                          break L60;
                        } else {
                          stackOut_319_0 = 1;
                          stackIn_321_0 = stackOut_319_0;
                          break L60;
                        }
                      }
                      return stackIn_321_0 != 0;
                    } else {
                      return var5 != 0;
                    }
                  } else {
                    L61: {
                      if (((uha) this).field_Ob >= param1.field_Ob) {
                        stackOut_269_0 = 0;
                        stackIn_270_0 = stackOut_269_0;
                        break L61;
                      } else {
                        stackOut_268_0 = 1;
                        stackIn_270_0 = stackOut_268_0;
                        break L61;
                      }
                    }
                    return stackIn_270_0 != 0;
                  }
                }
              }
            } else {
              return ((uha) this).field_zb;
            }
          } else {
            L62: {
              if (param1.field_Zb) {
                stackOut_159_0 = 0;
                stackIn_160_0 = stackOut_159_0;
                break L62;
              } else {
                stackOut_158_0 = 1;
                stackIn_160_0 = stackOut_158_0;
                break L62;
              }
            }
            L63: {
              stackOut_160_0 = stackIn_160_0;
              stackIn_162_0 = stackOut_160_0;
              stackIn_161_0 = stackOut_160_0;
              if (((uha) this).field_Zb) {
                stackOut_162_0 = stackIn_162_0;
                stackOut_162_1 = 0;
                stackIn_163_0 = stackOut_162_0;
                stackIn_163_1 = stackOut_162_1;
                break L63;
              } else {
                stackOut_161_0 = stackIn_161_0;
                stackOut_161_1 = 1;
                stackIn_163_0 = stackOut_161_0;
                stackIn_163_1 = stackOut_161_1;
                break L63;
              }
            }
            if (stackIn_163_0 != stackIn_163_1) {
              L64: {
                if (((uha) this).field_Zb) {
                  stackOut_167_0 = 0;
                  stackIn_168_0 = stackOut_167_0;
                  break L64;
                } else {
                  stackOut_166_0 = 1;
                  stackIn_168_0 = stackOut_166_0;
                  break L64;
                }
              }
              return stackIn_168_0 != 0;
            } else {
              if (param0 == -7) {
                if (((uha) this).field_Zb) {
                  L65: {
                    if (!((uha) this).field_Fb) {
                      if (2 == ((uha) this).field_Lb) {
                        L66: {
                          var5 = 1;
                          if (!param1.field_Fb) {
                            if (2 == param1.field_Lb) {
                              stackOut_210_0 = 1;
                              stackIn_212_0 = stackOut_210_0;
                              break L66;
                            } else {
                              stackOut_209_0 = 0;
                              stackIn_212_0 = stackOut_209_0;
                              break L66;
                            }
                          } else {
                            stackOut_207_0 = 1;
                            stackIn_212_0 = stackOut_207_0;
                            break L66;
                          }
                        }
                        L67: {
                          var6 = stackIn_212_0;
                          stackOut_212_0 = var5;
                          stackIn_214_0 = stackOut_212_0;
                          stackIn_213_0 = stackOut_212_0;
                          if (var6 != 0) {
                            stackOut_214_0 = stackIn_214_0;
                            stackOut_214_1 = 0;
                            stackIn_215_0 = stackOut_214_0;
                            stackIn_215_1 = stackOut_214_1;
                            break L67;
                          } else {
                            stackOut_213_0 = stackIn_213_0;
                            stackOut_213_1 = 1;
                            stackIn_215_0 = stackOut_213_0;
                            stackIn_215_1 = stackOut_213_1;
                            break L67;
                          }
                        }
                        if (stackIn_215_0 != stackIn_215_1) {
                          L68: {
                            if (((uha) this).field_Ob <= param1.field_Ob) {
                              stackOut_219_0 = 0;
                              stackIn_220_0 = stackOut_219_0;
                              break L68;
                            } else {
                              stackOut_218_0 = 1;
                              stackIn_220_0 = stackOut_218_0;
                              break L68;
                            }
                          }
                          return stackIn_220_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        stackOut_205_0 = 0;
                        stackIn_222_0 = stackOut_205_0;
                        break L65;
                      }
                    } else {
                      stackOut_203_0 = 1;
                      stackIn_222_0 = stackOut_203_0;
                      break L65;
                    }
                  }
                  L69: {
                    var5 = stackIn_222_0;
                    if (!param1.field_Fb) {
                      if (2 == param1.field_Lb) {
                        L70: {
                          var6 = 1;
                          stackOut_226_0 = var5;
                          stackIn_228_0 = stackOut_226_0;
                          stackIn_227_0 = stackOut_226_0;
                          if (var6 != 0) {
                            stackOut_228_0 = stackIn_228_0;
                            stackOut_228_1 = 0;
                            stackIn_229_0 = stackOut_228_0;
                            stackIn_229_1 = stackOut_228_1;
                            break L70;
                          } else {
                            stackOut_227_0 = stackIn_227_0;
                            stackOut_227_1 = 1;
                            stackIn_229_0 = stackOut_227_0;
                            stackIn_229_1 = stackOut_227_1;
                            break L70;
                          }
                        }
                        if (stackIn_229_0 != stackIn_229_1) {
                          L71: {
                            if (((uha) this).field_Ob <= param1.field_Ob) {
                              stackOut_233_0 = 0;
                              stackIn_234_0 = stackOut_233_0;
                              break L71;
                            } else {
                              stackOut_232_0 = 1;
                              stackIn_234_0 = stackOut_232_0;
                              break L71;
                            }
                          }
                          return stackIn_234_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        stackOut_225_0 = 0;
                        stackIn_236_0 = stackOut_225_0;
                        break L69;
                      }
                    } else {
                      stackOut_223_0 = 1;
                      stackIn_236_0 = stackOut_223_0;
                      break L69;
                    }
                  }
                  L72: {
                    var6 = stackIn_236_0;
                    stackOut_236_0 = var5;
                    stackIn_238_0 = stackOut_236_0;
                    stackIn_237_0 = stackOut_236_0;
                    if (var6 != 0) {
                      stackOut_238_0 = stackIn_238_0;
                      stackOut_238_1 = 0;
                      stackIn_239_0 = stackOut_238_0;
                      stackIn_239_1 = stackOut_238_1;
                      break L72;
                    } else {
                      stackOut_237_0 = stackIn_237_0;
                      stackOut_237_1 = 1;
                      stackIn_239_0 = stackOut_237_0;
                      stackIn_239_1 = stackOut_237_1;
                      break L72;
                    }
                  }
                  if (stackIn_239_0 != stackIn_239_1) {
                    L73: {
                      if (((uha) this).field_Ob <= param1.field_Ob) {
                        stackOut_243_0 = 0;
                        stackIn_244_0 = stackOut_243_0;
                        break L73;
                      } else {
                        stackOut_242_0 = 1;
                        stackIn_244_0 = stackOut_242_0;
                        break L73;
                      }
                    }
                    return stackIn_244_0 != 0;
                  } else {
                    return var5 != 0;
                  }
                } else {
                  L74: {
                    if (((uha) this).field_Ob >= param1.field_Ob) {
                      stackOut_200_0 = 0;
                      stackIn_201_0 = stackOut_200_0;
                      break L74;
                    } else {
                      stackOut_199_0 = 1;
                      stackIn_201_0 = stackOut_199_0;
                      break L74;
                    }
                  }
                  return stackIn_201_0 != 0;
                }
              } else {
                var7 = null;
                pp discarded$7 = uha.b((lu) null, -6);
                if (((uha) this).field_Zb) {
                  L75: {
                    if (((uha) this).field_Fb) {
                      stackOut_179_0 = 1;
                      stackIn_181_0 = stackOut_179_0;
                      break L75;
                    } else {
                      if (2 == ((uha) this).field_Lb) {
                        stackOut_178_0 = 1;
                        stackIn_181_0 = stackOut_178_0;
                        break L75;
                      } else {
                        stackOut_177_0 = 0;
                        stackIn_181_0 = stackOut_177_0;
                        break L75;
                      }
                    }
                  }
                  L76: {
                    var5 = stackIn_181_0;
                    if (!param1.field_Fb) {
                      if (2 == param1.field_Lb) {
                        stackOut_185_0 = 1;
                        stackIn_187_0 = stackOut_185_0;
                        break L76;
                      } else {
                        stackOut_184_0 = 0;
                        stackIn_187_0 = stackOut_184_0;
                        break L76;
                      }
                    } else {
                      stackOut_182_0 = 1;
                      stackIn_187_0 = stackOut_182_0;
                      break L76;
                    }
                  }
                  L77: {
                    var6 = stackIn_187_0;
                    stackOut_187_0 = var5;
                    stackIn_189_0 = stackOut_187_0;
                    stackIn_188_0 = stackOut_187_0;
                    if (var6 != 0) {
                      stackOut_189_0 = stackIn_189_0;
                      stackOut_189_1 = 0;
                      stackIn_190_0 = stackOut_189_0;
                      stackIn_190_1 = stackOut_189_1;
                      break L77;
                    } else {
                      stackOut_188_0 = stackIn_188_0;
                      stackOut_188_1 = 1;
                      stackIn_190_0 = stackOut_188_0;
                      stackIn_190_1 = stackOut_188_1;
                      break L77;
                    }
                  }
                  if (stackIn_190_0 != stackIn_190_1) {
                    L78: {
                      if (((uha) this).field_Ob <= param1.field_Ob) {
                        stackOut_194_0 = 0;
                        stackIn_195_0 = stackOut_194_0;
                        break L78;
                      } else {
                        stackOut_193_0 = 1;
                        stackIn_195_0 = stackOut_193_0;
                        break L78;
                      }
                    }
                    return stackIn_195_0 != 0;
                  } else {
                    return var5 != 0;
                  }
                } else {
                  L79: {
                    if (((uha) this).field_Ob >= param1.field_Ob) {
                      stackOut_173_0 = 0;
                      stackIn_174_0 = stackOut_173_0;
                      break L79;
                    } else {
                      stackOut_172_0 = 1;
                      stackIn_174_0 = stackOut_172_0;
                      break L79;
                    }
                  }
                  return stackIn_174_0 != 0;
                }
              }
            }
          }
        }
    }

    final int f(byte param0) {
        if (param0 >= -44) {
            return -126;
        }
        return (int)((uha) this).d(-115);
    }

    uha(int param0) {
        super(0L, (sna) null);
        ((uha) this).field_Eb = new byte[param0];
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 24) {
          L0: {
            ((uha) this).field_Zb = true;
            if (((uha) this).a(0)) {
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
            if (((uha) this).a(0)) {
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
        field_Vb = "Public";
    }
}
