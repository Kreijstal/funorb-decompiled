/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        jd discarded$0 = null;
        try {
            ac.b(param1.a("headers.packvorbis", "", false));
            if (param0 != 7478) {
                field_k = (ja[]) null;
            }
            var2 = ac.a(param1, "jagex logo2.packvorbis", "");
            discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ui.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int discarded$0 = 0;
        if (param0 != 9307) {
            discarded$0 = this.a(105);
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            ui.a(true, false);
            return 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
        }
        return 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -3 % ((-42 - param0) / 33);
        if (-31 >= (Math.abs(param1 + -this.field_h) ^ -1)) {
            return false;
        }
        if ((Math.abs(-this.field_m + param2) ^ -1) <= -31) {
            return false;
        }
        return true;
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
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        ja[] stackIn_24_0 = null;
        ef stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        ef stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        ef stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        ja[] stackIn_64_0 = null;
        ef stackIn_65_0 = null;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        ef stackIn_66_0 = null;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        ef stackIn_67_0 = null;
        String stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        ja[] stackIn_98_0 = null;
        ef stackIn_99_0 = null;
        String stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        ef stackIn_100_0 = null;
        String stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        ef stackIn_101_0 = null;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        int stackIn_106_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_119_0 = 0;
        ja[] stackIn_127_0 = null;
        ef stackIn_128_0 = null;
        String stackIn_128_1 = null;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        ef stackIn_129_0 = null;
        String stackIn_129_1 = null;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        ef stackIn_130_0 = null;
        String stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        int stackIn_130_4 = 0;
        int stackIn_135_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_154_0 = 0;
        ja[] stackIn_157_0 = null;
        ef stackIn_158_0 = null;
        String stackIn_158_1 = null;
        int stackIn_158_2 = 0;
        int stackIn_158_3 = 0;
        ef stackIn_159_0 = null;
        String stackIn_159_1 = null;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        ef stackIn_160_0 = null;
        String stackIn_160_1 = null;
        int stackIn_160_2 = 0;
        int stackIn_160_3 = 0;
        int stackIn_160_4 = 0;
        int stackIn_165_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_178_0 = 0;
        ja[] stackIn_184_0 = null;
        ef stackIn_185_0 = null;
        String stackIn_185_1 = null;
        int stackIn_185_2 = 0;
        int stackIn_185_3 = 0;
        ef stackIn_186_0 = null;
        String stackIn_186_1 = null;
        int stackIn_186_2 = 0;
        int stackIn_186_3 = 0;
        ef stackIn_187_0 = null;
        String stackIn_187_1 = null;
        int stackIn_187_2 = 0;
        int stackIn_187_3 = 0;
        int stackIn_187_4 = 0;
        int stackIn_192_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_205_0 = 0;
        ja[] stackIn_211_0 = null;
        ef stackIn_212_0 = null;
        String stackIn_212_1 = null;
        int stackIn_212_2 = 0;
        int stackIn_212_3 = 0;
        ef stackIn_213_0 = null;
        String stackIn_213_1 = null;
        int stackIn_213_2 = 0;
        int stackIn_213_3 = 0;
        ef stackIn_214_0 = null;
        String stackIn_214_1 = null;
        int stackIn_214_2 = 0;
        int stackIn_214_3 = 0;
        int stackIn_214_4 = 0;
        int stackIn_219_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_232_0 = 0;
        ja[] stackIn_237_0 = null;
        ef stackIn_238_0 = null;
        String stackIn_238_1 = null;
        int stackIn_238_2 = 0;
        int stackIn_238_3 = 0;
        ef stackIn_239_0 = null;
        String stackIn_239_1 = null;
        int stackIn_239_2 = 0;
        int stackIn_239_3 = 0;
        ef stackIn_240_0 = null;
        String stackIn_240_1 = null;
        int stackIn_240_2 = 0;
        int stackIn_240_3 = 0;
        int stackIn_240_4 = 0;
        int stackIn_245_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_258_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        ja[] stackOut_236_0 = null;
        ja[] stackOut_235_0 = null;
        ef stackOut_237_0 = null;
        String stackOut_237_1 = null;
        int stackOut_237_2 = 0;
        int stackOut_237_3 = 0;
        ef stackOut_239_0 = null;
        String stackOut_239_1 = null;
        int stackOut_239_2 = 0;
        int stackOut_239_3 = 0;
        int stackOut_239_4 = 0;
        ef stackOut_238_0 = null;
        String stackOut_238_1 = null;
        int stackOut_238_2 = 0;
        int stackOut_238_3 = 0;
        int stackOut_238_4 = 0;
        int stackOut_243_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_255_0 = 0;
        ja[] stackOut_210_0 = null;
        ja[] stackOut_209_0 = null;
        ef stackOut_211_0 = null;
        String stackOut_211_1 = null;
        int stackOut_211_2 = 0;
        int stackOut_211_3 = 0;
        ef stackOut_213_0 = null;
        String stackOut_213_1 = null;
        int stackOut_213_2 = 0;
        int stackOut_213_3 = 0;
        int stackOut_213_4 = 0;
        ef stackOut_212_0 = null;
        String stackOut_212_1 = null;
        int stackOut_212_2 = 0;
        int stackOut_212_3 = 0;
        int stackOut_212_4 = 0;
        int stackOut_217_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_229_0 = 0;
        ja[] stackOut_183_0 = null;
        ja[] stackOut_182_0 = null;
        ef stackOut_184_0 = null;
        String stackOut_184_1 = null;
        int stackOut_184_2 = 0;
        int stackOut_184_3 = 0;
        ef stackOut_186_0 = null;
        String stackOut_186_1 = null;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        int stackOut_186_4 = 0;
        ef stackOut_185_0 = null;
        String stackOut_185_1 = null;
        int stackOut_185_2 = 0;
        int stackOut_185_3 = 0;
        int stackOut_185_4 = 0;
        int stackOut_190_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_153_0 = 0;
        ja[] stackOut_156_0 = null;
        ja[] stackOut_155_0 = null;
        ef stackOut_157_0 = null;
        String stackOut_157_1 = null;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        ef stackOut_159_0 = null;
        String stackOut_159_1 = null;
        int stackOut_159_2 = 0;
        int stackOut_159_3 = 0;
        int stackOut_159_4 = 0;
        ef stackOut_158_0 = null;
        String stackOut_158_1 = null;
        int stackOut_158_2 = 0;
        int stackOut_158_3 = 0;
        int stackOut_158_4 = 0;
        int stackOut_163_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_175_0 = 0;
        ja[] stackOut_126_0 = null;
        ja[] stackOut_125_0 = null;
        ef stackOut_127_0 = null;
        String stackOut_127_1 = null;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        ef stackOut_129_0 = null;
        String stackOut_129_1 = null;
        int stackOut_129_2 = 0;
        int stackOut_129_3 = 0;
        int stackOut_129_4 = 0;
        ef stackOut_128_0 = null;
        String stackOut_128_1 = null;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_128_4 = 0;
        int stackOut_133_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        ja[] stackOut_97_0 = null;
        ja[] stackOut_96_0 = null;
        ef stackOut_98_0 = null;
        String stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        ef stackOut_100_0 = null;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        ef stackOut_99_0 = null;
        String stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        int stackOut_104_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_116_0 = 0;
        ja[] stackOut_63_0 = null;
        ja[] stackOut_62_0 = null;
        ef stackOut_64_0 = null;
        String stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        ef stackOut_66_0 = null;
        String stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        ef stackOut_65_0 = null;
        String stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        ja[] stackOut_23_0 = null;
        ja[] stackOut_22_0 = null;
        ef stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        ef stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        ef stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_42_0 = 0;
        if (!param1) {
          if (null != op.field_m) {
            if (1 < op.field_m.field_t) {
              L0: {
                if (pl.field_I != 10) {
                  stackOut_54_0 = 0;
                  stackIn_55_0 = stackOut_54_0;
                  break L0;
                } else {
                  stackOut_53_0 = 1;
                  stackIn_55_0 = stackOut_53_0;
                  break L0;
                }
              }
              L1: {
                L2: {
                  var2 = stackIn_55_0;
                  if (!iq.field_f) {
                    break L2;
                  } else {
                    if (var2 == 0) {
                      break L2;
                    } else {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L1;
                    }
                  }
                }
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L1;
              }
              var3 = stackIn_59_0;
              if (!tj.field_f) {
                if (0 >= id.field_D) {
                  if (var3 != 0) {
                    if (-21 < (wf.field_m % 40 ^ -1)) {
                      L3: {
                        var4 = 1;
                        if (var4 != 0) {
                          stackOut_236_0 = rl.field_a;
                          stackIn_237_0 = stackOut_236_0;
                          break L3;
                        } else {
                          stackOut_235_0 = oi.field_h;
                          stackIn_237_0 = stackOut_235_0;
                          break L3;
                        }
                      }
                      L4: {
                        var5 = stackIn_237_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var19 = new int[4];
                        var11 = var19;
                        oo.a(var19);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackOut_237_0 = qp.field_w;
                        stackOut_237_1 = pb.field_i;
                        stackOut_237_2 = -var5[2].field_x + 635;
                        stackOut_237_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                        stackIn_239_0 = stackOut_237_0;
                        stackIn_239_1 = stackOut_237_1;
                        stackIn_239_2 = stackOut_237_2;
                        stackIn_239_3 = stackOut_237_3;
                        stackIn_238_0 = stackOut_237_0;
                        stackIn_238_1 = stackOut_237_1;
                        stackIn_238_2 = stackOut_237_2;
                        stackIn_238_3 = stackOut_237_3;
                        if (var4 == 0) {
                          stackOut_239_0 = (ef) ((Object) stackIn_239_0);
                          stackOut_239_1 = (String) ((Object) stackIn_239_1);
                          stackOut_239_2 = stackIn_239_2;
                          stackOut_239_3 = stackIn_239_3;
                          stackOut_239_4 = 16777215;
                          stackIn_240_0 = stackOut_239_0;
                          stackIn_240_1 = stackOut_239_1;
                          stackIn_240_2 = stackOut_239_2;
                          stackIn_240_3 = stackOut_239_3;
                          stackIn_240_4 = stackOut_239_4;
                          break L4;
                        } else {
                          stackOut_238_0 = (ef) ((Object) stackIn_238_0);
                          stackOut_238_1 = (String) ((Object) stackIn_238_1);
                          stackOut_238_2 = stackIn_238_2;
                          stackOut_238_3 = stackIn_238_3;
                          stackOut_238_4 = 1;
                          stackIn_240_0 = stackOut_238_0;
                          stackIn_240_1 = stackOut_238_1;
                          stackIn_240_2 = stackOut_238_2;
                          stackIn_240_3 = stackOut_238_3;
                          stackIn_240_4 = stackOut_238_4;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          ((ef) (Object) stackIn_240_0).a(stackIn_240_1, stackIn_240_2, stackIn_240_3, stackIn_240_4, -1);
                          oo.b(var19);
                          if (!hh.field_b) {
                            break L6;
                          } else {
                            if (!sq.field_N) {
                              break L6;
                            } else {
                              if (df.field_I) {
                                break L6;
                              } else {
                                stackOut_243_0 = 1;
                                stackIn_245_0 = stackOut_243_0;
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_244_0 = 0;
                        stackIn_245_0 = stackOut_244_0;
                        break L5;
                      }
                      L7: {
                        L8: {
                          var9 = stackIn_245_0;
                          if (!param0) {
                            break L8;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L8;
                            } else {
                              if (var9 != 0) {
                                break L8;
                              } else {
                                stackOut_248_0 = 1;
                                stackIn_250_0 = stackOut_248_0;
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_249_0 = 0;
                        stackIn_250_0 = stackOut_249_0;
                        break L7;
                      }
                      L9: {
                        dd.a(stackIn_250_0 != 0, 0);
                        if (!re.field_b) {
                          break L9;
                        } else {
                          if (var9 != 0) {
                            if (!param0) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              if (!vk.i((byte) -39)) {
                                kg.a(false, (byte) 117);
                                return;
                              } else {
                                stackOut_255_0 = 1;
                                stackIn_258_0 = stackOut_255_0;
                                kg.a(stackIn_258_0 != 0, (byte) 117);
                                break L9;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L10: {
                        var4 = 0;
                        if (var4 != 0) {
                          stackOut_210_0 = rl.field_a;
                          stackIn_211_0 = stackOut_210_0;
                          break L10;
                        } else {
                          stackOut_209_0 = oi.field_h;
                          stackIn_211_0 = stackOut_209_0;
                          break L10;
                        }
                      }
                      L11: {
                        var5 = stackIn_211_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var26 = new int[4];
                        oo.a(var26);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackOut_211_0 = qp.field_w;
                        stackOut_211_1 = pb.field_i;
                        stackOut_211_2 = -var5[2].field_x + 635;
                        stackOut_211_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                        stackIn_213_0 = stackOut_211_0;
                        stackIn_213_1 = stackOut_211_1;
                        stackIn_213_2 = stackOut_211_2;
                        stackIn_213_3 = stackOut_211_3;
                        stackIn_212_0 = stackOut_211_0;
                        stackIn_212_1 = stackOut_211_1;
                        stackIn_212_2 = stackOut_211_2;
                        stackIn_212_3 = stackOut_211_3;
                        if (var4 == 0) {
                          stackOut_213_0 = (ef) ((Object) stackIn_213_0);
                          stackOut_213_1 = (String) ((Object) stackIn_213_1);
                          stackOut_213_2 = stackIn_213_2;
                          stackOut_213_3 = stackIn_213_3;
                          stackOut_213_4 = 16777215;
                          stackIn_214_0 = stackOut_213_0;
                          stackIn_214_1 = stackOut_213_1;
                          stackIn_214_2 = stackOut_213_2;
                          stackIn_214_3 = stackOut_213_3;
                          stackIn_214_4 = stackOut_213_4;
                          break L11;
                        } else {
                          stackOut_212_0 = (ef) ((Object) stackIn_212_0);
                          stackOut_212_1 = (String) ((Object) stackIn_212_1);
                          stackOut_212_2 = stackIn_212_2;
                          stackOut_212_3 = stackIn_212_3;
                          stackOut_212_4 = 1;
                          stackIn_214_0 = stackOut_212_0;
                          stackIn_214_1 = stackOut_212_1;
                          stackIn_214_2 = stackOut_212_2;
                          stackIn_214_3 = stackOut_212_3;
                          stackIn_214_4 = stackOut_212_4;
                          break L11;
                        }
                      }
                      L12: {
                        L13: {
                          ((ef) (Object) stackIn_214_0).a(stackIn_214_1, stackIn_214_2, stackIn_214_3, stackIn_214_4, -1);
                          oo.b(var26);
                          if (!hh.field_b) {
                            break L13;
                          } else {
                            if (!sq.field_N) {
                              break L13;
                            } else {
                              if (df.field_I) {
                                break L13;
                              } else {
                                stackOut_217_0 = 1;
                                stackIn_219_0 = stackOut_217_0;
                                break L12;
                              }
                            }
                          }
                        }
                        stackOut_218_0 = 0;
                        stackIn_219_0 = stackOut_218_0;
                        break L12;
                      }
                      L14: {
                        L15: {
                          var9 = stackIn_219_0;
                          if (!param0) {
                            break L15;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L15;
                            } else {
                              if (var9 != 0) {
                                break L15;
                              } else {
                                stackOut_222_0 = 1;
                                stackIn_224_0 = stackOut_222_0;
                                break L14;
                              }
                            }
                          }
                        }
                        stackOut_223_0 = 0;
                        stackIn_224_0 = stackOut_223_0;
                        break L14;
                      }
                      L16: {
                        dd.a(stackIn_224_0 != 0, 0);
                        if (!re.field_b) {
                          break L16;
                        } else {
                          if (var9 != 0) {
                            if (!param0) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              if (!vk.i((byte) -39)) {
                                kg.a(false, (byte) 117);
                                return;
                              } else {
                                stackOut_229_0 = 1;
                                stackIn_232_0 = stackOut_229_0;
                                kg.a(stackIn_232_0 != 0, (byte) 117);
                                break L16;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      var4 = 0;
                      if (var4 != 0) {
                        stackOut_183_0 = rl.field_a;
                        stackIn_184_0 = stackOut_183_0;
                        break L17;
                      } else {
                        stackOut_182_0 = oi.field_h;
                        stackIn_184_0 = stackOut_182_0;
                        break L17;
                      }
                    }
                    L18: {
                      var5 = stackIn_184_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var25 = new int[4];
                      oo.a(var25);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackOut_184_0 = qp.field_w;
                      stackOut_184_1 = pb.field_i;
                      stackOut_184_2 = -var5[2].field_x + 635;
                      stackOut_184_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                      stackIn_186_0 = stackOut_184_0;
                      stackIn_186_1 = stackOut_184_1;
                      stackIn_186_2 = stackOut_184_2;
                      stackIn_186_3 = stackOut_184_3;
                      stackIn_185_0 = stackOut_184_0;
                      stackIn_185_1 = stackOut_184_1;
                      stackIn_185_2 = stackOut_184_2;
                      stackIn_185_3 = stackOut_184_3;
                      if (var4 == 0) {
                        stackOut_186_0 = (ef) ((Object) stackIn_186_0);
                        stackOut_186_1 = (String) ((Object) stackIn_186_1);
                        stackOut_186_2 = stackIn_186_2;
                        stackOut_186_3 = stackIn_186_3;
                        stackOut_186_4 = 16777215;
                        stackIn_187_0 = stackOut_186_0;
                        stackIn_187_1 = stackOut_186_1;
                        stackIn_187_2 = stackOut_186_2;
                        stackIn_187_3 = stackOut_186_3;
                        stackIn_187_4 = stackOut_186_4;
                        break L18;
                      } else {
                        stackOut_185_0 = (ef) ((Object) stackIn_185_0);
                        stackOut_185_1 = (String) ((Object) stackIn_185_1);
                        stackOut_185_2 = stackIn_185_2;
                        stackOut_185_3 = stackIn_185_3;
                        stackOut_185_4 = 1;
                        stackIn_187_0 = stackOut_185_0;
                        stackIn_187_1 = stackOut_185_1;
                        stackIn_187_2 = stackOut_185_2;
                        stackIn_187_3 = stackOut_185_3;
                        stackIn_187_4 = stackOut_185_4;
                        break L18;
                      }
                    }
                    L19: {
                      L20: {
                        ((ef) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_187_2, stackIn_187_3, stackIn_187_4, -1);
                        oo.b(var25);
                        if (!hh.field_b) {
                          break L20;
                        } else {
                          if (!sq.field_N) {
                            break L20;
                          } else {
                            if (df.field_I) {
                              break L20;
                            } else {
                              stackOut_190_0 = 1;
                              stackIn_192_0 = stackOut_190_0;
                              break L19;
                            }
                          }
                        }
                      }
                      stackOut_191_0 = 0;
                      stackIn_192_0 = stackOut_191_0;
                      break L19;
                    }
                    L21: {
                      L22: {
                        var9 = stackIn_192_0;
                        if (!param0) {
                          break L22;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L22;
                          } else {
                            if (var9 != 0) {
                              break L22;
                            } else {
                              stackOut_195_0 = 1;
                              stackIn_197_0 = stackOut_195_0;
                              break L21;
                            }
                          }
                        }
                      }
                      stackOut_196_0 = 0;
                      stackIn_197_0 = stackOut_196_0;
                      break L21;
                    }
                    L23: {
                      dd.a(stackIn_197_0 != 0, 0);
                      if (!re.field_b) {
                        break L23;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackOut_202_0 = 1;
                              stackIn_205_0 = stackOut_202_0;
                              kg.a(stackIn_205_0 != 0, (byte) 117);
                              break L23;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (20 <= wf.field_m % 40) {
                    L24: {
                      L25: {
                        if (var3 == 0) {
                          break L25;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L25;
                          } else {
                            stackOut_152_0 = 1;
                            stackIn_154_0 = stackOut_152_0;
                            break L24;
                          }
                        }
                      }
                      stackOut_153_0 = 0;
                      stackIn_154_0 = stackOut_153_0;
                      break L24;
                    }
                    L26: {
                      var4 = stackIn_154_0;
                      if (var4 != 0) {
                        stackOut_156_0 = rl.field_a;
                        stackIn_157_0 = stackOut_156_0;
                        break L26;
                      } else {
                        stackOut_155_0 = oi.field_h;
                        stackIn_157_0 = stackOut_155_0;
                        break L26;
                      }
                    }
                    L27: {
                      var5 = stackIn_157_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var24 = new int[4];
                      oo.a(var24);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackOut_157_0 = qp.field_w;
                      stackOut_157_1 = pb.field_i;
                      stackOut_157_2 = -var5[2].field_x + 635;
                      stackOut_157_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      stackIn_159_2 = stackOut_157_2;
                      stackIn_159_3 = stackOut_157_3;
                      stackIn_158_0 = stackOut_157_0;
                      stackIn_158_1 = stackOut_157_1;
                      stackIn_158_2 = stackOut_157_2;
                      stackIn_158_3 = stackOut_157_3;
                      if (var4 == 0) {
                        stackOut_159_0 = (ef) ((Object) stackIn_159_0);
                        stackOut_159_1 = (String) ((Object) stackIn_159_1);
                        stackOut_159_2 = stackIn_159_2;
                        stackOut_159_3 = stackIn_159_3;
                        stackOut_159_4 = 16777215;
                        stackIn_160_0 = stackOut_159_0;
                        stackIn_160_1 = stackOut_159_1;
                        stackIn_160_2 = stackOut_159_2;
                        stackIn_160_3 = stackOut_159_3;
                        stackIn_160_4 = stackOut_159_4;
                        break L27;
                      } else {
                        stackOut_158_0 = (ef) ((Object) stackIn_158_0);
                        stackOut_158_1 = (String) ((Object) stackIn_158_1);
                        stackOut_158_2 = stackIn_158_2;
                        stackOut_158_3 = stackIn_158_3;
                        stackOut_158_4 = 1;
                        stackIn_160_0 = stackOut_158_0;
                        stackIn_160_1 = stackOut_158_1;
                        stackIn_160_2 = stackOut_158_2;
                        stackIn_160_3 = stackOut_158_3;
                        stackIn_160_4 = stackOut_158_4;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        ((ef) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4, -1);
                        oo.b(var24);
                        if (!hh.field_b) {
                          break L29;
                        } else {
                          if (!sq.field_N) {
                            break L29;
                          } else {
                            if (df.field_I) {
                              break L29;
                            } else {
                              stackOut_163_0 = 1;
                              stackIn_165_0 = stackOut_163_0;
                              break L28;
                            }
                          }
                        }
                      }
                      stackOut_164_0 = 0;
                      stackIn_165_0 = stackOut_164_0;
                      break L28;
                    }
                    L30: {
                      L31: {
                        var9 = stackIn_165_0;
                        if (!param0) {
                          break L31;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L31;
                          } else {
                            if (var9 != 0) {
                              break L31;
                            } else {
                              stackOut_168_0 = 1;
                              stackIn_170_0 = stackOut_168_0;
                              break L30;
                            }
                          }
                        }
                      }
                      stackOut_169_0 = 0;
                      stackIn_170_0 = stackOut_169_0;
                      break L30;
                    }
                    L32: {
                      dd.a(stackIn_170_0 != 0, 0);
                      if (!re.field_b) {
                        break L32;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackOut_175_0 = 1;
                              stackIn_178_0 = stackOut_175_0;
                              kg.a(stackIn_178_0 != 0, (byte) 117);
                              break L32;
                            }
                          }
                        } else {
                          break L32;
                        }
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var4 = 1;
                      if (var4 != 0) {
                        stackOut_126_0 = rl.field_a;
                        stackIn_127_0 = stackOut_126_0;
                        break L33;
                      } else {
                        stackOut_125_0 = oi.field_h;
                        stackIn_127_0 = stackOut_125_0;
                        break L33;
                      }
                    }
                    L34: {
                      var5 = stackIn_127_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var23 = new int[4];
                      oo.a(var23);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackOut_127_0 = qp.field_w;
                      stackOut_127_1 = pb.field_i;
                      stackOut_127_2 = -var5[2].field_x + 635;
                      stackOut_127_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                      stackIn_129_0 = stackOut_127_0;
                      stackIn_129_1 = stackOut_127_1;
                      stackIn_129_2 = stackOut_127_2;
                      stackIn_129_3 = stackOut_127_3;
                      stackIn_128_0 = stackOut_127_0;
                      stackIn_128_1 = stackOut_127_1;
                      stackIn_128_2 = stackOut_127_2;
                      stackIn_128_3 = stackOut_127_3;
                      if (var4 == 0) {
                        stackOut_129_0 = (ef) ((Object) stackIn_129_0);
                        stackOut_129_1 = (String) ((Object) stackIn_129_1);
                        stackOut_129_2 = stackIn_129_2;
                        stackOut_129_3 = stackIn_129_3;
                        stackOut_129_4 = 16777215;
                        stackIn_130_0 = stackOut_129_0;
                        stackIn_130_1 = stackOut_129_1;
                        stackIn_130_2 = stackOut_129_2;
                        stackIn_130_3 = stackOut_129_3;
                        stackIn_130_4 = stackOut_129_4;
                        break L34;
                      } else {
                        stackOut_128_0 = (ef) ((Object) stackIn_128_0);
                        stackOut_128_1 = (String) ((Object) stackIn_128_1);
                        stackOut_128_2 = stackIn_128_2;
                        stackOut_128_3 = stackIn_128_3;
                        stackOut_128_4 = 1;
                        stackIn_130_0 = stackOut_128_0;
                        stackIn_130_1 = stackOut_128_1;
                        stackIn_130_2 = stackOut_128_2;
                        stackIn_130_3 = stackOut_128_3;
                        stackIn_130_4 = stackOut_128_4;
                        break L34;
                      }
                    }
                    L35: {
                      L36: {
                        ((ef) (Object) stackIn_130_0).a(stackIn_130_1, stackIn_130_2, stackIn_130_3, stackIn_130_4, -1);
                        oo.b(var23);
                        if (!hh.field_b) {
                          break L36;
                        } else {
                          if (!sq.field_N) {
                            break L36;
                          } else {
                            if (df.field_I) {
                              break L36;
                            } else {
                              stackOut_133_0 = 1;
                              stackIn_135_0 = stackOut_133_0;
                              break L35;
                            }
                          }
                        }
                      }
                      stackOut_134_0 = 0;
                      stackIn_135_0 = stackOut_134_0;
                      break L35;
                    }
                    L37: {
                      L38: {
                        var9 = stackIn_135_0;
                        if (!param0) {
                          break L38;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L38;
                          } else {
                            if (var9 != 0) {
                              break L38;
                            } else {
                              stackOut_138_0 = 1;
                              stackIn_140_0 = stackOut_138_0;
                              break L37;
                            }
                          }
                        }
                      }
                      stackOut_139_0 = 0;
                      stackIn_140_0 = stackOut_139_0;
                      break L37;
                    }
                    L39: {
                      dd.a(stackIn_140_0 != 0, 0);
                      if (!re.field_b) {
                        break L39;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackOut_145_0 = 1;
                              stackIn_148_0 = stackOut_145_0;
                              kg.a(stackIn_148_0 != 0, (byte) 117);
                              break L39;
                            }
                          }
                        } else {
                          break L39;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                if (!param0) {
                  L40: {
                    L41: {
                      L42: {
                        if (0 >= id.field_D) {
                          break L42;
                        } else {
                          if (20 > wf.field_m % 40) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        if (var3 == 0) {
                          break L43;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L43;
                          } else {
                            break L41;
                          }
                        }
                      }
                      stackOut_94_0 = 0;
                      stackIn_95_0 = stackOut_94_0;
                      break L40;
                    }
                    stackOut_93_0 = 1;
                    stackIn_95_0 = stackOut_93_0;
                    break L40;
                  }
                  L44: {
                    var4 = stackIn_95_0;
                    if (var4 != 0) {
                      stackOut_97_0 = rl.field_a;
                      stackIn_98_0 = stackOut_97_0;
                      break L44;
                    } else {
                      stackOut_96_0 = oi.field_h;
                      stackIn_98_0 = stackOut_96_0;
                      break L44;
                    }
                  }
                  L45: {
                    var5 = stackIn_98_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var22 = new int[4];
                    oo.a(var22);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackOut_98_0 = qp.field_w;
                    stackOut_98_1 = pb.field_i;
                    stackOut_98_2 = -var5[2].field_x + 635;
                    stackOut_98_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_100_1 = stackOut_98_1;
                    stackIn_100_2 = stackOut_98_2;
                    stackIn_100_3 = stackOut_98_3;
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    stackIn_99_2 = stackOut_98_2;
                    stackIn_99_3 = stackOut_98_3;
                    if (var4 == 0) {
                      stackOut_100_0 = (ef) ((Object) stackIn_100_0);
                      stackOut_100_1 = (String) ((Object) stackIn_100_1);
                      stackOut_100_2 = stackIn_100_2;
                      stackOut_100_3 = stackIn_100_3;
                      stackOut_100_4 = 16777215;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      stackIn_101_2 = stackOut_100_2;
                      stackIn_101_3 = stackOut_100_3;
                      stackIn_101_4 = stackOut_100_4;
                      break L45;
                    } else {
                      stackOut_99_0 = (ef) ((Object) stackIn_99_0);
                      stackOut_99_1 = (String) ((Object) stackIn_99_1);
                      stackOut_99_2 = stackIn_99_2;
                      stackOut_99_3 = stackIn_99_3;
                      stackOut_99_4 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      stackIn_101_2 = stackOut_99_2;
                      stackIn_101_3 = stackOut_99_3;
                      stackIn_101_4 = stackOut_99_4;
                      break L45;
                    }
                  }
                  L46: {
                    L47: {
                      ((ef) (Object) stackIn_101_0).a(stackIn_101_1, stackIn_101_2, stackIn_101_3, stackIn_101_4, -1);
                      oo.b(var22);
                      if (!hh.field_b) {
                        break L47;
                      } else {
                        if (!sq.field_N) {
                          break L47;
                        } else {
                          if (df.field_I) {
                            break L47;
                          } else {
                            stackOut_104_0 = 1;
                            stackIn_106_0 = stackOut_104_0;
                            break L46;
                          }
                        }
                      }
                    }
                    stackOut_105_0 = 0;
                    stackIn_106_0 = stackOut_105_0;
                    break L46;
                  }
                  L48: {
                    L49: {
                      var9 = stackIn_106_0;
                      if (!param0) {
                        break L49;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L49;
                        } else {
                          if (var9 != 0) {
                            break L49;
                          } else {
                            stackOut_109_0 = 1;
                            stackIn_111_0 = stackOut_109_0;
                            break L48;
                          }
                        }
                      }
                    }
                    stackOut_110_0 = 0;
                    stackIn_111_0 = stackOut_110_0;
                    break L48;
                  }
                  L50: {
                    L51: {
                      dd.a(stackIn_111_0 != 0, 0);
                      if (!re.field_b) {
                        break L51;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            break L50;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              break L50;
                            } else {
                              stackOut_116_0 = 1;
                              stackIn_119_0 = stackOut_116_0;
                              kg.a(stackIn_119_0 != 0, (byte) 117);
                              break L51;
                            }
                          }
                        } else {
                          break L50;
                        }
                      }
                    }
                    break L50;
                  }
                  return;
                } else {
                  L52: {
                    var4 = 1;
                    if (var4 != 0) {
                      stackOut_63_0 = rl.field_a;
                      stackIn_64_0 = stackOut_63_0;
                      break L52;
                    } else {
                      stackOut_62_0 = oi.field_h;
                      stackIn_64_0 = stackOut_62_0;
                      break L52;
                    }
                  }
                  L53: {
                    var5 = stackIn_64_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var21 = new int[4];
                    oo.a(var21);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackOut_64_0 = qp.field_w;
                    stackOut_64_1 = pb.field_i;
                    stackOut_64_2 = -var5[2].field_x + 635;
                    stackOut_64_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_66_2 = stackOut_64_2;
                    stackIn_66_3 = stackOut_64_3;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    stackIn_65_2 = stackOut_64_2;
                    stackIn_65_3 = stackOut_64_3;
                    if (var4 == 0) {
                      stackOut_66_0 = (ef) ((Object) stackIn_66_0);
                      stackOut_66_1 = (String) ((Object) stackIn_66_1);
                      stackOut_66_2 = stackIn_66_2;
                      stackOut_66_3 = stackIn_66_3;
                      stackOut_66_4 = 16777215;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      stackIn_67_2 = stackOut_66_2;
                      stackIn_67_3 = stackOut_66_3;
                      stackIn_67_4 = stackOut_66_4;
                      break L53;
                    } else {
                      stackOut_65_0 = (ef) ((Object) stackIn_65_0);
                      stackOut_65_1 = (String) ((Object) stackIn_65_1);
                      stackOut_65_2 = stackIn_65_2;
                      stackOut_65_3 = stackIn_65_3;
                      stackOut_65_4 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_67_2 = stackOut_65_2;
                      stackIn_67_3 = stackOut_65_3;
                      stackIn_67_4 = stackOut_65_4;
                      break L53;
                    }
                  }
                  L54: {
                    L55: {
                      ((ef) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4, -1);
                      oo.b(var21);
                      if (!hh.field_b) {
                        break L55;
                      } else {
                        if (!sq.field_N) {
                          break L55;
                        } else {
                          if (df.field_I) {
                            break L55;
                          } else {
                            stackOut_70_0 = 1;
                            stackIn_72_0 = stackOut_70_0;
                            break L54;
                          }
                        }
                      }
                    }
                    stackOut_71_0 = 0;
                    stackIn_72_0 = stackOut_71_0;
                    break L54;
                  }
                  L56: {
                    L57: {
                      var9 = stackIn_72_0;
                      if (!param0) {
                        break L57;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L57;
                        } else {
                          if (var9 != 0) {
                            break L57;
                          } else {
                            stackOut_75_0 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            break L56;
                          }
                        }
                      }
                    }
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    break L56;
                  }
                  L58: {
                    dd.a(stackIn_77_0 != 0, 0);
                    if (!re.field_b) {
                      break L58;
                    } else {
                      if (var9 != 0) {
                        if (!param0) {
                          kg.a(false, (byte) 117);
                          return;
                        } else {
                          if (!vk.i((byte) -39)) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            stackOut_82_0 = 1;
                            stackIn_85_0 = stackOut_82_0;
                            kg.a(stackIn_85_0 != 0, (byte) 117);
                            break L58;
                          }
                        }
                      } else {
                        break L58;
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
        } else {
          L59: {
            L60: {
              field_k = (ja[]) null;
              if (null == op.field_m) {
                break L60;
              } else {
                if (1 >= op.field_m.field_t) {
                  break L60;
                } else {
                  L61: {
                    if (pl.field_I != 10) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L61;
                    } else {
                      stackOut_4_0 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      break L61;
                    }
                  }
                  L62: {
                    L63: {
                      var2 = stackIn_6_0;
                      if (!iq.field_f) {
                        break L63;
                      } else {
                        if (var2 == 0) {
                          break L63;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          break L62;
                        }
                      }
                    }
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L62;
                  }
                  L64: {
                    L65: {
                      L66: {
                        var3 = stackIn_10_0;
                        if (!tj.field_f) {
                          break L66;
                        } else {
                          if (param0) {
                            break L65;
                          } else {
                            break L66;
                          }
                        }
                      }
                      L67: {
                        if (0 >= id.field_D) {
                          break L67;
                        } else {
                          if (20 > wf.field_m % 40) {
                            break L65;
                          } else {
                            break L67;
                          }
                        }
                      }
                      L68: {
                        if (var3 == 0) {
                          break L68;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L68;
                          } else {
                            break L65;
                          }
                        }
                      }
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L64;
                    }
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L64;
                  }
                  L69: {
                    var4 = stackIn_21_0;
                    if (var4 != 0) {
                      stackOut_23_0 = rl.field_a;
                      stackIn_24_0 = stackOut_23_0;
                      break L69;
                    } else {
                      stackOut_22_0 = oi.field_h;
                      stackIn_24_0 = stackOut_22_0;
                      break L69;
                    }
                  }
                  L70: {
                    var5 = stackIn_24_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var20 = new int[4];
                    oo.a(var20);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackOut_24_0 = qp.field_w;
                    stackOut_24_1 = pb.field_i;
                    stackOut_24_2 = -var5[2].field_x + 635;
                    stackOut_24_3 = dq.field_k.field_qb - (var5[6].field_w - -5);
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    if (var4 == 0) {
                      stackOut_26_0 = (ef) ((Object) stackIn_26_0);
                      stackOut_26_1 = (String) ((Object) stackIn_26_1);
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3;
                      stackOut_26_4 = 16777215;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      stackIn_27_4 = stackOut_26_4;
                      break L70;
                    } else {
                      stackOut_25_0 = (ef) ((Object) stackIn_25_0);
                      stackOut_25_1 = (String) ((Object) stackIn_25_1);
                      stackOut_25_2 = stackIn_25_2;
                      stackOut_25_3 = stackIn_25_3;
                      stackOut_25_4 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      stackIn_27_3 = stackOut_25_3;
                      stackIn_27_4 = stackOut_25_4;
                      break L70;
                    }
                  }
                  L71: {
                    L72: {
                      ((ef) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, -1);
                      oo.b(var20);
                      if (!hh.field_b) {
                        break L72;
                      } else {
                        if (!sq.field_N) {
                          break L72;
                        } else {
                          if (df.field_I) {
                            break L72;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L71;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L71;
                  }
                  L73: {
                    L74: {
                      var9 = stackIn_32_0;
                      if (!param0) {
                        break L74;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L74;
                        } else {
                          if (var9 != 0) {
                            break L74;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            break L73;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L73;
                  }
                  dd.a(stackIn_37_0 != 0, 0);
                  if (!re.field_b) {
                    break L60;
                  } else {
                    if (var9 != 0) {
                      if (!param0) {
                        kg.a(false, (byte) 117);
                        break L59;
                      } else {
                        if (!vk.i((byte) -39)) {
                          kg.a(false, (byte) 117);
                          break L59;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_45_0 = stackOut_42_0;
                          kg.a(stackIn_45_0 != 0, (byte) 117);
                          break L60;
                        }
                      }
                    } else {
                      break L59;
                    }
                  }
                }
              }
            }
            break L59;
          }
          return;
        }
    }

    private final int a(int param0) {
        if (param0 != -29394) {
            return -57;
        }
        return 0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        field_k = null;
        if (param0 > -41) {
            field_j = (String) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1) {
            io.field_b = false;
            break L0;
          } else {
            if (mh.field_c == null) {
              io.field_b = false;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 > (mh.field_h ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (0 >= sq.field_Q) {
                            break L4;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (da.field_a <= 0) {
                          break L1;
                        } else {
                          da.field_a = da.field_a - 1;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    mh.field_h = mh.field_h - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (null != mh.field_c) {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  } else {
                    L5: {
                      if (-1 > (sq.field_Q ^ -1)) {
                        break L5;
                      } else {
                        if (da.field_a < b.field_d) {
                          if ((da.field_a ^ -1) != -1) {
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          } else {
                            L6: {
                              jq.a(false, (byte) -20);
                              da.field_a = da.field_a + 1;
                              if (var3 == 0) {
                                break L6;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L6;
                                } else {
                                  mh.field_h = mh.field_h - 1;
                                  break L6;
                                }
                              }
                            }
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        } else {
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                    sq.field_Q = sq.field_Q - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      mh.field_h = mh.field_h - 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                } else {
                  L7: {
                    if (ej.field_n == null) {
                      break L7;
                    } else {
                      L8: {
                        if (0 < mh.field_h) {
                          break L8;
                        } else {
                          L9: {
                            if ((da.field_a ^ -1) >= -1) {
                              break L9;
                            } else {
                              da.field_a = da.field_a - 1;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                            L10: {
                              if (0 != sq.field_Q) {
                                break L10;
                              } else {
                                jq.a(true, (byte) 126);
                                break L10;
                              }
                            }
                            sq.field_Q = sq.field_Q + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      mh.field_h = mh.field_h - 1;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L11: {
                    io.field_b = false;
                    if (-1 > (sq.field_Q ^ -1)) {
                      break L11;
                    } else {
                      if ((da.field_a ^ -1) >= -1) {
                        if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                          break L1;
                        } else {
                          if (0 != mh.field_h) {
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L11;
                            }
                          } else {
                            L12: {
                              wf.a(6835);
                              mh.field_h = mh.field_h + 1;
                              if (var3 == 0) {
                                break L12;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (mh.field_h > 0) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (-1 > (sq.field_Q ^ -1)) {
                                          break L14;
                                        } else {
                                          if (da.field_a < b.field_d) {
                                            L15: {
                                              if ((da.field_a ^ -1) != -1) {
                                                break L15;
                                              } else {
                                                jq.a(false, (byte) -20);
                                                break L15;
                                              }
                                            }
                                            da.field_a = da.field_a + 1;
                                            if (var3 == 0) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            var2 = -72 / ((-39 - param0) / 44);
                                            return;
                                          }
                                        }
                                      }
                                      sq.field_Q = sq.field_Q - 1;
                                      if (var3 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  mh.field_h = mh.field_h - 1;
                                  break L12;
                                }
                              }
                            }
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      } else {
                        da.field_a = da.field_a - 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          L16: {
                            if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                              break L16;
                            } else {
                              L17: {
                                if (0 != mh.field_h) {
                                  break L17;
                                } else {
                                  wf.a(6835);
                                  break L17;
                                }
                              }
                              mh.field_h = mh.field_h + 1;
                              if (var3 == 0) {
                                break L16;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L16;
                                } else {
                                  L18: {
                                    if (mh.field_h > 0) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (-1 > (sq.field_Q ^ -1)) {
                                          break L19;
                                        } else {
                                          if (da.field_a < b.field_d) {
                                            L20: {
                                              if ((da.field_a ^ -1) != -1) {
                                                break L20;
                                              } else {
                                                jq.a(false, (byte) -20);
                                                break L20;
                                              }
                                            }
                                            da.field_a = da.field_a + 1;
                                            if (var3 == 0) {
                                              break L16;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            var2 = -72 / ((-39 - param0) / 44);
                                            return;
                                          }
                                        }
                                      }
                                      sq.field_Q = sq.field_Q - 1;
                                      if (var3 == 0) {
                                        break L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  mh.field_h = mh.field_h - 1;
                                  break L16;
                                }
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                  }
                  sq.field_Q = sq.field_Q - 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    L21: {
                      L22: {
                        if (mh.field_h > 0) {
                          break L22;
                        } else {
                          L23: {
                            if (-1 > (sq.field_Q ^ -1)) {
                              break L23;
                            } else {
                              if (da.field_a < b.field_d) {
                                L24: {
                                  if ((da.field_a ^ -1) != -1) {
                                    break L24;
                                  } else {
                                    jq.a(false, (byte) -20);
                                    break L24;
                                  }
                                }
                                da.field_a = da.field_a + 1;
                                if (var3 == 0) {
                                  break L21;
                                } else {
                                  break L23;
                                }
                              } else {
                                var2 = -72 / ((-39 - param0) / 44);
                                return;
                              }
                            }
                          }
                          sq.field_Q = sq.field_Q - 1;
                          if (var3 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      mh.field_h = mh.field_h - 1;
                      break L21;
                    }
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              }
              var2 = -72 / ((-39 - param0) / 44);
              return;
            }
          }
        }
        if (param1) {
          L25: {
            L26: {
              if (-1 > (mh.field_h ^ -1)) {
                break L26;
              } else {
                L27: {
                  if (0 >= sq.field_Q) {
                    break L27;
                  } else {
                    sq.field_Q = sq.field_Q - 1;
                    if (var3 != 0) {
                      break L27;
                    } else {
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
                if (da.field_a > 0) {
                  da.field_a = da.field_a - 1;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    break L26;
                  }
                } else {
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              }
            }
            mh.field_h = mh.field_h - 1;
            if (var3 == 0) {
              break L25;
            } else {
              if (null != mh.field_c) {
                if (mh.field_h > 0) {
                  mh.field_h = mh.field_h - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                } else {
                  L28: {
                    if (-1 > (sq.field_Q ^ -1)) {
                      break L28;
                    } else {
                      if (da.field_a < b.field_d) {
                        if ((da.field_a ^ -1) != -1) {
                          da.field_a = da.field_a + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L28;
                          }
                        } else {
                          L29: {
                            jq.a(false, (byte) -20);
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L29;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L29;
                              } else {
                                mh.field_h = mh.field_h - 1;
                                var2 = -72 / ((-39 - param0) / 44);
                                return;
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      } else {
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  }
                  sq.field_Q = sq.field_Q - 1;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              } else {
                L30: {
                  if (ej.field_n == null) {
                    break L30;
                  } else {
                    L31: {
                      if (0 < mh.field_h) {
                        break L31;
                      } else {
                        L32: {
                          if ((da.field_a ^ -1) >= -1) {
                            break L32;
                          } else {
                            da.field_a = da.field_a - 1;
                            if (var3 == 0) {
                              break L25;
                            } else {
                              break L32;
                            }
                          }
                        }
                        if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                          L33: {
                            if (0 != sq.field_Q) {
                              break L33;
                            } else {
                              jq.a(true, (byte) 126);
                              break L33;
                            }
                          }
                          sq.field_Q = sq.field_Q + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L31;
                          }
                        } else {
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                    mh.field_h = mh.field_h - 1;
                    if (var3 == 0) {
                      break L25;
                    } else {
                      break L30;
                    }
                  }
                }
                L34: {
                  io.field_b = false;
                  if (-1 > (sq.field_Q ^ -1)) {
                    break L34;
                  } else {
                    if ((da.field_a ^ -1) >= -1) {
                      if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                        break L25;
                      } else {
                        if (0 != mh.field_h) {
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L34;
                          }
                        } else {
                          L35: {
                            wf.a(6835);
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L35;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L35;
                              } else {
                                if (mh.field_h > 0) {
                                  mh.field_h = mh.field_h - 1;
                                  var2 = -72 / ((-39 - param0) / 44);
                                  return;
                                } else {
                                  L36: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L36;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L37: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L37;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L37;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L35;
                                  } else {
                                    mh.field_h = mh.field_h - 1;
                                    var2 = -72 / ((-39 - param0) / 44);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    } else {
                      da.field_a = da.field_a - 1;
                      if (var3 == 0) {
                        break L25;
                      } else {
                        L38: {
                          if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                            break L38;
                          } else {
                            L39: {
                              if (0 != mh.field_h) {
                                break L39;
                              } else {
                                wf.a(6835);
                                break L39;
                              }
                            }
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L38;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L38;
                              } else {
                                L40: {
                                  if (mh.field_h > 0) {
                                    break L40;
                                  } else {
                                    L41: {
                                      if (-1 > (sq.field_Q ^ -1)) {
                                        break L41;
                                      } else {
                                        if (da.field_a < b.field_d) {
                                          L42: {
                                            if ((da.field_a ^ -1) != -1) {
                                              break L42;
                                            } else {
                                              jq.a(false, (byte) -20);
                                              break L42;
                                            }
                                          }
                                          da.field_a = da.field_a + 1;
                                          if (var3 == 0) {
                                            break L38;
                                          } else {
                                            break L41;
                                          }
                                        } else {
                                          var2 = -72 / ((-39 - param0) / 44);
                                          return;
                                        }
                                      }
                                    }
                                    sq.field_Q = sq.field_Q - 1;
                                    if (var3 == 0) {
                                      break L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                mh.field_h = mh.field_h - 1;
                                break L38;
                              }
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  }
                }
                sq.field_Q = sq.field_Q - 1;
                if (var3 == 0) {
                  break L25;
                } else {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  } else {
                    L43: {
                      L44: {
                        if (-1 > (sq.field_Q ^ -1)) {
                          break L44;
                        } else {
                          if (da.field_a < b.field_d) {
                            if ((da.field_a ^ -1) != -1) {
                              da.field_a = da.field_a + 1;
                              if (var3 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            } else {
                              L45: {
                                jq.a(false, (byte) -20);
                                da.field_a = da.field_a + 1;
                                if (var3 == 0) {
                                  break L45;
                                } else {
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L45;
                                  } else {
                                    mh.field_h = mh.field_h - 1;
                                    var2 = -72 / ((-39 - param0) / 44);
                                    return;
                                  }
                                }
                              }
                              var2 = -72 / ((-39 - param0) / 44);
                              return;
                            }
                          } else {
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      }
                      sq.field_Q = sq.field_Q - 1;
                      if (var3 == 0) {
                        break L43;
                      } else {
                        mh.field_h = mh.field_h - 1;
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              }
            }
          }
          var2 = -72 / ((-39 - param0) / 44);
          return;
        } else {
          L46: {
            if (null != mh.field_c) {
              if (mh.field_h > 0) {
                mh.field_h = mh.field_h - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              } else {
                L47: {
                  if (-1 > (sq.field_Q ^ -1)) {
                    break L47;
                  } else {
                    if (da.field_a < b.field_d) {
                      if ((da.field_a ^ -1) != -1) {
                        da.field_a = da.field_a + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L47;
                        }
                      } else {
                        L48: {
                          jq.a(false, (byte) -20);
                          da.field_a = da.field_a + 1;
                          if (var3 == 0) {
                            break L48;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L48;
                            } else {
                              mh.field_h = mh.field_h - 1;
                              break L48;
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    } else {
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
                sq.field_Q = sq.field_Q - 1;
                if (var3 == 0) {
                  break L46;
                } else {
                  mh.field_h = mh.field_h - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              }
            } else {
              L49: {
                if (ej.field_n == null) {
                  break L49;
                } else {
                  L50: {
                    if (0 < mh.field_h) {
                      break L50;
                    } else {
                      L51: {
                        if ((da.field_a ^ -1) >= -1) {
                          break L51;
                        } else {
                          da.field_a = da.field_a - 1;
                          if (var3 == 0) {
                            break L46;
                          } else {
                            break L51;
                          }
                        }
                      }
                      if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                        L52: {
                          if (0 != sq.field_Q) {
                            break L52;
                          } else {
                            jq.a(true, (byte) 126);
                            break L52;
                          }
                        }
                        sq.field_Q = sq.field_Q + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L50;
                        }
                      } else {
                        break L46;
                      }
                    }
                  }
                  mh.field_h = mh.field_h - 1;
                  if (var3 == 0) {
                    break L46;
                  } else {
                    break L49;
                  }
                }
              }
              L53: {
                io.field_b = false;
                if (-1 > (sq.field_Q ^ -1)) {
                  break L53;
                } else {
                  if ((da.field_a ^ -1) >= -1) {
                    if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                      break L46;
                    } else {
                      if (0 != mh.field_h) {
                        mh.field_h = mh.field_h + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L53;
                        }
                      } else {
                        L54: {
                          wf.a(6835);
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L54;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L54;
                            } else {
                              L55: {
                                if (mh.field_h > 0) {
                                  break L55;
                                } else {
                                  L56: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L56;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L57: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L57;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L57;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L54;
                                        } else {
                                          break L56;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L54;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              mh.field_h = mh.field_h - 1;
                              break L54;
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  } else {
                    da.field_a = da.field_a - 1;
                    if (var3 == 0) {
                      break L46;
                    } else {
                      L58: {
                        if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                          break L58;
                        } else {
                          L59: {
                            if (0 != mh.field_h) {
                              break L59;
                            } else {
                              wf.a(6835);
                              break L59;
                            }
                          }
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L58;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L58;
                            } else {
                              L60: {
                                if (mh.field_h > 0) {
                                  break L60;
                                } else {
                                  L61: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L61;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L62: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L62;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L62;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L58;
                                        } else {
                                          break L61;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L58;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              mh.field_h = mh.field_h - 1;
                              break L58;
                            }
                          }
                        }
                      }
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
              }
              sq.field_Q = sq.field_Q - 1;
              if (var3 == 0) {
                break L46;
              } else {
                L63: {
                  L64: {
                    if (mh.field_h > 0) {
                      break L64;
                    } else {
                      L65: {
                        if (-1 > (sq.field_Q ^ -1)) {
                          break L65;
                        } else {
                          if (da.field_a < b.field_d) {
                            L66: {
                              if ((da.field_a ^ -1) != -1) {
                                break L66;
                              } else {
                                jq.a(false, (byte) -20);
                                break L66;
                              }
                            }
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L63;
                            } else {
                              break L65;
                            }
                          } else {
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      }
                      sq.field_Q = sq.field_Q - 1;
                      if (var3 == 0) {
                        break L63;
                      } else {
                        break L64;
                      }
                    }
                  }
                  mh.field_h = mh.field_h - 1;
                  break L63;
                }
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            }
          }
          var2 = -72 / ((-39 - param0) / 44);
          return;
        }
    }

    ui(int param0, int param1, int param2) {
        this.field_l = param0;
        this.field_g = param1;
        this.field_h = 24 * this.field_l - (-12 + -this.a(-29394));
        this.field_m = 12 + (24 * this.field_g - -this.a(-29394));
    }

    static {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
