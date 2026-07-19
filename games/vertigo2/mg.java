/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends oh {
    private int field_P;
    static int[] field_J;
    private String field_U;
    static nj field_N;
    private int field_I;
    private boolean field_H;
    private cc field_K;
    static nk[][] field_S;
    private int field_Q;
    static boolean field_O;
    static String field_T;
    static String field_L;
    static String field_G;
    static od field_R;
    static cr[] field_M;

    mg(int param0, int param1, int param2, int param3, iq param4, boolean param5, int param6, int param7, cc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ur) null, (uf) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              this.field_P = param9;
              this.field_I = param6;
              this.field_Q = param7;
              this.field_K = param8;
              this.field_C = param4;
              this.field_U = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((mg) (this)).field_H = stackIn_4_1 != 0;
              var12_int = this.field_I + -this.field_Q;
              var13 = this.field_K.a(param10, var12_int, this.field_K.field_z) + this.field_Q * 2;
              if (param3 < var13) {
                this.a(false, param0, param1, var13, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (this.field_H) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = this.field_I - -(this.field_Q * 2);
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_C.a(false, var14, (-param3 + var13 >> 165415681) + this.field_Q, -(2 * this.field_Q) + param3, param2 - this.field_I - 3 * this.field_Q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_o;
        int var6 = param3 + this.field_t;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = this.field_H ? -(2 * this.field_Q) + -this.field_I + this.field_n : 0;
        int discarded$0 = this.field_K.a(this.field_U, this.field_Q + var7 + var5, var6 - -this.field_Q, -this.field_Q + this.field_I, -(2 * this.field_Q) + this.field_s, this.field_P, -1, !this.field_H ? 2 : 0, 1, this.field_K.field_z);
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
            ch.field_e.b(bb.field_F, 0);
        }
        bb.field_F.a(param2, 4210752, param1, param3);
        if (param0 != 1) {
            return;
        }
        try {
            bi.c();
            mh.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, uh param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        nk[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        nk var28 = null;
        nk var29 = null;
        nk[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nk stackIn_22_0 = null;
        nk stackIn_23_0 = null;
        nk stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        nk stackIn_29_0 = null;
        nk stackIn_30_0 = null;
        nk stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        nk stackIn_75_0 = null;
        nk stackIn_76_0 = null;
        nk stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        nk stackIn_80_0 = null;
        nk stackIn_81_0 = null;
        nk stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        nk stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        nk stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        nk stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_88_2 = 0;
        nk stackIn_90_0 = null;
        nk stackIn_91_0 = null;
        nk stackIn_92_0 = null;
        nk stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_97_0 = 0;
        nk stackIn_112_0 = null;
        nk stackIn_113_0 = null;
        nk stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        nk stackIn_116_0 = null;
        nk stackIn_117_0 = null;
        nk stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        nk stackIn_120_0 = null;
        nk stackIn_121_0 = null;
        nk stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        nk stackIn_124_0 = null;
        nk stackIn_125_0 = null;
        nk stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        String stackIn_141_0 = null;
        nk stackIn_144_0 = null;
        nk stackIn_145_0 = null;
        nk stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        nk stackIn_147_0 = null;
        nk stackIn_148_0 = null;
        nk stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_215_0 = 0;
        nk stackIn_316_0 = null;
        boolean stackIn_316_1 = false;
        nk stackIn_317_0 = null;
        boolean stackIn_317_1 = false;
        nk stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        int stackIn_318_2 = 0;
        nk stackIn_320_0 = null;
        nk stackIn_321_0 = null;
        nk stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        nk stackIn_324_0 = null;
        nk stackIn_325_0 = null;
        nk stackIn_326_0 = null;
        nk stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        nk stackIn_329_0 = null;
        nk stackIn_330_0 = null;
        nk stackIn_331_0 = null;
        nk stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        RuntimeException stackIn_339_0 = null;
        StringBuilder stackIn_339_1 = null;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        RuntimeException stackIn_341_0 = null;
        StringBuilder stackIn_341_1 = null;
        String stackIn_341_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        nk stackOut_21_0 = null;
        nk stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        nk stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        nk stackOut_28_0 = null;
        nk stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        nk stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        nk stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        nk stackOut_87_0 = null;
        boolean stackOut_87_1 = false;
        int stackOut_87_2 = 0;
        nk stackOut_86_0 = null;
        boolean stackOut_86_1 = false;
        int stackOut_86_2 = 0;
        nk stackOut_79_0 = null;
        nk stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        nk stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        nk stackOut_74_0 = null;
        nk stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        nk stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        nk stackOut_89_0 = null;
        nk stackOut_90_0 = null;
        nk stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        nk stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        Object stackOut_140_0 = null;
        String stackOut_139_0 = null;
        nk stackOut_143_0 = null;
        nk stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        nk stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        nk stackOut_146_0 = null;
        nk stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        nk stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_213_0 = 0;
        nk stackOut_323_0 = null;
        nk stackOut_324_0 = null;
        nk stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        nk stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        nk stackOut_319_0 = null;
        nk stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        nk stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        nk stackOut_315_0 = null;
        boolean stackOut_315_1 = false;
        nk stackOut_317_0 = null;
        boolean stackOut_317_1 = false;
        int stackOut_317_2 = 0;
        nk stackOut_316_0 = null;
        boolean stackOut_316_1 = false;
        int stackOut_316_2 = 0;
        nk stackOut_328_0 = null;
        nk stackOut_329_0 = null;
        nk stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        nk stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        nk stackOut_119_0 = null;
        nk stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        nk stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        nk stackOut_115_0 = null;
        nk stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        nk stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        nk stackOut_111_0 = null;
        nk stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        nk stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        nk stackOut_123_0 = null;
        nk stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        nk stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        RuntimeException stackOut_338_0 = null;
        StringBuilder stackOut_338_1 = null;
        RuntimeException stackOut_340_0 = null;
        StringBuilder stackOut_340_1 = null;
        String stackOut_340_2 = null;
        RuntimeException stackOut_339_0 = null;
        StringBuilder stackOut_339_1 = null;
        String stackOut_339_2 = null;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                L2: {
                  if (qn.field_q) {
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
                  if (cn.b(false)) {
                    if (!param3.field_kc) {
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
              var5 = param0 ? 1 : 0;
              if (param2) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= 5) {
                    if (field_S[0][2].field_G) {
                      if (cn.b(false)) {
                        ko.field_S = qn.field_z;
                        break L4;
                      } else {
                        ko.field_S = Vertigo2.a(new String[]{gd.field_j.field_Nb}, e.field_e, 77);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (field_S[0][1 + var6].field_tb == 0) {
                          break L6;
                        } else {
                          if (var6 != param3.field_Ub) {
                            param3.field_Ub = var6;
                            var5 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackOut_21_0 = field_S[0][var6 + 1];
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var4_int == 0) {
                        stackOut_23_0 = (nk) ((Object) stackIn_23_0);
                        stackOut_23_1 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L7;
                      } else {
                        stackOut_22_0 = (nk) ((Object) stackIn_22_0);
                        stackOut_22_1 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_24_0.field_lb = stackIn_24_1 != 0;
                      if (db.field_S) {
                        break L8;
                      } else {
                        if (var6 == 3) {
                          field_S[0][1 + var6].field_lb = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackOut_28_0 = field_S[0][1 + var6];
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var6 != param3.field_Ub) {
                        stackOut_30_0 = (nk) ((Object) stackIn_30_0);
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L9;
                      } else {
                        stackOut_29_0 = (nk) ((Object) stackIn_29_0);
                        stackOut_29_1 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L9;
                      }
                    }
                    stackIn_31_0.field_V = stackIn_31_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if (2 > rc.field_a.length) {
                break L10;
              } else {
                L11: {
                  if (param2) {
                    if (-1 != np.field_Ob) {
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L11;
                    } else {
                      stackOut_41_0 = 0;
                      stackIn_44_0 = stackOut_41_0;
                      break L11;
                    }
                  } else {
                    stackOut_39_0 = 0;
                    stackIn_44_0 = stackOut_39_0;
                    break L11;
                  }
                }
                L12: {
                  var6 = stackIn_44_0;
                  if (var6 == 0) {
                    break L12;
                  } else {
                    var7 = np.field_Ob;
                    var8_int = 0;
                    L13: while (true) {
                      if (qc.field_w.length <= var8_int) {
                        qc.field_w[var7 / 8] = (byte)om.a((int) qc.field_w[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        qc.field_w[var8_int] = (byte) 0;
                        var8_int++;
                        continue L13;
                      }
                    }
                  }
                }
                L14: {
                  if (!param2) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L14;
                  } else {
                    stackOut_50_0 = -1;
                    stackIn_52_0 = stackOut_50_0;
                    break L14;
                  }
                }
                var7 = stackIn_52_0;
                L15: while (true) {
                  if (rc.field_a.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (var7 != np.field_Ob) {
                          stackOut_58_0 = 1;
                          stackIn_60_0 = stackOut_58_0;
                          break L16;
                        } else {
                          stackOut_57_0 = 0;
                          stackIn_60_0 = stackOut_57_0;
                          break L16;
                        }
                      } else {
                        stackOut_55_0 = 0;
                        stackIn_60_0 = stackOut_55_0;
                        break L16;
                      }
                    }
                    L17: {
                      var8_int = stackIn_60_0;
                      if (var4_int == 0) {
                        break L17;
                      } else {
                        if (field_S[1][1 + var7].field_tb != 0) {
                          if (param2) {
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if ((var7 ^ -1) == 0) {
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= qc.field_w.length) {
                                    break L17;
                                  } else {
                                    qc.field_w[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              } else {
                                qc.field_w[var7 / 8] = (byte)tk.a((int) qc.field_w[var7 / 8], 1 << b.a(var7, 7));
                                break L17;
                              }
                            }
                          } else {
                            var9 = rc.field_a[var7];
                            if (var9 != param3.field_uc) {
                              param3.field_uc = var9;
                              var5 = 1;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param2) {
                        if (var7 == -1) {
                          field_S[1][var7 + 1].field_V = true;
                          var9 = 0;
                          L20: while (true) {
                            if (var9 >= rc.field_a.length) {
                              break L19;
                            } else {
                              L21: {
                                stackOut_85_0 = field_S[1][1 + var7];
                                stackOut_85_1 = field_S[1][1 + var7].field_V;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
                                stackIn_86_0 = stackOut_85_0;
                                stackIn_86_1 = stackOut_85_1;
                                if ((qc.field_w[var9 / 8] & 1 << (7 & var9)) != 0) {
                                  stackOut_87_0 = (nk) ((Object) stackIn_87_0);
                                  stackOut_87_1 = stackIn_87_1;
                                  stackOut_87_2 = 0;
                                  stackIn_88_0 = stackOut_87_0;
                                  stackIn_88_1 = stackOut_87_1;
                                  stackIn_88_2 = stackOut_87_2;
                                  break L21;
                                } else {
                                  stackOut_86_0 = (nk) ((Object) stackIn_86_0);
                                  stackOut_86_1 = stackIn_86_1;
                                  stackOut_86_2 = 1;
                                  stackIn_88_0 = stackOut_86_0;
                                  stackIn_88_1 = stackOut_86_1;
                                  stackIn_88_2 = stackOut_86_2;
                                  break L21;
                                }
                              }
                              stackIn_88_0.field_V = stackIn_88_1 & stackIn_88_2 != 0;
                              var9++;
                              continue L20;
                            }
                          }
                        } else {
                          L22: {
                            stackOut_79_0 = field_S[1][var7 + 1];
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_80_0 = stackOut_79_0;
                            if ((qc.field_w[var7 / 8] & 1 << (var7 & 7)) == 0) {
                              stackOut_81_0 = (nk) ((Object) stackIn_81_0);
                              stackOut_81_1 = 0;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              break L22;
                            } else {
                              stackOut_80_0 = (nk) ((Object) stackIn_80_0);
                              stackOut_80_1 = 1;
                              stackIn_82_0 = stackOut_80_0;
                              stackIn_82_1 = stackOut_80_1;
                              break L22;
                            }
                          }
                          stackIn_82_0.field_V = stackIn_82_1 != 0;
                          break L19;
                        }
                      } else {
                        L23: {
                          var9 = rc.field_a[var7];
                          stackOut_74_0 = field_S[1][1 + var7];
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_75_0 = stackOut_74_0;
                          if (param3.field_uc != var9) {
                            stackOut_76_0 = (nk) ((Object) stackIn_76_0);
                            stackOut_76_1 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            break L23;
                          } else {
                            stackOut_75_0 = (nk) ((Object) stackIn_75_0);
                            stackOut_75_1 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            break L23;
                          }
                        }
                        stackIn_77_0.field_V = stackIn_77_1 != 0;
                        break L19;
                      }
                    }
                    L24: {
                      L25: {
                        stackOut_89_0 = field_S[1][1 + var7];
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_90_0 = stackOut_89_0;
                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackOut_90_0 = (nk) ((Object) stackIn_90_0);
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_91_0 = stackOut_90_0;
                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackOut_91_0 = (nk) ((Object) stackIn_91_0);
                            stackOut_91_1 = 1;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            break L24;
                          }
                        }
                      }
                      stackOut_92_0 = (nk) ((Object) stackIn_92_0);
                      stackOut_92_1 = 0;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      break L24;
                    }
                    stackIn_93_0.field_lb = stackIn_93_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              }
            }
            L26: {
              if (!param2) {
                stackOut_96_0 = 1;
                stackIn_97_0 = stackOut_96_0;
                break L26;
              } else {
                stackOut_95_0 = 0;
                stackIn_97_0 = stackOut_95_0;
                break L26;
              }
            }
            var6 = stackIn_97_0;
            L27: while (true) {
              if (3 <= var6) {
                L28: {
                  if (!param2) {
                    break L28;
                  } else {
                    if (sp.field_O > 1) {
                      var6 = 0;
                      L29: while (true) {
                        if (var6 >= sp.field_O - -1) {
                          break L28;
                        } else {
                          L30: {
                            var29 = field_S[3][var6];
                            if (var4_int == 0) {
                              break L30;
                            } else {
                              if (var29.field_tb == 0) {
                                break L30;
                              } else {
                                ua.field_a = var6;
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (!var29.field_G) {
                              break L31;
                            } else {
                              if ((var6 ^ -1) < -1) {
                                L32: {
                                  if (lh.field_c == null) {
                                    stackOut_140_0 = null;
                                    stackIn_141_0 = (String) ((Object) stackOut_140_0);
                                    break L32;
                                  } else {
                                    stackOut_139_0 = lh.field_c[var6 - 1];
                                    stackIn_141_0 = stackOut_139_0;
                                    break L32;
                                  }
                                }
                                var8_ref = stackIn_141_0;
                                if (var8_ref == null) {
                                  break L31;
                                } else {
                                  ko.field_S = var8_ref;
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L33: {
                            stackOut_143_0 = (nk) (var29);
                            stackIn_145_0 = stackOut_143_0;
                            stackIn_144_0 = stackOut_143_0;
                            if (var4_int == 0) {
                              stackOut_145_0 = (nk) ((Object) stackIn_145_0);
                              stackOut_145_1 = 0;
                              stackIn_146_0 = stackOut_145_0;
                              stackIn_146_1 = stackOut_145_1;
                              break L33;
                            } else {
                              stackOut_144_0 = (nk) ((Object) stackIn_144_0);
                              stackOut_144_1 = 1;
                              stackIn_146_0 = stackOut_144_0;
                              stackIn_146_1 = stackOut_144_1;
                              break L33;
                            }
                          }
                          L34: {
                            stackIn_146_0.field_lb = stackIn_146_1 != 0;
                            stackOut_146_0 = (nk) (var29);
                            stackIn_148_0 = stackOut_146_0;
                            stackIn_147_0 = stackOut_146_0;
                            if (var6 != ua.field_a) {
                              stackOut_148_0 = (nk) ((Object) stackIn_148_0);
                              stackOut_148_1 = 0;
                              stackIn_149_0 = stackOut_148_0;
                              stackIn_149_1 = stackOut_148_1;
                              break L34;
                            } else {
                              stackOut_147_0 = (nk) ((Object) stackIn_147_0);
                              stackOut_147_1 = 1;
                              stackIn_149_0 = stackOut_147_0;
                              stackIn_149_1 = stackOut_147_1;
                              break L34;
                            }
                          }
                          stackIn_149_0.field_V = stackIn_149_1 != 0;
                          var6++;
                          continue L29;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L35: while (true) {
                  if (ol.field_A <= var7) {
                    L36: {
                      if (var5 == 0) {
                        break L36;
                      } else {
                        if (param2) {
                          break L36;
                        } else {
                          ar.a(953354214, param1);
                          break L36;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L37: {
                      var30 = field_S[var7 + 4];
                      var8 = var30;
                      if (!param2) {
                        stackOut_154_0 = 0;
                        stackIn_155_0 = stackOut_154_0;
                        break L37;
                      } else {
                        stackOut_153_0 = -1;
                        stackIn_155_0 = stackOut_153_0;
                        break L37;
                      }
                    }
                    var9 = stackIn_155_0;
                    L38: while (true) {
                      if (var30.length + -1 <= var9) {
                        var6 = var6 + (kr.field_c[var7] & 255);
                        var7++;
                        continue L35;
                      } else {
                        L39: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L39;
                          } else {
                            if ((var9 ^ -1) <= -1) {
                              L40: {
                                if (il.field_b == null) {
                                  break L40;
                                } else {
                                  if (null != il.field_b[var7]) {
                                    if ((il.field_b[var7][var9] & (ob.field_L ^ -1) ^ -1) >= -1) {
                                      break L40;
                                    } else {
                                      var15 = ib.a((ob.field_L ^ -1) & il.field_b[var7][var9], (byte) 79);
                                      var14 = 1;
                                      break L40;
                                    }
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              L41: {
                                if (null == sf.field_f) {
                                  break L41;
                                } else {
                                  if (sf.field_f[var7] == null) {
                                    break L41;
                                  } else {
                                    if (-1 > (q.field_y ^ -1)) {
                                      break L41;
                                    } else {
                                      if (sf.field_f[var7][var9]) {
                                        var10 = 1;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                              L42: {
                                if (null == te.field_D) {
                                  break L42;
                                } else {
                                  if (te.field_D[var7] == null) {
                                    break L42;
                                  } else {
                                    L43: {
                                      var16 = te.field_D[var7][var9];
                                      if ((var16 ^ -1) >= -1) {
                                        break L43;
                                      } else {
                                        if (rp.field_a < var16) {
                                          var12 = 1;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L42;
                                    } else {
                                      if (vb.field_g) {
                                        break L42;
                                      } else {
                                        if (-1 <= (q.field_y ^ -1)) {
                                          var10 = 1;
                                          break L42;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L44: {
                                if (null == qh.field_e) {
                                  break L44;
                                } else {
                                  if (null != qh.field_e[var7]) {
                                    L45: {
                                      var16 = qh.field_e[var7][var9];
                                      if (0 == var16) {
                                        break L45;
                                      } else {
                                        if (vb.field_g) {
                                          break L45;
                                        } else {
                                          if (q.field_y > 0) {
                                            break L45;
                                          } else {
                                            var10 = 1;
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if (0 >= var16) {
                                      break L44;
                                    } else {
                                      if (qn.field_w < var16) {
                                        var11 = 1;
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L46: {
                                if (param2) {
                                  if (null != dl.field_b) {
                                    if (dl.field_b[var7] != null) {
                                      if (!dl.field_b[var7][var9]) {
                                        stackOut_201_0 = 0;
                                        stackIn_203_0 = stackOut_201_0;
                                        break L46;
                                      } else {
                                        stackOut_200_0 = 1;
                                        stackIn_203_0 = stackOut_200_0;
                                        break L46;
                                      }
                                    } else {
                                      stackOut_198_0 = 0;
                                      stackIn_203_0 = stackOut_198_0;
                                      break L46;
                                    }
                                  } else {
                                    stackOut_196_0 = 0;
                                    stackIn_203_0 = stackOut_196_0;
                                    break L46;
                                  }
                                } else {
                                  stackOut_194_0 = 0;
                                  stackIn_203_0 = stackOut_194_0;
                                  break L46;
                                }
                              }
                              var13 = stackIn_203_0;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        L47: {
                          if (2 > fn.field_z) {
                            break L47;
                          } else {
                            if (!cr.field_eb[12]) {
                              break L47;
                            } else {
                              var13 = 0;
                              var14 = 0;
                              var10 = 0;
                              var11 = 0;
                              var12 = 0;
                              break L47;
                            }
                          }
                        }
                        L48: {
                          L49: {
                            gd.field_r = true;
                            if (var10 != 0) {
                              break L49;
                            } else {
                              if (var11 != 0) {
                                break L49;
                              } else {
                                if (var12 != 0) {
                                  break L49;
                                } else {
                                  if (var13 != 0) {
                                    break L49;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_214_0 = 0;
                                      stackIn_215_0 = stackOut_214_0;
                                      break L48;
                                    } else {
                                      stackOut_212_0 = 1;
                                      stackIn_215_0 = stackOut_212_0;
                                      break L48;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_213_0 = 1;
                          stackIn_215_0 = stackOut_213_0;
                          break L48;
                        }
                        L50: {
                          var16 = stackIn_215_0;
                          if (var16 != 0) {
                            break L50;
                          } else {
                            if (var9 < 0) {
                              break L50;
                            } else {
                              if (gr.field_W == null) {
                                break L50;
                              } else {
                                L51: {
                                  if (!param2) {
                                    break L51;
                                  } else {
                                    if (qn.field_q) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  ng.field_a = false;
                                  if (null != e.field_c) {
                                    break L52;
                                  } else {
                                    mn.field_t = new boolean[ol.field_A];
                                    e.field_c = new byte[ol.field_A];
                                    break L52;
                                  }
                                }
                                gd.field_r = false;
                                var17_int = 0;
                                L53: while (true) {
                                  if (var17_int >= var7) {
                                    L54: {
                                      uq.a(param3, var7, 20473, 0, -1, var9, -1, param2);
                                      if (fn.field_z < 2) {
                                        break L54;
                                      } else {
                                        if (!cr.field_eb[12]) {
                                          break L54;
                                        } else {
                                          gd.field_r = true;
                                          break L54;
                                        }
                                      }
                                    }
                                    if (gd.field_r) {
                                      break L50;
                                    } else {
                                      var16 = 1;
                                      break L50;
                                    }
                                  } else {
                                    mn.field_t[var17_int] = false;
                                    var17_int++;
                                    continue L53;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L55: {
                          var17 = var8[var9 + 1];
                          if (var4_int == 0) {
                            break L55;
                          } else {
                            if (var17.field_tb == 0) {
                              break L55;
                            } else {
                              if (!param2) {
                                if (var16 != 0) {
                                  break L55;
                                } else {
                                  if (param3.field_fc[var7] == (byte)var9) {
                                    break L55;
                                  } else {
                                    param3.field_fc[var7] = (byte)var9;
                                    var5 = 1;
                                    break L55;
                                  }
                                }
                              } else {
                                if (var9 != -1) {
                                  dj.field_a[(var9 - -var6) / 8] = (byte)tk.a((int) dj.field_a[(var9 + var6) / 8], 1 << b.a(7, var9 + var6));
                                  break L55;
                                } else {
                                  var18 = var6;
                                  L56: while (true) {
                                    if (var18 >= var30.length + (var6 + -1)) {
                                      break L55;
                                    } else {
                                      dj.field_a[var18 / 8] = (byte)b.a((int) dj.field_a[var18 / 8], 1 << b.a(7, var18) ^ -1);
                                      var18++;
                                      continue L56;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L57: {
                          if (!param2) {
                            break L57;
                          } else {
                            if (var16 == 0) {
                              break L57;
                            } else {
                              dj.field_a[(var6 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6 + var9) / 8], 1 << b.a(7, var6 + var9) ^ -1);
                              break L57;
                            }
                          }
                        }
                        L58: {
                          if ((var9 ^ -1) > -1) {
                            break L58;
                          } else {
                            if (var17.field_G) {
                              L59: {
                                if (null != rf.field_m) {
                                  if (rf.field_m[var7] != null) {
                                    var18_ref_String = rf.field_m[var7][var9];
                                    break L59;
                                  } else {
                                    var18_ref_String = null;
                                    break L59;
                                  }
                                } else {
                                  var18_ref_String = null;
                                  break L59;
                                }
                              }
                              L60: {
                                if (an.field_f == null) {
                                  var19 = null;
                                  break L60;
                                } else {
                                  if (null != an.field_f[var7]) {
                                    var19 = an.field_f[var7][var9];
                                    break L60;
                                  } else {
                                    var19 = null;
                                    break L60;
                                  }
                                }
                              }
                              L61: {
                                var20 = null;
                                if (var19 == null) {
                                  break L61;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref_String)) {
                                    var20 = var19;
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              L62: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L63: {
                                      if (var11 != 0) {
                                        var22_int = qh.field_e[var7][var9] - qn.field_w;
                                        if (var22_int == 1) {
                                          var21 = jm.field_D;
                                          break L63;
                                        } else {
                                          var21 = Vertigo2.a(new String[]{Integer.toString(var22_int)}, kk.field_h, 53);
                                          break L63;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    L64: {
                                      if (var12 != 0) {
                                        var31 = Vertigo2.a(new String[]{Integer.toString(rp.field_a), Integer.toString(te.field_D[var7][var9])}, mf.field_a, -120);
                                        var21 = var31;
                                        var21 = var31;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L64;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L64;
                                        }
                                      } else {
                                        break L64;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L65: {
                                        var22_ref = ld.field_c;
                                        if (0 >= var15) {
                                          break L65;
                                        } else {
                                          if (null == ck.field_H) {
                                            break L65;
                                          } else {
                                            if (var15 > ck.field_H.length) {
                                              break L65;
                                            } else {
                                              if (ck.field_H[var15 + -1] != null) {
                                                var22_ref = ck.field_H[var15 + -1][0];
                                                break L65;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22_ref;
                                        break L62;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + var22_ref;
                                        break L62;
                                      }
                                    } else {
                                      break L62;
                                    }
                                  } else {
                                    var21 = tr.field_d;
                                    break L62;
                                  }
                                } else {
                                  var21 = le.field_b;
                                  break L62;
                                }
                              }
                              L66: {
                                if (var4_int == 0) {
                                  break L66;
                                } else {
                                  if (!gd.field_r) {
                                    L67: {
                                      var22_ref = null;
                                      if (ng.field_a) {
                                        var22_ref = "</col>" + rq.field_v + "<col=A00000>";
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var21 = var22_ref;
                                        break L67;
                                      } else {
                                        break L67;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L68: while (true) {
                                      if (var24 >= var7) {
                                        if (var23 != 0) {
                                          var21 = qc.field_u + var22_ref;
                                          break L66;
                                        } else {
                                          var21 = Vertigo2.a(new String[]{var22_ref}, ir.field_b, -124);
                                          break L66;
                                        }
                                      } else {
                                        L69: {
                                          if (mn.field_t[var24]) {
                                            var25 = "</col>" + md.field_C[var24] + "<col=A00000>";
                                            var22_ref = var25;
                                            var21 = var22_ref;
                                            var22_ref = var25;
                                            if (var22_ref != null) {
                                              var22_ref = var22_ref + ", " + var25;
                                              var21 = var22_ref;
                                              var21 = var22_ref;
                                              var23 = 1;
                                              break L69;
                                            } else {
                                              var22_ref = var25;
                                              break L69;
                                            }
                                          } else {
                                            break L69;
                                          }
                                        }
                                        var24++;
                                        continue L68;
                                      }
                                    }
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                              L70: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = uj.a("<br>", "<br><col=A00000>", 0, var32);
                                  if (var20 == null) {
                                    var20 = var33;
                                    break L70;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L70;
                                  }
                                } else {
                                  break L70;
                                }
                              }
                              if (var20 == null) {
                                break L58;
                              } else {
                                ko.field_S = (String) (var20);
                                break L58;
                              }
                            } else {
                              break L58;
                            }
                          }
                        }
                        L71: {
                          if (!param2) {
                            L72: {
                              L73: {
                                stackOut_323_0 = (nk) (var17);
                                stackIn_326_0 = stackOut_323_0;
                                stackIn_324_0 = stackOut_323_0;
                                if (!gd.field_r) {
                                  break L73;
                                } else {
                                  stackOut_324_0 = (nk) ((Object) stackIn_324_0);
                                  stackIn_326_0 = stackOut_324_0;
                                  stackIn_325_0 = stackOut_324_0;
                                  if (param3.field_fc[var7] != (byte)var9) {
                                    break L73;
                                  } else {
                                    stackOut_325_0 = (nk) ((Object) stackIn_325_0);
                                    stackOut_325_1 = 1;
                                    stackIn_327_0 = stackOut_325_0;
                                    stackIn_327_1 = stackOut_325_1;
                                    break L72;
                                  }
                                }
                              }
                              stackOut_326_0 = (nk) ((Object) stackIn_326_0);
                              stackOut_326_1 = 0;
                              stackIn_327_0 = stackOut_326_0;
                              stackIn_327_1 = stackOut_326_1;
                              break L72;
                            }
                            stackIn_327_0.field_V = stackIn_327_1 != 0;
                            break L71;
                          } else {
                            if (-1 != var9) {
                              L74: {
                                stackOut_319_0 = (nk) (var17);
                                stackIn_321_0 = stackOut_319_0;
                                stackIn_320_0 = stackOut_319_0;
                                if ((dj.field_a[(var9 + var6) / 8] & 1 << (7 & var6 - -var9)) == 0) {
                                  stackOut_321_0 = (nk) ((Object) stackIn_321_0);
                                  stackOut_321_1 = 0;
                                  stackIn_322_0 = stackOut_321_0;
                                  stackIn_322_1 = stackOut_321_1;
                                  break L74;
                                } else {
                                  stackOut_320_0 = (nk) ((Object) stackIn_320_0);
                                  stackOut_320_1 = 1;
                                  stackIn_322_0 = stackOut_320_0;
                                  stackIn_322_1 = stackOut_320_1;
                                  break L74;
                                }
                              }
                              stackIn_322_0.field_V = stackIn_322_1 != 0;
                              break L71;
                            } else {
                              var17.field_V = true;
                              var27 = var6;
                              var18 = var27;
                              L75: while (true) {
                                if (var27 >= var30.length + var6 - 1) {
                                  break L71;
                                } else {
                                  L76: {
                                    stackOut_315_0 = (nk) (var17);
                                    stackOut_315_1 = var17.field_V;
                                    stackIn_317_0 = stackOut_315_0;
                                    stackIn_317_1 = stackOut_315_1;
                                    stackIn_316_0 = stackOut_315_0;
                                    stackIn_316_1 = stackOut_315_1;
                                    if (-1 != (dj.field_a[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                      stackOut_317_0 = (nk) ((Object) stackIn_317_0);
                                      stackOut_317_1 = stackIn_317_1;
                                      stackOut_317_2 = 0;
                                      stackIn_318_0 = stackOut_317_0;
                                      stackIn_318_1 = stackOut_317_1;
                                      stackIn_318_2 = stackOut_317_2;
                                      break L76;
                                    } else {
                                      stackOut_316_0 = (nk) ((Object) stackIn_316_0);
                                      stackOut_316_1 = stackIn_316_1;
                                      stackOut_316_2 = 1;
                                      stackIn_318_0 = stackOut_316_0;
                                      stackIn_318_1 = stackOut_316_1;
                                      stackIn_318_2 = stackOut_316_2;
                                      break L76;
                                    }
                                  }
                                  stackIn_318_0.field_V = stackIn_318_1 & stackIn_318_2 != 0;
                                  var27++;
                                  continue L75;
                                }
                              }
                            }
                          }
                        }
                        L77: {
                          L78: {
                            stackOut_328_0 = (nk) (var17);
                            stackIn_331_0 = stackOut_328_0;
                            stackIn_329_0 = stackOut_328_0;
                            if (var4_int == 0) {
                              break L78;
                            } else {
                              stackOut_329_0 = (nk) ((Object) stackIn_329_0);
                              stackIn_331_0 = stackOut_329_0;
                              stackIn_330_0 = stackOut_329_0;
                              if (var16 != 0) {
                                break L78;
                              } else {
                                stackOut_330_0 = (nk) ((Object) stackIn_330_0);
                                stackOut_330_1 = 1;
                                stackIn_332_0 = stackOut_330_0;
                                stackIn_332_1 = stackOut_330_1;
                                break L77;
                              }
                            }
                          }
                          stackOut_331_0 = (nk) ((Object) stackIn_331_0);
                          stackOut_331_1 = 0;
                          stackIn_332_0 = stackOut_331_0;
                          stackIn_332_1 = stackOut_331_1;
                          break L77;
                        }
                        stackIn_332_0.field_lb = stackIn_332_1 != 0;
                        var9++;
                        continue L38;
                      }
                    }
                  }
                }
              } else {
                L79: {
                  var28 = field_S[2][var6];
                  if (var4_int == 0) {
                    break L79;
                  } else {
                    if (0 != var28.field_tb) {
                      if (!param2) {
                        if (param3.field_xc != var6) {
                          param3.field_xc = var6;
                          var5 = 1;
                          break L79;
                        } else {
                          break L79;
                        }
                      } else {
                        if (var6 != 0) {
                          kg.field_y = kg.field_y ^ var6;
                          break L79;
                        } else {
                          kg.field_y = 0;
                          break L79;
                        }
                      }
                    } else {
                      break L79;
                    }
                  }
                }
                L80: {
                  if (!param2) {
                    L81: {
                      stackOut_119_0 = (nk) (var28);
                      stackIn_121_0 = stackOut_119_0;
                      stackIn_120_0 = stackOut_119_0;
                      if (0 == (param3.field_xc & var6)) {
                        stackOut_121_0 = (nk) ((Object) stackIn_121_0);
                        stackOut_121_1 = 0;
                        stackIn_122_0 = stackOut_121_0;
                        stackIn_122_1 = stackOut_121_1;
                        break L81;
                      } else {
                        stackOut_120_0 = (nk) ((Object) stackIn_120_0);
                        stackOut_120_1 = 1;
                        stackIn_122_0 = stackOut_120_0;
                        stackIn_122_1 = stackOut_120_1;
                        break L81;
                      }
                    }
                    stackIn_122_0.field_V = stackIn_122_1 != 0;
                    break L80;
                  } else {
                    if (var6 != 0) {
                      L82: {
                        stackOut_115_0 = (nk) (var28);
                        stackIn_117_0 = stackOut_115_0;
                        stackIn_116_0 = stackOut_115_0;
                        if ((var6 & kg.field_y) == 0) {
                          stackOut_117_0 = (nk) ((Object) stackIn_117_0);
                          stackOut_117_1 = 0;
                          stackIn_118_0 = stackOut_117_0;
                          stackIn_118_1 = stackOut_117_1;
                          break L82;
                        } else {
                          stackOut_116_0 = (nk) ((Object) stackIn_116_0);
                          stackOut_116_1 = 1;
                          stackIn_118_0 = stackOut_116_0;
                          stackIn_118_1 = stackOut_116_1;
                          break L82;
                        }
                      }
                      stackIn_118_0.field_V = stackIn_118_1 != 0;
                      break L80;
                    } else {
                      L83: {
                        stackOut_111_0 = (nk) (var28);
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_112_0 = stackOut_111_0;
                        if (-1 != (kg.field_y ^ -1)) {
                          stackOut_113_0 = (nk) ((Object) stackIn_113_0);
                          stackOut_113_1 = 0;
                          stackIn_114_0 = stackOut_113_0;
                          stackIn_114_1 = stackOut_113_1;
                          break L83;
                        } else {
                          stackOut_112_0 = (nk) ((Object) stackIn_112_0);
                          stackOut_112_1 = 1;
                          stackIn_114_0 = stackOut_112_0;
                          stackIn_114_1 = stackOut_112_1;
                          break L83;
                        }
                      }
                      stackIn_114_0.field_V = stackIn_114_1 != 0;
                      break L80;
                    }
                  }
                }
                L84: {
                  stackOut_123_0 = (nk) (var28);
                  stackIn_125_0 = stackOut_123_0;
                  stackIn_124_0 = stackOut_123_0;
                  if (var4_int == 0) {
                    stackOut_125_0 = (nk) ((Object) stackIn_125_0);
                    stackOut_125_1 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    break L84;
                  } else {
                    stackOut_124_0 = (nk) ((Object) stackIn_124_0);
                    stackOut_124_1 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    break L84;
                  }
                }
                stackIn_126_0.field_lb = stackIn_126_1 != 0;
                var6++;
                continue L27;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L85: {
            var4 = decompiledCaughtException;
            stackOut_338_0 = (RuntimeException) (var4);
            stackOut_338_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_340_0 = stackOut_338_0;
            stackIn_340_1 = stackOut_338_1;
            stackIn_339_0 = stackOut_338_0;
            stackIn_339_1 = stackOut_338_1;
            if (param3 == null) {
              stackOut_340_0 = (RuntimeException) ((Object) stackIn_340_0);
              stackOut_340_1 = (StringBuilder) ((Object) stackIn_340_1);
              stackOut_340_2 = "null";
              stackIn_341_0 = stackOut_340_0;
              stackIn_341_1 = stackOut_340_1;
              stackIn_341_2 = stackOut_340_2;
              break L85;
            } else {
              stackOut_339_0 = (RuntimeException) ((Object) stackIn_339_0);
              stackOut_339_1 = (StringBuilder) ((Object) stackIn_339_1);
              stackOut_339_2 = "{...}";
              stackIn_341_0 = stackOut_339_0;
              stackIn_341_1 = stackOut_339_1;
              stackIn_341_2 = stackOut_339_2;
              break L85;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_341_0), stackIn_341_2 + ')');
        }
    }

    public static void h(int param0) {
        field_L = null;
        field_G = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_S = (nk[][]) null;
        field_N = null;
        if (param0 != 2) {
            uh var2 = (uh) null;
            mg.a(true, 49, false, (uh) null);
        }
        field_T = null;
    }

    final String a(boolean param0) {
        int var2 = this.field_C.field_p ? 1 : 0;
        this.field_C.field_p = this.field_p;
        String var3 = this.field_C.a(param0);
        this.field_C.field_p = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_J = new int[8192];
        field_N = new nj();
        field_T = "Cancel draw";
        field_G = "The following settings need to be changed:  ";
        field_L = "Breaking real-world laws";
    }
}
