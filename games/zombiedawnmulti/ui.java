/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui extends br {
    private int field_m;
    static int[] field_i;
    static ja[] field_k;
    private int field_l;
    static String field_j;
    private int field_h;
    private int field_g;
    static int[] field_f;

    final static void a(int param0, ul param1) {
        ac var2 = null;
        try {
            ac.b(param1.a("headers.packvorbis", "", false));
            var2 = ac.a(param1, "jagex logo2.packvorbis", "");
            jd discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ui.A(" + 7478 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 9307) {
            int discarded$0 = this.a(105);
        }
    }

    final static int a(int param0, boolean param1) {
        return 16711935 & 15 * (16711935 & param0) >> 4 | (param0 & 65280) * 15 >> 4 & 65280;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = -3 % ((-42 - param0) / 33);
        if (Math.abs(param1 + -((ui) this).field_h) < 30) {
          if (Math.abs(-((ui) this).field_m + param2) >= 30) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ja[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int[] var11 = null;
        ja[] var12 = null;
        ja[] var14 = null;
        ja[] var16 = null;
        ja[] var18 = null;
        ja[] var20 = null;
        ja[] var22 = null;
        ja[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        ja[] stackIn_28_0 = null;
        ef stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        ef stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        ef stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        ja[] stackIn_56_0 = null;
        ef stackIn_57_0 = null;
        String stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        ef stackIn_58_0 = null;
        String stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        ef stackIn_59_0 = null;
        String stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_82_0 = 0;
        ja[] stackIn_90_0 = null;
        ef stackIn_91_0 = null;
        String stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        ef stackIn_92_0 = null;
        String stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        ef stackIn_93_0 = null;
        String stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        int stackIn_100_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_122_0 = 0;
        ja[] stackIn_125_0 = null;
        ef stackIn_126_0 = null;
        String stackIn_126_1 = null;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        ef stackIn_127_0 = null;
        String stackIn_127_1 = null;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        ef stackIn_128_0 = null;
        String stackIn_128_1 = null;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        int stackIn_128_4 = 0;
        int stackIn_135_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_150_0 = 0;
        ja[] stackIn_156_0 = null;
        ef stackIn_157_0 = null;
        String stackIn_157_1 = null;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        ef stackIn_158_0 = null;
        String stackIn_158_1 = null;
        int stackIn_158_2 = 0;
        int stackIn_158_3 = 0;
        ef stackIn_159_0 = null;
        String stackIn_159_1 = null;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        int stackIn_159_4 = 0;
        int stackIn_167_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_182_0 = 0;
        ja[] stackIn_187_0 = null;
        ef stackIn_188_0 = null;
        String stackIn_188_1 = null;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        ef stackIn_189_0 = null;
        String stackIn_189_1 = null;
        int stackIn_189_2 = 0;
        int stackIn_189_3 = 0;
        ef stackIn_190_0 = null;
        String stackIn_190_1 = null;
        int stackIn_190_2 = 0;
        int stackIn_190_3 = 0;
        int stackIn_190_4 = 0;
        int stackIn_198_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_213_0 = 0;
        ja[] stackIn_217_0 = null;
        ef stackIn_218_0 = null;
        String stackIn_218_1 = null;
        int stackIn_218_2 = 0;
        int stackIn_218_3 = 0;
        ef stackIn_219_0 = null;
        String stackIn_219_1 = null;
        int stackIn_219_2 = 0;
        int stackIn_219_3 = 0;
        ef stackIn_220_0 = null;
        String stackIn_220_1 = null;
        int stackIn_220_2 = 0;
        int stackIn_220_3 = 0;
        int stackIn_220_4 = 0;
        int stackIn_228_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_243_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        ja[] stackOut_216_0 = null;
        ja[] stackOut_215_0 = null;
        ef stackOut_217_0 = null;
        String stackOut_217_1 = null;
        int stackOut_217_2 = 0;
        int stackOut_217_3 = 0;
        ef stackOut_219_0 = null;
        String stackOut_219_1 = null;
        int stackOut_219_2 = 0;
        int stackOut_219_3 = 0;
        int stackOut_219_4 = 0;
        ef stackOut_218_0 = null;
        String stackOut_218_1 = null;
        int stackOut_218_2 = 0;
        int stackOut_218_3 = 0;
        int stackOut_218_4 = 0;
        int stackOut_226_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_241_0 = 0;
        ja[] stackOut_186_0 = null;
        ja[] stackOut_185_0 = null;
        ef stackOut_187_0 = null;
        String stackOut_187_1 = null;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        ef stackOut_189_0 = null;
        String stackOut_189_1 = null;
        int stackOut_189_2 = 0;
        int stackOut_189_3 = 0;
        int stackOut_189_4 = 0;
        ef stackOut_188_0 = null;
        String stackOut_188_1 = null;
        int stackOut_188_2 = 0;
        int stackOut_188_3 = 0;
        int stackOut_188_4 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_211_0 = 0;
        ja[] stackOut_155_0 = null;
        ja[] stackOut_154_0 = null;
        ef stackOut_156_0 = null;
        String stackOut_156_1 = null;
        int stackOut_156_2 = 0;
        int stackOut_156_3 = 0;
        ef stackOut_158_0 = null;
        String stackOut_158_1 = null;
        int stackOut_158_2 = 0;
        int stackOut_158_3 = 0;
        int stackOut_158_4 = 0;
        ef stackOut_157_0 = null;
        String stackOut_157_1 = null;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        int stackOut_157_4 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_118_0 = 0;
        ja[] stackOut_124_0 = null;
        ja[] stackOut_123_0 = null;
        ef stackOut_125_0 = null;
        String stackOut_125_1 = null;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        ef stackOut_127_0 = null;
        String stackOut_127_1 = null;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        int stackOut_127_4 = 0;
        ef stackOut_126_0 = null;
        String stackOut_126_1 = null;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_126_4 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_148_0 = 0;
        ja[] stackOut_89_0 = null;
        ja[] stackOut_88_0 = null;
        ef stackOut_90_0 = null;
        String stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        ef stackOut_92_0 = null;
        String stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        ef stackOut_91_0 = null;
        String stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_113_0 = 0;
        ja[] stackOut_55_0 = null;
        ja[] stackOut_54_0 = null;
        ef stackOut_56_0 = null;
        String stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        ef stackOut_58_0 = null;
        String stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        ef stackOut_57_0 = null;
        String stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        ja[] stackOut_27_0 = null;
        ja[] stackOut_26_0 = null;
        ef stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        ef stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        ef stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_48_0 = 0;
        if (null != op.field_m) {
          if (1 < op.field_m.field_t) {
            L0: {
              if (pl.field_I != 10) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var2 = stackIn_7_0;
              if (iq.field_f) {
                if (var2 != 0) {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_13_0 = stackOut_10_0;
                  break L1;
                }
              } else {
                stackOut_8_0 = 0;
                stackIn_13_0 = stackOut_8_0;
                break L1;
              }
            }
            var3 = stackIn_13_0;
            if (!tj.field_f) {
              if (0 >= id.field_D) {
                if (var3 != 0) {
                  if (wf.field_m % 40 < 20) {
                    L2: {
                      var4 = 1;
                      if (var4 != 0) {
                        stackOut_216_0 = rl.field_a;
                        stackIn_217_0 = stackOut_216_0;
                        break L2;
                      } else {
                        stackOut_215_0 = oi.field_h;
                        stackIn_217_0 = stackOut_215_0;
                        break L2;
                      }
                    }
                    L3: {
                      var24 = stackIn_217_0;
                      var5 = var24;
                      var6 = var24[0].field_x + nf.field_d + var24[2].field_x;
                      var7 = qp.field_w.field_C + var24[6].field_w + var24[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var32 = new int[4];
                      var25 = var32;
                      var11 = var25;
                      oo.a(var32);
                      oo.e(-5 + -nf.field_d + 640 + -var24[0].field_x, dq.field_k.field_qb - var7 + var24[0].field_w + -5, 635 - var24[2].field_x, dq.field_k.field_qb + -var24[6].field_w);
                      stackOut_217_0 = qp.field_w;
                      stackOut_217_1 = pb.field_i;
                      stackOut_217_2 = -var24[2].field_x + 635;
                      stackOut_217_3 = dq.field_k.field_qb - (var24[6].field_w - -5);
                      stackIn_219_0 = stackOut_217_0;
                      stackIn_219_1 = stackOut_217_1;
                      stackIn_219_2 = stackOut_217_2;
                      stackIn_219_3 = stackOut_217_3;
                      stackIn_218_0 = stackOut_217_0;
                      stackIn_218_1 = stackOut_217_1;
                      stackIn_218_2 = stackOut_217_2;
                      stackIn_218_3 = stackOut_217_3;
                      if (var4 == 0) {
                        stackOut_219_0 = (ef) (Object) stackIn_219_0;
                        stackOut_219_1 = (String) (Object) stackIn_219_1;
                        stackOut_219_2 = stackIn_219_2;
                        stackOut_219_3 = stackIn_219_3;
                        stackOut_219_4 = 16777215;
                        stackIn_220_0 = stackOut_219_0;
                        stackIn_220_1 = stackOut_219_1;
                        stackIn_220_2 = stackOut_219_2;
                        stackIn_220_3 = stackOut_219_3;
                        stackIn_220_4 = stackOut_219_4;
                        break L3;
                      } else {
                        stackOut_218_0 = (ef) (Object) stackIn_218_0;
                        stackOut_218_1 = (String) (Object) stackIn_218_1;
                        stackOut_218_2 = stackIn_218_2;
                        stackOut_218_3 = stackIn_218_3;
                        stackOut_218_4 = 1;
                        stackIn_220_0 = stackOut_218_0;
                        stackIn_220_1 = stackOut_218_1;
                        stackIn_220_2 = stackOut_218_2;
                        stackIn_220_3 = stackOut_218_3;
                        stackIn_220_4 = stackOut_218_4;
                        break L3;
                      }
                    }
                    L4: {
                      ((ef) (Object) stackIn_220_0).a(stackIn_220_1, stackIn_220_2, stackIn_220_3, stackIn_220_4, -1);
                      oo.b(var32);
                      if (hh.field_b) {
                        if (sq.field_N) {
                          if (!df.field_I) {
                            stackOut_226_0 = 1;
                            stackIn_228_0 = stackOut_226_0;
                            break L4;
                          } else {
                            stackOut_225_0 = 0;
                            stackIn_228_0 = stackOut_225_0;
                            break L4;
                          }
                        } else {
                          stackOut_223_0 = 0;
                          stackIn_228_0 = stackOut_223_0;
                          break L4;
                        }
                      } else {
                        stackOut_221_0 = 0;
                        stackIn_228_0 = stackOut_221_0;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        var9 = stackIn_228_0;
                        if (!param0) {
                          break L6;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L6;
                          } else {
                            if (var9 != 0) {
                              break L6;
                            } else {
                              stackOut_231_0 = 1;
                              stackIn_233_0 = stackOut_231_0;
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_232_0 = 0;
                      stackIn_233_0 = stackOut_232_0;
                      break L5;
                    }
                    dd.a(stackIn_233_0 != 0, 0);
                    if (re.field_b) {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackOut_241_0 = 1;
                            stackIn_243_0 = stackOut_241_0;
                            kg.a(stackIn_243_0 != 0, (byte) 117);
                            return;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L7: {
                      var4 = 0;
                      if (var4 != 0) {
                        stackOut_186_0 = rl.field_a;
                        stackIn_187_0 = stackOut_186_0;
                        break L7;
                      } else {
                        stackOut_185_0 = oi.field_h;
                        stackIn_187_0 = stackOut_185_0;
                        break L7;
                      }
                    }
                    L8: {
                      var22 = stackIn_187_0;
                      var5 = var22;
                      var6 = var22[0].field_x + nf.field_d + var22[2].field_x;
                      var7 = qp.field_w.field_C + var22[6].field_w + var22[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var31 = new int[4];
                      oo.a(var31);
                      oo.e(-5 + -nf.field_d + 640 + -var22[0].field_x, dq.field_k.field_qb - var7 + var22[0].field_w + -5, 635 - var22[2].field_x, dq.field_k.field_qb + -var22[6].field_w);
                      stackOut_187_0 = qp.field_w;
                      stackOut_187_1 = pb.field_i;
                      stackOut_187_2 = -var22[2].field_x + 635;
                      stackOut_187_3 = dq.field_k.field_qb - (var22[6].field_w - -5);
                      stackIn_189_0 = stackOut_187_0;
                      stackIn_189_1 = stackOut_187_1;
                      stackIn_189_2 = stackOut_187_2;
                      stackIn_189_3 = stackOut_187_3;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      stackIn_188_2 = stackOut_187_2;
                      stackIn_188_3 = stackOut_187_3;
                      if (var4 == 0) {
                        stackOut_189_0 = (ef) (Object) stackIn_189_0;
                        stackOut_189_1 = (String) (Object) stackIn_189_1;
                        stackOut_189_2 = stackIn_189_2;
                        stackOut_189_3 = stackIn_189_3;
                        stackOut_189_4 = 16777215;
                        stackIn_190_0 = stackOut_189_0;
                        stackIn_190_1 = stackOut_189_1;
                        stackIn_190_2 = stackOut_189_2;
                        stackIn_190_3 = stackOut_189_3;
                        stackIn_190_4 = stackOut_189_4;
                        break L8;
                      } else {
                        stackOut_188_0 = (ef) (Object) stackIn_188_0;
                        stackOut_188_1 = (String) (Object) stackIn_188_1;
                        stackOut_188_2 = stackIn_188_2;
                        stackOut_188_3 = stackIn_188_3;
                        stackOut_188_4 = 1;
                        stackIn_190_0 = stackOut_188_0;
                        stackIn_190_1 = stackOut_188_1;
                        stackIn_190_2 = stackOut_188_2;
                        stackIn_190_3 = stackOut_188_3;
                        stackIn_190_4 = stackOut_188_4;
                        break L8;
                      }
                    }
                    L9: {
                      ((ef) (Object) stackIn_190_0).a(stackIn_190_1, stackIn_190_2, stackIn_190_3, stackIn_190_4, -1);
                      oo.b(var31);
                      if (hh.field_b) {
                        if (sq.field_N) {
                          if (df.field_I) {
                            stackOut_196_0 = 0;
                            stackIn_198_0 = stackOut_196_0;
                            break L9;
                          } else {
                            stackOut_195_0 = 1;
                            stackIn_198_0 = stackOut_195_0;
                            break L9;
                          }
                        } else {
                          stackOut_193_0 = 0;
                          stackIn_198_0 = stackOut_193_0;
                          break L9;
                        }
                      } else {
                        stackOut_191_0 = 0;
                        stackIn_198_0 = stackOut_191_0;
                        break L9;
                      }
                    }
                    L10: {
                      L11: {
                        var9 = stackIn_198_0;
                        if (!param0) {
                          break L11;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L11;
                          } else {
                            if (var9 != 0) {
                              break L11;
                            } else {
                              stackOut_201_0 = 1;
                              stackIn_203_0 = stackOut_201_0;
                              break L10;
                            }
                          }
                        }
                      }
                      stackOut_202_0 = 0;
                      stackIn_203_0 = stackOut_202_0;
                      break L10;
                    }
                    dd.a(stackIn_203_0 != 0, 0);
                    if (re.field_b) {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackOut_211_0 = 1;
                            stackIn_213_0 = stackOut_211_0;
                            kg.a(stackIn_213_0 != 0, (byte) 117);
                            return;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L12: {
                    var4 = 0;
                    if (var4 != 0) {
                      stackOut_155_0 = rl.field_a;
                      stackIn_156_0 = stackOut_155_0;
                      break L12;
                    } else {
                      stackOut_154_0 = oi.field_h;
                      stackIn_156_0 = stackOut_154_0;
                      break L12;
                    }
                  }
                  L13: {
                    var20 = stackIn_156_0;
                    var5 = var20;
                    var6 = var20[0].field_x + nf.field_d + var20[2].field_x;
                    var7 = qp.field_w.field_C + var20[6].field_w + var20[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var30 = new int[4];
                    oo.a(var30);
                    oo.e(-5 + -nf.field_d + 640 + -var20[0].field_x, dq.field_k.field_qb - var7 + var20[0].field_w + -5, 635 - var20[2].field_x, dq.field_k.field_qb + -var20[6].field_w);
                    stackOut_156_0 = qp.field_w;
                    stackOut_156_1 = pb.field_i;
                    stackOut_156_2 = -var20[2].field_x + 635;
                    stackOut_156_3 = dq.field_k.field_qb - (var20[6].field_w - -5);
                    stackIn_158_0 = stackOut_156_0;
                    stackIn_158_1 = stackOut_156_1;
                    stackIn_158_2 = stackOut_156_2;
                    stackIn_158_3 = stackOut_156_3;
                    stackIn_157_0 = stackOut_156_0;
                    stackIn_157_1 = stackOut_156_1;
                    stackIn_157_2 = stackOut_156_2;
                    stackIn_157_3 = stackOut_156_3;
                    if (var4 == 0) {
                      stackOut_158_0 = (ef) (Object) stackIn_158_0;
                      stackOut_158_1 = (String) (Object) stackIn_158_1;
                      stackOut_158_2 = stackIn_158_2;
                      stackOut_158_3 = stackIn_158_3;
                      stackOut_158_4 = 16777215;
                      stackIn_159_0 = stackOut_158_0;
                      stackIn_159_1 = stackOut_158_1;
                      stackIn_159_2 = stackOut_158_2;
                      stackIn_159_3 = stackOut_158_3;
                      stackIn_159_4 = stackOut_158_4;
                      break L13;
                    } else {
                      stackOut_157_0 = (ef) (Object) stackIn_157_0;
                      stackOut_157_1 = (String) (Object) stackIn_157_1;
                      stackOut_157_2 = stackIn_157_2;
                      stackOut_157_3 = stackIn_157_3;
                      stackOut_157_4 = 1;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      stackIn_159_2 = stackOut_157_2;
                      stackIn_159_3 = stackOut_157_3;
                      stackIn_159_4 = stackOut_157_4;
                      break L13;
                    }
                  }
                  L14: {
                    ((ef) (Object) stackIn_159_0).a(stackIn_159_1, stackIn_159_2, stackIn_159_3, stackIn_159_4, -1);
                    oo.b(var30);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (!df.field_I) {
                          stackOut_165_0 = 1;
                          stackIn_167_0 = stackOut_165_0;
                          break L14;
                        } else {
                          stackOut_164_0 = 0;
                          stackIn_167_0 = stackOut_164_0;
                          break L14;
                        }
                      } else {
                        stackOut_162_0 = 0;
                        stackIn_167_0 = stackOut_162_0;
                        break L14;
                      }
                    } else {
                      stackOut_160_0 = 0;
                      stackIn_167_0 = stackOut_160_0;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      var9 = stackIn_167_0;
                      if (!param0) {
                        break L16;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L16;
                        } else {
                          if (var9 != 0) {
                            break L16;
                          } else {
                            stackOut_170_0 = 1;
                            stackIn_172_0 = stackOut_170_0;
                            break L15;
                          }
                        }
                      }
                    }
                    stackOut_171_0 = 0;
                    stackIn_172_0 = stackOut_171_0;
                    break L15;
                  }
                  dd.a(stackIn_172_0 != 0, 0);
                  if (re.field_b) {
                    if (var9 != 0) {
                      if (param0) {
                        if (vk.i((byte) -39)) {
                          stackOut_180_0 = 1;
                          stackIn_182_0 = stackOut_180_0;
                          kg.a(stackIn_182_0 != 0, (byte) 117);
                          return;
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        kg.a(false, (byte) 117);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (20 <= wf.field_m % 40) {
                  L17: {
                    if (var3 != 0) {
                      if (wf.field_m % 40 >= 20) {
                        stackOut_121_0 = 0;
                        stackIn_122_0 = stackOut_121_0;
                        break L17;
                      } else {
                        stackOut_120_0 = 1;
                        stackIn_122_0 = stackOut_120_0;
                        break L17;
                      }
                    } else {
                      stackOut_118_0 = 0;
                      stackIn_122_0 = stackOut_118_0;
                      break L17;
                    }
                  }
                  L18: {
                    var4 = stackIn_122_0;
                    if (var4 != 0) {
                      stackOut_124_0 = rl.field_a;
                      stackIn_125_0 = stackOut_124_0;
                      break L18;
                    } else {
                      stackOut_123_0 = oi.field_h;
                      stackIn_125_0 = stackOut_123_0;
                      break L18;
                    }
                  }
                  L19: {
                    var18 = stackIn_125_0;
                    var5 = var18;
                    var6 = var18[0].field_x + nf.field_d + var18[2].field_x;
                    var7 = qp.field_w.field_C + var18[6].field_w + var18[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var29 = new int[4];
                    oo.a(var29);
                    oo.e(-5 + -nf.field_d + 640 + -var18[0].field_x, dq.field_k.field_qb - var7 + var18[0].field_w + -5, 635 - var18[2].field_x, dq.field_k.field_qb + -var18[6].field_w);
                    stackOut_125_0 = qp.field_w;
                    stackOut_125_1 = pb.field_i;
                    stackOut_125_2 = -var18[2].field_x + 635;
                    stackOut_125_3 = dq.field_k.field_qb - (var18[6].field_w - -5);
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_127_1 = stackOut_125_1;
                    stackIn_127_2 = stackOut_125_2;
                    stackIn_127_3 = stackOut_125_3;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    stackIn_126_2 = stackOut_125_2;
                    stackIn_126_3 = stackOut_125_3;
                    if (var4 == 0) {
                      stackOut_127_0 = (ef) (Object) stackIn_127_0;
                      stackOut_127_1 = (String) (Object) stackIn_127_1;
                      stackOut_127_2 = stackIn_127_2;
                      stackOut_127_3 = stackIn_127_3;
                      stackOut_127_4 = 16777215;
                      stackIn_128_0 = stackOut_127_0;
                      stackIn_128_1 = stackOut_127_1;
                      stackIn_128_2 = stackOut_127_2;
                      stackIn_128_3 = stackOut_127_3;
                      stackIn_128_4 = stackOut_127_4;
                      break L19;
                    } else {
                      stackOut_126_0 = (ef) (Object) stackIn_126_0;
                      stackOut_126_1 = (String) (Object) stackIn_126_1;
                      stackOut_126_2 = stackIn_126_2;
                      stackOut_126_3 = stackIn_126_3;
                      stackOut_126_4 = 1;
                      stackIn_128_0 = stackOut_126_0;
                      stackIn_128_1 = stackOut_126_1;
                      stackIn_128_2 = stackOut_126_2;
                      stackIn_128_3 = stackOut_126_3;
                      stackIn_128_4 = stackOut_126_4;
                      break L19;
                    }
                  }
                  L20: {
                    ((ef) (Object) stackIn_128_0).a(stackIn_128_1, stackIn_128_2, stackIn_128_3, stackIn_128_4, -1);
                    oo.b(var29);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (df.field_I) {
                          stackOut_134_0 = 0;
                          stackIn_135_0 = stackOut_134_0;
                          break L20;
                        } else {
                          stackOut_133_0 = 1;
                          stackIn_135_0 = stackOut_133_0;
                          break L20;
                        }
                      } else {
                        stackOut_131_0 = 0;
                        stackIn_135_0 = stackOut_131_0;
                        break L20;
                      }
                    } else {
                      stackOut_129_0 = 0;
                      stackIn_135_0 = stackOut_129_0;
                      break L20;
                    }
                  }
                  L21: {
                    L22: {
                      var9 = stackIn_135_0;
                      if (!param0) {
                        break L22;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L22;
                        } else {
                          if (var9 != 0) {
                            break L22;
                          } else {
                            stackOut_138_0 = 1;
                            stackIn_140_0 = stackOut_138_0;
                            break L21;
                          }
                        }
                      }
                    }
                    stackOut_139_0 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    break L21;
                  }
                  dd.a(stackIn_140_0 != 0, 0);
                  if (re.field_b) {
                    L23: {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackOut_148_0 = 1;
                            stackIn_150_0 = stackOut_148_0;
                            kg.a(stackIn_150_0 != 0, (byte) 117);
                            break L23;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        break L23;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L24: {
                    var4 = 1;
                    if (var4 != 0) {
                      stackOut_89_0 = rl.field_a;
                      stackIn_90_0 = stackOut_89_0;
                      break L24;
                    } else {
                      stackOut_88_0 = oi.field_h;
                      stackIn_90_0 = stackOut_88_0;
                      break L24;
                    }
                  }
                  L25: {
                    var16 = stackIn_90_0;
                    var5 = var16;
                    var6 = var16[0].field_x + nf.field_d + var16[2].field_x;
                    var7 = qp.field_w.field_C + var16[6].field_w + var16[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var28 = new int[4];
                    oo.a(var28);
                    oo.e(-5 + -nf.field_d + 640 + -var16[0].field_x, dq.field_k.field_qb - var7 + var16[0].field_w + -5, 635 - var16[2].field_x, dq.field_k.field_qb + -var16[6].field_w);
                    stackOut_90_0 = qp.field_w;
                    stackOut_90_1 = pb.field_i;
                    stackOut_90_2 = -var16[2].field_x + 635;
                    stackOut_90_3 = dq.field_k.field_qb - (var16[6].field_w - -5);
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_92_1 = stackOut_90_1;
                    stackIn_92_2 = stackOut_90_2;
                    stackIn_92_3 = stackOut_90_3;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    stackIn_91_2 = stackOut_90_2;
                    stackIn_91_3 = stackOut_90_3;
                    if (var4 == 0) {
                      stackOut_92_0 = (ef) (Object) stackIn_92_0;
                      stackOut_92_1 = (String) (Object) stackIn_92_1;
                      stackOut_92_2 = stackIn_92_2;
                      stackOut_92_3 = stackIn_92_3;
                      stackOut_92_4 = 16777215;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      stackIn_93_2 = stackOut_92_2;
                      stackIn_93_3 = stackOut_92_3;
                      stackIn_93_4 = stackOut_92_4;
                      break L25;
                    } else {
                      stackOut_91_0 = (ef) (Object) stackIn_91_0;
                      stackOut_91_1 = (String) (Object) stackIn_91_1;
                      stackOut_91_2 = stackIn_91_2;
                      stackOut_91_3 = stackIn_91_3;
                      stackOut_91_4 = 1;
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_93_1 = stackOut_91_1;
                      stackIn_93_2 = stackOut_91_2;
                      stackIn_93_3 = stackOut_91_3;
                      stackIn_93_4 = stackOut_91_4;
                      break L25;
                    }
                  }
                  L26: {
                    ((ef) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, -1);
                    oo.b(var28);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (df.field_I) {
                          stackOut_99_0 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          break L26;
                        } else {
                          stackOut_98_0 = 1;
                          stackIn_100_0 = stackOut_98_0;
                          break L26;
                        }
                      } else {
                        stackOut_96_0 = 0;
                        stackIn_100_0 = stackOut_96_0;
                        break L26;
                      }
                    } else {
                      stackOut_94_0 = 0;
                      stackIn_100_0 = stackOut_94_0;
                      break L26;
                    }
                  }
                  L27: {
                    L28: {
                      var9 = stackIn_100_0;
                      if (!param0) {
                        break L28;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L28;
                        } else {
                          if (var9 != 0) {
                            break L28;
                          } else {
                            stackOut_103_0 = 1;
                            stackIn_105_0 = stackOut_103_0;
                            break L27;
                          }
                        }
                      }
                    }
                    stackOut_104_0 = 0;
                    stackIn_105_0 = stackOut_104_0;
                    break L27;
                  }
                  dd.a(stackIn_105_0 != 0, 0);
                  if (re.field_b) {
                    L29: {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackOut_113_0 = 1;
                            stackIn_115_0 = stackOut_113_0;
                            kg.a(stackIn_115_0 != 0, (byte) 117);
                            break L29;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        break L29;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0) {
                L30: {
                  var4 = 1;
                  if (var4 != 0) {
                    stackOut_55_0 = rl.field_a;
                    stackIn_56_0 = stackOut_55_0;
                    break L30;
                  } else {
                    stackOut_54_0 = oi.field_h;
                    stackIn_56_0 = stackOut_54_0;
                    break L30;
                  }
                }
                L31: {
                  var12 = stackIn_56_0;
                  var5 = var12;
                  var6 = var12[0].field_x + nf.field_d + var12[2].field_x;
                  var7 = qp.field_w.field_C + var12[6].field_w + var12[0].field_w;
                  s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                  var26 = new int[4];
                  oo.a(var26);
                  oo.e(-5 + -nf.field_d + 640 + -var12[0].field_x, dq.field_k.field_qb - var7 + var12[0].field_w + -5, 635 - var12[2].field_x, dq.field_k.field_qb + -var12[6].field_w);
                  stackOut_56_0 = qp.field_w;
                  stackOut_56_1 = pb.field_i;
                  stackOut_56_2 = -var12[2].field_x + 635;
                  stackOut_56_3 = dq.field_k.field_qb - (var12[6].field_w - -5);
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_58_1 = stackOut_56_1;
                  stackIn_58_2 = stackOut_56_2;
                  stackIn_58_3 = stackOut_56_3;
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  stackIn_57_2 = stackOut_56_2;
                  stackIn_57_3 = stackOut_56_3;
                  if (var4 == 0) {
                    stackOut_58_0 = (ef) (Object) stackIn_58_0;
                    stackOut_58_1 = (String) (Object) stackIn_58_1;
                    stackOut_58_2 = stackIn_58_2;
                    stackOut_58_3 = stackIn_58_3;
                    stackOut_58_4 = 16777215;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    stackIn_59_2 = stackOut_58_2;
                    stackIn_59_3 = stackOut_58_3;
                    stackIn_59_4 = stackOut_58_4;
                    break L31;
                  } else {
                    stackOut_57_0 = (ef) (Object) stackIn_57_0;
                    stackOut_57_1 = (String) (Object) stackIn_57_1;
                    stackOut_57_2 = stackIn_57_2;
                    stackOut_57_3 = stackIn_57_3;
                    stackOut_57_4 = 1;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    stackIn_59_2 = stackOut_57_2;
                    stackIn_59_3 = stackOut_57_3;
                    stackIn_59_4 = stackOut_57_4;
                    break L31;
                  }
                }
                L32: {
                  ((ef) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2, stackIn_59_3, stackIn_59_4, -1);
                  oo.b(var26);
                  if (hh.field_b) {
                    if (sq.field_N) {
                      if (!df.field_I) {
                        stackOut_65_0 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        break L32;
                      } else {
                        stackOut_64_0 = 0;
                        stackIn_67_0 = stackOut_64_0;
                        break L32;
                      }
                    } else {
                      stackOut_62_0 = 0;
                      stackIn_67_0 = stackOut_62_0;
                      break L32;
                    }
                  } else {
                    stackOut_60_0 = 0;
                    stackIn_67_0 = stackOut_60_0;
                    break L32;
                  }
                }
                L33: {
                  L34: {
                    var9 = stackIn_67_0;
                    if (!param0) {
                      break L34;
                    } else {
                      if (!vk.i((byte) -39)) {
                        break L34;
                      } else {
                        if (var9 != 0) {
                          break L34;
                        } else {
                          stackOut_70_0 = 1;
                          stackIn_72_0 = stackOut_70_0;
                          break L33;
                        }
                      }
                    }
                  }
                  stackOut_71_0 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  break L33;
                }
                dd.a(stackIn_72_0 != 0, 0);
                if (re.field_b) {
                  L35: {
                    if (var9 != 0) {
                      if (param0) {
                        if (vk.i((byte) -39)) {
                          stackOut_80_0 = 1;
                          stackIn_82_0 = stackOut_80_0;
                          kg.a(stackIn_82_0 != 0, (byte) 117);
                          break L35;
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        kg.a(false, (byte) 117);
                        return;
                      }
                    } else {
                      break L35;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L36: {
                  L37: {
                    if (0 >= id.field_D) {
                      break L37;
                    } else {
                      if (20 > wf.field_m % 40) {
                        stackOut_23_0 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  if (var3 != 0) {
                    if (wf.field_m % 40 < 20) {
                      stackOut_22_0 = 1;
                      stackIn_25_0 = stackOut_22_0;
                      break L36;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_25_0 = stackOut_21_0;
                      break L36;
                    }
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_25_0 = stackOut_19_0;
                    break L36;
                  }
                }
                L38: {
                  var4 = stackIn_25_0;
                  if (var4 != 0) {
                    stackOut_27_0 = rl.field_a;
                    stackIn_28_0 = stackOut_27_0;
                    break L38;
                  } else {
                    stackOut_26_0 = oi.field_h;
                    stackIn_28_0 = stackOut_26_0;
                    break L38;
                  }
                }
                L39: {
                  var14 = stackIn_28_0;
                  var5 = var14;
                  var6 = var14[0].field_x + nf.field_d + var14[2].field_x;
                  var7 = qp.field_w.field_C + var14[6].field_w + var14[0].field_w;
                  s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                  var27 = new int[4];
                  oo.a(var27);
                  oo.e(-5 + -nf.field_d + 640 + -var14[0].field_x, dq.field_k.field_qb - var7 + var14[0].field_w + -5, 635 - var14[2].field_x, dq.field_k.field_qb + -var14[6].field_w);
                  stackOut_28_0 = qp.field_w;
                  stackOut_28_1 = pb.field_i;
                  stackOut_28_2 = -var14[2].field_x + 635;
                  stackOut_28_3 = dq.field_k.field_qb - (var14[6].field_w - -5);
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  stackIn_30_3 = stackOut_28_3;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  stackIn_29_3 = stackOut_28_3;
                  if (var4 == 0) {
                    stackOut_30_0 = (ef) (Object) stackIn_30_0;
                    stackOut_30_1 = (String) (Object) stackIn_30_1;
                    stackOut_30_2 = stackIn_30_2;
                    stackOut_30_3 = stackIn_30_3;
                    stackOut_30_4 = 16777215;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    stackIn_31_4 = stackOut_30_4;
                    break L39;
                  } else {
                    stackOut_29_0 = (ef) (Object) stackIn_29_0;
                    stackOut_29_1 = (String) (Object) stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = stackIn_29_3;
                    stackOut_29_4 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    stackIn_31_3 = stackOut_29_3;
                    stackIn_31_4 = stackOut_29_4;
                    break L39;
                  }
                }
                L40: {
                  ((ef) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, -1);
                  oo.b(var27);
                  if (hh.field_b) {
                    if (sq.field_N) {
                      if (df.field_I) {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        break L40;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        break L40;
                      }
                    } else {
                      stackOut_34_0 = 0;
                      stackIn_38_0 = stackOut_34_0;
                      break L40;
                    }
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_38_0 = stackOut_32_0;
                    break L40;
                  }
                }
                L41: {
                  L42: {
                    var9 = stackIn_38_0;
                    if (!param0) {
                      break L42;
                    } else {
                      if (!vk.i((byte) -39)) {
                        break L42;
                      } else {
                        if (var9 != 0) {
                          break L42;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L41;
                        }
                      }
                    }
                  }
                  stackOut_42_0 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  break L41;
                }
                L43: {
                  dd.a(stackIn_43_0 != 0, 0);
                  if (!re.field_b) {
                    break L43;
                  } else {
                    if (var9 != 0) {
                      if (!param0) {
                        kg.a(false, (byte) 117);
                        break L43;
                      } else {
                        if (!vk.i((byte) -39)) {
                          kg.a(false, (byte) 117);
                          break L43;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_51_0 = stackOut_48_0;
                          kg.a(stackIn_51_0 != 0, (byte) 117);
                          break L43;
                        }
                      }
                    } else {
                      break L43;
                    }
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0) {
        if (param0 != -29394) {
            return -57;
        }
        return 0;
    }

    public static void a() {
        field_f = null;
        field_i = null;
        field_j = null;
        field_k = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!param1) {
            if (mh.field_c != null) {
              L1: {
                if (!param1) {
                  if (null != mh.field_c) {
                    if (mh.field_h <= 0) {
                      if (sq.field_Q <= 0) {
                        if (da.field_a < b.field_d) {
                          jq.a(false, (byte) -20);
                          da.field_a = da.field_a + 1;
                          var2 = -72;
                          return;
                        } else {
                          var2 = -72;
                          return;
                        }
                      } else {
                        sq.field_Q = sq.field_Q - 1;
                        var2 = -72;
                        return;
                      }
                    } else {
                      mh.field_h = mh.field_h - 1;
                      var2 = -72;
                      return;
                    }
                  } else {
                    if (ej.field_n == null) {
                      io.field_b = false;
                      if (sq.field_Q <= 0) {
                        if (da.field_a <= 0) {
                          if (mh.field_h < b.field_d) {
                            L2: {
                              if (0 != mh.field_h) {
                                break L2;
                              } else {
                                wf.a(6835);
                                break L2;
                              }
                            }
                            mh.field_h = mh.field_h + 1;
                            break L1;
                          } else {
                            var2 = -72;
                            return;
                          }
                        } else {
                          da.field_a = da.field_a - 1;
                          break L1;
                        }
                      } else {
                        sq.field_Q = sq.field_Q - 1;
                        var2 = -72;
                        return;
                      }
                    } else {
                      if (0 < mh.field_h) {
                        mh.field_h = mh.field_h - 1;
                        break L1;
                      } else {
                        if (da.field_a <= 0) {
                          if (sq.field_Q < b.field_d) {
                            if (0 == sq.field_Q) {
                              jq.a(true, (byte) 126);
                              sq.field_Q = sq.field_Q + 1;
                              break L1;
                            } else {
                              sq.field_Q = sq.field_Q + 1;
                              var2 = -72;
                              return;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          da.field_a = da.field_a - 1;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    break L1;
                  } else {
                    if (0 >= sq.field_Q) {
                      if (da.field_a > 0) {
                        da.field_a = da.field_a - 1;
                        break L1;
                      } else {
                        var2 = -72;
                        return;
                      }
                    } else {
                      sq.field_Q = sq.field_Q - 1;
                      break L1;
                    }
                  }
                }
              }
              var2 = -72;
              return;
            } else {
              io.field_b = false;
              break L0;
            }
          } else {
            io.field_b = false;
            break L0;
          }
        }
        if (!param1) {
          if (null != mh.field_c) {
            if (mh.field_h <= 0) {
              if (sq.field_Q <= 0) {
                if (da.field_a < b.field_d) {
                  jq.a(false, (byte) -20);
                  da.field_a = da.field_a + 1;
                  var2 = -72;
                  return;
                } else {
                  var2 = -72;
                  return;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
                var2 = -72;
                return;
              }
            } else {
              mh.field_h = mh.field_h - 1;
              var2 = -72;
              return;
            }
          } else {
            if (ej.field_n == null) {
              io.field_b = false;
              if (sq.field_Q <= 0) {
                if (da.field_a <= 0) {
                  if (mh.field_h < b.field_d) {
                    if (0 != mh.field_h) {
                      mh.field_h = mh.field_h + 1;
                      var2 = -72;
                      return;
                    } else {
                      wf.a(6835);
                      mh.field_h = mh.field_h + 1;
                      var2 = -72;
                      return;
                    }
                  } else {
                    var2 = -72;
                    return;
                  }
                } else {
                  da.field_a = da.field_a - 1;
                  var2 = -72;
                  return;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
                var2 = -72;
                return;
              }
            } else {
              if (0 >= mh.field_h) {
                if (da.field_a <= 0) {
                  if (sq.field_Q < b.field_d) {
                    if (0 == sq.field_Q) {
                      jq.a(true, (byte) 126);
                      sq.field_Q = sq.field_Q + 1;
                      var2 = -72;
                      return;
                    } else {
                      sq.field_Q = sq.field_Q + 1;
                      var2 = -72;
                      return;
                    }
                  } else {
                    var2 = -72;
                    return;
                  }
                } else {
                  da.field_a = da.field_a - 1;
                  var2 = -72;
                  return;
                }
              } else {
                mh.field_h = mh.field_h - 1;
                var2 = -72;
                return;
              }
            }
          }
        } else {
          if (mh.field_h <= 0) {
            L3: {
              if (0 >= sq.field_Q) {
                if (da.field_a > 0) {
                  da.field_a = da.field_a - 1;
                  break L3;
                } else {
                  var2 = -72;
                  return;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
                break L3;
              }
            }
            var2 = -72;
            return;
          } else {
            mh.field_h = mh.field_h - 1;
            var2 = -72;
            return;
          }
        }
    }

    ui(int param0, int param1, int param2) {
        ((ui) this).field_l = param0;
        ((ui) this).field_g = param1;
        ((ui) this).field_h = 24 * ((ui) this).field_l - (-12 + -this.a(-29394));
        ((ui) this).field_m = 12 + (24 * ((ui) this).field_g - -this.a(-29394));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
