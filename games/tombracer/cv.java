/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cv extends dg {
    private fla field_p;
    private bua field_s;
    private boolean field_n;
    private int field_q;
    private ut field_o;
    static Hashtable field_m;
    static String field_r;

    final void b(int param0, byte param1) {
        if (param1 != -112) {
            ((cv) this).d(-35);
            ((cv) this).field_q = param0;
            return;
        }
        ((cv) this).field_q = param0;
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        ((cv) this).field_q = param2.b((byte) 44, 4);
        if (param0 < 119) {
            ((cv) this).d(72);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        L0: {
          super.a(param0, param1, param2);
          if (param0 instanceof ut) {
            ((cv) this).field_o = (ut) (Object) param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (-4 != ((cv) this).field_q) {
          if (-2 != ((cv) this).field_q) {
            return;
          } else {
            ((cv) this).field_s = new bua(7, 8);
            return;
          }
        } else {
          ((cv) this).field_s = new bua(1, 10);
          return;
        }
    }

    cv(int param0) {
        super(param0);
        ((cv) this).field_n = false;
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 59, param1);
        param1.a((byte) 59, ((cv) this).field_q, 4);
        int var3 = 26 % ((-8 - param0) / 40);
    }

    public static void n(byte param0) {
        field_r = null;
        if (param0 <= 81) {
            return;
        }
        field_m = null;
    }

    final void a(gma param0, int param1, gr param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1 + 0, param2);
        if (param1 == -2159) {
          L0: {
            var4 = param0.c(-22);
            var5 = param0.a((byte) 55);
            if (-2097153 != var4) {
              break L0;
            } else {
              if (var5 != 2097152) {
                break L0;
              } else {
                ((cv) this).field_q = 0;
                return;
              }
            }
          }
          if (-4194305 != var4) {
            if (var4 <= var5) {
              ((cv) this).field_q = 5;
              return;
            } else {
              ((cv) this).field_q = 4;
              return;
            }
          } else {
            if (-4194305 != (var5 ^ -1)) {
              L1: {
                if (var4 > var5) {
                  ((cv) this).field_q = 4;
                  break L1;
                } else {
                  ((cv) this).field_q = 5;
                  break L1;
                }
              }
              return;
            } else {
              ((cv) this).field_q = 2;
              return;
            }
          }
        } else {
          ((cv) this).field_s = null;
          var4 = param0.c(-22);
          var5 = param0.a((byte) 55);
          if (-2097153 == var4) {
            if (var5 != 2097152) {
              L2: {
                L3: {
                  if (-4194305 != var4) {
                    break L3;
                  } else {
                    if (-4194305 == var5) {
                      ((cv) this).field_q = 2;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var4 > var5) {
                  ((cv) this).field_q = 4;
                  break L2;
                } else {
                  ((cv) this).field_q = 5;
                  break L2;
                }
              }
              return;
            } else {
              ((cv) this).field_q = 0;
              return;
            }
          } else {
            L4: {
              L5: {
                if (-4194305 != var4) {
                  break L5;
                } else {
                  if (-4194305 == (var5 ^ -1)) {
                    ((cv) this).field_q = 2;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (var4 > var5) {
                ((cv) this).field_q = 4;
                break L4;
              } else {
                ((cv) this).field_q = 5;
                break L4;
              }
            }
            return;
          }
        }
    }

    final int f(byte param0) {
        int var2 = 56 / ((param0 - 15) / 45);
        return -1;
    }

    final void d(int param0) {
        int var3 = 0;
        int var4 = 0;
        w var6 = null;
        w var7 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackIn_125_0 = null;
        Object stackIn_126_0 = null;
        Object stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        Object stackIn_133_0 = null;
        Object stackIn_134_0 = null;
        Object stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        Object stackIn_141_0 = null;
        Object stackIn_142_0 = null;
        Object stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        Object stackIn_147_0 = null;
        Object stackIn_148_0 = null;
        Object stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        Object stackIn_152_0 = null;
        Object stackIn_153_0 = null;
        Object stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        Object stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        Object stackIn_161_0 = null;
        Object stackIn_162_0 = null;
        Object stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        Object stackIn_173_0 = null;
        Object stackIn_174_0 = null;
        Object stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        Object stackIn_178_0 = null;
        Object stackIn_179_0 = null;
        Object stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        Object stackIn_183_0 = null;
        Object stackIn_184_0 = null;
        Object stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        Object stackIn_188_0 = null;
        Object stackIn_189_0 = null;
        Object stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        Object stackIn_192_0 = null;
        Object stackIn_193_0 = null;
        Object stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        Object stackIn_198_0 = null;
        Object stackIn_199_0 = null;
        Object stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        Object stackIn_203_0 = null;
        Object stackIn_204_0 = null;
        Object stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        Object stackIn_208_0 = null;
        Object stackIn_209_0 = null;
        Object stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        Object stackIn_212_0 = null;
        Object stackIn_213_0 = null;
        Object stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        Object stackIn_225_0 = null;
        Object stackIn_226_0 = null;
        Object stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        Object stackIn_229_0 = null;
        Object stackIn_230_0 = null;
        Object stackIn_231_0 = null;
        int stackIn_231_1 = 0;
        Object stackIn_236_0 = null;
        Object stackIn_237_0 = null;
        Object stackIn_238_0 = null;
        int stackIn_238_1 = 0;
        Object stackIn_240_0 = null;
        Object stackIn_241_0 = null;
        Object stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        Object stackIn_244_0 = null;
        Object stackIn_245_0 = null;
        Object stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        Object stackIn_254_0 = null;
        Object stackIn_255_0 = null;
        Object stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        Object stackIn_258_0 = null;
        Object stackIn_259_0 = null;
        Object stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        Object stackIn_265_0 = null;
        Object stackIn_266_0 = null;
        Object stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        Object stackIn_269_0 = null;
        Object stackIn_270_0 = null;
        Object stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        Object stackIn_273_0 = null;
        Object stackIn_274_0 = null;
        Object stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        Object stackIn_285_0 = null;
        Object stackIn_286_0 = null;
        Object stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        Object stackIn_289_0 = null;
        Object stackIn_290_0 = null;
        Object stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        Object stackIn_293_0 = null;
        Object stackIn_294_0 = null;
        Object stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        Object stackIn_305_0 = null;
        Object stackIn_306_0 = null;
        Object stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        Object stackIn_310_0 = null;
        Object stackIn_311_0 = null;
        Object stackIn_312_0 = null;
        int stackIn_312_1 = 0;
        Object stackIn_315_0 = null;
        Object stackIn_316_0 = null;
        Object stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        Object stackIn_320_0 = null;
        Object stackIn_321_0 = null;
        Object stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        Object stackIn_324_0 = null;
        Object stackIn_325_0 = null;
        Object stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        Object stackIn_328_0 = null;
        Object stackIn_329_0 = null;
        Object stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        Object stackIn_338_0 = null;
        Object stackIn_339_0 = null;
        Object stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        Object stackIn_342_0 = null;
        Object stackIn_343_0 = null;
        Object stackIn_344_0 = null;
        int stackIn_344_1 = 0;
        Object stackIn_349_0 = null;
        Object stackIn_350_0 = null;
        Object stackIn_351_0 = null;
        int stackIn_351_1 = 0;
        Object stackIn_353_0 = null;
        Object stackIn_354_0 = null;
        Object stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        Object stackIn_357_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        Object stackOut_352_0 = null;
        Object stackOut_354_0 = null;
        int stackOut_354_1 = 0;
        Object stackOut_353_0 = null;
        int stackOut_353_1 = 0;
        Object stackOut_337_0 = null;
        Object stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        Object stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        Object stackOut_341_0 = null;
        Object stackOut_343_0 = null;
        int stackOut_343_1 = 0;
        Object stackOut_342_0 = null;
        int stackOut_342_1 = 0;
        Object stackOut_348_0 = null;
        Object stackOut_350_0 = null;
        int stackOut_350_1 = 0;
        Object stackOut_349_0 = null;
        int stackOut_349_1 = 0;
        Object stackOut_356_0 = null;
        Object stackOut_358_0 = null;
        int stackOut_358_1 = 0;
        Object stackOut_357_0 = null;
        int stackOut_357_1 = 0;
        Object stackOut_327_0 = null;
        Object stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        Object stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        Object stackOut_304_0 = null;
        Object stackOut_306_0 = null;
        int stackOut_306_1 = 0;
        Object stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        Object stackOut_323_0 = null;
        Object stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        Object stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        Object stackOut_319_0 = null;
        Object stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        Object stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        Object stackOut_314_0 = null;
        Object stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        Object stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        Object stackOut_309_0 = null;
        Object stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        Object stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        Object stackOut_288_0 = null;
        Object stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        Object stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        Object stackOut_284_0 = null;
        Object stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        Object stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        Object stackOut_292_0 = null;
        Object stackOut_294_0 = null;
        int stackOut_294_1 = 0;
        Object stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        Object stackOut_268_0 = null;
        Object stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        Object stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        Object stackOut_253_0 = null;
        Object stackOut_255_0 = null;
        int stackOut_255_1 = 0;
        Object stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        Object stackOut_257_0 = null;
        Object stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        Object stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        Object stackOut_264_0 = null;
        Object stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        Object stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        Object stackOut_272_0 = null;
        Object stackOut_274_0 = null;
        int stackOut_274_1 = 0;
        Object stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        Object stackOut_239_0 = null;
        Object stackOut_241_0 = null;
        int stackOut_241_1 = 0;
        Object stackOut_240_0 = null;
        int stackOut_240_1 = 0;
        Object stackOut_224_0 = null;
        Object stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        Object stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        Object stackOut_228_0 = null;
        Object stackOut_230_0 = null;
        int stackOut_230_1 = 0;
        Object stackOut_229_0 = null;
        int stackOut_229_1 = 0;
        Object stackOut_235_0 = null;
        Object stackOut_237_0 = null;
        int stackOut_237_1 = 0;
        Object stackOut_236_0 = null;
        int stackOut_236_1 = 0;
        Object stackOut_243_0 = null;
        Object stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        Object stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        Object stackOut_191_0 = null;
        Object stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        Object stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        Object stackOut_187_0 = null;
        Object stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        Object stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        Object stackOut_182_0 = null;
        Object stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        Object stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        Object stackOut_177_0 = null;
        Object stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        Object stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        Object stackOut_172_0 = null;
        Object stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        Object stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        Object stackOut_211_0 = null;
        Object stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        Object stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        Object stackOut_207_0 = null;
        Object stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        Object stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        Object stackOut_202_0 = null;
        Object stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        Object stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        Object stackOut_197_0 = null;
        Object stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        Object stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        Object stackOut_124_0 = null;
        Object stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        Object stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        Object stackOut_110_0 = null;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        Object stackOut_140_0 = null;
        Object stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        Object stackOut_132_0 = null;
        Object stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        Object stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        Object stackOut_160_0 = null;
        Object stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        Object stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        Object stackOut_156_0 = null;
        Object stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        Object stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        Object stackOut_151_0 = null;
        Object stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        Object stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        Object stackOut_146_0 = null;
        Object stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        Object stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_72_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null != ((cv) this).field_s) {
          ((cv) this).field_s.a(param0 + 1);
          var7 = (w) (Object) ((cv) this).a(58).field_G;
          if (param0 != -1) {
            ((cv) this).field_o = null;
            if (var7 == null) {
              return;
            } else {
              var3 = ((cv) this).field_o.k((byte) -97).b(4) ? 1 : 0;
              if ((((cv) this).field_n ? 1 : 0) != var3) {
                if (1 != ((cv) this).field_q) {
                  if (((cv) this).field_q == 3) {
                    if (var3 != 0) {
                      L0: {
                        fla discarded$9 = var7.a(new fm(68, ((cv) this).b((byte) -107), ((cv) this).c((byte) 123), ((cv) this).e((byte) -111)), -58);
                        if ((((cv) this).field_q ^ -1) != -2) {
                          break L0;
                        } else {
                          if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                            break L0;
                          } else {
                            if (((cv) this).field_p == null) {
                              L1: {
                                ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                                stackOut_352_0 = this;
                                stackIn_354_0 = stackOut_352_0;
                                stackIn_353_0 = stackOut_352_0;
                                if (var3 == 0) {
                                  stackOut_354_0 = this;
                                  stackOut_354_1 = 0;
                                  stackIn_355_0 = stackOut_354_0;
                                  stackIn_355_1 = stackOut_354_1;
                                  break L1;
                                } else {
                                  stackOut_353_0 = this;
                                  stackOut_353_1 = 1;
                                  stackIn_355_0 = stackOut_353_0;
                                  stackIn_355_1 = stackOut_353_1;
                                  break L1;
                                }
                              }
                              ((cv) this).field_n = stackIn_355_1 != 0;
                              return;
                            } else {
                              L2: {
                                if (((cv) this).field_q != 1) {
                                  break L2;
                                } else {
                                  if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                    break L2;
                                  } else {
                                    if (((cv) this).field_p == null) {
                                      break L2;
                                    } else {
                                      L3: {
                                        ((cv) this).field_p.a(91, var7);
                                        ((cv) this).field_p = null;
                                        stackOut_337_0 = this;
                                        stackIn_339_0 = stackOut_337_0;
                                        stackIn_338_0 = stackOut_337_0;
                                        if (var3 == 0) {
                                          stackOut_339_0 = this;
                                          stackOut_339_1 = 0;
                                          stackIn_340_0 = stackOut_339_0;
                                          stackIn_340_1 = stackOut_339_1;
                                          break L3;
                                        } else {
                                          stackOut_338_0 = this;
                                          stackOut_338_1 = 1;
                                          stackIn_340_0 = stackOut_338_0;
                                          stackIn_340_1 = stackOut_338_1;
                                          break L3;
                                        }
                                      }
                                      ((cv) this).field_n = stackIn_340_1 != 0;
                                      return;
                                    }
                                  }
                                }
                              }
                              L4: {
                                stackOut_341_0 = this;
                                stackIn_343_0 = stackOut_341_0;
                                stackIn_342_0 = stackOut_341_0;
                                if (var3 == 0) {
                                  stackOut_343_0 = this;
                                  stackOut_343_1 = 0;
                                  stackIn_344_0 = stackOut_343_0;
                                  stackIn_344_1 = stackOut_343_1;
                                  break L4;
                                } else {
                                  stackOut_342_0 = this;
                                  stackOut_342_1 = 1;
                                  stackIn_344_0 = stackOut_342_0;
                                  stackIn_344_1 = stackOut_342_1;
                                  break L4;
                                }
                              }
                              ((cv) this).field_n = stackIn_344_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      L5: {
                        if (((cv) this).field_q != 1) {
                          break L5;
                        } else {
                          if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                            break L5;
                          } else {
                            if (((cv) this).field_p == null) {
                              break L5;
                            } else {
                              L6: {
                                ((cv) this).field_p.a(91, var7);
                                ((cv) this).field_p = null;
                                stackOut_348_0 = this;
                                stackIn_350_0 = stackOut_348_0;
                                stackIn_349_0 = stackOut_348_0;
                                if (var3 == 0) {
                                  stackOut_350_0 = this;
                                  stackOut_350_1 = 0;
                                  stackIn_351_0 = stackOut_350_0;
                                  stackIn_351_1 = stackOut_350_1;
                                  break L6;
                                } else {
                                  stackOut_349_0 = this;
                                  stackOut_349_1 = 1;
                                  stackIn_351_0 = stackOut_349_0;
                                  stackIn_351_1 = stackOut_349_1;
                                  break L6;
                                }
                              }
                              ((cv) this).field_n = stackIn_351_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      L7: {
                        stackOut_356_0 = this;
                        stackIn_358_0 = stackOut_356_0;
                        stackIn_357_0 = stackOut_356_0;
                        if (var3 == 0) {
                          stackOut_358_0 = this;
                          stackOut_358_1 = 0;
                          stackIn_359_0 = stackOut_358_0;
                          stackIn_359_1 = stackOut_358_1;
                          break L7;
                        } else {
                          stackOut_357_0 = this;
                          stackOut_357_1 = 1;
                          stackIn_359_0 = stackOut_357_0;
                          stackIn_359_1 = stackOut_357_1;
                          break L7;
                        }
                      }
                      ((cv) this).field_n = stackIn_359_1 != 0;
                      return;
                    } else {
                      L8: {
                        if ((((cv) this).field_q ^ -1) != -2) {
                          break L8;
                        } else {
                          if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                            break L8;
                          } else {
                            if (((cv) this).field_p == null) {
                              L9: {
                                ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                                stackOut_327_0 = this;
                                stackIn_329_0 = stackOut_327_0;
                                stackIn_328_0 = stackOut_327_0;
                                if (var3 == 0) {
                                  stackOut_329_0 = this;
                                  stackOut_329_1 = 0;
                                  stackIn_330_0 = stackOut_329_0;
                                  stackIn_330_1 = stackOut_329_1;
                                  break L9;
                                } else {
                                  stackOut_328_0 = this;
                                  stackOut_328_1 = 1;
                                  stackIn_330_0 = stackOut_328_0;
                                  stackIn_330_1 = stackOut_328_1;
                                  break L9;
                                }
                              }
                              ((cv) this).field_n = stackIn_330_1 != 0;
                              return;
                            } else {
                              L10: {
                                if (((cv) this).field_q != 1) {
                                  break L10;
                                } else {
                                  if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                    break L10;
                                  } else {
                                    if (((cv) this).field_p == null) {
                                      break L10;
                                    } else {
                                      ((cv) this).field_p.a(91, var7);
                                      ((cv) this).field_p = null;
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                stackOut_304_0 = this;
                                stackIn_306_0 = stackOut_304_0;
                                stackIn_305_0 = stackOut_304_0;
                                if (var3 == 0) {
                                  stackOut_306_0 = this;
                                  stackOut_306_1 = 0;
                                  stackIn_307_0 = stackOut_306_0;
                                  stackIn_307_1 = stackOut_306_1;
                                  break L11;
                                } else {
                                  stackOut_305_0 = this;
                                  stackOut_305_1 = 1;
                                  stackIn_307_0 = stackOut_305_0;
                                  stackIn_307_1 = stackOut_305_1;
                                  break L11;
                                }
                              }
                              ((cv) this).field_n = stackIn_307_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      if (((cv) this).field_q == 1) {
                        if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                          if (((cv) this).field_p != null) {
                            L12: {
                              ((cv) this).field_p.a(91, var7);
                              ((cv) this).field_p = null;
                              stackOut_323_0 = this;
                              stackIn_325_0 = stackOut_323_0;
                              stackIn_324_0 = stackOut_323_0;
                              if (var3 == 0) {
                                stackOut_325_0 = this;
                                stackOut_325_1 = 0;
                                stackIn_326_0 = stackOut_325_0;
                                stackIn_326_1 = stackOut_325_1;
                                break L12;
                              } else {
                                stackOut_324_0 = this;
                                stackOut_324_1 = 1;
                                stackIn_326_0 = stackOut_324_0;
                                stackIn_326_1 = stackOut_324_1;
                                break L12;
                              }
                            }
                            ((cv) this).field_n = stackIn_326_1 != 0;
                            return;
                          } else {
                            L13: {
                              stackOut_319_0 = this;
                              stackIn_321_0 = stackOut_319_0;
                              stackIn_320_0 = stackOut_319_0;
                              if (var3 == 0) {
                                stackOut_321_0 = this;
                                stackOut_321_1 = 0;
                                stackIn_322_0 = stackOut_321_0;
                                stackIn_322_1 = stackOut_321_1;
                                break L13;
                              } else {
                                stackOut_320_0 = this;
                                stackOut_320_1 = 1;
                                stackIn_322_0 = stackOut_320_0;
                                stackIn_322_1 = stackOut_320_1;
                                break L13;
                              }
                            }
                            ((cv) this).field_n = stackIn_322_1 != 0;
                            return;
                          }
                        } else {
                          L14: {
                            stackOut_314_0 = this;
                            stackIn_316_0 = stackOut_314_0;
                            stackIn_315_0 = stackOut_314_0;
                            if (var3 == 0) {
                              stackOut_316_0 = this;
                              stackOut_316_1 = 0;
                              stackIn_317_0 = stackOut_316_0;
                              stackIn_317_1 = stackOut_316_1;
                              break L14;
                            } else {
                              stackOut_315_0 = this;
                              stackOut_315_1 = 1;
                              stackIn_317_0 = stackOut_315_0;
                              stackIn_317_1 = stackOut_315_1;
                              break L14;
                            }
                          }
                          ((cv) this).field_n = stackIn_317_1 != 0;
                          return;
                        }
                      } else {
                        L15: {
                          stackOut_309_0 = this;
                          stackIn_311_0 = stackOut_309_0;
                          stackIn_310_0 = stackOut_309_0;
                          if (var3 == 0) {
                            stackOut_311_0 = this;
                            stackOut_311_1 = 0;
                            stackIn_312_0 = stackOut_311_0;
                            stackIn_312_1 = stackOut_311_1;
                            break L15;
                          } else {
                            stackOut_310_0 = this;
                            stackOut_310_1 = 1;
                            stackIn_312_0 = stackOut_310_0;
                            stackIn_312_1 = stackOut_310_1;
                            break L15;
                          }
                        }
                        ((cv) this).field_n = stackIn_312_1 != 0;
                        return;
                      }
                    }
                  } else {
                    L16: {
                      if ((((cv) this).field_q ^ -1) != -2) {
                        break L16;
                      } else {
                        if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                          break L16;
                        } else {
                          if (((cv) this).field_p == null) {
                            L17: {
                              ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                              stackOut_288_0 = this;
                              stackIn_290_0 = stackOut_288_0;
                              stackIn_289_0 = stackOut_288_0;
                              if (var3 == 0) {
                                stackOut_290_0 = this;
                                stackOut_290_1 = 0;
                                stackIn_291_0 = stackOut_290_0;
                                stackIn_291_1 = stackOut_290_1;
                                break L17;
                              } else {
                                stackOut_289_0 = this;
                                stackOut_289_1 = 1;
                                stackIn_291_0 = stackOut_289_0;
                                stackIn_291_1 = stackOut_289_1;
                                break L17;
                              }
                            }
                            ((cv) this).field_n = stackIn_291_1 != 0;
                            return;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    L18: {
                      if (((cv) this).field_q != 1) {
                        break L18;
                      } else {
                        if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                          break L18;
                        } else {
                          if (((cv) this).field_p == null) {
                            break L18;
                          } else {
                            L19: {
                              ((cv) this).field_p.a(91, var7);
                              ((cv) this).field_p = null;
                              stackOut_284_0 = this;
                              stackIn_286_0 = stackOut_284_0;
                              stackIn_285_0 = stackOut_284_0;
                              if (var3 == 0) {
                                stackOut_286_0 = this;
                                stackOut_286_1 = 0;
                                stackIn_287_0 = stackOut_286_0;
                                stackIn_287_1 = stackOut_286_1;
                                break L19;
                              } else {
                                stackOut_285_0 = this;
                                stackOut_285_1 = 1;
                                stackIn_287_0 = stackOut_285_0;
                                stackIn_287_1 = stackOut_285_1;
                                break L19;
                              }
                            }
                            ((cv) this).field_n = stackIn_287_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L20: {
                      stackOut_292_0 = this;
                      stackIn_294_0 = stackOut_292_0;
                      stackIn_293_0 = stackOut_292_0;
                      if (var3 == 0) {
                        stackOut_294_0 = this;
                        stackOut_294_1 = 0;
                        stackIn_295_0 = stackOut_294_0;
                        stackIn_295_1 = stackOut_294_1;
                        break L20;
                      } else {
                        stackOut_293_0 = this;
                        stackOut_293_1 = 1;
                        stackIn_295_0 = stackOut_293_0;
                        stackIn_295_1 = stackOut_293_1;
                        break L20;
                      }
                    }
                    ((cv) this).field_n = stackIn_295_1 != 0;
                    return;
                  }
                } else {
                  if (var3 != 0) {
                    L21: {
                      fla discarded$10 = var7.a(new fm(51, ((cv) this).b((byte) 90), ((cv) this).c((byte) 119), ((cv) this).e((byte) -106)), param0 ^ 57);
                      if ((((cv) this).field_q ^ -1) != -2) {
                        break L21;
                      } else {
                        if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                          break L21;
                        } else {
                          if (((cv) this).field_p == null) {
                            L22: {
                              ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                              stackOut_268_0 = this;
                              stackIn_270_0 = stackOut_268_0;
                              stackIn_269_0 = stackOut_268_0;
                              if (var3 == 0) {
                                stackOut_270_0 = this;
                                stackOut_270_1 = 0;
                                stackIn_271_0 = stackOut_270_0;
                                stackIn_271_1 = stackOut_270_1;
                                break L22;
                              } else {
                                stackOut_269_0 = this;
                                stackOut_269_1 = 1;
                                stackIn_271_0 = stackOut_269_0;
                                stackIn_271_1 = stackOut_269_1;
                                break L22;
                              }
                            }
                            ((cv) this).field_n = stackIn_271_1 != 0;
                            return;
                          } else {
                            L23: {
                              if (((cv) this).field_q != 1) {
                                break L23;
                              } else {
                                if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                  break L23;
                                } else {
                                  if (((cv) this).field_p == null) {
                                    break L23;
                                  } else {
                                    L24: {
                                      ((cv) this).field_p.a(91, var7);
                                      ((cv) this).field_p = null;
                                      stackOut_253_0 = this;
                                      stackIn_255_0 = stackOut_253_0;
                                      stackIn_254_0 = stackOut_253_0;
                                      if (var3 == 0) {
                                        stackOut_255_0 = this;
                                        stackOut_255_1 = 0;
                                        stackIn_256_0 = stackOut_255_0;
                                        stackIn_256_1 = stackOut_255_1;
                                        break L24;
                                      } else {
                                        stackOut_254_0 = this;
                                        stackOut_254_1 = 1;
                                        stackIn_256_0 = stackOut_254_0;
                                        stackIn_256_1 = stackOut_254_1;
                                        break L24;
                                      }
                                    }
                                    ((cv) this).field_n = stackIn_256_1 != 0;
                                    return;
                                  }
                                }
                              }
                            }
                            L25: {
                              stackOut_257_0 = this;
                              stackIn_259_0 = stackOut_257_0;
                              stackIn_258_0 = stackOut_257_0;
                              if (var3 == 0) {
                                stackOut_259_0 = this;
                                stackOut_259_1 = 0;
                                stackIn_260_0 = stackOut_259_0;
                                stackIn_260_1 = stackOut_259_1;
                                break L25;
                              } else {
                                stackOut_258_0 = this;
                                stackOut_258_1 = 1;
                                stackIn_260_0 = stackOut_258_0;
                                stackIn_260_1 = stackOut_258_1;
                                break L25;
                              }
                            }
                            ((cv) this).field_n = stackIn_260_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L26: {
                      if (((cv) this).field_q != 1) {
                        break L26;
                      } else {
                        if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                          break L26;
                        } else {
                          if (((cv) this).field_p == null) {
                            break L26;
                          } else {
                            L27: {
                              ((cv) this).field_p.a(91, var7);
                              ((cv) this).field_p = null;
                              stackOut_264_0 = this;
                              stackIn_266_0 = stackOut_264_0;
                              stackIn_265_0 = stackOut_264_0;
                              if (var3 == 0) {
                                stackOut_266_0 = this;
                                stackOut_266_1 = 0;
                                stackIn_267_0 = stackOut_266_0;
                                stackIn_267_1 = stackOut_266_1;
                                break L27;
                              } else {
                                stackOut_265_0 = this;
                                stackOut_265_1 = 1;
                                stackIn_267_0 = stackOut_265_0;
                                stackIn_267_1 = stackOut_265_1;
                                break L27;
                              }
                            }
                            ((cv) this).field_n = stackIn_267_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L28: {
                      stackOut_272_0 = this;
                      stackIn_274_0 = stackOut_272_0;
                      stackIn_273_0 = stackOut_272_0;
                      if (var3 == 0) {
                        stackOut_274_0 = this;
                        stackOut_274_1 = 0;
                        stackIn_275_0 = stackOut_274_0;
                        stackIn_275_1 = stackOut_274_1;
                        break L28;
                      } else {
                        stackOut_273_0 = this;
                        stackOut_273_1 = 1;
                        stackIn_275_0 = stackOut_273_0;
                        stackIn_275_1 = stackOut_273_1;
                        break L28;
                      }
                    }
                    ((cv) this).field_n = stackIn_275_1 != 0;
                    return;
                  } else {
                    L29: {
                      fla discarded$11 = var7.a(new fm(52, ((cv) this).b((byte) -119), ((cv) this).c((byte) 112), ((cv) this).e((byte) -96)), -58);
                      if ((((cv) this).field_q ^ -1) != -2) {
                        break L29;
                      } else {
                        if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                          break L29;
                        } else {
                          if (((cv) this).field_p == null) {
                            L30: {
                              ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                              stackOut_239_0 = this;
                              stackIn_241_0 = stackOut_239_0;
                              stackIn_240_0 = stackOut_239_0;
                              if (var3 == 0) {
                                stackOut_241_0 = this;
                                stackOut_241_1 = 0;
                                stackIn_242_0 = stackOut_241_0;
                                stackIn_242_1 = stackOut_241_1;
                                break L30;
                              } else {
                                stackOut_240_0 = this;
                                stackOut_240_1 = 1;
                                stackIn_242_0 = stackOut_240_0;
                                stackIn_242_1 = stackOut_240_1;
                                break L30;
                              }
                            }
                            ((cv) this).field_n = stackIn_242_1 != 0;
                            return;
                          } else {
                            L31: {
                              if (((cv) this).field_q != 1) {
                                break L31;
                              } else {
                                if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                  break L31;
                                } else {
                                  if (((cv) this).field_p == null) {
                                    break L31;
                                  } else {
                                    L32: {
                                      ((cv) this).field_p.a(91, var7);
                                      ((cv) this).field_p = null;
                                      stackOut_224_0 = this;
                                      stackIn_226_0 = stackOut_224_0;
                                      stackIn_225_0 = stackOut_224_0;
                                      if (var3 == 0) {
                                        stackOut_226_0 = this;
                                        stackOut_226_1 = 0;
                                        stackIn_227_0 = stackOut_226_0;
                                        stackIn_227_1 = stackOut_226_1;
                                        break L32;
                                      } else {
                                        stackOut_225_0 = this;
                                        stackOut_225_1 = 1;
                                        stackIn_227_0 = stackOut_225_0;
                                        stackIn_227_1 = stackOut_225_1;
                                        break L32;
                                      }
                                    }
                                    ((cv) this).field_n = stackIn_227_1 != 0;
                                    return;
                                  }
                                }
                              }
                            }
                            L33: {
                              stackOut_228_0 = this;
                              stackIn_230_0 = stackOut_228_0;
                              stackIn_229_0 = stackOut_228_0;
                              if (var3 == 0) {
                                stackOut_230_0 = this;
                                stackOut_230_1 = 0;
                                stackIn_231_0 = stackOut_230_0;
                                stackIn_231_1 = stackOut_230_1;
                                break L33;
                              } else {
                                stackOut_229_0 = this;
                                stackOut_229_1 = 1;
                                stackIn_231_0 = stackOut_229_0;
                                stackIn_231_1 = stackOut_229_1;
                                break L33;
                              }
                            }
                            ((cv) this).field_n = stackIn_231_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L34: {
                      if (((cv) this).field_q != 1) {
                        break L34;
                      } else {
                        if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                          break L34;
                        } else {
                          if (((cv) this).field_p == null) {
                            break L34;
                          } else {
                            L35: {
                              ((cv) this).field_p.a(91, var7);
                              ((cv) this).field_p = null;
                              stackOut_235_0 = this;
                              stackIn_237_0 = stackOut_235_0;
                              stackIn_236_0 = stackOut_235_0;
                              if (var3 == 0) {
                                stackOut_237_0 = this;
                                stackOut_237_1 = 0;
                                stackIn_238_0 = stackOut_237_0;
                                stackIn_238_1 = stackOut_237_1;
                                break L35;
                              } else {
                                stackOut_236_0 = this;
                                stackOut_236_1 = 1;
                                stackIn_238_0 = stackOut_236_0;
                                stackIn_238_1 = stackOut_236_1;
                                break L35;
                              }
                            }
                            ((cv) this).field_n = stackIn_238_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    L36: {
                      stackOut_243_0 = this;
                      stackIn_245_0 = stackOut_243_0;
                      stackIn_244_0 = stackOut_243_0;
                      if (var3 == 0) {
                        stackOut_245_0 = this;
                        stackOut_245_1 = 0;
                        stackIn_246_0 = stackOut_245_0;
                        stackIn_246_1 = stackOut_245_1;
                        break L36;
                      } else {
                        stackOut_244_0 = this;
                        stackOut_244_1 = 1;
                        stackIn_246_0 = stackOut_244_0;
                        stackIn_246_1 = stackOut_244_1;
                        break L36;
                      }
                    }
                    ((cv) this).field_n = stackIn_246_1 != 0;
                    return;
                  }
                }
              } else {
                L37: {
                  if ((((cv) this).field_q ^ -1) != -2) {
                    break L37;
                  } else {
                    if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                      break L37;
                    } else {
                      if (((cv) this).field_p != null) {
                        if (((cv) this).field_q == 1) {
                          if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                            if (((cv) this).field_p == null) {
                              L38: {
                                stackOut_191_0 = this;
                                stackIn_193_0 = stackOut_191_0;
                                stackIn_192_0 = stackOut_191_0;
                                if (var3 == 0) {
                                  stackOut_193_0 = this;
                                  stackOut_193_1 = 0;
                                  stackIn_194_0 = stackOut_193_0;
                                  stackIn_194_1 = stackOut_193_1;
                                  break L38;
                                } else {
                                  stackOut_192_0 = this;
                                  stackOut_192_1 = 1;
                                  stackIn_194_0 = stackOut_192_0;
                                  stackIn_194_1 = stackOut_192_1;
                                  break L38;
                                }
                              }
                              ((cv) this).field_n = stackIn_194_1 != 0;
                              return;
                            } else {
                              L39: {
                                ((cv) this).field_p.a(91, var7);
                                ((cv) this).field_p = null;
                                stackOut_187_0 = this;
                                stackIn_189_0 = stackOut_187_0;
                                stackIn_188_0 = stackOut_187_0;
                                if (var3 == 0) {
                                  stackOut_189_0 = this;
                                  stackOut_189_1 = 0;
                                  stackIn_190_0 = stackOut_189_0;
                                  stackIn_190_1 = stackOut_189_1;
                                  break L39;
                                } else {
                                  stackOut_188_0 = this;
                                  stackOut_188_1 = 1;
                                  stackIn_190_0 = stackOut_188_0;
                                  stackIn_190_1 = stackOut_188_1;
                                  break L39;
                                }
                              }
                              ((cv) this).field_n = stackIn_190_1 != 0;
                              return;
                            }
                          } else {
                            L40: {
                              stackOut_182_0 = this;
                              stackIn_184_0 = stackOut_182_0;
                              stackIn_183_0 = stackOut_182_0;
                              if (var3 == 0) {
                                stackOut_184_0 = this;
                                stackOut_184_1 = 0;
                                stackIn_185_0 = stackOut_184_0;
                                stackIn_185_1 = stackOut_184_1;
                                break L40;
                              } else {
                                stackOut_183_0 = this;
                                stackOut_183_1 = 1;
                                stackIn_185_0 = stackOut_183_0;
                                stackIn_185_1 = stackOut_183_1;
                                break L40;
                              }
                            }
                            ((cv) this).field_n = stackIn_185_1 != 0;
                            return;
                          }
                        } else {
                          L41: {
                            stackOut_177_0 = this;
                            stackIn_179_0 = stackOut_177_0;
                            stackIn_178_0 = stackOut_177_0;
                            if (var3 == 0) {
                              stackOut_179_0 = this;
                              stackOut_179_1 = 0;
                              stackIn_180_0 = stackOut_179_0;
                              stackIn_180_1 = stackOut_179_1;
                              break L41;
                            } else {
                              stackOut_178_0 = this;
                              stackOut_178_1 = 1;
                              stackIn_180_0 = stackOut_178_0;
                              stackIn_180_1 = stackOut_178_1;
                              break L41;
                            }
                          }
                          ((cv) this).field_n = stackIn_180_1 != 0;
                          return;
                        }
                      } else {
                        L42: {
                          ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                          stackOut_172_0 = this;
                          stackIn_174_0 = stackOut_172_0;
                          stackIn_173_0 = stackOut_172_0;
                          if (var3 == 0) {
                            stackOut_174_0 = this;
                            stackOut_174_1 = 0;
                            stackIn_175_0 = stackOut_174_0;
                            stackIn_175_1 = stackOut_174_1;
                            break L42;
                          } else {
                            stackOut_173_0 = this;
                            stackOut_173_1 = 1;
                            stackIn_175_0 = stackOut_173_0;
                            stackIn_175_1 = stackOut_173_1;
                            break L42;
                          }
                        }
                        ((cv) this).field_n = stackIn_175_1 != 0;
                        return;
                      }
                    }
                  }
                }
                if (((cv) this).field_q == 1) {
                  if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                    if (((cv) this).field_p != null) {
                      L43: {
                        ((cv) this).field_p.a(91, var7);
                        ((cv) this).field_p = null;
                        stackOut_211_0 = this;
                        stackIn_213_0 = stackOut_211_0;
                        stackIn_212_0 = stackOut_211_0;
                        if (var3 == 0) {
                          stackOut_213_0 = this;
                          stackOut_213_1 = 0;
                          stackIn_214_0 = stackOut_213_0;
                          stackIn_214_1 = stackOut_213_1;
                          break L43;
                        } else {
                          stackOut_212_0 = this;
                          stackOut_212_1 = 1;
                          stackIn_214_0 = stackOut_212_0;
                          stackIn_214_1 = stackOut_212_1;
                          break L43;
                        }
                      }
                      ((cv) this).field_n = stackIn_214_1 != 0;
                      return;
                    } else {
                      L44: {
                        stackOut_207_0 = this;
                        stackIn_209_0 = stackOut_207_0;
                        stackIn_208_0 = stackOut_207_0;
                        if (var3 == 0) {
                          stackOut_209_0 = this;
                          stackOut_209_1 = 0;
                          stackIn_210_0 = stackOut_209_0;
                          stackIn_210_1 = stackOut_209_1;
                          break L44;
                        } else {
                          stackOut_208_0 = this;
                          stackOut_208_1 = 1;
                          stackIn_210_0 = stackOut_208_0;
                          stackIn_210_1 = stackOut_208_1;
                          break L44;
                        }
                      }
                      ((cv) this).field_n = stackIn_210_1 != 0;
                      return;
                    }
                  } else {
                    L45: {
                      stackOut_202_0 = this;
                      stackIn_204_0 = stackOut_202_0;
                      stackIn_203_0 = stackOut_202_0;
                      if (var3 == 0) {
                        stackOut_204_0 = this;
                        stackOut_204_1 = 0;
                        stackIn_205_0 = stackOut_204_0;
                        stackIn_205_1 = stackOut_204_1;
                        break L45;
                      } else {
                        stackOut_203_0 = this;
                        stackOut_203_1 = 1;
                        stackIn_205_0 = stackOut_203_0;
                        stackIn_205_1 = stackOut_203_1;
                        break L45;
                      }
                    }
                    ((cv) this).field_n = stackIn_205_1 != 0;
                    return;
                  }
                } else {
                  L46: {
                    stackOut_197_0 = this;
                    stackIn_199_0 = stackOut_197_0;
                    stackIn_198_0 = stackOut_197_0;
                    if (var3 == 0) {
                      stackOut_199_0 = this;
                      stackOut_199_1 = 0;
                      stackIn_200_0 = stackOut_199_0;
                      stackIn_200_1 = stackOut_199_1;
                      break L46;
                    } else {
                      stackOut_198_0 = this;
                      stackOut_198_1 = 1;
                      stackIn_200_0 = stackOut_198_0;
                      stackIn_200_1 = stackOut_198_1;
                      break L46;
                    }
                  }
                  ((cv) this).field_n = stackIn_200_1 != 0;
                  return;
                }
              }
            }
          } else {
            if (var7 == null) {
              return;
            } else {
              L47: {
                var3 = ((cv) this).field_o.k((byte) -97).b(4) ? 1 : 0;
                if ((((cv) this).field_n ? 1 : 0) == var3) {
                  break L47;
                } else {
                  if (1 != ((cv) this).field_q) {
                    if (((cv) this).field_q == 3) {
                      if (var3 != 0) {
                        fla discarded$12 = var7.a(new fm(68, ((cv) this).b((byte) -107), ((cv) this).c((byte) 123), ((cv) this).e((byte) -111)), -58);
                        break L47;
                      } else {
                        L48: {
                          L49: {
                            if ((((cv) this).field_q ^ -1) != -2) {
                              break L49;
                            } else {
                              if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                                break L49;
                              } else {
                                if (((cv) this).field_p == null) {
                                  ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                                  break L48;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                          if (((cv) this).field_q != 1) {
                            break L48;
                          } else {
                            if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                              break L48;
                            } else {
                              if (((cv) this).field_p == null) {
                                break L48;
                              } else {
                                ((cv) this).field_p.a(91, var7);
                                ((cv) this).field_p = null;
                                break L48;
                              }
                            }
                          }
                        }
                        L50: {
                          stackOut_124_0 = this;
                          stackIn_126_0 = stackOut_124_0;
                          stackIn_125_0 = stackOut_124_0;
                          if (var3 == 0) {
                            stackOut_126_0 = this;
                            stackOut_126_1 = 0;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            break L50;
                          } else {
                            stackOut_125_0 = this;
                            stackOut_125_1 = 1;
                            stackIn_127_0 = stackOut_125_0;
                            stackIn_127_1 = stackOut_125_1;
                            break L50;
                          }
                        }
                        ((cv) this).field_n = stackIn_127_1 != 0;
                        return;
                      }
                    } else {
                      L51: {
                        if ((((cv) this).field_q ^ -1) != -2) {
                          if (((cv) this).field_q != 1) {
                            break L51;
                          } else {
                            if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                              if (((cv) this).field_p == null) {
                                break L51;
                              } else {
                                ((cv) this).field_p.a(91, var7);
                                ((cv) this).field_p = null;
                                break L51;
                              }
                            } else {
                              if (((cv) this).field_q != 1) {
                                break L51;
                              } else {
                                if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                  break L51;
                                } else {
                                  if (((cv) this).field_p == null) {
                                    break L51;
                                  } else {
                                    ((cv) this).field_p.a(91, var7);
                                    ((cv) this).field_p = null;
                                    break L51;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (((cv) this).field_q != 1) {
                            break L51;
                          } else {
                            if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                              break L51;
                            } else {
                              if (((cv) this).field_p == null) {
                                break L51;
                              } else {
                                ((cv) this).field_p.a(91, var7);
                                ((cv) this).field_p = null;
                                break L51;
                              }
                            }
                          }
                        }
                      }
                      L52: {
                        stackOut_110_0 = this;
                        stackIn_112_0 = stackOut_110_0;
                        stackIn_111_0 = stackOut_110_0;
                        if (var3 == 0) {
                          stackOut_112_0 = this;
                          stackOut_112_1 = 0;
                          stackIn_113_0 = stackOut_112_0;
                          stackIn_113_1 = stackOut_112_1;
                          break L52;
                        } else {
                          stackOut_111_0 = this;
                          stackOut_111_1 = 1;
                          stackIn_113_0 = stackOut_111_0;
                          stackIn_113_1 = stackOut_111_1;
                          break L52;
                        }
                      }
                      ((cv) this).field_n = stackIn_113_1 != 0;
                      return;
                    }
                  } else {
                    if (var3 != 0) {
                      fla discarded$13 = var7.a(new fm(51, ((cv) this).b((byte) 90), ((cv) this).c((byte) 119), ((cv) this).e((byte) -106)), param0 ^ 57);
                      break L47;
                    } else {
                      fla discarded$14 = var7.a(new fm(52, ((cv) this).b((byte) -119), ((cv) this).c((byte) 112), ((cv) this).e((byte) -96)), -58);
                      break L47;
                    }
                  }
                }
              }
              L53: {
                if ((((cv) this).field_q ^ -1) != -2) {
                  break L53;
                } else {
                  if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                    break L53;
                  } else {
                    if (((cv) this).field_p != null) {
                      L54: {
                        if (((cv) this).field_q != 1) {
                          break L54;
                        } else {
                          if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                            break L54;
                          } else {
                            if (((cv) this).field_p == null) {
                              break L54;
                            } else {
                              ((cv) this).field_p.a(91, var7);
                              ((cv) this).field_p = null;
                              break L54;
                            }
                          }
                        }
                      }
                      L55: {
                        stackOut_140_0 = this;
                        stackIn_142_0 = stackOut_140_0;
                        stackIn_141_0 = stackOut_140_0;
                        if (var3 == 0) {
                          stackOut_142_0 = this;
                          stackOut_142_1 = 0;
                          stackIn_143_0 = stackOut_142_0;
                          stackIn_143_1 = stackOut_142_1;
                          break L55;
                        } else {
                          stackOut_141_0 = this;
                          stackOut_141_1 = 1;
                          stackIn_143_0 = stackOut_141_0;
                          stackIn_143_1 = stackOut_141_1;
                          break L55;
                        }
                      }
                      ((cv) this).field_n = stackIn_143_1 != 0;
                      return;
                    } else {
                      L56: {
                        ((cv) this).field_p = var7.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                        stackOut_132_0 = this;
                        stackIn_134_0 = stackOut_132_0;
                        stackIn_133_0 = stackOut_132_0;
                        if (var3 == 0) {
                          stackOut_134_0 = this;
                          stackOut_134_1 = 0;
                          stackIn_135_0 = stackOut_134_0;
                          stackIn_135_1 = stackOut_134_1;
                          break L56;
                        } else {
                          stackOut_133_0 = this;
                          stackOut_133_1 = 1;
                          stackIn_135_0 = stackOut_133_0;
                          stackIn_135_1 = stackOut_133_1;
                          break L56;
                        }
                      }
                      ((cv) this).field_n = stackIn_135_1 != 0;
                      return;
                    }
                  }
                }
              }
              if (((cv) this).field_q == 1) {
                if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                  if (((cv) this).field_p != null) {
                    L57: {
                      ((cv) this).field_p.a(91, var7);
                      ((cv) this).field_p = null;
                      stackOut_160_0 = this;
                      stackIn_162_0 = stackOut_160_0;
                      stackIn_161_0 = stackOut_160_0;
                      if (var3 == 0) {
                        stackOut_162_0 = this;
                        stackOut_162_1 = 0;
                        stackIn_163_0 = stackOut_162_0;
                        stackIn_163_1 = stackOut_162_1;
                        break L57;
                      } else {
                        stackOut_161_0 = this;
                        stackOut_161_1 = 1;
                        stackIn_163_0 = stackOut_161_0;
                        stackIn_163_1 = stackOut_161_1;
                        break L57;
                      }
                    }
                    ((cv) this).field_n = stackIn_163_1 != 0;
                    return;
                  } else {
                    L58: {
                      stackOut_156_0 = this;
                      stackIn_158_0 = stackOut_156_0;
                      stackIn_157_0 = stackOut_156_0;
                      if (var3 == 0) {
                        stackOut_158_0 = this;
                        stackOut_158_1 = 0;
                        stackIn_159_0 = stackOut_158_0;
                        stackIn_159_1 = stackOut_158_1;
                        break L58;
                      } else {
                        stackOut_157_0 = this;
                        stackOut_157_1 = 1;
                        stackIn_159_0 = stackOut_157_0;
                        stackIn_159_1 = stackOut_157_1;
                        break L58;
                      }
                    }
                    ((cv) this).field_n = stackIn_159_1 != 0;
                    return;
                  }
                } else {
                  L59: {
                    stackOut_151_0 = this;
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (var3 == 0) {
                      stackOut_153_0 = this;
                      stackOut_153_1 = 0;
                      stackIn_154_0 = stackOut_153_0;
                      stackIn_154_1 = stackOut_153_1;
                      break L59;
                    } else {
                      stackOut_152_0 = this;
                      stackOut_152_1 = 1;
                      stackIn_154_0 = stackOut_152_0;
                      stackIn_154_1 = stackOut_152_1;
                      break L59;
                    }
                  }
                  ((cv) this).field_n = stackIn_154_1 != 0;
                  return;
                }
              } else {
                L60: {
                  stackOut_146_0 = this;
                  stackIn_148_0 = stackOut_146_0;
                  stackIn_147_0 = stackOut_146_0;
                  if (var3 == 0) {
                    stackOut_148_0 = this;
                    stackOut_148_1 = 0;
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    break L60;
                  } else {
                    stackOut_147_0 = this;
                    stackOut_147_1 = 1;
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_149_1 = stackOut_147_1;
                    break L60;
                  }
                }
                ((cv) this).field_n = stackIn_149_1 != 0;
                return;
              }
            }
          }
        } else {
          L61: {
            var6 = (w) (Object) ((cv) this).a(58).field_G;
            if (param0 == -1) {
              break L61;
            } else {
              ((cv) this).field_o = null;
              break L61;
            }
          }
          if (var6 == null) {
            return;
          } else {
            L62: {
              var3 = ((cv) this).field_o.k((byte) -97).b(4) ? 1 : 0;
              if ((((cv) this).field_n ? 1 : 0) == var3) {
                break L62;
              } else {
                if (1 != ((cv) this).field_q) {
                  if (((cv) this).field_q == 3) {
                    if (var3 != 0) {
                      fla discarded$15 = var6.a(new fm(68, ((cv) this).b((byte) -107), ((cv) this).c((byte) 123), ((cv) this).e((byte) -111)), -58);
                      break L62;
                    } else {
                      L63: {
                        if ((((cv) this).field_q ^ -1) != -2) {
                          if (((cv) this).field_q != 1) {
                            break L63;
                          } else {
                            if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                              if (((cv) this).field_p == null) {
                                break L63;
                              } else {
                                ((cv) this).field_p.a(91, var6);
                                ((cv) this).field_p = null;
                                break L63;
                              }
                            } else {
                              if (((cv) this).field_q != 1) {
                                break L63;
                              } else {
                                if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                  break L63;
                                } else {
                                  if (((cv) this).field_p == null) {
                                    break L63;
                                  } else {
                                    ((cv) this).field_p.a(91, var6);
                                    ((cv) this).field_p = null;
                                    break L63;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (((cv) this).field_q != 1) {
                            break L63;
                          } else {
                            if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                              break L63;
                            } else {
                              if (((cv) this).field_p == null) {
                                break L63;
                              } else {
                                ((cv) this).field_p.a(91, var6);
                                ((cv) this).field_p = null;
                                break L63;
                              }
                            }
                          }
                        }
                      }
                      L64: {
                        stackOut_45_0 = this;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (var3 == 0) {
                          stackOut_47_0 = this;
                          stackOut_47_1 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          break L64;
                        } else {
                          stackOut_46_0 = this;
                          stackOut_46_1 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          break L64;
                        }
                      }
                      ((cv) this).field_n = stackIn_48_1 != 0;
                      return;
                    }
                  } else {
                    L65: {
                      if ((((cv) this).field_q ^ -1) != -2) {
                        if (((cv) this).field_q != 1) {
                          break L65;
                        } else {
                          if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                            if (((cv) this).field_p == null) {
                              break L65;
                            } else {
                              ((cv) this).field_p.a(91, var6);
                              ((cv) this).field_p = null;
                              break L65;
                            }
                          } else {
                            if (((cv) this).field_q != 1) {
                              break L65;
                            } else {
                              if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                                break L65;
                              } else {
                                if (((cv) this).field_p == null) {
                                  break L65;
                                } else {
                                  ((cv) this).field_p.a(91, var6);
                                  ((cv) this).field_p = null;
                                  break L65;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (((cv) this).field_q != 1) {
                          break L65;
                        } else {
                          if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                            break L65;
                          } else {
                            if (((cv) this).field_p == null) {
                              break L65;
                            } else {
                              ((cv) this).field_p.a(91, var6);
                              ((cv) this).field_p = null;
                              break L65;
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      stackOut_26_0 = this;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var3 == 0) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L66;
                      } else {
                        stackOut_27_0 = this;
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L66;
                      }
                    }
                    ((cv) this).field_n = stackIn_29_1 != 0;
                    return;
                  }
                } else {
                  if (var3 != 0) {
                    fla discarded$16 = var6.a(new fm(51, ((cv) this).b((byte) 90), ((cv) this).c((byte) 119), ((cv) this).e((byte) -106)), param0 ^ 57);
                    break L62;
                  } else {
                    fla discarded$17 = var6.a(new fm(52, ((cv) this).b((byte) -119), ((cv) this).c((byte) 112), ((cv) this).e((byte) -96)), -58);
                    break L62;
                  }
                }
              }
            }
            L67: {
              if ((((cv) this).field_q ^ -1) != -2) {
                break L67;
              } else {
                if (!((cv) this).field_o.k((byte) -126).b((byte) 89)) {
                  break L67;
                } else {
                  if (((cv) this).field_p != null) {
                    L68: {
                      if (((cv) this).field_q != 1) {
                        break L68;
                      } else {
                        if (((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                          break L68;
                        } else {
                          if (((cv) this).field_p == null) {
                            break L68;
                          } else {
                            ((cv) this).field_p.a(91, var6);
                            ((cv) this).field_p = null;
                            break L68;
                          }
                        }
                      }
                    }
                    L69: {
                      stackOut_61_0 = this;
                      stackIn_63_0 = stackOut_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      if (var3 == 0) {
                        stackOut_63_0 = this;
                        stackOut_63_1 = 0;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        break L69;
                      } else {
                        stackOut_62_0 = this;
                        stackOut_62_1 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        break L69;
                      }
                    }
                    ((cv) this).field_n = stackIn_64_1 != 0;
                    return;
                  } else {
                    L70: {
                      ((cv) this).field_p = var6.a(new fm(53, ((cv) this).b((byte) -102), ((cv) this).c((byte) 116), ((cv) this).e((byte) -89)), -58);
                      stackOut_53_0 = this;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if (var3 == 0) {
                        stackOut_55_0 = this;
                        stackOut_55_1 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        break L70;
                      } else {
                        stackOut_54_0 = this;
                        stackOut_54_1 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        break L70;
                      }
                    }
                    ((cv) this).field_n = stackIn_56_1 != 0;
                    return;
                  }
                }
              }
            }
            if (((cv) this).field_q == 1) {
              if (!((cv) this).field_o.k((byte) -87).b((byte) 72)) {
                if (((cv) this).field_p != null) {
                  L71: {
                    ((cv) this).field_p.a(91, var6);
                    ((cv) this).field_p = null;
                    stackOut_81_0 = this;
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_82_0 = stackOut_81_0;
                    if (var3 == 0) {
                      stackOut_83_0 = this;
                      stackOut_83_1 = 0;
                      stackIn_84_0 = stackOut_83_0;
                      stackIn_84_1 = stackOut_83_1;
                      break L71;
                    } else {
                      stackOut_82_0 = this;
                      stackOut_82_1 = 1;
                      stackIn_84_0 = stackOut_82_0;
                      stackIn_84_1 = stackOut_82_1;
                      break L71;
                    }
                  }
                  ((cv) this).field_n = stackIn_84_1 != 0;
                  return;
                } else {
                  L72: {
                    stackOut_77_0 = this;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_78_0 = stackOut_77_0;
                    if (var3 == 0) {
                      stackOut_79_0 = this;
                      stackOut_79_1 = 0;
                      stackIn_80_0 = stackOut_79_0;
                      stackIn_80_1 = stackOut_79_1;
                      break L72;
                    } else {
                      stackOut_78_0 = this;
                      stackOut_78_1 = 1;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      break L72;
                    }
                  }
                  ((cv) this).field_n = stackIn_80_1 != 0;
                  return;
                }
              } else {
                L73: {
                  stackOut_72_0 = this;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_73_0 = stackOut_72_0;
                  if (var3 == 0) {
                    stackOut_74_0 = this;
                    stackOut_74_1 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    break L73;
                  } else {
                    stackOut_73_0 = this;
                    stackOut_73_1 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_75_1 = stackOut_73_1;
                    break L73;
                  }
                }
                ((cv) this).field_n = stackIn_75_1 != 0;
                return;
              }
            } else {
              L74: {
                stackOut_67_0 = this;
                stackIn_69_0 = stackOut_67_0;
                stackIn_68_0 = stackOut_67_0;
                if (var3 == 0) {
                  stackOut_69_0 = this;
                  stackOut_69_1 = 0;
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  break L74;
                } else {
                  stackOut_68_0 = this;
                  stackOut_68_1 = 1;
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  break L74;
                }
              }
              ((cv) this).field_n = stackIn_70_1 != 0;
              return;
            }
          }
        }
    }

    cv(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((cv) this).field_n = false;
    }

    final int m(byte param0) {
        if (param0 <= -63) {
          if (-1 != ((cv) this).field_q) {
            if (-3 != ((cv) this).field_q) {
              if (((cv) this).field_q != 4) {
                if (-6 == (((cv) this).field_q ^ -1)) {
                  return 0;
                } else {
                  return -1;
                }
              } else {
                return 0;
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return 69;
        }
    }

    final static void o(byte param0) {
        wp.a(-1);
        rda.d((byte) -128);
        fj.field_c = null;
        int var1 = 43 / ((param0 - -55) / 48);
        f.b(-68);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        ka var45_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka var11 = null;
        ka var12 = null;
        ka var13 = null;
        int var14 = 0;
        int var15 = 0;
        ka var19 = null;
        ka var20 = null;
        ka var21 = null;
        ka var22 = null;
        ka var23 = null;
        ka var24 = null;
        ka var25 = null;
        ka var26 = null;
        ka var27 = null;
        ka var32 = null;
        ka var33 = null;
        ka var44 = null;
        ka var45 = null;
        ka var46 = null;
        ka var49 = null;
        ka var50 = null;
        ka var54 = null;
        ka var56 = null;
        Object var57 = null;
        ka var58 = null;
        int stackIn_5_0 = 0;
        ka[] stackIn_12_0 = null;
        ka[] stackIn_13_0 = null;
        ka[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ka[] stackIn_15_0 = null;
        ka[] stackIn_16_0 = null;
        ka[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ka[] stackIn_21_0 = null;
        ka[] stackIn_22_0 = null;
        ka[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        ka[] stackIn_24_0 = null;
        ka[] stackIn_25_0 = null;
        ka[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        ka[] stackIn_28_0 = null;
        ka[] stackIn_29_0 = null;
        ka[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        ka[] stackIn_31_0 = null;
        ka[] stackIn_32_0 = null;
        ka[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        ka[] stackIn_48_0 = null;
        ka[] stackIn_49_0 = null;
        ka[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        ka[] stackIn_59_0 = null;
        ka[] stackIn_60_0 = null;
        ka[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        ka[] stackIn_69_0 = null;
        ka[] stackIn_70_0 = null;
        ka[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        ka[] stackIn_81_0 = null;
        ka[] stackIn_82_0 = null;
        ka[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        ka[] stackIn_92_0 = null;
        ka[] stackIn_93_0 = null;
        ka[] stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        ka[] stackIn_103_0 = null;
        ka[] stackIn_104_0 = null;
        ka[] stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        ka stackIn_117_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        ka[] stackOut_11_0 = null;
        ka[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ka[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ka[] stackOut_14_0 = null;
        ka[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ka[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ka[] stackOut_27_0 = null;
        ka[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        ka[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        ka[] stackOut_30_0 = null;
        ka[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        ka[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        ka[] stackOut_20_0 = null;
        ka[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ka[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ka[] stackOut_23_0 = null;
        ka[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ka[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        ka[] stackOut_68_0 = null;
        ka[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        ka[] stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        ka[] stackOut_58_0 = null;
        ka[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        ka[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        ka[] stackOut_47_0 = null;
        ka[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        ka[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ka stackOut_116_0 = null;
        ka stackOut_115_0 = null;
        ka[] stackOut_102_0 = null;
        ka[] stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        ka[] stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        ka[] stackOut_91_0 = null;
        ka[] stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        ka[] stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        ka[] stackOut_80_0 = null;
        ka[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        ka[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        var45_ref = null;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          var6 = -67 % ((param4 - -38) / 47);
          var7 = 0;
          var8 = 0;
          var9 = 0;
          if (null != ((cv) this).field_o) {
            L1: {
              if (!((cv) this).field_o.k((byte) -125).a(true)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var9 = stackIn_5_0;
            if (((cv) this).field_o.k((byte) -109).b((byte) 96)) {
              var7 = 1;
              break L0;
            } else {
              if (((cv) this).field_o.b(-96) <= ((cv) this).field_o.j((byte) -108)) {
                break L0;
              } else {
                if (-1 != (((cv) this).field_o.j((byte) -108) ^ -1)) {
                  var8 = 1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          var10 = 0;
          var57 = null;
          var11 = (ka) var57;
          stackOut_11_0 = df.field_J;
          stackIn_13_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (var9 != 0) {
            stackOut_13_0 = (ka[]) (Object) stackIn_13_0;
            stackOut_13_1 = 100;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            break L2;
          } else {
            stackOut_12_0 = (ka[]) (Object) stackIn_12_0;
            stackOut_12_1 = 67;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            break L2;
          }
        }
        L3: {
          var12 = stackIn_14_0[stackIn_14_1];
          stackOut_14_0 = df.field_J;
          stackIn_16_0 = stackOut_14_0;
          stackIn_15_0 = stackOut_14_0;
          if (var9 != 0) {
            stackOut_16_0 = (ka[]) (Object) stackIn_16_0;
            stackOut_16_1 = 99;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            break L3;
          } else {
            stackOut_15_0 = (ka[]) (Object) stackIn_15_0;
            stackOut_15_1 = 66;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            break L3;
          }
        }
        L4: {
          var13 = stackIn_17_0[stackIn_17_1];
          if (var7 == 0) {
            if (var8 != 0) {
              L5: {
                stackOut_27_0 = df.field_J;
                stackIn_29_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (var9 != 0) {
                  stackOut_29_0 = (ka[]) (Object) stackIn_29_0;
                  stackOut_29_1 = 102;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L5;
                } else {
                  stackOut_28_0 = (ka[]) (Object) stackIn_28_0;
                  stackOut_28_1 = 95;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  break L5;
                }
              }
              L6: {
                var12 = stackIn_30_0[stackIn_30_1];
                stackOut_30_0 = df.field_J;
                stackIn_32_0 = stackOut_30_0;
                stackIn_31_0 = stackOut_30_0;
                if (var9 == 0) {
                  stackOut_32_0 = (ka[]) (Object) stackIn_32_0;
                  stackOut_32_1 = 94;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  break L6;
                } else {
                  stackOut_31_0 = (ka[]) (Object) stackIn_31_0;
                  stackOut_31_1 = 101;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  break L6;
                }
              }
              var13 = stackIn_33_0[stackIn_33_1];
              break L4;
            } else {
              L7: {
                stackOut_20_0 = df.field_J;
                stackIn_22_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (var9 != 0) {
                  stackOut_22_0 = (ka[]) (Object) stackIn_22_0;
                  stackOut_22_1 = 103;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L7;
                } else {
                  stackOut_21_0 = (ka[]) (Object) stackIn_21_0;
                  stackOut_21_1 = 68;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  break L7;
                }
              }
              L8: {
                var13 = stackIn_23_0[stackIn_23_1];
                stackOut_23_0 = df.field_J;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (var9 != 0) {
                  stackOut_25_0 = (ka[]) (Object) stackIn_25_0;
                  stackOut_25_1 = 104;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L8;
                } else {
                  stackOut_24_0 = (ka[]) (Object) stackIn_24_0;
                  stackOut_24_1 = 69;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L8;
                }
              }
              var12 = stackIn_26_0[stackIn_26_1];
              break L4;
            }
          } else {
            break L4;
          }
        }
        var14 = ((cv) this).field_q;
        if (var14 == 0) {
          if (var7 == 0) {
            if (var8 == 0) {
              L9: {
                stackOut_68_0 = df.field_J;
                stackIn_70_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (var9 == 0) {
                  stackOut_70_0 = (ka[]) (Object) stackIn_70_0;
                  stackOut_70_1 = 21;
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  break L9;
                } else {
                  stackOut_69_0 = (ka[]) (Object) stackIn_69_0;
                  stackOut_69_1 = 96;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  break L9;
                }
              }
              L10: {
                var23 = stackIn_71_0[stackIn_71_1];
                var11 = var23;
                if (var11 == null) {
                  break L10;
                } else {
                  var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                  gqa.a(var14, -83584144, param1, param2, var23, param3);
                  break L10;
                }
              }
              if ((((cv) this).field_q ^ -1) == -2) {
                if (var7 == 0) {
                  return;
                } else {
                  var24 = ((cv) this).field_s.b((byte) 74);
                  ((cv) this).field_s.a(3, false, (byte) 79, 7);
                  var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                  gqa.a(var14, -83584144, param1, param2 + 65536, var24, param3 + 2228224);
                  return;
                }
              } else {
                return;
              }
            } else {
              L11: {
                stackOut_58_0 = df.field_J;
                stackIn_60_0 = stackOut_58_0;
                stackIn_59_0 = stackOut_58_0;
                if (var9 == 0) {
                  stackOut_60_0 = (ka[]) (Object) stackIn_60_0;
                  stackOut_60_1 = 93;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  break L11;
                } else {
                  stackOut_59_0 = (ka[]) (Object) stackIn_59_0;
                  stackOut_59_1 = 97;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  break L11;
                }
              }
              L12: {
                var21 = stackIn_61_0[stackIn_61_1];
                var11 = var21;
                if (var11 == null) {
                  break L12;
                } else {
                  var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                  gqa.a(var14, -83584144, param1, param2, var21, param3);
                  break L12;
                }
              }
              L13: {
                if ((((cv) this).field_q ^ -1) != -2) {
                  break L13;
                } else {
                  if (var7 != 0) {
                    var22 = ((cv) this).field_s.b((byte) 74);
                    ((cv) this).field_s.a(3, false, (byte) 79, 7);
                    var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                    gqa.a(var14, -83584144, param1, param2 + 65536, var22, param3 + 2228224);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              return;
            }
          } else {
            L14: {
              stackOut_47_0 = df.field_J;
              stackIn_49_0 = stackOut_47_0;
              stackIn_48_0 = stackOut_47_0;
              if (var9 != 0) {
                stackOut_49_0 = (ka[]) (Object) stackIn_49_0;
                stackOut_49_1 = 98;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                break L14;
              } else {
                stackOut_48_0 = (ka[]) (Object) stackIn_48_0;
                stackOut_48_1 = 22;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                break L14;
              }
            }
            L15: {
              var19 = stackIn_50_0[stackIn_50_1];
              var11 = var19;
              if (var11 == null) {
                break L15;
              } else {
                var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                gqa.a(var14, -83584144, param1, param2, var19, param3);
                break L15;
              }
            }
            L16: {
              if ((((cv) this).field_q ^ -1) != -2) {
                break L16;
              } else {
                if (var7 != 0) {
                  var20 = ((cv) this).field_s.b((byte) 74);
                  ((cv) this).field_s.a(3, false, (byte) 79, 7);
                  var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                  gqa.a(var14, -83584144, param1, param2 + 65536, var20, param3 + 2228224);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            return;
          }
        } else {
          if (var14 != 2) {
            if (-2 != (var14 ^ -1)) {
              if (var14 != 3) {
                if (4 != var14) {
                  if (var14 != 5) {
                    L17: {
                      if (var11 == null) {
                        break L17;
                      } else {
                        var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                        gqa.a(var14, -83584144, param1, param2, (ka) var57, param3);
                        break L17;
                      }
                    }
                    if ((((cv) this).field_q ^ -1) == -2) {
                      if (var7 == 0) {
                        return;
                      } else {
                        var58 = ((cv) this).field_s.b((byte) 74);
                        ((cv) this).field_s.a(3, false, (byte) 79, 7);
                        var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                        gqa.a(var14, -83584144, param1, param2 + 65536, var58, param3 + 2228224);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    gba.a(2, param2, 2097152, var12, -512, var13, param1, 512, 512, ((cv) this).field_h.a((byte) 55), param3);
                    return;
                  }
                } else {
                  jc.a(2097152, 0, (byte) 88, param2, ((cv) this).field_h.c(-20), 1024, param3, var13, 0, var12, param1);
                  return;
                }
              } else {
                var50 = df.field_J[9];
                var54 = var50;
                var11 = var54;
                var54 = var50;
                var11 = var54;
                var10 = -2048;
                if (var7 != 0) {
                  L18: {
                    var54 = ((cv) this).field_s.b((byte) 74);
                    var11 = var54;
                    ((cv) this).field_s.a(3, false, (byte) -101, 6);
                    if (var54 == null) {
                      break L18;
                    } else {
                      var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                      gqa.a(var14, -83584144, param1, param2, var54, param3);
                      break L18;
                    }
                  }
                  if ((((cv) this).field_q ^ -1) == -2) {
                    if (var7 != 0) {
                      var56 = ((cv) this).field_s.b((byte) 74);
                      ((cv) this).field_s.a(3, false, (byte) 79, 7);
                      var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                      gqa.a(var14, -83584144, param1, param2 + 65536, var56, param3 + 2228224);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L19: {
                    if (var50 == null) {
                      break L19;
                    } else {
                      var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                      gqa.a(var14, -83584144, param1, param2, var50, param3);
                      break L19;
                    }
                  }
                  if ((((cv) this).field_q ^ -1) != -2) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L20: {
                if (var7 != 0) {
                  stackOut_116_0 = df.field_J[25];
                  stackIn_117_0 = stackOut_116_0;
                  break L20;
                } else {
                  stackOut_115_0 = df.field_J[24];
                  stackIn_117_0 = stackOut_115_0;
                  break L20;
                }
              }
              L21: {
                var45_ref = stackIn_117_0;
                var46 = var45_ref;
                var46 = var45_ref;
                var11 = var45_ref;
                if (var45_ref == null) {
                  break L21;
                } else {
                  var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                  gqa.a(var14, -83584144, param1, param2, var45_ref, param3);
                  break L21;
                }
              }
              if ((((cv) this).field_q ^ -1) == -2) {
                if (var7 == 0) {
                  return;
                } else {
                  var49 = ((cv) this).field_s.b((byte) 74);
                  ((cv) this).field_s.a(3, false, (byte) 79, 7);
                  var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                  gqa.a(var14, -83584144, param1, param2 + 65536, var49, param3 + 2228224);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (var7 == 0) {
              if (var8 != 0) {
                L22: {
                  stackOut_102_0 = df.field_J;
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_103_0 = stackOut_102_0;
                  if (var9 != 0) {
                    stackOut_104_0 = (ka[]) (Object) stackIn_104_0;
                    stackOut_104_1 = 107;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    break L22;
                  } else {
                    stackOut_103_0 = (ka[]) (Object) stackIn_103_0;
                    stackOut_103_1 = 105;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    break L22;
                  }
                }
                L23: {
                  var33 = stackIn_105_0[stackIn_105_1];
                  var11 = var33;
                  if (var11 == null) {
                    break L23;
                  } else {
                    var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                    gqa.a(var14, -83584144, param1, param2, var33, param3);
                    break L23;
                  }
                }
                if ((((cv) this).field_q ^ -1) != -2) {
                  return;
                } else {
                  L24: {
                    if (var7 != 0) {
                      var44 = ((cv) this).field_s.b((byte) 74);
                      ((cv) this).field_s.a(3, false, (byte) 79, 7);
                      var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                      gqa.a(var14, -83584144, param1, param2 + 65536, var44, param3 + 2228224);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  stackOut_91_0 = df.field_J;
                  stackIn_93_0 = stackOut_91_0;
                  stackIn_92_0 = stackOut_91_0;
                  if (var9 != 0) {
                    stackOut_93_0 = (ka[]) (Object) stackIn_93_0;
                    stackOut_93_1 = 106;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    break L25;
                  } else {
                    stackOut_92_0 = (ka[]) (Object) stackIn_92_0;
                    stackOut_92_1 = 45;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    break L25;
                  }
                }
                L26: {
                  var27 = stackIn_94_0[stackIn_94_1];
                  var11 = var27;
                  if (var11 == null) {
                    break L26;
                  } else {
                    var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                    gqa.a(var14, -83584144, param1, param2, var27, param3);
                    break L26;
                  }
                }
                if ((((cv) this).field_q ^ -1) == -2) {
                  if (var7 == 0) {
                    return;
                  } else {
                    var32 = ((cv) this).field_s.b((byte) 74);
                    ((cv) this).field_s.a(3, false, (byte) 79, 7);
                    var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                    gqa.a(var14, -83584144, param1, param2 + 65536, var32, param3 + 2228224);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L27: {
                stackOut_80_0 = df.field_J;
                stackIn_82_0 = stackOut_80_0;
                stackIn_81_0 = stackOut_80_0;
                if (var9 != 0) {
                  stackOut_82_0 = (ka[]) (Object) stackIn_82_0;
                  stackOut_82_1 = 108;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  break L27;
                } else {
                  stackOut_81_0 = (ka[]) (Object) stackIn_81_0;
                  stackOut_81_1 = 46;
                  stackIn_83_0 = stackOut_81_0;
                  stackIn_83_1 = stackOut_81_1;
                  break L27;
                }
              }
              L28: {
                var25 = stackIn_83_0[stackIn_83_1];
                var11 = var25;
                if (var11 == null) {
                  break L28;
                } else {
                  var14 = dfa.a(var10 + (2048 - ((cv) this).field_h.g(-25787)) >> 11187202, 2048, -38);
                  gqa.a(var14, -83584144, param1, param2, var25, param3);
                  break L28;
                }
              }
              L29: {
                if ((((cv) this).field_q ^ -1) != -2) {
                  break L29;
                } else {
                  if (var7 != 0) {
                    var26 = ((cv) this).field_s.b((byte) 74);
                    ((cv) this).field_s.a(3, false, (byte) 79, 7);
                    var14 = dfa.a(-((cv) this).field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                    gqa.a(var14, -83584144, param1, param2 + 65536, var26, param3 + 2228224);
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final int k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          if (!((cv) this).field_h.j(-1)) {
            var2 = ((cv) this).field_q;
            if (var2 != 0) {
              if (2 != var2) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (-2 != (var2 ^ -1)) {
                      if (var2 == 3) {
                        return 7;
                      } else {
                        return 5;
                      }
                    } else {
                      return 7;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  return 5;
                }
              } else {
                return 5;
              }
            } else {
              return 5;
            }
          } else {
            return 2;
          }
        } else {
          return 44;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new Hashtable();
        field_r = "Waiting for graphics";
    }
}
