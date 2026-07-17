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
    }

    final static void a(int param0) {
        int var1 = 0;
        if (224 <= te.field_n) {
            jf.b(256, 87);
        } else {
            var1 = te.field_n % 32;
            jf.b(32 + (te.field_n - var1), 84);
        }
    }

    final static og[] a(String param0, int param1) {
        at var2 = null;
        RuntimeException var2_ref = null;
        og[] var3 = null;
        int var4 = 0;
        og var5 = null;
        int var6 = 0;
        og[] stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        og[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        og[] stackOut_3_0 = null;
        og[] stackOut_11_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0.equals((Object) (Object) no.field_N)) {
              stackOut_3_0 = ol.field_w;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var2 = gu.a(false, param0);
              var3 = new og[var2.b(false)];
              var4 = 0;
              if (param1 > 109) {
                var5 = (og) (Object) var2.e((byte) 100);
                L1: while (true) {
                  if (var5 == null) {
                    no.field_N = param0;
                    ol.field_w = var3;
                    stackOut_11_0 = (og[]) var3;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    int incrementValue$2 = var4;
                    var4++;
                    var3[incrementValue$2] = var5;
                    var5 = (og) (Object) var2.a((byte) 123);
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (og[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("vv.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int[][] stackIn_40_4 = null;
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
        int stackIn_42_5 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int[][] stackIn_50_4 = null;
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
        int stackIn_52_5 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int[][] stackIn_81_4 = null;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int[][] stackIn_82_4 = null;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int[][] stackIn_83_4 = null;
        int stackIn_83_5 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int[][] stackIn_91_4 = null;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int[][] stackIn_92_4 = null;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int[][] stackIn_93_4 = null;
        int stackIn_93_5 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_122_3 = 0;
        int[][] stackIn_122_4 = null;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        int[][] stackIn_123_4 = null;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        int[][] stackIn_124_4 = null;
        int stackIn_124_5 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        int[][] stackIn_132_4 = null;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        int[][] stackIn_133_4 = null;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        int[][] stackIn_134_4 = null;
        int stackIn_134_5 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_158_2 = 0;
        int stackIn_158_3 = 0;
        int[][] stackIn_158_4 = null;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        int[][] stackIn_159_4 = null;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        int stackIn_160_3 = 0;
        int[][] stackIn_160_4 = null;
        int stackIn_160_5 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_167_2 = 0;
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
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        int stackIn_190_3 = 0;
        int[][] stackIn_190_4 = null;
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
        int stackIn_192_5 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_199_0 = 0;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int stackIn_200_2 = 0;
        int stackIn_200_3 = 0;
        int[][] stackIn_200_4 = null;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_201_2 = 0;
        int stackIn_201_3 = 0;
        int[][] stackIn_201_4 = null;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        int stackIn_202_2 = 0;
        int stackIn_202_3 = 0;
        int[][] stackIn_202_4 = null;
        int stackIn_202_5 = 0;
        int stackIn_226_0 = 0;
        int stackIn_226_1 = 0;
        int stackIn_226_2 = 0;
        int stackIn_226_3 = 0;
        int[][] stackIn_226_4 = null;
        int stackIn_227_0 = 0;
        int stackIn_227_1 = 0;
        int stackIn_227_2 = 0;
        int stackIn_227_3 = 0;
        int[][] stackIn_227_4 = null;
        int stackIn_228_0 = 0;
        int stackIn_228_1 = 0;
        int stackIn_228_2 = 0;
        int stackIn_228_3 = 0;
        int[][] stackIn_228_4 = null;
        int stackIn_228_5 = 0;
        int stackIn_233_0 = 0;
        int stackIn_233_1 = 0;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        int stackIn_235_0 = 0;
        int stackIn_235_1 = 0;
        int stackIn_235_2 = 0;
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
        int stackIn_265_0 = 0;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        int stackIn_265_3 = 0;
        int[][] stackIn_265_4 = null;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        int stackIn_266_3 = 0;
        int[][] stackIn_266_4 = null;
        int stackIn_267_0 = 0;
        int stackIn_267_1 = 0;
        int stackIn_267_2 = 0;
        int stackIn_267_3 = 0;
        int[][] stackIn_267_4 = null;
        int stackIn_267_5 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        int stackOut_264_3 = 0;
        int[][] stackOut_264_4 = null;
        int stackOut_266_0 = 0;
        int stackOut_266_1 = 0;
        int stackOut_266_2 = 0;
        int stackOut_266_3 = 0;
        int[][] stackOut_266_4 = null;
        int stackOut_266_5 = 0;
        int stackOut_265_0 = 0;
        int stackOut_265_1 = 0;
        int stackOut_265_2 = 0;
        int stackOut_265_3 = 0;
        int[][] stackOut_265_4 = null;
        int stackOut_265_5 = 0;
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
        int stackOut_225_0 = 0;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        int stackOut_225_3 = 0;
        int[][] stackOut_225_4 = null;
        int stackOut_227_0 = 0;
        int stackOut_227_1 = 0;
        int stackOut_227_2 = 0;
        int stackOut_227_3 = 0;
        int[][] stackOut_227_4 = null;
        int stackOut_227_5 = 0;
        int stackOut_226_0 = 0;
        int stackOut_226_1 = 0;
        int stackOut_226_2 = 0;
        int stackOut_226_3 = 0;
        int[][] stackOut_226_4 = null;
        int stackOut_226_5 = 0;
        int stackOut_232_0 = 0;
        int stackOut_232_1 = 0;
        int stackOut_234_0 = 0;
        int stackOut_234_1 = 0;
        int stackOut_234_2 = 0;
        int stackOut_233_0 = 0;
        int stackOut_233_1 = 0;
        int stackOut_233_2 = 0;
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
        int stackOut_189_0 = 0;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        int stackOut_189_3 = 0;
        int[][] stackOut_189_4 = null;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        int stackOut_191_3 = 0;
        int[][] stackOut_191_4 = null;
        int stackOut_191_5 = 0;
        int stackOut_190_0 = 0;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        int stackOut_190_3 = 0;
        int[][] stackOut_190_4 = null;
        int stackOut_190_5 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_198_0 = 0;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        int stackOut_197_0 = 0;
        int stackOut_197_1 = 0;
        int stackOut_197_2 = 0;
        int stackOut_199_0 = 0;
        int stackOut_199_1 = 0;
        int stackOut_199_2 = 0;
        int stackOut_199_3 = 0;
        int[][] stackOut_199_4 = null;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        int stackOut_201_2 = 0;
        int stackOut_201_3 = 0;
        int[][] stackOut_201_4 = null;
        int stackOut_201_5 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        int[][] stackOut_200_4 = null;
        int stackOut_200_5 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        int[][] stackOut_157_4 = null;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        int stackOut_159_3 = 0;
        int[][] stackOut_159_4 = null;
        int stackOut_159_5 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        int stackOut_158_3 = 0;
        int[][] stackOut_158_4 = null;
        int stackOut_158_5 = 0;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_166_1 = 0;
        int stackOut_166_2 = 0;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
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
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int[][] stackOut_121_4 = null;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int[][] stackOut_123_4 = null;
        int stackOut_123_5 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        int stackOut_122_3 = 0;
        int[][] stackOut_122_4 = null;
        int stackOut_122_5 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        int[][] stackOut_131_4 = null;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        int[][] stackOut_133_4 = null;
        int stackOut_133_5 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        int[][] stackOut_132_4 = null;
        int stackOut_132_5 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int[][] stackOut_80_4 = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int[][] stackOut_82_4 = null;
        int stackOut_82_5 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int[][] stackOut_81_4 = null;
        int stackOut_81_5 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int[][] stackOut_90_4 = null;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int[][] stackOut_92_4 = null;
        int stackOut_92_5 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int[][] stackOut_91_4 = null;
        int stackOut_91_5 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int[][] stackOut_39_4 = null;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int[][] stackOut_41_4 = null;
        int stackOut_41_5 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int[][] stackOut_40_4 = null;
        int stackOut_40_5 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int[][] stackOut_49_4 = null;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int[][] stackOut_51_4 = null;
        int stackOut_51_5 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int[][] stackOut_50_4 = null;
        int stackOut_50_5 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 < -72) {
          L0: {
            var12 = vs.field_e[param3].field_c;
            if (var12 == null) {
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
              if (var12.field_u) {
                return;
              } else {
                if (!var12.field_s) {
                  L2: {
                    if (var12.field_ab == 1) {
                      i.a(false, param5, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var12.c(false)) {
                      eu.a(111, param5, param0, var12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var12.u(8)) {
                      nb.a(param0, param5, (byte) -97, var12);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var12.field_x != null) {
                    if (var12.field_O == ne.field_i) {
                      if (!var12.field_s) {
                        if (jf.field_C.field_L > 0) {
                          go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          if (var9.a(false)) {
                            if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              if (var12.i(-21428)) {
                                L5: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (var9.field_a > -1) {
                                    L6: {
                                      stackOut_264_0 = param0 - -19;
                                      stackOut_264_1 = param5 + 31;
                                      stackOut_264_2 = 40;
                                      stackOut_264_3 = 4;
                                      stackOut_264_4 = op.field_c;
                                      stackIn_266_0 = stackOut_264_0;
                                      stackIn_266_1 = stackOut_264_1;
                                      stackIn_266_2 = stackOut_264_2;
                                      stackIn_266_3 = stackOut_264_3;
                                      stackIn_266_4 = stackOut_264_4;
                                      stackIn_265_0 = stackOut_264_0;
                                      stackIn_265_1 = stackOut_264_1;
                                      stackIn_265_2 = stackOut_264_2;
                                      stackIn_265_3 = stackOut_264_3;
                                      stackIn_265_4 = stackOut_264_4;
                                      if (bv.field_w.field_wb) {
                                        stackOut_266_0 = stackIn_266_0;
                                        stackOut_266_1 = stackIn_266_1;
                                        stackOut_266_2 = stackIn_266_2;
                                        stackOut_266_3 = stackIn_266_3;
                                        stackOut_266_4 = (int[][]) (Object) stackIn_266_4;
                                        stackOut_266_5 = 1;
                                        stackIn_267_0 = stackOut_266_0;
                                        stackIn_267_1 = stackOut_266_1;
                                        stackIn_267_2 = stackOut_266_2;
                                        stackIn_267_3 = stackOut_266_3;
                                        stackIn_267_4 = stackOut_266_4;
                                        stackIn_267_5 = stackOut_266_5;
                                        break L6;
                                      } else {
                                        stackOut_265_0 = stackIn_265_0;
                                        stackOut_265_1 = stackIn_265_1;
                                        stackOut_265_2 = stackIn_265_2;
                                        stackOut_265_3 = stackIn_265_3;
                                        stackOut_265_4 = (int[][]) (Object) stackIn_265_4;
                                        stackOut_265_5 = 0;
                                        stackIn_267_0 = stackOut_265_0;
                                        stackIn_267_1 = stackOut_265_1;
                                        stackIn_267_2 = stackOut_265_2;
                                        stackIn_267_3 = stackOut_265_3;
                                        stackIn_267_4 = stackOut_265_4;
                                        stackIn_267_5 = stackOut_265_5;
                                        break L6;
                                      }
                                    }
                                    qn.f(stackIn_267_0, stackIn_267_1, stackIn_267_2, stackIn_267_3, stackIn_267_4[stackIn_267_5][var9.field_a]);
                                    break L5;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L5;
                                  }
                                }
                                L7: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << 3) / 3;
                                    break L7;
                                  } else {
                                    var10 = var10 << 2;
                                    break L7;
                                  }
                                }
                                L8: {
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
                                    break L8;
                                  } else {
                                    stackOut_272_0 = stackIn_272_0;
                                    stackOut_272_1 = stackIn_272_1;
                                    stackOut_272_2 = var10;
                                    stackIn_274_0 = stackOut_272_0;
                                    stackIn_274_1 = stackOut_272_1;
                                    stackIn_274_2 = stackOut_272_2;
                                    break L8;
                                  }
                                }
                                L9: {
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
                                    stackOut_276_4 = (int[][]) (Object) stackIn_276_4;
                                    stackOut_276_5 = 0;
                                    stackIn_277_0 = stackOut_276_0;
                                    stackIn_277_1 = stackOut_276_1;
                                    stackIn_277_2 = stackOut_276_2;
                                    stackIn_277_3 = stackOut_276_3;
                                    stackIn_277_4 = stackOut_276_4;
                                    stackIn_277_5 = stackOut_276_5;
                                    break L9;
                                  } else {
                                    stackOut_275_0 = stackIn_275_0;
                                    stackOut_275_1 = stackIn_275_1;
                                    stackOut_275_2 = stackIn_275_2;
                                    stackOut_275_3 = stackIn_275_3;
                                    stackOut_275_4 = (int[][]) (Object) stackIn_275_4;
                                    stackOut_275_5 = 1;
                                    stackIn_277_0 = stackOut_275_0;
                                    stackIn_277_1 = stackOut_275_1;
                                    stackIn_277_2 = stackOut_275_2;
                                    stackIn_277_3 = stackOut_275_3;
                                    stackIn_277_4 = stackOut_275_4;
                                    stackIn_277_5 = stackOut_275_5;
                                    break L9;
                                  }
                                }
                                qn.f(stackIn_277_0, stackIn_277_1, stackIn_277_2, stackIn_277_3, stackIn_277_4[stackIn_277_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L10: {
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                return;
                              }
                            } else {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            if (param4 <= 0) {
                              return;
                            } else {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              return;
                            }
                          }
                        } else {
                          if (var9.a(false)) {
                            if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              if (!var12.i(-21428)) {
                                L11: {
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                return;
                              } else {
                                L12: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (var9.field_a > -1) {
                                    L13: {
                                      stackOut_225_0 = param0 - -19;
                                      stackOut_225_1 = param5 + 31;
                                      stackOut_225_2 = 40;
                                      stackOut_225_3 = 4;
                                      stackOut_225_4 = op.field_c;
                                      stackIn_227_0 = stackOut_225_0;
                                      stackIn_227_1 = stackOut_225_1;
                                      stackIn_227_2 = stackOut_225_2;
                                      stackIn_227_3 = stackOut_225_3;
                                      stackIn_227_4 = stackOut_225_4;
                                      stackIn_226_0 = stackOut_225_0;
                                      stackIn_226_1 = stackOut_225_1;
                                      stackIn_226_2 = stackOut_225_2;
                                      stackIn_226_3 = stackOut_225_3;
                                      stackIn_226_4 = stackOut_225_4;
                                      if (bv.field_w.field_wb) {
                                        stackOut_227_0 = stackIn_227_0;
                                        stackOut_227_1 = stackIn_227_1;
                                        stackOut_227_2 = stackIn_227_2;
                                        stackOut_227_3 = stackIn_227_3;
                                        stackOut_227_4 = (int[][]) (Object) stackIn_227_4;
                                        stackOut_227_5 = 1;
                                        stackIn_228_0 = stackOut_227_0;
                                        stackIn_228_1 = stackOut_227_1;
                                        stackIn_228_2 = stackOut_227_2;
                                        stackIn_228_3 = stackOut_227_3;
                                        stackIn_228_4 = stackOut_227_4;
                                        stackIn_228_5 = stackOut_227_5;
                                        break L13;
                                      } else {
                                        stackOut_226_0 = stackIn_226_0;
                                        stackOut_226_1 = stackIn_226_1;
                                        stackOut_226_2 = stackIn_226_2;
                                        stackOut_226_3 = stackIn_226_3;
                                        stackOut_226_4 = (int[][]) (Object) stackIn_226_4;
                                        stackOut_226_5 = 0;
                                        stackIn_228_0 = stackOut_226_0;
                                        stackIn_228_1 = stackOut_226_1;
                                        stackIn_228_2 = stackOut_226_2;
                                        stackIn_228_3 = stackOut_226_3;
                                        stackIn_228_4 = stackOut_226_4;
                                        stackIn_228_5 = stackOut_226_5;
                                        break L13;
                                      }
                                    }
                                    qn.f(stackIn_228_0, stackIn_228_1, stackIn_228_2, stackIn_228_3, stackIn_228_4[stackIn_228_5][var9.field_a]);
                                    break L12;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L12;
                                  }
                                }
                                L14: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << 3) / 3;
                                    break L14;
                                  } else {
                                    var10 = var10 << 2;
                                    break L14;
                                  }
                                }
                                L15: {
                                  stackOut_232_0 = param0 + 19;
                                  stackOut_232_1 = 31 + param5;
                                  stackIn_234_0 = stackOut_232_0;
                                  stackIn_234_1 = stackOut_232_1;
                                  stackIn_233_0 = stackOut_232_0;
                                  stackIn_233_1 = stackOut_232_1;
                                  if (var10 > 40) {
                                    stackOut_234_0 = stackIn_234_0;
                                    stackOut_234_1 = stackIn_234_1;
                                    stackOut_234_2 = 40;
                                    stackIn_235_0 = stackOut_234_0;
                                    stackIn_235_1 = stackOut_234_1;
                                    stackIn_235_2 = stackOut_234_2;
                                    break L15;
                                  } else {
                                    stackOut_233_0 = stackIn_233_0;
                                    stackOut_233_1 = stackIn_233_1;
                                    stackOut_233_2 = var10;
                                    stackIn_235_0 = stackOut_233_0;
                                    stackIn_235_1 = stackOut_233_1;
                                    stackIn_235_2 = stackOut_233_2;
                                    break L15;
                                  }
                                }
                                L16: {
                                  stackOut_235_0 = stackIn_235_0;
                                  stackOut_235_1 = stackIn_235_1;
                                  stackOut_235_2 = stackIn_235_2;
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
                                  if (!bv.field_w.field_wb) {
                                    stackOut_237_0 = stackIn_237_0;
                                    stackOut_237_1 = stackIn_237_1;
                                    stackOut_237_2 = stackIn_237_2;
                                    stackOut_237_3 = stackIn_237_3;
                                    stackOut_237_4 = (int[][]) (Object) stackIn_237_4;
                                    stackOut_237_5 = 0;
                                    stackIn_238_0 = stackOut_237_0;
                                    stackIn_238_1 = stackOut_237_1;
                                    stackIn_238_2 = stackOut_237_2;
                                    stackIn_238_3 = stackOut_237_3;
                                    stackIn_238_4 = stackOut_237_4;
                                    stackIn_238_5 = stackOut_237_5;
                                    break L16;
                                  } else {
                                    stackOut_236_0 = stackIn_236_0;
                                    stackOut_236_1 = stackIn_236_1;
                                    stackOut_236_2 = stackIn_236_2;
                                    stackOut_236_3 = stackIn_236_3;
                                    stackOut_236_4 = (int[][]) (Object) stackIn_236_4;
                                    stackOut_236_5 = 1;
                                    stackIn_238_0 = stackOut_236_0;
                                    stackIn_238_1 = stackOut_236_1;
                                    stackIn_238_2 = stackOut_236_2;
                                    stackIn_238_3 = stackOut_236_3;
                                    stackIn_238_4 = stackOut_236_4;
                                    stackIn_238_5 = stackOut_236_5;
                                    break L16;
                                  }
                                }
                                L17: {
                                  qn.f(stackIn_238_0, stackIn_238_1, stackIn_238_2, stackIn_238_3, stackIn_238_4[stackIn_238_5][bv.field_w.o(var12.field_O, -1)]);
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                return;
                              }
                            } else {
                              L18: {
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              return;
                            }
                          } else {
                            L19: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        if (var9.a(false)) {
                          if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                            if (!var12.i(-21428)) {
                              L20: {
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              return;
                            } else {
                              L21: {
                                qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                if (var9.field_a > -1) {
                                  L22: {
                                    stackOut_189_0 = param0 - -19;
                                    stackOut_189_1 = param5 + 31;
                                    stackOut_189_2 = 40;
                                    stackOut_189_3 = 4;
                                    stackOut_189_4 = op.field_c;
                                    stackIn_191_0 = stackOut_189_0;
                                    stackIn_191_1 = stackOut_189_1;
                                    stackIn_191_2 = stackOut_189_2;
                                    stackIn_191_3 = stackOut_189_3;
                                    stackIn_191_4 = stackOut_189_4;
                                    stackIn_190_0 = stackOut_189_0;
                                    stackIn_190_1 = stackOut_189_1;
                                    stackIn_190_2 = stackOut_189_2;
                                    stackIn_190_3 = stackOut_189_3;
                                    stackIn_190_4 = stackOut_189_4;
                                    if (bv.field_w.field_wb) {
                                      stackOut_191_0 = stackIn_191_0;
                                      stackOut_191_1 = stackIn_191_1;
                                      stackOut_191_2 = stackIn_191_2;
                                      stackOut_191_3 = stackIn_191_3;
                                      stackOut_191_4 = (int[][]) (Object) stackIn_191_4;
                                      stackOut_191_5 = 1;
                                      stackIn_192_0 = stackOut_191_0;
                                      stackIn_192_1 = stackOut_191_1;
                                      stackIn_192_2 = stackOut_191_2;
                                      stackIn_192_3 = stackOut_191_3;
                                      stackIn_192_4 = stackOut_191_4;
                                      stackIn_192_5 = stackOut_191_5;
                                      break L22;
                                    } else {
                                      stackOut_190_0 = stackIn_190_0;
                                      stackOut_190_1 = stackIn_190_1;
                                      stackOut_190_2 = stackIn_190_2;
                                      stackOut_190_3 = stackIn_190_3;
                                      stackOut_190_4 = (int[][]) (Object) stackIn_190_4;
                                      stackOut_190_5 = 0;
                                      stackIn_192_0 = stackOut_190_0;
                                      stackIn_192_1 = stackOut_190_1;
                                      stackIn_192_2 = stackOut_190_2;
                                      stackIn_192_3 = stackOut_190_3;
                                      stackIn_192_4 = stackOut_190_4;
                                      stackIn_192_5 = stackOut_190_5;
                                      break L22;
                                    }
                                  }
                                  qn.f(stackIn_192_0, stackIn_192_1, stackIn_192_2, stackIn_192_3, stackIn_192_4[stackIn_192_5][var9.field_a]);
                                  break L21;
                                } else {
                                  qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                  break L21;
                                }
                              }
                              L23: {
                                var10 = var9.e(10) + -var9.field_m;
                                if (10 != var9.e(10)) {
                                  var10 = (var10 << 3) / 3;
                                  break L23;
                                } else {
                                  var10 = var10 << 2;
                                  break L23;
                                }
                              }
                              L24: {
                                stackOut_196_0 = param0 + 19;
                                stackOut_196_1 = 31 + param5;
                                stackIn_198_0 = stackOut_196_0;
                                stackIn_198_1 = stackOut_196_1;
                                stackIn_197_0 = stackOut_196_0;
                                stackIn_197_1 = stackOut_196_1;
                                if (var10 > 40) {
                                  stackOut_198_0 = stackIn_198_0;
                                  stackOut_198_1 = stackIn_198_1;
                                  stackOut_198_2 = 40;
                                  stackIn_199_0 = stackOut_198_0;
                                  stackIn_199_1 = stackOut_198_1;
                                  stackIn_199_2 = stackOut_198_2;
                                  break L24;
                                } else {
                                  stackOut_197_0 = stackIn_197_0;
                                  stackOut_197_1 = stackIn_197_1;
                                  stackOut_197_2 = var10;
                                  stackIn_199_0 = stackOut_197_0;
                                  stackIn_199_1 = stackOut_197_1;
                                  stackIn_199_2 = stackOut_197_2;
                                  break L24;
                                }
                              }
                              L25: {
                                stackOut_199_0 = stackIn_199_0;
                                stackOut_199_1 = stackIn_199_1;
                                stackOut_199_2 = stackIn_199_2;
                                stackOut_199_3 = 4;
                                stackOut_199_4 = op.field_c;
                                stackIn_201_0 = stackOut_199_0;
                                stackIn_201_1 = stackOut_199_1;
                                stackIn_201_2 = stackOut_199_2;
                                stackIn_201_3 = stackOut_199_3;
                                stackIn_201_4 = stackOut_199_4;
                                stackIn_200_0 = stackOut_199_0;
                                stackIn_200_1 = stackOut_199_1;
                                stackIn_200_2 = stackOut_199_2;
                                stackIn_200_3 = stackOut_199_3;
                                stackIn_200_4 = stackOut_199_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_201_0 = stackIn_201_0;
                                  stackOut_201_1 = stackIn_201_1;
                                  stackOut_201_2 = stackIn_201_2;
                                  stackOut_201_3 = stackIn_201_3;
                                  stackOut_201_4 = (int[][]) (Object) stackIn_201_4;
                                  stackOut_201_5 = 0;
                                  stackIn_202_0 = stackOut_201_0;
                                  stackIn_202_1 = stackOut_201_1;
                                  stackIn_202_2 = stackOut_201_2;
                                  stackIn_202_3 = stackOut_201_3;
                                  stackIn_202_4 = stackOut_201_4;
                                  stackIn_202_5 = stackOut_201_5;
                                  break L25;
                                } else {
                                  stackOut_200_0 = stackIn_200_0;
                                  stackOut_200_1 = stackIn_200_1;
                                  stackOut_200_2 = stackIn_200_2;
                                  stackOut_200_3 = stackIn_200_3;
                                  stackOut_200_4 = (int[][]) (Object) stackIn_200_4;
                                  stackOut_200_5 = 1;
                                  stackIn_202_0 = stackOut_200_0;
                                  stackIn_202_1 = stackOut_200_1;
                                  stackIn_202_2 = stackOut_200_2;
                                  stackIn_202_3 = stackOut_200_3;
                                  stackIn_202_4 = stackOut_200_4;
                                  stackIn_202_5 = stackOut_200_5;
                                  break L25;
                                }
                              }
                              L26: {
                                qn.f(stackIn_202_0, stackIn_202_1, stackIn_202_2, stackIn_202_3, stackIn_202_4[stackIn_202_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              return;
                            }
                          } else {
                            L27: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            return;
                          }
                        } else {
                          L28: {
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L29: {
                        if (!var9.a(false)) {
                          break L29;
                        } else {
                          if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                            break L29;
                          } else {
                            if (var12.i(-21428)) {
                              L30: {
                                qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                if (var9.field_a > -1) {
                                  L31: {
                                    stackOut_157_0 = param0 - -19;
                                    stackOut_157_1 = param5 + 31;
                                    stackOut_157_2 = 40;
                                    stackOut_157_3 = 4;
                                    stackOut_157_4 = op.field_c;
                                    stackIn_159_0 = stackOut_157_0;
                                    stackIn_159_1 = stackOut_157_1;
                                    stackIn_159_2 = stackOut_157_2;
                                    stackIn_159_3 = stackOut_157_3;
                                    stackIn_159_4 = stackOut_157_4;
                                    stackIn_158_0 = stackOut_157_0;
                                    stackIn_158_1 = stackOut_157_1;
                                    stackIn_158_2 = stackOut_157_2;
                                    stackIn_158_3 = stackOut_157_3;
                                    stackIn_158_4 = stackOut_157_4;
                                    if (bv.field_w.field_wb) {
                                      stackOut_159_0 = stackIn_159_0;
                                      stackOut_159_1 = stackIn_159_1;
                                      stackOut_159_2 = stackIn_159_2;
                                      stackOut_159_3 = stackIn_159_3;
                                      stackOut_159_4 = (int[][]) (Object) stackIn_159_4;
                                      stackOut_159_5 = 1;
                                      stackIn_160_0 = stackOut_159_0;
                                      stackIn_160_1 = stackOut_159_1;
                                      stackIn_160_2 = stackOut_159_2;
                                      stackIn_160_3 = stackOut_159_3;
                                      stackIn_160_4 = stackOut_159_4;
                                      stackIn_160_5 = stackOut_159_5;
                                      break L31;
                                    } else {
                                      stackOut_158_0 = stackIn_158_0;
                                      stackOut_158_1 = stackIn_158_1;
                                      stackOut_158_2 = stackIn_158_2;
                                      stackOut_158_3 = stackIn_158_3;
                                      stackOut_158_4 = (int[][]) (Object) stackIn_158_4;
                                      stackOut_158_5 = 0;
                                      stackIn_160_0 = stackOut_158_0;
                                      stackIn_160_1 = stackOut_158_1;
                                      stackIn_160_2 = stackOut_158_2;
                                      stackIn_160_3 = stackOut_158_3;
                                      stackIn_160_4 = stackOut_158_4;
                                      stackIn_160_5 = stackOut_158_5;
                                      break L31;
                                    }
                                  }
                                  qn.f(stackIn_160_0, stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4[stackIn_160_5][var9.field_a]);
                                  break L30;
                                } else {
                                  qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                  break L30;
                                }
                              }
                              L32: {
                                var10 = var9.e(10) + -var9.field_m;
                                if (10 != var9.e(10)) {
                                  var10 = (var10 << 3) / 3;
                                  break L32;
                                } else {
                                  var10 = var10 << 2;
                                  break L32;
                                }
                              }
                              L33: {
                                stackOut_164_0 = param0 + 19;
                                stackOut_164_1 = 31 + param5;
                                stackIn_166_0 = stackOut_164_0;
                                stackIn_166_1 = stackOut_164_1;
                                stackIn_165_0 = stackOut_164_0;
                                stackIn_165_1 = stackOut_164_1;
                                if (var10 > 40) {
                                  stackOut_166_0 = stackIn_166_0;
                                  stackOut_166_1 = stackIn_166_1;
                                  stackOut_166_2 = 40;
                                  stackIn_167_0 = stackOut_166_0;
                                  stackIn_167_1 = stackOut_166_1;
                                  stackIn_167_2 = stackOut_166_2;
                                  break L33;
                                } else {
                                  stackOut_165_0 = stackIn_165_0;
                                  stackOut_165_1 = stackIn_165_1;
                                  stackOut_165_2 = var10;
                                  stackIn_167_0 = stackOut_165_0;
                                  stackIn_167_1 = stackOut_165_1;
                                  stackIn_167_2 = stackOut_165_2;
                                  break L33;
                                }
                              }
                              L34: {
                                stackOut_167_0 = stackIn_167_0;
                                stackOut_167_1 = stackIn_167_1;
                                stackOut_167_2 = stackIn_167_2;
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
                                if (!bv.field_w.field_wb) {
                                  stackOut_169_0 = stackIn_169_0;
                                  stackOut_169_1 = stackIn_169_1;
                                  stackOut_169_2 = stackIn_169_2;
                                  stackOut_169_3 = stackIn_169_3;
                                  stackOut_169_4 = (int[][]) (Object) stackIn_169_4;
                                  stackOut_169_5 = 0;
                                  stackIn_170_0 = stackOut_169_0;
                                  stackIn_170_1 = stackOut_169_1;
                                  stackIn_170_2 = stackOut_169_2;
                                  stackIn_170_3 = stackOut_169_3;
                                  stackIn_170_4 = stackOut_169_4;
                                  stackIn_170_5 = stackOut_169_5;
                                  break L34;
                                } else {
                                  stackOut_168_0 = stackIn_168_0;
                                  stackOut_168_1 = stackIn_168_1;
                                  stackOut_168_2 = stackIn_168_2;
                                  stackOut_168_3 = stackIn_168_3;
                                  stackOut_168_4 = (int[][]) (Object) stackIn_168_4;
                                  stackOut_168_5 = 1;
                                  stackIn_170_0 = stackOut_168_0;
                                  stackIn_170_1 = stackOut_168_1;
                                  stackIn_170_2 = stackOut_168_2;
                                  stackIn_170_3 = stackOut_168_3;
                                  stackIn_170_4 = stackOut_168_4;
                                  stackIn_170_5 = stackOut_168_5;
                                  break L34;
                                }
                              }
                              qn.f(stackIn_170_0, stackIn_170_1, stackIn_170_2, stackIn_170_3, stackIn_170_4[stackIn_170_5][bv.field_w.o(var12.field_O, -1)]);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      L35: {
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!var12.h(-13494)) {
                    if (-1 == var12.field_B) {
                      L36: {
                        of.field_Mb[2].a(param0 + 8, param5 + 12);
                        if (var12.field_ab == 1) {
                          i.a(false, param5, param0);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      L37: {
                        if (var12.c(false)) {
                          eu.a(111, param5, param0, var12);
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if (var12.u(8)) {
                          nb.a(param0, param5, (byte) -97, var12);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        if (var12.field_x != null) {
                          L40: {
                            if (var12.field_O != ne.field_i) {
                              break L40;
                            } else {
                              if (var12.field_s) {
                                break L40;
                              } else {
                                if (jf.field_C.field_L > 0) {
                                  go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          L41: {
                            if (!var9.a(false)) {
                              break L41;
                            } else {
                              if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                                break L41;
                              } else {
                                if (var12.i(-21428)) {
                                  L42: {
                                    qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                    if (var9.field_a > -1) {
                                      L43: {
                                        stackOut_121_0 = param0 - -19;
                                        stackOut_121_1 = param5 + 31;
                                        stackOut_121_2 = 40;
                                        stackOut_121_3 = 4;
                                        stackOut_121_4 = op.field_c;
                                        stackIn_123_0 = stackOut_121_0;
                                        stackIn_123_1 = stackOut_121_1;
                                        stackIn_123_2 = stackOut_121_2;
                                        stackIn_123_3 = stackOut_121_3;
                                        stackIn_123_4 = stackOut_121_4;
                                        stackIn_122_0 = stackOut_121_0;
                                        stackIn_122_1 = stackOut_121_1;
                                        stackIn_122_2 = stackOut_121_2;
                                        stackIn_122_3 = stackOut_121_3;
                                        stackIn_122_4 = stackOut_121_4;
                                        if (bv.field_w.field_wb) {
                                          stackOut_123_0 = stackIn_123_0;
                                          stackOut_123_1 = stackIn_123_1;
                                          stackOut_123_2 = stackIn_123_2;
                                          stackOut_123_3 = stackIn_123_3;
                                          stackOut_123_4 = (int[][]) (Object) stackIn_123_4;
                                          stackOut_123_5 = 1;
                                          stackIn_124_0 = stackOut_123_0;
                                          stackIn_124_1 = stackOut_123_1;
                                          stackIn_124_2 = stackOut_123_2;
                                          stackIn_124_3 = stackOut_123_3;
                                          stackIn_124_4 = stackOut_123_4;
                                          stackIn_124_5 = stackOut_123_5;
                                          break L43;
                                        } else {
                                          stackOut_122_0 = stackIn_122_0;
                                          stackOut_122_1 = stackIn_122_1;
                                          stackOut_122_2 = stackIn_122_2;
                                          stackOut_122_3 = stackIn_122_3;
                                          stackOut_122_4 = (int[][]) (Object) stackIn_122_4;
                                          stackOut_122_5 = 0;
                                          stackIn_124_0 = stackOut_122_0;
                                          stackIn_124_1 = stackOut_122_1;
                                          stackIn_124_2 = stackOut_122_2;
                                          stackIn_124_3 = stackOut_122_3;
                                          stackIn_124_4 = stackOut_122_4;
                                          stackIn_124_5 = stackOut_122_5;
                                          break L43;
                                        }
                                      }
                                      qn.f(stackIn_124_0, stackIn_124_1, stackIn_124_2, stackIn_124_3, stackIn_124_4[stackIn_124_5][var9.field_a]);
                                      break L42;
                                    } else {
                                      qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                      break L42;
                                    }
                                  }
                                  L44: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      var10 = (var10 << 3) / 3;
                                      break L44;
                                    } else {
                                      var10 = var10 << 2;
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    stackOut_128_0 = param0 + 19;
                                    stackOut_128_1 = 31 + param5;
                                    stackIn_130_0 = stackOut_128_0;
                                    stackIn_130_1 = stackOut_128_1;
                                    stackIn_129_0 = stackOut_128_0;
                                    stackIn_129_1 = stackOut_128_1;
                                    if (var10 > 40) {
                                      stackOut_130_0 = stackIn_130_0;
                                      stackOut_130_1 = stackIn_130_1;
                                      stackOut_130_2 = 40;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      stackIn_131_2 = stackOut_130_2;
                                      break L45;
                                    } else {
                                      stackOut_129_0 = stackIn_129_0;
                                      stackOut_129_1 = stackIn_129_1;
                                      stackOut_129_2 = var10;
                                      stackIn_131_0 = stackOut_129_0;
                                      stackIn_131_1 = stackOut_129_1;
                                      stackIn_131_2 = stackOut_129_2;
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    stackOut_131_0 = stackIn_131_0;
                                    stackOut_131_1 = stackIn_131_1;
                                    stackOut_131_2 = stackIn_131_2;
                                    stackOut_131_3 = 4;
                                    stackOut_131_4 = op.field_c;
                                    stackIn_133_0 = stackOut_131_0;
                                    stackIn_133_1 = stackOut_131_1;
                                    stackIn_133_2 = stackOut_131_2;
                                    stackIn_133_3 = stackOut_131_3;
                                    stackIn_133_4 = stackOut_131_4;
                                    stackIn_132_0 = stackOut_131_0;
                                    stackIn_132_1 = stackOut_131_1;
                                    stackIn_132_2 = stackOut_131_2;
                                    stackIn_132_3 = stackOut_131_3;
                                    stackIn_132_4 = stackOut_131_4;
                                    if (!bv.field_w.field_wb) {
                                      stackOut_133_0 = stackIn_133_0;
                                      stackOut_133_1 = stackIn_133_1;
                                      stackOut_133_2 = stackIn_133_2;
                                      stackOut_133_3 = stackIn_133_3;
                                      stackOut_133_4 = (int[][]) (Object) stackIn_133_4;
                                      stackOut_133_5 = 0;
                                      stackIn_134_0 = stackOut_133_0;
                                      stackIn_134_1 = stackOut_133_1;
                                      stackIn_134_2 = stackOut_133_2;
                                      stackIn_134_3 = stackOut_133_3;
                                      stackIn_134_4 = stackOut_133_4;
                                      stackIn_134_5 = stackOut_133_5;
                                      break L46;
                                    } else {
                                      stackOut_132_0 = stackIn_132_0;
                                      stackOut_132_1 = stackIn_132_1;
                                      stackOut_132_2 = stackIn_132_2;
                                      stackOut_132_3 = stackIn_132_3;
                                      stackOut_132_4 = (int[][]) (Object) stackIn_132_4;
                                      stackOut_132_5 = 1;
                                      stackIn_134_0 = stackOut_132_0;
                                      stackIn_134_1 = stackOut_132_1;
                                      stackIn_134_2 = stackOut_132_2;
                                      stackIn_134_3 = stackOut_132_3;
                                      stackIn_134_4 = stackOut_132_4;
                                      stackIn_134_5 = stackOut_132_5;
                                      break L46;
                                    }
                                  }
                                  qn.f(stackIn_134_0, stackIn_134_1, stackIn_134_2, stackIn_134_3, stackIn_134_4[stackIn_134_5][bv.field_w.o(var12.field_O, -1)]);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L39;
                          } else {
                            break L39;
                          }
                        } else {
                          break L39;
                        }
                      }
                      return;
                    } else {
                      L47: {
                        of.field_Mb[1].a(param0 - -8, param5 - -12);
                        if (-2 == var12.field_ab) {
                          i.a(false, param5, param0);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      L48: {
                        if (var12.c(false)) {
                          eu.a(111, param5, param0, var12);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (var12.u(8)) {
                          nb.a(param0, param5, (byte) -97, var12);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (var12.field_x != null) {
                          L51: {
                            if (var12.field_O != ne.field_i) {
                              break L51;
                            } else {
                              if (var12.field_s) {
                                break L51;
                              } else {
                                if (jf.field_C.field_L > 0) {
                                  go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  break L51;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                          L52: {
                            if (!var9.a(false)) {
                              break L52;
                            } else {
                              if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                                break L52;
                              } else {
                                if (var12.i(-21428)) {
                                  L53: {
                                    qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                    if (var9.field_a > -1) {
                                      L54: {
                                        stackOut_80_0 = param0 - -19;
                                        stackOut_80_1 = param5 + 31;
                                        stackOut_80_2 = 40;
                                        stackOut_80_3 = 4;
                                        stackOut_80_4 = op.field_c;
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        stackIn_82_2 = stackOut_80_2;
                                        stackIn_82_3 = stackOut_80_3;
                                        stackIn_82_4 = stackOut_80_4;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        stackIn_81_3 = stackOut_80_3;
                                        stackIn_81_4 = stackOut_80_4;
                                        if (bv.field_w.field_wb) {
                                          stackOut_82_0 = stackIn_82_0;
                                          stackOut_82_1 = stackIn_82_1;
                                          stackOut_82_2 = stackIn_82_2;
                                          stackOut_82_3 = stackIn_82_3;
                                          stackOut_82_4 = (int[][]) (Object) stackIn_82_4;
                                          stackOut_82_5 = 1;
                                          stackIn_83_0 = stackOut_82_0;
                                          stackIn_83_1 = stackOut_82_1;
                                          stackIn_83_2 = stackOut_82_2;
                                          stackIn_83_3 = stackOut_82_3;
                                          stackIn_83_4 = stackOut_82_4;
                                          stackIn_83_5 = stackOut_82_5;
                                          break L54;
                                        } else {
                                          stackOut_81_0 = stackIn_81_0;
                                          stackOut_81_1 = stackIn_81_1;
                                          stackOut_81_2 = stackIn_81_2;
                                          stackOut_81_3 = stackIn_81_3;
                                          stackOut_81_4 = (int[][]) (Object) stackIn_81_4;
                                          stackOut_81_5 = 0;
                                          stackIn_83_0 = stackOut_81_0;
                                          stackIn_83_1 = stackOut_81_1;
                                          stackIn_83_2 = stackOut_81_2;
                                          stackIn_83_3 = stackOut_81_3;
                                          stackIn_83_4 = stackOut_81_4;
                                          stackIn_83_5 = stackOut_81_5;
                                          break L54;
                                        }
                                      }
                                      qn.f(stackIn_83_0, stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4[stackIn_83_5][var9.field_a]);
                                      break L53;
                                    } else {
                                      qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      var10 = (var10 << 3) / 3;
                                      break L55;
                                    } else {
                                      var10 = var10 << 2;
                                      break L55;
                                    }
                                  }
                                  L56: {
                                    stackOut_87_0 = param0 + 19;
                                    stackOut_87_1 = 31 + param5;
                                    stackIn_89_0 = stackOut_87_0;
                                    stackIn_89_1 = stackOut_87_1;
                                    stackIn_88_0 = stackOut_87_0;
                                    stackIn_88_1 = stackOut_87_1;
                                    if (var10 > 40) {
                                      stackOut_89_0 = stackIn_89_0;
                                      stackOut_89_1 = stackIn_89_1;
                                      stackOut_89_2 = 40;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      stackIn_90_2 = stackOut_89_2;
                                      break L56;
                                    } else {
                                      stackOut_88_0 = stackIn_88_0;
                                      stackOut_88_1 = stackIn_88_1;
                                      stackOut_88_2 = var10;
                                      stackIn_90_0 = stackOut_88_0;
                                      stackIn_90_1 = stackOut_88_1;
                                      stackIn_90_2 = stackOut_88_2;
                                      break L56;
                                    }
                                  }
                                  L57: {
                                    stackOut_90_0 = stackIn_90_0;
                                    stackOut_90_1 = stackIn_90_1;
                                    stackOut_90_2 = stackIn_90_2;
                                    stackOut_90_3 = 4;
                                    stackOut_90_4 = op.field_c;
                                    stackIn_92_0 = stackOut_90_0;
                                    stackIn_92_1 = stackOut_90_1;
                                    stackIn_92_2 = stackOut_90_2;
                                    stackIn_92_3 = stackOut_90_3;
                                    stackIn_92_4 = stackOut_90_4;
                                    stackIn_91_0 = stackOut_90_0;
                                    stackIn_91_1 = stackOut_90_1;
                                    stackIn_91_2 = stackOut_90_2;
                                    stackIn_91_3 = stackOut_90_3;
                                    stackIn_91_4 = stackOut_90_4;
                                    if (!bv.field_w.field_wb) {
                                      stackOut_92_0 = stackIn_92_0;
                                      stackOut_92_1 = stackIn_92_1;
                                      stackOut_92_2 = stackIn_92_2;
                                      stackOut_92_3 = stackIn_92_3;
                                      stackOut_92_4 = (int[][]) (Object) stackIn_92_4;
                                      stackOut_92_5 = 0;
                                      stackIn_93_0 = stackOut_92_0;
                                      stackIn_93_1 = stackOut_92_1;
                                      stackIn_93_2 = stackOut_92_2;
                                      stackIn_93_3 = stackOut_92_3;
                                      stackIn_93_4 = stackOut_92_4;
                                      stackIn_93_5 = stackOut_92_5;
                                      break L57;
                                    } else {
                                      stackOut_91_0 = stackIn_91_0;
                                      stackOut_91_1 = stackIn_91_1;
                                      stackOut_91_2 = stackIn_91_2;
                                      stackOut_91_3 = stackIn_91_3;
                                      stackOut_91_4 = (int[][]) (Object) stackIn_91_4;
                                      stackOut_91_5 = 1;
                                      stackIn_93_0 = stackOut_91_0;
                                      stackIn_93_1 = stackOut_91_1;
                                      stackIn_93_2 = stackOut_91_2;
                                      stackIn_93_3 = stackOut_91_3;
                                      stackIn_93_4 = stackOut_91_4;
                                      stackIn_93_5 = stackOut_91_5;
                                      break L57;
                                    }
                                  }
                                  qn.f(stackIn_93_0, stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4[stackIn_93_5][bv.field_w.o(var12.field_O, -1)]);
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                            }
                          }
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L50;
                          } else {
                            break L50;
                          }
                        } else {
                          break L50;
                        }
                      }
                      return;
                    }
                  } else {
                    L58: {
                      if (var12.field_ab == 1) {
                        i.a(false, param5, param0);
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    L59: {
                      if (var12.c(false)) {
                        eu.a(111, param5, param0, var12);
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L60: {
                      if (var12.u(8)) {
                        nb.a(param0, param5, (byte) -97, var12);
                        break L60;
                      } else {
                        break L60;
                      }
                    }
                    L61: {
                      if (var12.field_x != null) {
                        L62: {
                          if (var12.field_O != ne.field_i) {
                            break L62;
                          } else {
                            if (var12.field_s) {
                              break L62;
                            } else {
                              if (jf.field_C.field_L > 0) {
                                go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                          }
                        }
                        L63: {
                          if (!var9.a(false)) {
                            break L63;
                          } else {
                            if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              break L63;
                            } else {
                              if (var12.i(-21428)) {
                                L64: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (var9.field_a > -1) {
                                    L65: {
                                      stackOut_39_0 = param0 - -19;
                                      stackOut_39_1 = param5 + 31;
                                      stackOut_39_2 = 40;
                                      stackOut_39_3 = 4;
                                      stackOut_39_4 = op.field_c;
                                      stackIn_41_0 = stackOut_39_0;
                                      stackIn_41_1 = stackOut_39_1;
                                      stackIn_41_2 = stackOut_39_2;
                                      stackIn_41_3 = stackOut_39_3;
                                      stackIn_41_4 = stackOut_39_4;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      stackIn_40_2 = stackOut_39_2;
                                      stackIn_40_3 = stackOut_39_3;
                                      stackIn_40_4 = stackOut_39_4;
                                      if (bv.field_w.field_wb) {
                                        stackOut_41_0 = stackIn_41_0;
                                        stackOut_41_1 = stackIn_41_1;
                                        stackOut_41_2 = stackIn_41_2;
                                        stackOut_41_3 = stackIn_41_3;
                                        stackOut_41_4 = (int[][]) (Object) stackIn_41_4;
                                        stackOut_41_5 = 1;
                                        stackIn_42_0 = stackOut_41_0;
                                        stackIn_42_1 = stackOut_41_1;
                                        stackIn_42_2 = stackOut_41_2;
                                        stackIn_42_3 = stackOut_41_3;
                                        stackIn_42_4 = stackOut_41_4;
                                        stackIn_42_5 = stackOut_41_5;
                                        break L65;
                                      } else {
                                        stackOut_40_0 = stackIn_40_0;
                                        stackOut_40_1 = stackIn_40_1;
                                        stackOut_40_2 = stackIn_40_2;
                                        stackOut_40_3 = stackIn_40_3;
                                        stackOut_40_4 = (int[][]) (Object) stackIn_40_4;
                                        stackOut_40_5 = 0;
                                        stackIn_42_0 = stackOut_40_0;
                                        stackIn_42_1 = stackOut_40_1;
                                        stackIn_42_2 = stackOut_40_2;
                                        stackIn_42_3 = stackOut_40_3;
                                        stackIn_42_4 = stackOut_40_4;
                                        stackIn_42_5 = stackOut_40_5;
                                        break L65;
                                      }
                                    }
                                    qn.f(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4[stackIn_42_5][var9.field_a]);
                                    break L64;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L64;
                                  }
                                }
                                L66: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << 3) / 3;
                                    break L66;
                                  } else {
                                    var10 = var10 << 2;
                                    break L66;
                                  }
                                }
                                L67: {
                                  stackOut_46_0 = param0 + 19;
                                  stackOut_46_1 = 31 + param5;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if (var10 > 40) {
                                    stackOut_48_0 = stackIn_48_0;
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = 40;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    break L67;
                                  } else {
                                    stackOut_47_0 = stackIn_47_0;
                                    stackOut_47_1 = stackIn_47_1;
                                    stackOut_47_2 = var10;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    stackIn_49_2 = stackOut_47_2;
                                    break L67;
                                  }
                                }
                                L68: {
                                  stackOut_49_0 = stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = stackIn_49_2;
                                  stackOut_49_3 = 4;
                                  stackOut_49_4 = op.field_c;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  stackIn_51_3 = stackOut_49_3;
                                  stackIn_51_4 = stackOut_49_4;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  stackIn_50_3 = stackOut_49_3;
                                  stackIn_50_4 = stackOut_49_4;
                                  if (!bv.field_w.field_wb) {
                                    stackOut_51_0 = stackIn_51_0;
                                    stackOut_51_1 = stackIn_51_1;
                                    stackOut_51_2 = stackIn_51_2;
                                    stackOut_51_3 = stackIn_51_3;
                                    stackOut_51_4 = (int[][]) (Object) stackIn_51_4;
                                    stackOut_51_5 = 0;
                                    stackIn_52_0 = stackOut_51_0;
                                    stackIn_52_1 = stackOut_51_1;
                                    stackIn_52_2 = stackOut_51_2;
                                    stackIn_52_3 = stackOut_51_3;
                                    stackIn_52_4 = stackOut_51_4;
                                    stackIn_52_5 = stackOut_51_5;
                                    break L68;
                                  } else {
                                    stackOut_50_0 = stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = stackIn_50_2;
                                    stackOut_50_3 = stackIn_50_3;
                                    stackOut_50_4 = (int[][]) (Object) stackIn_50_4;
                                    stackOut_50_5 = 1;
                                    stackIn_52_0 = stackOut_50_0;
                                    stackIn_52_1 = stackOut_50_1;
                                    stackIn_52_2 = stackOut_50_2;
                                    stackIn_52_3 = stackOut_50_3;
                                    stackIn_52_4 = stackOut_50_4;
                                    stackIn_52_5 = stackOut_50_5;
                                    break L68;
                                  }
                                }
                                qn.f(stackIn_52_0, stackIn_52_1, stackIn_52_2, stackIn_52_3, stackIn_52_4[stackIn_52_5][bv.field_w.o(var12.field_O, -1)]);
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          break L61;
                        } else {
                          break L61;
                        }
                      } else {
                        break L61;
                      }
                    }
                    return;
                  }
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
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vv.A(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
        if (param0 != -62) {
            field_a = null;
            return "Hi!";
        }
        return "Hi!";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random(6L);
        field_c = "Fire";
        field_a = "Single";
    }
}
