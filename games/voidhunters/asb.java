/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asb {
    boolean field_e;
    private Object[][] field_c;
    static String field_b;
    int field_h;
    private fnb field_d;
    private qp field_g;
    static int field_f;
    static llb field_a;
    private Object[] field_i;

    final synchronized byte[] c(byte param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_12_0 = null;
        byte[] stackOut_9_0 = null;
        try {
          if (!((asb) this).b((byte) -59)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            L0: {
              if (param0 == 9) {
                break L0;
              } else {
                int discarded$2 = ((asb) this).a((String) null, 14);
                break L0;
              }
            }
            if (((asb) this).field_g.field_m.length != 1) {
              if (this.b((byte) 125, param1)) {
                if (((asb) this).field_g.field_m[param1] == 1) {
                  stackOut_17_0 = ((asb) this).a(param1, 0, (byte) 13);
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (byte[]) (Object) stackIn_13_0;
              }
            } else {
              stackOut_9_0 = ((asb) this).a(0, param1, (byte) 13);
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.K(" + param0 + ',' + param1 + ')');
        }
    }

    final int c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((asb) this).b((byte) 88)) {
              L1: {
                if (param0 >= 37) {
                  break L1;
                } else {
                  int discarded$2 = ((asb) this).a(86, -10);
                  break L1;
                }
              }
              stackOut_6_0 = ((asb) this).field_g.field_m.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "asb.V(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 106)) {
              if (param1 == -2118) {
                param0 = param0.toLowerCase();
                var3_int = ((asb) this).field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, (CharSequence) (Object) param0));
                stackOut_6_0 = ((asb) this).a(var3_int, 1045);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("asb.S(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) -117)) {
              param0 = param0.toLowerCase();
              var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 109, (CharSequence) (Object) param0));
              if (!this.b((byte) -72, var3_int)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param1 <= -69) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((asb) this).c(((int[]) ((asb) this).field_i[12])[7], ((int[]) ((Object[]) ((asb) this).field_i[2])[2])[7]);
                    break L1;
                  }
                }
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("asb.D(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b((byte) -121, param0)) {
              if (((asb) this).field_i[param0] == null) {
                if (param1 == 1045) {
                  stackOut_9_0 = ((asb) this).field_d.a(param0, false);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = -57;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = 100;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, mm param1, boolean param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cna var7_ref_cna = null;
        int var8_int = 0;
        cna[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cna var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        cna stackIn_31_0 = null;
        cna stackIn_32_0 = null;
        cna stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        cna stackIn_89_0 = null;
        cna stackIn_90_0 = null;
        cna stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        cna stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        cna stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        cna stackIn_99_0 = null;
        boolean stackIn_99_1 = false;
        cna stackIn_100_0 = null;
        boolean stackIn_100_1 = false;
        cna stackIn_101_0 = null;
        boolean stackIn_101_1 = false;
        int stackIn_101_2 = 0;
        cna stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        cna stackIn_105_0 = null;
        cna stackIn_106_0 = null;
        cna stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        cna stackIn_109_0 = null;
        cna stackIn_110_0 = null;
        cna stackIn_111_0 = null;
        cna stackIn_112_0 = null;
        cna stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        cna stackIn_140_0 = null;
        cna stackIn_141_0 = null;
        cna stackIn_142_0 = null;
        cna stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        cna stackIn_145_0 = null;
        cna stackIn_146_0 = null;
        cna stackIn_147_0 = null;
        cna stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        cna stackIn_150_0 = null;
        cna stackIn_151_0 = null;
        cna stackIn_152_0 = null;
        cna stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        String stackIn_176_0 = null;
        cna stackIn_180_0 = null;
        cna stackIn_181_0 = null;
        cna stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_184_0 = 0;
        boolean stackIn_187_0 = false;
        int stackIn_191_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_265_0 = 0;
        String stackIn_324_0 = null;
        String stackIn_330_0 = null;
        boolean stackIn_372_0 = false;
        int stackIn_379_0 = 0;
        cna stackIn_392_0 = null;
        cna stackIn_393_0 = null;
        cna stackIn_394_0 = null;
        cna stackIn_395_0 = null;
        int stackIn_395_1 = 0;
        cna stackIn_399_0 = null;
        boolean stackIn_399_1 = false;
        int stackIn_399_2 = 0;
        int stackIn_399_3 = 0;
        cna stackIn_400_0 = null;
        boolean stackIn_400_1 = false;
        cna stackIn_401_0 = null;
        boolean stackIn_401_1 = false;
        cna stackIn_402_0 = null;
        boolean stackIn_402_1 = false;
        cna stackIn_403_0 = null;
        boolean stackIn_403_1 = false;
        int stackIn_403_2 = 0;
        cna stackIn_406_0 = null;
        cna stackIn_407_0 = null;
        cna stackIn_408_0 = null;
        int stackIn_408_1 = 0;
        int stackIn_408_2 = 0;
        int stackIn_408_3 = 0;
        cna stackIn_409_0 = null;
        cna stackIn_410_0 = null;
        cna stackIn_411_0 = null;
        int stackIn_411_1 = 0;
        cna stackIn_413_0 = null;
        cna stackIn_414_0 = null;
        cna stackIn_415_0 = null;
        cna stackIn_416_0 = null;
        cna stackIn_417_0 = null;
        int stackIn_417_1 = 0;
        int stackIn_419_0 = 0;
        int stackIn_421_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        cna stackOut_30_0 = null;
        cna stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        cna stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        cna stackOut_88_0 = null;
        cna stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        cna stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        cna stackOut_96_0 = null;
        boolean stackOut_96_1 = false;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        cna stackOut_97_0 = null;
        boolean stackOut_97_1 = false;
        cna stackOut_100_0 = null;
        boolean stackOut_100_1 = false;
        int stackOut_100_2 = 0;
        cna stackOut_98_0 = null;
        boolean stackOut_98_1 = false;
        cna stackOut_99_0 = null;
        boolean stackOut_99_1 = false;
        int stackOut_99_2 = 0;
        cna stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        cna stackOut_104_0 = null;
        cna stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        cna stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        cna stackOut_108_0 = null;
        cna stackOut_109_0 = null;
        cna stackOut_110_0 = null;
        cna stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        cna stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        boolean stackOut_114_0 = false;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_120_0 = 0;
        cna stackOut_139_0 = null;
        cna stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        cna stackOut_140_0 = null;
        cna stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        cna stackOut_144_0 = null;
        cna stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        cna stackOut_145_0 = null;
        cna stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        cna stackOut_149_0 = null;
        cna stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        cna stackOut_150_0 = null;
        cna stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        byte stackOut_155_0 = 0;
        int stackOut_163_0 = 0;
        Object stackOut_175_0 = null;
        String stackOut_174_0 = null;
        cna stackOut_179_0 = null;
        cna stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        cna stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_183_0 = 0;
        boolean stackOut_186_0 = false;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_263_0 = 0;
        Object stackOut_323_0 = null;
        Object stackOut_322_0 = null;
        String stackOut_321_0 = null;
        Object stackOut_329_0 = null;
        String stackOut_328_0 = null;
        Object stackOut_327_0 = null;
        boolean stackOut_371_0 = false;
        int stackOut_378_0 = 0;
        cna stackOut_391_0 = null;
        cna stackOut_394_0 = null;
        int stackOut_394_1 = 0;
        cna stackOut_392_0 = null;
        cna stackOut_393_0 = null;
        int stackOut_393_1 = 0;
        cna stackOut_398_0 = null;
        boolean stackOut_398_1 = false;
        int stackOut_398_2 = 0;
        int stackOut_398_3 = 0;
        cna stackOut_399_0 = null;
        boolean stackOut_399_1 = false;
        cna stackOut_402_0 = null;
        boolean stackOut_402_1 = false;
        int stackOut_402_2 = 0;
        cna stackOut_400_0 = null;
        boolean stackOut_400_1 = false;
        cna stackOut_401_0 = null;
        boolean stackOut_401_1 = false;
        int stackOut_401_2 = 0;
        cna stackOut_405_0 = null;
        cna stackOut_406_0 = null;
        cna stackOut_407_0 = null;
        int stackOut_407_1 = 0;
        byte stackOut_407_2 = 0;
        int stackOut_407_3 = 0;
        cna stackOut_408_0 = null;
        cna stackOut_409_0 = null;
        int stackOut_409_1 = 0;
        cna stackOut_410_0 = null;
        int stackOut_410_1 = 0;
        cna stackOut_412_0 = null;
        cna stackOut_413_0 = null;
        cna stackOut_414_0 = null;
        cna stackOut_415_0 = null;
        int stackOut_415_1 = 0;
        cna stackOut_416_0 = null;
        int stackOut_416_1 = 0;
        int stackOut_418_0 = 0;
        int stackOut_420_0 = 0;
        L0: {
          L1: {
            var26 = VoidHunters.field_G;
            if (param2) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (!nmb.b(param3 + 164)) {
                    break L3;
                  } else {
                    if (param1.field_fc) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              var4_int = stackIn_7_0;
              if (var26 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (ii.field_h) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L4;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L4;
            }
          }
          var4_int = stackIn_12_0;
          break L0;
        }
        L5: {
          var5 = 0;
          if (!param2) {
            var6 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (var6 >= 5) {
                    break L8;
                  } else {
                    stackOut_17_0 = var4_int;
                    stackIn_35_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var26 != 0) {
                      break L7;
                    } else {
                      L9: {
                        if (stackIn_18_0 == 0) {
                          break L9;
                        } else {
                          if (0 == inb.field_q[0][var6 + 1].field_o) {
                            break L9;
                          } else {
                            if (param1.field_Cb == var6) {
                              break L9;
                            } else {
                              var5 = 1;
                              param1.field_Cb = var6;
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        inb.field_q[0][var6 - -1].field_y = var4_int != 0;
                        if (ll.field_o) {
                          break L10;
                        } else {
                          if (var6 == 3) {
                            inb.field_q[0][var6 - -1].field_y = false;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        stackOut_30_0 = inb.field_q[0][1 + var6];
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var6 != param1.field_Cb) {
                          stackOut_32_0 = (cna) (Object) stackIn_32_0;
                          stackOut_32_1 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          break L11;
                        } else {
                          stackOut_31_0 = (cna) (Object) stackIn_31_0;
                          stackOut_31_1 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          break L11;
                        }
                      }
                      stackIn_33_0.field_J = stackIn_33_1 != 0;
                      var6++;
                      if (var26 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                stackOut_34_0 = inb.field_q[0][2].field_Q;
                stackIn_35_0 = stackOut_34_0 ? 1 : 0;
                break L7;
              }
              if (stackIn_35_0 != 0) {
                L12: {
                  if (nmb.b(97)) {
                    break L12;
                  } else {
                    lob.field_a = isa.a(oba.field_p, new String[1], 124);
                    if (var26 == 0) {
                      break L5;
                    } else {
                      break L12;
                    }
                  }
                }
                lob.field_a = mla.field_r;
                break L5;
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
        L13: {
          L14: {
            if (ieb.field_o.length >= 2) {
              L15: {
                L16: {
                  if (!param2) {
                    break L16;
                  } else {
                    if (-1 == tsa.field_h) {
                      break L16;
                    } else {
                      stackOut_46_0 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L15;
                    }
                  }
                }
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                break L15;
              }
              L17: {
                var6 = stackIn_48_0;
                if (var6 == 0) {
                  break L17;
                } else {
                  var7 = tsa.field_h;
                  var8_int = 0;
                  L18: while (true) {
                    L19: {
                      if (~var8_int <= ~ce.field_o.length) {
                        break L19;
                      } else {
                        ce.field_o[var8_int] = (byte) 0;
                        var8_int++;
                        if (var26 != 0) {
                          break L17;
                        } else {
                          if (var26 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
                    break L17;
                  }
                }
              }
              L20: {
                if (!param2) {
                  stackOut_57_0 = 0;
                  stackIn_58_0 = stackOut_57_0;
                  break L20;
                } else {
                  stackOut_56_0 = -1;
                  stackIn_58_0 = stackOut_56_0;
                  break L20;
                }
              }
              var7 = stackIn_58_0;
              L21: while (true) {
                if (var7 >= ieb.field_o.length) {
                  break L14;
                } else {
                  stackOut_60_0 = var6;
                  stackIn_115_0 = stackOut_60_0;
                  stackIn_61_0 = stackOut_60_0;
                  if (var26 != 0) {
                    break L13;
                  } else {
                    L22: {
                      L23: {
                        if (stackIn_61_0 == 0) {
                          break L23;
                        } else {
                          if (~tsa.field_h == ~var7) {
                            break L23;
                          } else {
                            stackOut_65_0 = 1;
                            stackIn_67_0 = stackOut_65_0;
                            break L22;
                          }
                        }
                      }
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L22;
                    }
                    L24: {
                      var8_int = stackIn_67_0;
                      if (var4_int == 0) {
                        break L24;
                      } else {
                        if (0 != inb.field_q[1][var7 + 1].field_o) {
                          L25: {
                            if (!param2) {
                              break L25;
                            } else {
                              if (var6 == 0) {
                                L26: {
                                  if (var7 == -1) {
                                    break L26;
                                  } else {
                                    ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                                    if (var26 == 0) {
                                      break L24;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var9 = 0;
                                L27: while (true) {
                                  L28: {
                                    if (ce.field_o.length <= var9) {
                                      break L28;
                                    } else {
                                      ce.field_o[var9] = (byte) 0;
                                      var9++;
                                      if (var26 != 0) {
                                        break L24;
                                      } else {
                                        if (var26 == 0) {
                                          continue L27;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  if (var26 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                          var9 = ieb.field_o[var7];
                          if (param1.field_Fb != var9) {
                            var5 = 1;
                            param1.field_Fb = var9;
                            break L24;
                          } else {
                            break L24;
                          }
                        } else {
                          break L24;
                        }
                      }
                    }
                    L29: {
                      L30: {
                        if (param2) {
                          break L30;
                        } else {
                          L31: {
                            var9 = ieb.field_o[var7];
                            stackOut_88_0 = inb.field_q[1][1 + var7];
                            stackIn_90_0 = stackOut_88_0;
                            stackIn_89_0 = stackOut_88_0;
                            if (~param1.field_Fb != ~var9) {
                              stackOut_90_0 = (cna) (Object) stackIn_90_0;
                              stackOut_90_1 = 0;
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              break L31;
                            } else {
                              stackOut_89_0 = (cna) (Object) stackIn_89_0;
                              stackOut_89_1 = 1;
                              stackIn_91_0 = stackOut_89_0;
                              stackIn_91_1 = stackOut_89_1;
                              break L31;
                            }
                          }
                          stackIn_91_0.field_J = stackIn_91_1 != 0;
                          if (var26 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L32: {
                        L33: {
                          if (var7 != -1) {
                            break L33;
                          } else {
                            inb.field_q[1][var7 + 1].field_J = true;
                            var9 = 0;
                            L34: while (true) {
                              L35: {
                                if (~var9 <= ~ieb.field_o.length) {
                                  break L35;
                                } else {
                                  stackOut_96_0 = inb.field_q[1][var7 - -1];
                                  stackOut_96_1 = inb.field_q[1][var7 - -1].field_J;
                                  stackOut_96_2 = ~(ce.field_o[var9 / 8] & 1 << (7 & var9));
                                  stackOut_96_3 = -1;
                                  stackIn_104_0 = stackOut_96_0;
                                  stackIn_104_1 = stackOut_96_1 ? 1 : 0;
                                  stackIn_104_2 = stackOut_96_2;
                                  stackIn_104_3 = stackOut_96_3;
                                  stackIn_97_0 = stackOut_96_0;
                                  stackIn_97_1 = stackOut_96_1;
                                  stackIn_97_2 = stackOut_96_2;
                                  stackIn_97_3 = stackOut_96_3;
                                  if (var26 != 0) {
                                    break L32;
                                  } else {
                                    L36: {
                                      stackOut_97_0 = (cna) (Object) stackIn_97_0;
                                      stackOut_97_1 = stackIn_97_1;
                                      stackIn_100_0 = stackOut_97_0;
                                      stackIn_100_1 = stackOut_97_1;
                                      stackIn_98_0 = stackOut_97_0;
                                      stackIn_98_1 = stackOut_97_1;
                                      if (stackIn_97_2 != stackIn_97_3) {
                                        stackOut_100_0 = (cna) (Object) stackIn_100_0;
                                        stackOut_100_1 = stackIn_100_1;
                                        stackOut_100_2 = 0;
                                        stackIn_101_0 = stackOut_100_0;
                                        stackIn_101_1 = stackOut_100_1;
                                        stackIn_101_2 = stackOut_100_2;
                                        break L36;
                                      } else {
                                        stackOut_98_0 = (cna) (Object) stackIn_98_0;
                                        stackOut_98_1 = stackIn_98_1;
                                        stackIn_99_0 = stackOut_98_0;
                                        stackIn_99_1 = stackOut_98_1;
                                        stackOut_99_0 = (cna) (Object) stackIn_99_0;
                                        stackOut_99_1 = stackIn_99_1;
                                        stackOut_99_2 = 1;
                                        stackIn_101_0 = stackOut_99_0;
                                        stackIn_101_1 = stackOut_99_1;
                                        stackIn_101_2 = stackOut_99_2;
                                        break L36;
                                      }
                                    }
                                    stackIn_101_0.field_J = stackIn_101_1 & stackIn_101_2 != 0;
                                    var9++;
                                    if (var26 == 0) {
                                      continue L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              if (var26 == 0) {
                                break L29;
                              } else {
                                break L33;
                              }
                            }
                          }
                        }
                        stackOut_103_0 = inb.field_q[1][1 + var7];
                        stackOut_103_1 = -1;
                        stackOut_103_2 = ce.field_o[var7 / 8] & 1 << (7 & var7);
                        stackOut_103_3 = -1;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        stackIn_104_2 = stackOut_103_2;
                        stackIn_104_3 = stackOut_103_3;
                        break L32;
                      }
                      L37: {
                        stackOut_104_0 = (cna) (Object) stackIn_104_0;
                        stackIn_106_0 = stackOut_104_0;
                        stackIn_105_0 = stackOut_104_0;
                        if (stackIn_104_1 == (stackIn_104_2 ^ stackIn_104_3)) {
                          stackOut_106_0 = (cna) (Object) stackIn_106_0;
                          stackOut_106_1 = 0;
                          stackIn_107_0 = stackOut_106_0;
                          stackIn_107_1 = stackOut_106_1;
                          break L37;
                        } else {
                          stackOut_105_0 = (cna) (Object) stackIn_105_0;
                          stackOut_105_1 = 1;
                          stackIn_107_0 = stackOut_105_0;
                          stackIn_107_1 = stackOut_105_1;
                          break L37;
                        }
                      }
                      stackIn_107_0.field_J = stackIn_107_1 != 0;
                      break L29;
                    }
                    L38: {
                      L39: {
                        stackOut_108_0 = inb.field_q[1][1 + var7];
                        stackIn_112_0 = stackOut_108_0;
                        stackIn_109_0 = stackOut_108_0;
                        if (var4_int == 0) {
                          break L39;
                        } else {
                          stackOut_109_0 = (cna) (Object) stackIn_109_0;
                          stackIn_112_0 = stackOut_109_0;
                          stackIn_110_0 = stackOut_109_0;
                          if (var8_int != 0) {
                            break L39;
                          } else {
                            stackOut_110_0 = (cna) (Object) stackIn_110_0;
                            stackIn_111_0 = stackOut_110_0;
                            stackOut_111_0 = (cna) (Object) stackIn_111_0;
                            stackOut_111_1 = 1;
                            stackIn_113_0 = stackOut_111_0;
                            stackIn_113_1 = stackOut_111_1;
                            break L38;
                          }
                        }
                      }
                      stackOut_112_0 = (cna) (Object) stackIn_112_0;
                      stackOut_112_1 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      break L38;
                    }
                    stackIn_113_0.field_y = stackIn_113_1 != 0;
                    var7++;
                    if (var26 == 0) {
                      continue L21;
                    } else {
                      break L14;
                    }
                  }
                }
              }
            } else {
              break L14;
            }
          }
          stackOut_114_0 = param2;
          stackIn_115_0 = stackOut_114_0 ? 1 : 0;
          break L13;
        }
        L40: {
          if (stackIn_115_0 == 0) {
            stackOut_117_0 = 1;
            stackIn_118_0 = stackOut_117_0;
            break L40;
          } else {
            stackOut_116_0 = 0;
            stackIn_118_0 = stackOut_116_0;
            break L40;
          }
        }
        var6 = stackIn_118_0;
        L41: while (true) {
          L42: {
            L43: {
              if (var6 >= 3) {
                break L43;
              } else {
                var7_ref_cna = inb.field_q[2][var6];
                stackOut_120_0 = var4_int;
                stackIn_156_0 = stackOut_120_0;
                stackIn_121_0 = stackOut_120_0;
                if (var26 != 0) {
                  break L42;
                } else {
                  L44: {
                    if (stackIn_121_0 == 0) {
                      break L44;
                    } else {
                      if (var7_ref_cna.field_o == 0) {
                        break L44;
                      } else {
                        L45: {
                          if (!param2) {
                            break L45;
                          } else {
                            L46: {
                              if (0 != var6) {
                                break L46;
                              } else {
                                qd.field_d = 0;
                                if (var26 == 0) {
                                  break L44;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            qd.field_d = qd.field_d ^ var6;
                            if (var26 == 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (param1.field_Bb == var6) {
                          break L44;
                        } else {
                          var5 = 1;
                          param1.field_Bb = var6;
                          break L44;
                        }
                      }
                    }
                  }
                  L47: {
                    L48: {
                      var7_ref_cna.field_y = var4_int != 0;
                      if (!param2) {
                        break L48;
                      } else {
                        L49: {
                          if (var6 != 0) {
                            break L49;
                          } else {
                            L50: {
                              stackOut_139_0 = (cna) var7_ref_cna;
                              stackIn_142_0 = stackOut_139_0;
                              stackIn_140_0 = stackOut_139_0;
                              if (0 != qd.field_d) {
                                stackOut_142_0 = (cna) (Object) stackIn_142_0;
                                stackOut_142_1 = 0;
                                stackIn_143_0 = stackOut_142_0;
                                stackIn_143_1 = stackOut_142_1;
                                break L50;
                              } else {
                                stackOut_140_0 = (cna) (Object) stackIn_140_0;
                                stackIn_141_0 = stackOut_140_0;
                                stackOut_141_0 = (cna) (Object) stackIn_141_0;
                                stackOut_141_1 = 1;
                                stackIn_143_0 = stackOut_141_0;
                                stackIn_143_1 = stackOut_141_1;
                                break L50;
                              }
                            }
                            stackIn_143_0.field_J = stackIn_143_1 != 0;
                            if (var26 == 0) {
                              break L47;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L51: {
                          stackOut_144_0 = (cna) var7_ref_cna;
                          stackIn_147_0 = stackOut_144_0;
                          stackIn_145_0 = stackOut_144_0;
                          if ((qd.field_d & var6) == 0) {
                            stackOut_147_0 = (cna) (Object) stackIn_147_0;
                            stackOut_147_1 = 0;
                            stackIn_148_0 = stackOut_147_0;
                            stackIn_148_1 = stackOut_147_1;
                            break L51;
                          } else {
                            stackOut_145_0 = (cna) (Object) stackIn_145_0;
                            stackIn_146_0 = stackOut_145_0;
                            stackOut_146_0 = (cna) (Object) stackIn_146_0;
                            stackOut_146_1 = 1;
                            stackIn_148_0 = stackOut_146_0;
                            stackIn_148_1 = stackOut_146_1;
                            break L51;
                          }
                        }
                        stackIn_148_0.field_J = stackIn_148_1 != 0;
                        if (var26 == 0) {
                          break L47;
                        } else {
                          break L48;
                        }
                      }
                    }
                    L52: {
                      stackOut_149_0 = (cna) var7_ref_cna;
                      stackIn_152_0 = stackOut_149_0;
                      stackIn_150_0 = stackOut_149_0;
                      if (0 == (var6 & param1.field_Bb)) {
                        stackOut_152_0 = (cna) (Object) stackIn_152_0;
                        stackOut_152_1 = 0;
                        stackIn_153_0 = stackOut_152_0;
                        stackIn_153_1 = stackOut_152_1;
                        break L52;
                      } else {
                        stackOut_150_0 = (cna) (Object) stackIn_150_0;
                        stackIn_151_0 = stackOut_150_0;
                        stackOut_151_0 = (cna) (Object) stackIn_151_0;
                        stackOut_151_1 = 1;
                        stackIn_153_0 = stackOut_151_0;
                        stackIn_153_1 = stackOut_151_1;
                        break L52;
                      }
                    }
                    stackIn_153_0.field_J = stackIn_153_1 != 0;
                    break L47;
                  }
                  var6++;
                  if (var26 == 0) {
                    continue L41;
                  } else {
                    break L43;
                  }
                }
              }
            }
            stackOut_155_0 = param3;
            stackIn_156_0 = stackOut_155_0;
            break L42;
          }
          L53: {
            if (stackIn_156_0 == -67) {
              break L53;
            } else {
              asb.a(-90, (mm) null, true, (byte) -109);
              break L53;
            }
          }
          L54: {
            L55: {
              if (!param2) {
                break L55;
              } else {
                if (nkb.field_r <= 1) {
                  break L55;
                } else {
                  var6 = 0;
                  L56: while (true) {
                    if (~var6 <= ~(nkb.field_r - -1)) {
                      break L55;
                    } else {
                      var7_ref_cna = inb.field_q[3][var6];
                      stackOut_163_0 = var4_int;
                      stackIn_184_0 = stackOut_163_0;
                      stackIn_164_0 = stackOut_163_0;
                      if (var26 != 0) {
                        break L54;
                      } else {
                        L57: {
                          if (stackIn_164_0 == 0) {
                            break L57;
                          } else {
                            if (0 == var7_ref_cna.field_o) {
                              break L57;
                            } else {
                              imb.field_a = var6;
                              break L57;
                            }
                          }
                        }
                        L58: {
                          if (!var7_ref_cna.field_Q) {
                            break L58;
                          } else {
                            if (var6 <= 0) {
                              break L58;
                            } else {
                              L59: {
                                if (ea.field_k == null) {
                                  stackOut_175_0 = null;
                                  stackIn_176_0 = (String) (Object) stackOut_175_0;
                                  break L59;
                                } else {
                                  stackOut_174_0 = ea.field_k[-1 + var6];
                                  stackIn_176_0 = stackOut_174_0;
                                  break L59;
                                }
                              }
                              var8_ref = stackIn_176_0;
                              if (var8_ref != null) {
                                lob.field_a = var8_ref;
                                break L58;
                              } else {
                                break L58;
                              }
                            }
                          }
                        }
                        L60: {
                          stackOut_179_0 = (cna) var7_ref_cna;
                          stackIn_181_0 = stackOut_179_0;
                          stackIn_180_0 = stackOut_179_0;
                          if (var6 != imb.field_a) {
                            stackOut_181_0 = (cna) (Object) stackIn_181_0;
                            stackOut_181_1 = 0;
                            stackIn_182_0 = stackOut_181_0;
                            stackIn_182_1 = stackOut_181_1;
                            break L60;
                          } else {
                            stackOut_180_0 = (cna) (Object) stackIn_180_0;
                            stackOut_180_1 = 1;
                            stackIn_182_0 = stackOut_180_0;
                            stackIn_182_1 = stackOut_180_1;
                            break L60;
                          }
                        }
                        stackIn_182_0.field_J = stackIn_182_1 != 0;
                        var7_ref_cna.field_y = var4_int != 0;
                        var6++;
                        if (var26 == 0) {
                          continue L56;
                        } else {
                          break L55;
                        }
                      }
                    }
                  }
                }
              }
            }
            var6 = 0;
            stackOut_183_0 = 0;
            stackIn_184_0 = stackOut_183_0;
            break L54;
          }
          var7 = stackIn_184_0;
          L61: while (true) {
            L62: {
              L63: {
                if (var7 >= ocb.field_l) {
                  break L63;
                } else {
                  var8 = inb.field_q[4 - -var7];
                  stackOut_186_0 = param2;
                  stackIn_421_0 = stackOut_186_0 ? 1 : 0;
                  stackIn_187_0 = stackOut_186_0;
                  if (var26 != 0) {
                    break L62;
                  } else {
                    L64: {
                      if (!stackIn_187_0) {
                        stackOut_190_0 = 0;
                        stackIn_191_0 = stackOut_190_0;
                        break L64;
                      } else {
                        stackOut_189_0 = -1;
                        stackIn_191_0 = stackOut_189_0;
                        break L64;
                      }
                    }
                    var9 = stackIn_191_0;
                    L65: while (true) {
                      L66: {
                        L67: {
                          if (var9 >= -1 + var8.length) {
                            break L67;
                          } else {
                            var10 = 0;
                            var11 = 0;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            stackOut_193_0 = var4_int;
                            stackIn_419_0 = stackOut_193_0;
                            stackIn_194_0 = stackOut_193_0;
                            if (var26 != 0) {
                              break L66;
                            } else {
                              L68: {
                                if (stackIn_194_0 == 0) {
                                  break L68;
                                } else {
                                  if (var9 >= 0) {
                                    L69: {
                                      if (hia.field_o == null) {
                                        break L69;
                                      } else {
                                        if (hia.field_o[var7] == null) {
                                          break L69;
                                        } else {
                                          if (0 >= (~kbb.field_p & hia.field_o[var7][var9])) {
                                            break L69;
                                          } else {
                                            var14 = 1;
                                            var15 = wsb.a(hia.field_o[var7][var9] & ~kbb.field_p, 1302374146);
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                    L70: {
                                      if (null == qcb.field_o) {
                                        break L70;
                                      } else {
                                        if (qcb.field_o[var7] == null) {
                                          break L70;
                                        } else {
                                          if (0 < hcb.field_o) {
                                            break L70;
                                          } else {
                                            if (!qcb.field_o[var7][var9]) {
                                              break L70;
                                            } else {
                                              var10 = 1;
                                              break L70;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L71: {
                                      if (null == crb.field_w) {
                                        break L71;
                                      } else {
                                        if (null == crb.field_w[var7]) {
                                          break L71;
                                        } else {
                                          L72: {
                                            var16 = crb.field_w[var7][var9];
                                            if (var16 <= 0) {
                                              break L72;
                                            } else {
                                              if (~tg.field_q > ~var16) {
                                                var12 = 1;
                                                break L72;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                          if (var16 == 0) {
                                            break L71;
                                          } else {
                                            if (ufa.field_o) {
                                              break L71;
                                            } else {
                                              if (hcb.field_o > 0) {
                                                break L71;
                                              } else {
                                                var10 = 1;
                                                break L71;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L73: {
                                      L74: {
                                        if (!param2) {
                                          break L74;
                                        } else {
                                          if (nqa.field_b == null) {
                                            break L74;
                                          } else {
                                            if (nqa.field_b[var7] == null) {
                                              break L74;
                                            } else {
                                              if (!nqa.field_b[var7][var9]) {
                                                break L74;
                                              } else {
                                                stackOut_234_0 = 1;
                                                stackIn_236_0 = stackOut_234_0;
                                                break L73;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_235_0 = 0;
                                      stackIn_236_0 = stackOut_235_0;
                                      break L73;
                                    }
                                    var13 = stackIn_236_0;
                                    if (tab.field_p == null) {
                                      break L68;
                                    } else {
                                      if (tab.field_p[var7] == null) {
                                        break L68;
                                      } else {
                                        L75: {
                                          var16 = tab.field_p[var7][var9];
                                          if (var16 <= 0) {
                                            break L75;
                                          } else {
                                            if (var16 > cla.field_b) {
                                              var11 = 1;
                                              break L75;
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                        if (0 == var16) {
                                          break L68;
                                        } else {
                                          if (ufa.field_o) {
                                            break L68;
                                          } else {
                                            if (0 < hcb.field_o) {
                                              break L68;
                                            } else {
                                              var10 = 1;
                                              break L68;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              L76: {
                                if (go.field_p < 2) {
                                  break L76;
                                } else {
                                  if (!si.field_o[12]) {
                                    break L76;
                                  } else {
                                    var12 = 0;
                                    var10 = 0;
                                    var14 = 0;
                                    var11 = 0;
                                    var13 = 0;
                                    break L76;
                                  }
                                }
                              }
                              L77: {
                                L78: {
                                  if (var10 != 0) {
                                    break L78;
                                  } else {
                                    if (var11 != 0) {
                                      break L78;
                                    } else {
                                      if (var12 != 0) {
                                        break L78;
                                      } else {
                                        if (var13 != 0) {
                                          break L78;
                                        } else {
                                          if (var14 == 0) {
                                            stackOut_264_0 = 0;
                                            stackIn_265_0 = stackOut_264_0;
                                            break L77;
                                          } else {
                                            break L78;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_263_0 = 1;
                                stackIn_265_0 = stackOut_263_0;
                                break L77;
                              }
                              L79: {
                                var16 = stackIn_265_0;
                                hrb.field_b = true;
                                if (var16 != 0) {
                                  break L79;
                                } else {
                                  if (var9 < 0) {
                                    break L79;
                                  } else {
                                    if (null == ncb.field_a) {
                                      break L79;
                                    } else {
                                      L80: {
                                        if (!param2) {
                                          break L80;
                                        } else {
                                          if (!ii.field_h) {
                                            break L80;
                                          } else {
                                            break L79;
                                          }
                                        }
                                      }
                                      L81: {
                                        nr.field_p = false;
                                        hrb.field_b = false;
                                        if (tib.field_i == null) {
                                          tib.field_i = new byte[ocb.field_l];
                                          mia.field_a = new boolean[ocb.field_l];
                                          break L81;
                                        } else {
                                          break L81;
                                        }
                                      }
                                      var17_int = 0;
                                      L82: while (true) {
                                        L83: {
                                          L84: {
                                            if (~var7 >= ~var17_int) {
                                              break L84;
                                            } else {
                                              mia.field_a[var17_int] = false;
                                              var17_int++;
                                              if (var26 != 0) {
                                                break L83;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L82;
                                                } else {
                                                  break L84;
                                                }
                                              }
                                            }
                                          }
                                          bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                                          break L83;
                                        }
                                        L85: {
                                          if (2 > go.field_p) {
                                            break L85;
                                          } else {
                                            if (!si.field_o[12]) {
                                              break L85;
                                            } else {
                                              hrb.field_b = true;
                                              break L85;
                                            }
                                          }
                                        }
                                        if (hrb.field_b) {
                                          break L79;
                                        } else {
                                          var16 = 1;
                                          break L79;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L86: {
                                var17 = var8[var9 - -1];
                                if (var4_int == 0) {
                                  break L86;
                                } else {
                                  if (0 == var17.field_o) {
                                    break L86;
                                  } else {
                                    L87: {
                                      if (!param2) {
                                        break L87;
                                      } else {
                                        L88: {
                                          if (var9 == -1) {
                                            break L88;
                                          } else {
                                            nkb.field_p[(var9 + var6) / 8] = (byte)mgb.a((int) nkb.field_p[(var9 + var6) / 8], 1 << dla.a(var6 + var9, 7));
                                            if (var26 == 0) {
                                              break L86;
                                            } else {
                                              break L88;
                                            }
                                          }
                                        }
                                        var18 = var6;
                                        L89: while (true) {
                                          L90: {
                                            if (~(var6 - (-var8.length + 1)) >= ~var18) {
                                              break L90;
                                            } else {
                                              nkb.field_p[var18 / 8] = (byte)dla.a((int) nkb.field_p[var18 / 8], ~(1 << dla.a(7, var18)));
                                              var18++;
                                              if (var26 != 0) {
                                                break L86;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L89;
                                                } else {
                                                  break L90;
                                                }
                                              }
                                            }
                                          }
                                          if (var26 == 0) {
                                            break L86;
                                          } else {
                                            break L87;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 != 0) {
                                      break L86;
                                    } else {
                                      if (~(byte)var9 == ~param1.field_Pb[var7]) {
                                        break L86;
                                      } else {
                                        param1.field_Pb[var7] = (byte)var9;
                                        var5 = 1;
                                        break L86;
                                      }
                                    }
                                  }
                                }
                              }
                              L91: {
                                if (!param2) {
                                  break L91;
                                } else {
                                  if (var16 == 0) {
                                    break L91;
                                  } else {
                                    nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], ~(1 << dla.a(var9 + var6, 7)));
                                    break L91;
                                  }
                                }
                              }
                              L92: {
                                if (var9 < 0) {
                                  break L92;
                                } else {
                                  if (var17.field_Q) {
                                    L93: {
                                      if (hqb.field_k == null) {
                                        stackOut_323_0 = null;
                                        stackIn_324_0 = (String) (Object) stackOut_323_0;
                                        break L93;
                                      } else {
                                        if (null == hqb.field_k[var7]) {
                                          stackOut_322_0 = null;
                                          stackIn_324_0 = (String) (Object) stackOut_322_0;
                                          break L93;
                                        } else {
                                          stackOut_321_0 = hqb.field_k[var7][var9];
                                          stackIn_324_0 = stackOut_321_0;
                                          break L93;
                                        }
                                      }
                                    }
                                    L94: {
                                      var18_ref_String = stackIn_324_0;
                                      if (awa.field_o == null) {
                                        stackOut_329_0 = null;
                                        stackIn_330_0 = (String) (Object) stackOut_329_0;
                                        break L94;
                                      } else {
                                        if (null != awa.field_o[var7]) {
                                          stackOut_328_0 = awa.field_o[var7][var9];
                                          stackIn_330_0 = stackOut_328_0;
                                          break L94;
                                        } else {
                                          stackOut_327_0 = null;
                                          stackIn_330_0 = (String) (Object) stackOut_327_0;
                                          break L94;
                                        }
                                      }
                                    }
                                    L95: {
                                      var19_ref = stackIn_330_0;
                                      var20 = null;
                                      if (null == var19_ref) {
                                        break L95;
                                      } else {
                                        if (!var19_ref.equals((Object) (Object) var18_ref_String)) {
                                          var20 = (Object) (Object) var19_ref;
                                          break L95;
                                        } else {
                                          break L95;
                                        }
                                      }
                                    }
                                    L96: {
                                      var21 = null;
                                      if (var13 != 0) {
                                        var21 = (Object) (Object) k.field_q;
                                        break L96;
                                      } else {
                                        if (var10 != 0) {
                                          var21 = (Object) (Object) bpa.field_d;
                                          break L96;
                                        } else {
                                          L97: {
                                            if (var11 != 0) {
                                              var22_int = tab.field_p[var7][var9] + -cla.field_b;
                                              if (var22_int == 1) {
                                                var21 = (Object) (Object) wia.field_b;
                                                break L97;
                                              } else {
                                                var21 = (Object) (Object) isa.a(nra.field_a, new String[1], 105);
                                                break L97;
                                              }
                                            } else {
                                              break L97;
                                            }
                                          }
                                          L98: {
                                            if (var12 == 0) {
                                              break L98;
                                            } else {
                                              L99: {
                                                var22_ref = isa.a(gh.field_p, new String[2], 110);
                                                if (null == var21) {
                                                  break L99;
                                                } else {
                                                  var21 = (Object) (Object) ((String) var21 + "<br>" + var22_ref);
                                                  if (var26 == 0) {
                                                    break L98;
                                                  } else {
                                                    break L99;
                                                  }
                                                }
                                              }
                                              var21 = (Object) (Object) var22_ref;
                                              break L98;
                                            }
                                          }
                                          if (var14 == 0) {
                                            break L96;
                                          } else {
                                            L100: {
                                              var22_ref = lp.field_a;
                                              if (var15 <= 0) {
                                                break L100;
                                              } else {
                                                if (mta.field_a == null) {
                                                  break L100;
                                                } else {
                                                  if (~mta.field_a.length > ~var15) {
                                                    break L100;
                                                  } else {
                                                    if (null == mta.field_a[var15 + -1]) {
                                                      break L100;
                                                    } else {
                                                      var22_ref = mta.field_a[var15 - 1][0];
                                                      break L100;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L101: {
                                              L102: {
                                                if (var21 == null) {
                                                  break L102;
                                                } else {
                                                  var21 = (Object) (Object) ((String) var21 + "<br>" + var22_ref);
                                                  if (var26 == 0) {
                                                    break L101;
                                                  } else {
                                                    break L102;
                                                  }
                                                }
                                              }
                                              var21 = (Object) (Object) var22_ref;
                                              break L101;
                                            }
                                            break L96;
                                          }
                                        }
                                      }
                                    }
                                    L103: {
                                      if (var4_int == 0) {
                                        break L103;
                                      } else {
                                        if (!hrb.field_b) {
                                          L104: {
                                            var22_ref = null;
                                            var23 = 0;
                                            if (!nr.field_p) {
                                              break L104;
                                            } else {
                                              var22_ref = "</col>" + uda.field_a + "<col=A00000>";
                                              break L104;
                                            }
                                          }
                                          var24 = 0;
                                          L105: while (true) {
                                            L106: {
                                              L107: {
                                                if (~var7 >= ~var24) {
                                                  break L107;
                                                } else {
                                                  stackOut_371_0 = mia.field_a[var24];
                                                  stackIn_379_0 = stackOut_371_0 ? 1 : 0;
                                                  stackIn_372_0 = stackOut_371_0;
                                                  if (var26 != 0) {
                                                    break L106;
                                                  } else {
                                                    L108: {
                                                      if (!stackIn_372_0) {
                                                        break L108;
                                                      } else {
                                                        L109: {
                                                          var25 = "</col>" + hva.field_c[var24] + "<col=A00000>";
                                                          if (null == var22_ref) {
                                                            break L109;
                                                          } else {
                                                            var23 = 1;
                                                            var22_ref = var22_ref + ", " + var25;
                                                            if (var26 == 0) {
                                                              break L108;
                                                            } else {
                                                              break L109;
                                                            }
                                                          }
                                                        }
                                                        var22_ref = var25;
                                                        break L108;
                                                      }
                                                    }
                                                    var24++;
                                                    if (var26 == 0) {
                                                      continue L105;
                                                    } else {
                                                      break L107;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_378_0 = var23;
                                              stackIn_379_0 = stackOut_378_0;
                                              break L106;
                                            }
                                            L110: {
                                              if (stackIn_379_0 == 0) {
                                                break L110;
                                              } else {
                                                var21 = (Object) (Object) (nna.field_F + var22_ref);
                                                if (var26 == 0) {
                                                  break L103;
                                                } else {
                                                  break L110;
                                                }
                                              }
                                            }
                                            var21 = (Object) (Object) isa.a(fra.field_c, new String[1], 78);
                                            break L103;
                                          }
                                        } else {
                                          break L103;
                                        }
                                      }
                                    }
                                    L111: {
                                      if (var21 == null) {
                                        break L111;
                                      } else {
                                        L112: {
                                          var21 = (Object) (Object) ("<col=A00000>" + (String) var21);
                                          var21 = (Object) (Object) jd.a((String) var21, "<br>", 0, "<br><col=A00000>");
                                          if (null != var20) {
                                            break L112;
                                          } else {
                                            var20 = var21;
                                            if (var26 == 0) {
                                              break L111;
                                            } else {
                                              break L112;
                                            }
                                          }
                                        }
                                        var20 = (Object) (Object) ((String) var20 + "<br>" + (String) var21);
                                        break L111;
                                      }
                                    }
                                    if (null == var20) {
                                      break L92;
                                    } else {
                                      lob.field_a = (String) var20;
                                      break L92;
                                    }
                                  } else {
                                    break L92;
                                  }
                                }
                              }
                              L113: {
                                L114: {
                                  L115: {
                                    L116: {
                                      L117: {
                                        if (!param2) {
                                          break L117;
                                        } else {
                                          L118: {
                                            if (var9 == -1) {
                                              break L118;
                                            } else {
                                              L119: {
                                                stackOut_391_0 = (cna) var17;
                                                stackIn_394_0 = stackOut_391_0;
                                                stackIn_392_0 = stackOut_391_0;
                                                if ((nkb.field_p[(var6 - -var9) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                                                  stackOut_394_0 = (cna) (Object) stackIn_394_0;
                                                  stackOut_394_1 = 0;
                                                  stackIn_395_0 = stackOut_394_0;
                                                  stackIn_395_1 = stackOut_394_1;
                                                  break L119;
                                                } else {
                                                  stackOut_392_0 = (cna) (Object) stackIn_392_0;
                                                  stackIn_393_0 = stackOut_392_0;
                                                  stackOut_393_0 = (cna) (Object) stackIn_393_0;
                                                  stackOut_393_1 = 1;
                                                  stackIn_395_0 = stackOut_393_0;
                                                  stackIn_395_1 = stackOut_393_1;
                                                  break L119;
                                                }
                                              }
                                              stackIn_395_0.field_J = stackIn_395_1 != 0;
                                              if (var26 == 0) {
                                                break L113;
                                              } else {
                                                break L118;
                                              }
                                            }
                                          }
                                          var17.field_J = true;
                                          var18 = var6;
                                          L120: while (true) {
                                            L121: {
                                              if (var18 >= var6 - (-var8.length + 1)) {
                                                break L121;
                                              } else {
                                                stackOut_398_0 = (cna) var17;
                                                stackOut_398_1 = var17.field_J;
                                                stackOut_398_2 = 0;
                                                stackOut_398_3 = nkb.field_p[var18 / 8] & 1 << (var18 & 7);
                                                stackIn_408_0 = stackOut_398_0;
                                                stackIn_408_1 = stackOut_398_1 ? 1 : 0;
                                                stackIn_408_2 = stackOut_398_2;
                                                stackIn_408_3 = stackOut_398_3;
                                                stackIn_399_0 = stackOut_398_0;
                                                stackIn_399_1 = stackOut_398_1;
                                                stackIn_399_2 = stackOut_398_2;
                                                stackIn_399_3 = stackOut_398_3;
                                                if (var26 != 0) {
                                                  break L116;
                                                } else {
                                                  L122: {
                                                    stackOut_399_0 = (cna) (Object) stackIn_399_0;
                                                    stackOut_399_1 = stackIn_399_1;
                                                    stackIn_402_0 = stackOut_399_0;
                                                    stackIn_402_1 = stackOut_399_1;
                                                    stackIn_400_0 = stackOut_399_0;
                                                    stackIn_400_1 = stackOut_399_1;
                                                    if (stackIn_399_2 != stackIn_399_3) {
                                                      stackOut_402_0 = (cna) (Object) stackIn_402_0;
                                                      stackOut_402_1 = stackIn_402_1;
                                                      stackOut_402_2 = 0;
                                                      stackIn_403_0 = stackOut_402_0;
                                                      stackIn_403_1 = stackOut_402_1;
                                                      stackIn_403_2 = stackOut_402_2;
                                                      break L122;
                                                    } else {
                                                      stackOut_400_0 = (cna) (Object) stackIn_400_0;
                                                      stackOut_400_1 = stackIn_400_1;
                                                      stackIn_401_0 = stackOut_400_0;
                                                      stackIn_401_1 = stackOut_400_1;
                                                      stackOut_401_0 = (cna) (Object) stackIn_401_0;
                                                      stackOut_401_1 = stackIn_401_1;
                                                      stackOut_401_2 = 1;
                                                      stackIn_403_0 = stackOut_401_0;
                                                      stackIn_403_1 = stackOut_401_1;
                                                      stackIn_403_2 = stackOut_401_2;
                                                      break L122;
                                                    }
                                                  }
                                                  stackIn_403_0.field_J = stackIn_403_1 & stackIn_403_2 != 0;
                                                  var18++;
                                                  if (var26 == 0) {
                                                    continue L120;
                                                  } else {
                                                    break L121;
                                                  }
                                                }
                                              }
                                            }
                                            if (var26 == 0) {
                                              break L113;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_405_0 = (cna) var17;
                                      stackIn_410_0 = stackOut_405_0;
                                      stackIn_406_0 = stackOut_405_0;
                                      if (!hrb.field_b) {
                                        break L115;
                                      } else {
                                        stackOut_406_0 = (cna) (Object) stackIn_406_0;
                                        stackIn_407_0 = stackOut_406_0;
                                        stackOut_407_0 = (cna) (Object) stackIn_407_0;
                                        stackOut_407_1 = ~(byte)var9;
                                        stackOut_407_2 = param1.field_Pb[var7];
                                        stackOut_407_3 = -1;
                                        stackIn_408_0 = stackOut_407_0;
                                        stackIn_408_1 = stackOut_407_1;
                                        stackIn_408_2 = stackOut_407_2;
                                        stackIn_408_3 = stackOut_407_3;
                                        break L116;
                                      }
                                    }
                                    stackOut_408_0 = (cna) (Object) stackIn_408_0;
                                    stackIn_410_0 = stackOut_408_0;
                                    stackIn_409_0 = stackOut_408_0;
                                    if (stackIn_408_1 != (stackIn_408_2 ^ stackIn_408_3)) {
                                      break L115;
                                    } else {
                                      stackOut_409_0 = (cna) (Object) stackIn_409_0;
                                      stackOut_409_1 = 1;
                                      stackIn_411_0 = stackOut_409_0;
                                      stackIn_411_1 = stackOut_409_1;
                                      break L114;
                                    }
                                  }
                                  stackOut_410_0 = (cna) (Object) stackIn_410_0;
                                  stackOut_410_1 = 0;
                                  stackIn_411_0 = stackOut_410_0;
                                  stackIn_411_1 = stackOut_410_1;
                                  break L114;
                                }
                                stackIn_411_0.field_J = stackIn_411_1 != 0;
                                break L113;
                              }
                              L123: {
                                L124: {
                                  stackOut_412_0 = (cna) var17;
                                  stackIn_416_0 = stackOut_412_0;
                                  stackIn_413_0 = stackOut_412_0;
                                  if (var4_int == 0) {
                                    break L124;
                                  } else {
                                    stackOut_413_0 = (cna) (Object) stackIn_413_0;
                                    stackIn_416_0 = stackOut_413_0;
                                    stackIn_414_0 = stackOut_413_0;
                                    if (var16 != 0) {
                                      break L124;
                                    } else {
                                      stackOut_414_0 = (cna) (Object) stackIn_414_0;
                                      stackIn_415_0 = stackOut_414_0;
                                      stackOut_415_0 = (cna) (Object) stackIn_415_0;
                                      stackOut_415_1 = 1;
                                      stackIn_417_0 = stackOut_415_0;
                                      stackIn_417_1 = stackOut_415_1;
                                      break L123;
                                    }
                                  }
                                }
                                stackOut_416_0 = (cna) (Object) stackIn_416_0;
                                stackOut_416_1 = 0;
                                stackIn_417_0 = stackOut_416_0;
                                stackIn_417_1 = stackOut_416_1;
                                break L123;
                              }
                              stackIn_417_0.field_y = stackIn_417_1 != 0;
                              var9++;
                              if (var26 == 0) {
                                continue L65;
                              } else {
                                break L67;
                              }
                            }
                          }
                        }
                        stackOut_418_0 = var6 + (255 & vu.field_zb[var7]);
                        stackIn_419_0 = stackOut_418_0;
                        break L66;
                      }
                      var6 = stackIn_419_0;
                      var7++;
                      if (var26 == 0) {
                        continue L61;
                      } else {
                        break L63;
                      }
                    }
                  }
                }
              }
              stackOut_420_0 = var5;
              stackIn_421_0 = stackOut_420_0;
              break L62;
            }
            L125: {
              if (stackIn_421_0 == 0) {
                break L125;
              } else {
                if (!param2) {
                  bh.a(param0, true);
                  break L125;
                } else {
                  break L125;
                }
              }
            }
            return;
          }
        }
    }

    final int a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.b((byte) 127, param1)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param2 = param2.toLowerCase();
              var4_int = ((asb) this).field_g.field_p[param1].a(-123454015, vla.a((byte) 122, (CharSequence) (Object) param2));
              if (param0) {
                if (!this.a(var4_int, param1, 0)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var4_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 78;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("asb.T(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    private final synchronized boolean b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = -101 % ((85 - param0) / 33);
            if (((asb) this).b((byte) 103)) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (~((asb) this).field_g.field_m.length >= ~param1) {
                    break L1;
                  } else {
                    if (0 == ((asb) this).field_g.field_m[param1]) {
                      break L1;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
              }
              if (!sl.field_b) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param1));
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((asb) this).field_e = ((boolean[]) ((Object[]) ((asb) this).field_i[30])[11])[9];
                break L1;
              }
            }
            if (((asb) this).b((byte) -77)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 114, (CharSequence) (Object) param2));
              if (this.b((byte) -28, var4_int)) {
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 116, (CharSequence) (Object) param0));
                stackOut_9_0 = ((asb) this).a(var4_int, var5, (byte) 13);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("asb.U(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 116)) {
              L1: {
                param1 = param1.toLowerCase();
                var3_int = ((asb) this).field_g.field_a.a(param0 + -123486186, vla.a((byte) 127, (CharSequence) (Object) param1));
                if (param0 == 32171) {
                  break L1;
                } else {
                  boolean discarded$2 = ((asb) this).a(-117, (String) null);
                  break L1;
                }
              }
              stackOut_6_0 = ((asb) this).c(121, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("asb.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b((byte) -40, param1)) {
              if (((asb) this).field_i[param1] != null) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  this.a((byte) -92, param1);
                  if (param0 > 46) {
                    break L1;
                  } else {
                    int discarded$2 = ((asb) this).b(((int[]) ((asb) this).field_i[8])[0]);
                    break L1;
                  }
                }
                if (((asb) this).field_i[param1] == null) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 77)) {
              if (param0) {
                param1 = param1.toLowerCase();
                var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 108, (CharSequence) (Object) param1));
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((Object[]) ((asb) this).field_i[13])[2])[12];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("asb.BA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (null != ((asb) this).field_g) {
                break L1;
              } else {
                ((asb) this).field_g = ((asb) this).field_d.a((byte) 9);
                if (((asb) this).field_g != null) {
                  ((asb) this).field_c = new Object[((asb) this).field_g.field_l][];
                  ((asb) this).field_i = new Object[((asb) this).field_g.field_l];
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            var2_int = -12 / ((param0 - 21) / 56);
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "asb.CA(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (((asb) this).b((byte) 84)) {
              var2_int = 1;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((asb) this).field_g.field_i.length >= ~var3) {
                      break L3;
                    } else {
                      var4 = ((asb) this).field_g.field_i[var3];
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == ((asb) this).field_i[var4]) {
                            this.a((byte) -122, var4);
                            if (((asb) this).field_i[var4] == null) {
                              var2_int = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 >= 1) {
                    break L2;
                  } else {
                    ((asb) this).field_g = null;
                    break L2;
                  }
                }
                stackOut_20_0 = var2_int;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "asb.O(" + param0 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static void a(int param0, String param1, byte[] param2, int param3, String param4) {
        try {
            if (param3 >= -68) {
                asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
            }
            File var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
            {
                oj.a(var5, 3, param2, param0);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            var5_int = -73 % ((param1 - 20) / 48);
            if (this.a(param3, param0, 0)) {
              L1: {
                L2: {
                  var6 = null;
                  if (null == ((asb) this).field_c[param0]) {
                    break L2;
                  } else {
                    if (null == ((asb) this).field_c[param0][param3]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var7 = this.a(param3, 0, param0, param2) ? 1 : 0;
                if (var7 == 0) {
                  this.a((byte) -78, param0);
                  var7 = this.a(param3, 0, param0, param2) ? 1 : 0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (byte[]) (Object) stackIn_14_0;
                  }
                } else {
                  break L1;
                }
              }
              if (null != ((asb) this).field_c[param0]) {
                L3: {
                  if (((asb) this).field_c[param0][param3] == null) {
                    break L3;
                  } else {
                    var6 = (Object) (Object) ffb.a(false, ((asb) this).field_c[param0][param3], true);
                    if (null == var6) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var6) {
                    L5: {
                      if (((asb) this).field_h == 1) {
                        break L5;
                      } else {
                        if (2 != ((asb) this).field_h) {
                          break L4;
                        } else {
                          ((asb) this).field_c[param0] = null;
                          if (VoidHunters.field_G == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    ((asb) this).field_c[param0][param3] = null;
                    if (((asb) this).field_g.field_m[param0] != 1) {
                      break L4;
                    } else {
                      ((asb) this).field_c[param0] = null;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_38_0 = var6;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var5;
            stackOut_40_1 = new StringBuilder().append("asb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L6;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_39_0;
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            int var1_int = -114 % ((param0 - 25) / 54);
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "asb.E(" + param0 + ')');
        }
    }

    private final synchronized void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((asb) this).field_e) {
                  break L2;
                } else {
                  ((asb) this).field_i[param1] = gfb.a(false, ((asb) this).field_d.a(127, param1), -12445);
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((asb) this).field_i[param1] = (Object) (Object) ((asb) this).field_d.a(118, param1);
              break L1;
            }
            L3: {
              if (param0 < -67) {
                break L3;
              } else {
                ((long[]) ((asb) this).field_i[9])[11] = -71L;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((asb) this).b((byte) 83)) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (param1 >= ((asb) this).field_g.field_m.length) {
                      break L1;
                    } else {
                      if (~param0 > ~((asb) this).field_g.field_m[param1]) {
                        L2: {
                          if (param2 == 0) {
                            break L2;
                          } else {
                            boolean discarded$2 = ((asb) this).a(((int[]) ((asb) this).field_i[0])[0], (String) null);
                            break L2;
                          }
                        }
                        stackOut_22_0 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (sl.field_b) {
                throw new IllegalArgumentException(param1 + " " + param0);
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "asb.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) -106)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == -107) {
                  break L1;
                } else {
                  ((asb) this).field_c = (Object[][]) ((Object[]) ((Object[]) ((asb) this).field_i[6])[6])[0];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 127, (CharSequence) (Object) param2));
              if (var4_int >= 0) {
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 123, (CharSequence) (Object) param1));
                if (var5 >= 0) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("asb.W(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final byte[] a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        try {
          L0: {
            if (param2 == 13) {
              stackOut_3_0 = this.a(param0, -83, (int[]) null, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) ((asb) this).field_i[0];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "asb.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) 82)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  ((asb) this).field_c = null;
                  break L1;
                }
              }
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 120, (CharSequence) (Object) param2));
              if (!this.b((byte) 125, var4_int)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 108, (CharSequence) (Object) param1));
                stackOut_13_0 = ((asb) this).a((byte) 84, var5, var4_int);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("asb.DA(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_6_0 = false;
        try {
          if (!((asb) this).b((byte) 81)) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            if (((asb) this).field_g.field_m.length != 1) {
              if (this.b((byte) 121, param0)) {
                L0: {
                  if (param1) {
                    break L0;
                  } else {
                    ((asb) this).field_i[1] = null;
                    break L0;
                  }
                }
                if (((asb) this).field_g.field_m[param0] != 1) {
                  throw new RuntimeException();
                } else {
                  stackOut_15_0 = ((asb) this).a((byte) 97, 0, param0);
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            } else {
              stackOut_6_0 = ((asb) this).a((byte) 95, param0, 0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.I(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (!((asb) this).b((byte) 109)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~((asb) this).field_i.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~((asb) this).field_g.field_j[var4];
                      stackIn_15_0 = stackOut_8_0;
                      stackIn_15_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 <= stackIn_9_1) {
                            break L4;
                          } else {
                            var3 = var3 + ((asb) this).a(var4, 1045);
                            var2_int += 100;
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackOut_14_1 = var2_int;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                }
                if (stackIn_15_0 != stackIn_15_1) {
                  L5: {
                    if (param0 <= -101) {
                      break L5;
                    } else {
                      ((asb) this).field_h = 103;
                      break L5;
                    }
                  }
                  var4 = var3 * 100 / var2_int;
                  stackOut_21_0 = var4;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_16_0 = 100;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "asb.P(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -6942) {
                break L1;
              } else {
                ((asb) this).field_i[2] = ((Object[]) ((asb) this).field_i[3])[1];
                break L1;
              }
            }
            if (this.b((byte) -33, param0)) {
              stackOut_6_0 = ((asb) this).field_g.field_m[param0];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "asb.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_14_0 = false;
        try {
          L0: {
            if (!this.a(param1, param2, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((asb) this).field_c[param2] == null) {
                  break L1;
                } else {
                  if (null != ((asb) this).field_c[param2][param1]) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 > 56) {
                if (null == ((asb) this).field_i[param2]) {
                  this.a((byte) -116, param2);
                  if (((asb) this).field_i[param2] != null) {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  }
                } else {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                }
              } else {
                stackOut_14_0 = ((boolean[]) ((asb) this).field_i[7])[0];
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "asb.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        ds var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ds var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_77_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_160_0 = 0;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_165_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_76_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_159_0 = 0;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.b((byte) 120, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((asb) this).field_i[param2]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                L1: {
                  var5_int = ((asb) this).field_g.field_j[param2];
                  var6 = ((asb) this).field_g.field_g[param2];
                  if (null == ((asb) this).field_c[param2]) {
                    ((asb) this).field_c[param2] = new Object[((asb) this).field_g.field_m[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((asb) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (null == var6) {
                                break L6;
                              } else {
                                var10_int = var6[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var9_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] == null) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L3;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (param3 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (param3[0] != 0) {
                            break L10;
                          } else {
                            if (param3[1] != 0) {
                              break L10;
                            } else {
                              if (param3[2] != 0) {
                                break L10;
                              } else {
                                if (0 == param3[3]) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = ffb.a(true, ((asb) this).field_i[param2], true);
                        var10_ref = new ds(var9_array);
                        var10_ref.a(5, param3, var10_ref.field_h.length, false);
                        break L8;
                      }
                    }
                    var9_array = ffb.a(false, ((asb) this).field_i[param2], true);
                    break L8;
                  }
                  try {
                    L11: {
                      var10 = rob.a(param1, var9_array);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_50_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_50_1 = new StringBuilder();
                      stackIn_53_0 = stackOut_50_0;
                      stackIn_53_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (param3 == null) {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        stackIn_54_2 = stackOut_53_2;
                        break L12;
                      } else {
                        stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                        stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                        stackOut_51_2 = 1;
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_54_2 = stackOut_51_2;
                        break L12;
                      }
                    }
                    throw rta.a((Throwable) (Object) stackIn_54_0, (stackIn_54_2 != 0) + " " + param2 + " " + var9_array.length + " " + psb.a(var9_array, var9_array.length, 0) + " " + psb.a(var9_array, -2 + var9_array.length, 0) + " " + ((asb) this).field_g.field_d[param2] + " " + ((asb) this).field_g.field_k);
                  }
                  L13: {
                    if (!((asb) this).field_e) {
                      break L13;
                    } else {
                      ((asb) this).field_i[param2] = null;
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (1 < var5_int) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (var6 == null) {
                                break L18;
                              } else {
                                var11 = var6[0];
                                if (var22 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var11 = 0;
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (((asb) this).field_h != 0) {
                                break L20;
                              } else {
                                var7[var11] = gfb.a(false, var10, -12445);
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = (Object) (Object) var10;
                            break L19;
                          }
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (((asb) this).field_h == 2) {
                          break L21;
                        } else {
                          var11 = var10.length;
                          var11--;
                          var12 = var10[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var13 = new ds(var10);
                          var13.field_e = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L22: while (true) {
                            L23: {
                              L24: {
                                if (var15 >= var12) {
                                  break L24;
                                } else {
                                  var16_int = 0;
                                  stackOut_76_0 = 0;
                                  stackIn_86_0 = stackOut_76_0;
                                  stackIn_77_0 = stackOut_76_0;
                                  if (var22 != 0) {
                                    break L23;
                                  } else {
                                    var17 = stackIn_77_0;
                                    L25: while (true) {
                                      L26: {
                                        L27: {
                                          if (var17 >= var5_int) {
                                            break L27;
                                          } else {
                                            var16_int = var16_int + var13.h(68);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                            var17++;
                                            if (var22 != 0) {
                                              break L26;
                                            } else {
                                              if (var22 == 0) {
                                                continue L25;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        var15++;
                                        break L26;
                                      }
                                      if (var22 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_85_0 = var5_int;
                              stackIn_86_0 = stackOut_85_0;
                              break L23;
                            }
                            var15_ref_byte____ = new byte[stackIn_86_0][];
                            var16_int = 0;
                            L28: while (true) {
                              L29: {
                                L30: {
                                  if (~var16_int <= ~var5_int) {
                                    break L30;
                                  } else {
                                    var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                    var14_ref_int__[var16_int] = 0;
                                    var16_int++;
                                    if (var22 != 0) {
                                      break L29;
                                    } else {
                                      if (var22 == 0) {
                                        continue L28;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                }
                                var13.field_e = var11;
                                var16_int = 0;
                                break L29;
                              }
                              var17 = 0;
                              L31: while (true) {
                                L32: {
                                  L33: {
                                    if (~var17 <= ~var12) {
                                      break L33;
                                    } else {
                                      var18 = 0;
                                      stackOut_95_0 = 0;
                                      stackIn_105_0 = stackOut_95_0;
                                      stackIn_96_0 = stackOut_95_0;
                                      if (var22 != 0) {
                                        break L32;
                                      } else {
                                        var19 = stackIn_96_0;
                                        L34: while (true) {
                                          L35: {
                                            L36: {
                                              if (~var19 <= ~var5_int) {
                                                break L36;
                                              } else {
                                                var18 = var18 + var13.h(param1 ^ 19);
                                                cua.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var16_int = var16_int + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L35;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L34;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L35;
                                          }
                                          if (var22 == 0) {
                                            continue L31;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_104_0 = 0;
                                  stackIn_105_0 = stackOut_104_0;
                                  break L32;
                                }
                                var17 = stackIn_105_0;
                                L37: while (true) {
                                  L38: {
                                    if (var5_int <= var17) {
                                      break L38;
                                    } else {
                                      if (var22 != 0) {
                                        break L15;
                                      } else {
                                        L39: {
                                          L40: {
                                            if (var6 == null) {
                                              break L40;
                                            } else {
                                              var18 = var6[var17];
                                              if (var22 == 0) {
                                                break L39;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                          var18 = var17;
                                          break L39;
                                        }
                                        L41: {
                                          L42: {
                                            if (0 == ((asb) this).field_h) {
                                              break L42;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              if (var22 == 0) {
                                                break L41;
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                          var7[var18] = gfb.a(false, var15_ref_byte____[var17], -12445);
                                          break L41;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L15;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var10.length;
                      var11--;
                      var12 = 255 & var10[var11];
                      var11 = var11 - var12 * var5_int * 4;
                      var13 = new ds(var10);
                      var14 = 0;
                      var15 = 0;
                      var13.field_e = var11;
                      var16_int = 0;
                      L43: while (true) {
                        L44: {
                          L45: {
                            if (var12 <= var16_int) {
                              break L45;
                            } else {
                              var17 = 0;
                              stackOut_123_0 = 0;
                              stackIn_138_0 = stackOut_123_0;
                              stackIn_124_0 = stackOut_123_0;
                              if (var22 != 0) {
                                break L44;
                              } else {
                                var18 = stackIn_124_0;
                                L46: while (true) {
                                  L47: {
                                    L48: {
                                      if (~var18 <= ~var5_int) {
                                        break L48;
                                      } else {
                                        var17 = var17 + var13.h(param1 + 37);
                                        if (var22 != 0) {
                                          break L47;
                                        } else {
                                          L49: {
                                            L50: {
                                              if (var6 == null) {
                                                break L50;
                                              } else {
                                                var19 = var6[var18];
                                                if (var22 == 0) {
                                                  break L49;
                                                } else {
                                                  break L50;
                                                }
                                              }
                                            }
                                            var19 = var18;
                                            break L49;
                                          }
                                          L51: {
                                            if (~param0 != ~var19) {
                                              break L51;
                                            } else {
                                              var15 = var19;
                                              var14 = var14 + var17;
                                              break L51;
                                            }
                                          }
                                          var18++;
                                          if (var22 == 0) {
                                            continue L46;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    var16_int++;
                                    break L47;
                                  }
                                  if (var22 == 0) {
                                    continue L43;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_137_0 = var14;
                          stackIn_138_0 = stackOut_137_0;
                          break L44;
                        }
                        if (stackIn_138_0 == 0) {
                          stackOut_140_0 = 1;
                          stackIn_141_0 = stackOut_140_0;
                          return stackIn_141_0 != 0;
                        } else {
                          var16 = new byte[var14];
                          var13.field_e = var11;
                          var14 = 0;
                          var17 = 0;
                          var18 = 0;
                          L52: while (true) {
                            L53: {
                              if (~var12 >= ~var18) {
                                break L53;
                              } else {
                                var19 = 0;
                                stackOut_144_0 = 0;
                                stackIn_160_0 = stackOut_144_0;
                                stackIn_145_0 = stackOut_144_0;
                                if (var22 != 0) {
                                  break L14;
                                } else {
                                  var20 = stackIn_145_0;
                                  L54: while (true) {
                                    L55: {
                                      L56: {
                                        if (var5_int <= var20) {
                                          break L56;
                                        } else {
                                          var19 = var19 + var13.h(46);
                                          if (var22 != 0) {
                                            break L55;
                                          } else {
                                            L57: {
                                              L58: {
                                                if (null == var6) {
                                                  break L58;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L57;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L57;
                                            }
                                            L59: {
                                              if (param0 != var21) {
                                                break L59;
                                              } else {
                                                cua.a(var10, var17, var16, var14, var19);
                                                var14 = var14 + var19;
                                                break L59;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            if (var22 == 0) {
                                              continue L54;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      break L55;
                                    }
                                    if (var22 == 0) {
                                      continue L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var15] = (Object) (Object) var16;
                            break L15;
                          }
                        }
                      }
                    }
                    stackOut_159_0 = 1;
                    stackIn_160_0 = stackOut_159_0;
                    break L14;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_161_0 = (RuntimeException) var5;
            stackOut_161_1 = new StringBuilder().append("asb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_164_0 = stackOut_161_0;
            stackIn_164_1 = stackOut_161_1;
            stackIn_162_0 = stackOut_161_0;
            stackIn_162_1 = stackOut_161_1;
            if (param3 == null) {
              stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
              stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
              stackOut_164_2 = "null";
              stackIn_165_0 = stackOut_164_0;
              stackIn_165_1 = stackOut_164_1;
              stackIn_165_2 = stackOut_164_2;
              break L60;
            } else {
              stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
              stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
              stackOut_162_2 = "{...}";
              stackIn_165_0 = stackOut_162_0;
              stackIn_165_1 = stackOut_162_1;
              stackIn_165_2 = stackOut_162_2;
              break L60;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_165_0, stackIn_165_2 + ')');
        }
        return stackIn_160_0 != 0;
    }

    asb(fnb param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((asb) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((asb) this).field_e = param1;
                  ((asb) this).field_h = param2;
                  ((asb) this).field_d = param0;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("asb.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Teams have been balanced";
        field_f = 1;
    }
}
