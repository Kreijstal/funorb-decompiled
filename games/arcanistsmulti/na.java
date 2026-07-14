/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na extends kc {
    int field_ac;
    kc field_hc;
    String field_ic;
    static String field_Sb;
    int field_Fb;
    kc field_Kb;
    long field_Yb;
    kc field_fc;
    kc field_Vb;
    kc field_Mb;
    kc[] field_pc;
    int field_nc;
    kc field_Ib;
    kc field_Gb;
    boolean field_Lb;
    kc field_jc;
    kc field_Jb;
    static String field_gc;
    long field_Bb;
    int field_Db;
    int field_bc;
    boolean field_Hb;
    kc field_Zb;
    byte[] field_Wb;
    int field_Rb;
    kc field_Eb;
    kc field_Ub;
    kc field_cc;
    int field_dc;
    boolean field_oc;
    boolean field_Ob;
    kc field_Cb;
    kc field_ec;
    int field_Pb;
    static String field_lc;
    static String field_Tb;
    boolean field_kc;
    boolean field_mc;
    kc field_Xb;
    String[] field_Qb;
    boolean field_Nb;

    final int h(byte param0) {
        if (param0 < 46) {
            return 4;
        }
        return (int)((na) this).b(false);
    }

    public static void g(byte param0) {
        if (param0 <= 107) {
          na.i((byte) 112);
          field_lc = null;
          field_Tb = null;
          field_Sb = null;
          field_gc = null;
          return;
        } else {
          field_lc = null;
          field_Tb = null;
          field_Sb = null;
          field_gc = null;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -34) {
          L0: {
            boolean discarded$10 = ((na) this).e(102);
            if (((na) this).d((byte) -17)) {
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
            if (((na) this).d((byte) -17)) {
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

    final boolean a(na param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_188_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        int stackIn_226_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        int stackIn_251_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_269_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_271_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_276_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_288_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_298_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_309_0 = 0;
        int stackIn_314_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_322_0 = 0;
        int stackIn_335_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_338_1 = 0;
        int stackIn_343_0 = 0;
        int stackIn_345_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_349_0 = 0;
        int stackIn_350_0 = 0;
        int stackIn_351_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_356_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_365_0 = 0;
        int stackIn_366_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_368_1 = 0;
        int stackIn_373_0 = 0;
        int stackIn_375_0 = 0;
        int stackIn_378_0 = 0;
        int stackIn_379_0 = 0;
        int stackIn_380_0 = 0;
        int stackIn_381_0 = 0;
        int stackIn_381_1 = 0;
        int stackIn_386_0 = 0;
        int stackIn_390_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_230_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_313_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_316_1 = 0;
        int stackOut_315_0 = 0;
        int stackOut_315_1 = 0;
        int stackOut_321_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_389_0 = 0;
        int stackOut_388_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_333_0 = 0;
        int stackOut_335_0 = 0;
        int stackOut_337_0 = 0;
        int stackOut_337_1 = 0;
        int stackOut_336_0 = 0;
        int stackOut_336_1 = 0;
        int stackOut_342_0 = 0;
        int stackOut_341_0 = 0;
        int stackOut_331_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_347_0 = 0;
        int stackOut_346_0 = 0;
        int stackOut_348_0 = 0;
        int stackOut_350_0 = 0;
        int stackOut_350_1 = 0;
        int stackOut_349_0 = 0;
        int stackOut_349_1 = 0;
        int stackOut_355_0 = 0;
        int stackOut_354_0 = 0;
        int stackOut_327_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_364_0 = 0;
        int stackOut_363_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_367_0 = 0;
        int stackOut_367_1 = 0;
        int stackOut_366_0 = 0;
        int stackOut_366_1 = 0;
        int stackOut_372_0 = 0;
        int stackOut_371_0 = 0;
        int stackOut_361_0 = 0;
        int stackOut_359_0 = 0;
        int stackOut_377_0 = 0;
        int stackOut_376_0 = 0;
        int stackOut_378_0 = 0;
        int stackOut_380_0 = 0;
        int stackOut_380_1 = 0;
        int stackOut_379_0 = 0;
        int stackOut_379_1 = 0;
        int stackOut_385_0 = 0;
        int stackOut_384_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_243_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_245_1 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_268_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_270_0 = 0;
        int stackOut_270_1 = 0;
        int stackOut_275_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_290_1 = 0;
        int stackOut_289_0 = 0;
        int stackOut_289_1 = 0;
        int stackOut_294_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_282_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_303_0 = 0;
        int stackOut_303_1 = 0;
        int stackOut_302_0 = 0;
        int stackOut_302_1 = 0;
        int stackOut_308_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_220_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_219_1 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_203_0 = 0;
        int stackOut_203_1 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_187_1 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        if (param1 == 2) {
          L0: {
            if (!((na) this).field_Hb) {
              if (((na) this).field_ac == 6) {
                L1: {
                  var3 = 1;
                  if (!param0.field_Hb) {
                    if ((param0.field_ac ^ -1) == -7) {
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
                L3: {
                  stackOut_15_0 = stackIn_15_0;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var3 != 0) {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L3;
                  } else {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L3;
                  }
                }
                if (stackIn_18_0 != stackIn_18_1) {
                  return var3 != 0;
                } else {
                  L4: {
                    if (var3 == 0) {
                      L5: {
                        if (param0.field_Ob) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L5;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L5;
                        }
                      }
                      if (stackIn_26_0 == (((na) this).field_Ob ? 1 : 0)) {
                        return ((na) this).field_Ob;
                      } else {
                        if (!((na) this).field_Ob) {
                          break L4;
                        } else {
                          if (((na) this).field_Pb != param0.field_Pb) {
                            L6: {
                              if (param0.field_Pb <= ((na) this).field_Pb) {
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
                            break L4;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if (((na) this).field_Lb) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L7;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_39_0 = stackIn_39_0;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_40_0 = stackOut_39_0;
                    if (param0.field_Lb) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L8;
                    } else {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      break L8;
                    }
                  }
                  if (stackIn_42_0 != stackIn_42_1) {
                    L9: {
                      if (((na) this).field_Lb) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L9;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L9;
                      }
                    }
                    return stackIn_47_0 != 0;
                  } else {
                    if (((na) this).field_Lb) {
                      L10: {
                        if (!((na) this).field_kc) {
                          if (2 == ((na) this).field_Fb) {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            break L10;
                          } else {
                            stackOut_56_0 = 0;
                            stackIn_59_0 = stackOut_56_0;
                            break L10;
                          }
                        } else {
                          stackOut_54_0 = 1;
                          stackIn_59_0 = stackOut_54_0;
                          break L10;
                        }
                      }
                      L11: {
                        var5 = stackIn_59_0;
                        if (param0.field_kc) {
                          stackOut_63_0 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          break L11;
                        } else {
                          if (param0.field_Fb == 2) {
                            stackOut_62_0 = 1;
                            stackIn_65_0 = stackOut_62_0;
                            break L11;
                          } else {
                            stackOut_61_0 = 0;
                            stackIn_65_0 = stackOut_61_0;
                            break L11;
                          }
                        }
                      }
                      L12: {
                        var6 = stackIn_65_0;
                        if (var6 != 0) {
                          stackOut_67_0 = 0;
                          stackIn_68_0 = stackOut_67_0;
                          break L12;
                        } else {
                          stackOut_66_0 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          break L12;
                        }
                      }
                      L13: {
                        stackOut_68_0 = stackIn_68_0;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_69_0 = stackOut_68_0;
                        if (var5 != 0) {
                          stackOut_70_0 = stackIn_70_0;
                          stackOut_70_1 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          break L13;
                        } else {
                          stackOut_69_0 = stackIn_69_0;
                          stackOut_69_1 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          break L13;
                        }
                      }
                      if (stackIn_71_0 != stackIn_71_1) {
                        return var5 != 0;
                      } else {
                        L14: {
                          if (param0.field_Yb >= ((na) this).field_Yb) {
                            stackOut_74_0 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            break L14;
                          } else {
                            stackOut_73_0 = 1;
                            stackIn_75_0 = stackOut_73_0;
                            break L14;
                          }
                        }
                        return stackIn_75_0 != 0;
                      }
                    } else {
                      L15: {
                        if (param0.field_Yb <= ((na) this).field_Yb) {
                          stackOut_51_0 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          break L15;
                        } else {
                          stackOut_50_0 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          break L15;
                        }
                      }
                      return stackIn_52_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_78_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_78_0 = stackOut_3_0;
              break L0;
            }
          }
          L16: {
            var3 = stackIn_78_0;
            if (!param0.field_Hb) {
              if ((param0.field_ac ^ -1) == -7) {
                L17: {
                  var4 = 1;
                  if (var4 != 0) {
                    stackOut_84_0 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    break L17;
                  } else {
                    stackOut_83_0 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    break L17;
                  }
                }
                L18: {
                  stackOut_85_0 = stackIn_85_0;
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_86_0 = stackOut_85_0;
                  if (var3 != 0) {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    break L18;
                  } else {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    break L18;
                  }
                }
                if (stackIn_88_0 != stackIn_88_1) {
                  return var3 != 0;
                } else {
                  L19: {
                    if (var3 == 0) {
                      L20: {
                        if (param0.field_Ob) {
                          stackOut_95_0 = 0;
                          stackIn_96_0 = stackOut_95_0;
                          break L20;
                        } else {
                          stackOut_94_0 = 1;
                          stackIn_96_0 = stackOut_94_0;
                          break L20;
                        }
                      }
                      if (stackIn_96_0 == (((na) this).field_Ob ? 1 : 0)) {
                        return ((na) this).field_Ob;
                      } else {
                        if (!((na) this).field_Ob) {
                          break L19;
                        } else {
                          if (((na) this).field_Pb != param0.field_Pb) {
                            L21: {
                              if (param0.field_Pb <= ((na) this).field_Pb) {
                                stackOut_104_0 = 0;
                                stackIn_105_0 = stackOut_104_0;
                                break L21;
                              } else {
                                stackOut_103_0 = 1;
                                stackIn_105_0 = stackOut_103_0;
                                break L21;
                              }
                            }
                            return stackIn_105_0 != 0;
                          } else {
                            break L19;
                          }
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                  L22: {
                    if (((na) this).field_Lb) {
                      stackOut_108_0 = 0;
                      stackIn_109_0 = stackOut_108_0;
                      break L22;
                    } else {
                      stackOut_107_0 = 1;
                      stackIn_109_0 = stackOut_107_0;
                      break L22;
                    }
                  }
                  L23: {
                    stackOut_109_0 = stackIn_109_0;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (param0.field_Lb) {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L23;
                    } else {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L23;
                    }
                  }
                  if (stackIn_112_0 != stackIn_112_1) {
                    L24: {
                      if (((na) this).field_Lb) {
                        stackOut_116_0 = 0;
                        stackIn_117_0 = stackOut_116_0;
                        break L24;
                      } else {
                        stackOut_115_0 = 1;
                        stackIn_117_0 = stackOut_115_0;
                        break L24;
                      }
                    }
                    return stackIn_117_0 != 0;
                  } else {
                    if (((na) this).field_Lb) {
                      L25: {
                        if (((na) this).field_kc) {
                          stackOut_127_0 = 1;
                          stackIn_129_0 = stackOut_127_0;
                          break L25;
                        } else {
                          if (2 == ((na) this).field_Fb) {
                            stackOut_126_0 = 1;
                            stackIn_129_0 = stackOut_126_0;
                            break L25;
                          } else {
                            stackOut_125_0 = 0;
                            stackIn_129_0 = stackOut_125_0;
                            break L25;
                          }
                        }
                      }
                      L26: {
                        var5 = stackIn_129_0;
                        if (!param0.field_kc) {
                          if (param0.field_Fb == 2) {
                            stackOut_133_0 = 1;
                            stackIn_135_0 = stackOut_133_0;
                            break L26;
                          } else {
                            stackOut_132_0 = 0;
                            stackIn_135_0 = stackOut_132_0;
                            break L26;
                          }
                        } else {
                          stackOut_130_0 = 1;
                          stackIn_135_0 = stackOut_130_0;
                          break L26;
                        }
                      }
                      L27: {
                        var6 = stackIn_135_0;
                        if (var6 != 0) {
                          stackOut_137_0 = 0;
                          stackIn_138_0 = stackOut_137_0;
                          break L27;
                        } else {
                          stackOut_136_0 = 1;
                          stackIn_138_0 = stackOut_136_0;
                          break L27;
                        }
                      }
                      L28: {
                        stackOut_138_0 = stackIn_138_0;
                        stackIn_140_0 = stackOut_138_0;
                        stackIn_139_0 = stackOut_138_0;
                        if (var5 != 0) {
                          stackOut_140_0 = stackIn_140_0;
                          stackOut_140_1 = 0;
                          stackIn_141_0 = stackOut_140_0;
                          stackIn_141_1 = stackOut_140_1;
                          break L28;
                        } else {
                          stackOut_139_0 = stackIn_139_0;
                          stackOut_139_1 = 1;
                          stackIn_141_0 = stackOut_139_0;
                          stackIn_141_1 = stackOut_139_1;
                          break L28;
                        }
                      }
                      if (stackIn_141_0 != stackIn_141_1) {
                        return var5 != 0;
                      } else {
                        L29: {
                          if (param0.field_Yb >= ((na) this).field_Yb) {
                            stackOut_144_0 = 0;
                            stackIn_145_0 = stackOut_144_0;
                            break L29;
                          } else {
                            stackOut_143_0 = 1;
                            stackIn_145_0 = stackOut_143_0;
                            break L29;
                          }
                        }
                        return stackIn_145_0 != 0;
                      }
                    } else {
                      L30: {
                        if (param0.field_Yb <= ((na) this).field_Yb) {
                          stackOut_121_0 = 0;
                          stackIn_122_0 = stackOut_121_0;
                          break L30;
                        } else {
                          stackOut_120_0 = 1;
                          stackIn_122_0 = stackOut_120_0;
                          break L30;
                        }
                      }
                      return stackIn_122_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_81_0 = 0;
                stackIn_148_0 = stackOut_81_0;
                break L16;
              }
            } else {
              stackOut_79_0 = 1;
              stackIn_148_0 = stackOut_79_0;
              break L16;
            }
          }
          L31: {
            var4 = stackIn_148_0;
            if (var4 != 0) {
              stackOut_150_0 = 0;
              stackIn_151_0 = stackOut_150_0;
              break L31;
            } else {
              stackOut_149_0 = 1;
              stackIn_151_0 = stackOut_149_0;
              break L31;
            }
          }
          L32: {
            stackOut_151_0 = stackIn_151_0;
            stackIn_153_0 = stackOut_151_0;
            stackIn_152_0 = stackOut_151_0;
            if (var3 != 0) {
              stackOut_153_0 = stackIn_153_0;
              stackOut_153_1 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              break L32;
            } else {
              stackOut_152_0 = stackIn_152_0;
              stackOut_152_1 = 1;
              stackIn_154_0 = stackOut_152_0;
              stackIn_154_1 = stackOut_152_1;
              break L32;
            }
          }
          if (stackIn_154_0 != stackIn_154_1) {
            return var3 != 0;
          } else {
            if (var3 == 0) {
              L33: {
                if (param0.field_Ob) {
                  stackOut_230_0 = 0;
                  stackIn_231_0 = stackOut_230_0;
                  break L33;
                } else {
                  stackOut_229_0 = 1;
                  stackIn_231_0 = stackOut_229_0;
                  break L33;
                }
              }
              if (stackIn_231_0 == (((na) this).field_Ob ? 1 : 0)) {
                return ((na) this).field_Ob;
              } else {
                if (!((na) this).field_Ob) {
                  L34: {
                    if (((na) this).field_Lb) {
                      stackOut_313_0 = 0;
                      stackIn_314_0 = stackOut_313_0;
                      break L34;
                    } else {
                      stackOut_312_0 = 1;
                      stackIn_314_0 = stackOut_312_0;
                      break L34;
                    }
                  }
                  L35: {
                    stackOut_314_0 = stackIn_314_0;
                    stackIn_316_0 = stackOut_314_0;
                    stackIn_315_0 = stackOut_314_0;
                    if (param0.field_Lb) {
                      stackOut_316_0 = stackIn_316_0;
                      stackOut_316_1 = 0;
                      stackIn_317_0 = stackOut_316_0;
                      stackIn_317_1 = stackOut_316_1;
                      break L35;
                    } else {
                      stackOut_315_0 = stackIn_315_0;
                      stackOut_315_1 = 1;
                      stackIn_317_0 = stackOut_315_0;
                      stackIn_317_1 = stackOut_315_1;
                      break L35;
                    }
                  }
                  if (stackIn_317_0 != stackIn_317_1) {
                    L36: {
                      if (((na) this).field_Lb) {
                        stackOut_321_0 = 0;
                        stackIn_322_0 = stackOut_321_0;
                        break L36;
                      } else {
                        stackOut_320_0 = 1;
                        stackIn_322_0 = stackOut_320_0;
                        break L36;
                      }
                    }
                    return stackIn_322_0 != 0;
                  } else {
                    if (!((na) this).field_Lb) {
                      L37: {
                        if (param0.field_Yb <= ((na) this).field_Yb) {
                          stackOut_389_0 = 0;
                          stackIn_390_0 = stackOut_389_0;
                          break L37;
                        } else {
                          stackOut_388_0 = 1;
                          stackIn_390_0 = stackOut_388_0;
                          break L37;
                        }
                      }
                      return stackIn_390_0 != 0;
                    } else {
                      L38: {
                        if (!((na) this).field_kc) {
                          if (2 == ((na) this).field_Fb) {
                            L39: {
                              var5 = 1;
                              if (!param0.field_kc) {
                                if (param0.field_Fb == 2) {
                                  L40: {
                                    var6 = 1;
                                    if (var6 != 0) {
                                      stackOut_334_0 = 0;
                                      stackIn_335_0 = stackOut_334_0;
                                      break L40;
                                    } else {
                                      stackOut_333_0 = 1;
                                      stackIn_335_0 = stackOut_333_0;
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    stackOut_335_0 = stackIn_335_0;
                                    stackIn_337_0 = stackOut_335_0;
                                    stackIn_336_0 = stackOut_335_0;
                                    if (var5 != 0) {
                                      stackOut_337_0 = stackIn_337_0;
                                      stackOut_337_1 = 0;
                                      stackIn_338_0 = stackOut_337_0;
                                      stackIn_338_1 = stackOut_337_1;
                                      break L41;
                                    } else {
                                      stackOut_336_0 = stackIn_336_0;
                                      stackOut_336_1 = 1;
                                      stackIn_338_0 = stackOut_336_0;
                                      stackIn_338_1 = stackOut_336_1;
                                      break L41;
                                    }
                                  }
                                  if (stackIn_338_0 == stackIn_338_1) {
                                    L42: {
                                      if (param0.field_Yb >= ((na) this).field_Yb) {
                                        stackOut_342_0 = 0;
                                        stackIn_343_0 = stackOut_342_0;
                                        break L42;
                                      } else {
                                        stackOut_341_0 = 1;
                                        stackIn_343_0 = stackOut_341_0;
                                        break L42;
                                      }
                                    }
                                    return stackIn_343_0 != 0;
                                  } else {
                                    return var5 != 0;
                                  }
                                } else {
                                  stackOut_331_0 = 0;
                                  stackIn_345_0 = stackOut_331_0;
                                  break L39;
                                }
                              } else {
                                stackOut_329_0 = 1;
                                stackIn_345_0 = stackOut_329_0;
                                break L39;
                              }
                            }
                            L43: {
                              var6 = stackIn_345_0;
                              if (var6 != 0) {
                                stackOut_347_0 = 0;
                                stackIn_348_0 = stackOut_347_0;
                                break L43;
                              } else {
                                stackOut_346_0 = 1;
                                stackIn_348_0 = stackOut_346_0;
                                break L43;
                              }
                            }
                            L44: {
                              stackOut_348_0 = stackIn_348_0;
                              stackIn_350_0 = stackOut_348_0;
                              stackIn_349_0 = stackOut_348_0;
                              if (var5 != 0) {
                                stackOut_350_0 = stackIn_350_0;
                                stackOut_350_1 = 0;
                                stackIn_351_0 = stackOut_350_0;
                                stackIn_351_1 = stackOut_350_1;
                                break L44;
                              } else {
                                stackOut_349_0 = stackIn_349_0;
                                stackOut_349_1 = 1;
                                stackIn_351_0 = stackOut_349_0;
                                stackIn_351_1 = stackOut_349_1;
                                break L44;
                              }
                            }
                            if (stackIn_351_0 == stackIn_351_1) {
                              L45: {
                                if (param0.field_Yb >= ((na) this).field_Yb) {
                                  stackOut_355_0 = 0;
                                  stackIn_356_0 = stackOut_355_0;
                                  break L45;
                                } else {
                                  stackOut_354_0 = 1;
                                  stackIn_356_0 = stackOut_354_0;
                                  break L45;
                                }
                              }
                              return stackIn_356_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_327_0 = 0;
                            stackIn_358_0 = stackOut_327_0;
                            break L38;
                          }
                        } else {
                          stackOut_325_0 = 1;
                          stackIn_358_0 = stackOut_325_0;
                          break L38;
                        }
                      }
                      L46: {
                        var5 = stackIn_358_0;
                        if (!param0.field_kc) {
                          if (param0.field_Fb == 2) {
                            L47: {
                              var6 = 1;
                              if (var6 != 0) {
                                stackOut_364_0 = 0;
                                stackIn_365_0 = stackOut_364_0;
                                break L47;
                              } else {
                                stackOut_363_0 = 1;
                                stackIn_365_0 = stackOut_363_0;
                                break L47;
                              }
                            }
                            L48: {
                              stackOut_365_0 = stackIn_365_0;
                              stackIn_367_0 = stackOut_365_0;
                              stackIn_366_0 = stackOut_365_0;
                              if (var5 != 0) {
                                stackOut_367_0 = stackIn_367_0;
                                stackOut_367_1 = 0;
                                stackIn_368_0 = stackOut_367_0;
                                stackIn_368_1 = stackOut_367_1;
                                break L48;
                              } else {
                                stackOut_366_0 = stackIn_366_0;
                                stackOut_366_1 = 1;
                                stackIn_368_0 = stackOut_366_0;
                                stackIn_368_1 = stackOut_366_1;
                                break L48;
                              }
                            }
                            if (stackIn_368_0 == stackIn_368_1) {
                              L49: {
                                if (param0.field_Yb >= ((na) this).field_Yb) {
                                  stackOut_372_0 = 0;
                                  stackIn_373_0 = stackOut_372_0;
                                  break L49;
                                } else {
                                  stackOut_371_0 = 1;
                                  stackIn_373_0 = stackOut_371_0;
                                  break L49;
                                }
                              }
                              return stackIn_373_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          } else {
                            stackOut_361_0 = 0;
                            stackIn_375_0 = stackOut_361_0;
                            break L46;
                          }
                        } else {
                          stackOut_359_0 = 1;
                          stackIn_375_0 = stackOut_359_0;
                          break L46;
                        }
                      }
                      L50: {
                        var6 = stackIn_375_0;
                        if (var6 != 0) {
                          stackOut_377_0 = 0;
                          stackIn_378_0 = stackOut_377_0;
                          break L50;
                        } else {
                          stackOut_376_0 = 1;
                          stackIn_378_0 = stackOut_376_0;
                          break L50;
                        }
                      }
                      L51: {
                        stackOut_378_0 = stackIn_378_0;
                        stackIn_380_0 = stackOut_378_0;
                        stackIn_379_0 = stackOut_378_0;
                        if (var5 != 0) {
                          stackOut_380_0 = stackIn_380_0;
                          stackOut_380_1 = 0;
                          stackIn_381_0 = stackOut_380_0;
                          stackIn_381_1 = stackOut_380_1;
                          break L51;
                        } else {
                          stackOut_379_0 = stackIn_379_0;
                          stackOut_379_1 = 1;
                          stackIn_381_0 = stackOut_379_0;
                          stackIn_381_1 = stackOut_379_1;
                          break L51;
                        }
                      }
                      if (stackIn_381_0 == stackIn_381_1) {
                        L52: {
                          if (param0.field_Yb >= ((na) this).field_Yb) {
                            stackOut_385_0 = 0;
                            stackIn_386_0 = stackOut_385_0;
                            break L52;
                          } else {
                            stackOut_384_0 = 1;
                            stackIn_386_0 = stackOut_384_0;
                            break L52;
                          }
                        }
                        return stackIn_386_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    }
                  }
                } else {
                  if (((na) this).field_Pb == param0.field_Pb) {
                    L53: {
                      if (((na) this).field_Lb) {
                        stackOut_242_0 = 0;
                        stackIn_243_0 = stackOut_242_0;
                        break L53;
                      } else {
                        stackOut_241_0 = 1;
                        stackIn_243_0 = stackOut_241_0;
                        break L53;
                      }
                    }
                    L54: {
                      stackOut_243_0 = stackIn_243_0;
                      stackIn_245_0 = stackOut_243_0;
                      stackIn_244_0 = stackOut_243_0;
                      if (param0.field_Lb) {
                        stackOut_245_0 = stackIn_245_0;
                        stackOut_245_1 = 0;
                        stackIn_246_0 = stackOut_245_0;
                        stackIn_246_1 = stackOut_245_1;
                        break L54;
                      } else {
                        stackOut_244_0 = stackIn_244_0;
                        stackOut_244_1 = 1;
                        stackIn_246_0 = stackOut_244_0;
                        stackIn_246_1 = stackOut_244_1;
                        break L54;
                      }
                    }
                    if (stackIn_246_0 != stackIn_246_1) {
                      L55: {
                        if (((na) this).field_Lb) {
                          stackOut_250_0 = 0;
                          stackIn_251_0 = stackOut_250_0;
                          break L55;
                        } else {
                          stackOut_249_0 = 1;
                          stackIn_251_0 = stackOut_249_0;
                          break L55;
                        }
                      }
                      return stackIn_251_0 != 0;
                    } else {
                      if (((na) this).field_Lb) {
                        L56: {
                          if (((na) this).field_kc) {
                            stackOut_279_0 = 1;
                            stackIn_281_0 = stackOut_279_0;
                            break L56;
                          } else {
                            if (2 == ((na) this).field_Fb) {
                              L57: {
                                var5 = 1;
                                if (!param0.field_kc) {
                                  if (param0.field_Fb == 2) {
                                    stackOut_264_0 = 1;
                                    stackIn_266_0 = stackOut_264_0;
                                    break L57;
                                  } else {
                                    stackOut_263_0 = 0;
                                    stackIn_266_0 = stackOut_263_0;
                                    break L57;
                                  }
                                } else {
                                  stackOut_261_0 = 1;
                                  stackIn_266_0 = stackOut_261_0;
                                  break L57;
                                }
                              }
                              L58: {
                                var6 = stackIn_266_0;
                                if (var6 != 0) {
                                  stackOut_268_0 = 0;
                                  stackIn_269_0 = stackOut_268_0;
                                  break L58;
                                } else {
                                  stackOut_267_0 = 1;
                                  stackIn_269_0 = stackOut_267_0;
                                  break L58;
                                }
                              }
                              L59: {
                                stackOut_269_0 = stackIn_269_0;
                                stackIn_271_0 = stackOut_269_0;
                                stackIn_270_0 = stackOut_269_0;
                                if (var5 != 0) {
                                  stackOut_271_0 = stackIn_271_0;
                                  stackOut_271_1 = 0;
                                  stackIn_272_0 = stackOut_271_0;
                                  stackIn_272_1 = stackOut_271_1;
                                  break L59;
                                } else {
                                  stackOut_270_0 = stackIn_270_0;
                                  stackOut_270_1 = 1;
                                  stackIn_272_0 = stackOut_270_0;
                                  stackIn_272_1 = stackOut_270_1;
                                  break L59;
                                }
                              }
                              if (stackIn_272_0 != stackIn_272_1) {
                                return var5 != 0;
                              } else {
                                L60: {
                                  if (param0.field_Yb >= ((na) this).field_Yb) {
                                    stackOut_275_0 = 0;
                                    stackIn_276_0 = stackOut_275_0;
                                    break L60;
                                  } else {
                                    stackOut_274_0 = 1;
                                    stackIn_276_0 = stackOut_274_0;
                                    break L60;
                                  }
                                }
                                return stackIn_276_0 != 0;
                              }
                            } else {
                              stackOut_259_0 = 0;
                              stackIn_281_0 = stackOut_259_0;
                              break L56;
                            }
                          }
                        }
                        L61: {
                          var5 = stackIn_281_0;
                          if (!param0.field_kc) {
                            if (param0.field_Fb == 2) {
                              L62: {
                                var6 = 1;
                                if (var6 != 0) {
                                  stackOut_287_0 = 0;
                                  stackIn_288_0 = stackOut_287_0;
                                  break L62;
                                } else {
                                  stackOut_286_0 = 1;
                                  stackIn_288_0 = stackOut_286_0;
                                  break L62;
                                }
                              }
                              L63: {
                                stackOut_288_0 = stackIn_288_0;
                                stackIn_290_0 = stackOut_288_0;
                                stackIn_289_0 = stackOut_288_0;
                                if (var5 != 0) {
                                  stackOut_290_0 = stackIn_290_0;
                                  stackOut_290_1 = 0;
                                  stackIn_291_0 = stackOut_290_0;
                                  stackIn_291_1 = stackOut_290_1;
                                  break L63;
                                } else {
                                  stackOut_289_0 = stackIn_289_0;
                                  stackOut_289_1 = 1;
                                  stackIn_291_0 = stackOut_289_0;
                                  stackIn_291_1 = stackOut_289_1;
                                  break L63;
                                }
                              }
                              if (stackIn_291_0 != stackIn_291_1) {
                                return var5 != 0;
                              } else {
                                L64: {
                                  if (param0.field_Yb >= ((na) this).field_Yb) {
                                    stackOut_294_0 = 0;
                                    stackIn_295_0 = stackOut_294_0;
                                    break L64;
                                  } else {
                                    stackOut_293_0 = 1;
                                    stackIn_295_0 = stackOut_293_0;
                                    break L64;
                                  }
                                }
                                return stackIn_295_0 != 0;
                              }
                            } else {
                              stackOut_284_0 = 0;
                              stackIn_298_0 = stackOut_284_0;
                              break L61;
                            }
                          } else {
                            stackOut_282_0 = 1;
                            stackIn_298_0 = stackOut_282_0;
                            break L61;
                          }
                        }
                        L65: {
                          var6 = stackIn_298_0;
                          if (var6 != 0) {
                            stackOut_300_0 = 0;
                            stackIn_301_0 = stackOut_300_0;
                            break L65;
                          } else {
                            stackOut_299_0 = 1;
                            stackIn_301_0 = stackOut_299_0;
                            break L65;
                          }
                        }
                        L66: {
                          stackOut_301_0 = stackIn_301_0;
                          stackIn_303_0 = stackOut_301_0;
                          stackIn_302_0 = stackOut_301_0;
                          if (var5 != 0) {
                            stackOut_303_0 = stackIn_303_0;
                            stackOut_303_1 = 0;
                            stackIn_304_0 = stackOut_303_0;
                            stackIn_304_1 = stackOut_303_1;
                            break L66;
                          } else {
                            stackOut_302_0 = stackIn_302_0;
                            stackOut_302_1 = 1;
                            stackIn_304_0 = stackOut_302_0;
                            stackIn_304_1 = stackOut_302_1;
                            break L66;
                          }
                        }
                        if (stackIn_304_0 == stackIn_304_1) {
                          L67: {
                            if (param0.field_Yb >= ((na) this).field_Yb) {
                              stackOut_308_0 = 0;
                              stackIn_309_0 = stackOut_308_0;
                              break L67;
                            } else {
                              stackOut_307_0 = 1;
                              stackIn_309_0 = stackOut_307_0;
                              break L67;
                            }
                          }
                          return stackIn_309_0 != 0;
                        } else {
                          return var5 != 0;
                        }
                      } else {
                        L68: {
                          if (param0.field_Yb <= ((na) this).field_Yb) {
                            stackOut_255_0 = 0;
                            stackIn_256_0 = stackOut_255_0;
                            break L68;
                          } else {
                            stackOut_254_0 = 1;
                            stackIn_256_0 = stackOut_254_0;
                            break L68;
                          }
                        }
                        return stackIn_256_0 != 0;
                      }
                    }
                  } else {
                    L69: {
                      if (param0.field_Pb <= ((na) this).field_Pb) {
                        stackOut_238_0 = 0;
                        stackIn_239_0 = stackOut_238_0;
                        break L69;
                      } else {
                        stackOut_237_0 = 1;
                        stackIn_239_0 = stackOut_237_0;
                        break L69;
                      }
                    }
                    return stackIn_239_0 != 0;
                  }
                }
              }
            } else {
              L70: {
                if (((na) this).field_Lb) {
                  stackOut_160_0 = 0;
                  stackIn_161_0 = stackOut_160_0;
                  break L70;
                } else {
                  stackOut_159_0 = 1;
                  stackIn_161_0 = stackOut_159_0;
                  break L70;
                }
              }
              L71: {
                stackOut_161_0 = stackIn_161_0;
                stackIn_163_0 = stackOut_161_0;
                stackIn_162_0 = stackOut_161_0;
                if (param0.field_Lb) {
                  stackOut_163_0 = stackIn_163_0;
                  stackOut_163_1 = 0;
                  stackIn_164_0 = stackOut_163_0;
                  stackIn_164_1 = stackOut_163_1;
                  break L71;
                } else {
                  stackOut_162_0 = stackIn_162_0;
                  stackOut_162_1 = 1;
                  stackIn_164_0 = stackOut_162_0;
                  stackIn_164_1 = stackOut_162_1;
                  break L71;
                }
              }
              if (stackIn_164_0 != stackIn_164_1) {
                L72: {
                  if (((na) this).field_Lb) {
                    stackOut_168_0 = 0;
                    stackIn_169_0 = stackOut_168_0;
                    break L72;
                  } else {
                    stackOut_167_0 = 1;
                    stackIn_169_0 = stackOut_167_0;
                    break L72;
                  }
                }
                return stackIn_169_0 != 0;
              } else {
                if (((na) this).field_Lb) {
                  if (!((na) this).field_kc) {
                    L73: {
                      if (2 != ((na) this).field_Fb) {
                        stackOut_197_0 = 0;
                        stackIn_198_0 = stackOut_197_0;
                        break L73;
                      } else {
                        stackOut_196_0 = 1;
                        stackIn_198_0 = stackOut_196_0;
                        break L73;
                      }
                    }
                    var5 = stackIn_198_0;
                    if (!param0.field_kc) {
                      L74: {
                        if (param0.field_Fb != 2) {
                          stackOut_214_0 = 0;
                          stackIn_215_0 = stackOut_214_0;
                          break L74;
                        } else {
                          stackOut_213_0 = 1;
                          stackIn_215_0 = stackOut_213_0;
                          break L74;
                        }
                      }
                      L75: {
                        var6 = stackIn_215_0;
                        if (var6 != 0) {
                          stackOut_217_0 = 0;
                          stackIn_218_0 = stackOut_217_0;
                          break L75;
                        } else {
                          stackOut_216_0 = 1;
                          stackIn_218_0 = stackOut_216_0;
                          break L75;
                        }
                      }
                      L76: {
                        stackOut_218_0 = stackIn_218_0;
                        stackIn_220_0 = stackOut_218_0;
                        stackIn_219_0 = stackOut_218_0;
                        if (var5 != 0) {
                          stackOut_220_0 = stackIn_220_0;
                          stackOut_220_1 = 0;
                          stackIn_221_0 = stackOut_220_0;
                          stackIn_221_1 = stackOut_220_1;
                          break L76;
                        } else {
                          stackOut_219_0 = stackIn_219_0;
                          stackOut_219_1 = 1;
                          stackIn_221_0 = stackOut_219_0;
                          stackIn_221_1 = stackOut_219_1;
                          break L76;
                        }
                      }
                      if (stackIn_221_0 == stackIn_221_1) {
                        L77: {
                          if (param0.field_Yb >= ((na) this).field_Yb) {
                            stackOut_225_0 = 0;
                            stackIn_226_0 = stackOut_225_0;
                            break L77;
                          } else {
                            stackOut_224_0 = 1;
                            stackIn_226_0 = stackOut_224_0;
                            break L77;
                          }
                        }
                        return stackIn_226_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    } else {
                      L78: {
                        var6 = 1;
                        if (var6 != 0) {
                          stackOut_201_0 = 0;
                          stackIn_202_0 = stackOut_201_0;
                          break L78;
                        } else {
                          stackOut_200_0 = 1;
                          stackIn_202_0 = stackOut_200_0;
                          break L78;
                        }
                      }
                      L79: {
                        stackOut_202_0 = stackIn_202_0;
                        stackIn_204_0 = stackOut_202_0;
                        stackIn_203_0 = stackOut_202_0;
                        if (var5 != 0) {
                          stackOut_204_0 = stackIn_204_0;
                          stackOut_204_1 = 0;
                          stackIn_205_0 = stackOut_204_0;
                          stackIn_205_1 = stackOut_204_1;
                          break L79;
                        } else {
                          stackOut_203_0 = stackIn_203_0;
                          stackOut_203_1 = 1;
                          stackIn_205_0 = stackOut_203_0;
                          stackIn_205_1 = stackOut_203_1;
                          break L79;
                        }
                      }
                      if (stackIn_205_0 != stackIn_205_1) {
                        return var5 != 0;
                      } else {
                        L80: {
                          if (param0.field_Yb >= ((na) this).field_Yb) {
                            stackOut_208_0 = 0;
                            stackIn_209_0 = stackOut_208_0;
                            break L80;
                          } else {
                            stackOut_207_0 = 1;
                            stackIn_209_0 = stackOut_207_0;
                            break L80;
                          }
                        }
                        return stackIn_209_0 != 0;
                      }
                    }
                  } else {
                    L81: {
                      var5 = 1;
                      if (!param0.field_kc) {
                        if (param0.field_Fb == 2) {
                          stackOut_180_0 = 1;
                          stackIn_182_0 = stackOut_180_0;
                          break L81;
                        } else {
                          stackOut_179_0 = 0;
                          stackIn_182_0 = stackOut_179_0;
                          break L81;
                        }
                      } else {
                        stackOut_177_0 = 1;
                        stackIn_182_0 = stackOut_177_0;
                        break L81;
                      }
                    }
                    L82: {
                      var6 = stackIn_182_0;
                      if (var6 != 0) {
                        stackOut_184_0 = 0;
                        stackIn_185_0 = stackOut_184_0;
                        break L82;
                      } else {
                        stackOut_183_0 = 1;
                        stackIn_185_0 = stackOut_183_0;
                        break L82;
                      }
                    }
                    L83: {
                      stackOut_185_0 = stackIn_185_0;
                      stackIn_187_0 = stackOut_185_0;
                      stackIn_186_0 = stackOut_185_0;
                      if (var5 != 0) {
                        stackOut_187_0 = stackIn_187_0;
                        stackOut_187_1 = 0;
                        stackIn_188_0 = stackOut_187_0;
                        stackIn_188_1 = stackOut_187_1;
                        break L83;
                      } else {
                        stackOut_186_0 = stackIn_186_0;
                        stackOut_186_1 = 1;
                        stackIn_188_0 = stackOut_186_0;
                        stackIn_188_1 = stackOut_186_1;
                        break L83;
                      }
                    }
                    if (stackIn_188_0 != stackIn_188_1) {
                      return var5 != 0;
                    } else {
                      L84: {
                        if (param0.field_Yb >= ((na) this).field_Yb) {
                          stackOut_191_0 = 0;
                          stackIn_192_0 = stackOut_191_0;
                          break L84;
                        } else {
                          stackOut_190_0 = 1;
                          stackIn_192_0 = stackOut_190_0;
                          break L84;
                        }
                      }
                      return stackIn_192_0 != 0;
                    }
                  }
                } else {
                  L85: {
                    if (param0.field_Yb <= ((na) this).field_Yb) {
                      stackOut_173_0 = 0;
                      stackIn_174_0 = stackOut_173_0;
                      break L85;
                    } else {
                      stackOut_172_0 = 1;
                      stackIn_174_0 = stackOut_172_0;
                      break L85;
                    }
                  }
                  return stackIn_174_0 != 0;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(long param0, int param1, int param2) {
        int var5 = 89 / ((param1 - 3) / 62);
        ab var4 = he.field_e;
        var4.b((byte) -99, param2);
        var4.field_g = var4.field_g + 1;
        int var6 = var4.field_g;
        var4.f(7, (byte) -5);
        var4.a(param0, (byte) 110);
        var4.b(-var6 + var4.field_g, (byte) 43);
    }

    final static void i(byte param0) {
        df.a(1, cd.e(108));
        int var1 = -86 % ((param0 - -14) / 33);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, int param6, int param7, int param8, int param9, long param10, int param11, dl param12, boolean param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              df.field_z = new ab(param9);
              he.field_e = new ab(param6);
              md.field_c = param8;
              ho.field_c = param10;
              q.field_P = param2;
              ka.field_q = param5;
              if (!param13) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              fl.field_a = stackIn_3_0 != 0;
              vf.field_r = param1;
              gm.field_d = param0;
              ng.field_G = param11;
              if (!param4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              lk.field_d = stackIn_6_0 != 0;
              if (param3 == 0) {
                break L2;
              } else {
                field_gc = null;
                break L2;
              }
            }
            dh.field_Lb = param7;
            qg.field_b = param12;
            if (qg.field_b.field_n == null) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                pg.field_f = new sd(qg.field_b.field_n, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc f(byte param0) {
        if (param0 <= 13) {
            na.i((byte) 105);
            return nj.field_m.field_Cb;
        }
        return nj.field_m.field_Cb;
    }

    na(int param0) {
        super(0L, (kc) null);
        ((na) this).field_Wb = new byte[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Tb = "Giants' Mountains:";
        field_lc = "Lesson 7 of 7<br><br>Use of basic spells in a dangerous and unsecure environment.<br><br>Defeat the three cyclopes.<br><br><br>* Health display *<br>* Use of the minimap *<br>* Application of timed movement *<br>* Tactical combat *<br>* Sense of achievement in victory *";
        field_Sb = "Accept invitation to <%0>'s game";
        field_gc = "Withdraw invitation to <%0> to join this game";
    }
}
