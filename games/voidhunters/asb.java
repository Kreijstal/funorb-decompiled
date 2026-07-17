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
        if (!((asb) this).b((byte) -59)) {
            return null;
        }
        if (param0 != 9) {
            int discarded$0 = ((asb) this).a((String) null, 14);
        }
        if (((asb) this).field_g.field_m.length == 1) {
            return ((asb) this).a(0, param1, (byte) 13);
        }
        if (!this.b((byte) 125, param1)) {
            return null;
        }
        if (!(((asb) this).field_g.field_m[param1] != 1)) {
            return ((asb) this).a(param1, 0, (byte) 13);
        }
        throw new RuntimeException();
    }

    final int c(byte param0) {
        if (!((asb) this).b((byte) 88)) {
          return -1;
        } else {
          L0: {
            if (param0 >= 37) {
              break L0;
            } else {
              int discarded$2 = ((asb) this).a(86, -10);
              break L0;
            }
          }
          return ((asb) this).field_g.field_m.length;
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 106)) {
              if (param1 == -2118) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((asb) this).field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, var4));
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
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) -117)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 109, var4));
              if (!this.b((byte) -72, var3_int)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param1 <= -69) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((asb) this).c(((int[]) ((asb) this).field_i[12])[7], ((int[]) ((Object[]) ((asb) this).field_i[2])[2])[7]);
                    break L1;
                  }
                }
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("asb.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized int a(int param0, int param1) {
        if (this.b((byte) -121, param0)) {
          if (((asb) this).field_i[param0] == null) {
            if (param1 != 1045) {
              return -57;
            } else {
              return ((asb) this).field_d.a(param0, false);
            }
          } else {
            return 100;
          }
        } else {
          return 0;
        }
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
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        cna[] var27 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        cna stackIn_31_0 = null;
        cna stackIn_32_0 = null;
        cna stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        cna stackIn_38_0 = null;
        cna stackIn_39_0 = null;
        cna stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        cna stackIn_91_0 = null;
        cna stackIn_92_0 = null;
        cna stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        cna stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
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
        int stackIn_112_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_120_0 = 0;
        cna stackIn_131_0 = null;
        cna stackIn_132_0 = null;
        cna stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        cna stackIn_136_0 = null;
        cna stackIn_137_0 = null;
        cna stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        cna stackIn_140_0 = null;
        cna stackIn_141_0 = null;
        cna stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        cna stackIn_144_0 = null;
        cna stackIn_145_0 = null;
        cna stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_156_0 = 0;
        String stackIn_164_0 = null;
        cna stackIn_168_0 = null;
        cna stackIn_169_0 = null;
        cna stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        cna stackIn_171_0 = null;
        cna stackIn_172_0 = null;
        cna stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        int stackIn_175_0 = 0;
        boolean stackIn_178_0 = false;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_233_0 = 0;
        boolean stackIn_319_0 = false;
        int stackIn_325_0 = 0;
        cna stackIn_337_0 = null;
        cna stackIn_338_0 = null;
        cna stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        cna stackIn_343_0 = null;
        boolean stackIn_343_1 = false;
        int stackIn_343_2 = 0;
        int stackIn_343_3 = 0;
        cna stackIn_344_0 = null;
        boolean stackIn_344_1 = false;
        cna stackIn_345_0 = null;
        boolean stackIn_345_1 = false;
        cna stackIn_346_0 = null;
        boolean stackIn_346_1 = false;
        int stackIn_346_2 = 0;
        cna stackIn_349_0 = null;
        cna stackIn_350_0 = null;
        int stackIn_350_1 = 0;
        int stackIn_350_2 = 0;
        int stackIn_350_3 = 0;
        cna stackIn_351_0 = null;
        cna stackIn_352_0 = null;
        cna stackIn_353_0 = null;
        int stackIn_353_1 = 0;
        cna stackIn_355_0 = null;
        cna stackIn_356_0 = null;
        cna stackIn_357_0 = null;
        cna stackIn_358_0 = null;
        int stackIn_358_1 = 0;
        int stackIn_360_0 = 0;
        int stackIn_362_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_25_0 = 0;
        cna stackOut_30_0 = null;
        cna stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        cna stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        cna stackOut_37_0 = null;
        cna stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        cna stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        boolean stackOut_41_0 = false;
        int stackOut_52_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        cna stackOut_90_0 = null;
        cna stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        cna stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        cna stackOut_97_0 = null;
        boolean stackOut_97_1 = false;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        cna stackOut_98_0 = null;
        boolean stackOut_98_1 = false;
        cna stackOut_100_0 = null;
        boolean stackOut_100_1 = false;
        int stackOut_100_2 = 0;
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
        int stackOut_110_1 = 0;
        cna stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        boolean stackOut_113_0 = false;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_119_0 = 0;
        cna stackOut_130_0 = null;
        cna stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        cna stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        cna stackOut_135_0 = null;
        cna stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        cna stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        cna stackOut_139_0 = null;
        cna stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        cna stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        cna stackOut_143_0 = null;
        cna stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        cna stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_155_0 = 0;
        Object stackOut_163_0 = null;
        String stackOut_162_0 = null;
        cna stackOut_167_0 = null;
        cna stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        cna stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        cna stackOut_170_0 = null;
        cna stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        cna stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        int stackOut_174_0 = 0;
        boolean stackOut_177_0 = false;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_231_0 = 0;
        boolean stackOut_318_0 = false;
        int stackOut_324_0 = 0;
        cna stackOut_336_0 = null;
        cna stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        cna stackOut_337_0 = null;
        int stackOut_337_1 = 0;
        cna stackOut_342_0 = null;
        boolean stackOut_342_1 = false;
        int stackOut_342_2 = 0;
        int stackOut_342_3 = 0;
        cna stackOut_343_0 = null;
        boolean stackOut_343_1 = false;
        cna stackOut_345_0 = null;
        boolean stackOut_345_1 = false;
        int stackOut_345_2 = 0;
        cna stackOut_344_0 = null;
        boolean stackOut_344_1 = false;
        int stackOut_344_2 = 0;
        cna stackOut_348_0 = null;
        cna stackOut_349_0 = null;
        int stackOut_349_1 = 0;
        byte stackOut_349_2 = 0;
        int stackOut_349_3 = 0;
        cna stackOut_350_0 = null;
        cna stackOut_351_0 = null;
        int stackOut_351_1 = 0;
        cna stackOut_352_0 = null;
        int stackOut_352_1 = 0;
        cna stackOut_354_0 = null;
        cna stackOut_355_0 = null;
        cna stackOut_356_0 = null;
        int stackOut_356_1 = 0;
        cna stackOut_357_0 = null;
        int stackOut_357_1 = 0;
        int stackOut_359_0 = 0;
        int stackOut_361_0 = 0;
        L0: {
          L1: {
            var26 = VoidHunters.field_G;
            if (param2) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (!nmb.b(55)) {
                    break L3;
                  } else {
                    if (param1.field_fc) {
                      break L3;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L2;
                    }
                  }
                }
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              }
              var4_int = stackIn_5_0;
              if (var26 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (ii.field_h) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L4;
            } else {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L4;
            }
          }
          var4_int = stackIn_9_0;
          break L0;
        }
        L5: {
          L6: {
            L7: {
              L8: {
                var5 = 0;
                if (!param2) {
                  var6 = 0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (var6 >= 5) {
                          break L11;
                        } else {
                          stackOut_25_0 = var4_int;
                          stackIn_42_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (var26 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (stackIn_26_0 == 0) {
                                break L12;
                              } else {
                                if (0 == inb.field_q[0][var6 + 1].field_o) {
                                  break L12;
                                } else {
                                  if (param1.field_Cb == var6) {
                                    break L12;
                                  } else {
                                    var5 = 1;
                                    param1.field_Cb = var6;
                                    break L12;
                                  }
                                }
                              }
                            }
                            L13: {
                              stackOut_30_0 = inb.field_q[0][var6 - -1];
                              stackIn_32_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (var4_int == 0) {
                                stackOut_32_0 = (cna) (Object) stackIn_32_0;
                                stackOut_32_1 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                break L13;
                              } else {
                                stackOut_31_0 = (cna) (Object) stackIn_31_0;
                                stackOut_31_1 = 1;
                                stackIn_33_0 = stackOut_31_0;
                                stackIn_33_1 = stackOut_31_1;
                                break L13;
                              }
                            }
                            L14: {
                              stackIn_33_0.field_y = stackIn_33_1 != 0;
                              if (ll.field_o) {
                                break L14;
                              } else {
                                if (var6 == 3) {
                                  inb.field_q[0][var6 - -1].field_y = false;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              stackOut_37_0 = inb.field_q[0][1 + var6];
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              if (var6 != param1.field_Cb) {
                                stackOut_39_0 = (cna) (Object) stackIn_39_0;
                                stackOut_39_1 = 0;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                break L15;
                              } else {
                                stackOut_38_0 = (cna) (Object) stackIn_38_0;
                                stackOut_38_1 = 1;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_40_1 = stackOut_38_1;
                                break L15;
                              }
                            }
                            stackIn_40_0.field_J = stackIn_40_1 != 0;
                            var6++;
                            if (var26 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      stackOut_41_0 = inb.field_q[0][2].field_Q;
                      stackIn_42_0 = stackOut_41_0 ? 1 : 0;
                      break L10;
                    }
                    L16: {
                      if (stackIn_42_0 != 0) {
                        L17: {
                          if (nmb.b(97)) {
                            break L17;
                          } else {
                            lob.field_a = isa.a(oba.field_p, new String[1], 124);
                            if (var26 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        lob.field_a = mla.field_r;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (ieb.field_o.length >= 2) {
                      L18: {
                        L19: {
                          if (!param2) {
                            break L19;
                          } else {
                            if (-1 == tsa.field_h) {
                              break L19;
                            } else {
                              stackOut_52_0 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              break L18;
                            }
                          }
                        }
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        break L18;
                      }
                      var6 = stackIn_54_0;
                      if (var6 == 0) {
                        break L7;
                      } else {
                        var7 = tsa.field_h;
                        var8_int = 0;
                        L20: while (true) {
                          if (~var8_int <= ~ce.field_o.length) {
                            break L8;
                          } else {
                            ce.field_o[var8_int] = (byte) 0;
                            var8_int++;
                            if (var26 != 0) {
                              break L7;
                            } else {
                              if (var26 == 0) {
                                continue L20;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                } else {
                  if (ieb.field_o.length >= 2) {
                    L21: {
                      L22: {
                        if (!param2) {
                          break L22;
                        } else {
                          if (-1 == tsa.field_h) {
                            break L22;
                          } else {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            break L21;
                          }
                        }
                      }
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L21;
                    }
                    var6 = stackIn_17_0;
                    if (var6 == 0) {
                      break L7;
                    } else {
                      var7 = tsa.field_h;
                      var8_int = 0;
                      L23: while (true) {
                        if (~var8_int <= ~ce.field_o.length) {
                          break L8;
                        } else {
                          ce.field_o[var8_int] = (byte) 0;
                          var8_int++;
                          if (var26 != 0) {
                            break L7;
                          } else {
                            if (var26 == 0) {
                              continue L23;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
              break L7;
            }
            L24: {
              if (!param2) {
                stackOut_63_0 = 0;
                stackIn_64_0 = stackOut_63_0;
                break L24;
              } else {
                stackOut_62_0 = -1;
                stackIn_64_0 = stackOut_62_0;
                break L24;
              }
            }
            var7 = stackIn_64_0;
            L25: while (true) {
              if (var7 >= ieb.field_o.length) {
                break L6;
              } else {
                stackOut_66_0 = var6;
                stackIn_114_0 = stackOut_66_0;
                stackIn_67_0 = stackOut_66_0;
                if (var26 != 0) {
                  break L5;
                } else {
                  L26: {
                    L27: {
                      if (stackIn_67_0 == 0) {
                        break L27;
                      } else {
                        if (~tsa.field_h == ~var7) {
                          break L27;
                        } else {
                          stackOut_69_0 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          break L26;
                        }
                      }
                    }
                    stackOut_70_0 = 0;
                    stackIn_71_0 = stackOut_70_0;
                    break L26;
                  }
                  L28: {
                    var8_int = stackIn_71_0;
                    if (var4_int == 0) {
                      break L28;
                    } else {
                      if (0 != inb.field_q[1][var7 + 1].field_o) {
                        L29: {
                          if (!param2) {
                            break L29;
                          } else {
                            if (var6 == 0) {
                              L30: {
                                if (var7 == -1) {
                                  break L30;
                                } else {
                                  ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                                  if (var26 == 0) {
                                    break L28;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              var9 = 0;
                              L31: while (true) {
                                L32: {
                                  if (ce.field_o.length <= var9) {
                                    break L32;
                                  } else {
                                    ce.field_o[var9] = (byte) 0;
                                    var9++;
                                    if (var26 != 0) {
                                      break L28;
                                    } else {
                                      if (var26 == 0) {
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                if (var26 == 0) {
                                  break L28;
                                } else {
                                  break L29;
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                        }
                        var9 = ieb.field_o[var7];
                        if (param1.field_Fb != var9) {
                          var5 = 1;
                          param1.field_Fb = var9;
                          break L28;
                        } else {
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                  }
                  L33: {
                    L34: {
                      if (param2) {
                        break L34;
                      } else {
                        L35: {
                          var9 = ieb.field_o[var7];
                          stackOut_90_0 = inb.field_q[1][1 + var7];
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_91_0 = stackOut_90_0;
                          if (~param1.field_Fb != ~var9) {
                            stackOut_92_0 = (cna) (Object) stackIn_92_0;
                            stackOut_92_1 = 0;
                            stackIn_93_0 = stackOut_92_0;
                            stackIn_93_1 = stackOut_92_1;
                            break L35;
                          } else {
                            stackOut_91_0 = (cna) (Object) stackIn_91_0;
                            stackOut_91_1 = 1;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            break L35;
                          }
                        }
                        stackIn_93_0.field_J = stackIn_93_1 != 0;
                        if (var26 == 0) {
                          break L33;
                        } else {
                          break L34;
                        }
                      }
                    }
                    L36: {
                      L37: {
                        if (var7 != -1) {
                          break L37;
                        } else {
                          inb.field_q[1][var7 + 1].field_J = true;
                          var9 = 0;
                          L38: while (true) {
                            L39: {
                              if (~var9 <= ~ieb.field_o.length) {
                                break L39;
                              } else {
                                stackOut_97_0 = inb.field_q[1][var7 - -1];
                                stackOut_97_1 = inb.field_q[1][var7 - -1].field_J;
                                stackOut_97_2 = ~(ce.field_o[var9 / 8] & 1 << (7 & var9));
                                stackOut_97_3 = -1;
                                stackIn_104_0 = stackOut_97_0;
                                stackIn_104_1 = stackOut_97_1 ? 1 : 0;
                                stackIn_104_2 = stackOut_97_2;
                                stackIn_104_3 = stackOut_97_3;
                                stackIn_98_0 = stackOut_97_0;
                                stackIn_98_1 = stackOut_97_1;
                                stackIn_98_2 = stackOut_97_2;
                                stackIn_98_3 = stackOut_97_3;
                                if (var26 != 0) {
                                  break L36;
                                } else {
                                  L40: {
                                    stackOut_98_0 = (cna) (Object) stackIn_98_0;
                                    stackOut_98_1 = stackIn_98_1;
                                    stackIn_100_0 = stackOut_98_0;
                                    stackIn_100_1 = stackOut_98_1;
                                    stackIn_99_0 = stackOut_98_0;
                                    stackIn_99_1 = stackOut_98_1;
                                    if (stackIn_98_2 != stackIn_98_3) {
                                      stackOut_100_0 = (cna) (Object) stackIn_100_0;
                                      stackOut_100_1 = stackIn_100_1;
                                      stackOut_100_2 = 0;
                                      stackIn_101_0 = stackOut_100_0;
                                      stackIn_101_1 = stackOut_100_1;
                                      stackIn_101_2 = stackOut_100_2;
                                      break L40;
                                    } else {
                                      stackOut_99_0 = (cna) (Object) stackIn_99_0;
                                      stackOut_99_1 = stackIn_99_1;
                                      stackOut_99_2 = 1;
                                      stackIn_101_0 = stackOut_99_0;
                                      stackIn_101_1 = stackOut_99_1;
                                      stackIn_101_2 = stackOut_99_2;
                                      break L40;
                                    }
                                  }
                                  stackIn_101_0.field_J = stackIn_101_1 & stackIn_101_2 != 0;
                                  var9++;
                                  if (var26 == 0) {
                                    continue L38;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                            if (var26 == 0) {
                              break L33;
                            } else {
                              break L37;
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
                      break L36;
                    }
                    L41: {
                      stackOut_104_0 = (cna) (Object) stackIn_104_0;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (stackIn_104_1 == (stackIn_104_2 ^ stackIn_104_3)) {
                        stackOut_106_0 = (cna) (Object) stackIn_106_0;
                        stackOut_106_1 = 0;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        break L41;
                      } else {
                        stackOut_105_0 = (cna) (Object) stackIn_105_0;
                        stackOut_105_1 = 1;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
                        break L41;
                      }
                    }
                    stackIn_107_0.field_J = stackIn_107_1 != 0;
                    break L33;
                  }
                  L42: {
                    L43: {
                      stackOut_108_0 = inb.field_q[1][1 + var7];
                      stackIn_111_0 = stackOut_108_0;
                      stackIn_109_0 = stackOut_108_0;
                      if (var4_int == 0) {
                        break L43;
                      } else {
                        stackOut_109_0 = (cna) (Object) stackIn_109_0;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_110_0 = stackOut_109_0;
                        if (var8_int != 0) {
                          break L43;
                        } else {
                          stackOut_110_0 = (cna) (Object) stackIn_110_0;
                          stackOut_110_1 = 1;
                          stackIn_112_0 = stackOut_110_0;
                          stackIn_112_1 = stackOut_110_1;
                          break L42;
                        }
                      }
                    }
                    stackOut_111_0 = (cna) (Object) stackIn_111_0;
                    stackOut_111_1 = 0;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    break L42;
                  }
                  stackIn_112_0.field_y = stackIn_112_1 != 0;
                  var7++;
                  if (var26 == 0) {
                    continue L25;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          stackOut_113_0 = param2;
          stackIn_114_0 = stackOut_113_0 ? 1 : 0;
          break L5;
        }
        L44: {
          if (stackIn_114_0 == 0) {
            stackOut_116_0 = 1;
            stackIn_117_0 = stackOut_116_0;
            break L44;
          } else {
            stackOut_115_0 = 0;
            stackIn_117_0 = stackOut_115_0;
            break L44;
          }
        }
        var6 = stackIn_117_0;
        L45: while (true) {
          L46: {
            L47: {
              if (var6 >= 3) {
                break L47;
              } else {
                var7_ref_cna = inb.field_q[2][var6];
                stackOut_119_0 = var4_int;
                stackIn_149_0 = stackOut_119_0;
                stackIn_120_0 = stackOut_119_0;
                if (var26 != 0) {
                  break L46;
                } else {
                  L48: {
                    if (stackIn_120_0 == 0) {
                      break L48;
                    } else {
                      if (var7_ref_cna.field_o == 0) {
                        break L48;
                      } else {
                        L49: {
                          if (!param2) {
                            break L49;
                          } else {
                            L50: {
                              if (0 != var6) {
                                break L50;
                              } else {
                                qd.field_d = 0;
                                if (var26 == 0) {
                                  break L48;
                                } else {
                                  break L50;
                                }
                              }
                            }
                            qd.field_d = qd.field_d ^ var6;
                            if (var26 == 0) {
                              break L48;
                            } else {
                              break L49;
                            }
                          }
                        }
                        if (param1.field_Bb == var6) {
                          break L48;
                        } else {
                          var5 = 1;
                          param1.field_Bb = var6;
                          break L48;
                        }
                      }
                    }
                  }
                  L51: {
                    stackOut_130_0 = (cna) var7_ref_cna;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_131_0 = stackOut_130_0;
                    if (var4_int == 0) {
                      stackOut_132_0 = (cna) (Object) stackIn_132_0;
                      stackOut_132_1 = 0;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      break L51;
                    } else {
                      stackOut_131_0 = (cna) (Object) stackIn_131_0;
                      stackOut_131_1 = 1;
                      stackIn_133_0 = stackOut_131_0;
                      stackIn_133_1 = stackOut_131_1;
                      break L51;
                    }
                  }
                  L52: {
                    L53: {
                      stackIn_133_0.field_y = stackIn_133_1 != 0;
                      if (!param2) {
                        break L53;
                      } else {
                        L54: {
                          if (var6 != 0) {
                            break L54;
                          } else {
                            L55: {
                              stackOut_135_0 = (cna) var7_ref_cna;
                              stackIn_137_0 = stackOut_135_0;
                              stackIn_136_0 = stackOut_135_0;
                              if (0 != qd.field_d) {
                                stackOut_137_0 = (cna) (Object) stackIn_137_0;
                                stackOut_137_1 = 0;
                                stackIn_138_0 = stackOut_137_0;
                                stackIn_138_1 = stackOut_137_1;
                                break L55;
                              } else {
                                stackOut_136_0 = (cna) (Object) stackIn_136_0;
                                stackOut_136_1 = 1;
                                stackIn_138_0 = stackOut_136_0;
                                stackIn_138_1 = stackOut_136_1;
                                break L55;
                              }
                            }
                            stackIn_138_0.field_J = stackIn_138_1 != 0;
                            if (var26 == 0) {
                              break L52;
                            } else {
                              break L54;
                            }
                          }
                        }
                        L56: {
                          stackOut_139_0 = (cna) var7_ref_cna;
                          stackIn_141_0 = stackOut_139_0;
                          stackIn_140_0 = stackOut_139_0;
                          if ((qd.field_d & var6) == 0) {
                            stackOut_141_0 = (cna) (Object) stackIn_141_0;
                            stackOut_141_1 = 0;
                            stackIn_142_0 = stackOut_141_0;
                            stackIn_142_1 = stackOut_141_1;
                            break L56;
                          } else {
                            stackOut_140_0 = (cna) (Object) stackIn_140_0;
                            stackOut_140_1 = 1;
                            stackIn_142_0 = stackOut_140_0;
                            stackIn_142_1 = stackOut_140_1;
                            break L56;
                          }
                        }
                        stackIn_142_0.field_J = stackIn_142_1 != 0;
                        if (var26 == 0) {
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                    L57: {
                      stackOut_143_0 = (cna) var7_ref_cna;
                      stackIn_145_0 = stackOut_143_0;
                      stackIn_144_0 = stackOut_143_0;
                      if (0 == (var6 & param1.field_Bb)) {
                        stackOut_145_0 = (cna) (Object) stackIn_145_0;
                        stackOut_145_1 = 0;
                        stackIn_146_0 = stackOut_145_0;
                        stackIn_146_1 = stackOut_145_1;
                        break L57;
                      } else {
                        stackOut_144_0 = (cna) (Object) stackIn_144_0;
                        stackOut_144_1 = 1;
                        stackIn_146_0 = stackOut_144_0;
                        stackIn_146_1 = stackOut_144_1;
                        break L57;
                      }
                    }
                    stackIn_146_0.field_J = stackIn_146_1 != 0;
                    break L52;
                  }
                  var6++;
                  if (var26 == 0) {
                    continue L45;
                  } else {
                    break L47;
                  }
                }
              }
            }
            stackOut_148_0 = -109;
            stackIn_149_0 = stackOut_148_0;
            break L46;
          }
          L58: {
            if (stackIn_149_0 == -67) {
              break L58;
            } else {
              asb.a(-90, (mm) null, true, (byte) -109);
              break L58;
            }
          }
          L59: {
            L60: {
              if (!param2) {
                break L60;
              } else {
                if (nkb.field_r <= 1) {
                  break L60;
                } else {
                  var6 = 0;
                  L61: while (true) {
                    if (~var6 <= ~(nkb.field_r - -1)) {
                      break L60;
                    } else {
                      var7_ref_cna = inb.field_q[3][var6];
                      stackOut_155_0 = var4_int;
                      stackIn_175_0 = stackOut_155_0;
                      stackIn_156_0 = stackOut_155_0;
                      if (var26 != 0) {
                        break L59;
                      } else {
                        L62: {
                          if (stackIn_156_0 == 0) {
                            break L62;
                          } else {
                            if (0 == var7_ref_cna.field_o) {
                              break L62;
                            } else {
                              imb.field_a = var6;
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if (!var7_ref_cna.field_Q) {
                            break L63;
                          } else {
                            if (var6 <= 0) {
                              break L63;
                            } else {
                              L64: {
                                if (ea.field_k == null) {
                                  stackOut_163_0 = null;
                                  stackIn_164_0 = (String) (Object) stackOut_163_0;
                                  break L64;
                                } else {
                                  stackOut_162_0 = ea.field_k[-1 + var6];
                                  stackIn_164_0 = stackOut_162_0;
                                  break L64;
                                }
                              }
                              var8_ref = stackIn_164_0;
                              if (var8_ref != null) {
                                lob.field_a = var8_ref;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        L65: {
                          stackOut_167_0 = (cna) var7_ref_cna;
                          stackIn_169_0 = stackOut_167_0;
                          stackIn_168_0 = stackOut_167_0;
                          if (var6 != imb.field_a) {
                            stackOut_169_0 = (cna) (Object) stackIn_169_0;
                            stackOut_169_1 = 0;
                            stackIn_170_0 = stackOut_169_0;
                            stackIn_170_1 = stackOut_169_1;
                            break L65;
                          } else {
                            stackOut_168_0 = (cna) (Object) stackIn_168_0;
                            stackOut_168_1 = 1;
                            stackIn_170_0 = stackOut_168_0;
                            stackIn_170_1 = stackOut_168_1;
                            break L65;
                          }
                        }
                        L66: {
                          stackIn_170_0.field_J = stackIn_170_1 != 0;
                          stackOut_170_0 = (cna) var7_ref_cna;
                          stackIn_172_0 = stackOut_170_0;
                          stackIn_171_0 = stackOut_170_0;
                          if (var4_int == 0) {
                            stackOut_172_0 = (cna) (Object) stackIn_172_0;
                            stackOut_172_1 = 0;
                            stackIn_173_0 = stackOut_172_0;
                            stackIn_173_1 = stackOut_172_1;
                            break L66;
                          } else {
                            stackOut_171_0 = (cna) (Object) stackIn_171_0;
                            stackOut_171_1 = 1;
                            stackIn_173_0 = stackOut_171_0;
                            stackIn_173_1 = stackOut_171_1;
                            break L66;
                          }
                        }
                        stackIn_173_0.field_y = stackIn_173_1 != 0;
                        var6++;
                        if (var26 == 0) {
                          continue L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                  }
                }
              }
            }
            var6 = 0;
            stackOut_174_0 = 0;
            stackIn_175_0 = stackOut_174_0;
            break L59;
          }
          var7 = stackIn_175_0;
          L67: while (true) {
            L68: {
              L69: {
                if (var7 >= ocb.field_l) {
                  break L69;
                } else {
                  var27 = inb.field_q[4 - -var7];
                  var8 = inb.field_q[4 - -var7];
                  stackOut_177_0 = param2;
                  stackIn_362_0 = stackOut_177_0 ? 1 : 0;
                  stackIn_178_0 = stackOut_177_0;
                  if (var26 != 0) {
                    break L68;
                  } else {
                    L70: {
                      if (!stackIn_178_0) {
                        stackOut_180_0 = 0;
                        stackIn_181_0 = stackOut_180_0;
                        break L70;
                      } else {
                        stackOut_179_0 = -1;
                        stackIn_181_0 = stackOut_179_0;
                        break L70;
                      }
                    }
                    var9 = stackIn_181_0;
                    L71: while (true) {
                      L72: {
                        L73: {
                          if (var9 >= -1 + var27.length) {
                            break L73;
                          } else {
                            var10 = 0;
                            var11 = 0;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            stackOut_183_0 = var4_int;
                            stackIn_360_0 = stackOut_183_0;
                            stackIn_184_0 = stackOut_183_0;
                            if (var26 != 0) {
                              break L72;
                            } else {
                              L74: {
                                if (stackIn_184_0 == 0) {
                                  break L74;
                                } else {
                                  if (var9 >= 0) {
                                    L75: {
                                      if (hia.field_o == null) {
                                        break L75;
                                      } else {
                                        if (hia.field_o[var7] == null) {
                                          break L75;
                                        } else {
                                          if (0 >= (~kbb.field_p & hia.field_o[var7][var9])) {
                                            break L75;
                                          } else {
                                            var14 = 1;
                                            var15 = wsb.a(hia.field_o[var7][var9] & ~kbb.field_p, 1302374146);
                                            break L75;
                                          }
                                        }
                                      }
                                    }
                                    L76: {
                                      if (null == qcb.field_o) {
                                        break L76;
                                      } else {
                                        if (qcb.field_o[var7] == null) {
                                          break L76;
                                        } else {
                                          if (0 < hcb.field_o) {
                                            break L76;
                                          } else {
                                            if (!qcb.field_o[var7][var9]) {
                                              break L76;
                                            } else {
                                              var10 = 1;
                                              break L76;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L77: {
                                      if (null == crb.field_w) {
                                        break L77;
                                      } else {
                                        if (null == crb.field_w[var7]) {
                                          break L77;
                                        } else {
                                          L78: {
                                            var16 = crb.field_w[var7][var9];
                                            if (var16 <= 0) {
                                              break L78;
                                            } else {
                                              if (~tg.field_q > ~var16) {
                                                var12 = 1;
                                                break L78;
                                              } else {
                                                break L78;
                                              }
                                            }
                                          }
                                          if (var16 == 0) {
                                            break L77;
                                          } else {
                                            if (ufa.field_o) {
                                              break L77;
                                            } else {
                                              if (hcb.field_o > 0) {
                                                break L77;
                                              } else {
                                                var10 = 1;
                                                break L77;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L79: {
                                      L80: {
                                        if (!param2) {
                                          break L80;
                                        } else {
                                          if (nqa.field_b == null) {
                                            break L80;
                                          } else {
                                            if (nqa.field_b[var7] == null) {
                                              break L80;
                                            } else {
                                              if (!nqa.field_b[var7][var9]) {
                                                break L80;
                                              } else {
                                                stackOut_210_0 = 1;
                                                stackIn_212_0 = stackOut_210_0;
                                                break L79;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_211_0 = 0;
                                      stackIn_212_0 = stackOut_211_0;
                                      break L79;
                                    }
                                    var13 = stackIn_212_0;
                                    if (tab.field_p == null) {
                                      break L74;
                                    } else {
                                      if (tab.field_p[var7] == null) {
                                        break L74;
                                      } else {
                                        L81: {
                                          var16 = tab.field_p[var7][var9];
                                          if (var16 <= 0) {
                                            break L81;
                                          } else {
                                            if (var16 > cla.field_b) {
                                              var11 = 1;
                                              break L81;
                                            } else {
                                              break L81;
                                            }
                                          }
                                        }
                                        if (0 == var16) {
                                          break L74;
                                        } else {
                                          if (ufa.field_o) {
                                            break L74;
                                          } else {
                                            if (0 < hcb.field_o) {
                                              break L74;
                                            } else {
                                              var10 = 1;
                                              break L74;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                              L82: {
                                if (go.field_p < 2) {
                                  break L82;
                                } else {
                                  if (!si.field_o[12]) {
                                    break L82;
                                  } else {
                                    var12 = 0;
                                    var10 = 0;
                                    var14 = 0;
                                    var11 = 0;
                                    var13 = 0;
                                    break L82;
                                  }
                                }
                              }
                              L83: {
                                L84: {
                                  if (var10 != 0) {
                                    break L84;
                                  } else {
                                    if (var11 != 0) {
                                      break L84;
                                    } else {
                                      if (var12 != 0) {
                                        break L84;
                                      } else {
                                        if (var13 != 0) {
                                          break L84;
                                        } else {
                                          if (var14 == 0) {
                                            stackOut_232_0 = 0;
                                            stackIn_233_0 = stackOut_232_0;
                                            break L83;
                                          } else {
                                            break L84;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_231_0 = 1;
                                stackIn_233_0 = stackOut_231_0;
                                break L83;
                              }
                              L85: {
                                var16 = stackIn_233_0;
                                hrb.field_b = true;
                                if (var16 != 0) {
                                  break L85;
                                } else {
                                  if (var9 < 0) {
                                    break L85;
                                  } else {
                                    if (null == ncb.field_a) {
                                      break L85;
                                    } else {
                                      L86: {
                                        if (!param2) {
                                          break L86;
                                        } else {
                                          if (!ii.field_h) {
                                            break L86;
                                          } else {
                                            break L85;
                                          }
                                        }
                                      }
                                      L87: {
                                        nr.field_p = false;
                                        hrb.field_b = false;
                                        if (tib.field_i == null) {
                                          tib.field_i = new byte[ocb.field_l];
                                          mia.field_a = new boolean[ocb.field_l];
                                          break L87;
                                        } else {
                                          break L87;
                                        }
                                      }
                                      var17_int = 0;
                                      L88: while (true) {
                                        L89: {
                                          L90: {
                                            if (~var7 >= ~var17_int) {
                                              break L90;
                                            } else {
                                              mia.field_a[var17_int] = false;
                                              var17_int++;
                                              if (var26 != 0) {
                                                break L89;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L88;
                                                } else {
                                                  break L90;
                                                }
                                              }
                                            }
                                          }
                                          bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                                          break L89;
                                        }
                                        L91: {
                                          if (2 > go.field_p) {
                                            break L91;
                                          } else {
                                            if (!si.field_o[12]) {
                                              break L91;
                                            } else {
                                              hrb.field_b = true;
                                              break L91;
                                            }
                                          }
                                        }
                                        if (hrb.field_b) {
                                          break L85;
                                        } else {
                                          var16 = 1;
                                          break L85;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L92: {
                                var17 = var27[var9 - -1];
                                if (var4_int == 0) {
                                  break L92;
                                } else {
                                  if (0 == var17.field_o) {
                                    break L92;
                                  } else {
                                    L93: {
                                      if (!param2) {
                                        break L93;
                                      } else {
                                        L94: {
                                          if (var9 == -1) {
                                            break L94;
                                          } else {
                                            nkb.field_p[(var9 + var6) / 8] = (byte)mgb.a((int) nkb.field_p[(var9 + var6) / 8], 1 << dla.a(var6 + var9, 7));
                                            if (var26 == 0) {
                                              break L92;
                                            } else {
                                              break L94;
                                            }
                                          }
                                        }
                                        var18 = var6;
                                        L95: while (true) {
                                          L96: {
                                            if (~(var6 - (-var27.length + 1)) >= ~var18) {
                                              break L96;
                                            } else {
                                              nkb.field_p[var18 / 8] = (byte)dla.a((int) nkb.field_p[var18 / 8], ~(1 << dla.a(7, var18)));
                                              var18++;
                                              if (var26 != 0) {
                                                break L92;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L95;
                                                } else {
                                                  break L96;
                                                }
                                              }
                                            }
                                          }
                                          if (var26 == 0) {
                                            break L92;
                                          } else {
                                            break L93;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 != 0) {
                                      break L92;
                                    } else {
                                      if (~(byte)var9 == ~param1.field_Pb[var7]) {
                                        break L92;
                                      } else {
                                        param1.field_Pb[var7] = (byte)var9;
                                        var5 = 1;
                                        break L92;
                                      }
                                    }
                                  }
                                }
                              }
                              L97: {
                                if (!param2) {
                                  break L97;
                                } else {
                                  if (var16 == 0) {
                                    break L97;
                                  } else {
                                    nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], ~(1 << dla.a(var9 + var6, 7)));
                                    break L97;
                                  }
                                }
                              }
                              L98: {
                                if (var9 < 0) {
                                  break L98;
                                } else {
                                  if (var17.field_Q) {
                                    L99: {
                                      if (hqb.field_k == null) {
                                        var18_ref = null;
                                        break L99;
                                      } else {
                                        if (null == hqb.field_k[var7]) {
                                          var18_ref = null;
                                          break L99;
                                        } else {
                                          var18_ref = (Object) (Object) hqb.field_k[var7][var9];
                                          break L99;
                                        }
                                      }
                                    }
                                    L100: {
                                      if (awa.field_o == null) {
                                        var19 = null;
                                        break L100;
                                      } else {
                                        if (null != awa.field_o[var7]) {
                                          var19 = (Object) (Object) awa.field_o[var7][var9];
                                          break L100;
                                        } else {
                                          var19 = null;
                                          break L100;
                                        }
                                      }
                                    }
                                    L101: {
                                      var20 = null;
                                      if (var19 == null) {
                                        break L101;
                                      } else {
                                        if (!((String) var19).equals(var18_ref)) {
                                          var20 = var19;
                                          break L101;
                                        } else {
                                          break L101;
                                        }
                                      }
                                    }
                                    L102: {
                                      var21 = null;
                                      if (var13 != 0) {
                                        var21 = (Object) (Object) k.field_q;
                                        var22 = var21;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        var22 = var21;
                                        break L102;
                                      } else {
                                        if (var10 != 0) {
                                          var21 = (Object) (Object) bpa.field_d;
                                          break L102;
                                        } else {
                                          L103: {
                                            if (var11 != 0) {
                                              var22_int = tab.field_p[var7][var9] + -cla.field_b;
                                              if (var22_int == 1) {
                                                var21 = (Object) (Object) wia.field_b;
                                                var22 = var21;
                                                var21 = var22;
                                                var22 = var21;
                                                var21 = var22;
                                                break L103;
                                              } else {
                                                var21 = (Object) (Object) isa.a(nra.field_a, new String[1], 105);
                                                break L103;
                                              }
                                            } else {
                                              break L103;
                                            }
                                          }
                                          L104: {
                                            if (var12 == 0) {
                                              break L104;
                                            } else {
                                              L105: {
                                                var22_ref = isa.a(gh.field_p, new String[2], 110);
                                                var21 = (Object) (Object) var22_ref;
                                                var21 = (Object) (Object) var22_ref;
                                                if (var21 == null) {
                                                  break L105;
                                                } else {
                                                  var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                                  if (var26 == 0) {
                                                    break L104;
                                                  } else {
                                                    break L105;
                                                  }
                                                }
                                              }
                                              var21 = (Object) (Object) var22_ref;
                                              break L104;
                                            }
                                          }
                                          if (var14 == 0) {
                                            break L102;
                                          } else {
                                            L106: {
                                              var22_ref = lp.field_a;
                                              if (var15 <= 0) {
                                                break L106;
                                              } else {
                                                if (mta.field_a == null) {
                                                  break L106;
                                                } else {
                                                  if (~mta.field_a.length > ~var15) {
                                                    break L106;
                                                  } else {
                                                    if (null == mta.field_a[var15 + -1]) {
                                                      break L106;
                                                    } else {
                                                      var22_ref = mta.field_a[var15 - 1][0];
                                                      break L106;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L107: {
                                              L108: {
                                                if (var21 == null) {
                                                  break L108;
                                                } else {
                                                  var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                                  if (var26 == 0) {
                                                    break L107;
                                                  } else {
                                                    break L108;
                                                  }
                                                }
                                              }
                                              var21 = (Object) (Object) var22_ref;
                                              break L107;
                                            }
                                            break L102;
                                          }
                                        }
                                      }
                                    }
                                    L109: {
                                      if (var4_int == 0) {
                                        break L109;
                                      } else {
                                        if (!hrb.field_b) {
                                          L110: {
                                            var22_ref = null;
                                            var23 = 0;
                                            if (!nr.field_p) {
                                              break L110;
                                            } else {
                                              var22_ref = "</col>" + uda.field_a + "<col=A00000>";
                                              var25_ref = var22_ref;
                                              var22_ref = var25_ref;
                                              var25_ref = var22_ref;
                                              var22_ref = var25_ref;
                                              var21 = (Object) (Object) var22_ref;
                                              break L110;
                                            }
                                          }
                                          var24 = 0;
                                          L111: while (true) {
                                            L112: {
                                              L113: {
                                                if (~var7 >= ~var24) {
                                                  break L113;
                                                } else {
                                                  stackOut_318_0 = mia.field_a[var24];
                                                  stackIn_325_0 = stackOut_318_0 ? 1 : 0;
                                                  stackIn_319_0 = stackOut_318_0;
                                                  if (var26 != 0) {
                                                    break L112;
                                                  } else {
                                                    L114: {
                                                      if (!stackIn_319_0) {
                                                        break L114;
                                                      } else {
                                                        L115: {
                                                          var25_ref = "</col>" + hva.field_c[var24] + "<col=A00000>";
                                                          var22_ref = var25_ref;
                                                          var21 = (Object) (Object) var22_ref;
                                                          var22_ref = var25_ref;
                                                          if (var22_ref == null) {
                                                            break L115;
                                                          } else {
                                                            var23 = 1;
                                                            var22_ref = var22_ref + ", " + var25_ref;
                                                            if (var26 == 0) {
                                                              break L114;
                                                            } else {
                                                              break L115;
                                                            }
                                                          }
                                                        }
                                                        var22_ref = var25_ref;
                                                        var21 = (Object) (Object) var22_ref;
                                                        var21 = (Object) (Object) var22_ref;
                                                        break L114;
                                                      }
                                                    }
                                                    var24++;
                                                    if (var26 == 0) {
                                                      continue L111;
                                                    } else {
                                                      break L113;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_324_0 = var23;
                                              stackIn_325_0 = stackOut_324_0;
                                              break L112;
                                            }
                                            L116: {
                                              if (stackIn_325_0 == 0) {
                                                break L116;
                                              } else {
                                                var21 = (Object) (Object) (nna.field_F + var22_ref);
                                                if (var26 == 0) {
                                                  break L109;
                                                } else {
                                                  break L116;
                                                }
                                              }
                                            }
                                            var21 = (Object) (Object) isa.a(fra.field_c, new String[1], 78);
                                            break L109;
                                          }
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                    L117: {
                                      if (var21 == null) {
                                        break L117;
                                      } else {
                                        L118: {
                                          var21 = (Object) (Object) ("<col=A00000>" + var21);
                                          var21 = (Object) (Object) jd.a((String) var21, "<br>", 0, "<br><col=A00000>");
                                          var20 = var21;
                                          var20 = var21;
                                          if (var20 != null) {
                                            break L118;
                                          } else {
                                            var20 = var21;
                                            if (var26 == 0) {
                                              break L117;
                                            } else {
                                              break L118;
                                            }
                                          }
                                        }
                                        var20 = (Object) (Object) (var20 + "<br>" + var21);
                                        break L117;
                                      }
                                    }
                                    if (var20 == null) {
                                      break L98;
                                    } else {
                                      lob.field_a = (String) var20;
                                      break L98;
                                    }
                                  } else {
                                    break L98;
                                  }
                                }
                              }
                              L119: {
                                L120: {
                                  L121: {
                                    L122: {
                                      L123: {
                                        if (!param2) {
                                          break L123;
                                        } else {
                                          L124: {
                                            if (var9 == -1) {
                                              break L124;
                                            } else {
                                              L125: {
                                                stackOut_336_0 = (cna) var17;
                                                stackIn_338_0 = stackOut_336_0;
                                                stackIn_337_0 = stackOut_336_0;
                                                if ((nkb.field_p[(var6 - -var9) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                                                  stackOut_338_0 = (cna) (Object) stackIn_338_0;
                                                  stackOut_338_1 = 0;
                                                  stackIn_339_0 = stackOut_338_0;
                                                  stackIn_339_1 = stackOut_338_1;
                                                  break L125;
                                                } else {
                                                  stackOut_337_0 = (cna) (Object) stackIn_337_0;
                                                  stackOut_337_1 = 1;
                                                  stackIn_339_0 = stackOut_337_0;
                                                  stackIn_339_1 = stackOut_337_1;
                                                  break L125;
                                                }
                                              }
                                              stackIn_339_0.field_J = stackIn_339_1 != 0;
                                              if (var26 == 0) {
                                                break L119;
                                              } else {
                                                break L124;
                                              }
                                            }
                                          }
                                          var17.field_J = true;
                                          var18 = var6;
                                          L126: while (true) {
                                            L127: {
                                              if (var18 >= var6 - (-var27.length + 1)) {
                                                break L127;
                                              } else {
                                                stackOut_342_0 = (cna) var17;
                                                stackOut_342_1 = var17.field_J;
                                                stackOut_342_2 = 0;
                                                stackOut_342_3 = nkb.field_p[var18 / 8] & 1 << (var18 & 7);
                                                stackIn_350_0 = stackOut_342_0;
                                                stackIn_350_1 = stackOut_342_1 ? 1 : 0;
                                                stackIn_350_2 = stackOut_342_2;
                                                stackIn_350_3 = stackOut_342_3;
                                                stackIn_343_0 = stackOut_342_0;
                                                stackIn_343_1 = stackOut_342_1;
                                                stackIn_343_2 = stackOut_342_2;
                                                stackIn_343_3 = stackOut_342_3;
                                                if (var26 != 0) {
                                                  break L122;
                                                } else {
                                                  L128: {
                                                    stackOut_343_0 = (cna) (Object) stackIn_343_0;
                                                    stackOut_343_1 = stackIn_343_1;
                                                    stackIn_345_0 = stackOut_343_0;
                                                    stackIn_345_1 = stackOut_343_1;
                                                    stackIn_344_0 = stackOut_343_0;
                                                    stackIn_344_1 = stackOut_343_1;
                                                    if (stackIn_343_2 != stackIn_343_3) {
                                                      stackOut_345_0 = (cna) (Object) stackIn_345_0;
                                                      stackOut_345_1 = stackIn_345_1;
                                                      stackOut_345_2 = 0;
                                                      stackIn_346_0 = stackOut_345_0;
                                                      stackIn_346_1 = stackOut_345_1;
                                                      stackIn_346_2 = stackOut_345_2;
                                                      break L128;
                                                    } else {
                                                      stackOut_344_0 = (cna) (Object) stackIn_344_0;
                                                      stackOut_344_1 = stackIn_344_1;
                                                      stackOut_344_2 = 1;
                                                      stackIn_346_0 = stackOut_344_0;
                                                      stackIn_346_1 = stackOut_344_1;
                                                      stackIn_346_2 = stackOut_344_2;
                                                      break L128;
                                                    }
                                                  }
                                                  stackIn_346_0.field_J = stackIn_346_1 & stackIn_346_2 != 0;
                                                  var18++;
                                                  if (var26 == 0) {
                                                    continue L126;
                                                  } else {
                                                    break L127;
                                                  }
                                                }
                                              }
                                            }
                                            if (var26 == 0) {
                                              break L119;
                                            } else {
                                              break L123;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_348_0 = (cna) var17;
                                      stackIn_352_0 = stackOut_348_0;
                                      stackIn_349_0 = stackOut_348_0;
                                      if (!hrb.field_b) {
                                        break L121;
                                      } else {
                                        stackOut_349_0 = (cna) (Object) stackIn_349_0;
                                        stackOut_349_1 = ~(byte)var9;
                                        stackOut_349_2 = param1.field_Pb[var7];
                                        stackOut_349_3 = -1;
                                        stackIn_350_0 = stackOut_349_0;
                                        stackIn_350_1 = stackOut_349_1;
                                        stackIn_350_2 = stackOut_349_2;
                                        stackIn_350_3 = stackOut_349_3;
                                        break L122;
                                      }
                                    }
                                    stackOut_350_0 = (cna) (Object) stackIn_350_0;
                                    stackIn_352_0 = stackOut_350_0;
                                    stackIn_351_0 = stackOut_350_0;
                                    if (stackIn_350_1 != (stackIn_350_2 ^ stackIn_350_3)) {
                                      break L121;
                                    } else {
                                      stackOut_351_0 = (cna) (Object) stackIn_351_0;
                                      stackOut_351_1 = 1;
                                      stackIn_353_0 = stackOut_351_0;
                                      stackIn_353_1 = stackOut_351_1;
                                      break L120;
                                    }
                                  }
                                  stackOut_352_0 = (cna) (Object) stackIn_352_0;
                                  stackOut_352_1 = 0;
                                  stackIn_353_0 = stackOut_352_0;
                                  stackIn_353_1 = stackOut_352_1;
                                  break L120;
                                }
                                stackIn_353_0.field_J = stackIn_353_1 != 0;
                                break L119;
                              }
                              L129: {
                                L130: {
                                  stackOut_354_0 = (cna) var17;
                                  stackIn_357_0 = stackOut_354_0;
                                  stackIn_355_0 = stackOut_354_0;
                                  if (var4_int == 0) {
                                    break L130;
                                  } else {
                                    stackOut_355_0 = (cna) (Object) stackIn_355_0;
                                    stackIn_357_0 = stackOut_355_0;
                                    stackIn_356_0 = stackOut_355_0;
                                    if (var16 != 0) {
                                      break L130;
                                    } else {
                                      stackOut_356_0 = (cna) (Object) stackIn_356_0;
                                      stackOut_356_1 = 1;
                                      stackIn_358_0 = stackOut_356_0;
                                      stackIn_358_1 = stackOut_356_1;
                                      break L129;
                                    }
                                  }
                                }
                                stackOut_357_0 = (cna) (Object) stackIn_357_0;
                                stackOut_357_1 = 0;
                                stackIn_358_0 = stackOut_357_0;
                                stackIn_358_1 = stackOut_357_1;
                                break L129;
                              }
                              stackIn_358_0.field_y = stackIn_358_1 != 0;
                              var9++;
                              if (var26 == 0) {
                                continue L71;
                              } else {
                                break L73;
                              }
                            }
                          }
                        }
                        stackOut_359_0 = var6 + (255 & vu.field_zb[var7]);
                        stackIn_360_0 = stackOut_359_0;
                        break L72;
                      }
                      var6 = stackIn_360_0;
                      var7++;
                      if (var26 == 0) {
                        continue L67;
                      } else {
                        break L69;
                      }
                    }
                  }
                }
              }
              stackOut_361_0 = var5;
              stackIn_362_0 = stackOut_361_0;
              break L68;
            }
            L131: {
              L132: {
                if (stackIn_362_0 == 0) {
                  break L132;
                } else {
                  if (!param2) {
                    bh.a(param0, true);
                    break L132;
                  } else {
                    break L131;
                  }
                }
              }
              break L131;
            }
            return;
          }
        }
    }

    final int a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.b((byte) 127, param1)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param2 = param2.toLowerCase();
              var5 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_p[param1].a(-123454015, vla.a((byte) 122, var5));
              if (param0) {
                if (!this.a(var4_int, param1, 0)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = 78;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("asb.T(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized boolean b(byte param0, int param1) {
        int var3 = 0;
        var3 = -101 % ((85 - param0) / 33);
        if (((asb) this).b((byte) 103)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (((asb) this).field_g.field_m.length <= param1) {
                break L0;
              } else {
                if (0 == ((asb) this).field_g.field_m[param1]) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
          }
          if (sl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
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
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_3_0 = null;
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
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 114, var6));
              if (this.b((byte) -28, var4_int)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 116, var7));
                stackOut_8_0 = ((asb) this).a(var4_int, var5, (byte) 13);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("asb.U(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 116)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((asb) this).field_g.field_a.a(param0 + -123486186, vla.a((byte) 127, var4));
                if (param0 == 32171) {
                  break L1;
                } else {
                  boolean discarded$2 = ((asb) this).a(-117, (String) null);
                  break L1;
                }
              }
              stackOut_5_0 = ((asb) this).c(121, var3_int);
              stackIn_6_0 = stackOut_5_0;
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
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("asb.G(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final synchronized boolean c(int param0, int param1) {
        if (this.b((byte) -40, param1)) {
          if (((asb) this).field_i[param1] != null) {
            return true;
          } else {
            L0: {
              this.a((byte) -92, param1);
              if (param0 > 46) {
                break L0;
              } else {
                int discarded$2 = ((asb) this).b(((int[]) ((asb) this).field_i[8])[0]);
                break L0;
              }
            }
            if (((asb) this).field_i[param1] != null) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 77)) {
              if (param0) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 108, var4));
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
            stackOut_11_1 = new StringBuilder().append("asb.BA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        if (null == ((asb) this).field_g) {
          ((asb) this).field_g = ((asb) this).field_d.a((byte) 9);
          if (((asb) this).field_g == null) {
            return false;
          } else {
            ((asb) this).field_c = new Object[((asb) this).field_g.field_l][];
            ((asb) this).field_i = new Object[((asb) this).field_g.field_l];
            var2 = -12 / ((param0 - 21) / 56);
            return true;
          }
        } else {
          var2 = -12 / ((param0 - 21) / 56);
          return true;
        }
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (!((asb) this).b((byte) 84)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (((asb) this).field_g.field_i.length <= var3) {
                  break L2;
                } else {
                  var4 = ((asb) this).field_g.field_i[var3];
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (null == ((asb) this).field_i[var4]) {
                        this.a((byte) -122, var4);
                        if (((asb) this).field_i[var4] == null) {
                          var2 = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param0 >= 1) {
                break L1;
              } else {
                ((asb) this).field_g = null;
                break L1;
              }
            }
            return var2 != 0;
          }
        }
    }

    final static void a(int param0, String param1, byte[] param2, int param3, String param4) {
        try {
            File var5 = null;
            if (param3 >= -68) {
                asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
            }
            var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
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
        byte[] var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
                if (!this.a(param3, 0, param0, param2)) {
                  this.a((byte) -78, param0);
                  if (this.a(param3, 0, param0, param2)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
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
                    var8 = ffb.a(false, ((asb) this).field_c[param0][param3], true);
                    var6 = (Object) (Object) var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 != null) {
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
                stackOut_25_0 = var6;
                stackIn_26_0 = stackOut_25_0;
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
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("asb.B(").append(param0).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -114 % ((param0 - 25) / 54);
        field_a = null;
    }

    private final synchronized void a(byte param0, int param1) {
        L0: {
          L1: {
            if (((asb) this).field_e) {
              break L1;
            } else {
              ((asb) this).field_i[param1] = gfb.a(false, ((asb) this).field_d.a(127, param1), -12445);
              if (VoidHunters.field_G == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((asb) this).field_i[param1] = (Object) (Object) ((asb) this).field_d.a(118, param1);
          break L0;
        }
        L2: {
          if (param0 < -67) {
            break L2;
          } else {
            ((long[]) ((asb) this).field_i[9])[11] = -71L;
            break L2;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((asb) this).b((byte) 83)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param1 >= ((asb) this).field_g.field_m.length) {
                  break L0;
                } else {
                  if (param0 >= ((asb) this).field_g.field_m[param1]) {
                    break L0;
                  } else {
                    boolean discarded$2 = ((asb) this).a(((int[]) ((asb) this).field_i[0])[0], (String) null);
                    return true;
                  }
                }
              }
            }
          }
          if (!sl.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) -106)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
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
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 127, var6));
              if (var4_int >= 0) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 123, var7));
                if (var5 >= 0) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("asb.W(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 13) {
            return (byte[]) ((asb) this).field_i[0];
        }
        return this.a(param0, -83, (int[]) null, param1);
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) 82)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
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
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 120, var6));
              if (!this.b((byte) 125, var4_int)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 108, var7));
                stackOut_10_0 = ((asb) this).a((byte) 84, var5, var4_int);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("asb.DA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!((asb) this).b((byte) 81)) {
          return false;
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
              if (((asb) this).field_g.field_m[param0] == 1) {
                return ((asb) this).a((byte) 97, 0, param0);
              } else {
                throw new RuntimeException();
              }
            } else {
              return false;
            }
          } else {
            return ((asb) this).a((byte) 95, param0, 0);
          }
        }
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var5 = VoidHunters.field_G;
        if (!((asb) this).b((byte) 109)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= ((asb) this).field_i.length) {
                  break L2;
                } else {
                  stackOut_5_0 = -1;
                  stackOut_5_1 = ~((asb) this).field_g.field_j[var4];
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_10_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 <= stackIn_6_1) {
                        break L3;
                      } else {
                        var3 = var3 + ((asb) this).a(var4, 1045);
                        var2 += 100;
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackOut_9_1 = var2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L1;
            }
            if (stackIn_10_0 == stackIn_10_1) {
              return 100;
            } else {
              L4: {
                if (param0 <= -101) {
                  break L4;
                } else {
                  ((asb) this).field_h = 103;
                  break L4;
                }
              }
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        }
    }

    final int b(int param0, int param1) {
        L0: {
          if (param1 == -6942) {
            break L0;
          } else {
            ((asb) this).field_i[2] = ((Object[]) ((asb) this).field_i[3])[1];
            break L0;
          }
        }
        if (!this.b((byte) -33, param0)) {
          return 0;
        } else {
          return ((asb) this).field_g.field_m[param0];
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param1, param2, 0)) {
          return false;
        } else {
          L0: {
            if (((asb) this).field_c[param2] == null) {
              break L0;
            } else {
              if (null != ((asb) this).field_c[param2][param1]) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (param0 > 56) {
            if (null == ((asb) this).field_i[param2]) {
              this.a((byte) -116, param2);
              if (((asb) this).field_i[param2] == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return ((boolean[]) ((asb) this).field_i[7])[0];
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
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
        byte[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_127_0 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_62_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_126_0 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.b((byte) 120, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((asb) this).field_i[param2]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
                      if (var9_int >= var5_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (var6 == null) {
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
                          continue L2;
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L3;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0 != 0;
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
                      var23 = rob.a(param1, var9_array);
                      var10 = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_36_1 = new StringBuilder();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (param3 == null) {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        break L12;
                      } else {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        break L12;
                      }
                    }
                    throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param2 + " " + param3.length + " " + psb.a(var9_array, param3.length, 0) + " " + psb.a(var9_array, -2 + param3.length, 0) + " " + ((asb) this).field_g.field_d[param2] + " " + ((asb) this).field_g.field_k);
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
                                var7[var11] = gfb.a(false, var23, -12445);
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = (Object) (Object) var23;
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
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var13 = new ds(var10);
                          var13.field_e = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L22: while (true) {
                            L23: {
                              if (var15 >= var12) {
                                stackOut_62_0 = var5_int;
                                stackIn_63_0 = stackOut_62_0;
                                break L23;
                              } else {
                                var16_int = 0;
                                stackOut_54_0 = 0;
                                stackIn_63_0 = stackOut_54_0;
                                stackIn_55_0 = stackOut_54_0;
                                if (var22 != 0) {
                                  break L23;
                                } else {
                                  var17 = stackIn_55_0;
                                  L24: while (true) {
                                    L25: {
                                      if (var17 >= var5_int) {
                                        var15++;
                                        break L25;
                                      } else {
                                        var16_int = var16_int + var13.h(68);
                                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                        var17++;
                                        if (var22 != 0) {
                                          break L25;
                                        } else {
                                          continue L24;
                                        }
                                      }
                                    }
                                    continue L22;
                                  }
                                }
                              }
                            }
                            var15_ref_byte____ = new byte[stackIn_63_0][];
                            var16_int = 0;
                            L26: while (true) {
                              L27: {
                                if (var16_int >= var5_int) {
                                  var13.field_e = var11;
                                  var16_int = 0;
                                  break L27;
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  if (var22 != 0) {
                                    break L27;
                                  } else {
                                    continue L26;
                                  }
                                }
                              }
                              var17 = 0;
                              L28: while (true) {
                                L29: {
                                  if (var17 >= var12) {
                                    stackOut_79_0 = 0;
                                    stackIn_80_0 = stackOut_79_0;
                                    break L29;
                                  } else {
                                    var18 = 0;
                                    stackOut_71_0 = 0;
                                    stackIn_80_0 = stackOut_71_0;
                                    stackIn_72_0 = stackOut_71_0;
                                    if (var22 != 0) {
                                      break L29;
                                    } else {
                                      var19 = stackIn_72_0;
                                      L30: while (true) {
                                        L31: {
                                          if (var19 >= var5_int) {
                                            var17++;
                                            break L31;
                                          } else {
                                            var18 = var18 + var13.h(param1 ^ 19);
                                            cua.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var16_int = var16_int + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L31;
                                            } else {
                                              continue L30;
                                            }
                                          }
                                        }
                                        continue L28;
                                      }
                                    }
                                  }
                                }
                                var17 = stackIn_80_0;
                                L32: while (true) {
                                  if (var5_int <= var17) {
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L21;
                                    }
                                  } else {
                                    if (var22 != 0) {
                                      break L15;
                                    } else {
                                      L33: {
                                        L34: {
                                          if (var6 == null) {
                                            break L34;
                                          } else {
                                            var18 = var6[var17];
                                            if (var22 == 0) {
                                              break L33;
                                            } else {
                                              break L34;
                                            }
                                          }
                                        }
                                        var18 = var17;
                                        break L33;
                                      }
                                      L35: {
                                        L36: {
                                          if (0 == ((asb) this).field_h) {
                                            break L36;
                                          } else {
                                            var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                            if (var22 == 0) {
                                              break L35;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        var7[var18] = gfb.a(false, var15_ref_byte____[var17], -12445);
                                        break L35;
                                      }
                                      var17++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var23.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * var5_int * 4;
                      var13 = new ds(var10);
                      var14 = 0;
                      var15 = 0;
                      var13.field_e = var11;
                      var16_int = 0;
                      L37: while (true) {
                        L38: {
                          if (var12 <= var16_int) {
                            stackOut_106_0 = var14;
                            stackIn_107_0 = stackOut_106_0;
                            break L38;
                          } else {
                            var17 = 0;
                            stackOut_94_0 = 0;
                            stackIn_107_0 = stackOut_94_0;
                            stackIn_95_0 = stackOut_94_0;
                            if (var22 != 0) {
                              break L38;
                            } else {
                              var18 = stackIn_95_0;
                              L39: while (true) {
                                L40: {
                                  if (var18 >= var5_int) {
                                    var16_int++;
                                    break L40;
                                  } else {
                                    var17 = var17 + var13.h(param1 + 37);
                                    if (var22 != 0) {
                                      break L40;
                                    } else {
                                      L41: {
                                        L42: {
                                          if (var6 == null) {
                                            break L42;
                                          } else {
                                            var19 = var6[var18];
                                            if (var22 == 0) {
                                              break L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                        var19 = var18;
                                        break L41;
                                      }
                                      L43: {
                                        if (param0 != var19) {
                                          break L43;
                                        } else {
                                          var15 = var19;
                                          var14 = var14 + var17;
                                          break L43;
                                        }
                                      }
                                      var18++;
                                      continue L39;
                                    }
                                  }
                                }
                                continue L37;
                              }
                            }
                          }
                        }
                        if (stackIn_107_0 == 0) {
                          stackOut_109_0 = 1;
                          stackIn_110_0 = stackOut_109_0;
                          return stackIn_110_0 != 0;
                        } else {
                          var16 = new byte[var14];
                          var13.field_e = var11;
                          var14 = 0;
                          var17 = 0;
                          var18 = 0;
                          L44: while (true) {
                            if (var12 <= var18) {
                              var7[var15] = (Object) (Object) var16;
                              break L15;
                            } else {
                              var19 = 0;
                              stackOut_113_0 = 0;
                              stackIn_127_0 = stackOut_113_0;
                              stackIn_114_0 = stackOut_113_0;
                              if (var22 != 0) {
                                break L14;
                              } else {
                                var20 = stackIn_114_0;
                                L45: while (true) {
                                  L46: {
                                    if (var5_int <= var20) {
                                      var18++;
                                      break L46;
                                    } else {
                                      var19 = var19 + var13.h(46);
                                      if (var22 != 0) {
                                        break L46;
                                      } else {
                                        L47: {
                                          L48: {
                                            if (var6 == null) {
                                              break L48;
                                            } else {
                                              var21 = var6[var20];
                                              if (var22 == 0) {
                                                break L47;
                                              } else {
                                                break L48;
                                              }
                                            }
                                          }
                                          var21 = var20;
                                          break L47;
                                        }
                                        L49: {
                                          if (param0 != var21) {
                                            break L49;
                                          } else {
                                            cua.a(var10, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L49;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L45;
                                      }
                                    }
                                  }
                                  continue L44;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_126_0 = 1;
                    stackIn_127_0 = stackOut_126_0;
                    break L14;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) var5;
            stackOut_128_1 = new StringBuilder().append("asb.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_130_0 = stackOut_128_0;
            stackIn_130_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param3 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L50;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_131_0 = stackOut_129_0;
              stackIn_131_1 = stackOut_129_1;
              stackIn_131_2 = stackOut_129_2;
              break L50;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_131_0, stackIn_131_2 + 41);
        }
        return stackIn_127_0 != 0;
    }

    asb(fnb param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((asb) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((asb) this).field_e = stackIn_7_1 != 0;
                  ((asb) this).field_h = param2;
                  ((asb) this).field_d = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("asb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
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
