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
            this.d(-35);
            this.field_q = param0;
            return;
        }
        this.field_q = param0;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(124, param1, param2);
              this.field_q = param2.b((byte) 44, 4);
              if (param0 >= 119) {
                break L1;
              } else {
                this.d(72);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cv.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param0 instanceof ut) {
                this.field_o = (ut) ((Object) param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (-4 != (this.field_q ^ -1)) {
                  break L3;
                } else {
                  this.field_s = new bua(1, 10);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-2 == (this.field_q ^ -1)) {
                this.field_s = new bua(7, 8);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("cv.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    cv(int param0) {
        super(param0);
        this.field_n = false;
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 59, param1);
            param1.a((byte) 59, this.field_q, 4);
            int var3_int = 26 % ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cv.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(byte param0) {
        field_r = null;
        if (param0 <= 81) {
            return;
        }
        field_m = null;
    }

    final void a(gma param0, int param1, gr param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1 + 0, param2);
              if (param1 == -2159) {
                break L1;
              } else {
                this.field_s = (bua) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.c(-22);
                var5 = param0.a((byte) 55);
                if (-2097153 != (var4_int ^ -1)) {
                  break L3;
                } else {
                  if (var5 != 2097152) {
                    break L3;
                  } else {
                    this.field_q = 0;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (-4194305 != (var4_int ^ -1)) {
                  break L4;
                } else {
                  if (-4194305 == (var5 ^ -1)) {
                    this.field_q = 2;
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var4_int > var5) {
                  break L5;
                } else {
                  this.field_q = 5;
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_q = 4;
              if (var6 == 0) {
                break L2;
              } else {
                this.field_q = 2;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("cv.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final int f(byte param0) {
        int var2 = 56 / ((param0 - 15) / 45);
        return -1;
    }

    final void d(int param0) {
        fla discarded$4 = null;
        fla discarded$5 = null;
        fla discarded$6 = null;
        fla discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        w var5 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_112_0 = null;
        Object stackIn_113_0 = null;
        Object stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        Object stackIn_120_0 = null;
        Object stackIn_121_0 = null;
        Object stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        Object stackIn_126_0 = null;
        Object stackIn_127_0 = null;
        Object stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        Object stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        Object stackIn_136_0 = null;
        Object stackIn_137_0 = null;
        Object stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        Object stackIn_141_0 = null;
        Object stackIn_142_0 = null;
        Object stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        Object stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        Object stackIn_154_0 = null;
        Object stackIn_155_0 = null;
        Object stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        Object stackIn_163_0 = null;
        Object stackIn_164_0 = null;
        Object stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        Object stackIn_168_0 = null;
        Object stackIn_169_0 = null;
        Object stackIn_170_0 = null;
        int stackIn_170_1 = 0;
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
        Object stackIn_187_0 = null;
        Object stackIn_188_0 = null;
        Object stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        Object stackIn_200_0 = null;
        Object stackIn_201_0 = null;
        Object stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        Object stackIn_204_0 = null;
        Object stackIn_205_0 = null;
        Object stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        Object stackIn_212_0 = null;
        Object stackIn_213_0 = null;
        Object stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        Object stackIn_216_0 = null;
        Object stackIn_217_0 = null;
        Object stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        Object stackIn_220_0 = null;
        Object stackIn_221_0 = null;
        Object stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        Object stackOut_162_0 = null;
        Object stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        Object stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        Object stackOut_153_0 = null;
        Object stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        Object stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        Object stackOut_186_0 = null;
        Object stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        Object stackOut_187_0 = null;
        int stackOut_187_1 = 0;
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
        Object stackOut_167_0 = null;
        Object stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        Object stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        Object stackOut_119_0 = null;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        Object stackOut_144_0 = null;
        Object stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        Object stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        Object stackOut_140_0 = null;
        Object stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        Object stackOut_135_0 = null;
        Object stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        Object stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        Object stackOut_130_0 = null;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_125_0 = null;
        Object stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        Object stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_90_0 = null;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_86_0 = null;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_76_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_215_0 = null;
        Object stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        Object stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        Object stackOut_199_0 = null;
        Object stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        Object stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        Object stackOut_203_0 = null;
        Object stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        Object stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        Object stackOut_211_0 = null;
        Object stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        Object stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        Object stackOut_219_0 = null;
        Object stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        Object stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (null == this.field_s) {
            break L0;
          } else {
            this.field_s.a(param0 + 1);
            break L0;
          }
        }
        L1: {
          var5 = (w) ((Object) this.a(58).field_G);
          if (param0 == -1) {
            break L1;
          } else {
            this.field_o = (ut) null;
            break L1;
          }
        }
        if (var5 == null) {
          return;
        } else {
          var3 = this.field_o.k((byte) -97).b(4) ? 1 : 0;
          if ((this.field_n ? 1 : 0) != var3) {
            L2: {
              if (1 != this.field_q) {
                if (this.field_q == 3) {
                  if (var3 != 0) {
                    discarded$4 = var5.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
                    break L2;
                  } else {
                    L3: {
                      if ((this.field_q ^ -1) != -2) {
                        break L3;
                      } else {
                        if (!this.field_o.k((byte) -126).b((byte) 89)) {
                          break L3;
                        } else {
                          if (this.field_p != null) {
                            L4: {
                              if (this.field_q != 1) {
                                break L4;
                              } else {
                                if (this.field_o.k((byte) -87).b((byte) 72)) {
                                  break L4;
                                } else {
                                  if (this.field_p == null) {
                                    break L4;
                                  } else {
                                    this.field_p.a(91, var5);
                                    this.field_p = null;
                                    if (var4 == 0) {
                                      break L4;
                                    } else {
                                      this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            L5: {
                              stackOut_162_0 = this;
                              stackIn_164_0 = stackOut_162_0;
                              stackIn_163_0 = stackOut_162_0;
                              if (var3 == 0) {
                                stackOut_164_0 = this;
                                stackOut_164_1 = 0;
                                stackIn_165_0 = stackOut_164_0;
                                stackIn_165_1 = stackOut_164_1;
                                break L5;
                              } else {
                                stackOut_163_0 = this;
                                stackOut_163_1 = 1;
                                stackIn_165_0 = stackOut_163_0;
                                stackIn_165_1 = stackOut_163_1;
                                break L5;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_165_1 != 0;
                            return;
                          } else {
                            L6: {
                              this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              stackOut_153_0 = this;
                              stackIn_155_0 = stackOut_153_0;
                              stackIn_154_0 = stackOut_153_0;
                              if (var3 == 0) {
                                stackOut_155_0 = this;
                                stackOut_155_1 = 0;
                                stackIn_156_0 = stackOut_155_0;
                                stackIn_156_1 = stackOut_155_1;
                                break L6;
                              } else {
                                stackOut_154_0 = this;
                                stackOut_154_1 = 1;
                                stackIn_156_0 = stackOut_154_0;
                                stackIn_156_1 = stackOut_154_1;
                                break L6;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_156_1 != 0;
                            return;
                          }
                        }
                      }
                    }
                    if (this.field_q == 1) {
                      if (!this.field_o.k((byte) -87).b((byte) 72)) {
                        if (this.field_p != null) {
                          this.field_p.a(91, var5);
                          this.field_p = null;
                          if (var4 == 0) {
                            L7: {
                              stackOut_186_0 = this;
                              stackIn_188_0 = stackOut_186_0;
                              stackIn_187_0 = stackOut_186_0;
                              if (var3 == 0) {
                                stackOut_188_0 = this;
                                stackOut_188_1 = 0;
                                stackIn_189_0 = stackOut_188_0;
                                stackIn_189_1 = stackOut_188_1;
                                break L7;
                              } else {
                                stackOut_187_0 = this;
                                stackOut_187_1 = 1;
                                stackIn_189_0 = stackOut_187_0;
                                stackIn_189_1 = stackOut_187_1;
                                break L7;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_189_1 != 0;
                            return;
                          } else {
                            L8: {
                              this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              stackOut_182_0 = this;
                              stackIn_184_0 = stackOut_182_0;
                              stackIn_183_0 = stackOut_182_0;
                              if (var3 == 0) {
                                stackOut_184_0 = this;
                                stackOut_184_1 = 0;
                                stackIn_185_0 = stackOut_184_0;
                                stackIn_185_1 = stackOut_184_1;
                                break L8;
                              } else {
                                stackOut_183_0 = this;
                                stackOut_183_1 = 1;
                                stackIn_185_0 = stackOut_183_0;
                                stackIn_185_1 = stackOut_183_1;
                                break L8;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_185_1 != 0;
                            return;
                          }
                        } else {
                          L9: {
                            stackOut_177_0 = this;
                            stackIn_179_0 = stackOut_177_0;
                            stackIn_178_0 = stackOut_177_0;
                            if (var3 == 0) {
                              stackOut_179_0 = this;
                              stackOut_179_1 = 0;
                              stackIn_180_0 = stackOut_179_0;
                              stackIn_180_1 = stackOut_179_1;
                              break L9;
                            } else {
                              stackOut_178_0 = this;
                              stackOut_178_1 = 1;
                              stackIn_180_0 = stackOut_178_0;
                              stackIn_180_1 = stackOut_178_1;
                              break L9;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_180_1 != 0;
                          return;
                        }
                      } else {
                        L10: {
                          stackOut_172_0 = this;
                          stackIn_174_0 = stackOut_172_0;
                          stackIn_173_0 = stackOut_172_0;
                          if (var3 == 0) {
                            stackOut_174_0 = this;
                            stackOut_174_1 = 0;
                            stackIn_175_0 = stackOut_174_0;
                            stackIn_175_1 = stackOut_174_1;
                            break L10;
                          } else {
                            stackOut_173_0 = this;
                            stackOut_173_1 = 1;
                            stackIn_175_0 = stackOut_173_0;
                            stackIn_175_1 = stackOut_173_1;
                            break L10;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_175_1 != 0;
                        return;
                      }
                    } else {
                      L11: {
                        stackOut_167_0 = this;
                        stackIn_169_0 = stackOut_167_0;
                        stackIn_168_0 = stackOut_167_0;
                        if (var3 == 0) {
                          stackOut_169_0 = this;
                          stackOut_169_1 = 0;
                          stackIn_170_0 = stackOut_169_0;
                          stackIn_170_1 = stackOut_169_1;
                          break L11;
                        } else {
                          stackOut_168_0 = this;
                          stackOut_168_1 = 1;
                          stackIn_170_0 = stackOut_168_0;
                          stackIn_170_1 = stackOut_168_1;
                          break L11;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_170_1 != 0;
                      return;
                    }
                  }
                } else {
                  L12: {
                    if ((this.field_q ^ -1) != -2) {
                      break L12;
                    } else {
                      if (!this.field_o.k((byte) -126).b((byte) 89)) {
                        break L12;
                      } else {
                        if (this.field_p != null) {
                          break L12;
                        } else {
                          L13: {
                            this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                            stackOut_119_0 = this;
                            stackIn_121_0 = stackOut_119_0;
                            stackIn_120_0 = stackOut_119_0;
                            if (var3 == 0) {
                              stackOut_121_0 = this;
                              stackOut_121_1 = 0;
                              stackIn_122_0 = stackOut_121_0;
                              stackIn_122_1 = stackOut_121_1;
                              break L13;
                            } else {
                              stackOut_120_0 = this;
                              stackOut_120_1 = 1;
                              stackIn_122_0 = stackOut_120_0;
                              stackIn_122_1 = stackOut_120_1;
                              break L13;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_122_1 != 0;
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_q == 1) {
                    if (!this.field_o.k((byte) -87).b((byte) 72)) {
                      if (this.field_p != null) {
                        this.field_p.a(91, var5);
                        this.field_p = null;
                        if (var4 != 0) {
                          L14: {
                            this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                            stackOut_144_0 = this;
                            stackIn_146_0 = stackOut_144_0;
                            stackIn_145_0 = stackOut_144_0;
                            if (var3 == 0) {
                              stackOut_146_0 = this;
                              stackOut_146_1 = 0;
                              stackIn_147_0 = stackOut_146_0;
                              stackIn_147_1 = stackOut_146_1;
                              break L14;
                            } else {
                              stackOut_145_0 = this;
                              stackOut_145_1 = 1;
                              stackIn_147_0 = stackOut_145_0;
                              stackIn_147_1 = stackOut_145_1;
                              break L14;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_147_1 != 0;
                          return;
                        } else {
                          L15: {
                            stackOut_140_0 = this;
                            stackIn_142_0 = stackOut_140_0;
                            stackIn_141_0 = stackOut_140_0;
                            if (var3 == 0) {
                              stackOut_142_0 = this;
                              stackOut_142_1 = 0;
                              stackIn_143_0 = stackOut_142_0;
                              stackIn_143_1 = stackOut_142_1;
                              break L15;
                            } else {
                              stackOut_141_0 = this;
                              stackOut_141_1 = 1;
                              stackIn_143_0 = stackOut_141_0;
                              stackIn_143_1 = stackOut_141_1;
                              break L15;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_143_1 != 0;
                          return;
                        }
                      } else {
                        L16: {
                          stackOut_135_0 = this;
                          stackIn_137_0 = stackOut_135_0;
                          stackIn_136_0 = stackOut_135_0;
                          if (var3 == 0) {
                            stackOut_137_0 = this;
                            stackOut_137_1 = 0;
                            stackIn_138_0 = stackOut_137_0;
                            stackIn_138_1 = stackOut_137_1;
                            break L16;
                          } else {
                            stackOut_136_0 = this;
                            stackOut_136_1 = 1;
                            stackIn_138_0 = stackOut_136_0;
                            stackIn_138_1 = stackOut_136_1;
                            break L16;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_138_1 != 0;
                        return;
                      }
                    } else {
                      L17: {
                        stackOut_130_0 = this;
                        stackIn_132_0 = stackOut_130_0;
                        stackIn_131_0 = stackOut_130_0;
                        if (var3 == 0) {
                          stackOut_132_0 = this;
                          stackOut_132_1 = 0;
                          stackIn_133_0 = stackOut_132_0;
                          stackIn_133_1 = stackOut_132_1;
                          break L17;
                        } else {
                          stackOut_131_0 = this;
                          stackOut_131_1 = 1;
                          stackIn_133_0 = stackOut_131_0;
                          stackIn_133_1 = stackOut_131_1;
                          break L17;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_133_1 != 0;
                      return;
                    }
                  } else {
                    L18: {
                      stackOut_125_0 = this;
                      stackIn_127_0 = stackOut_125_0;
                      stackIn_126_0 = stackOut_125_0;
                      if (var3 == 0) {
                        stackOut_127_0 = this;
                        stackOut_127_1 = 0;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        break L18;
                      } else {
                        stackOut_126_0 = this;
                        stackOut_126_1 = 1;
                        stackIn_128_0 = stackOut_126_0;
                        stackIn_128_1 = stackOut_126_1;
                        break L18;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_128_1 != 0;
                    return;
                  }
                }
              } else {
                L19: {
                  if (var3 != 0) {
                    break L19;
                  } else {
                    discarded$5 = var5.a(new fm(52, this.b((byte) -119), this.c((byte) 112), this.e((byte) -96)), -58);
                    if (var4 != 0) {
                      break L19;
                    } else {
                      L20: {
                        if ((this.field_q ^ -1) != -2) {
                          break L20;
                        } else {
                          if (!this.field_o.k((byte) -126).b((byte) 89)) {
                            break L20;
                          } else {
                            if (this.field_p != null) {
                              L21: {
                                if (this.field_q != 1) {
                                  break L21;
                                } else {
                                  if (this.field_o.k((byte) -87).b((byte) 72)) {
                                    break L21;
                                  } else {
                                    if (this.field_p == null) {
                                      break L21;
                                    } else {
                                      this.field_p.a(91, var5);
                                      this.field_p = null;
                                      if (var4 == 0) {
                                        break L21;
                                      } else {
                                        this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              L22: {
                                stackOut_65_0 = this;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (var3 == 0) {
                                  stackOut_67_0 = this;
                                  stackOut_67_1 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L22;
                                } else {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = 1;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L22;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_68_1 != 0;
                              return;
                            } else {
                              L23: {
                                this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                stackOut_56_0 = this;
                                stackIn_58_0 = stackOut_56_0;
                                stackIn_57_0 = stackOut_56_0;
                                if (var3 == 0) {
                                  stackOut_58_0 = this;
                                  stackOut_58_1 = 0;
                                  stackIn_59_0 = stackOut_58_0;
                                  stackIn_59_1 = stackOut_58_1;
                                  break L23;
                                } else {
                                  stackOut_57_0 = this;
                                  stackOut_57_1 = 1;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  break L23;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_59_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                      if (this.field_q == 1) {
                        if (!this.field_o.k((byte) -87).b((byte) 72)) {
                          if (this.field_p != null) {
                            this.field_p.a(91, var5);
                            this.field_p = null;
                            if (var4 == 0) {
                              L24: {
                                stackOut_90_0 = this;
                                stackIn_92_0 = stackOut_90_0;
                                stackIn_91_0 = stackOut_90_0;
                                if (var3 == 0) {
                                  stackOut_92_0 = this;
                                  stackOut_92_1 = 0;
                                  stackIn_93_0 = stackOut_92_0;
                                  stackIn_93_1 = stackOut_92_1;
                                  break L24;
                                } else {
                                  stackOut_91_0 = this;
                                  stackOut_91_1 = 1;
                                  stackIn_93_0 = stackOut_91_0;
                                  stackIn_93_1 = stackOut_91_1;
                                  break L24;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_93_1 != 0;
                              return;
                            } else {
                              L25: {
                                this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                stackOut_86_0 = this;
                                stackIn_88_0 = stackOut_86_0;
                                stackIn_87_0 = stackOut_86_0;
                                if (var3 == 0) {
                                  stackOut_88_0 = this;
                                  stackOut_88_1 = 0;
                                  stackIn_89_0 = stackOut_88_0;
                                  stackIn_89_1 = stackOut_88_1;
                                  break L25;
                                } else {
                                  stackOut_87_0 = this;
                                  stackOut_87_1 = 1;
                                  stackIn_89_0 = stackOut_87_0;
                                  stackIn_89_1 = stackOut_87_1;
                                  break L25;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_89_1 != 0;
                              return;
                            }
                          } else {
                            L26: {
                              stackOut_81_0 = this;
                              stackIn_83_0 = stackOut_81_0;
                              stackIn_82_0 = stackOut_81_0;
                              if (var3 == 0) {
                                stackOut_83_0 = this;
                                stackOut_83_1 = 0;
                                stackIn_84_0 = stackOut_83_0;
                                stackIn_84_1 = stackOut_83_1;
                                break L26;
                              } else {
                                stackOut_82_0 = this;
                                stackOut_82_1 = 1;
                                stackIn_84_0 = stackOut_82_0;
                                stackIn_84_1 = stackOut_82_1;
                                break L26;
                              }
                            }
                            ((cv) (this)).field_n = stackIn_84_1 != 0;
                            return;
                          }
                        } else {
                          L27: {
                            stackOut_76_0 = this;
                            stackIn_78_0 = stackOut_76_0;
                            stackIn_77_0 = stackOut_76_0;
                            if (var3 == 0) {
                              stackOut_78_0 = this;
                              stackOut_78_1 = 0;
                              stackIn_79_0 = stackOut_78_0;
                              stackIn_79_1 = stackOut_78_1;
                              break L27;
                            } else {
                              stackOut_77_0 = this;
                              stackOut_77_1 = 1;
                              stackIn_79_0 = stackOut_77_0;
                              stackIn_79_1 = stackOut_77_1;
                              break L27;
                            }
                          }
                          ((cv) (this)).field_n = stackIn_79_1 != 0;
                          return;
                        }
                      } else {
                        L28: {
                          stackOut_71_0 = this;
                          stackIn_73_0 = stackOut_71_0;
                          stackIn_72_0 = stackOut_71_0;
                          if (var3 == 0) {
                            stackOut_73_0 = this;
                            stackOut_73_1 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            stackIn_74_1 = stackOut_73_1;
                            break L28;
                          } else {
                            stackOut_72_0 = this;
                            stackOut_72_1 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            stackIn_74_1 = stackOut_72_1;
                            break L28;
                          }
                        }
                        ((cv) (this)).field_n = stackIn_74_1 != 0;
                        return;
                      }
                    }
                  }
                }
                discarded$6 = var5.a(new fm(51, this.b((byte) 90), this.c((byte) 119), this.e((byte) -106)), param0 ^ 57);
                if (var4 == 0) {
                  break L2;
                } else {
                  L29: {
                    if (this.field_q == 3) {
                      if (var3 != 0) {
                        discarded$7 = var5.a(new fm(68, this.b((byte) -107), this.c((byte) 123), this.e((byte) -111)), -58);
                        break L29;
                      } else {
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    L31: {
                      L32: {
                        if ((this.field_q ^ -1) != -2) {
                          break L32;
                        } else {
                          if (!this.field_o.k((byte) -126).b((byte) 89)) {
                            break L32;
                          } else {
                            if (this.field_p == null) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      if (this.field_q != 1) {
                        break L30;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L30;
                        } else {
                          if (this.field_p == null) {
                            break L30;
                          } else {
                            this.field_p.a(91, var5);
                            this.field_p = null;
                            if (var4 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                    }
                    this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                    break L30;
                  }
                  L33: {
                    stackOut_111_0 = this;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_112_0 = stackOut_111_0;
                    if (var3 == 0) {
                      stackOut_113_0 = this;
                      stackOut_113_1 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      break L33;
                    } else {
                      stackOut_112_0 = this;
                      stackOut_112_1 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      break L33;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_114_1 != 0;
                  return;
                }
              }
            }
            L34: {
              if ((this.field_q ^ -1) != -2) {
                break L34;
              } else {
                if (!this.field_o.k((byte) -126).b((byte) 89)) {
                  break L34;
                } else {
                  if (this.field_p == null) {
                    L35: {
                      this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                      stackOut_215_0 = this;
                      stackIn_217_0 = stackOut_215_0;
                      stackIn_216_0 = stackOut_215_0;
                      if (var3 == 0) {
                        stackOut_217_0 = this;
                        stackOut_217_1 = 0;
                        stackIn_218_0 = stackOut_217_0;
                        stackIn_218_1 = stackOut_217_1;
                        break L35;
                      } else {
                        stackOut_216_0 = this;
                        stackOut_216_1 = 1;
                        stackIn_218_0 = stackOut_216_0;
                        stackIn_218_1 = stackOut_216_1;
                        break L35;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_218_1 != 0;
                    return;
                  } else {
                    L36: {
                      if (this.field_q != 1) {
                        break L36;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L36;
                        } else {
                          if (this.field_p == null) {
                            break L36;
                          } else {
                            this.field_p.a(91, var5);
                            this.field_p = null;
                            if (var4 == 0) {
                              break L36;
                            } else {
                              L37: {
                                this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                                stackOut_199_0 = this;
                                stackIn_201_0 = stackOut_199_0;
                                stackIn_200_0 = stackOut_199_0;
                                if (var3 == 0) {
                                  stackOut_201_0 = this;
                                  stackOut_201_1 = 0;
                                  stackIn_202_0 = stackOut_201_0;
                                  stackIn_202_1 = stackOut_201_1;
                                  break L37;
                                } else {
                                  stackOut_200_0 = this;
                                  stackOut_200_1 = 1;
                                  stackIn_202_0 = stackOut_200_0;
                                  stackIn_202_1 = stackOut_200_1;
                                  break L37;
                                }
                              }
                              ((cv) (this)).field_n = stackIn_202_1 != 0;
                              return;
                            }
                          }
                        }
                      }
                    }
                    L38: {
                      stackOut_203_0 = this;
                      stackIn_205_0 = stackOut_203_0;
                      stackIn_204_0 = stackOut_203_0;
                      if (var3 == 0) {
                        stackOut_205_0 = this;
                        stackOut_205_1 = 0;
                        stackIn_206_0 = stackOut_205_0;
                        stackIn_206_1 = stackOut_205_1;
                        break L38;
                      } else {
                        stackOut_204_0 = this;
                        stackOut_204_1 = 1;
                        stackIn_206_0 = stackOut_204_0;
                        stackIn_206_1 = stackOut_204_1;
                        break L38;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_206_1 != 0;
                    return;
                  }
                }
              }
            }
            L39: {
              if (this.field_q != 1) {
                break L39;
              } else {
                if (this.field_o.k((byte) -87).b((byte) 72)) {
                  break L39;
                } else {
                  if (this.field_p == null) {
                    break L39;
                  } else {
                    this.field_p.a(91, var5);
                    this.field_p = null;
                    if (var4 == 0) {
                      break L39;
                    } else {
                      L40: {
                        this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                        stackOut_211_0 = this;
                        stackIn_213_0 = stackOut_211_0;
                        stackIn_212_0 = stackOut_211_0;
                        if (var3 == 0) {
                          stackOut_213_0 = this;
                          stackOut_213_1 = 0;
                          stackIn_214_0 = stackOut_213_0;
                          stackIn_214_1 = stackOut_213_1;
                          break L40;
                        } else {
                          stackOut_212_0 = this;
                          stackOut_212_1 = 1;
                          stackIn_214_0 = stackOut_212_0;
                          stackIn_214_1 = stackOut_212_1;
                          break L40;
                        }
                      }
                      ((cv) (this)).field_n = stackIn_214_1 != 0;
                      return;
                    }
                  }
                }
              }
            }
            L41: {
              stackOut_219_0 = this;
              stackIn_221_0 = stackOut_219_0;
              stackIn_220_0 = stackOut_219_0;
              if (var3 == 0) {
                stackOut_221_0 = this;
                stackOut_221_1 = 0;
                stackIn_222_0 = stackOut_221_0;
                stackIn_222_1 = stackOut_221_1;
                break L41;
              } else {
                stackOut_220_0 = this;
                stackOut_220_1 = 1;
                stackIn_222_0 = stackOut_220_0;
                stackIn_222_1 = stackOut_220_1;
                break L41;
              }
            }
            ((cv) (this)).field_n = stackIn_222_1 != 0;
            return;
          } else {
            L42: {
              if ((this.field_q ^ -1) != -2) {
                break L42;
              } else {
                if (!this.field_o.k((byte) -126).b((byte) 89)) {
                  break L42;
                } else {
                  if (this.field_p != null) {
                    L43: {
                      if (this.field_q != 1) {
                        break L43;
                      } else {
                        if (this.field_o.k((byte) -87).b((byte) 72)) {
                          break L43;
                        } else {
                          if (this.field_p == null) {
                            break L43;
                          } else {
                            this.field_p.a(91, var5);
                            this.field_p = null;
                            if (var4 == 0) {
                              break L43;
                            } else {
                              this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                              break L43;
                            }
                          }
                        }
                      }
                    }
                    L44: {
                      stackOut_20_0 = this;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var3 == 0) {
                        stackOut_22_0 = this;
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L44;
                      } else {
                        stackOut_21_0 = this;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L44;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_23_1 != 0;
                    return;
                  } else {
                    L45: {
                      this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                      stackOut_11_0 = this;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var3 == 0) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L45;
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L45;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_14_1 != 0;
                    return;
                  }
                }
              }
            }
            if (this.field_q == 1) {
              if (!this.field_o.k((byte) -87).b((byte) 72)) {
                if (this.field_p != null) {
                  this.field_p.a(91, var5);
                  this.field_p = null;
                  if (var4 != 0) {
                    L46: {
                      this.field_p = var5.a(new fm(53, this.b((byte) -102), this.c((byte) 116), this.e((byte) -89)), -58);
                      stackOut_45_0 = this;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_46_0 = stackOut_45_0;
                      if (var3 == 0) {
                        stackOut_47_0 = this;
                        stackOut_47_1 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        break L46;
                      } else {
                        stackOut_46_0 = this;
                        stackOut_46_1 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        break L46;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_48_1 != 0;
                    return;
                  } else {
                    L47: {
                      stackOut_41_0 = this;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_42_0 = stackOut_41_0;
                      if (var3 == 0) {
                        stackOut_43_0 = this;
                        stackOut_43_1 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        break L47;
                      } else {
                        stackOut_42_0 = this;
                        stackOut_42_1 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        break L47;
                      }
                    }
                    ((cv) (this)).field_n = stackIn_44_1 != 0;
                    return;
                  }
                } else {
                  L48: {
                    stackOut_36_0 = this;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (var3 == 0) {
                      stackOut_38_0 = this;
                      stackOut_38_1 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      break L48;
                    } else {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      break L48;
                    }
                  }
                  ((cv) (this)).field_n = stackIn_39_1 != 0;
                  return;
                }
              } else {
                L49: {
                  stackOut_31_0 = this;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (var3 == 0) {
                    stackOut_33_0 = this;
                    stackOut_33_1 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L49;
                  } else {
                    stackOut_32_0 = this;
                    stackOut_32_1 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    break L49;
                  }
                }
                ((cv) (this)).field_n = stackIn_34_1 != 0;
                return;
              }
            } else {
              L50: {
                stackOut_26_0 = this;
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (var3 == 0) {
                  stackOut_28_0 = this;
                  stackOut_28_1 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L50;
                } else {
                  stackOut_27_0 = this;
                  stackOut_27_1 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L50;
                }
              }
              ((cv) (this)).field_n = stackIn_29_1 != 0;
              return;
            }
          }
        }
    }

    cv(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_n = false;
    }

    final int m(byte param0) {
        if (param0 <= -63) {
          if (-1 != (this.field_q ^ -1)) {
            if (-3 != (this.field_q ^ -1)) {
              if (this.field_q != 4) {
                if (-6 == (this.field_q ^ -1)) {
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        ka var12 = null;
        ka var13 = null;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        int stackIn_6_0 = 0;
        ka[] stackIn_13_0 = null;
        ka[] stackIn_14_0 = null;
        ka[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ka[] stackIn_16_0 = null;
        ka[] stackIn_17_0 = null;
        ka[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ka[] stackIn_22_0 = null;
        ka[] stackIn_23_0 = null;
        ka[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ka[] stackIn_25_0 = null;
        ka[] stackIn_26_0 = null;
        ka[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ka[] stackIn_29_0 = null;
        ka[] stackIn_30_0 = null;
        ka[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        ka[] stackIn_32_0 = null;
        ka[] stackIn_33_0 = null;
        ka[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        ka[] stackIn_52_0 = null;
        ka[] stackIn_53_0 = null;
        ka[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        ka[] stackIn_57_0 = null;
        ka[] stackIn_58_0 = null;
        ka[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ka[] stackIn_61_0 = null;
        ka[] stackIn_62_0 = null;
        ka[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        ka[] stackIn_66_0 = null;
        ka[] stackIn_67_0 = null;
        ka[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ka[] stackIn_71_0 = null;
        ka[] stackIn_72_0 = null;
        ka[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ka[] stackIn_75_0 = null;
        ka[] stackIn_76_0 = null;
        ka[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        ka stackIn_81_0 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        ka[] stackOut_12_0 = null;
        ka[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ka[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ka[] stackOut_15_0 = null;
        ka[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ka[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ka[] stackOut_21_0 = null;
        ka[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ka[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ka[] stackOut_24_0 = null;
        ka[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        ka[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ka[] stackOut_28_0 = null;
        ka[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        ka[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        ka[] stackOut_31_0 = null;
        ka[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        ka[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        ka[] stackOut_60_0 = null;
        ka[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        ka[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        ka[] stackOut_56_0 = null;
        ka[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        ka[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        ka[] stackOut_51_0 = null;
        ka[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        ka[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        ka[] stackOut_74_0 = null;
        ka[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        ka[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        ka[] stackOut_70_0 = null;
        ka[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ka[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        ka[] stackOut_65_0 = null;
        ka[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        ka[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ka stackOut_80_0 = null;
        ka stackOut_79_0 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -67 % ((param4 - -38) / 47);
              var7 = 0;
              var8 = 0;
              var9 = 0;
              if (null != this.field_o) {
                L2: {
                  if (!this.field_o.k((byte) -125).a(true)) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_6_0;
                  if (this.field_o.k((byte) -109).b((byte) 96)) {
                    break L3;
                  } else {
                    if (this.field_o.b(-96) <= this.field_o.j((byte) -108)) {
                      break L1;
                    } else {
                      if (-1 != (this.field_o.j((byte) -108) ^ -1)) {
                        var8 = 1;
                        if (var15 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var7 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              var10 = 0;
              var11 = null;
              stackOut_12_0 = df.field_J;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var9 != 0) {
                stackOut_14_0 = (ka[]) ((Object) stackIn_14_0);
                stackOut_14_1 = 100;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L4;
              } else {
                stackOut_13_0 = (ka[]) ((Object) stackIn_13_0);
                stackOut_13_1 = 67;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L4;
              }
            }
            L5: {
              var12 = stackIn_15_0[stackIn_15_1];
              stackOut_15_0 = df.field_J;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (var9 != 0) {
                stackOut_17_0 = (ka[]) ((Object) stackIn_17_0);
                stackOut_17_1 = 99;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L5;
              } else {
                stackOut_16_0 = (ka[]) ((Object) stackIn_16_0);
                stackOut_16_1 = 66;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L5;
              }
            }
            L6: {
              var13 = stackIn_18_0[stackIn_18_1];
              if (var7 == 0) {
                L7: {
                  if (var8 != 0) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_21_0 = df.field_J;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var9 != 0) {
                        stackOut_23_0 = (ka[]) ((Object) stackIn_23_0);
                        stackOut_23_1 = 103;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L8;
                      } else {
                        stackOut_22_0 = (ka[]) ((Object) stackIn_22_0);
                        stackOut_22_1 = 68;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = stackIn_24_0[stackIn_24_1];
                      stackOut_24_0 = df.field_J;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (var9 != 0) {
                        stackOut_26_0 = (ka[]) ((Object) stackIn_26_0);
                        stackOut_26_1 = 104;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L9;
                      } else {
                        stackOut_25_0 = (ka[]) ((Object) stackIn_25_0);
                        stackOut_25_1 = 69;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        break L9;
                      }
                    }
                    var12 = stackIn_27_0[stackIn_27_1];
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L10: {
                  stackOut_28_0 = df.field_J;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (var9 != 0) {
                    stackOut_30_0 = (ka[]) ((Object) stackIn_30_0);
                    stackOut_30_1 = 102;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L10;
                  } else {
                    stackOut_29_0 = (ka[]) ((Object) stackIn_29_0);
                    stackOut_29_1 = 95;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    break L10;
                  }
                }
                L11: {
                  var12 = stackIn_31_0[stackIn_31_1];
                  stackOut_31_0 = df.field_J;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (var9 == 0) {
                    stackOut_33_0 = (ka[]) ((Object) stackIn_33_0);
                    stackOut_33_1 = 94;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L11;
                  } else {
                    stackOut_32_0 = (ka[]) ((Object) stackIn_32_0);
                    stackOut_32_1 = 101;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    break L11;
                  }
                }
                var13 = stackIn_34_0[stackIn_34_1];
                break L6;
              } else {
                break L6;
              }
            }
            L12: {
              var14 = this.field_q;
              if (var14 == 0) {
                if (var7 == 0) {
                  if (var8 == 0) {
                    L13: {
                      stackOut_60_0 = df.field_J;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      if (var9 == 0) {
                        stackOut_62_0 = (ka[]) ((Object) stackIn_62_0);
                        stackOut_62_1 = 21;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        break L13;
                      } else {
                        stackOut_61_0 = (ka[]) ((Object) stackIn_61_0);
                        stackOut_61_1 = 96;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        break L13;
                      }
                    }
                    var11 = stackIn_63_0[stackIn_63_1];
                    break L12;
                  } else {
                    L14: {
                      stackOut_56_0 = df.field_J;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      if (var9 == 0) {
                        stackOut_58_0 = (ka[]) ((Object) stackIn_58_0);
                        stackOut_58_1 = 93;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        break L14;
                      } else {
                        stackOut_57_0 = (ka[]) ((Object) stackIn_57_0);
                        stackOut_57_1 = 97;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        break L14;
                      }
                    }
                    var11 = stackIn_59_0[stackIn_59_1];
                    break L12;
                  }
                } else {
                  L15: {
                    stackOut_51_0 = df.field_J;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (var9 != 0) {
                      stackOut_53_0 = (ka[]) ((Object) stackIn_53_0);
                      stackOut_53_1 = 98;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      break L15;
                    } else {
                      stackOut_52_0 = (ka[]) ((Object) stackIn_52_0);
                      stackOut_52_1 = 22;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L15;
                    }
                  }
                  var11 = stackIn_54_0[stackIn_54_1];
                  break L12;
                }
              } else {
                L16: {
                  if (var14 != 2) {
                    break L16;
                  } else {
                    if (var15 == 0) {
                      if (var7 == 0) {
                        if (var8 != 0) {
                          L17: {
                            stackOut_74_0 = df.field_J;
                            stackIn_76_0 = stackOut_74_0;
                            stackIn_75_0 = stackOut_74_0;
                            if (var9 != 0) {
                              stackOut_76_0 = (ka[]) ((Object) stackIn_76_0);
                              stackOut_76_1 = 107;
                              stackIn_77_0 = stackOut_76_0;
                              stackIn_77_1 = stackOut_76_1;
                              break L17;
                            } else {
                              stackOut_75_0 = (ka[]) ((Object) stackIn_75_0);
                              stackOut_75_1 = 105;
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_77_1 = stackOut_75_1;
                              break L17;
                            }
                          }
                          var11 = stackIn_77_0[stackIn_77_1];
                          break L12;
                        } else {
                          L18: {
                            stackOut_70_0 = df.field_J;
                            stackIn_72_0 = stackOut_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            if (var9 != 0) {
                              stackOut_72_0 = (ka[]) ((Object) stackIn_72_0);
                              stackOut_72_1 = 106;
                              stackIn_73_0 = stackOut_72_0;
                              stackIn_73_1 = stackOut_72_1;
                              break L18;
                            } else {
                              stackOut_71_0 = (ka[]) ((Object) stackIn_71_0);
                              stackOut_71_1 = 45;
                              stackIn_73_0 = stackOut_71_0;
                              stackIn_73_1 = stackOut_71_1;
                              break L18;
                            }
                          }
                          var11 = stackIn_73_0[stackIn_73_1];
                          break L12;
                        }
                      } else {
                        L19: {
                          stackOut_65_0 = df.field_J;
                          stackIn_67_0 = stackOut_65_0;
                          stackIn_66_0 = stackOut_65_0;
                          if (var9 != 0) {
                            stackOut_67_0 = (ka[]) ((Object) stackIn_67_0);
                            stackOut_67_1 = 108;
                            stackIn_68_0 = stackOut_67_0;
                            stackIn_68_1 = stackOut_67_1;
                            break L19;
                          } else {
                            stackOut_66_0 = (ka[]) ((Object) stackIn_66_0);
                            stackOut_66_1 = 46;
                            stackIn_68_0 = stackOut_66_0;
                            stackIn_68_1 = stackOut_66_1;
                            break L19;
                          }
                        }
                        var11 = stackIn_68_0[stackIn_68_1];
                        break L12;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L20: {
                  if (-2 != (var14 ^ -1)) {
                    break L20;
                  } else {
                    if (var15 == 0) {
                      L21: {
                        if (var7 != 0) {
                          stackOut_80_0 = df.field_J[25];
                          stackIn_81_0 = stackOut_80_0;
                          break L21;
                        } else {
                          stackOut_79_0 = df.field_J[24];
                          stackIn_81_0 = stackOut_79_0;
                          break L21;
                        }
                      }
                      var11 = stackIn_81_0;
                      break L12;
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (var14 != 3) {
                    break L22;
                  } else {
                    if (var15 == 0) {
                      var11 = df.field_J[9];
                      var10 = -2048;
                      if (var7 != 0) {
                        var11 = this.field_s.b((byte) 74);
                        this.field_s.a(3, false, (byte) -101, 6);
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (4 != var14) {
                    break L23;
                  } else {
                    if (var15 == 0) {
                      jc.a(2097152, 0, (byte) 88, param2, this.field_h.c(-20), 1024, param3, var13, 0, var12, param1);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L23;
                    }
                  }
                }
                if (var14 == 5) {
                  gba.a(2, param2, 2097152, var12, -512, var13, param1, 512, 512, this.field_h.a((byte) 55), param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L12;
                }
              }
            }
            L24: {
              if (var11 == null) {
                break L24;
              } else {
                var14 = dfa.a(var10 + (2048 - this.field_h.g(-25787)) >> 11187202, 2048, -38);
                gqa.a(var14, -83584144, param1, param2, (ka) (var11), param3);
                break L24;
              }
            }
            L25: {
              if ((this.field_q ^ -1) != -2) {
                break L25;
              } else {
                if (var7 != 0) {
                  var16 = this.field_s.b((byte) 74);
                  this.field_s.a(3, false, (byte) 79, 7);
                  var14 = dfa.a(-this.field_h.g(-25787) + var10 + 2048 >> 2040878914, 2048, -69);
                  gqa.a(var14, -83584144, param1, param2 + 65536, var16, param3 + 2228224);
                  break L25;
                } else {
                  break L25;
                }
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var6);
            stackOut_96_1 = new StringBuilder().append("cv.D(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L26;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L26;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          if (!this.field_h.j(-1)) {
            var2 = this.field_q;
            if (var2 != 0) {
              if (2 != var2) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (-2 != (var2 ^ -1)) {
                      if (var2 == 3) {
                        if (var3 != 0) {
                          return 5;
                        } else {
                          return 7;
                        }
                      } else {
                        return 5;
                      }
                    } else {
                      return 7;
                    }
                  } else {
                    if (var3 != 0) {
                      if (-2 != (var2 ^ -1)) {
                        if (var2 != 3) {
                          return 5;
                        } else {
                          return 5;
                        }
                      } else {
                        return 7;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 5;
                }
              } else {
                return 5;
              }
            } else {
              if (var3 != 0) {
                if (2 != var2) {
                  if (4 != var2) {
                    if (5 != var2) {
                      if (-2 != (var2 ^ -1)) {
                        if (var2 == 3) {
                          if (var3 != 0) {
                            return 5;
                          } else {
                            return 7;
                          }
                        } else {
                          return 5;
                        }
                      } else {
                        return 7;
                      }
                    } else {
                      if (var3 != 0) {
                        if (-2 != (var2 ^ -1)) {
                          if (var2 == 3) {
                            return 5;
                          } else {
                            return 5;
                          }
                        } else {
                          return 7;
                        }
                      } else {
                        return 5;
                      }
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
            }
          } else {
            return 2;
          }
        } else {
          return 44;
        }
    }

    static {
        field_m = new Hashtable();
        field_r = "Waiting for graphics";
    }
}
