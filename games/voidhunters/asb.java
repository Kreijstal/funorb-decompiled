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
        int discarded$0 = 0;
        if (!this.b((byte) -59)) {
            return null;
        }
        if (param0 != 9) {
            String var4 = (String) null;
            discarded$0 = this.a((String) null, 14);
        }
        if (-2 == (this.field_g.field_m.length ^ -1)) {
            return this.a(0, param1, (byte) 13);
        }
        if (!this.b((byte) 125, param1)) {
            return null;
        }
        if (!(this.field_g.field_m[param1] != 1)) {
            return this.a(param1, 0, (byte) 13);
        }
        throw new RuntimeException();
    }

    final int c(byte param0) {
        int discarded$0 = 0;
        if (!this.b((byte) 88)) {
            return -1;
        }
        if (param0 < 37) {
            discarded$0 = this.a(86, -10);
        }
        return this.field_g.field_m.length;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 106)) {
              if (param1 == -2118) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, var4));
                stackOut_6_0 = this.a(var3_int, 1045);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("asb.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int b(String param0, int param1) {
        boolean discarded$2 = false;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) -117)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_a.a(-123454015, vla.a((byte) 109, var4));
              if (!this.b((byte) -72, var3_int)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 <= -69) {
                    break L1;
                  } else {
                    discarded$2 = this.c(((int[]) (this.field_i[12]))[7], ((int[]) (((Object[]) (this.field_i[2]))[2]))[7]);
                    break L1;
                  }
                }
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("asb.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b((byte) -121, param0)) {
            return 0;
        }
        if (this.field_i[param0] != null) {
            return 100;
        }
        if (param1 != 1045) {
            return -57;
        }
        return this.field_d.a(param0, false);
    }

    final static void a(int param0, mm param1, boolean param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        mm var27 = null;
        int var28 = 0;
        cna var29 = null;
        cna var30 = null;
        cna[] var31 = null;
        Object var32 = null;
        String var32_ref = null;
        String var33 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        cna stackIn_33_0 = null;
        cna stackIn_34_0 = null;
        cna stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        cna stackIn_40_0 = null;
        cna stackIn_41_0 = null;
        cna stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        cna stackIn_88_0 = null;
        cna stackIn_89_0 = null;
        cna stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        cna stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        cna stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        cna stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        int stackIn_97_2 = 0;
        cna stackIn_99_0 = null;
        cna stackIn_100_0 = null;
        cna stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        cna stackIn_103_0 = null;
        cna stackIn_104_0 = null;
        cna stackIn_105_0 = null;
        cna stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        cna stackIn_121_0 = null;
        cna stackIn_122_0 = null;
        cna stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        cna stackIn_126_0 = null;
        cna stackIn_127_0 = null;
        cna stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        cna stackIn_130_0 = null;
        cna stackIn_131_0 = null;
        cna stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        cna stackIn_134_0 = null;
        cna stackIn_135_0 = null;
        cna stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        String stackIn_152_0 = null;
        cna stackIn_156_0 = null;
        cna stackIn_157_0 = null;
        cna stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        cna stackIn_159_0 = null;
        cna stackIn_160_0 = null;
        cna stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_222_0 = 0;
        cna stackIn_317_0 = null;
        cna stackIn_318_0 = null;
        cna stackIn_319_0 = null;
        int stackIn_319_1 = 0;
        cna stackIn_323_0 = null;
        boolean stackIn_323_1 = false;
        cna stackIn_324_0 = null;
        boolean stackIn_324_1 = false;
        cna stackIn_325_0 = null;
        boolean stackIn_325_1 = false;
        int stackIn_325_2 = 0;
        cna stackIn_327_0 = null;
        cna stackIn_328_0 = null;
        cna stackIn_329_0 = null;
        cna stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        cna stackIn_332_0 = null;
        cna stackIn_333_0 = null;
        cna stackIn_334_0 = null;
        cna stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        RuntimeException stackIn_343_0 = null;
        StringBuilder stackIn_343_1 = null;
        RuntimeException stackIn_344_0 = null;
        StringBuilder stackIn_344_1 = null;
        RuntimeException stackIn_345_0 = null;
        StringBuilder stackIn_345_1 = null;
        String stackIn_345_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        cna stackOut_32_0 = null;
        cna stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        cna stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        cna stackOut_39_0 = null;
        cna stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        cna stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        cna stackOut_98_0 = null;
        cna stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        cna stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        cna stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        cna stackOut_96_0 = null;
        boolean stackOut_96_1 = false;
        int stackOut_96_2 = 0;
        cna stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        int stackOut_95_2 = 0;
        cna stackOut_87_0 = null;
        cna stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        cna stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        cna stackOut_102_0 = null;
        cna stackOut_103_0 = null;
        cna stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        cna stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        Object stackOut_151_0 = null;
        String stackOut_150_0 = null;
        cna stackOut_155_0 = null;
        cna stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        cna stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        cna stackOut_158_0 = null;
        cna stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        cna stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        cna stackOut_326_0 = null;
        cna stackOut_327_0 = null;
        cna stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        cna stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        cna stackOut_322_0 = null;
        boolean stackOut_322_1 = false;
        cna stackOut_324_0 = null;
        boolean stackOut_324_1 = false;
        int stackOut_324_2 = 0;
        cna stackOut_323_0 = null;
        boolean stackOut_323_1 = false;
        int stackOut_323_2 = 0;
        cna stackOut_316_0 = null;
        cna stackOut_318_0 = null;
        int stackOut_318_1 = 0;
        cna stackOut_317_0 = null;
        int stackOut_317_1 = 0;
        cna stackOut_331_0 = null;
        cna stackOut_332_0 = null;
        cna stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        cna stackOut_334_0 = null;
        int stackOut_334_1 = 0;
        cna stackOut_120_0 = null;
        cna stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        cna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        cna stackOut_133_0 = null;
        cna stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        cna stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        cna stackOut_129_0 = null;
        cna stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        cna stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        cna stackOut_125_0 = null;
        cna stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        cna stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        RuntimeException stackOut_342_0 = null;
        StringBuilder stackOut_342_1 = null;
        RuntimeException stackOut_344_0 = null;
        StringBuilder stackOut_344_1 = null;
        String stackOut_344_2 = null;
        RuntimeException stackOut_343_0 = null;
        StringBuilder stackOut_343_1 = null;
        String stackOut_343_2 = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2) {
                L2: {
                  if (ii.field_h) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (nmb.b(param3 + 164)) {
                    if (!param1.field_fc) {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_8_0 = stackOut_5_0;
                      break L3;
                    }
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_8_0 = stackOut_3_0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = 0;
                  if (!param2) {
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= 5) {
                        L8: {
                          if (inb.field_q[0][2].field_Q) {
                            if (nmb.b(97)) {
                              lob.field_a = mla.field_r;
                              break L8;
                            } else {
                              lob.field_a = isa.a(oba.field_p, new String[]{lqa.field_o.field_Vb}, 124);
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        if ((ieb.field_o.length ^ -1) <= -3) {
                          L9: {
                            if (param2) {
                              if (-1 != tsa.field_h) {
                                stackOut_54_0 = 1;
                                stackIn_56_0 = stackOut_54_0;
                                break L9;
                              } else {
                                stackOut_53_0 = 0;
                                stackIn_56_0 = stackOut_53_0;
                                break L9;
                              }
                            } else {
                              stackOut_51_0 = 0;
                              stackIn_56_0 = stackOut_51_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_56_0;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            var7 = tsa.field_h;
                            var8_int = 0;
                            L10: while (true) {
                              if (var8_int >= ce.field_o.length) {
                                break L6;
                              } else {
                                ce.field_o[var8_int] = (byte) 0;
                                var8_int++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L11: {
                          if (var4_int == 0) {
                            break L11;
                          } else {
                            if (0 == inb.field_q[0][var6 + 1].field_o) {
                              break L11;
                            } else {
                              if (param1.field_Cb == var6) {
                                break L11;
                              } else {
                                var5 = 1;
                                param1.field_Cb = var6;
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackOut_32_0 = inb.field_q[0][var6 - -1];
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_33_0 = stackOut_32_0;
                          if (var4_int == 0) {
                            stackOut_34_0 = (cna) ((Object) stackIn_34_0);
                            stackOut_34_1 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            break L12;
                          } else {
                            stackOut_33_0 = (cna) ((Object) stackIn_33_0);
                            stackOut_33_1 = 1;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_35_0.field_y = stackIn_35_1 != 0;
                          if (ll.field_o) {
                            break L13;
                          } else {
                            if ((var6 ^ -1) == -4) {
                              inb.field_q[0][var6 - -1].field_y = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackOut_39_0 = inb.field_q[0][1 + var6];
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_40_0 = stackOut_39_0;
                          if (var6 != param1.field_Cb) {
                            stackOut_41_0 = (cna) ((Object) stackIn_41_0);
                            stackOut_41_1 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            break L14;
                          } else {
                            stackOut_40_0 = (cna) ((Object) stackIn_40_0);
                            stackOut_40_1 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            break L14;
                          }
                        }
                        stackIn_42_0.field_J = stackIn_42_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if ((ieb.field_o.length ^ -1) <= -3) {
                      L15: {
                        if (param2) {
                          if (-1 != tsa.field_h) {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L15;
                          } else {
                            stackOut_19_0 = 0;
                            stackIn_22_0 = stackOut_19_0;
                            break L15;
                          }
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_22_0 = stackOut_17_0;
                          break L15;
                        }
                      }
                      var6 = stackIn_22_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = tsa.field_h;
                        var8_int = 0;
                        L16: while (true) {
                          if (var8_int >= ce.field_o.length) {
                            break L6;
                          } else {
                            ce.field_o[var8_int] = (byte) 0;
                            var8_int++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (!param2) {
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L17;
                } else {
                  stackOut_62_0 = -1;
                  stackIn_64_0 = stackOut_62_0;
                  break L17;
                }
              }
              var7 = stackIn_64_0;
              L18: while (true) {
                if (var7 >= ieb.field_o.length) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (tsa.field_h != var7) {
                        stackOut_70_0 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        break L19;
                      } else {
                        stackOut_69_0 = 0;
                        stackIn_72_0 = stackOut_69_0;
                        break L19;
                      }
                    } else {
                      stackOut_67_0 = 0;
                      stackIn_72_0 = stackOut_67_0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_72_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (0 != inb.field_q[1][var7 + 1].field_o) {
                        if (!param2) {
                          var9 = ieb.field_o[var7];
                          if (param1.field_Fb != var9) {
                            var5 = 1;
                            param1.field_Fb = var9;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (var6 == 0) {
                            if (var7 == -1) {
                              var9 = 0;
                              L21: while (true) {
                                if (ce.field_o.length <= var9) {
                                  break L20;
                                } else {
                                  ce.field_o[var9] = (byte) 0;
                                  var9++;
                                  continue L21;
                                }
                              }
                            } else {
                              ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                              break L20;
                            }
                          } else {
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (param2) {
                      if (0 != (var7 ^ -1)) {
                        L23: {
                          stackOut_98_0 = inb.field_q[1][1 + var7];
                          stackIn_100_0 = stackOut_98_0;
                          stackIn_99_0 = stackOut_98_0;
                          if (-1 == (ce.field_o[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                            stackOut_100_0 = (cna) ((Object) stackIn_100_0);
                            stackOut_100_1 = 0;
                            stackIn_101_0 = stackOut_100_0;
                            stackIn_101_1 = stackOut_100_1;
                            break L23;
                          } else {
                            stackOut_99_0 = (cna) ((Object) stackIn_99_0);
                            stackOut_99_1 = 1;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_101_1 = stackOut_99_1;
                            break L23;
                          }
                        }
                        stackIn_101_0.field_J = stackIn_101_1 != 0;
                        break L22;
                      } else {
                        inb.field_q[1][var7 + 1].field_J = true;
                        var9 = 0;
                        L24: while (true) {
                          if (var9 >= ieb.field_o.length) {
                            break L22;
                          } else {
                            L25: {
                              stackOut_94_0 = inb.field_q[1][var7 - -1];
                              stackOut_94_1 = inb.field_q[1][var7 - -1].field_J;
                              stackIn_96_0 = stackOut_94_0;
                              stackIn_96_1 = stackOut_94_1;
                              stackIn_95_0 = stackOut_94_0;
                              stackIn_95_1 = stackOut_94_1;
                              if ((ce.field_o[var9 / 8] & 1 << (7 & var9)) != 0) {
                                stackOut_96_0 = (cna) ((Object) stackIn_96_0);
                                stackOut_96_1 = stackIn_96_1;
                                stackOut_96_2 = 0;
                                stackIn_97_0 = stackOut_96_0;
                                stackIn_97_1 = stackOut_96_1;
                                stackIn_97_2 = stackOut_96_2;
                                break L25;
                              } else {
                                stackOut_95_0 = (cna) ((Object) stackIn_95_0);
                                stackOut_95_1 = stackIn_95_1;
                                stackOut_95_2 = 1;
                                stackIn_97_0 = stackOut_95_0;
                                stackIn_97_1 = stackOut_95_1;
                                stackIn_97_2 = stackOut_95_2;
                                break L25;
                              }
                            }
                            stackIn_97_0.field_J = stackIn_97_1 & stackIn_97_2 != 0;
                            var9++;
                            continue L24;
                          }
                        }
                      }
                    } else {
                      L26: {
                        var9 = ieb.field_o[var7];
                        stackOut_87_0 = inb.field_q[1][1 + var7];
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_88_0 = stackOut_87_0;
                        if (param1.field_Fb != var9) {
                          stackOut_89_0 = (cna) ((Object) stackIn_89_0);
                          stackOut_89_1 = 0;
                          stackIn_90_0 = stackOut_89_0;
                          stackIn_90_1 = stackOut_89_1;
                          break L26;
                        } else {
                          stackOut_88_0 = (cna) ((Object) stackIn_88_0);
                          stackOut_88_1 = 1;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          break L26;
                        }
                      }
                      stackIn_90_0.field_J = stackIn_90_1 != 0;
                      break L22;
                    }
                  }
                  L27: {
                    L28: {
                      stackOut_102_0 = inb.field_q[1][1 + var7];
                      stackIn_105_0 = stackOut_102_0;
                      stackIn_103_0 = stackOut_102_0;
                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackOut_103_0 = (cna) ((Object) stackIn_103_0);
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_104_0 = stackOut_103_0;
                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackOut_104_0 = (cna) ((Object) stackIn_104_0);
                          stackOut_104_1 = 1;
                          stackIn_106_0 = stackOut_104_0;
                          stackIn_106_1 = stackOut_104_1;
                          break L27;
                        }
                      }
                    }
                    stackOut_105_0 = (cna) ((Object) stackIn_105_0);
                    stackOut_105_1 = 0;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    break L27;
                  }
                  stackIn_106_0.field_y = stackIn_106_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (!param2) {
                stackOut_109_0 = 1;
                stackIn_110_0 = stackOut_109_0;
                break L29;
              } else {
                stackOut_108_0 = 0;
                stackIn_110_0 = stackOut_108_0;
                break L29;
              }
            }
            var6 = stackIn_110_0;
            L30: while (true) {
              if (var6 >= 3) {
                L31: {
                  if (param3 == -67) {
                    break L31;
                  } else {
                    var27 = (mm) null;
                    asb.a(-90, (mm) null, true, (byte) -109);
                    break L31;
                  }
                }
                L32: {
                  if (!param2) {
                    break L32;
                  } else {
                    if (nkb.field_r <= 1) {
                      break L32;
                    } else {
                      var6 = 0;
                      L33: while (true) {
                        if (var6 >= nkb.field_r - -1) {
                          break L32;
                        } else {
                          L34: {
                            var30 = inb.field_q[3][var6];
                            if (var4_int == 0) {
                              break L34;
                            } else {
                              if (0 == var30.field_o) {
                                break L34;
                              } else {
                                imb.field_a = var6;
                                break L34;
                              }
                            }
                          }
                          L35: {
                            if (!var30.field_Q) {
                              break L35;
                            } else {
                              if (var6 <= 0) {
                                break L35;
                              } else {
                                L36: {
                                  if (ea.field_k == null) {
                                    stackOut_151_0 = null;
                                    stackIn_152_0 = (String) ((Object) stackOut_151_0);
                                    break L36;
                                  } else {
                                    stackOut_150_0 = ea.field_k[-1 + var6];
                                    stackIn_152_0 = stackOut_150_0;
                                    break L36;
                                  }
                                }
                                var8_ref = stackIn_152_0;
                                if (var8_ref != null) {
                                  lob.field_a = var8_ref;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                          L37: {
                            stackOut_155_0 = (cna) (var30);
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_156_0 = stackOut_155_0;
                            if (var6 != imb.field_a) {
                              stackOut_157_0 = (cna) ((Object) stackIn_157_0);
                              stackOut_157_1 = 0;
                              stackIn_158_0 = stackOut_157_0;
                              stackIn_158_1 = stackOut_157_1;
                              break L37;
                            } else {
                              stackOut_156_0 = (cna) ((Object) stackIn_156_0);
                              stackOut_156_1 = 1;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_158_1 = stackOut_156_1;
                              break L37;
                            }
                          }
                          L38: {
                            stackIn_158_0.field_J = stackIn_158_1 != 0;
                            stackOut_158_0 = (cna) (var30);
                            stackIn_160_0 = stackOut_158_0;
                            stackIn_159_0 = stackOut_158_0;
                            if (var4_int == 0) {
                              stackOut_160_0 = (cna) ((Object) stackIn_160_0);
                              stackOut_160_1 = 0;
                              stackIn_161_0 = stackOut_160_0;
                              stackIn_161_1 = stackOut_160_1;
                              break L38;
                            } else {
                              stackOut_159_0 = (cna) ((Object) stackIn_159_0);
                              stackOut_159_1 = 1;
                              stackIn_161_0 = stackOut_159_0;
                              stackIn_161_1 = stackOut_159_1;
                              break L38;
                            }
                          }
                          stackIn_161_0.field_y = stackIn_161_1 != 0;
                          var6++;
                          continue L33;
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L39: while (true) {
                  if (var7 >= ocb.field_l) {
                    L40: {
                      if (var5 == 0) {
                        break L40;
                      } else {
                        if (!param2) {
                          bh.a(param0, true);
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L41: {
                      var31 = inb.field_q[4 - -var7];
                      var8 = var31;
                      if (!param2) {
                        stackOut_166_0 = 0;
                        stackIn_167_0 = stackOut_166_0;
                        break L41;
                      } else {
                        stackOut_165_0 = -1;
                        stackIn_167_0 = stackOut_165_0;
                        break L41;
                      }
                    }
                    var9 = stackIn_167_0;
                    L42: while (true) {
                      if (var9 >= -1 + var31.length) {
                        var6 = var6 + (255 & vu.field_zb[var7]);
                        var7++;
                        continue L39;
                      } else {
                        L43: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L43;
                          } else {
                            if (var9 >= 0) {
                              L44: {
                                if (hia.field_o == null) {
                                  break L44;
                                } else {
                                  if (hia.field_o[var7] == null) {
                                    break L44;
                                  } else {
                                    if (0 >= ((kbb.field_p ^ -1) & hia.field_o[var7][var9])) {
                                      break L44;
                                    } else {
                                      var14 = 1;
                                      var15 = wsb.a(hia.field_o[var7][var9] & (kbb.field_p ^ -1), 1302374146);
                                      break L44;
                                    }
                                  }
                                }
                              }
                              L45: {
                                if (null == qcb.field_o) {
                                  break L45;
                                } else {
                                  if (qcb.field_o[var7] == null) {
                                    break L45;
                                  } else {
                                    if (0 < hcb.field_o) {
                                      break L45;
                                    } else {
                                      if (!qcb.field_o[var7][var9]) {
                                        break L45;
                                      } else {
                                        var10 = 1;
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (null == crb.field_w) {
                                  break L46;
                                } else {
                                  if (null == crb.field_w[var7]) {
                                    break L46;
                                  } else {
                                    L47: {
                                      var16 = crb.field_w[var7][var9];
                                      if ((var16 ^ -1) >= -1) {
                                        break L47;
                                      } else {
                                        if (tg.field_q < var16) {
                                          var12 = 1;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                    if (-1 == (var16 ^ -1)) {
                                      break L46;
                                    } else {
                                      if (ufa.field_o) {
                                        break L46;
                                      } else {
                                        if ((hcb.field_o ^ -1) < -1) {
                                          break L46;
                                        } else {
                                          var10 = 1;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L48: {
                                if (param2) {
                                  if (nqa.field_b != null) {
                                    if (nqa.field_b[var7] != null) {
                                      if (nqa.field_b[var7][var9]) {
                                        stackOut_199_0 = 1;
                                        stackIn_201_0 = stackOut_199_0;
                                        break L48;
                                      } else {
                                        stackOut_198_0 = 0;
                                        stackIn_201_0 = stackOut_198_0;
                                        break L48;
                                      }
                                    } else {
                                      stackOut_196_0 = 0;
                                      stackIn_201_0 = stackOut_196_0;
                                      break L48;
                                    }
                                  } else {
                                    stackOut_194_0 = 0;
                                    stackIn_201_0 = stackOut_194_0;
                                    break L48;
                                  }
                                } else {
                                  stackOut_192_0 = 0;
                                  stackIn_201_0 = stackOut_192_0;
                                  break L48;
                                }
                              }
                              var13 = stackIn_201_0;
                              if (tab.field_p == null) {
                                break L43;
                              } else {
                                if (tab.field_p[var7] == null) {
                                  break L43;
                                } else {
                                  L49: {
                                    var16 = tab.field_p[var7][var9];
                                    if (var16 <= 0) {
                                      break L49;
                                    } else {
                                      if (var16 > cla.field_b) {
                                        var11 = 1;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  if (0 == var16) {
                                    break L43;
                                  } else {
                                    if (ufa.field_o) {
                                      break L43;
                                    } else {
                                      if (0 < hcb.field_o) {
                                        break L43;
                                      } else {
                                        var10 = 1;
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                        L50: {
                          if (go.field_p < 2) {
                            break L50;
                          } else {
                            if (!si.field_o[12]) {
                              break L50;
                            } else {
                              var12 = 0;
                              var10 = 0;
                              var14 = 0;
                              var11 = 0;
                              var13 = 0;
                              break L50;
                            }
                          }
                        }
                        L51: {
                          L52: {
                            if (var10 != 0) {
                              break L52;
                            } else {
                              if (var11 != 0) {
                                break L52;
                              } else {
                                if (var12 != 0) {
                                  break L52;
                                } else {
                                  if (var13 != 0) {
                                    break L52;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_221_0 = 0;
                                      stackIn_222_0 = stackOut_221_0;
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_220_0 = 1;
                          stackIn_222_0 = stackOut_220_0;
                          break L51;
                        }
                        L53: {
                          var16 = stackIn_222_0;
                          hrb.field_b = true;
                          if (var16 != 0) {
                            break L53;
                          } else {
                            if (var9 < 0) {
                              break L53;
                            } else {
                              if (null == ncb.field_a) {
                                break L53;
                              } else {
                                L54: {
                                  if (!param2) {
                                    break L54;
                                  } else {
                                    if (!ii.field_h) {
                                      break L54;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L55: {
                                  nr.field_p = false;
                                  hrb.field_b = false;
                                  if (tib.field_i == null) {
                                    tib.field_i = new byte[ocb.field_l];
                                    mia.field_a = new boolean[ocb.field_l];
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                                var17_int = 0;
                                L56: while (true) {
                                  if (var7 <= var17_int) {
                                    L57: {
                                      bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                                      if (2 > go.field_p) {
                                        break L57;
                                      } else {
                                        if (!si.field_o[12]) {
                                          break L57;
                                        } else {
                                          hrb.field_b = true;
                                          break L57;
                                        }
                                      }
                                    }
                                    if (hrb.field_b) {
                                      break L53;
                                    } else {
                                      var16 = 1;
                                      break L53;
                                    }
                                  } else {
                                    mia.field_a[var17_int] = false;
                                    var17_int++;
                                    continue L56;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L58: {
                          var17 = var8[var9 - -1];
                          if (var4_int == 0) {
                            break L58;
                          } else {
                            if (0 == var17.field_o) {
                              break L58;
                            } else {
                              if (!param2) {
                                if (var16 != 0) {
                                  break L58;
                                } else {
                                  if ((byte)var9 == param1.field_Pb[var7]) {
                                    break L58;
                                  } else {
                                    param1.field_Pb[var7] = (byte)var9;
                                    var5 = 1;
                                    break L58;
                                  }
                                }
                              } else {
                                if ((var9 ^ -1) == 0) {
                                  var18 = var6;
                                  L59: while (true) {
                                    if (var6 - (-var31.length + 1) <= var18) {
                                      break L58;
                                    } else {
                                      nkb.field_p[var18 / 8] = (byte)dla.a((int) nkb.field_p[var18 / 8], 1 << dla.a(7, var18) ^ -1);
                                      var18++;
                                      continue L59;
                                    }
                                  }
                                } else {
                                  nkb.field_p[(var9 + var6) / 8] = (byte)mgb.a((int) nkb.field_p[(var9 + var6) / 8], 1 << dla.a(var6 + var9, 7));
                                  break L58;
                                }
                              }
                            }
                          }
                        }
                        L60: {
                          if (!param2) {
                            break L60;
                          } else {
                            if (var16 == 0) {
                              break L60;
                            } else {
                              nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], 1 << dla.a(var9 + var6, 7) ^ -1);
                              break L60;
                            }
                          }
                        }
                        L61: {
                          if (-1 < (var9 ^ -1)) {
                            break L61;
                          } else {
                            if (var17.field_Q) {
                              L62: {
                                if (hqb.field_k == null) {
                                  var18_ref = null;
                                  break L62;
                                } else {
                                  if (null == hqb.field_k[var7]) {
                                    var18_ref = null;
                                    break L62;
                                  } else {
                                    var18_ref = hqb.field_k[var7][var9];
                                    break L62;
                                  }
                                }
                              }
                              L63: {
                                if (awa.field_o == null) {
                                  var19 = null;
                                  break L63;
                                } else {
                                  if (null != awa.field_o[var7]) {
                                    var19 = awa.field_o[var7][var9];
                                    break L63;
                                  } else {
                                    var19 = null;
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                var20 = null;
                                if (var19 == null) {
                                  break L64;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = k.field_q;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var21;
                                  break L65;
                                } else {
                                  if (var10 != 0) {
                                    var21 = bpa.field_d;
                                    break L65;
                                  } else {
                                    L66: {
                                      if (var11 != 0) {
                                        var22_int = tab.field_p[var7][var9] + -cla.field_b;
                                        if (var22_int == 1) {
                                          var21 = wia.field_b;
                                          var32 = var21;
                                          var21 = var32;
                                          var32 = var21;
                                          var21 = var32;
                                          break L66;
                                        } else {
                                          var21 = isa.a(nra.field_a, new String[]{Integer.toString(var22_int)}, 105);
                                          break L66;
                                        }
                                      } else {
                                        break L66;
                                      }
                                    }
                                    L67: {
                                      if (var12 == 0) {
                                        break L67;
                                      } else {
                                        var32_ref = isa.a(gh.field_p, new String[]{Integer.toString(tg.field_q), Integer.toString(crb.field_w[var7][var9])}, 110);
                                        var21 = var32_ref;
                                        var21 = var32_ref;
                                        if (var21 == null) {
                                          var21 = var32_ref;
                                          break L67;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var32_ref;
                                          break L67;
                                        }
                                      }
                                    }
                                    if (var14 == 0) {
                                      break L65;
                                    } else {
                                      L68: {
                                        var22_ref = lp.field_a;
                                        if (-1 <= (var15 ^ -1)) {
                                          break L68;
                                        } else {
                                          if (mta.field_a == null) {
                                            break L68;
                                          } else {
                                            if (mta.field_a.length < var15) {
                                              break L68;
                                            } else {
                                              if (null == mta.field_a[var15 + -1]) {
                                                break L68;
                                              } else {
                                                var22_ref = mta.field_a[var15 - 1][0];
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22_ref;
                                        break L65;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + var22_ref;
                                        break L65;
                                      }
                                    }
                                  }
                                }
                              }
                              L69: {
                                if (var4_int == 0) {
                                  break L69;
                                } else {
                                  if (!hrb.field_b) {
                                    L70: {
                                      var22_ref = null;
                                      var23 = 0;
                                      if (!nr.field_p) {
                                        break L70;
                                      } else {
                                        var22_ref = "</col>" + uda.field_a + "<col=A00000>";
                                        var25_ref = var22_ref;
                                        var22_ref = var25_ref;
                                        var25_ref = var22_ref;
                                        var22_ref = var25_ref;
                                        var21 = var22_ref;
                                        break L70;
                                      }
                                    }
                                    var24 = 0;
                                    L71: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 == 0) {
                                          var21 = isa.a(fra.field_c, new String[]{var22_ref}, 78);
                                          break L69;
                                        } else {
                                          var21 = nna.field_F + var22_ref;
                                          break L69;
                                        }
                                      } else {
                                        if (mia.field_a[var24]) {
                                          L72: {
                                            var25_ref = "</col>" + hva.field_c[var24] + "<col=A00000>";
                                            var22_ref = var25_ref;
                                            var21 = var22_ref;
                                            var22_ref = var25_ref;
                                            if (var22_ref == null) {
                                              var22_ref = var25_ref;
                                              var21 = var22_ref;
                                              var21 = var22_ref;
                                              break L72;
                                            } else {
                                              var23 = 1;
                                              var22_ref = var22_ref + ", " + var25_ref;
                                              break L72;
                                            }
                                          }
                                          var24++;
                                          continue L71;
                                        } else {
                                          var24++;
                                          continue L71;
                                        }
                                      }
                                    }
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              L73: {
                                if (var21 == null) {
                                  break L73;
                                } else {
                                  var21 = "<col=A00000>" + (String) (var21);
                                  var33 = jd.a((String) (var21), "<br>", 0, "<br><col=A00000>");
                                  if (var20 != null) {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L73;
                                  } else {
                                    var20 = var33;
                                    break L73;
                                  }
                                }
                              }
                              if (var20 == null) {
                                break L61;
                              } else {
                                lob.field_a = (String) (var20);
                                break L61;
                              }
                            } else {
                              break L61;
                            }
                          }
                        }
                        L74: {
                          if (!param2) {
                            L75: {
                              L76: {
                                stackOut_326_0 = (cna) (var17);
                                stackIn_329_0 = stackOut_326_0;
                                stackIn_327_0 = stackOut_326_0;
                                if (!hrb.field_b) {
                                  break L76;
                                } else {
                                  stackOut_327_0 = (cna) ((Object) stackIn_327_0);
                                  stackIn_329_0 = stackOut_327_0;
                                  stackIn_328_0 = stackOut_327_0;
                                  if ((byte)var9 != param1.field_Pb[var7]) {
                                    break L76;
                                  } else {
                                    stackOut_328_0 = (cna) ((Object) stackIn_328_0);
                                    stackOut_328_1 = 1;
                                    stackIn_330_0 = stackOut_328_0;
                                    stackIn_330_1 = stackOut_328_1;
                                    break L75;
                                  }
                                }
                              }
                              stackOut_329_0 = (cna) ((Object) stackIn_329_0);
                              stackOut_329_1 = 0;
                              stackIn_330_0 = stackOut_329_0;
                              stackIn_330_1 = stackOut_329_1;
                              break L75;
                            }
                            stackIn_330_0.field_J = stackIn_330_1 != 0;
                            break L74;
                          } else {
                            if (0 == (var9 ^ -1)) {
                              var17.field_J = true;
                              var28 = var6;
                              var18 = var28;
                              L77: while (true) {
                                if (var28 >= var6 - (-var31.length + 1)) {
                                  break L74;
                                } else {
                                  L78: {
                                    stackOut_322_0 = (cna) (var17);
                                    stackOut_322_1 = var17.field_J;
                                    stackIn_324_0 = stackOut_322_0;
                                    stackIn_324_1 = stackOut_322_1;
                                    stackIn_323_0 = stackOut_322_0;
                                    stackIn_323_1 = stackOut_322_1;
                                    if (0 != (nkb.field_p[var28 / 8] & 1 << (var28 & 7))) {
                                      stackOut_324_0 = (cna) ((Object) stackIn_324_0);
                                      stackOut_324_1 = stackIn_324_1;
                                      stackOut_324_2 = 0;
                                      stackIn_325_0 = stackOut_324_0;
                                      stackIn_325_1 = stackOut_324_1;
                                      stackIn_325_2 = stackOut_324_2;
                                      break L78;
                                    } else {
                                      stackOut_323_0 = (cna) ((Object) stackIn_323_0);
                                      stackOut_323_1 = stackIn_323_1;
                                      stackOut_323_2 = 1;
                                      stackIn_325_0 = stackOut_323_0;
                                      stackIn_325_1 = stackOut_323_1;
                                      stackIn_325_2 = stackOut_323_2;
                                      break L78;
                                    }
                                  }
                                  stackIn_325_0.field_J = stackIn_325_1 & stackIn_325_2 != 0;
                                  var28++;
                                  continue L77;
                                }
                              }
                            } else {
                              L79: {
                                stackOut_316_0 = (cna) (var17);
                                stackIn_318_0 = stackOut_316_0;
                                stackIn_317_0 = stackOut_316_0;
                                if (-1 == (nkb.field_p[(var6 - -var9) / 8] & 1 << (var9 + var6 & 7) ^ -1)) {
                                  stackOut_318_0 = (cna) ((Object) stackIn_318_0);
                                  stackOut_318_1 = 0;
                                  stackIn_319_0 = stackOut_318_0;
                                  stackIn_319_1 = stackOut_318_1;
                                  break L79;
                                } else {
                                  stackOut_317_0 = (cna) ((Object) stackIn_317_0);
                                  stackOut_317_1 = 1;
                                  stackIn_319_0 = stackOut_317_0;
                                  stackIn_319_1 = stackOut_317_1;
                                  break L79;
                                }
                              }
                              stackIn_319_0.field_J = stackIn_319_1 != 0;
                              break L74;
                            }
                          }
                        }
                        L80: {
                          L81: {
                            stackOut_331_0 = (cna) (var17);
                            stackIn_334_0 = stackOut_331_0;
                            stackIn_332_0 = stackOut_331_0;
                            if (var4_int == 0) {
                              break L81;
                            } else {
                              stackOut_332_0 = (cna) ((Object) stackIn_332_0);
                              stackIn_334_0 = stackOut_332_0;
                              stackIn_333_0 = stackOut_332_0;
                              if (var16 != 0) {
                                break L81;
                              } else {
                                stackOut_333_0 = (cna) ((Object) stackIn_333_0);
                                stackOut_333_1 = 1;
                                stackIn_335_0 = stackOut_333_0;
                                stackIn_335_1 = stackOut_333_1;
                                break L80;
                              }
                            }
                          }
                          stackOut_334_0 = (cna) ((Object) stackIn_334_0);
                          stackOut_334_1 = 0;
                          stackIn_335_0 = stackOut_334_0;
                          stackIn_335_1 = stackOut_334_1;
                          break L80;
                        }
                        stackIn_335_0.field_y = stackIn_335_1 != 0;
                        var9++;
                        continue L42;
                      }
                    }
                  }
                }
              } else {
                L82: {
                  var29 = inb.field_q[2][var6];
                  if (var4_int == 0) {
                    break L82;
                  } else {
                    if (var29.field_o == 0) {
                      break L82;
                    } else {
                      if (!param2) {
                        if (param1.field_Bb == var6) {
                          break L82;
                        } else {
                          var5 = 1;
                          param1.field_Bb = var6;
                          break L82;
                        }
                      } else {
                        if (0 != var6) {
                          qd.field_d = qd.field_d ^ var6;
                          break L82;
                        } else {
                          qd.field_d = 0;
                          break L82;
                        }
                      }
                    }
                  }
                }
                L83: {
                  stackOut_120_0 = (cna) (var29);
                  stackIn_122_0 = stackOut_120_0;
                  stackIn_121_0 = stackOut_120_0;
                  if (var4_int == 0) {
                    stackOut_122_0 = (cna) ((Object) stackIn_122_0);
                    stackOut_122_1 = 0;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    break L83;
                  } else {
                    stackOut_121_0 = (cna) ((Object) stackIn_121_0);
                    stackOut_121_1 = 1;
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_123_1 = stackOut_121_1;
                    break L83;
                  }
                }
                L84: {
                  stackIn_123_0.field_y = stackIn_123_1 != 0;
                  if (!param2) {
                    L85: {
                      stackOut_133_0 = (cna) (var29);
                      stackIn_135_0 = stackOut_133_0;
                      stackIn_134_0 = stackOut_133_0;
                      if (0 == (var6 & param1.field_Bb)) {
                        stackOut_135_0 = (cna) ((Object) stackIn_135_0);
                        stackOut_135_1 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        break L85;
                      } else {
                        stackOut_134_0 = (cna) ((Object) stackIn_134_0);
                        stackOut_134_1 = 1;
                        stackIn_136_0 = stackOut_134_0;
                        stackIn_136_1 = stackOut_134_1;
                        break L85;
                      }
                    }
                    stackIn_136_0.field_J = stackIn_136_1 != 0;
                    break L84;
                  } else {
                    if (-1 != (var6 ^ -1)) {
                      L86: {
                        stackOut_129_0 = (cna) (var29);
                        stackIn_131_0 = stackOut_129_0;
                        stackIn_130_0 = stackOut_129_0;
                        if ((qd.field_d & var6) == 0) {
                          stackOut_131_0 = (cna) ((Object) stackIn_131_0);
                          stackOut_131_1 = 0;
                          stackIn_132_0 = stackOut_131_0;
                          stackIn_132_1 = stackOut_131_1;
                          break L86;
                        } else {
                          stackOut_130_0 = (cna) ((Object) stackIn_130_0);
                          stackOut_130_1 = 1;
                          stackIn_132_0 = stackOut_130_0;
                          stackIn_132_1 = stackOut_130_1;
                          break L86;
                        }
                      }
                      stackIn_132_0.field_J = stackIn_132_1 != 0;
                      break L84;
                    } else {
                      L87: {
                        stackOut_125_0 = (cna) (var29);
                        stackIn_127_0 = stackOut_125_0;
                        stackIn_126_0 = stackOut_125_0;
                        if (0 != qd.field_d) {
                          stackOut_127_0 = (cna) ((Object) stackIn_127_0);
                          stackOut_127_1 = 0;
                          stackIn_128_0 = stackOut_127_0;
                          stackIn_128_1 = stackOut_127_1;
                          break L87;
                        } else {
                          stackOut_126_0 = (cna) ((Object) stackIn_126_0);
                          stackOut_126_1 = 1;
                          stackIn_128_0 = stackOut_126_0;
                          stackIn_128_1 = stackOut_126_1;
                          break L87;
                        }
                      }
                      stackIn_128_0.field_J = stackIn_128_1 != 0;
                      break L84;
                    }
                  }
                }
                var6++;
                continue L30;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L88: {
            var4 = decompiledCaughtException;
            stackOut_342_0 = (RuntimeException) (var4);
            stackOut_342_1 = new StringBuilder().append("asb.C(").append(param0).append(',');
            stackIn_344_0 = stackOut_342_0;
            stackIn_344_1 = stackOut_342_1;
            stackIn_343_0 = stackOut_342_0;
            stackIn_343_1 = stackOut_342_1;
            if (param1 == null) {
              stackOut_344_0 = (RuntimeException) ((Object) stackIn_344_0);
              stackOut_344_1 = (StringBuilder) ((Object) stackIn_344_1);
              stackOut_344_2 = "null";
              stackIn_345_0 = stackOut_344_0;
              stackIn_345_1 = stackOut_344_1;
              stackIn_345_2 = stackOut_344_2;
              break L88;
            } else {
              stackOut_343_0 = (RuntimeException) ((Object) stackIn_343_0);
              stackOut_343_1 = (StringBuilder) ((Object) stackIn_343_1);
              stackOut_343_2 = "{...}";
              stackIn_345_0 = stackOut_343_0;
              stackIn_345_1 = stackOut_343_1;
              stackIn_345_2 = stackOut_343_2;
              break L88;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_345_0), stackIn_345_2 + ',' + param2 + ',' + param3 + ')');
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              var5 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_p[param1].a(-123454015, vla.a((byte) 122, var5));
              if (param0) {
                if (!this.a(var4_int, param1, 0)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = 78;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("asb.T(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized boolean b(byte param0, int param1) {
        int var3 = -101 % ((85 - param0) / 33);
        if (!this.b((byte) 103)) {
            return false;
        }
        if (param1 >= 0) {
            if (this.field_g.field_m.length > param1) {
                if (0 != this.field_g.field_m[param1]) {
                    return true;
                }
            }
        }
        if (sl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
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
        int decompiledRegionSelector0 = 0;
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
                this.field_e = ((boolean[]) (((Object[]) (this.field_i[30]))[11]))[9];
                break L1;
              }
            }
            if (this.b((byte) -77)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 114, var6));
              if (this.b((byte) -28, var4_int)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 116, var7));
                stackOut_8_0 = this.a(var4_int, var5, (byte) 13);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("asb.U(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    final boolean a(int param0, String param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 116)) {
              L1: {
                param1 = param1.toLowerCase();
                var5 = (CharSequence) ((Object) param1);
                var3_int = this.field_g.field_a.a(param0 + -123486186, vla.a((byte) 127, var5));
                if (param0 == 32171) {
                  break L1;
                } else {
                  var4 = (String) null;
                  discarded$2 = this.a(-117, (String) null);
                  break L1;
                }
              }
              stackOut_5_0 = this.c(121, var3_int);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("asb.G(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized boolean c(int param0, int param1) {
        int discarded$0 = 0;
        if (!this.b((byte) -40, param1)) {
            return false;
        }
        if (!(this.field_i[param1] == null)) {
            return true;
        }
        this.a((byte) -92, param1);
        if (param0 <= 46) {
            discarded$0 = this.b(((int[]) (this.field_i[8]))[0]);
        }
        if (this.field_i[param1] != null) {
            return true;
        }
        return false;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 77)) {
              if (param0) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_g.field_a.a(-123454015, vla.a((byte) 108, var4));
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) (((Object[]) (this.field_i[13]))[2]))[12];
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("asb.BA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_g) {
            this.field_g = this.field_d.a((byte) 9);
            if (this.field_g == null) {
                return false;
            }
            this.field_c = new Object[this.field_g.field_l][];
            this.field_i = new Object[this.field_g.field_l];
        }
        int var2 = -12 / ((param0 - 21) / 56);
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (this.b((byte) 84)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (this.field_g.field_i.length <= var3) {
              L1: {
                if (param0 >= 1) {
                  break L1;
                } else {
                  this.field_g = (qp) null;
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_g.field_i[var3];
              if (null == this.field_i[var4]) {
                this.a((byte) -122, var4);
                if (this.field_i[var4] == null) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, String param1, byte[] param2, int param3, String param4) {
        try {
            String var7 = null;
            File var5 = null;
            if (param3 >= -68) {
                var7 = (String) null;
                asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
            }
            var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
            try {
                oj.a(var5, 3, param2, param0);
            } catch (IOException iOException) {
                iOException.printStackTrace();
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
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            var5_int = -73 % ((param1 - 20) / 48);
            if (this.a(param3, param0, 0)) {
              L1: {
                L2: {
                  var6 = null;
                  if (null == this.field_c[param0]) {
                    break L2;
                  } else {
                    if (null == this.field_c[param0][param3]) {
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
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (null != this.field_c[param0]) {
                L3: {
                  if (this.field_c[param0][param3] == null) {
                    break L3;
                  } else {
                    var8 = ffb.a(false, this.field_c[param0][param3], true);
                    var6 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 != null) {
                    if (this.field_h == 1) {
                      this.field_c[param0][param3] = null;
                      if ((this.field_g.field_m[param0] ^ -1) != -2) {
                        break L4;
                      } else {
                        this.field_c[param0] = null;
                        break L4;
                      }
                    } else {
                      if (2 != this.field_h) {
                        break L4;
                      } else {
                        this.field_c[param0] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_24_0 = var6;
                stackIn_25_0 = stackOut_24_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("asb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_10_0);
          } else {
            return (byte[]) ((Object) stackIn_25_0);
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -114 % ((param0 - 25) / 54);
        field_a = null;
    }

    private final synchronized void a(byte param0, int param1) {
        if (!this.field_e) {
            this.field_i[param1] = gfb.a(false, this.field_d.a(127, param1), -12445);
        } else {
            this.field_i[param1] = this.field_d.a(118, param1);
        }
        if (param0 >= -67) {
            ((long[]) (this.field_i[9]))[11] = -71L;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        String var5 = null;
        if (this.b((byte) 83)) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param1 >= this.field_g.field_m.length) {
                  break L0;
                } else {
                  if (param0 < this.field_g.field_m[param1]) {
                    if (param2 == 0) {
                      return true;
                    } else {
                      var5 = (String) null;
                      discarded$2 = this.a(((int[]) (this.field_i[0]))[0], (String) null);
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (sl.field_b) {
            throw new IllegalArgumentException(param1 + " " + param0);
          } else {
            return false;
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
        int decompiledRegionSelector0 = 0;
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
            if (!this.b((byte) -106)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == -107) {
                  break L1;
                } else {
                  this.field_c = (Object[][]) (((Object[]) (((Object[]) (this.field_i[6]))[6]))[0]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 127, var6));
              if (-1 >= (var4_int ^ -1)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 123, var7));
                if (-1 >= (var5 ^ -1)) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("asb.W(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 13) {
            return (byte[]) (this.field_i[0]);
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
        int decompiledRegionSelector0 = 0;
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
            if (!this.b((byte) 82)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  this.field_c = (Object[][]) null;
                  break L1;
                }
              }
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 120, var6));
              if (!this.b((byte) 125, var4_int)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 108, var7));
                stackOut_10_0 = this.a((byte) 84, var5, var4_int);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("asb.DA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!(this.b((byte) 81))) {
            return false;
        }
        if (this.field_g.field_m.length == 1) {
            return this.a((byte) 95, param0, 0);
        }
        if (!this.b((byte) 121, param0)) {
            return false;
        }
        if (!param1) {
            this.field_i[1] = (Object) null;
        }
        if (-2 == (this.field_g.field_m[param0] ^ -1)) {
            return this.a((byte) 97, 0, param0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (!this.b((byte) 109)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_i.length) {
              if (0 != var2) {
                L1: {
                  if (param0 <= -101) {
                    break L1;
                  } else {
                    this.field_h = 103;
                    break L1;
                  }
                }
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (this.field_g.field_j[var4] ^ -1)) {
                var3 = var3 + this.a(var4, 1045);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -6942) {
            this.field_i[2] = ((Object[]) (this.field_i[3]))[1];
        }
        if (!this.b((byte) -33, param0)) {
            return 0;
        }
        return this.field_g.field_m[param0];
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.a(param1, param2, 0))) {
            return false;
        }
        if (this.field_c[param2] != null) {
            if (!(null == this.field_c[param2][param1])) {
                return true;
            }
        }
        if (param0 <= 56) {
            return ((boolean[]) (this.field_i[7]))[0];
        }
        if (null != this.field_i[param2]) {
            return true;
        }
        this.a((byte) -116, param2);
        if (this.field_i[param2] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ds var26 = null;
        byte[] var27 = null;
        ds var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ds var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.b((byte) 120, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_i[param2]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_g.field_j[param2];
                  var34 = this.field_g.field_g[param2];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_c[param2]) {
                    array$2 = new Object[this.field_g.field_m[param2]];
                    this.field_c[param2] = array$2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var34[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param3[0] != 0) {
                              break L7;
                            } else {
                              if (param3[1] != 0) {
                                break L7;
                              } else {
                                if (param3[2] != 0) {
                                  break L7;
                                } else {
                                  if (0 == param3[3]) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = ffb.a(true, this.field_i[param2], true);
                          var25 = var35;
                          var9_array = var25;
                          var26 = new ds(var35);
                          var26.a(5, param3, var26.field_h.length, false);
                          break L5;
                        }
                      }
                      var9_array = ffb.a(false, this.field_i[param2], true);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = rob.a(param1, var9_array);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_34_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackOut_34_1 = new StringBuilder();
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (param3 == null) {
                          stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackOut_36_2 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L9;
                        } else {
                          stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackOut_35_2 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L9;
                        }
                      }
                      throw rta.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param2 + " " + param3.length + " " + psb.a(var9_array, param3.length, 0) + " " + psb.a(var9_array, -2 + param3.length, 0) + " " + this.field_g.field_d[param2] + " " + this.field_g.field_k);
                    }
                    L10: {
                      if (!this.field_e) {
                        break L10;
                      } else {
                        this.field_i[param2] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (this.field_h == 2) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var32 = new ds(var43);
                          var14 = 0;
                          var15 = 0;
                          var32.field_e = var11;
                          var16 = 0;
                          L12: while (true) {
                            if (var12 <= var16) {
                              if (var14 == 0) {
                                stackOut_85_0 = 1;
                                stackIn_86_0 = stackOut_85_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14];
                                var32.field_e = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var32.h(46);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L15;
                                          } else {
                                            var21 = var34[var20];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param0 != var21) {
                                            break L16;
                                          } else {
                                            cua.a(var43, var17, var44, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var32.h(param1 + 37);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L18;
                                    } else {
                                      var19 = var34[var18];
                                      break L18;
                                    }
                                  }
                                  if (param0 == var19) {
                                    var15 = var19;
                                    var14 = var14 + var17;
                                    var18++;
                                    continue L17;
                                  } else {
                                    var18++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var29 = new ds(var43);
                          var29.field_e = var11;
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var15 = 0;
                          L19: while (true) {
                            if (var15 >= var12) {
                              var39 = new byte[var5_int][];
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L20: while (true) {
                                if (var16 >= var5_int) {
                                  var29.field_e = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L21: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L22: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L23: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L23;
                                            } else {
                                              var18 = var34[var17];
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (0 == this.field_h) {
                                              var7[var18] = gfb.a(false, var39[var17], -12445);
                                              break L24;
                                            } else {
                                              var7[var18] = var39[var17];
                                              break L24;
                                            }
                                          }
                                          var17++;
                                          continue L22;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L25: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L21;
                                        } else {
                                          var18 = var18 + var29.h(param1 ^ 19);
                                          cua.a(var43, var16, var39[var19], var38[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$3 = new byte[var38[var16]];
                                  var15_ref_byte____[var16] = array$3;
                                  var38[var16] = 0;
                                  var16++;
                                  continue L20;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L26: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L19;
                                } else {
                                  var16 = var16 + var29.h(68);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (var6 == null) {
                            var11 = 0;
                            break L27;
                          } else {
                            var11 = var34[0];
                            break L27;
                          }
                        }
                        if (this.field_h != 0) {
                          var7[var11] = var43;
                          break L11;
                        } else {
                          var7[var11] = gfb.a(false, var36, -12445);
                          return true;
                        }
                      }
                    }
                    stackOut_99_0 = 1;
                    stackIn_100_0 = stackOut_99_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L28: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) (var5);
            stackOut_101_1 = new StringBuilder().append("asb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param3 == null) {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L28;
            } else {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L28;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_86_0 != 0;
              } else {
                return stackIn_100_0 != 0;
              }
            }
          }
        }
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
        this.field_g = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -3) {
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
                  ((asb) (this)).field_e = stackIn_7_1 != 0;
                  this.field_h = param2;
                  this.field_d = param0;
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("asb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Teams have been balanced";
        field_f = 1;
    }
}
