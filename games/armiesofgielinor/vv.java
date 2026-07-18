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
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
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
        int stackIn_3_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int[][] stackIn_35_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int[][] stackIn_36_4 = null;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int[][] stackIn_37_4 = null;
        int stackIn_37_5 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int[][] stackIn_45_4 = null;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int[][] stackIn_46_4 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int[][] stackIn_47_4 = null;
        int stackIn_47_5 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int[][] stackIn_76_4 = null;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int[][] stackIn_77_4 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        int[][] stackIn_78_4 = null;
        int stackIn_78_5 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int[][] stackIn_86_4 = null;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int[][] stackIn_87_4 = null;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int[][] stackIn_88_4 = null;
        int stackIn_88_5 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int[][] stackIn_117_4 = null;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int[][] stackIn_118_4 = null;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int[][] stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int[][] stackIn_127_4 = null;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        int[][] stackIn_128_4 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        int[][] stackIn_129_4 = null;
        int stackIn_129_5 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_153_2 = 0;
        int stackIn_153_3 = 0;
        int[][] stackIn_153_4 = null;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_154_2 = 0;
        int stackIn_154_3 = 0;
        int[][] stackIn_154_4 = null;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        int[][] stackIn_155_4 = null;
        int stackIn_155_5 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_163_2 = 0;
        int stackIn_163_3 = 0;
        int[][] stackIn_163_4 = null;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        int stackIn_164_3 = 0;
        int[][] stackIn_164_4 = null;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        int stackIn_165_3 = 0;
        int[][] stackIn_165_4 = null;
        int stackIn_165_5 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_185_2 = 0;
        int stackIn_185_3 = 0;
        int[][] stackIn_185_4 = null;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        int stackIn_186_3 = 0;
        int[][] stackIn_186_4 = null;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        int stackIn_187_3 = 0;
        int[][] stackIn_187_4 = null;
        int stackIn_187_5 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_193_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_194_2 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_195_2 = 0;
        int stackIn_195_3 = 0;
        int[][] stackIn_195_4 = null;
        int stackIn_196_0 = 0;
        int stackIn_196_1 = 0;
        int stackIn_196_2 = 0;
        int stackIn_196_3 = 0;
        int[][] stackIn_196_4 = null;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_197_2 = 0;
        int stackIn_197_3 = 0;
        int[][] stackIn_197_4 = null;
        int stackIn_197_5 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        int stackIn_221_2 = 0;
        int stackIn_221_3 = 0;
        int[][] stackIn_221_4 = null;
        int stackIn_222_0 = 0;
        int stackIn_222_1 = 0;
        int stackIn_222_2 = 0;
        int stackIn_222_3 = 0;
        int[][] stackIn_222_4 = null;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_223_2 = 0;
        int stackIn_223_3 = 0;
        int[][] stackIn_223_4 = null;
        int stackIn_223_5 = 0;
        int stackIn_228_0 = 0;
        int stackIn_228_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_230_0 = 0;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        int stackIn_231_0 = 0;
        int stackIn_231_1 = 0;
        int stackIn_231_2 = 0;
        int stackIn_231_3 = 0;
        int[][] stackIn_231_4 = null;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_232_2 = 0;
        int stackIn_232_3 = 0;
        int[][] stackIn_232_4 = null;
        int stackIn_233_0 = 0;
        int stackIn_233_1 = 0;
        int stackIn_233_2 = 0;
        int stackIn_233_3 = 0;
        int[][] stackIn_233_4 = null;
        int stackIn_233_5 = 0;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_260_2 = 0;
        int stackIn_260_3 = 0;
        int[][] stackIn_260_4 = null;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_261_2 = 0;
        int stackIn_261_3 = 0;
        int[][] stackIn_261_4 = null;
        int stackIn_262_0 = 0;
        int stackIn_262_1 = 0;
        int stackIn_262_2 = 0;
        int stackIn_262_3 = 0;
        int[][] stackIn_262_4 = null;
        int stackIn_262_5 = 0;
        int stackIn_267_0 = 0;
        int stackIn_267_1 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_269_2 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_270_2 = 0;
        int stackIn_270_3 = 0;
        int[][] stackIn_270_4 = null;
        int stackIn_271_0 = 0;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_271_3 = 0;
        int[][] stackIn_271_4 = null;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_272_2 = 0;
        int stackIn_272_3 = 0;
        int[][] stackIn_272_4 = null;
        int stackIn_272_5 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_259_1 = 0;
        int stackOut_259_2 = 0;
        int stackOut_259_3 = 0;
        int[][] stackOut_259_4 = null;
        int stackOut_261_0 = 0;
        int stackOut_261_1 = 0;
        int stackOut_261_2 = 0;
        int stackOut_261_3 = 0;
        int[][] stackOut_261_4 = null;
        int stackOut_261_5 = 0;
        int stackOut_260_0 = 0;
        int stackOut_260_1 = 0;
        int stackOut_260_2 = 0;
        int stackOut_260_3 = 0;
        int[][] stackOut_260_4 = null;
        int stackOut_260_5 = 0;
        int stackOut_266_0 = 0;
        int stackOut_266_1 = 0;
        int stackOut_268_0 = 0;
        int stackOut_268_1 = 0;
        int stackOut_268_2 = 0;
        int stackOut_267_0 = 0;
        int stackOut_267_1 = 0;
        int stackOut_267_2 = 0;
        int stackOut_269_0 = 0;
        int stackOut_269_1 = 0;
        int stackOut_269_2 = 0;
        int stackOut_269_3 = 0;
        int[][] stackOut_269_4 = null;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_271_2 = 0;
        int stackOut_271_3 = 0;
        int[][] stackOut_271_4 = null;
        int stackOut_271_5 = 0;
        int stackOut_270_0 = 0;
        int stackOut_270_1 = 0;
        int stackOut_270_2 = 0;
        int stackOut_270_3 = 0;
        int[][] stackOut_270_4 = null;
        int stackOut_270_5 = 0;
        int stackOut_220_0 = 0;
        int stackOut_220_1 = 0;
        int stackOut_220_2 = 0;
        int stackOut_220_3 = 0;
        int[][] stackOut_220_4 = null;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_222_2 = 0;
        int stackOut_222_3 = 0;
        int[][] stackOut_222_4 = null;
        int stackOut_222_5 = 0;
        int stackOut_221_0 = 0;
        int stackOut_221_1 = 0;
        int stackOut_221_2 = 0;
        int stackOut_221_3 = 0;
        int[][] stackOut_221_4 = null;
        int stackOut_221_5 = 0;
        int stackOut_227_0 = 0;
        int stackOut_227_1 = 0;
        int stackOut_229_0 = 0;
        int stackOut_229_1 = 0;
        int stackOut_229_2 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_228_2 = 0;
        int stackOut_230_0 = 0;
        int stackOut_230_1 = 0;
        int stackOut_230_2 = 0;
        int stackOut_230_3 = 0;
        int[][] stackOut_230_4 = null;
        int stackOut_232_0 = 0;
        int stackOut_232_1 = 0;
        int stackOut_232_2 = 0;
        int stackOut_232_3 = 0;
        int[][] stackOut_232_4 = null;
        int stackOut_232_5 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        int stackOut_231_2 = 0;
        int stackOut_231_3 = 0;
        int[][] stackOut_231_4 = null;
        int stackOut_231_5 = 0;
        int stackOut_184_0 = 0;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        int stackOut_184_3 = 0;
        int[][] stackOut_184_4 = null;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        int[][] stackOut_186_4 = null;
        int stackOut_186_5 = 0;
        int stackOut_185_0 = 0;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        int stackOut_185_3 = 0;
        int[][] stackOut_185_4 = null;
        int stackOut_185_5 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_193_1 = 0;
        int stackOut_193_2 = 0;
        int stackOut_192_0 = 0;
        int stackOut_192_1 = 0;
        int stackOut_192_2 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_194_2 = 0;
        int stackOut_194_3 = 0;
        int[][] stackOut_194_4 = null;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_196_2 = 0;
        int stackOut_196_3 = 0;
        int[][] stackOut_196_4 = null;
        int stackOut_196_5 = 0;
        int stackOut_195_0 = 0;
        int stackOut_195_1 = 0;
        int stackOut_195_2 = 0;
        int stackOut_195_3 = 0;
        int[][] stackOut_195_4 = null;
        int stackOut_195_5 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_152_2 = 0;
        int stackOut_152_3 = 0;
        int[][] stackOut_152_4 = null;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        int stackOut_154_3 = 0;
        int[][] stackOut_154_4 = null;
        int stackOut_154_5 = 0;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        int stackOut_153_3 = 0;
        int[][] stackOut_153_4 = null;
        int stackOut_153_5 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_161_2 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        int stackOut_162_2 = 0;
        int stackOut_162_3 = 0;
        int[][] stackOut_162_4 = null;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        int stackOut_164_3 = 0;
        int[][] stackOut_164_4 = null;
        int stackOut_164_5 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_163_2 = 0;
        int stackOut_163_3 = 0;
        int[][] stackOut_163_4 = null;
        int stackOut_163_5 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int[][] stackOut_116_4 = null;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int[][] stackOut_118_4 = null;
        int stackOut_118_5 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int[][] stackOut_117_4 = null;
        int stackOut_117_5 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int[][] stackOut_126_4 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int[][] stackOut_128_4 = null;
        int stackOut_128_5 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        int[][] stackOut_127_4 = null;
        int stackOut_127_5 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        int[][] stackOut_75_4 = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int[][] stackOut_77_4 = null;
        int stackOut_77_5 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int[][] stackOut_76_4 = null;
        int stackOut_76_5 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int[][] stackOut_85_4 = null;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int[][] stackOut_87_4 = null;
        int stackOut_87_5 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int[][] stackOut_86_4 = null;
        int stackOut_86_5 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int[][] stackOut_34_4 = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int[][] stackOut_36_4 = null;
        int stackOut_36_5 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int[][] stackOut_35_4 = null;
        int stackOut_35_5 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int[][] stackOut_44_4 = null;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int[][] stackOut_46_4 = null;
        int stackOut_46_5 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int[][] stackOut_45_4 = null;
        int stackOut_45_5 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var12 = vs.field_e[param3].field_c;
          if (var12 == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
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
                                  stackOut_259_0 = param0 - -19;
                                  stackOut_259_1 = param5 + 31;
                                  stackOut_259_2 = 40;
                                  stackOut_259_3 = 4;
                                  stackOut_259_4 = op.field_c;
                                  stackIn_261_0 = stackOut_259_0;
                                  stackIn_261_1 = stackOut_259_1;
                                  stackIn_261_2 = stackOut_259_2;
                                  stackIn_261_3 = stackOut_259_3;
                                  stackIn_261_4 = stackOut_259_4;
                                  stackIn_260_0 = stackOut_259_0;
                                  stackIn_260_1 = stackOut_259_1;
                                  stackIn_260_2 = stackOut_259_2;
                                  stackIn_260_3 = stackOut_259_3;
                                  stackIn_260_4 = stackOut_259_4;
                                  if (bv.field_w.field_wb) {
                                    stackOut_261_0 = stackIn_261_0;
                                    stackOut_261_1 = stackIn_261_1;
                                    stackOut_261_2 = stackIn_261_2;
                                    stackOut_261_3 = stackIn_261_3;
                                    stackOut_261_4 = (int[][]) (Object) stackIn_261_4;
                                    stackOut_261_5 = 1;
                                    stackIn_262_0 = stackOut_261_0;
                                    stackIn_262_1 = stackOut_261_1;
                                    stackIn_262_2 = stackOut_261_2;
                                    stackIn_262_3 = stackOut_261_3;
                                    stackIn_262_4 = stackOut_261_4;
                                    stackIn_262_5 = stackOut_261_5;
                                    break L6;
                                  } else {
                                    stackOut_260_0 = stackIn_260_0;
                                    stackOut_260_1 = stackIn_260_1;
                                    stackOut_260_2 = stackIn_260_2;
                                    stackOut_260_3 = stackIn_260_3;
                                    stackOut_260_4 = (int[][]) (Object) stackIn_260_4;
                                    stackOut_260_5 = 0;
                                    stackIn_262_0 = stackOut_260_0;
                                    stackIn_262_1 = stackOut_260_1;
                                    stackIn_262_2 = stackOut_260_2;
                                    stackIn_262_3 = stackOut_260_3;
                                    stackIn_262_4 = stackOut_260_4;
                                    stackIn_262_5 = stackOut_260_5;
                                    break L6;
                                  }
                                }
                                qn.f(stackIn_262_0, stackIn_262_1, stackIn_262_2, stackIn_262_3, stackIn_262_4[stackIn_262_5][var9.field_a]);
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
                              stackOut_266_0 = param0 + 19;
                              stackOut_266_1 = 31 + param5;
                              stackIn_268_0 = stackOut_266_0;
                              stackIn_268_1 = stackOut_266_1;
                              stackIn_267_0 = stackOut_266_0;
                              stackIn_267_1 = stackOut_266_1;
                              if (var10 > 40) {
                                stackOut_268_0 = stackIn_268_0;
                                stackOut_268_1 = stackIn_268_1;
                                stackOut_268_2 = 40;
                                stackIn_269_0 = stackOut_268_0;
                                stackIn_269_1 = stackOut_268_1;
                                stackIn_269_2 = stackOut_268_2;
                                break L8;
                              } else {
                                stackOut_267_0 = stackIn_267_0;
                                stackOut_267_1 = stackIn_267_1;
                                stackOut_267_2 = var10;
                                stackIn_269_0 = stackOut_267_0;
                                stackIn_269_1 = stackOut_267_1;
                                stackIn_269_2 = stackOut_267_2;
                                break L8;
                              }
                            }
                            L9: {
                              stackOut_269_0 = stackIn_269_0;
                              stackOut_269_1 = stackIn_269_1;
                              stackOut_269_2 = stackIn_269_2;
                              stackOut_269_3 = 4;
                              stackOut_269_4 = op.field_c;
                              stackIn_271_0 = stackOut_269_0;
                              stackIn_271_1 = stackOut_269_1;
                              stackIn_271_2 = stackOut_269_2;
                              stackIn_271_3 = stackOut_269_3;
                              stackIn_271_4 = stackOut_269_4;
                              stackIn_270_0 = stackOut_269_0;
                              stackIn_270_1 = stackOut_269_1;
                              stackIn_270_2 = stackOut_269_2;
                              stackIn_270_3 = stackOut_269_3;
                              stackIn_270_4 = stackOut_269_4;
                              if (!bv.field_w.field_wb) {
                                stackOut_271_0 = stackIn_271_0;
                                stackOut_271_1 = stackIn_271_1;
                                stackOut_271_2 = stackIn_271_2;
                                stackOut_271_3 = stackIn_271_3;
                                stackOut_271_4 = (int[][]) (Object) stackIn_271_4;
                                stackOut_271_5 = 0;
                                stackIn_272_0 = stackOut_271_0;
                                stackIn_272_1 = stackOut_271_1;
                                stackIn_272_2 = stackOut_271_2;
                                stackIn_272_3 = stackOut_271_3;
                                stackIn_272_4 = stackOut_271_4;
                                stackIn_272_5 = stackOut_271_5;
                                break L9;
                              } else {
                                stackOut_270_0 = stackIn_270_0;
                                stackOut_270_1 = stackIn_270_1;
                                stackOut_270_2 = stackIn_270_2;
                                stackOut_270_3 = stackIn_270_3;
                                stackOut_270_4 = (int[][]) (Object) stackIn_270_4;
                                stackOut_270_5 = 1;
                                stackIn_272_0 = stackOut_270_0;
                                stackIn_272_1 = stackOut_270_1;
                                stackIn_272_2 = stackOut_270_2;
                                stackIn_272_3 = stackOut_270_3;
                                stackIn_272_4 = stackOut_270_4;
                                stackIn_272_5 = stackOut_270_5;
                                break L9;
                              }
                            }
                            qn.f(stackIn_272_0, stackIn_272_1, stackIn_272_2, stackIn_272_3, stackIn_272_4[stackIn_272_5][bv.field_w.o(var12.field_O, -1)]);
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
                                  stackOut_220_0 = param0 - -19;
                                  stackOut_220_1 = param5 + 31;
                                  stackOut_220_2 = 40;
                                  stackOut_220_3 = 4;
                                  stackOut_220_4 = op.field_c;
                                  stackIn_222_0 = stackOut_220_0;
                                  stackIn_222_1 = stackOut_220_1;
                                  stackIn_222_2 = stackOut_220_2;
                                  stackIn_222_3 = stackOut_220_3;
                                  stackIn_222_4 = stackOut_220_4;
                                  stackIn_221_0 = stackOut_220_0;
                                  stackIn_221_1 = stackOut_220_1;
                                  stackIn_221_2 = stackOut_220_2;
                                  stackIn_221_3 = stackOut_220_3;
                                  stackIn_221_4 = stackOut_220_4;
                                  if (bv.field_w.field_wb) {
                                    stackOut_222_0 = stackIn_222_0;
                                    stackOut_222_1 = stackIn_222_1;
                                    stackOut_222_2 = stackIn_222_2;
                                    stackOut_222_3 = stackIn_222_3;
                                    stackOut_222_4 = (int[][]) (Object) stackIn_222_4;
                                    stackOut_222_5 = 1;
                                    stackIn_223_0 = stackOut_222_0;
                                    stackIn_223_1 = stackOut_222_1;
                                    stackIn_223_2 = stackOut_222_2;
                                    stackIn_223_3 = stackOut_222_3;
                                    stackIn_223_4 = stackOut_222_4;
                                    stackIn_223_5 = stackOut_222_5;
                                    break L13;
                                  } else {
                                    stackOut_221_0 = stackIn_221_0;
                                    stackOut_221_1 = stackIn_221_1;
                                    stackOut_221_2 = stackIn_221_2;
                                    stackOut_221_3 = stackIn_221_3;
                                    stackOut_221_4 = (int[][]) (Object) stackIn_221_4;
                                    stackOut_221_5 = 0;
                                    stackIn_223_0 = stackOut_221_0;
                                    stackIn_223_1 = stackOut_221_1;
                                    stackIn_223_2 = stackOut_221_2;
                                    stackIn_223_3 = stackOut_221_3;
                                    stackIn_223_4 = stackOut_221_4;
                                    stackIn_223_5 = stackOut_221_5;
                                    break L13;
                                  }
                                }
                                qn.f(stackIn_223_0, stackIn_223_1, stackIn_223_2, stackIn_223_3, stackIn_223_4[stackIn_223_5][var9.field_a]);
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
                              stackOut_227_0 = param0 + 19;
                              stackOut_227_1 = 31 + param5;
                              stackIn_229_0 = stackOut_227_0;
                              stackIn_229_1 = stackOut_227_1;
                              stackIn_228_0 = stackOut_227_0;
                              stackIn_228_1 = stackOut_227_1;
                              if (var10 > 40) {
                                stackOut_229_0 = stackIn_229_0;
                                stackOut_229_1 = stackIn_229_1;
                                stackOut_229_2 = 40;
                                stackIn_230_0 = stackOut_229_0;
                                stackIn_230_1 = stackOut_229_1;
                                stackIn_230_2 = stackOut_229_2;
                                break L15;
                              } else {
                                stackOut_228_0 = stackIn_228_0;
                                stackOut_228_1 = stackIn_228_1;
                                stackOut_228_2 = var10;
                                stackIn_230_0 = stackOut_228_0;
                                stackIn_230_1 = stackOut_228_1;
                                stackIn_230_2 = stackOut_228_2;
                                break L15;
                              }
                            }
                            L16: {
                              stackOut_230_0 = stackIn_230_0;
                              stackOut_230_1 = stackIn_230_1;
                              stackOut_230_2 = stackIn_230_2;
                              stackOut_230_3 = 4;
                              stackOut_230_4 = op.field_c;
                              stackIn_232_0 = stackOut_230_0;
                              stackIn_232_1 = stackOut_230_1;
                              stackIn_232_2 = stackOut_230_2;
                              stackIn_232_3 = stackOut_230_3;
                              stackIn_232_4 = stackOut_230_4;
                              stackIn_231_0 = stackOut_230_0;
                              stackIn_231_1 = stackOut_230_1;
                              stackIn_231_2 = stackOut_230_2;
                              stackIn_231_3 = stackOut_230_3;
                              stackIn_231_4 = stackOut_230_4;
                              if (!bv.field_w.field_wb) {
                                stackOut_232_0 = stackIn_232_0;
                                stackOut_232_1 = stackIn_232_1;
                                stackOut_232_2 = stackIn_232_2;
                                stackOut_232_3 = stackIn_232_3;
                                stackOut_232_4 = (int[][]) (Object) stackIn_232_4;
                                stackOut_232_5 = 0;
                                stackIn_233_0 = stackOut_232_0;
                                stackIn_233_1 = stackOut_232_1;
                                stackIn_233_2 = stackOut_232_2;
                                stackIn_233_3 = stackOut_232_3;
                                stackIn_233_4 = stackOut_232_4;
                                stackIn_233_5 = stackOut_232_5;
                                break L16;
                              } else {
                                stackOut_231_0 = stackIn_231_0;
                                stackOut_231_1 = stackIn_231_1;
                                stackOut_231_2 = stackIn_231_2;
                                stackOut_231_3 = stackIn_231_3;
                                stackOut_231_4 = (int[][]) (Object) stackIn_231_4;
                                stackOut_231_5 = 1;
                                stackIn_233_0 = stackOut_231_0;
                                stackIn_233_1 = stackOut_231_1;
                                stackIn_233_2 = stackOut_231_2;
                                stackIn_233_3 = stackOut_231_3;
                                stackIn_233_4 = stackOut_231_4;
                                stackIn_233_5 = stackOut_231_5;
                                break L16;
                              }
                            }
                            L17: {
                              qn.f(stackIn_233_0, stackIn_233_1, stackIn_233_2, stackIn_233_3, stackIn_233_4[stackIn_233_5][bv.field_w.o(var12.field_O, -1)]);
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
                                stackOut_184_0 = param0 - -19;
                                stackOut_184_1 = param5 + 31;
                                stackOut_184_2 = 40;
                                stackOut_184_3 = 4;
                                stackOut_184_4 = op.field_c;
                                stackIn_186_0 = stackOut_184_0;
                                stackIn_186_1 = stackOut_184_1;
                                stackIn_186_2 = stackOut_184_2;
                                stackIn_186_3 = stackOut_184_3;
                                stackIn_186_4 = stackOut_184_4;
                                stackIn_185_0 = stackOut_184_0;
                                stackIn_185_1 = stackOut_184_1;
                                stackIn_185_2 = stackOut_184_2;
                                stackIn_185_3 = stackOut_184_3;
                                stackIn_185_4 = stackOut_184_4;
                                if (bv.field_w.field_wb) {
                                  stackOut_186_0 = stackIn_186_0;
                                  stackOut_186_1 = stackIn_186_1;
                                  stackOut_186_2 = stackIn_186_2;
                                  stackOut_186_3 = stackIn_186_3;
                                  stackOut_186_4 = (int[][]) (Object) stackIn_186_4;
                                  stackOut_186_5 = 1;
                                  stackIn_187_0 = stackOut_186_0;
                                  stackIn_187_1 = stackOut_186_1;
                                  stackIn_187_2 = stackOut_186_2;
                                  stackIn_187_3 = stackOut_186_3;
                                  stackIn_187_4 = stackOut_186_4;
                                  stackIn_187_5 = stackOut_186_5;
                                  break L22;
                                } else {
                                  stackOut_185_0 = stackIn_185_0;
                                  stackOut_185_1 = stackIn_185_1;
                                  stackOut_185_2 = stackIn_185_2;
                                  stackOut_185_3 = stackIn_185_3;
                                  stackOut_185_4 = (int[][]) (Object) stackIn_185_4;
                                  stackOut_185_5 = 0;
                                  stackIn_187_0 = stackOut_185_0;
                                  stackIn_187_1 = stackOut_185_1;
                                  stackIn_187_2 = stackOut_185_2;
                                  stackIn_187_3 = stackOut_185_3;
                                  stackIn_187_4 = stackOut_185_4;
                                  stackIn_187_5 = stackOut_185_5;
                                  break L22;
                                }
                              }
                              qn.f(stackIn_187_0, stackIn_187_1, stackIn_187_2, stackIn_187_3, stackIn_187_4[stackIn_187_5][var9.field_a]);
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
                            stackOut_191_0 = param0 + 19;
                            stackOut_191_1 = 31 + param5;
                            stackIn_193_0 = stackOut_191_0;
                            stackIn_193_1 = stackOut_191_1;
                            stackIn_192_0 = stackOut_191_0;
                            stackIn_192_1 = stackOut_191_1;
                            if (var10 > 40) {
                              stackOut_193_0 = stackIn_193_0;
                              stackOut_193_1 = stackIn_193_1;
                              stackOut_193_2 = 40;
                              stackIn_194_0 = stackOut_193_0;
                              stackIn_194_1 = stackOut_193_1;
                              stackIn_194_2 = stackOut_193_2;
                              break L24;
                            } else {
                              stackOut_192_0 = stackIn_192_0;
                              stackOut_192_1 = stackIn_192_1;
                              stackOut_192_2 = var10;
                              stackIn_194_0 = stackOut_192_0;
                              stackIn_194_1 = stackOut_192_1;
                              stackIn_194_2 = stackOut_192_2;
                              break L24;
                            }
                          }
                          L25: {
                            stackOut_194_0 = stackIn_194_0;
                            stackOut_194_1 = stackIn_194_1;
                            stackOut_194_2 = stackIn_194_2;
                            stackOut_194_3 = 4;
                            stackOut_194_4 = op.field_c;
                            stackIn_196_0 = stackOut_194_0;
                            stackIn_196_1 = stackOut_194_1;
                            stackIn_196_2 = stackOut_194_2;
                            stackIn_196_3 = stackOut_194_3;
                            stackIn_196_4 = stackOut_194_4;
                            stackIn_195_0 = stackOut_194_0;
                            stackIn_195_1 = stackOut_194_1;
                            stackIn_195_2 = stackOut_194_2;
                            stackIn_195_3 = stackOut_194_3;
                            stackIn_195_4 = stackOut_194_4;
                            if (!bv.field_w.field_wb) {
                              stackOut_196_0 = stackIn_196_0;
                              stackOut_196_1 = stackIn_196_1;
                              stackOut_196_2 = stackIn_196_2;
                              stackOut_196_3 = stackIn_196_3;
                              stackOut_196_4 = (int[][]) (Object) stackIn_196_4;
                              stackOut_196_5 = 0;
                              stackIn_197_0 = stackOut_196_0;
                              stackIn_197_1 = stackOut_196_1;
                              stackIn_197_2 = stackOut_196_2;
                              stackIn_197_3 = stackOut_196_3;
                              stackIn_197_4 = stackOut_196_4;
                              stackIn_197_5 = stackOut_196_5;
                              break L25;
                            } else {
                              stackOut_195_0 = stackIn_195_0;
                              stackOut_195_1 = stackIn_195_1;
                              stackOut_195_2 = stackIn_195_2;
                              stackOut_195_3 = stackIn_195_3;
                              stackOut_195_4 = (int[][]) (Object) stackIn_195_4;
                              stackOut_195_5 = 1;
                              stackIn_197_0 = stackOut_195_0;
                              stackIn_197_1 = stackOut_195_1;
                              stackIn_197_2 = stackOut_195_2;
                              stackIn_197_3 = stackOut_195_3;
                              stackIn_197_4 = stackOut_195_4;
                              stackIn_197_5 = stackOut_195_5;
                              break L25;
                            }
                          }
                          L26: {
                            qn.f(stackIn_197_0, stackIn_197_1, stackIn_197_2, stackIn_197_3, stackIn_197_4[stackIn_197_5][bv.field_w.o(var12.field_O, -1)]);
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
                                stackOut_152_0 = param0 - -19;
                                stackOut_152_1 = param5 + 31;
                                stackOut_152_2 = 40;
                                stackOut_152_3 = 4;
                                stackOut_152_4 = op.field_c;
                                stackIn_154_0 = stackOut_152_0;
                                stackIn_154_1 = stackOut_152_1;
                                stackIn_154_2 = stackOut_152_2;
                                stackIn_154_3 = stackOut_152_3;
                                stackIn_154_4 = stackOut_152_4;
                                stackIn_153_0 = stackOut_152_0;
                                stackIn_153_1 = stackOut_152_1;
                                stackIn_153_2 = stackOut_152_2;
                                stackIn_153_3 = stackOut_152_3;
                                stackIn_153_4 = stackOut_152_4;
                                if (bv.field_w.field_wb) {
                                  stackOut_154_0 = stackIn_154_0;
                                  stackOut_154_1 = stackIn_154_1;
                                  stackOut_154_2 = stackIn_154_2;
                                  stackOut_154_3 = stackIn_154_3;
                                  stackOut_154_4 = (int[][]) (Object) stackIn_154_4;
                                  stackOut_154_5 = 1;
                                  stackIn_155_0 = stackOut_154_0;
                                  stackIn_155_1 = stackOut_154_1;
                                  stackIn_155_2 = stackOut_154_2;
                                  stackIn_155_3 = stackOut_154_3;
                                  stackIn_155_4 = stackOut_154_4;
                                  stackIn_155_5 = stackOut_154_5;
                                  break L31;
                                } else {
                                  stackOut_153_0 = stackIn_153_0;
                                  stackOut_153_1 = stackIn_153_1;
                                  stackOut_153_2 = stackIn_153_2;
                                  stackOut_153_3 = stackIn_153_3;
                                  stackOut_153_4 = (int[][]) (Object) stackIn_153_4;
                                  stackOut_153_5 = 0;
                                  stackIn_155_0 = stackOut_153_0;
                                  stackIn_155_1 = stackOut_153_1;
                                  stackIn_155_2 = stackOut_153_2;
                                  stackIn_155_3 = stackOut_153_3;
                                  stackIn_155_4 = stackOut_153_4;
                                  stackIn_155_5 = stackOut_153_5;
                                  break L31;
                                }
                              }
                              qn.f(stackIn_155_0, stackIn_155_1, stackIn_155_2, stackIn_155_3, stackIn_155_4[stackIn_155_5][var9.field_a]);
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
                            stackOut_159_0 = param0 + 19;
                            stackOut_159_1 = 31 + param5;
                            stackIn_161_0 = stackOut_159_0;
                            stackIn_161_1 = stackOut_159_1;
                            stackIn_160_0 = stackOut_159_0;
                            stackIn_160_1 = stackOut_159_1;
                            if (var10 > 40) {
                              stackOut_161_0 = stackIn_161_0;
                              stackOut_161_1 = stackIn_161_1;
                              stackOut_161_2 = 40;
                              stackIn_162_0 = stackOut_161_0;
                              stackIn_162_1 = stackOut_161_1;
                              stackIn_162_2 = stackOut_161_2;
                              break L33;
                            } else {
                              stackOut_160_0 = stackIn_160_0;
                              stackOut_160_1 = stackIn_160_1;
                              stackOut_160_2 = var10;
                              stackIn_162_0 = stackOut_160_0;
                              stackIn_162_1 = stackOut_160_1;
                              stackIn_162_2 = stackOut_160_2;
                              break L33;
                            }
                          }
                          L34: {
                            stackOut_162_0 = stackIn_162_0;
                            stackOut_162_1 = stackIn_162_1;
                            stackOut_162_2 = stackIn_162_2;
                            stackOut_162_3 = 4;
                            stackOut_162_4 = op.field_c;
                            stackIn_164_0 = stackOut_162_0;
                            stackIn_164_1 = stackOut_162_1;
                            stackIn_164_2 = stackOut_162_2;
                            stackIn_164_3 = stackOut_162_3;
                            stackIn_164_4 = stackOut_162_4;
                            stackIn_163_0 = stackOut_162_0;
                            stackIn_163_1 = stackOut_162_1;
                            stackIn_163_2 = stackOut_162_2;
                            stackIn_163_3 = stackOut_162_3;
                            stackIn_163_4 = stackOut_162_4;
                            if (!bv.field_w.field_wb) {
                              stackOut_164_0 = stackIn_164_0;
                              stackOut_164_1 = stackIn_164_1;
                              stackOut_164_2 = stackIn_164_2;
                              stackOut_164_3 = stackIn_164_3;
                              stackOut_164_4 = (int[][]) (Object) stackIn_164_4;
                              stackOut_164_5 = 0;
                              stackIn_165_0 = stackOut_164_0;
                              stackIn_165_1 = stackOut_164_1;
                              stackIn_165_2 = stackOut_164_2;
                              stackIn_165_3 = stackOut_164_3;
                              stackIn_165_4 = stackOut_164_4;
                              stackIn_165_5 = stackOut_164_5;
                              break L34;
                            } else {
                              stackOut_163_0 = stackIn_163_0;
                              stackOut_163_1 = stackIn_163_1;
                              stackOut_163_2 = stackIn_163_2;
                              stackOut_163_3 = stackIn_163_3;
                              stackOut_163_4 = (int[][]) (Object) stackIn_163_4;
                              stackOut_163_5 = 1;
                              stackIn_165_0 = stackOut_163_0;
                              stackIn_165_1 = stackOut_163_1;
                              stackIn_165_2 = stackOut_163_2;
                              stackIn_165_3 = stackOut_163_3;
                              stackIn_165_4 = stackOut_163_4;
                              stackIn_165_5 = stackOut_163_5;
                              break L34;
                            }
                          }
                          qn.f(stackIn_165_0, stackIn_165_1, stackIn_165_2, stackIn_165_3, stackIn_165_4[stackIn_165_5][bv.field_w.o(var12.field_O, -1)]);
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
                                    stackOut_116_0 = param0 - -19;
                                    stackOut_116_1 = param5 + 31;
                                    stackOut_116_2 = 40;
                                    stackOut_116_3 = 4;
                                    stackOut_116_4 = op.field_c;
                                    stackIn_118_0 = stackOut_116_0;
                                    stackIn_118_1 = stackOut_116_1;
                                    stackIn_118_2 = stackOut_116_2;
                                    stackIn_118_3 = stackOut_116_3;
                                    stackIn_118_4 = stackOut_116_4;
                                    stackIn_117_0 = stackOut_116_0;
                                    stackIn_117_1 = stackOut_116_1;
                                    stackIn_117_2 = stackOut_116_2;
                                    stackIn_117_3 = stackOut_116_3;
                                    stackIn_117_4 = stackOut_116_4;
                                    if (bv.field_w.field_wb) {
                                      stackOut_118_0 = stackIn_118_0;
                                      stackOut_118_1 = stackIn_118_1;
                                      stackOut_118_2 = stackIn_118_2;
                                      stackOut_118_3 = stackIn_118_3;
                                      stackOut_118_4 = (int[][]) (Object) stackIn_118_4;
                                      stackOut_118_5 = 1;
                                      stackIn_119_0 = stackOut_118_0;
                                      stackIn_119_1 = stackOut_118_1;
                                      stackIn_119_2 = stackOut_118_2;
                                      stackIn_119_3 = stackOut_118_3;
                                      stackIn_119_4 = stackOut_118_4;
                                      stackIn_119_5 = stackOut_118_5;
                                      break L43;
                                    } else {
                                      stackOut_117_0 = stackIn_117_0;
                                      stackOut_117_1 = stackIn_117_1;
                                      stackOut_117_2 = stackIn_117_2;
                                      stackOut_117_3 = stackIn_117_3;
                                      stackOut_117_4 = (int[][]) (Object) stackIn_117_4;
                                      stackOut_117_5 = 0;
                                      stackIn_119_0 = stackOut_117_0;
                                      stackIn_119_1 = stackOut_117_1;
                                      stackIn_119_2 = stackOut_117_2;
                                      stackIn_119_3 = stackOut_117_3;
                                      stackIn_119_4 = stackOut_117_4;
                                      stackIn_119_5 = stackOut_117_5;
                                      break L43;
                                    }
                                  }
                                  qn.f(stackIn_119_0, stackIn_119_1, stackIn_119_2, stackIn_119_3, stackIn_119_4[stackIn_119_5][var9.field_a]);
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
                                stackOut_123_0 = param0 + 19;
                                stackOut_123_1 = 31 + param5;
                                stackIn_125_0 = stackOut_123_0;
                                stackIn_125_1 = stackOut_123_1;
                                stackIn_124_0 = stackOut_123_0;
                                stackIn_124_1 = stackOut_123_1;
                                if (var10 > 40) {
                                  stackOut_125_0 = stackIn_125_0;
                                  stackOut_125_1 = stackIn_125_1;
                                  stackOut_125_2 = 40;
                                  stackIn_126_0 = stackOut_125_0;
                                  stackIn_126_1 = stackOut_125_1;
                                  stackIn_126_2 = stackOut_125_2;
                                  break L45;
                                } else {
                                  stackOut_124_0 = stackIn_124_0;
                                  stackOut_124_1 = stackIn_124_1;
                                  stackOut_124_2 = var10;
                                  stackIn_126_0 = stackOut_124_0;
                                  stackIn_126_1 = stackOut_124_1;
                                  stackIn_126_2 = stackOut_124_2;
                                  break L45;
                                }
                              }
                              L46: {
                                stackOut_126_0 = stackIn_126_0;
                                stackOut_126_1 = stackIn_126_1;
                                stackOut_126_2 = stackIn_126_2;
                                stackOut_126_3 = 4;
                                stackOut_126_4 = op.field_c;
                                stackIn_128_0 = stackOut_126_0;
                                stackIn_128_1 = stackOut_126_1;
                                stackIn_128_2 = stackOut_126_2;
                                stackIn_128_3 = stackOut_126_3;
                                stackIn_128_4 = stackOut_126_4;
                                stackIn_127_0 = stackOut_126_0;
                                stackIn_127_1 = stackOut_126_1;
                                stackIn_127_2 = stackOut_126_2;
                                stackIn_127_3 = stackOut_126_3;
                                stackIn_127_4 = stackOut_126_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_128_0 = stackIn_128_0;
                                  stackOut_128_1 = stackIn_128_1;
                                  stackOut_128_2 = stackIn_128_2;
                                  stackOut_128_3 = stackIn_128_3;
                                  stackOut_128_4 = (int[][]) (Object) stackIn_128_4;
                                  stackOut_128_5 = 0;
                                  stackIn_129_0 = stackOut_128_0;
                                  stackIn_129_1 = stackOut_128_1;
                                  stackIn_129_2 = stackOut_128_2;
                                  stackIn_129_3 = stackOut_128_3;
                                  stackIn_129_4 = stackOut_128_4;
                                  stackIn_129_5 = stackOut_128_5;
                                  break L46;
                                } else {
                                  stackOut_127_0 = stackIn_127_0;
                                  stackOut_127_1 = stackIn_127_1;
                                  stackOut_127_2 = stackIn_127_2;
                                  stackOut_127_3 = stackIn_127_3;
                                  stackOut_127_4 = (int[][]) (Object) stackIn_127_4;
                                  stackOut_127_5 = 1;
                                  stackIn_129_0 = stackOut_127_0;
                                  stackIn_129_1 = stackOut_127_1;
                                  stackIn_129_2 = stackOut_127_2;
                                  stackIn_129_3 = stackOut_127_3;
                                  stackIn_129_4 = stackOut_127_4;
                                  stackIn_129_5 = stackOut_127_5;
                                  break L46;
                                }
                              }
                              qn.f(stackIn_129_0, stackIn_129_1, stackIn_129_2, stackIn_129_3, stackIn_129_4[stackIn_129_5][bv.field_w.o(var12.field_O, -1)]);
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
                                    stackOut_75_0 = param0 - -19;
                                    stackOut_75_1 = param5 + 31;
                                    stackOut_75_2 = 40;
                                    stackOut_75_3 = 4;
                                    stackOut_75_4 = op.field_c;
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_77_2 = stackOut_75_2;
                                    stackIn_77_3 = stackOut_75_3;
                                    stackIn_77_4 = stackOut_75_4;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    stackIn_76_2 = stackOut_75_2;
                                    stackIn_76_3 = stackOut_75_3;
                                    stackIn_76_4 = stackOut_75_4;
                                    if (bv.field_w.field_wb) {
                                      stackOut_77_0 = stackIn_77_0;
                                      stackOut_77_1 = stackIn_77_1;
                                      stackOut_77_2 = stackIn_77_2;
                                      stackOut_77_3 = stackIn_77_3;
                                      stackOut_77_4 = (int[][]) (Object) stackIn_77_4;
                                      stackOut_77_5 = 1;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      stackIn_78_2 = stackOut_77_2;
                                      stackIn_78_3 = stackOut_77_3;
                                      stackIn_78_4 = stackOut_77_4;
                                      stackIn_78_5 = stackOut_77_5;
                                      break L54;
                                    } else {
                                      stackOut_76_0 = stackIn_76_0;
                                      stackOut_76_1 = stackIn_76_1;
                                      stackOut_76_2 = stackIn_76_2;
                                      stackOut_76_3 = stackIn_76_3;
                                      stackOut_76_4 = (int[][]) (Object) stackIn_76_4;
                                      stackOut_76_5 = 0;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackIn_78_1 = stackOut_76_1;
                                      stackIn_78_2 = stackOut_76_2;
                                      stackIn_78_3 = stackOut_76_3;
                                      stackIn_78_4 = stackOut_76_4;
                                      stackIn_78_5 = stackOut_76_5;
                                      break L54;
                                    }
                                  }
                                  qn.f(stackIn_78_0, stackIn_78_1, stackIn_78_2, stackIn_78_3, stackIn_78_4[stackIn_78_5][var9.field_a]);
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
                                stackOut_82_0 = param0 + 19;
                                stackOut_82_1 = 31 + param5;
                                stackIn_84_0 = stackOut_82_0;
                                stackIn_84_1 = stackOut_82_1;
                                stackIn_83_0 = stackOut_82_0;
                                stackIn_83_1 = stackOut_82_1;
                                if (var10 > 40) {
                                  stackOut_84_0 = stackIn_84_0;
                                  stackOut_84_1 = stackIn_84_1;
                                  stackOut_84_2 = 40;
                                  stackIn_85_0 = stackOut_84_0;
                                  stackIn_85_1 = stackOut_84_1;
                                  stackIn_85_2 = stackOut_84_2;
                                  break L56;
                                } else {
                                  stackOut_83_0 = stackIn_83_0;
                                  stackOut_83_1 = stackIn_83_1;
                                  stackOut_83_2 = var10;
                                  stackIn_85_0 = stackOut_83_0;
                                  stackIn_85_1 = stackOut_83_1;
                                  stackIn_85_2 = stackOut_83_2;
                                  break L56;
                                }
                              }
                              L57: {
                                stackOut_85_0 = stackIn_85_0;
                                stackOut_85_1 = stackIn_85_1;
                                stackOut_85_2 = stackIn_85_2;
                                stackOut_85_3 = 4;
                                stackOut_85_4 = op.field_c;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
                                stackIn_87_2 = stackOut_85_2;
                                stackIn_87_3 = stackOut_85_3;
                                stackIn_87_4 = stackOut_85_4;
                                stackIn_86_0 = stackOut_85_0;
                                stackIn_86_1 = stackOut_85_1;
                                stackIn_86_2 = stackOut_85_2;
                                stackIn_86_3 = stackOut_85_3;
                                stackIn_86_4 = stackOut_85_4;
                                if (!bv.field_w.field_wb) {
                                  stackOut_87_0 = stackIn_87_0;
                                  stackOut_87_1 = stackIn_87_1;
                                  stackOut_87_2 = stackIn_87_2;
                                  stackOut_87_3 = stackIn_87_3;
                                  stackOut_87_4 = (int[][]) (Object) stackIn_87_4;
                                  stackOut_87_5 = 0;
                                  stackIn_88_0 = stackOut_87_0;
                                  stackIn_88_1 = stackOut_87_1;
                                  stackIn_88_2 = stackOut_87_2;
                                  stackIn_88_3 = stackOut_87_3;
                                  stackIn_88_4 = stackOut_87_4;
                                  stackIn_88_5 = stackOut_87_5;
                                  break L57;
                                } else {
                                  stackOut_86_0 = stackIn_86_0;
                                  stackOut_86_1 = stackIn_86_1;
                                  stackOut_86_2 = stackIn_86_2;
                                  stackOut_86_3 = stackIn_86_3;
                                  stackOut_86_4 = (int[][]) (Object) stackIn_86_4;
                                  stackOut_86_5 = 1;
                                  stackIn_88_0 = stackOut_86_0;
                                  stackIn_88_1 = stackOut_86_1;
                                  stackIn_88_2 = stackOut_86_2;
                                  stackIn_88_3 = stackOut_86_3;
                                  stackIn_88_4 = stackOut_86_4;
                                  stackIn_88_5 = stackOut_86_5;
                                  break L57;
                                }
                              }
                              qn.f(stackIn_88_0, stackIn_88_1, stackIn_88_2, stackIn_88_3, stackIn_88_4[stackIn_88_5][bv.field_w.o(var12.field_O, -1)]);
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
                                  stackOut_34_0 = param0 - -19;
                                  stackOut_34_1 = param5 + 31;
                                  stackOut_34_2 = 40;
                                  stackOut_34_3 = 4;
                                  stackOut_34_4 = op.field_c;
                                  stackIn_36_0 = stackOut_34_0;
                                  stackIn_36_1 = stackOut_34_1;
                                  stackIn_36_2 = stackOut_34_2;
                                  stackIn_36_3 = stackOut_34_3;
                                  stackIn_36_4 = stackOut_34_4;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  stackIn_35_2 = stackOut_34_2;
                                  stackIn_35_3 = stackOut_34_3;
                                  stackIn_35_4 = stackOut_34_4;
                                  if (bv.field_w.field_wb) {
                                    stackOut_36_0 = stackIn_36_0;
                                    stackOut_36_1 = stackIn_36_1;
                                    stackOut_36_2 = stackIn_36_2;
                                    stackOut_36_3 = stackIn_36_3;
                                    stackOut_36_4 = (int[][]) (Object) stackIn_36_4;
                                    stackOut_36_5 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    stackIn_37_2 = stackOut_36_2;
                                    stackIn_37_3 = stackOut_36_3;
                                    stackIn_37_4 = stackOut_36_4;
                                    stackIn_37_5 = stackOut_36_5;
                                    break L65;
                                  } else {
                                    stackOut_35_0 = stackIn_35_0;
                                    stackOut_35_1 = stackIn_35_1;
                                    stackOut_35_2 = stackIn_35_2;
                                    stackOut_35_3 = stackIn_35_3;
                                    stackOut_35_4 = (int[][]) (Object) stackIn_35_4;
                                    stackOut_35_5 = 0;
                                    stackIn_37_0 = stackOut_35_0;
                                    stackIn_37_1 = stackOut_35_1;
                                    stackIn_37_2 = stackOut_35_2;
                                    stackIn_37_3 = stackOut_35_3;
                                    stackIn_37_4 = stackOut_35_4;
                                    stackIn_37_5 = stackOut_35_5;
                                    break L65;
                                  }
                                }
                                qn.f(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4[stackIn_37_5][var9.field_a]);
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
                              stackOut_41_0 = param0 + 19;
                              stackOut_41_1 = 31 + param5;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              if (var10 > 40) {
                                stackOut_43_0 = stackIn_43_0;
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 40;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                stackIn_44_2 = stackOut_43_2;
                                break L67;
                              } else {
                                stackOut_42_0 = stackIn_42_0;
                                stackOut_42_1 = stackIn_42_1;
                                stackOut_42_2 = var10;
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_44_1 = stackOut_42_1;
                                stackIn_44_2 = stackOut_42_2;
                                break L67;
                              }
                            }
                            L68: {
                              stackOut_44_0 = stackIn_44_0;
                              stackOut_44_1 = stackIn_44_1;
                              stackOut_44_2 = stackIn_44_2;
                              stackOut_44_3 = 4;
                              stackOut_44_4 = op.field_c;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_46_2 = stackOut_44_2;
                              stackIn_46_3 = stackOut_44_3;
                              stackIn_46_4 = stackOut_44_4;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              stackIn_45_2 = stackOut_44_2;
                              stackIn_45_3 = stackOut_44_3;
                              stackIn_45_4 = stackOut_44_4;
                              if (!bv.field_w.field_wb) {
                                stackOut_46_0 = stackIn_46_0;
                                stackOut_46_1 = stackIn_46_1;
                                stackOut_46_2 = stackIn_46_2;
                                stackOut_46_3 = stackIn_46_3;
                                stackOut_46_4 = (int[][]) (Object) stackIn_46_4;
                                stackOut_46_5 = 0;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                stackIn_47_2 = stackOut_46_2;
                                stackIn_47_3 = stackOut_46_3;
                                stackIn_47_4 = stackOut_46_4;
                                stackIn_47_5 = stackOut_46_5;
                                break L68;
                              } else {
                                stackOut_45_0 = stackIn_45_0;
                                stackOut_45_1 = stackIn_45_1;
                                stackOut_45_2 = stackIn_45_2;
                                stackOut_45_3 = stackIn_45_3;
                                stackOut_45_4 = (int[][]) (Object) stackIn_45_4;
                                stackOut_45_5 = 1;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_47_2 = stackOut_45_2;
                                stackIn_47_3 = stackOut_45_3;
                                stackIn_47_4 = stackOut_45_4;
                                stackIn_47_5 = stackOut_45_5;
                                break L68;
                              }
                            }
                            qn.f(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4[stackIn_47_5][bv.field_w.o(var12.field_O, -1)]);
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
            stackOut_2_1 = new StringBuilder().append("vv.A(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
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
