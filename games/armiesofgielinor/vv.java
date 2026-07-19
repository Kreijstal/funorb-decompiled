/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vv {
    static Random field_b;
    static String field_c;
    static String field_a;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 79) {
            vv.a(110, 51, false, 108, -96, 59);
        }
    }

    final static void a(int param0) {
        String discarded$6 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        int var1 = 0;
        if (224 > te.field_n) {
          var1 = te.field_n % 32;
          jf.b(32 + (te.field_n - var1), 84);
          if (param0 == -30647) {
            return;
          } else {
            discarded$6 = vv.a((byte) 85);
            return;
          }
        } else {
          jf.b(256, param0 ^ -30690);
          if (!ArmiesOfGielinor.field_M) {
            if (param0 != -30647) {
              discarded$7 = vv.a((byte) 85);
              return;
            } else {
              return;
            }
          } else {
            var1 = te.field_n % 32;
            jf.b(32 + (te.field_n - var1), 84);
            if (param0 == -30647) {
              return;
            } else {
              discarded$8 = vv.a((byte) 85);
              return;
            }
          }
        }
    }

    final static og[] a(String param0, int param1) {
        int incrementValue$2 = 0;
        at var2 = null;
        RuntimeException var2_ref = null;
        og[] var3 = null;
        int var4 = 0;
        og var5 = null;
        int var6 = 0;
        og[] stackIn_4_0 = null;
        og[] stackIn_7_0 = null;
        og[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        og[] stackOut_3_0 = null;
        og[] stackOut_14_0 = null;
        og[] stackOut_6_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0.equals(no.field_N)) {
              stackOut_3_0 = ol.field_w;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = gu.a(false, param0);
              var3 = new og[var2.b(false)];
              var4 = 0;
              if (param1 > 109) {
                var5 = (og) ((Object) var2.e((byte) 100));
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        incrementValue$2 = var4;
                        var4++;
                        var3[incrementValue$2] = var5;
                        var5 = (og) ((Object) var2.a((byte) 123));
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    no.field_N = param0;
                    ol.field_w = var3;
                    break L2;
                  }
                  stackOut_14_0 = (og[]) (var3);
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = (og[]) null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("vv.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        jd var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int[][] stackIn_41_4 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int[][] stackIn_42_4 = null;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int[][] stackIn_43_4 = null;
        int stackIn_43_5 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int[][] stackIn_51_4 = null;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int[][] stackIn_52_4 = null;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int[][] stackIn_53_4 = null;
        int stackIn_53_5 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        int[][] stackIn_84_4 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int[][] stackIn_85_4 = null;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int[][] stackIn_86_4 = null;
        int stackIn_86_5 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int[][] stackIn_94_4 = null;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int[][] stackIn_95_4 = null;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int[][] stackIn_96_4 = null;
        int stackIn_96_5 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        int[][] stackIn_125_4 = null;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int[][] stackIn_126_4 = null;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int[][] stackIn_127_4 = null;
        int stackIn_127_5 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        int[][] stackIn_135_4 = null;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        int stackIn_136_3 = 0;
        int[][] stackIn_136_4 = null;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int[][] stackIn_137_4 = null;
        int stackIn_137_5 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        int stackIn_168_3 = 0;
        int[][] stackIn_168_4 = null;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        int stackIn_169_3 = 0;
        int[][] stackIn_169_4 = null;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_170_2 = 0;
        int stackIn_170_3 = 0;
        int[][] stackIn_170_4 = null;
        int stackIn_170_5 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        int stackIn_177_2 = 0;
        int stackIn_177_3 = 0;
        int[][] stackIn_177_4 = null;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        int stackIn_178_2 = 0;
        int stackIn_178_3 = 0;
        int[][] stackIn_178_4 = null;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        int stackIn_179_3 = 0;
        int[][] stackIn_179_4 = null;
        int stackIn_179_5 = 0;
        int stackIn_188_0 = 0;
        int stackIn_188_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        int stackIn_191_0 = 0;
        int stackIn_191_1 = 0;
        int stackIn_191_2 = 0;
        int stackIn_191_3 = 0;
        int[][] stackIn_191_4 = null;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        int stackIn_192_3 = 0;
        int[][] stackIn_192_4 = null;
        int stackIn_193_0 = 0;
        int stackIn_193_1 = 0;
        int stackIn_193_2 = 0;
        int stackIn_193_3 = 0;
        int[][] stackIn_193_4 = null;
        int stackIn_193_5 = 0;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_198_2 = 0;
        int stackIn_198_3 = 0;
        int[][] stackIn_198_4 = null;
        int stackIn_199_0 = 0;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        int stackIn_199_3 = 0;
        int[][] stackIn_199_4 = null;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int stackIn_200_2 = 0;
        int stackIn_200_3 = 0;
        int[][] stackIn_200_4 = null;
        int stackIn_200_5 = 0;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_207_3 = 0;
        int[][] stackIn_207_4 = null;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        int stackIn_208_3 = 0;
        int[][] stackIn_208_4 = null;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackIn_209_2 = 0;
        int stackIn_209_3 = 0;
        int[][] stackIn_209_4 = null;
        int stackIn_209_5 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_236_2 = 0;
        int stackIn_236_3 = 0;
        int[][] stackIn_236_4 = null;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_237_3 = 0;
        int[][] stackIn_237_4 = null;
        int stackIn_238_0 = 0;
        int stackIn_238_1 = 0;
        int stackIn_238_2 = 0;
        int stackIn_238_3 = 0;
        int[][] stackIn_238_4 = null;
        int stackIn_238_5 = 0;
        int stackIn_242_0 = 0;
        int stackIn_242_1 = 0;
        int stackIn_243_0 = 0;
        int stackIn_243_1 = 0;
        int stackIn_244_0 = 0;
        int stackIn_244_1 = 0;
        int stackIn_244_2 = 0;
        int stackIn_245_0 = 0;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        int stackIn_245_3 = 0;
        int[][] stackIn_245_4 = null;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        int stackIn_246_3 = 0;
        int[][] stackIn_246_4 = null;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_247_2 = 0;
        int stackIn_247_3 = 0;
        int[][] stackIn_247_4 = null;
        int stackIn_247_5 = 0;
        int stackIn_253_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_253_2 = 0;
        int stackIn_253_3 = 0;
        int[][] stackIn_253_4 = null;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_254_2 = 0;
        int stackIn_254_3 = 0;
        int[][] stackIn_254_4 = null;
        int stackIn_255_0 = 0;
        int stackIn_255_1 = 0;
        int stackIn_255_2 = 0;
        int stackIn_255_3 = 0;
        int[][] stackIn_255_4 = null;
        int stackIn_255_5 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_261_2 = 0;
        int stackIn_262_0 = 0;
        int stackIn_262_1 = 0;
        int stackIn_262_2 = 0;
        int stackIn_262_3 = 0;
        int[][] stackIn_262_4 = null;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        int stackIn_263_2 = 0;
        int stackIn_263_3 = 0;
        int[][] stackIn_263_4 = null;
        int stackIn_264_0 = 0;
        int stackIn_264_1 = 0;
        int stackIn_264_2 = 0;
        int stackIn_264_3 = 0;
        int[][] stackIn_264_4 = null;
        int stackIn_264_5 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_274_0 = 0;
        int stackIn_274_1 = 0;
        int stackIn_274_2 = 0;
        int stackIn_275_0 = 0;
        int stackIn_275_1 = 0;
        int stackIn_275_2 = 0;
        int stackIn_275_3 = 0;
        int[][] stackIn_275_4 = null;
        int stackIn_276_0 = 0;
        int stackIn_276_1 = 0;
        int stackIn_276_2 = 0;
        int stackIn_276_3 = 0;
        int[][] stackIn_276_4 = null;
        int stackIn_277_0 = 0;
        int stackIn_277_1 = 0;
        int stackIn_277_2 = 0;
        int stackIn_277_3 = 0;
        int[][] stackIn_277_4 = null;
        int stackIn_277_5 = 0;
        int stackIn_300_0 = 0;
        int stackIn_300_1 = 0;
        int stackIn_300_2 = 0;
        int stackIn_300_3 = 0;
        int[][] stackIn_300_4 = null;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_301_2 = 0;
        int stackIn_301_3 = 0;
        int[][] stackIn_301_4 = null;
        int stackIn_302_0 = 0;
        int stackIn_302_1 = 0;
        int stackIn_302_2 = 0;
        int stackIn_302_3 = 0;
        int[][] stackIn_302_4 = null;
        int stackIn_302_5 = 0;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        int stackIn_307_0 = 0;
        int stackIn_307_1 = 0;
        int stackIn_308_0 = 0;
        int stackIn_308_1 = 0;
        int stackIn_308_2 = 0;
        int stackIn_309_0 = 0;
        int stackIn_309_1 = 0;
        int stackIn_309_2 = 0;
        int stackIn_309_3 = 0;
        int[][] stackIn_309_4 = null;
        int stackIn_310_0 = 0;
        int stackIn_310_1 = 0;
        int stackIn_310_2 = 0;
        int stackIn_310_3 = 0;
        int[][] stackIn_310_4 = null;
        int stackIn_311_0 = 0;
        int stackIn_311_1 = 0;
        int stackIn_311_2 = 0;
        int stackIn_311_3 = 0;
        int[][] stackIn_311_4 = null;
        int stackIn_311_5 = 0;
        int stackIn_317_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_317_2 = 0;
        int stackIn_317_3 = 0;
        int[][] stackIn_317_4 = null;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        int stackIn_318_2 = 0;
        int stackIn_318_3 = 0;
        int[][] stackIn_318_4 = null;
        int stackIn_319_0 = 0;
        int stackIn_319_1 = 0;
        int stackIn_319_2 = 0;
        int stackIn_319_3 = 0;
        int[][] stackIn_319_4 = null;
        int stackIn_319_5 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_324_0 = 0;
        int stackIn_324_1 = 0;
        int stackIn_325_0 = 0;
        int stackIn_325_1 = 0;
        int stackIn_325_2 = 0;
        int stackIn_326_0 = 0;
        int stackIn_326_1 = 0;
        int stackIn_326_2 = 0;
        int stackIn_326_3 = 0;
        int[][] stackIn_326_4 = null;
        int stackIn_327_0 = 0;
        int stackIn_327_1 = 0;
        int stackIn_327_2 = 0;
        int stackIn_327_3 = 0;
        int[][] stackIn_327_4 = null;
        int stackIn_328_0 = 0;
        int stackIn_328_1 = 0;
        int stackIn_328_2 = 0;
        int stackIn_328_3 = 0;
        int[][] stackIn_328_4 = null;
        int stackIn_328_5 = 0;
        int stackIn_336_0 = 0;
        int stackIn_336_1 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_338_0 = 0;
        int stackIn_338_1 = 0;
        int stackIn_338_2 = 0;
        int stackIn_339_0 = 0;
        int stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_339_3 = 0;
        int[][] stackIn_339_4 = null;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_340_2 = 0;
        int stackIn_340_3 = 0;
        int[][] stackIn_340_4 = null;
        int stackIn_341_0 = 0;
        int stackIn_341_1 = 0;
        int stackIn_341_2 = 0;
        int stackIn_341_3 = 0;
        int[][] stackIn_341_4 = null;
        int stackIn_341_5 = 0;
        int stackIn_356_0 = 0;
        int stackIn_356_1 = 0;
        int stackIn_356_2 = 0;
        int stackIn_356_3 = 0;
        int[][] stackIn_356_4 = null;
        int stackIn_357_0 = 0;
        int stackIn_357_1 = 0;
        int stackIn_357_2 = 0;
        int stackIn_357_3 = 0;
        int[][] stackIn_357_4 = null;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_358_2 = 0;
        int stackIn_358_3 = 0;
        int[][] stackIn_358_4 = null;
        int stackIn_358_5 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        int stackIn_363_0 = 0;
        int stackIn_363_1 = 0;
        int stackIn_364_0 = 0;
        int stackIn_364_1 = 0;
        int stackIn_364_2 = 0;
        int stackIn_365_0 = 0;
        int stackIn_365_1 = 0;
        int stackIn_365_2 = 0;
        int stackIn_365_3 = 0;
        int[][] stackIn_365_4 = null;
        int stackIn_366_0 = 0;
        int stackIn_366_1 = 0;
        int stackIn_366_2 = 0;
        int stackIn_366_3 = 0;
        int[][] stackIn_366_4 = null;
        int stackIn_367_0 = 0;
        int stackIn_367_1 = 0;
        int stackIn_367_2 = 0;
        int stackIn_367_3 = 0;
        int[][] stackIn_367_4 = null;
        int stackIn_367_5 = 0;
        int stackIn_372_0 = 0;
        int stackIn_372_1 = 0;
        int stackIn_372_2 = 0;
        int stackIn_372_3 = 0;
        int[][] stackIn_372_4 = null;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_373_2 = 0;
        int stackIn_373_3 = 0;
        int[][] stackIn_373_4 = null;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        int stackIn_374_2 = 0;
        int stackIn_374_3 = 0;
        int[][] stackIn_374_4 = null;
        int stackIn_374_5 = 0;
        int stackIn_379_0 = 0;
        int stackIn_379_1 = 0;
        int stackIn_380_0 = 0;
        int stackIn_380_1 = 0;
        int stackIn_381_0 = 0;
        int stackIn_381_1 = 0;
        int stackIn_381_2 = 0;
        int stackIn_382_0 = 0;
        int stackIn_382_1 = 0;
        int stackIn_382_2 = 0;
        int stackIn_382_3 = 0;
        int[][] stackIn_382_4 = null;
        int stackIn_383_0 = 0;
        int stackIn_383_1 = 0;
        int stackIn_383_2 = 0;
        int stackIn_383_3 = 0;
        int[][] stackIn_383_4 = null;
        int stackIn_384_0 = 0;
        int stackIn_384_1 = 0;
        int stackIn_384_2 = 0;
        int stackIn_384_3 = 0;
        int[][] stackIn_384_4 = null;
        int stackIn_384_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        int[][] stackOut_124_4 = null;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int[][] stackOut_126_4 = null;
        int stackOut_126_5 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int[][] stackOut_125_4 = null;
        int stackOut_125_5 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_134_2 = 0;
        int stackOut_134_3 = 0;
        int[][] stackOut_134_4 = null;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int[][] stackOut_136_4 = null;
        int stackOut_136_5 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        int[][] stackOut_135_4 = null;
        int stackOut_135_5 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int[][] stackOut_83_4 = null;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int[][] stackOut_85_4 = null;
        int stackOut_85_5 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int[][] stackOut_84_4 = null;
        int stackOut_84_5 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int[][] stackOut_93_4 = null;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int[][] stackOut_95_4 = null;
        int stackOut_95_5 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int[][] stackOut_94_4 = null;
        int stackOut_94_5 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int[][] stackOut_40_4 = null;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int[][] stackOut_42_4 = null;
        int stackOut_42_5 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int[][] stackOut_41_4 = null;
        int stackOut_41_5 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int[][] stackOut_50_4 = null;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int[][] stackOut_52_4 = null;
        int stackOut_52_5 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int[][] stackOut_51_4 = null;
        int stackOut_51_5 = 0;
        int stackOut_371_0 = 0;
        int stackOut_371_1 = 0;
        int stackOut_371_2 = 0;
        int stackOut_371_3 = 0;
        int[][] stackOut_371_4 = null;
        int stackOut_373_0 = 0;
        int stackOut_373_1 = 0;
        int stackOut_373_2 = 0;
        int stackOut_373_3 = 0;
        int[][] stackOut_373_4 = null;
        int stackOut_373_5 = 0;
        int stackOut_372_0 = 0;
        int stackOut_372_1 = 0;
        int stackOut_372_2 = 0;
        int stackOut_372_3 = 0;
        int[][] stackOut_372_4 = null;
        int stackOut_372_5 = 0;
        int stackOut_355_0 = 0;
        int stackOut_355_1 = 0;
        int stackOut_355_2 = 0;
        int stackOut_355_3 = 0;
        int[][] stackOut_355_4 = null;
        int stackOut_357_0 = 0;
        int stackOut_357_1 = 0;
        int stackOut_357_2 = 0;
        int stackOut_357_3 = 0;
        int[][] stackOut_357_4 = null;
        int stackOut_357_5 = 0;
        int stackOut_356_0 = 0;
        int stackOut_356_1 = 0;
        int stackOut_356_2 = 0;
        int stackOut_356_3 = 0;
        int[][] stackOut_356_4 = null;
        int stackOut_356_5 = 0;
        int stackOut_361_0 = 0;
        int stackOut_361_1 = 0;
        int stackOut_363_0 = 0;
        int stackOut_363_1 = 0;
        int stackOut_363_2 = 0;
        int stackOut_362_0 = 0;
        int stackOut_362_1 = 0;
        int stackOut_362_2 = 0;
        int stackOut_364_0 = 0;
        int stackOut_364_1 = 0;
        int stackOut_364_2 = 0;
        int stackOut_364_3 = 0;
        int[][] stackOut_364_4 = null;
        int stackOut_366_0 = 0;
        int stackOut_366_1 = 0;
        int stackOut_366_2 = 0;
        int stackOut_366_3 = 0;
        int[][] stackOut_366_4 = null;
        int stackOut_366_5 = 0;
        int stackOut_365_0 = 0;
        int stackOut_365_1 = 0;
        int stackOut_365_2 = 0;
        int stackOut_365_3 = 0;
        int[][] stackOut_365_4 = null;
        int stackOut_365_5 = 0;
        int stackOut_378_0 = 0;
        int stackOut_378_1 = 0;
        int stackOut_380_0 = 0;
        int stackOut_380_1 = 0;
        int stackOut_380_2 = 0;
        int stackOut_379_0 = 0;
        int stackOut_379_1 = 0;
        int stackOut_379_2 = 0;
        int stackOut_381_0 = 0;
        int stackOut_381_1 = 0;
        int stackOut_381_2 = 0;
        int stackOut_381_3 = 0;
        int[][] stackOut_381_4 = null;
        int stackOut_383_0 = 0;
        int stackOut_383_1 = 0;
        int stackOut_383_2 = 0;
        int stackOut_383_3 = 0;
        int[][] stackOut_383_4 = null;
        int stackOut_383_5 = 0;
        int stackOut_382_0 = 0;
        int stackOut_382_1 = 0;
        int stackOut_382_2 = 0;
        int stackOut_382_3 = 0;
        int[][] stackOut_382_4 = null;
        int stackOut_382_5 = 0;
        int stackOut_335_0 = 0;
        int stackOut_335_1 = 0;
        int stackOut_337_0 = 0;
        int stackOut_337_1 = 0;
        int stackOut_337_2 = 0;
        int stackOut_336_0 = 0;
        int stackOut_336_1 = 0;
        int stackOut_336_2 = 0;
        int stackOut_338_0 = 0;
        int stackOut_338_1 = 0;
        int stackOut_338_2 = 0;
        int stackOut_338_3 = 0;
        int[][] stackOut_338_4 = null;
        int stackOut_340_0 = 0;
        int stackOut_340_1 = 0;
        int stackOut_340_2 = 0;
        int stackOut_340_3 = 0;
        int[][] stackOut_340_4 = null;
        int stackOut_340_5 = 0;
        int stackOut_339_0 = 0;
        int stackOut_339_1 = 0;
        int stackOut_339_2 = 0;
        int stackOut_339_3 = 0;
        int[][] stackOut_339_4 = null;
        int stackOut_339_5 = 0;
        int stackOut_316_0 = 0;
        int stackOut_316_1 = 0;
        int stackOut_316_2 = 0;
        int stackOut_316_3 = 0;
        int[][] stackOut_316_4 = null;
        int stackOut_318_0 = 0;
        int stackOut_318_1 = 0;
        int stackOut_318_2 = 0;
        int stackOut_318_3 = 0;
        int[][] stackOut_318_4 = null;
        int stackOut_318_5 = 0;
        int stackOut_317_0 = 0;
        int stackOut_317_1 = 0;
        int stackOut_317_2 = 0;
        int stackOut_317_3 = 0;
        int[][] stackOut_317_4 = null;
        int stackOut_317_5 = 0;
        int stackOut_322_0 = 0;
        int stackOut_322_1 = 0;
        int stackOut_324_0 = 0;
        int stackOut_324_1 = 0;
        int stackOut_324_2 = 0;
        int stackOut_323_0 = 0;
        int stackOut_323_1 = 0;
        int stackOut_323_2 = 0;
        int stackOut_325_0 = 0;
        int stackOut_325_1 = 0;
        int stackOut_325_2 = 0;
        int stackOut_325_3 = 0;
        int[][] stackOut_325_4 = null;
        int stackOut_327_0 = 0;
        int stackOut_327_1 = 0;
        int stackOut_327_2 = 0;
        int stackOut_327_3 = 0;
        int[][] stackOut_327_4 = null;
        int stackOut_327_5 = 0;
        int stackOut_326_0 = 0;
        int stackOut_326_1 = 0;
        int stackOut_326_2 = 0;
        int stackOut_326_3 = 0;
        int[][] stackOut_326_4 = null;
        int stackOut_326_5 = 0;
        int stackOut_299_0 = 0;
        int stackOut_299_1 = 0;
        int stackOut_299_2 = 0;
        int stackOut_299_3 = 0;
        int[][] stackOut_299_4 = null;
        int stackOut_301_0 = 0;
        int stackOut_301_1 = 0;
        int stackOut_301_2 = 0;
        int stackOut_301_3 = 0;
        int[][] stackOut_301_4 = null;
        int stackOut_301_5 = 0;
        int stackOut_300_0 = 0;
        int stackOut_300_1 = 0;
        int stackOut_300_2 = 0;
        int stackOut_300_3 = 0;
        int[][] stackOut_300_4 = null;
        int stackOut_300_5 = 0;
        int stackOut_305_0 = 0;
        int stackOut_305_1 = 0;
        int stackOut_307_0 = 0;
        int stackOut_307_1 = 0;
        int stackOut_307_2 = 0;
        int stackOut_306_0 = 0;
        int stackOut_306_1 = 0;
        int stackOut_306_2 = 0;
        int stackOut_308_0 = 0;
        int stackOut_308_1 = 0;
        int stackOut_308_2 = 0;
        int stackOut_308_3 = 0;
        int[][] stackOut_308_4 = null;
        int stackOut_310_0 = 0;
        int stackOut_310_1 = 0;
        int stackOut_310_2 = 0;
        int stackOut_310_3 = 0;
        int[][] stackOut_310_4 = null;
        int stackOut_310_5 = 0;
        int stackOut_309_0 = 0;
        int stackOut_309_1 = 0;
        int stackOut_309_2 = 0;
        int stackOut_309_3 = 0;
        int[][] stackOut_309_4 = null;
        int stackOut_309_5 = 0;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_273_0 = 0;
        int stackOut_273_1 = 0;
        int stackOut_273_2 = 0;
        int stackOut_272_0 = 0;
        int stackOut_272_1 = 0;
        int stackOut_272_2 = 0;
        int stackOut_274_0 = 0;
        int stackOut_274_1 = 0;
        int stackOut_274_2 = 0;
        int stackOut_274_3 = 0;
        int[][] stackOut_274_4 = null;
        int stackOut_276_0 = 0;
        int stackOut_276_1 = 0;
        int stackOut_276_2 = 0;
        int stackOut_276_3 = 0;
        int[][] stackOut_276_4 = null;
        int stackOut_276_5 = 0;
        int stackOut_275_0 = 0;
        int stackOut_275_1 = 0;
        int stackOut_275_2 = 0;
        int stackOut_275_3 = 0;
        int[][] stackOut_275_4 = null;
        int stackOut_275_5 = 0;
        int stackOut_252_0 = 0;
        int stackOut_252_1 = 0;
        int stackOut_252_2 = 0;
        int stackOut_252_3 = 0;
        int[][] stackOut_252_4 = null;
        int stackOut_254_0 = 0;
        int stackOut_254_1 = 0;
        int stackOut_254_2 = 0;
        int stackOut_254_3 = 0;
        int[][] stackOut_254_4 = null;
        int stackOut_254_5 = 0;
        int stackOut_253_0 = 0;
        int stackOut_253_1 = 0;
        int stackOut_253_2 = 0;
        int stackOut_253_3 = 0;
        int[][] stackOut_253_4 = null;
        int stackOut_253_5 = 0;
        int stackOut_258_0 = 0;
        int stackOut_258_1 = 0;
        int stackOut_260_0 = 0;
        int stackOut_260_1 = 0;
        int stackOut_260_2 = 0;
        int stackOut_259_0 = 0;
        int stackOut_259_1 = 0;
        int stackOut_259_2 = 0;
        int stackOut_261_0 = 0;
        int stackOut_261_1 = 0;
        int stackOut_261_2 = 0;
        int stackOut_261_3 = 0;
        int[][] stackOut_261_4 = null;
        int stackOut_263_0 = 0;
        int stackOut_263_1 = 0;
        int stackOut_263_2 = 0;
        int stackOut_263_3 = 0;
        int[][] stackOut_263_4 = null;
        int stackOut_263_5 = 0;
        int stackOut_262_0 = 0;
        int stackOut_262_1 = 0;
        int stackOut_262_2 = 0;
        int stackOut_262_3 = 0;
        int[][] stackOut_262_4 = null;
        int stackOut_262_5 = 0;
        int stackOut_235_0 = 0;
        int stackOut_235_1 = 0;
        int stackOut_235_2 = 0;
        int stackOut_235_3 = 0;
        int[][] stackOut_235_4 = null;
        int stackOut_237_0 = 0;
        int stackOut_237_1 = 0;
        int stackOut_237_2 = 0;
        int stackOut_237_3 = 0;
        int[][] stackOut_237_4 = null;
        int stackOut_237_5 = 0;
        int stackOut_236_0 = 0;
        int stackOut_236_1 = 0;
        int stackOut_236_2 = 0;
        int stackOut_236_3 = 0;
        int[][] stackOut_236_4 = null;
        int stackOut_236_5 = 0;
        int stackOut_241_0 = 0;
        int stackOut_241_1 = 0;
        int stackOut_243_0 = 0;
        int stackOut_243_1 = 0;
        int stackOut_243_2 = 0;
        int stackOut_242_0 = 0;
        int stackOut_242_1 = 0;
        int stackOut_242_2 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        int stackOut_244_2 = 0;
        int stackOut_244_3 = 0;
        int[][] stackOut_244_4 = null;
        int stackOut_246_0 = 0;
        int stackOut_246_1 = 0;
        int stackOut_246_2 = 0;
        int stackOut_246_3 = 0;
        int[][] stackOut_246_4 = null;
        int stackOut_246_5 = 0;
        int stackOut_245_0 = 0;
        int stackOut_245_1 = 0;
        int stackOut_245_2 = 0;
        int stackOut_245_3 = 0;
        int[][] stackOut_245_4 = null;
        int stackOut_245_5 = 0;
        int stackOut_197_0 = 0;
        int stackOut_197_1 = 0;
        int stackOut_197_2 = 0;
        int stackOut_197_3 = 0;
        int[][] stackOut_197_4 = null;
        int stackOut_199_0 = 0;
        int stackOut_199_1 = 0;
        int stackOut_199_2 = 0;
        int stackOut_199_3 = 0;
        int[][] stackOut_199_4 = null;
        int stackOut_199_5 = 0;
        int stackOut_198_0 = 0;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        int stackOut_198_3 = 0;
        int[][] stackOut_198_4 = null;
        int stackOut_198_5 = 0;
        int stackOut_203_0 = 0;
        int stackOut_203_1 = 0;
        int stackOut_205_0 = 0;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        int[][] stackOut_206_4 = null;
        int stackOut_208_0 = 0;
        int stackOut_208_1 = 0;
        int stackOut_208_2 = 0;
        int stackOut_208_3 = 0;
        int[][] stackOut_208_4 = null;
        int stackOut_208_5 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        int stackOut_207_3 = 0;
        int[][] stackOut_207_4 = null;
        int stackOut_207_5 = 0;
        int stackOut_187_0 = 0;
        int stackOut_187_1 = 0;
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        int stackOut_190_0 = 0;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        int stackOut_190_3 = 0;
        int[][] stackOut_190_4 = null;
        int stackOut_192_0 = 0;
        int stackOut_192_1 = 0;
        int stackOut_192_2 = 0;
        int stackOut_192_3 = 0;
        int[][] stackOut_192_4 = null;
        int stackOut_192_5 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        int stackOut_191_3 = 0;
        int[][] stackOut_191_4 = null;
        int stackOut_191_5 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        int stackOut_167_3 = 0;
        int[][] stackOut_167_4 = null;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        int stackOut_169_2 = 0;
        int stackOut_169_3 = 0;
        int[][] stackOut_169_4 = null;
        int stackOut_169_5 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        int stackOut_168_2 = 0;
        int stackOut_168_3 = 0;
        int[][] stackOut_168_4 = null;
        int stackOut_168_5 = 0;
        int stackOut_173_0 = 0;
        int stackOut_173_1 = 0;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_175_2 = 0;
        int stackOut_174_0 = 0;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        int stackOut_176_0 = 0;
        int stackOut_176_1 = 0;
        int stackOut_176_2 = 0;
        int stackOut_176_3 = 0;
        int[][] stackOut_176_4 = null;
        int stackOut_178_0 = 0;
        int stackOut_178_1 = 0;
        int stackOut_178_2 = 0;
        int stackOut_178_3 = 0;
        int[][] stackOut_178_4 = null;
        int stackOut_178_5 = 0;
        int stackOut_177_0 = 0;
        int stackOut_177_1 = 0;
        int stackOut_177_2 = 0;
        int stackOut_177_3 = 0;
        int[][] stackOut_177_4 = null;
        int stackOut_177_5 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 < -72) {
          L0: {
            var12 = vs.field_e[param3].field_c;
            var13 = var12;
            if (var13 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var7 = stackIn_5_0;
          if (param2) {
            return;
          } else {
            if (var7 != 0) {
              L1: {
                var8 = jf.field_C.field_q;
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = bv.field_w.field_gb;
                  break L1;
                }
              }
              var9 = vs.field_e[param3];
              if (var13.field_u) {
                return;
              } else {
                L2: {
                  if (!var13.field_s) {
                    break L2;
                  } else {
                    if (!var13.h(-13494)) {
                      if (-1 == (var13.field_B ^ -1)) {
                        L3: {
                          of.field_Mb[2].a(param0 + 8, param5 + 12);
                          if (-2 == (var13.field_ab ^ -1)) {
                            i.a(false, param5, param0);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (var13.c(false)) {
                            eu.a(111, param5, param0, var13);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (var13.u(8)) {
                            nb.a(param0, param5, (byte) -97, var13);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var13.field_x != null) {
                            L7: {
                              if (var13.field_O != ne.field_i) {
                                break L7;
                              } else {
                                if (var13.field_s) {
                                  break L7;
                                } else {
                                  if (jf.field_C.field_L > 0) {
                                    go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                    go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L8: {
                              if (!var9.a(false)) {
                                break L8;
                              } else {
                                if (bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                                  break L8;
                                } else {
                                  if (var13.i(-21428)) {
                                    L9: {
                                      L10: {
                                        qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                        if (0 > (var9.field_a ^ -1)) {
                                          break L10;
                                        } else {
                                          qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                          if (var11 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        stackOut_124_0 = param0 - -19;
                                        stackOut_124_1 = param5 + 31;
                                        stackOut_124_2 = 40;
                                        stackOut_124_3 = 4;
                                        stackOut_124_4 = op.field_c;
                                        stackIn_126_0 = stackOut_124_0;
                                        stackIn_126_1 = stackOut_124_1;
                                        stackIn_126_2 = stackOut_124_2;
                                        stackIn_126_3 = stackOut_124_3;
                                        stackIn_126_4 = stackOut_124_4;
                                        stackIn_125_0 = stackOut_124_0;
                                        stackIn_125_1 = stackOut_124_1;
                                        stackIn_125_2 = stackOut_124_2;
                                        stackIn_125_3 = stackOut_124_3;
                                        stackIn_125_4 = stackOut_124_4;
                                        if (bv.field_w.field_wb) {
                                          stackOut_126_0 = stackIn_126_0;
                                          stackOut_126_1 = stackIn_126_1;
                                          stackOut_126_2 = stackIn_126_2;
                                          stackOut_126_3 = stackIn_126_3;
                                          stackOut_126_4 = (int[][]) ((Object) stackIn_126_4);
                                          stackOut_126_5 = 1;
                                          stackIn_127_0 = stackOut_126_0;
                                          stackIn_127_1 = stackOut_126_1;
                                          stackIn_127_2 = stackOut_126_2;
                                          stackIn_127_3 = stackOut_126_3;
                                          stackIn_127_4 = stackOut_126_4;
                                          stackIn_127_5 = stackOut_126_5;
                                          break L11;
                                        } else {
                                          stackOut_125_0 = stackIn_125_0;
                                          stackOut_125_1 = stackIn_125_1;
                                          stackOut_125_2 = stackIn_125_2;
                                          stackOut_125_3 = stackIn_125_3;
                                          stackOut_125_4 = (int[][]) ((Object) stackIn_125_4);
                                          stackOut_125_5 = 0;
                                          stackIn_127_0 = stackOut_125_0;
                                          stackIn_127_1 = stackOut_125_1;
                                          stackIn_127_2 = stackOut_125_2;
                                          stackIn_127_3 = stackOut_125_3;
                                          stackIn_127_4 = stackOut_125_4;
                                          stackIn_127_5 = stackOut_125_5;
                                          break L11;
                                        }
                                      }
                                      qn.f(stackIn_127_0, stackIn_127_1, stackIn_127_2, stackIn_127_3, stackIn_127_4[stackIn_127_5][var9.field_a]);
                                      break L9;
                                    }
                                    L12: {
                                      L13: {
                                        var10 = var9.e(10) + -var9.field_m;
                                        if (10 != var9.e(10)) {
                                          break L13;
                                        } else {
                                          var10 = var10 << 2;
                                          if (var11 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var10 = (var10 << -1124917309) / 3;
                                      break L12;
                                    }
                                    L14: {
                                      stackOut_131_0 = param0 + 19;
                                      stackOut_131_1 = 31 + param5;
                                      stackIn_133_0 = stackOut_131_0;
                                      stackIn_133_1 = stackOut_131_1;
                                      stackIn_132_0 = stackOut_131_0;
                                      stackIn_132_1 = stackOut_131_1;
                                      if (var10 > 40) {
                                        stackOut_133_0 = stackIn_133_0;
                                        stackOut_133_1 = stackIn_133_1;
                                        stackOut_133_2 = 40;
                                        stackIn_134_0 = stackOut_133_0;
                                        stackIn_134_1 = stackOut_133_1;
                                        stackIn_134_2 = stackOut_133_2;
                                        break L14;
                                      } else {
                                        stackOut_132_0 = stackIn_132_0;
                                        stackOut_132_1 = stackIn_132_1;
                                        stackOut_132_2 = var10;
                                        stackIn_134_0 = stackOut_132_0;
                                        stackIn_134_1 = stackOut_132_1;
                                        stackIn_134_2 = stackOut_132_2;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      stackOut_134_0 = stackIn_134_0;
                                      stackOut_134_1 = stackIn_134_1;
                                      stackOut_134_2 = stackIn_134_2;
                                      stackOut_134_3 = 4;
                                      stackOut_134_4 = op.field_c;
                                      stackIn_136_0 = stackOut_134_0;
                                      stackIn_136_1 = stackOut_134_1;
                                      stackIn_136_2 = stackOut_134_2;
                                      stackIn_136_3 = stackOut_134_3;
                                      stackIn_136_4 = stackOut_134_4;
                                      stackIn_135_0 = stackOut_134_0;
                                      stackIn_135_1 = stackOut_134_1;
                                      stackIn_135_2 = stackOut_134_2;
                                      stackIn_135_3 = stackOut_134_3;
                                      stackIn_135_4 = stackOut_134_4;
                                      if (!bv.field_w.field_wb) {
                                        stackOut_136_0 = stackIn_136_0;
                                        stackOut_136_1 = stackIn_136_1;
                                        stackOut_136_2 = stackIn_136_2;
                                        stackOut_136_3 = stackIn_136_3;
                                        stackOut_136_4 = (int[][]) ((Object) stackIn_136_4);
                                        stackOut_136_5 = 0;
                                        stackIn_137_0 = stackOut_136_0;
                                        stackIn_137_1 = stackOut_136_1;
                                        stackIn_137_2 = stackOut_136_2;
                                        stackIn_137_3 = stackOut_136_3;
                                        stackIn_137_4 = stackOut_136_4;
                                        stackIn_137_5 = stackOut_136_5;
                                        break L15;
                                      } else {
                                        stackOut_135_0 = stackIn_135_0;
                                        stackOut_135_1 = stackIn_135_1;
                                        stackOut_135_2 = stackIn_135_2;
                                        stackOut_135_3 = stackIn_135_3;
                                        stackOut_135_4 = (int[][]) ((Object) stackIn_135_4);
                                        stackOut_135_5 = 1;
                                        stackIn_137_0 = stackOut_135_0;
                                        stackIn_137_1 = stackOut_135_1;
                                        stackIn_137_2 = stackOut_135_2;
                                        stackIn_137_3 = stackOut_135_3;
                                        stackIn_137_4 = stackOut_135_4;
                                        stackIn_137_5 = stackOut_135_5;
                                        break L15;
                                      }
                                    }
                                    qn.f(stackIn_137_0, stackIn_137_1, stackIn_137_2, stackIn_137_3, stackIn_137_4[stackIn_137_5][bv.field_w.o(var12.field_O, -1)]);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        return;
                      } else {
                        of.field_Mb[1].a(param0 - -8, param5 - -12);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          L16: {
                            of.field_Mb[2].a(param0 + 8, param5 + 12);
                            if (-2 == (var13.field_ab ^ -1)) {
                              i.a(false, param5, param0);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (var13.c(false)) {
                              eu.a(111, param5, param0, var13);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (var13.u(8)) {
                              nb.a(param0, param5, (byte) -97, var13);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (var13.field_x != null) {
                              L20: {
                                if (var13.field_O != ne.field_i) {
                                  break L20;
                                } else {
                                  if (var13.field_s) {
                                    break L20;
                                  } else {
                                    if (jf.field_C.field_L > 0) {
                                      go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                      go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              L21: {
                                if (!var9.a(false)) {
                                  break L21;
                                } else {
                                  if (bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                                    break L21;
                                  } else {
                                    if (var13.i(-21428)) {
                                      L22: {
                                        L23: {
                                          qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                          if (0 > (var9.field_a ^ -1)) {
                                            break L23;
                                          } else {
                                            qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                            if (var11 == 0) {
                                              break L22;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L24: {
                                          stackOut_83_0 = param0 - -19;
                                          stackOut_83_1 = param5 + 31;
                                          stackOut_83_2 = 40;
                                          stackOut_83_3 = 4;
                                          stackOut_83_4 = op.field_c;
                                          stackIn_85_0 = stackOut_83_0;
                                          stackIn_85_1 = stackOut_83_1;
                                          stackIn_85_2 = stackOut_83_2;
                                          stackIn_85_3 = stackOut_83_3;
                                          stackIn_85_4 = stackOut_83_4;
                                          stackIn_84_0 = stackOut_83_0;
                                          stackIn_84_1 = stackOut_83_1;
                                          stackIn_84_2 = stackOut_83_2;
                                          stackIn_84_3 = stackOut_83_3;
                                          stackIn_84_4 = stackOut_83_4;
                                          if (bv.field_w.field_wb) {
                                            stackOut_85_0 = stackIn_85_0;
                                            stackOut_85_1 = stackIn_85_1;
                                            stackOut_85_2 = stackIn_85_2;
                                            stackOut_85_3 = stackIn_85_3;
                                            stackOut_85_4 = (int[][]) ((Object) stackIn_85_4);
                                            stackOut_85_5 = 1;
                                            stackIn_86_0 = stackOut_85_0;
                                            stackIn_86_1 = stackOut_85_1;
                                            stackIn_86_2 = stackOut_85_2;
                                            stackIn_86_3 = stackOut_85_3;
                                            stackIn_86_4 = stackOut_85_4;
                                            stackIn_86_5 = stackOut_85_5;
                                            break L24;
                                          } else {
                                            stackOut_84_0 = stackIn_84_0;
                                            stackOut_84_1 = stackIn_84_1;
                                            stackOut_84_2 = stackIn_84_2;
                                            stackOut_84_3 = stackIn_84_3;
                                            stackOut_84_4 = (int[][]) ((Object) stackIn_84_4);
                                            stackOut_84_5 = 0;
                                            stackIn_86_0 = stackOut_84_0;
                                            stackIn_86_1 = stackOut_84_1;
                                            stackIn_86_2 = stackOut_84_2;
                                            stackIn_86_3 = stackOut_84_3;
                                            stackIn_86_4 = stackOut_84_4;
                                            stackIn_86_5 = stackOut_84_5;
                                            break L24;
                                          }
                                        }
                                        qn.f(stackIn_86_0, stackIn_86_1, stackIn_86_2, stackIn_86_3, stackIn_86_4[stackIn_86_5][var9.field_a]);
                                        break L22;
                                      }
                                      L25: {
                                        L26: {
                                          var10 = var9.e(10) + -var9.field_m;
                                          if (10 != var9.e(10)) {
                                            break L26;
                                          } else {
                                            var10 = var10 << 2;
                                            if (var11 == 0) {
                                              break L25;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                        var10 = (var10 << -1124917309) / 3;
                                        break L25;
                                      }
                                      L27: {
                                        stackOut_90_0 = param0 + 19;
                                        stackOut_90_1 = 31 + param5;
                                        stackIn_92_0 = stackOut_90_0;
                                        stackIn_92_1 = stackOut_90_1;
                                        stackIn_91_0 = stackOut_90_0;
                                        stackIn_91_1 = stackOut_90_1;
                                        if (var10 > 40) {
                                          stackOut_92_0 = stackIn_92_0;
                                          stackOut_92_1 = stackIn_92_1;
                                          stackOut_92_2 = 40;
                                          stackIn_93_0 = stackOut_92_0;
                                          stackIn_93_1 = stackOut_92_1;
                                          stackIn_93_2 = stackOut_92_2;
                                          break L27;
                                        } else {
                                          stackOut_91_0 = stackIn_91_0;
                                          stackOut_91_1 = stackIn_91_1;
                                          stackOut_91_2 = var10;
                                          stackIn_93_0 = stackOut_91_0;
                                          stackIn_93_1 = stackOut_91_1;
                                          stackIn_93_2 = stackOut_91_2;
                                          break L27;
                                        }
                                      }
                                      L28: {
                                        stackOut_93_0 = stackIn_93_0;
                                        stackOut_93_1 = stackIn_93_1;
                                        stackOut_93_2 = stackIn_93_2;
                                        stackOut_93_3 = 4;
                                        stackOut_93_4 = op.field_c;
                                        stackIn_95_0 = stackOut_93_0;
                                        stackIn_95_1 = stackOut_93_1;
                                        stackIn_95_2 = stackOut_93_2;
                                        stackIn_95_3 = stackOut_93_3;
                                        stackIn_95_4 = stackOut_93_4;
                                        stackIn_94_0 = stackOut_93_0;
                                        stackIn_94_1 = stackOut_93_1;
                                        stackIn_94_2 = stackOut_93_2;
                                        stackIn_94_3 = stackOut_93_3;
                                        stackIn_94_4 = stackOut_93_4;
                                        if (!bv.field_w.field_wb) {
                                          stackOut_95_0 = stackIn_95_0;
                                          stackOut_95_1 = stackIn_95_1;
                                          stackOut_95_2 = stackIn_95_2;
                                          stackOut_95_3 = stackIn_95_3;
                                          stackOut_95_4 = (int[][]) ((Object) stackIn_95_4);
                                          stackOut_95_5 = 0;
                                          stackIn_96_0 = stackOut_95_0;
                                          stackIn_96_1 = stackOut_95_1;
                                          stackIn_96_2 = stackOut_95_2;
                                          stackIn_96_3 = stackOut_95_3;
                                          stackIn_96_4 = stackOut_95_4;
                                          stackIn_96_5 = stackOut_95_5;
                                          break L28;
                                        } else {
                                          stackOut_94_0 = stackIn_94_0;
                                          stackOut_94_1 = stackIn_94_1;
                                          stackOut_94_2 = stackIn_94_2;
                                          stackOut_94_3 = stackIn_94_3;
                                          stackOut_94_4 = (int[][]) ((Object) stackIn_94_4);
                                          stackOut_94_5 = 1;
                                          stackIn_96_0 = stackOut_94_0;
                                          stackIn_96_1 = stackOut_94_1;
                                          stackIn_96_2 = stackOut_94_2;
                                          stackIn_96_3 = stackOut_94_3;
                                          stackIn_96_4 = stackOut_94_4;
                                          stackIn_96_5 = stackOut_94_5;
                                          break L28;
                                        }
                                      }
                                      qn.f(stackIn_96_0, stackIn_96_1, stackIn_96_2, stackIn_96_3, stackIn_96_4[stackIn_96_5][bv.field_w.o(var12.field_O, -1)]);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L19;
                              } else {
                                break L19;
                              }
                            } else {
                              break L19;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L29: {
                        if (-2 == (var13.field_ab ^ -1)) {
                          i.a(false, param5, param0);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if (var13.c(false)) {
                          eu.a(111, param5, param0, var13);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (var13.u(8)) {
                          nb.a(param0, param5, (byte) -97, var13);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (var13.field_x != null) {
                          L33: {
                            if (var13.field_O != ne.field_i) {
                              break L33;
                            } else {
                              if (var13.field_s) {
                                break L33;
                              } else {
                                if (jf.field_C.field_L > 0) {
                                  go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          L34: {
                            if (!var9.a(false)) {
                              break L34;
                            } else {
                              if (bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                                break L34;
                              } else {
                                if (var13.i(-21428)) {
                                  L35: {
                                    L36: {
                                      qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                      if (0 > (var9.field_a ^ -1)) {
                                        break L36;
                                      } else {
                                        qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                        if (var11 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    L37: {
                                      stackOut_40_0 = param0 - -19;
                                      stackOut_40_1 = param5 + 31;
                                      stackOut_40_2 = 40;
                                      stackOut_40_3 = 4;
                                      stackOut_40_4 = op.field_c;
                                      stackIn_42_0 = stackOut_40_0;
                                      stackIn_42_1 = stackOut_40_1;
                                      stackIn_42_2 = stackOut_40_2;
                                      stackIn_42_3 = stackOut_40_3;
                                      stackIn_42_4 = stackOut_40_4;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackIn_41_1 = stackOut_40_1;
                                      stackIn_41_2 = stackOut_40_2;
                                      stackIn_41_3 = stackOut_40_3;
                                      stackIn_41_4 = stackOut_40_4;
                                      if (bv.field_w.field_wb) {
                                        stackOut_42_0 = stackIn_42_0;
                                        stackOut_42_1 = stackIn_42_1;
                                        stackOut_42_2 = stackIn_42_2;
                                        stackOut_42_3 = stackIn_42_3;
                                        stackOut_42_4 = (int[][]) ((Object) stackIn_42_4);
                                        stackOut_42_5 = 1;
                                        stackIn_43_0 = stackOut_42_0;
                                        stackIn_43_1 = stackOut_42_1;
                                        stackIn_43_2 = stackOut_42_2;
                                        stackIn_43_3 = stackOut_42_3;
                                        stackIn_43_4 = stackOut_42_4;
                                        stackIn_43_5 = stackOut_42_5;
                                        break L37;
                                      } else {
                                        stackOut_41_0 = stackIn_41_0;
                                        stackOut_41_1 = stackIn_41_1;
                                        stackOut_41_2 = stackIn_41_2;
                                        stackOut_41_3 = stackIn_41_3;
                                        stackOut_41_4 = (int[][]) ((Object) stackIn_41_4);
                                        stackOut_41_5 = 0;
                                        stackIn_43_0 = stackOut_41_0;
                                        stackIn_43_1 = stackOut_41_1;
                                        stackIn_43_2 = stackOut_41_2;
                                        stackIn_43_3 = stackOut_41_3;
                                        stackIn_43_4 = stackOut_41_4;
                                        stackIn_43_5 = stackOut_41_5;
                                        break L37;
                                      }
                                    }
                                    qn.f(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4[stackIn_43_5][var9.field_a]);
                                    break L35;
                                  }
                                  L38: {
                                    L39: {
                                      var10 = var9.e(10) + -var9.field_m;
                                      if (10 != var9.e(10)) {
                                        break L39;
                                      } else {
                                        var10 = var10 << 2;
                                        if (var11 == 0) {
                                          break L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                    var10 = (var10 << -1124917309) / 3;
                                    break L38;
                                  }
                                  L40: {
                                    stackOut_47_0 = param0 + 19;
                                    stackOut_47_1 = 31 + param5;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 > 40) {
                                      stackOut_49_0 = stackIn_49_0;
                                      stackOut_49_1 = stackIn_49_1;
                                      stackOut_49_2 = 40;
                                      stackIn_50_0 = stackOut_49_0;
                                      stackIn_50_1 = stackOut_49_1;
                                      stackIn_50_2 = stackOut_49_2;
                                      break L40;
                                    } else {
                                      stackOut_48_0 = stackIn_48_0;
                                      stackOut_48_1 = stackIn_48_1;
                                      stackOut_48_2 = var10;
                                      stackIn_50_0 = stackOut_48_0;
                                      stackIn_50_1 = stackOut_48_1;
                                      stackIn_50_2 = stackOut_48_2;
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    stackOut_50_0 = stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = stackIn_50_2;
                                    stackOut_50_3 = 4;
                                    stackOut_50_4 = op.field_c;
                                    stackIn_52_0 = stackOut_50_0;
                                    stackIn_52_1 = stackOut_50_1;
                                    stackIn_52_2 = stackOut_50_2;
                                    stackIn_52_3 = stackOut_50_3;
                                    stackIn_52_4 = stackOut_50_4;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    stackIn_51_2 = stackOut_50_2;
                                    stackIn_51_3 = stackOut_50_3;
                                    stackIn_51_4 = stackOut_50_4;
                                    if (!bv.field_w.field_wb) {
                                      stackOut_52_0 = stackIn_52_0;
                                      stackOut_52_1 = stackIn_52_1;
                                      stackOut_52_2 = stackIn_52_2;
                                      stackOut_52_3 = stackIn_52_3;
                                      stackOut_52_4 = (int[][]) ((Object) stackIn_52_4);
                                      stackOut_52_5 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      stackIn_53_1 = stackOut_52_1;
                                      stackIn_53_2 = stackOut_52_2;
                                      stackIn_53_3 = stackOut_52_3;
                                      stackIn_53_4 = stackOut_52_4;
                                      stackIn_53_5 = stackOut_52_5;
                                      break L41;
                                    } else {
                                      stackOut_51_0 = stackIn_51_0;
                                      stackOut_51_1 = stackIn_51_1;
                                      stackOut_51_2 = stackIn_51_2;
                                      stackOut_51_3 = stackIn_51_3;
                                      stackOut_51_4 = (int[][]) ((Object) stackIn_51_4);
                                      stackOut_51_5 = 1;
                                      stackIn_53_0 = stackOut_51_0;
                                      stackIn_53_1 = stackOut_51_1;
                                      stackIn_53_2 = stackOut_51_2;
                                      stackIn_53_3 = stackOut_51_3;
                                      stackIn_53_4 = stackOut_51_4;
                                      stackIn_53_5 = stackOut_51_5;
                                      break L41;
                                    }
                                  }
                                  qn.f(stackIn_53_0, stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4[stackIn_53_5][bv.field_w.o(var12.field_O, -1)]);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L32;
                          } else {
                            break L32;
                          }
                        } else {
                          break L32;
                        }
                      }
                      return;
                    }
                  }
                }
                L42: {
                  if (-2 == (var13.field_ab ^ -1)) {
                    i.a(false, param5, param0);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (var13.c(false)) {
                    eu.a(111, param5, param0, var13);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (var13.u(8)) {
                    nb.a(param0, param5, (byte) -97, var13);
                    break L44;
                  } else {
                    break L44;
                  }
                }
                if (var13.field_x != null) {
                  if (var13.field_O == ne.field_i) {
                    if (!var13.field_s) {
                      if (jf.field_C.field_L > 0) {
                        L45: {
                          go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          if (!var9.a(false)) {
                            break L45;
                          } else {
                            if (bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                              break L45;
                            } else {
                              if (var13.i(-21428)) {
                                L46: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (0 > (var9.field_a ^ -1)) {
                                    L47: {
                                      stackOut_371_0 = param0 - -19;
                                      stackOut_371_1 = param5 + 31;
                                      stackOut_371_2 = 40;
                                      stackOut_371_3 = 4;
                                      stackOut_371_4 = op.field_c;
                                      stackIn_373_0 = stackOut_371_0;
                                      stackIn_373_1 = stackOut_371_1;
                                      stackIn_373_2 = stackOut_371_2;
                                      stackIn_373_3 = stackOut_371_3;
                                      stackIn_373_4 = stackOut_371_4;
                                      stackIn_372_0 = stackOut_371_0;
                                      stackIn_372_1 = stackOut_371_1;
                                      stackIn_372_2 = stackOut_371_2;
                                      stackIn_372_3 = stackOut_371_3;
                                      stackIn_372_4 = stackOut_371_4;
                                      if (bv.field_w.field_wb) {
                                        stackOut_373_0 = stackIn_373_0;
                                        stackOut_373_1 = stackIn_373_1;
                                        stackOut_373_2 = stackIn_373_2;
                                        stackOut_373_3 = stackIn_373_3;
                                        stackOut_373_4 = (int[][]) ((Object) stackIn_373_4);
                                        stackOut_373_5 = 1;
                                        stackIn_374_0 = stackOut_373_0;
                                        stackIn_374_1 = stackOut_373_1;
                                        stackIn_374_2 = stackOut_373_2;
                                        stackIn_374_3 = stackOut_373_3;
                                        stackIn_374_4 = stackOut_373_4;
                                        stackIn_374_5 = stackOut_373_5;
                                        break L47;
                                      } else {
                                        stackOut_372_0 = stackIn_372_0;
                                        stackOut_372_1 = stackIn_372_1;
                                        stackOut_372_2 = stackIn_372_2;
                                        stackOut_372_3 = stackIn_372_3;
                                        stackOut_372_4 = (int[][]) ((Object) stackIn_372_4);
                                        stackOut_372_5 = 0;
                                        stackIn_374_0 = stackOut_372_0;
                                        stackIn_374_1 = stackOut_372_1;
                                        stackIn_374_2 = stackOut_372_2;
                                        stackIn_374_3 = stackOut_372_3;
                                        stackIn_374_4 = stackOut_372_4;
                                        stackIn_374_5 = stackOut_372_5;
                                        break L47;
                                      }
                                    }
                                    qn.f(stackIn_374_0, stackIn_374_1, stackIn_374_2, stackIn_374_3, stackIn_374_4[stackIn_374_5][var9.field_a]);
                                    break L46;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    if (var11 == 0) {
                                      break L46;
                                    } else {
                                      L48: {
                                        stackOut_355_0 = param0 - -19;
                                        stackOut_355_1 = param5 + 31;
                                        stackOut_355_2 = 40;
                                        stackOut_355_3 = 4;
                                        stackOut_355_4 = op.field_c;
                                        stackIn_357_0 = stackOut_355_0;
                                        stackIn_357_1 = stackOut_355_1;
                                        stackIn_357_2 = stackOut_355_2;
                                        stackIn_357_3 = stackOut_355_3;
                                        stackIn_357_4 = stackOut_355_4;
                                        stackIn_356_0 = stackOut_355_0;
                                        stackIn_356_1 = stackOut_355_1;
                                        stackIn_356_2 = stackOut_355_2;
                                        stackIn_356_3 = stackOut_355_3;
                                        stackIn_356_4 = stackOut_355_4;
                                        if (bv.field_w.field_wb) {
                                          stackOut_357_0 = stackIn_357_0;
                                          stackOut_357_1 = stackIn_357_1;
                                          stackOut_357_2 = stackIn_357_2;
                                          stackOut_357_3 = stackIn_357_3;
                                          stackOut_357_4 = (int[][]) ((Object) stackIn_357_4);
                                          stackOut_357_5 = 1;
                                          stackIn_358_0 = stackOut_357_0;
                                          stackIn_358_1 = stackOut_357_1;
                                          stackIn_358_2 = stackOut_357_2;
                                          stackIn_358_3 = stackOut_357_3;
                                          stackIn_358_4 = stackOut_357_4;
                                          stackIn_358_5 = stackOut_357_5;
                                          break L48;
                                        } else {
                                          stackOut_356_0 = stackIn_356_0;
                                          stackOut_356_1 = stackIn_356_1;
                                          stackOut_356_2 = stackIn_356_2;
                                          stackOut_356_3 = stackIn_356_3;
                                          stackOut_356_4 = (int[][]) ((Object) stackIn_356_4);
                                          stackOut_356_5 = 0;
                                          stackIn_358_0 = stackOut_356_0;
                                          stackIn_358_1 = stackOut_356_1;
                                          stackIn_358_2 = stackOut_356_2;
                                          stackIn_358_3 = stackOut_356_3;
                                          stackIn_358_4 = stackOut_356_4;
                                          stackIn_358_5 = stackOut_356_5;
                                          break L48;
                                        }
                                      }
                                      L49: {
                                        L50: {
                                          qn.f(stackIn_358_0, stackIn_358_1, stackIn_358_2, stackIn_358_3, stackIn_358_4[stackIn_358_5][var9.field_a]);
                                          var10 = var9.e(10) + -var9.field_m;
                                          if (10 != var9.e(10)) {
                                            break L50;
                                          } else {
                                            var10 = var10 << 2;
                                            if (var11 == 0) {
                                              break L49;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                        var10 = (var10 << -1124917309) / 3;
                                        break L49;
                                      }
                                      L51: {
                                        stackOut_361_0 = param0 + 19;
                                        stackOut_361_1 = 31 + param5;
                                        stackIn_363_0 = stackOut_361_0;
                                        stackIn_363_1 = stackOut_361_1;
                                        stackIn_362_0 = stackOut_361_0;
                                        stackIn_362_1 = stackOut_361_1;
                                        if (var10 > 40) {
                                          stackOut_363_0 = stackIn_363_0;
                                          stackOut_363_1 = stackIn_363_1;
                                          stackOut_363_2 = 40;
                                          stackIn_364_0 = stackOut_363_0;
                                          stackIn_364_1 = stackOut_363_1;
                                          stackIn_364_2 = stackOut_363_2;
                                          break L51;
                                        } else {
                                          stackOut_362_0 = stackIn_362_0;
                                          stackOut_362_1 = stackIn_362_1;
                                          stackOut_362_2 = var10;
                                          stackIn_364_0 = stackOut_362_0;
                                          stackIn_364_1 = stackOut_362_1;
                                          stackIn_364_2 = stackOut_362_2;
                                          break L51;
                                        }
                                      }
                                      L52: {
                                        stackOut_364_0 = stackIn_364_0;
                                        stackOut_364_1 = stackIn_364_1;
                                        stackOut_364_2 = stackIn_364_2;
                                        stackOut_364_3 = 4;
                                        stackOut_364_4 = op.field_c;
                                        stackIn_366_0 = stackOut_364_0;
                                        stackIn_366_1 = stackOut_364_1;
                                        stackIn_366_2 = stackOut_364_2;
                                        stackIn_366_3 = stackOut_364_3;
                                        stackIn_366_4 = stackOut_364_4;
                                        stackIn_365_0 = stackOut_364_0;
                                        stackIn_365_1 = stackOut_364_1;
                                        stackIn_365_2 = stackOut_364_2;
                                        stackIn_365_3 = stackOut_364_3;
                                        stackIn_365_4 = stackOut_364_4;
                                        if (!bv.field_w.field_wb) {
                                          stackOut_366_0 = stackIn_366_0;
                                          stackOut_366_1 = stackIn_366_1;
                                          stackOut_366_2 = stackIn_366_2;
                                          stackOut_366_3 = stackIn_366_3;
                                          stackOut_366_4 = (int[][]) ((Object) stackIn_366_4);
                                          stackOut_366_5 = 0;
                                          stackIn_367_0 = stackOut_366_0;
                                          stackIn_367_1 = stackOut_366_1;
                                          stackIn_367_2 = stackOut_366_2;
                                          stackIn_367_3 = stackOut_366_3;
                                          stackIn_367_4 = stackOut_366_4;
                                          stackIn_367_5 = stackOut_366_5;
                                          break L52;
                                        } else {
                                          stackOut_365_0 = stackIn_365_0;
                                          stackOut_365_1 = stackIn_365_1;
                                          stackOut_365_2 = stackIn_365_2;
                                          stackOut_365_3 = stackIn_365_3;
                                          stackOut_365_4 = (int[][]) ((Object) stackIn_365_4);
                                          stackOut_365_5 = 1;
                                          stackIn_367_0 = stackOut_365_0;
                                          stackIn_367_1 = stackOut_365_1;
                                          stackIn_367_2 = stackOut_365_2;
                                          stackIn_367_3 = stackOut_365_3;
                                          stackIn_367_4 = stackOut_365_4;
                                          stackIn_367_5 = stackOut_365_5;
                                          break L52;
                                        }
                                      }
                                      L53: {
                                        qn.f(stackIn_367_0, stackIn_367_1, stackIn_367_2, stackIn_367_3, stackIn_367_4[stackIn_367_5][bv.field_w.o(var12.field_O, -1)]);
                                        if (param4 > 0) {
                                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      }
                                      return;
                                    }
                                  }
                                }
                                L54: {
                                  L55: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      break L55;
                                    } else {
                                      var10 = var10 << 2;
                                      if (var11 == 0) {
                                        break L54;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                  var10 = (var10 << -1124917309) / 3;
                                  break L54;
                                }
                                L56: {
                                  stackOut_378_0 = param0 + 19;
                                  stackOut_378_1 = 31 + param5;
                                  stackIn_380_0 = stackOut_378_0;
                                  stackIn_380_1 = stackOut_378_1;
                                  stackIn_379_0 = stackOut_378_0;
                                  stackIn_379_1 = stackOut_378_1;
                                  if (var10 > 40) {
                                    stackOut_380_0 = stackIn_380_0;
                                    stackOut_380_1 = stackIn_380_1;
                                    stackOut_380_2 = 40;
                                    stackIn_381_0 = stackOut_380_0;
                                    stackIn_381_1 = stackOut_380_1;
                                    stackIn_381_2 = stackOut_380_2;
                                    break L56;
                                  } else {
                                    stackOut_379_0 = stackIn_379_0;
                                    stackOut_379_1 = stackIn_379_1;
                                    stackOut_379_2 = var10;
                                    stackIn_381_0 = stackOut_379_0;
                                    stackIn_381_1 = stackOut_379_1;
                                    stackIn_381_2 = stackOut_379_2;
                                    break L56;
                                  }
                                }
                                L57: {
                                  stackOut_381_0 = stackIn_381_0;
                                  stackOut_381_1 = stackIn_381_1;
                                  stackOut_381_2 = stackIn_381_2;
                                  stackOut_381_3 = 4;
                                  stackOut_381_4 = op.field_c;
                                  stackIn_383_0 = stackOut_381_0;
                                  stackIn_383_1 = stackOut_381_1;
                                  stackIn_383_2 = stackOut_381_2;
                                  stackIn_383_3 = stackOut_381_3;
                                  stackIn_383_4 = stackOut_381_4;
                                  stackIn_382_0 = stackOut_381_0;
                                  stackIn_382_1 = stackOut_381_1;
                                  stackIn_382_2 = stackOut_381_2;
                                  stackIn_382_3 = stackOut_381_3;
                                  stackIn_382_4 = stackOut_381_4;
                                  if (!bv.field_w.field_wb) {
                                    stackOut_383_0 = stackIn_383_0;
                                    stackOut_383_1 = stackIn_383_1;
                                    stackOut_383_2 = stackIn_383_2;
                                    stackOut_383_3 = stackIn_383_3;
                                    stackOut_383_4 = (int[][]) ((Object) stackIn_383_4);
                                    stackOut_383_5 = 0;
                                    stackIn_384_0 = stackOut_383_0;
                                    stackIn_384_1 = stackOut_383_1;
                                    stackIn_384_2 = stackOut_383_2;
                                    stackIn_384_3 = stackOut_383_3;
                                    stackIn_384_4 = stackOut_383_4;
                                    stackIn_384_5 = stackOut_383_5;
                                    break L57;
                                  } else {
                                    stackOut_382_0 = stackIn_382_0;
                                    stackOut_382_1 = stackIn_382_1;
                                    stackOut_382_2 = stackIn_382_2;
                                    stackOut_382_3 = stackIn_382_3;
                                    stackOut_382_4 = (int[][]) ((Object) stackIn_382_4);
                                    stackOut_382_5 = 1;
                                    stackIn_384_0 = stackOut_382_0;
                                    stackIn_384_1 = stackOut_382_1;
                                    stackIn_384_2 = stackOut_382_2;
                                    stackIn_384_3 = stackOut_382_3;
                                    stackIn_384_4 = stackOut_382_4;
                                    stackIn_384_5 = stackOut_382_5;
                                    break L57;
                                  }
                                }
                                qn.f(stackIn_384_0, stackIn_384_1, stackIn_384_2, stackIn_384_3, stackIn_384_4[stackIn_384_5][bv.field_w.o(var12.field_O, -1)]);
                                break L45;
                              } else {
                                L58: {
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (var9.a(false)) {
                          if (!bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                            if (var13.i(-21428)) {
                              qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                              if (0 <= (var9.field_a ^ -1)) {
                                qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                if (var11 == 0) {
                                  L59: {
                                    L60: {
                                      var10 = var9.e(10) + -var9.field_m;
                                      if (10 != var9.e(10)) {
                                        break L60;
                                      } else {
                                        var10 = var10 << 2;
                                        if (var11 == 0) {
                                          break L59;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    var10 = (var10 << -1124917309) / 3;
                                    break L59;
                                  }
                                  L61: {
                                    stackOut_335_0 = param0 + 19;
                                    stackOut_335_1 = 31 + param5;
                                    stackIn_337_0 = stackOut_335_0;
                                    stackIn_337_1 = stackOut_335_1;
                                    stackIn_336_0 = stackOut_335_0;
                                    stackIn_336_1 = stackOut_335_1;
                                    if (var10 > 40) {
                                      stackOut_337_0 = stackIn_337_0;
                                      stackOut_337_1 = stackIn_337_1;
                                      stackOut_337_2 = 40;
                                      stackIn_338_0 = stackOut_337_0;
                                      stackIn_338_1 = stackOut_337_1;
                                      stackIn_338_2 = stackOut_337_2;
                                      break L61;
                                    } else {
                                      stackOut_336_0 = stackIn_336_0;
                                      stackOut_336_1 = stackIn_336_1;
                                      stackOut_336_2 = var10;
                                      stackIn_338_0 = stackOut_336_0;
                                      stackIn_338_1 = stackOut_336_1;
                                      stackIn_338_2 = stackOut_336_2;
                                      break L61;
                                    }
                                  }
                                  L62: {
                                    stackOut_338_0 = stackIn_338_0;
                                    stackOut_338_1 = stackIn_338_1;
                                    stackOut_338_2 = stackIn_338_2;
                                    stackOut_338_3 = 4;
                                    stackOut_338_4 = op.field_c;
                                    stackIn_340_0 = stackOut_338_0;
                                    stackIn_340_1 = stackOut_338_1;
                                    stackIn_340_2 = stackOut_338_2;
                                    stackIn_340_3 = stackOut_338_3;
                                    stackIn_340_4 = stackOut_338_4;
                                    stackIn_339_0 = stackOut_338_0;
                                    stackIn_339_1 = stackOut_338_1;
                                    stackIn_339_2 = stackOut_338_2;
                                    stackIn_339_3 = stackOut_338_3;
                                    stackIn_339_4 = stackOut_338_4;
                                    if (!bv.field_w.field_wb) {
                                      stackOut_340_0 = stackIn_340_0;
                                      stackOut_340_1 = stackIn_340_1;
                                      stackOut_340_2 = stackIn_340_2;
                                      stackOut_340_3 = stackIn_340_3;
                                      stackOut_340_4 = (int[][]) ((Object) stackIn_340_4);
                                      stackOut_340_5 = 0;
                                      stackIn_341_0 = stackOut_340_0;
                                      stackIn_341_1 = stackOut_340_1;
                                      stackIn_341_2 = stackOut_340_2;
                                      stackIn_341_3 = stackOut_340_3;
                                      stackIn_341_4 = stackOut_340_4;
                                      stackIn_341_5 = stackOut_340_5;
                                      break L62;
                                    } else {
                                      stackOut_339_0 = stackIn_339_0;
                                      stackOut_339_1 = stackIn_339_1;
                                      stackOut_339_2 = stackIn_339_2;
                                      stackOut_339_3 = stackIn_339_3;
                                      stackOut_339_4 = (int[][]) ((Object) stackIn_339_4);
                                      stackOut_339_5 = 1;
                                      stackIn_341_0 = stackOut_339_0;
                                      stackIn_341_1 = stackOut_339_1;
                                      stackIn_341_2 = stackOut_339_2;
                                      stackIn_341_3 = stackOut_339_3;
                                      stackIn_341_4 = stackOut_339_4;
                                      stackIn_341_5 = stackOut_339_5;
                                      break L62;
                                    }
                                  }
                                  L63: {
                                    qn.f(stackIn_341_0, stackIn_341_1, stackIn_341_2, stackIn_341_3, stackIn_341_4[stackIn_341_5][bv.field_w.o(var12.field_O, -1)]);
                                    if (param4 > 0) {
                                      bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                  return;
                                } else {
                                  L64: {
                                    stackOut_316_0 = param0 - -19;
                                    stackOut_316_1 = param5 + 31;
                                    stackOut_316_2 = 40;
                                    stackOut_316_3 = 4;
                                    stackOut_316_4 = op.field_c;
                                    stackIn_318_0 = stackOut_316_0;
                                    stackIn_318_1 = stackOut_316_1;
                                    stackIn_318_2 = stackOut_316_2;
                                    stackIn_318_3 = stackOut_316_3;
                                    stackIn_318_4 = stackOut_316_4;
                                    stackIn_317_0 = stackOut_316_0;
                                    stackIn_317_1 = stackOut_316_1;
                                    stackIn_317_2 = stackOut_316_2;
                                    stackIn_317_3 = stackOut_316_3;
                                    stackIn_317_4 = stackOut_316_4;
                                    if (bv.field_w.field_wb) {
                                      stackOut_318_0 = stackIn_318_0;
                                      stackOut_318_1 = stackIn_318_1;
                                      stackOut_318_2 = stackIn_318_2;
                                      stackOut_318_3 = stackIn_318_3;
                                      stackOut_318_4 = (int[][]) ((Object) stackIn_318_4);
                                      stackOut_318_5 = 1;
                                      stackIn_319_0 = stackOut_318_0;
                                      stackIn_319_1 = stackOut_318_1;
                                      stackIn_319_2 = stackOut_318_2;
                                      stackIn_319_3 = stackOut_318_3;
                                      stackIn_319_4 = stackOut_318_4;
                                      stackIn_319_5 = stackOut_318_5;
                                      break L64;
                                    } else {
                                      stackOut_317_0 = stackIn_317_0;
                                      stackOut_317_1 = stackIn_317_1;
                                      stackOut_317_2 = stackIn_317_2;
                                      stackOut_317_3 = stackIn_317_3;
                                      stackOut_317_4 = (int[][]) ((Object) stackIn_317_4);
                                      stackOut_317_5 = 0;
                                      stackIn_319_0 = stackOut_317_0;
                                      stackIn_319_1 = stackOut_317_1;
                                      stackIn_319_2 = stackOut_317_2;
                                      stackIn_319_3 = stackOut_317_3;
                                      stackIn_319_4 = stackOut_317_4;
                                      stackIn_319_5 = stackOut_317_5;
                                      break L64;
                                    }
                                  }
                                  L65: {
                                    L66: {
                                      qn.f(stackIn_319_0, stackIn_319_1, stackIn_319_2, stackIn_319_3, stackIn_319_4[stackIn_319_5][var9.field_a]);
                                      var10 = var9.e(10) + -var9.field_m;
                                      if (10 != var9.e(10)) {
                                        break L66;
                                      } else {
                                        var10 = var10 << 2;
                                        if (var11 == 0) {
                                          break L65;
                                        } else {
                                          break L66;
                                        }
                                      }
                                    }
                                    var10 = (var10 << -1124917309) / 3;
                                    break L65;
                                  }
                                  L67: {
                                    stackOut_322_0 = param0 + 19;
                                    stackOut_322_1 = 31 + param5;
                                    stackIn_324_0 = stackOut_322_0;
                                    stackIn_324_1 = stackOut_322_1;
                                    stackIn_323_0 = stackOut_322_0;
                                    stackIn_323_1 = stackOut_322_1;
                                    if (var10 > 40) {
                                      stackOut_324_0 = stackIn_324_0;
                                      stackOut_324_1 = stackIn_324_1;
                                      stackOut_324_2 = 40;
                                      stackIn_325_0 = stackOut_324_0;
                                      stackIn_325_1 = stackOut_324_1;
                                      stackIn_325_2 = stackOut_324_2;
                                      break L67;
                                    } else {
                                      stackOut_323_0 = stackIn_323_0;
                                      stackOut_323_1 = stackIn_323_1;
                                      stackOut_323_2 = var10;
                                      stackIn_325_0 = stackOut_323_0;
                                      stackIn_325_1 = stackOut_323_1;
                                      stackIn_325_2 = stackOut_323_2;
                                      break L67;
                                    }
                                  }
                                  L68: {
                                    stackOut_325_0 = stackIn_325_0;
                                    stackOut_325_1 = stackIn_325_1;
                                    stackOut_325_2 = stackIn_325_2;
                                    stackOut_325_3 = 4;
                                    stackOut_325_4 = op.field_c;
                                    stackIn_327_0 = stackOut_325_0;
                                    stackIn_327_1 = stackOut_325_1;
                                    stackIn_327_2 = stackOut_325_2;
                                    stackIn_327_3 = stackOut_325_3;
                                    stackIn_327_4 = stackOut_325_4;
                                    stackIn_326_0 = stackOut_325_0;
                                    stackIn_326_1 = stackOut_325_1;
                                    stackIn_326_2 = stackOut_325_2;
                                    stackIn_326_3 = stackOut_325_3;
                                    stackIn_326_4 = stackOut_325_4;
                                    if (!bv.field_w.field_wb) {
                                      stackOut_327_0 = stackIn_327_0;
                                      stackOut_327_1 = stackIn_327_1;
                                      stackOut_327_2 = stackIn_327_2;
                                      stackOut_327_3 = stackIn_327_3;
                                      stackOut_327_4 = (int[][]) ((Object) stackIn_327_4);
                                      stackOut_327_5 = 0;
                                      stackIn_328_0 = stackOut_327_0;
                                      stackIn_328_1 = stackOut_327_1;
                                      stackIn_328_2 = stackOut_327_2;
                                      stackIn_328_3 = stackOut_327_3;
                                      stackIn_328_4 = stackOut_327_4;
                                      stackIn_328_5 = stackOut_327_5;
                                      break L68;
                                    } else {
                                      stackOut_326_0 = stackIn_326_0;
                                      stackOut_326_1 = stackIn_326_1;
                                      stackOut_326_2 = stackIn_326_2;
                                      stackOut_326_3 = stackIn_326_3;
                                      stackOut_326_4 = (int[][]) ((Object) stackIn_326_4);
                                      stackOut_326_5 = 1;
                                      stackIn_328_0 = stackOut_326_0;
                                      stackIn_328_1 = stackOut_326_1;
                                      stackIn_328_2 = stackOut_326_2;
                                      stackIn_328_3 = stackOut_326_3;
                                      stackIn_328_4 = stackOut_326_4;
                                      stackIn_328_5 = stackOut_326_5;
                                      break L68;
                                    }
                                  }
                                  L69: {
                                    qn.f(stackIn_328_0, stackIn_328_1, stackIn_328_2, stackIn_328_3, stackIn_328_4[stackIn_328_5][bv.field_w.o(var12.field_O, -1)]);
                                    if (param4 > 0) {
                                      bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                      break L69;
                                    } else {
                                      break L69;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L70: {
                                  stackOut_299_0 = param0 - -19;
                                  stackOut_299_1 = param5 + 31;
                                  stackOut_299_2 = 40;
                                  stackOut_299_3 = 4;
                                  stackOut_299_4 = op.field_c;
                                  stackIn_301_0 = stackOut_299_0;
                                  stackIn_301_1 = stackOut_299_1;
                                  stackIn_301_2 = stackOut_299_2;
                                  stackIn_301_3 = stackOut_299_3;
                                  stackIn_301_4 = stackOut_299_4;
                                  stackIn_300_0 = stackOut_299_0;
                                  stackIn_300_1 = stackOut_299_1;
                                  stackIn_300_2 = stackOut_299_2;
                                  stackIn_300_3 = stackOut_299_3;
                                  stackIn_300_4 = stackOut_299_4;
                                  if (bv.field_w.field_wb) {
                                    stackOut_301_0 = stackIn_301_0;
                                    stackOut_301_1 = stackIn_301_1;
                                    stackOut_301_2 = stackIn_301_2;
                                    stackOut_301_3 = stackIn_301_3;
                                    stackOut_301_4 = (int[][]) ((Object) stackIn_301_4);
                                    stackOut_301_5 = 1;
                                    stackIn_302_0 = stackOut_301_0;
                                    stackIn_302_1 = stackOut_301_1;
                                    stackIn_302_2 = stackOut_301_2;
                                    stackIn_302_3 = stackOut_301_3;
                                    stackIn_302_4 = stackOut_301_4;
                                    stackIn_302_5 = stackOut_301_5;
                                    break L70;
                                  } else {
                                    stackOut_300_0 = stackIn_300_0;
                                    stackOut_300_1 = stackIn_300_1;
                                    stackOut_300_2 = stackIn_300_2;
                                    stackOut_300_3 = stackIn_300_3;
                                    stackOut_300_4 = (int[][]) ((Object) stackIn_300_4);
                                    stackOut_300_5 = 0;
                                    stackIn_302_0 = stackOut_300_0;
                                    stackIn_302_1 = stackOut_300_1;
                                    stackIn_302_2 = stackOut_300_2;
                                    stackIn_302_3 = stackOut_300_3;
                                    stackIn_302_4 = stackOut_300_4;
                                    stackIn_302_5 = stackOut_300_5;
                                    break L70;
                                  }
                                }
                                L71: {
                                  L72: {
                                    qn.f(stackIn_302_0, stackIn_302_1, stackIn_302_2, stackIn_302_3, stackIn_302_4[stackIn_302_5][var9.field_a]);
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      break L72;
                                    } else {
                                      var10 = var10 << 2;
                                      if (var11 == 0) {
                                        break L71;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                  var10 = (var10 << -1124917309) / 3;
                                  break L71;
                                }
                                L73: {
                                  stackOut_305_0 = param0 + 19;
                                  stackOut_305_1 = 31 + param5;
                                  stackIn_307_0 = stackOut_305_0;
                                  stackIn_307_1 = stackOut_305_1;
                                  stackIn_306_0 = stackOut_305_0;
                                  stackIn_306_1 = stackOut_305_1;
                                  if (var10 > 40) {
                                    stackOut_307_0 = stackIn_307_0;
                                    stackOut_307_1 = stackIn_307_1;
                                    stackOut_307_2 = 40;
                                    stackIn_308_0 = stackOut_307_0;
                                    stackIn_308_1 = stackOut_307_1;
                                    stackIn_308_2 = stackOut_307_2;
                                    break L73;
                                  } else {
                                    stackOut_306_0 = stackIn_306_0;
                                    stackOut_306_1 = stackIn_306_1;
                                    stackOut_306_2 = var10;
                                    stackIn_308_0 = stackOut_306_0;
                                    stackIn_308_1 = stackOut_306_1;
                                    stackIn_308_2 = stackOut_306_2;
                                    break L73;
                                  }
                                }
                                L74: {
                                  stackOut_308_0 = stackIn_308_0;
                                  stackOut_308_1 = stackIn_308_1;
                                  stackOut_308_2 = stackIn_308_2;
                                  stackOut_308_3 = 4;
                                  stackOut_308_4 = op.field_c;
                                  stackIn_310_0 = stackOut_308_0;
                                  stackIn_310_1 = stackOut_308_1;
                                  stackIn_310_2 = stackOut_308_2;
                                  stackIn_310_3 = stackOut_308_3;
                                  stackIn_310_4 = stackOut_308_4;
                                  stackIn_309_0 = stackOut_308_0;
                                  stackIn_309_1 = stackOut_308_1;
                                  stackIn_309_2 = stackOut_308_2;
                                  stackIn_309_3 = stackOut_308_3;
                                  stackIn_309_4 = stackOut_308_4;
                                  if (!bv.field_w.field_wb) {
                                    stackOut_310_0 = stackIn_310_0;
                                    stackOut_310_1 = stackIn_310_1;
                                    stackOut_310_2 = stackIn_310_2;
                                    stackOut_310_3 = stackIn_310_3;
                                    stackOut_310_4 = (int[][]) ((Object) stackIn_310_4);
                                    stackOut_310_5 = 0;
                                    stackIn_311_0 = stackOut_310_0;
                                    stackIn_311_1 = stackOut_310_1;
                                    stackIn_311_2 = stackOut_310_2;
                                    stackIn_311_3 = stackOut_310_3;
                                    stackIn_311_4 = stackOut_310_4;
                                    stackIn_311_5 = stackOut_310_5;
                                    break L74;
                                  } else {
                                    stackOut_309_0 = stackIn_309_0;
                                    stackOut_309_1 = stackIn_309_1;
                                    stackOut_309_2 = stackIn_309_2;
                                    stackOut_309_3 = stackIn_309_3;
                                    stackOut_309_4 = (int[][]) ((Object) stackIn_309_4);
                                    stackOut_309_5 = 1;
                                    stackIn_311_0 = stackOut_309_0;
                                    stackIn_311_1 = stackOut_309_1;
                                    stackIn_311_2 = stackOut_309_2;
                                    stackIn_311_3 = stackOut_309_3;
                                    stackIn_311_4 = stackOut_309_4;
                                    stackIn_311_5 = stackOut_309_5;
                                    break L74;
                                  }
                                }
                                L75: {
                                  qn.f(stackIn_311_0, stackIn_311_1, stackIn_311_2, stackIn_311_3, stackIn_311_4[stackIn_311_5][bv.field_w.o(var12.field_O, -1)]);
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L75;
                                  } else {
                                    break L75;
                                  }
                                }
                                return;
                              }
                            } else {
                              L76: {
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L76;
                                } else {
                                  break L76;
                                }
                              }
                              return;
                            }
                          } else {
                            L77: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L77;
                              } else {
                                break L77;
                              }
                            }
                            return;
                          }
                        } else {
                          L78: {
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L78;
                            } else {
                              break L78;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      if (var9.a(false)) {
                        if (!bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                          if (var13.i(-21428)) {
                            qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                            if (0 <= (var9.field_a ^ -1)) {
                              qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                              if (var11 == 0) {
                                L79: {
                                  L80: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      break L80;
                                    } else {
                                      var10 = var10 << 2;
                                      if (var11 == 0) {
                                        break L79;
                                      } else {
                                        break L80;
                                      }
                                    }
                                  }
                                  var10 = (var10 << -1124917309) / 3;
                                  break L79;
                                }
                                L81: {
                                  stackOut_271_0 = param0 + 19;
                                  stackOut_271_1 = 31 + param5;
                                  stackIn_273_0 = stackOut_271_0;
                                  stackIn_273_1 = stackOut_271_1;
                                  stackIn_272_0 = stackOut_271_0;
                                  stackIn_272_1 = stackOut_271_1;
                                  if (var10 > 40) {
                                    stackOut_273_0 = stackIn_273_0;
                                    stackOut_273_1 = stackIn_273_1;
                                    stackOut_273_2 = 40;
                                    stackIn_274_0 = stackOut_273_0;
                                    stackIn_274_1 = stackOut_273_1;
                                    stackIn_274_2 = stackOut_273_2;
                                    break L81;
                                  } else {
                                    stackOut_272_0 = stackIn_272_0;
                                    stackOut_272_1 = stackIn_272_1;
                                    stackOut_272_2 = var10;
                                    stackIn_274_0 = stackOut_272_0;
                                    stackIn_274_1 = stackOut_272_1;
                                    stackIn_274_2 = stackOut_272_2;
                                    break L81;
                                  }
                                }
                                L82: {
                                  stackOut_274_0 = stackIn_274_0;
                                  stackOut_274_1 = stackIn_274_1;
                                  stackOut_274_2 = stackIn_274_2;
                                  stackOut_274_3 = 4;
                                  stackOut_274_4 = op.field_c;
                                  stackIn_276_0 = stackOut_274_0;
                                  stackIn_276_1 = stackOut_274_1;
                                  stackIn_276_2 = stackOut_274_2;
                                  stackIn_276_3 = stackOut_274_3;
                                  stackIn_276_4 = stackOut_274_4;
                                  stackIn_275_0 = stackOut_274_0;
                                  stackIn_275_1 = stackOut_274_1;
                                  stackIn_275_2 = stackOut_274_2;
                                  stackIn_275_3 = stackOut_274_3;
                                  stackIn_275_4 = stackOut_274_4;
                                  if (!bv.field_w.field_wb) {
                                    stackOut_276_0 = stackIn_276_0;
                                    stackOut_276_1 = stackIn_276_1;
                                    stackOut_276_2 = stackIn_276_2;
                                    stackOut_276_3 = stackIn_276_3;
                                    stackOut_276_4 = (int[][]) ((Object) stackIn_276_4);
                                    stackOut_276_5 = 0;
                                    stackIn_277_0 = stackOut_276_0;
                                    stackIn_277_1 = stackOut_276_1;
                                    stackIn_277_2 = stackOut_276_2;
                                    stackIn_277_3 = stackOut_276_3;
                                    stackIn_277_4 = stackOut_276_4;
                                    stackIn_277_5 = stackOut_276_5;
                                    break L82;
                                  } else {
                                    stackOut_275_0 = stackIn_275_0;
                                    stackOut_275_1 = stackIn_275_1;
                                    stackOut_275_2 = stackIn_275_2;
                                    stackOut_275_3 = stackIn_275_3;
                                    stackOut_275_4 = (int[][]) ((Object) stackIn_275_4);
                                    stackOut_275_5 = 1;
                                    stackIn_277_0 = stackOut_275_0;
                                    stackIn_277_1 = stackOut_275_1;
                                    stackIn_277_2 = stackOut_275_2;
                                    stackIn_277_3 = stackOut_275_3;
                                    stackIn_277_4 = stackOut_275_4;
                                    stackIn_277_5 = stackOut_275_5;
                                    break L82;
                                  }
                                }
                                L83: {
                                  qn.f(stackIn_277_0, stackIn_277_1, stackIn_277_2, stackIn_277_3, stackIn_277_4[stackIn_277_5][bv.field_w.o(var12.field_O, -1)]);
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L83;
                                  } else {
                                    break L83;
                                  }
                                }
                                return;
                              } else {
                                L84: {
                                  stackOut_252_0 = param0 - -19;
                                  stackOut_252_1 = param5 + 31;
                                  stackOut_252_2 = 40;
                                  stackOut_252_3 = 4;
                                  stackOut_252_4 = op.field_c;
                                  stackIn_254_0 = stackOut_252_0;
                                  stackIn_254_1 = stackOut_252_1;
                                  stackIn_254_2 = stackOut_252_2;
                                  stackIn_254_3 = stackOut_252_3;
                                  stackIn_254_4 = stackOut_252_4;
                                  stackIn_253_0 = stackOut_252_0;
                                  stackIn_253_1 = stackOut_252_1;
                                  stackIn_253_2 = stackOut_252_2;
                                  stackIn_253_3 = stackOut_252_3;
                                  stackIn_253_4 = stackOut_252_4;
                                  if (bv.field_w.field_wb) {
                                    stackOut_254_0 = stackIn_254_0;
                                    stackOut_254_1 = stackIn_254_1;
                                    stackOut_254_2 = stackIn_254_2;
                                    stackOut_254_3 = stackIn_254_3;
                                    stackOut_254_4 = (int[][]) ((Object) stackIn_254_4);
                                    stackOut_254_5 = 1;
                                    stackIn_255_0 = stackOut_254_0;
                                    stackIn_255_1 = stackOut_254_1;
                                    stackIn_255_2 = stackOut_254_2;
                                    stackIn_255_3 = stackOut_254_3;
                                    stackIn_255_4 = stackOut_254_4;
                                    stackIn_255_5 = stackOut_254_5;
                                    break L84;
                                  } else {
                                    stackOut_253_0 = stackIn_253_0;
                                    stackOut_253_1 = stackIn_253_1;
                                    stackOut_253_2 = stackIn_253_2;
                                    stackOut_253_3 = stackIn_253_3;
                                    stackOut_253_4 = (int[][]) ((Object) stackIn_253_4);
                                    stackOut_253_5 = 0;
                                    stackIn_255_0 = stackOut_253_0;
                                    stackIn_255_1 = stackOut_253_1;
                                    stackIn_255_2 = stackOut_253_2;
                                    stackIn_255_3 = stackOut_253_3;
                                    stackIn_255_4 = stackOut_253_4;
                                    stackIn_255_5 = stackOut_253_5;
                                    break L84;
                                  }
                                }
                                L85: {
                                  L86: {
                                    qn.f(stackIn_255_0, stackIn_255_1, stackIn_255_2, stackIn_255_3, stackIn_255_4[stackIn_255_5][var9.field_a]);
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      break L86;
                                    } else {
                                      var10 = var10 << 2;
                                      if (var11 == 0) {
                                        break L85;
                                      } else {
                                        break L86;
                                      }
                                    }
                                  }
                                  var10 = (var10 << -1124917309) / 3;
                                  break L85;
                                }
                                L87: {
                                  stackOut_258_0 = param0 + 19;
                                  stackOut_258_1 = 31 + param5;
                                  stackIn_260_0 = stackOut_258_0;
                                  stackIn_260_1 = stackOut_258_1;
                                  stackIn_259_0 = stackOut_258_0;
                                  stackIn_259_1 = stackOut_258_1;
                                  if (var10 > 40) {
                                    stackOut_260_0 = stackIn_260_0;
                                    stackOut_260_1 = stackIn_260_1;
                                    stackOut_260_2 = 40;
                                    stackIn_261_0 = stackOut_260_0;
                                    stackIn_261_1 = stackOut_260_1;
                                    stackIn_261_2 = stackOut_260_2;
                                    break L87;
                                  } else {
                                    stackOut_259_0 = stackIn_259_0;
                                    stackOut_259_1 = stackIn_259_1;
                                    stackOut_259_2 = var10;
                                    stackIn_261_0 = stackOut_259_0;
                                    stackIn_261_1 = stackOut_259_1;
                                    stackIn_261_2 = stackOut_259_2;
                                    break L87;
                                  }
                                }
                                L88: {
                                  stackOut_261_0 = stackIn_261_0;
                                  stackOut_261_1 = stackIn_261_1;
                                  stackOut_261_2 = stackIn_261_2;
                                  stackOut_261_3 = 4;
                                  stackOut_261_4 = op.field_c;
                                  stackIn_263_0 = stackOut_261_0;
                                  stackIn_263_1 = stackOut_261_1;
                                  stackIn_263_2 = stackOut_261_2;
                                  stackIn_263_3 = stackOut_261_3;
                                  stackIn_263_4 = stackOut_261_4;
                                  stackIn_262_0 = stackOut_261_0;
                                  stackIn_262_1 = stackOut_261_1;
                                  stackIn_262_2 = stackOut_261_2;
                                  stackIn_262_3 = stackOut_261_3;
                                  stackIn_262_4 = stackOut_261_4;
                                  if (!bv.field_w.field_wb) {
                                    stackOut_263_0 = stackIn_263_0;
                                    stackOut_263_1 = stackIn_263_1;
                                    stackOut_263_2 = stackIn_263_2;
                                    stackOut_263_3 = stackIn_263_3;
                                    stackOut_263_4 = (int[][]) ((Object) stackIn_263_4);
                                    stackOut_263_5 = 0;
                                    stackIn_264_0 = stackOut_263_0;
                                    stackIn_264_1 = stackOut_263_1;
                                    stackIn_264_2 = stackOut_263_2;
                                    stackIn_264_3 = stackOut_263_3;
                                    stackIn_264_4 = stackOut_263_4;
                                    stackIn_264_5 = stackOut_263_5;
                                    break L88;
                                  } else {
                                    stackOut_262_0 = stackIn_262_0;
                                    stackOut_262_1 = stackIn_262_1;
                                    stackOut_262_2 = stackIn_262_2;
                                    stackOut_262_3 = stackIn_262_3;
                                    stackOut_262_4 = (int[][]) ((Object) stackIn_262_4);
                                    stackOut_262_5 = 1;
                                    stackIn_264_0 = stackOut_262_0;
                                    stackIn_264_1 = stackOut_262_1;
                                    stackIn_264_2 = stackOut_262_2;
                                    stackIn_264_3 = stackOut_262_3;
                                    stackIn_264_4 = stackOut_262_4;
                                    stackIn_264_5 = stackOut_262_5;
                                    break L88;
                                  }
                                }
                                L89: {
                                  qn.f(stackIn_264_0, stackIn_264_1, stackIn_264_2, stackIn_264_3, stackIn_264_4[stackIn_264_5][bv.field_w.o(var12.field_O, -1)]);
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L89;
                                  } else {
                                    break L89;
                                  }
                                }
                                return;
                              }
                            } else {
                              L90: {
                                stackOut_235_0 = param0 - -19;
                                stackOut_235_1 = param5 + 31;
                                stackOut_235_2 = 40;
                                stackOut_235_3 = 4;
                                stackOut_235_4 = op.field_c;
                                stackIn_237_0 = stackOut_235_0;
                                stackIn_237_1 = stackOut_235_1;
                                stackIn_237_2 = stackOut_235_2;
                                stackIn_237_3 = stackOut_235_3;
                                stackIn_237_4 = stackOut_235_4;
                                stackIn_236_0 = stackOut_235_0;
                                stackIn_236_1 = stackOut_235_1;
                                stackIn_236_2 = stackOut_235_2;
                                stackIn_236_3 = stackOut_235_3;
                                stackIn_236_4 = stackOut_235_4;
                                if (bv.field_w.field_wb) {
                                  stackOut_237_0 = stackIn_237_0;
                                  stackOut_237_1 = stackIn_237_1;
                                  stackOut_237_2 = stackIn_237_2;
                                  stackOut_237_3 = stackIn_237_3;
                                  stackOut_237_4 = (int[][]) ((Object) stackIn_237_4);
                                  stackOut_237_5 = 1;
                                  stackIn_238_0 = stackOut_237_0;
                                  stackIn_238_1 = stackOut_237_1;
                                  stackIn_238_2 = stackOut_237_2;
                                  stackIn_238_3 = stackOut_237_3;
                                  stackIn_238_4 = stackOut_237_4;
                                  stackIn_238_5 = stackOut_237_5;
                                  break L90;
                                } else {
                                  stackOut_236_0 = stackIn_236_0;
                                  stackOut_236_1 = stackIn_236_1;
                                  stackOut_236_2 = stackIn_236_2;
                                  stackOut_236_3 = stackIn_236_3;
                                  stackOut_236_4 = (int[][]) ((Object) stackIn_236_4);
                                  stackOut_236_5 = 0;
                                  stackIn_238_0 = stackOut_236_0;
                                  stackIn_238_1 = stackOut_236_1;
                                  stackIn_238_2 = stackOut_236_2;
                                  stackIn_238_3 = stackOut_236_3;
                                  stackIn_238_4 = stackOut_236_4;
                                  stackIn_238_5 = stackOut_236_5;
                                  break L90;
                                }
                              }
                              L91: {
                                L92: {
                                  qn.f(stackIn_238_0, stackIn_238_1, stackIn_238_2, stackIn_238_3, stackIn_238_4[stackIn_238_5][var9.field_a]);
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    break L92;
                                  } else {
                                    var10 = var10 << 2;
                                    if (var11 == 0) {
                                      break L91;
                                    } else {
                                      break L92;
                                    }
                                  }
                                }
                                var10 = (var10 << -1124917309) / 3;
                                break L91;
                              }
                              L93: {
                                stackOut_241_0 = param0 + 19;
                                stackOut_241_1 = 31 + param5;
                                stackIn_243_0 = stackOut_241_0;
                                stackIn_243_1 = stackOut_241_1;
                                stackIn_242_0 = stackOut_241_0;
                                stackIn_242_1 = stackOut_241_1;
                                if (var10 > 40) {
                                  stackOut_243_0 = stackIn_243_0;
                                  stackOut_243_1 = stackIn_243_1;
                                  stackOut_243_2 = 40;
                                  stackIn_244_0 = stackOut_243_0;
                                  stackIn_244_1 = stackOut_243_1;
                                  stackIn_244_2 = stackOut_243_2;
                                  break L93;
                                } else {
                                  stackOut_242_0 = stackIn_242_0;
                                  stackOut_242_1 = stackIn_242_1;
                                  stackOut_242_2 = var10;
                                  stackIn_244_0 = stackOut_242_0;
                                  stackIn_244_1 = stackOut_242_1;
                                  stackIn_244_2 = stackOut_242_2;
                                  break L93;
                                }
                              }
                              L94: {
                                stackOut_244_0 = stackIn_244_0;
                                stackOut_244_1 = stackIn_244_1;
                                stackOut_244_2 = stackIn_244_2;
                                stackOut_244_3 = 4;
                                stackOut_244_4 = op.field_c;
                                stackIn_246_0 = stackOut_244_0;
                                stackIn_246_1 = stackOut_244_1;
                                stackIn_246_2 = stackOut_244_2;
                                stackIn_246_3 = stackOut_244_3;
                                stackIn_246_4 = stackOut_244_4;
                                stackIn_245_0 = stackOut_244_0;
                                stackIn_245_1 = stackOut_244_1;
                                stackIn_245_2 = stackOut_244_2;
                                stackIn_245_3 = stackOut_244_3;
                                stackIn_245_4 = stackOut_244_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_246_0 = stackIn_246_0;
                                  stackOut_246_1 = stackIn_246_1;
                                  stackOut_246_2 = stackIn_246_2;
                                  stackOut_246_3 = stackIn_246_3;
                                  stackOut_246_4 = (int[][]) ((Object) stackIn_246_4);
                                  stackOut_246_5 = 0;
                                  stackIn_247_0 = stackOut_246_0;
                                  stackIn_247_1 = stackOut_246_1;
                                  stackIn_247_2 = stackOut_246_2;
                                  stackIn_247_3 = stackOut_246_3;
                                  stackIn_247_4 = stackOut_246_4;
                                  stackIn_247_5 = stackOut_246_5;
                                  break L94;
                                } else {
                                  stackOut_245_0 = stackIn_245_0;
                                  stackOut_245_1 = stackIn_245_1;
                                  stackOut_245_2 = stackIn_245_2;
                                  stackOut_245_3 = stackIn_245_3;
                                  stackOut_245_4 = (int[][]) ((Object) stackIn_245_4);
                                  stackOut_245_5 = 1;
                                  stackIn_247_0 = stackOut_245_0;
                                  stackIn_247_1 = stackOut_245_1;
                                  stackIn_247_2 = stackOut_245_2;
                                  stackIn_247_3 = stackOut_245_3;
                                  stackIn_247_4 = stackOut_245_4;
                                  stackIn_247_5 = stackOut_245_5;
                                  break L94;
                                }
                              }
                              L95: {
                                qn.f(stackIn_247_0, stackIn_247_1, stackIn_247_2, stackIn_247_3, stackIn_247_4[stackIn_247_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L95;
                                } else {
                                  break L95;
                                }
                              }
                              return;
                            }
                          } else {
                            L96: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L96;
                              } else {
                                break L96;
                              }
                            }
                            return;
                          }
                        } else {
                          L97: {
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L97;
                            } else {
                              break L97;
                            }
                          }
                          return;
                        }
                      } else {
                        L98: {
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L98;
                          } else {
                            break L98;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (var9.a(false)) {
                      if (!bv.field_w.c(var9.field_a, -16985, var13.field_O)) {
                        if (var13.i(-21428)) {
                          qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                          if (0 <= (var9.field_a ^ -1)) {
                            qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                            if (var11 != 0) {
                              L99: {
                                stackOut_197_0 = param0 - -19;
                                stackOut_197_1 = param5 + 31;
                                stackOut_197_2 = 40;
                                stackOut_197_3 = 4;
                                stackOut_197_4 = op.field_c;
                                stackIn_199_0 = stackOut_197_0;
                                stackIn_199_1 = stackOut_197_1;
                                stackIn_199_2 = stackOut_197_2;
                                stackIn_199_3 = stackOut_197_3;
                                stackIn_199_4 = stackOut_197_4;
                                stackIn_198_0 = stackOut_197_0;
                                stackIn_198_1 = stackOut_197_1;
                                stackIn_198_2 = stackOut_197_2;
                                stackIn_198_3 = stackOut_197_3;
                                stackIn_198_4 = stackOut_197_4;
                                if (bv.field_w.field_wb) {
                                  stackOut_199_0 = stackIn_199_0;
                                  stackOut_199_1 = stackIn_199_1;
                                  stackOut_199_2 = stackIn_199_2;
                                  stackOut_199_3 = stackIn_199_3;
                                  stackOut_199_4 = (int[][]) ((Object) stackIn_199_4);
                                  stackOut_199_5 = 1;
                                  stackIn_200_0 = stackOut_199_0;
                                  stackIn_200_1 = stackOut_199_1;
                                  stackIn_200_2 = stackOut_199_2;
                                  stackIn_200_3 = stackOut_199_3;
                                  stackIn_200_4 = stackOut_199_4;
                                  stackIn_200_5 = stackOut_199_5;
                                  break L99;
                                } else {
                                  stackOut_198_0 = stackIn_198_0;
                                  stackOut_198_1 = stackIn_198_1;
                                  stackOut_198_2 = stackIn_198_2;
                                  stackOut_198_3 = stackIn_198_3;
                                  stackOut_198_4 = (int[][]) ((Object) stackIn_198_4);
                                  stackOut_198_5 = 0;
                                  stackIn_200_0 = stackOut_198_0;
                                  stackIn_200_1 = stackOut_198_1;
                                  stackIn_200_2 = stackOut_198_2;
                                  stackIn_200_3 = stackOut_198_3;
                                  stackIn_200_4 = stackOut_198_4;
                                  stackIn_200_5 = stackOut_198_5;
                                  break L99;
                                }
                              }
                              L100: {
                                L101: {
                                  qn.f(stackIn_200_0, stackIn_200_1, stackIn_200_2, stackIn_200_3, stackIn_200_4[stackIn_200_5][var9.field_a]);
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    break L101;
                                  } else {
                                    var10 = var10 << 2;
                                    if (var11 == 0) {
                                      break L100;
                                    } else {
                                      break L101;
                                    }
                                  }
                                }
                                var10 = (var10 << -1124917309) / 3;
                                break L100;
                              }
                              L102: {
                                stackOut_203_0 = param0 + 19;
                                stackOut_203_1 = 31 + param5;
                                stackIn_205_0 = stackOut_203_0;
                                stackIn_205_1 = stackOut_203_1;
                                stackIn_204_0 = stackOut_203_0;
                                stackIn_204_1 = stackOut_203_1;
                                if (var10 > 40) {
                                  stackOut_205_0 = stackIn_205_0;
                                  stackOut_205_1 = stackIn_205_1;
                                  stackOut_205_2 = 40;
                                  stackIn_206_0 = stackOut_205_0;
                                  stackIn_206_1 = stackOut_205_1;
                                  stackIn_206_2 = stackOut_205_2;
                                  break L102;
                                } else {
                                  stackOut_204_0 = stackIn_204_0;
                                  stackOut_204_1 = stackIn_204_1;
                                  stackOut_204_2 = var10;
                                  stackIn_206_0 = stackOut_204_0;
                                  stackIn_206_1 = stackOut_204_1;
                                  stackIn_206_2 = stackOut_204_2;
                                  break L102;
                                }
                              }
                              L103: {
                                stackOut_206_0 = stackIn_206_0;
                                stackOut_206_1 = stackIn_206_1;
                                stackOut_206_2 = stackIn_206_2;
                                stackOut_206_3 = 4;
                                stackOut_206_4 = op.field_c;
                                stackIn_208_0 = stackOut_206_0;
                                stackIn_208_1 = stackOut_206_1;
                                stackIn_208_2 = stackOut_206_2;
                                stackIn_208_3 = stackOut_206_3;
                                stackIn_208_4 = stackOut_206_4;
                                stackIn_207_0 = stackOut_206_0;
                                stackIn_207_1 = stackOut_206_1;
                                stackIn_207_2 = stackOut_206_2;
                                stackIn_207_3 = stackOut_206_3;
                                stackIn_207_4 = stackOut_206_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_208_0 = stackIn_208_0;
                                  stackOut_208_1 = stackIn_208_1;
                                  stackOut_208_2 = stackIn_208_2;
                                  stackOut_208_3 = stackIn_208_3;
                                  stackOut_208_4 = (int[][]) ((Object) stackIn_208_4);
                                  stackOut_208_5 = 0;
                                  stackIn_209_0 = stackOut_208_0;
                                  stackIn_209_1 = stackOut_208_1;
                                  stackIn_209_2 = stackOut_208_2;
                                  stackIn_209_3 = stackOut_208_3;
                                  stackIn_209_4 = stackOut_208_4;
                                  stackIn_209_5 = stackOut_208_5;
                                  break L103;
                                } else {
                                  stackOut_207_0 = stackIn_207_0;
                                  stackOut_207_1 = stackIn_207_1;
                                  stackOut_207_2 = stackIn_207_2;
                                  stackOut_207_3 = stackIn_207_3;
                                  stackOut_207_4 = (int[][]) ((Object) stackIn_207_4);
                                  stackOut_207_5 = 1;
                                  stackIn_209_0 = stackOut_207_0;
                                  stackIn_209_1 = stackOut_207_1;
                                  stackIn_209_2 = stackOut_207_2;
                                  stackIn_209_3 = stackOut_207_3;
                                  stackIn_209_4 = stackOut_207_4;
                                  stackIn_209_5 = stackOut_207_5;
                                  break L103;
                                }
                              }
                              L104: {
                                qn.f(stackIn_209_0, stackIn_209_1, stackIn_209_2, stackIn_209_3, stackIn_209_4[stackIn_209_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L104;
                                } else {
                                  break L104;
                                }
                              }
                              return;
                            } else {
                              L105: {
                                L106: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    break L106;
                                  } else {
                                    var10 = var10 << 2;
                                    if (var11 == 0) {
                                      break L105;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                                var10 = (var10 << -1124917309) / 3;
                                break L105;
                              }
                              L107: {
                                stackOut_187_0 = param0 + 19;
                                stackOut_187_1 = 31 + param5;
                                stackIn_189_0 = stackOut_187_0;
                                stackIn_189_1 = stackOut_187_1;
                                stackIn_188_0 = stackOut_187_0;
                                stackIn_188_1 = stackOut_187_1;
                                if (var10 > 40) {
                                  stackOut_189_0 = stackIn_189_0;
                                  stackOut_189_1 = stackIn_189_1;
                                  stackOut_189_2 = 40;
                                  stackIn_190_0 = stackOut_189_0;
                                  stackIn_190_1 = stackOut_189_1;
                                  stackIn_190_2 = stackOut_189_2;
                                  break L107;
                                } else {
                                  stackOut_188_0 = stackIn_188_0;
                                  stackOut_188_1 = stackIn_188_1;
                                  stackOut_188_2 = var10;
                                  stackIn_190_0 = stackOut_188_0;
                                  stackIn_190_1 = stackOut_188_1;
                                  stackIn_190_2 = stackOut_188_2;
                                  break L107;
                                }
                              }
                              L108: {
                                stackOut_190_0 = stackIn_190_0;
                                stackOut_190_1 = stackIn_190_1;
                                stackOut_190_2 = stackIn_190_2;
                                stackOut_190_3 = 4;
                                stackOut_190_4 = op.field_c;
                                stackIn_192_0 = stackOut_190_0;
                                stackIn_192_1 = stackOut_190_1;
                                stackIn_192_2 = stackOut_190_2;
                                stackIn_192_3 = stackOut_190_3;
                                stackIn_192_4 = stackOut_190_4;
                                stackIn_191_0 = stackOut_190_0;
                                stackIn_191_1 = stackOut_190_1;
                                stackIn_191_2 = stackOut_190_2;
                                stackIn_191_3 = stackOut_190_3;
                                stackIn_191_4 = stackOut_190_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_192_0 = stackIn_192_0;
                                  stackOut_192_1 = stackIn_192_1;
                                  stackOut_192_2 = stackIn_192_2;
                                  stackOut_192_3 = stackIn_192_3;
                                  stackOut_192_4 = (int[][]) ((Object) stackIn_192_4);
                                  stackOut_192_5 = 0;
                                  stackIn_193_0 = stackOut_192_0;
                                  stackIn_193_1 = stackOut_192_1;
                                  stackIn_193_2 = stackOut_192_2;
                                  stackIn_193_3 = stackOut_192_3;
                                  stackIn_193_4 = stackOut_192_4;
                                  stackIn_193_5 = stackOut_192_5;
                                  break L108;
                                } else {
                                  stackOut_191_0 = stackIn_191_0;
                                  stackOut_191_1 = stackIn_191_1;
                                  stackOut_191_2 = stackIn_191_2;
                                  stackOut_191_3 = stackIn_191_3;
                                  stackOut_191_4 = (int[][]) ((Object) stackIn_191_4);
                                  stackOut_191_5 = 1;
                                  stackIn_193_0 = stackOut_191_0;
                                  stackIn_193_1 = stackOut_191_1;
                                  stackIn_193_2 = stackOut_191_2;
                                  stackIn_193_3 = stackOut_191_3;
                                  stackIn_193_4 = stackOut_191_4;
                                  stackIn_193_5 = stackOut_191_5;
                                  break L108;
                                }
                              }
                              L109: {
                                qn.f(stackIn_193_0, stackIn_193_1, stackIn_193_2, stackIn_193_3, stackIn_193_4[stackIn_193_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L109;
                                } else {
                                  break L109;
                                }
                              }
                              return;
                            }
                          } else {
                            L110: {
                              stackOut_167_0 = param0 - -19;
                              stackOut_167_1 = param5 + 31;
                              stackOut_167_2 = 40;
                              stackOut_167_3 = 4;
                              stackOut_167_4 = op.field_c;
                              stackIn_169_0 = stackOut_167_0;
                              stackIn_169_1 = stackOut_167_1;
                              stackIn_169_2 = stackOut_167_2;
                              stackIn_169_3 = stackOut_167_3;
                              stackIn_169_4 = stackOut_167_4;
                              stackIn_168_0 = stackOut_167_0;
                              stackIn_168_1 = stackOut_167_1;
                              stackIn_168_2 = stackOut_167_2;
                              stackIn_168_3 = stackOut_167_3;
                              stackIn_168_4 = stackOut_167_4;
                              if (bv.field_w.field_wb) {
                                stackOut_169_0 = stackIn_169_0;
                                stackOut_169_1 = stackIn_169_1;
                                stackOut_169_2 = stackIn_169_2;
                                stackOut_169_3 = stackIn_169_3;
                                stackOut_169_4 = (int[][]) ((Object) stackIn_169_4);
                                stackOut_169_5 = 1;
                                stackIn_170_0 = stackOut_169_0;
                                stackIn_170_1 = stackOut_169_1;
                                stackIn_170_2 = stackOut_169_2;
                                stackIn_170_3 = stackOut_169_3;
                                stackIn_170_4 = stackOut_169_4;
                                stackIn_170_5 = stackOut_169_5;
                                break L110;
                              } else {
                                stackOut_168_0 = stackIn_168_0;
                                stackOut_168_1 = stackIn_168_1;
                                stackOut_168_2 = stackIn_168_2;
                                stackOut_168_3 = stackIn_168_3;
                                stackOut_168_4 = (int[][]) ((Object) stackIn_168_4);
                                stackOut_168_5 = 0;
                                stackIn_170_0 = stackOut_168_0;
                                stackIn_170_1 = stackOut_168_1;
                                stackIn_170_2 = stackOut_168_2;
                                stackIn_170_3 = stackOut_168_3;
                                stackIn_170_4 = stackOut_168_4;
                                stackIn_170_5 = stackOut_168_5;
                                break L110;
                              }
                            }
                            L111: {
                              L112: {
                                qn.f(stackIn_170_0, stackIn_170_1, stackIn_170_2, stackIn_170_3, stackIn_170_4[stackIn_170_5][var9.field_a]);
                                var10 = var9.e(10) + -var9.field_m;
                                if (10 != var9.e(10)) {
                                  break L112;
                                } else {
                                  var10 = var10 << 2;
                                  if (var11 == 0) {
                                    break L111;
                                  } else {
                                    break L112;
                                  }
                                }
                              }
                              var10 = (var10 << -1124917309) / 3;
                              break L111;
                            }
                            L113: {
                              stackOut_173_0 = param0 + 19;
                              stackOut_173_1 = 31 + param5;
                              stackIn_175_0 = stackOut_173_0;
                              stackIn_175_1 = stackOut_173_1;
                              stackIn_174_0 = stackOut_173_0;
                              stackIn_174_1 = stackOut_173_1;
                              if (var10 > 40) {
                                stackOut_175_0 = stackIn_175_0;
                                stackOut_175_1 = stackIn_175_1;
                                stackOut_175_2 = 40;
                                stackIn_176_0 = stackOut_175_0;
                                stackIn_176_1 = stackOut_175_1;
                                stackIn_176_2 = stackOut_175_2;
                                break L113;
                              } else {
                                stackOut_174_0 = stackIn_174_0;
                                stackOut_174_1 = stackIn_174_1;
                                stackOut_174_2 = var10;
                                stackIn_176_0 = stackOut_174_0;
                                stackIn_176_1 = stackOut_174_1;
                                stackIn_176_2 = stackOut_174_2;
                                break L113;
                              }
                            }
                            L114: {
                              stackOut_176_0 = stackIn_176_0;
                              stackOut_176_1 = stackIn_176_1;
                              stackOut_176_2 = stackIn_176_2;
                              stackOut_176_3 = 4;
                              stackOut_176_4 = op.field_c;
                              stackIn_178_0 = stackOut_176_0;
                              stackIn_178_1 = stackOut_176_1;
                              stackIn_178_2 = stackOut_176_2;
                              stackIn_178_3 = stackOut_176_3;
                              stackIn_178_4 = stackOut_176_4;
                              stackIn_177_0 = stackOut_176_0;
                              stackIn_177_1 = stackOut_176_1;
                              stackIn_177_2 = stackOut_176_2;
                              stackIn_177_3 = stackOut_176_3;
                              stackIn_177_4 = stackOut_176_4;
                              if (!bv.field_w.field_wb) {
                                stackOut_178_0 = stackIn_178_0;
                                stackOut_178_1 = stackIn_178_1;
                                stackOut_178_2 = stackIn_178_2;
                                stackOut_178_3 = stackIn_178_3;
                                stackOut_178_4 = (int[][]) ((Object) stackIn_178_4);
                                stackOut_178_5 = 0;
                                stackIn_179_0 = stackOut_178_0;
                                stackIn_179_1 = stackOut_178_1;
                                stackIn_179_2 = stackOut_178_2;
                                stackIn_179_3 = stackOut_178_3;
                                stackIn_179_4 = stackOut_178_4;
                                stackIn_179_5 = stackOut_178_5;
                                break L114;
                              } else {
                                stackOut_177_0 = stackIn_177_0;
                                stackOut_177_1 = stackIn_177_1;
                                stackOut_177_2 = stackIn_177_2;
                                stackOut_177_3 = stackIn_177_3;
                                stackOut_177_4 = (int[][]) ((Object) stackIn_177_4);
                                stackOut_177_5 = 1;
                                stackIn_179_0 = stackOut_177_0;
                                stackIn_179_1 = stackOut_177_1;
                                stackIn_179_2 = stackOut_177_2;
                                stackIn_179_3 = stackOut_177_3;
                                stackIn_179_4 = stackOut_177_4;
                                stackIn_179_5 = stackOut_177_5;
                                break L114;
                              }
                            }
                            L115: {
                              qn.f(stackIn_179_0, stackIn_179_1, stackIn_179_2, stackIn_179_3, stackIn_179_4[stackIn_179_5][bv.field_w.o(var12.field_O, -1)]);
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L115;
                              } else {
                                break L115;
                              }
                            }
                            return;
                          }
                        } else {
                          L116: {
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L116;
                            } else {
                              break L116;
                            }
                          }
                          return;
                        }
                      } else {
                        L117: {
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L117;
                          } else {
                            break L117;
                          }
                        }
                        return;
                      }
                    } else {
                      L118: {
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          break L118;
                        } else {
                          break L118;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 125 % ((17 - param0) / 52);
            stackOut_0_0 = er.a(true, -108, param1, 10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("vv.A(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
        if (param0 != -62) {
            field_a = (String) null;
            return "Hi!";
        }
        return "Hi!";
    }

    static {
        field_b = new Random(6L);
        field_c = "Fire";
        field_a = "Single";
    }
}
