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
              ((mg) this).field_P = param9;
              ((mg) this).field_I = param6;
              ((mg) this).field_Q = param7;
              ((mg) this).field_K = param8;
              ((mg) this).field_C = param4;
              ((mg) this).field_U = param10;
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
              ((mg) this).field_H = stackIn_4_1 != 0;
              var12_int = ((mg) this).field_I + -((mg) this).field_Q;
              var13 = ((mg) this).field_K.a(param10, var12_int, ((mg) this).field_K.field_z) + ((mg) this).field_Q * 2;
              if (param3 < var13) {
                ((mg) this).a(false, param0, param1, var13, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (((mg) this).field_H) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ((mg) this).field_I - -(((mg) this).field_Q * 2);
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((mg) this).field_C.a(false, var14, (-param3 + var13 >> 1) + ((mg) this).field_Q, -(2 * ((mg) this).field_Q) + param3, param2 - ((mg) this).field_I - 3 * ((mg) this).field_Q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("mg.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = param2 + ((mg) this).field_o;
        int var6 = param3 + ((mg) this).field_t;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = ((mg) this).field_H ? -(2 * ((mg) this).field_Q) + -((mg) this).field_I + ((mg) this).field_n : 0;
        int discarded$0 = ((mg) this).field_K.a(((mg) this).field_U, ((mg) this).field_Q + var7 + var5, var6 - -((mg) this).field_Q, -((mg) this).field_Q + ((mg) this).field_I, -(2 * ((mg) this).field_Q) + ((mg) this).field_s, ((mg) this).field_P, -1, !((mg) this).field_H ? 2 : 0, 1, ((mg) this).field_K.field_z);
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
            ch.field_e.b((iq) (Object) bb.field_F, 0);
        }
        bb.field_F.a(param2, 4210752, param1, param3);
        try {
            bi.c();
            mh.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mg.A(" + 1 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1, boolean param2, uh param3) {
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
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        nk stackIn_19_0 = null;
        nk stackIn_20_0 = null;
        nk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        nk stackIn_26_0 = null;
        nk stackIn_27_0 = null;
        nk stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        nk stackIn_68_0 = null;
        nk stackIn_69_0 = null;
        nk stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        nk stackIn_73_0 = null;
        nk stackIn_74_0 = null;
        nk stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        nk stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        nk stackIn_80_0 = null;
        boolean stackIn_80_1 = false;
        nk stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        int stackIn_81_2 = 0;
        nk stackIn_83_0 = null;
        nk stackIn_84_0 = null;
        nk stackIn_85_0 = null;
        nk stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_90_0 = 0;
        nk stackIn_105_0 = null;
        nk stackIn_106_0 = null;
        nk stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        nk stackIn_109_0 = null;
        nk stackIn_110_0 = null;
        nk stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        nk stackIn_113_0 = null;
        nk stackIn_114_0 = null;
        nk stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        nk stackIn_117_0 = null;
        nk stackIn_118_0 = null;
        nk stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        String stackIn_134_0 = null;
        nk stackIn_137_0 = null;
        nk stackIn_138_0 = null;
        nk stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        nk stackIn_140_0 = null;
        nk stackIn_141_0 = null;
        nk stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_204_0 = 0;
        nk stackIn_305_0 = null;
        boolean stackIn_305_1 = false;
        nk stackIn_306_0 = null;
        boolean stackIn_306_1 = false;
        nk stackIn_307_0 = null;
        boolean stackIn_307_1 = false;
        int stackIn_307_2 = 0;
        nk stackIn_309_0 = null;
        nk stackIn_310_0 = null;
        nk stackIn_311_0 = null;
        int stackIn_311_1 = 0;
        nk stackIn_313_0 = null;
        nk stackIn_314_0 = null;
        nk stackIn_315_0 = null;
        nk stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        nk stackIn_318_0 = null;
        nk stackIn_319_0 = null;
        nk stackIn_320_0 = null;
        nk stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        nk stackOut_18_0 = null;
        nk stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        nk stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        nk stackOut_25_0 = null;
        nk stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        nk stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        nk stackOut_78_0 = null;
        boolean stackOut_78_1 = false;
        nk stackOut_80_0 = null;
        boolean stackOut_80_1 = false;
        int stackOut_80_2 = 0;
        nk stackOut_79_0 = null;
        boolean stackOut_79_1 = false;
        int stackOut_79_2 = 0;
        nk stackOut_72_0 = null;
        nk stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        nk stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        nk stackOut_67_0 = null;
        nk stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        nk stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        nk stackOut_82_0 = null;
        nk stackOut_83_0 = null;
        nk stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        nk stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        Object stackOut_133_0 = null;
        String stackOut_132_0 = null;
        nk stackOut_136_0 = null;
        nk stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        nk stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        nk stackOut_139_0 = null;
        nk stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        nk stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_202_0 = 0;
        nk stackOut_312_0 = null;
        nk stackOut_313_0 = null;
        nk stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        nk stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        nk stackOut_308_0 = null;
        nk stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        nk stackOut_309_0 = null;
        int stackOut_309_1 = 0;
        nk stackOut_304_0 = null;
        boolean stackOut_304_1 = false;
        nk stackOut_306_0 = null;
        boolean stackOut_306_1 = false;
        int stackOut_306_2 = 0;
        nk stackOut_305_0 = null;
        boolean stackOut_305_1 = false;
        int stackOut_305_2 = 0;
        nk stackOut_317_0 = null;
        nk stackOut_318_0 = null;
        nk stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        nk stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        nk stackOut_112_0 = null;
        nk stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        nk stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        nk stackOut_108_0 = null;
        nk stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        nk stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        nk stackOut_104_0 = null;
        nk stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        nk stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        nk stackOut_116_0 = null;
        nk stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        nk stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        L0: {
          var26 = Vertigo2.field_L ? 1 : 0;
          if (param2) {
            L1: {
              if (qn.field_q) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            var4_int = stackIn_9_0;
            break L0;
          } else {
            L2: {
              L3: {
                int discarded$3 = 0;
                if (!cn.b()) {
                  break L3;
                } else {
                  if (param3.field_kc) {
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
            break L0;
          }
        }
        L4: {
          var5 = 0;
          if (param2) {
            break L4;
          } else {
            var6 = 0;
            L5: while (true) {
              if (var6 >= 5) {
                if (field_S[0][2].field_G) {
                  int discarded$4 = 0;
                  if (cn.b()) {
                    ko.field_S = qn.field_z;
                    break L4;
                  } else {
                    ko.field_S = Vertigo2.a(new String[1], e.field_e, 77);
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
                      if (~var6 != ~param3.field_Ub) {
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
                  stackOut_18_0 = field_S[0][var6 + 1];
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var4_int == 0) {
                    stackOut_20_0 = (nk) (Object) stackIn_20_0;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L7;
                  } else {
                    stackOut_19_0 = (nk) (Object) stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L7;
                  }
                }
                L8: {
                  stackIn_21_0.field_lb = stackIn_21_1 != 0;
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
                  stackOut_25_0 = field_S[0][1 + var6];
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (~var6 != ~param3.field_Ub) {
                    stackOut_27_0 = (nk) (Object) stackIn_27_0;
                    stackOut_27_1 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    break L9;
                  } else {
                    stackOut_26_0 = (nk) (Object) stackIn_26_0;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L9;
                  }
                }
                stackIn_28_0.field_V = stackIn_28_1 != 0;
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
              L12: {
                if (!param2) {
                  break L12;
                } else {
                  if (-1 == np.field_Ob) {
                    break L12;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L11;
                  }
                }
              }
              stackOut_38_0 = 0;
              stackIn_39_0 = stackOut_38_0;
              break L11;
            }
            L13: {
              var6 = stackIn_39_0;
              if (var6 == 0) {
                break L13;
              } else {
                var7 = np.field_Ob;
                var8_int = 0;
                L14: while (true) {
                  if (qc.field_w.length <= var8_int) {
                    qc.field_w[var7 / 8] = (byte)om.a((int) qc.field_w[var7 / 8], 1 << var7 % 8);
                    break L13;
                  } else {
                    qc.field_w[var8_int] = (byte) 0;
                    var8_int++;
                    continue L14;
                  }
                }
              }
            }
            L15: {
              if (!param2) {
                stackOut_46_0 = 0;
                stackIn_47_0 = stackOut_46_0;
                break L15;
              } else {
                stackOut_45_0 = -1;
                stackIn_47_0 = stackOut_45_0;
                break L15;
              }
            }
            var7 = stackIn_47_0;
            L16: while (true) {
              if (~rc.field_a.length >= ~var7) {
                break L10;
              } else {
                L17: {
                  L18: {
                    if (var6 == 0) {
                      break L18;
                    } else {
                      if (~var7 == ~np.field_Ob) {
                        break L18;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L17;
                      }
                    }
                  }
                  stackOut_52_0 = 0;
                  stackIn_53_0 = stackOut_52_0;
                  break L17;
                }
                L19: {
                  var8_int = stackIn_53_0;
                  if (var4_int == 0) {
                    break L19;
                  } else {
                    if (field_S[1][1 + var7].field_tb != 0) {
                      if (param2) {
                        if (var6 != 0) {
                          break L19;
                        } else {
                          if (var7 == -1) {
                            var9 = 0;
                            L20: while (true) {
                              if (var9 >= qc.field_w.length) {
                                break L19;
                              } else {
                                qc.field_w[var9] = (byte) 0;
                                var9++;
                                continue L20;
                              }
                            }
                          } else {
                            qc.field_w[var7 / 8] = (byte)tk.a((int) qc.field_w[var7 / 8], 1 << b.a(var7, 7));
                            break L19;
                          }
                        }
                      } else {
                        var9 = rc.field_a[var7];
                        if (~var9 != ~param3.field_uc) {
                          param3.field_uc = var9;
                          var5 = 1;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L21: {
                  if (param2) {
                    if (var7 == -1) {
                      field_S[1][var7 + 1].field_V = true;
                      var9 = 0;
                      L22: while (true) {
                        if (~var9 <= ~rc.field_a.length) {
                          break L21;
                        } else {
                          L23: {
                            stackOut_78_0 = field_S[1][1 + var7];
                            stackOut_78_1 = field_S[1][1 + var7].field_V;
                            stackIn_80_0 = stackOut_78_0;
                            stackIn_80_1 = stackOut_78_1;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            if ((qc.field_w[var9 / 8] & 1 << (7 & var9)) != 0) {
                              stackOut_80_0 = (nk) (Object) stackIn_80_0;
                              stackOut_80_1 = stackIn_80_1;
                              stackOut_80_2 = 0;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              stackIn_81_2 = stackOut_80_2;
                              break L23;
                            } else {
                              stackOut_79_0 = (nk) (Object) stackIn_79_0;
                              stackOut_79_1 = stackIn_79_1;
                              stackOut_79_2 = 1;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_81_1 = stackOut_79_1;
                              stackIn_81_2 = stackOut_79_2;
                              break L23;
                            }
                          }
                          stackIn_81_0.field_V = stackIn_81_1 & stackIn_81_2 != 0;
                          var9++;
                          continue L22;
                        }
                      }
                    } else {
                      L24: {
                        stackOut_72_0 = field_S[1][var7 + 1];
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_73_0 = stackOut_72_0;
                        if ((qc.field_w[var7 / 8] & 1 << (var7 & 7)) == 0) {
                          stackOut_74_0 = (nk) (Object) stackIn_74_0;
                          stackOut_74_1 = 0;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          break L24;
                        } else {
                          stackOut_73_0 = (nk) (Object) stackIn_73_0;
                          stackOut_73_1 = 1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          break L24;
                        }
                      }
                      stackIn_75_0.field_V = stackIn_75_1 != 0;
                      break L21;
                    }
                  } else {
                    L25: {
                      var9 = rc.field_a[var7];
                      stackOut_67_0 = field_S[1][1 + var7];
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_68_0 = stackOut_67_0;
                      if (param3.field_uc != var9) {
                        stackOut_69_0 = (nk) (Object) stackIn_69_0;
                        stackOut_69_1 = 0;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        break L25;
                      } else {
                        stackOut_68_0 = (nk) (Object) stackIn_68_0;
                        stackOut_68_1 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        break L25;
                      }
                    }
                    stackIn_70_0.field_V = stackIn_70_1 != 0;
                    break L21;
                  }
                }
                L26: {
                  L27: {
                    stackOut_82_0 = field_S[1][1 + var7];
                    stackIn_85_0 = stackOut_82_0;
                    stackIn_83_0 = stackOut_82_0;
                    if (var4_int == 0) {
                      break L27;
                    } else {
                      stackOut_83_0 = (nk) (Object) stackIn_83_0;
                      stackIn_85_0 = stackOut_83_0;
                      stackIn_84_0 = stackOut_83_0;
                      if (var8_int != 0) {
                        break L27;
                      } else {
                        stackOut_84_0 = (nk) (Object) stackIn_84_0;
                        stackOut_84_1 = 1;
                        stackIn_86_0 = stackOut_84_0;
                        stackIn_86_1 = stackOut_84_1;
                        break L26;
                      }
                    }
                  }
                  stackOut_85_0 = (nk) (Object) stackIn_85_0;
                  stackOut_85_1 = 0;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  break L26;
                }
                stackIn_86_0.field_lb = stackIn_86_1 != 0;
                var7++;
                continue L16;
              }
            }
          }
        }
        L28: {
          if (!param2) {
            stackOut_89_0 = 1;
            stackIn_90_0 = stackOut_89_0;
            break L28;
          } else {
            stackOut_88_0 = 0;
            stackIn_90_0 = stackOut_88_0;
            break L28;
          }
        }
        var6 = stackIn_90_0;
        L29: while (true) {
          if (3 <= var6) {
            L30: {
              if (!param2) {
                break L30;
              } else {
                if (sp.field_O > 1) {
                  var6 = 0;
                  L31: while (true) {
                    if (~var6 <= ~(sp.field_O - -1)) {
                      break L30;
                    } else {
                      L32: {
                        var29 = field_S[3][var6];
                        if (var4_int == 0) {
                          break L32;
                        } else {
                          if (var29.field_tb == 0) {
                            break L32;
                          } else {
                            ua.field_a = var6;
                            break L32;
                          }
                        }
                      }
                      L33: {
                        if (!var29.field_G) {
                          break L33;
                        } else {
                          if (var6 > 0) {
                            L34: {
                              if (lh.field_c == null) {
                                stackOut_133_0 = null;
                                stackIn_134_0 = (String) (Object) stackOut_133_0;
                                break L34;
                              } else {
                                stackOut_132_0 = lh.field_c[var6 - 1];
                                stackIn_134_0 = stackOut_132_0;
                                break L34;
                              }
                            }
                            var8_ref = stackIn_134_0;
                            if (var8_ref == null) {
                              break L33;
                            } else {
                              ko.field_S = var8_ref;
                              break L33;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                      L35: {
                        stackOut_136_0 = (nk) var29;
                        stackIn_138_0 = stackOut_136_0;
                        stackIn_137_0 = stackOut_136_0;
                        if (var4_int == 0) {
                          stackOut_138_0 = (nk) (Object) stackIn_138_0;
                          stackOut_138_1 = 0;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          break L35;
                        } else {
                          stackOut_137_0 = (nk) (Object) stackIn_137_0;
                          stackOut_137_1 = 1;
                          stackIn_139_0 = stackOut_137_0;
                          stackIn_139_1 = stackOut_137_1;
                          break L35;
                        }
                      }
                      L36: {
                        stackIn_139_0.field_lb = stackIn_139_1 != 0;
                        stackOut_139_0 = (nk) var29;
                        stackIn_141_0 = stackOut_139_0;
                        stackIn_140_0 = stackOut_139_0;
                        if (~var6 != ~ua.field_a) {
                          stackOut_141_0 = (nk) (Object) stackIn_141_0;
                          stackOut_141_1 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          stackIn_142_1 = stackOut_141_1;
                          break L36;
                        } else {
                          stackOut_140_0 = (nk) (Object) stackIn_140_0;
                          stackOut_140_1 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          stackIn_142_1 = stackOut_140_1;
                          break L36;
                        }
                      }
                      stackIn_142_0.field_V = stackIn_142_1 != 0;
                      var6++;
                      continue L31;
                    }
                  }
                } else {
                  break L30;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L37: while (true) {
              if (~ol.field_A >= ~var7) {
                L38: {
                  L39: {
                    if (var5 == 0) {
                      break L39;
                    } else {
                      if (param2) {
                        break L39;
                      } else {
                        ar.a(953354214, 11);
                        break L38;
                      }
                    }
                  }
                  break L38;
                }
                return;
              } else {
                L40: {
                  var30 = field_S[var7 + 4];
                  var8 = var30;
                  if (!param2) {
                    stackOut_147_0 = 0;
                    stackIn_148_0 = stackOut_147_0;
                    break L40;
                  } else {
                    stackOut_146_0 = -1;
                    stackIn_148_0 = stackOut_146_0;
                    break L40;
                  }
                }
                var9 = stackIn_148_0;
                L41: while (true) {
                  if (var30.length + -1 <= var9) {
                    var6 = var6 + (kr.field_c[var7] & 255);
                    var7++;
                    continue L37;
                  } else {
                    L42: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L42;
                      } else {
                        if (var9 >= 0) {
                          L43: {
                            if (il.field_b == null) {
                              break L43;
                            } else {
                              if (null != il.field_b[var7]) {
                                if ((il.field_b[var7][var9] & ~ob.field_L) <= 0) {
                                  break L43;
                                } else {
                                  int discarded$5 = 79;
                                  var15 = ib.a(~ob.field_L & il.field_b[var7][var9]);
                                  var14 = 1;
                                  break L43;
                                }
                              } else {
                                break L43;
                              }
                            }
                          }
                          L44: {
                            if (null == sf.field_f) {
                              break L44;
                            } else {
                              if (sf.field_f[var7] == null) {
                                break L44;
                              } else {
                                if (q.field_y > 0) {
                                  break L44;
                                } else {
                                  if (sf.field_f[var7][var9]) {
                                    var10 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          L45: {
                            if (null == te.field_D) {
                              break L45;
                            } else {
                              if (te.field_D[var7] == null) {
                                break L45;
                              } else {
                                L46: {
                                  var16 = te.field_D[var7][var9];
                                  if (var16 <= 0) {
                                    break L46;
                                  } else {
                                    if (rp.field_a < var16) {
                                      var12 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L45;
                                } else {
                                  if (vb.field_g) {
                                    break L45;
                                  } else {
                                    if (q.field_y <= 0) {
                                      var10 = 1;
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            if (null == qh.field_e) {
                              break L47;
                            } else {
                              if (null != qh.field_e[var7]) {
                                L48: {
                                  var16 = qh.field_e[var7][var9];
                                  if (0 == var16) {
                                    break L48;
                                  } else {
                                    if (vb.field_g) {
                                      break L48;
                                    } else {
                                      if (q.field_y > 0) {
                                        break L48;
                                      } else {
                                        var10 = 1;
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                if (0 >= var16) {
                                  break L47;
                                } else {
                                  if (qn.field_w < var16) {
                                    var11 = 1;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                              } else {
                                break L47;
                              }
                            }
                          }
                          L49: {
                            L50: {
                              if (!param2) {
                                break L50;
                              } else {
                                if (null == dl.field_b) {
                                  break L50;
                                } else {
                                  if (dl.field_b[var7] == null) {
                                    break L50;
                                  } else {
                                    if (!dl.field_b[var7][var9]) {
                                      break L50;
                                    } else {
                                      stackOut_190_0 = 1;
                                      stackIn_192_0 = stackOut_190_0;
                                      break L49;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_191_0 = 0;
                            stackIn_192_0 = stackOut_191_0;
                            break L49;
                          }
                          var13 = stackIn_192_0;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L51: {
                      if (2 > fn.field_z) {
                        break L51;
                      } else {
                        if (!cr.field_eb[12]) {
                          break L51;
                        } else {
                          var13 = 0;
                          var14 = 0;
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          break L51;
                        }
                      }
                    }
                    L52: {
                      L53: {
                        gd.field_r = true;
                        if (var10 != 0) {
                          break L53;
                        } else {
                          if (var11 != 0) {
                            break L53;
                          } else {
                            if (var12 != 0) {
                              break L53;
                            } else {
                              if (var13 != 0) {
                                break L53;
                              } else {
                                if (var14 == 0) {
                                  stackOut_203_0 = 0;
                                  stackIn_204_0 = stackOut_203_0;
                                  break L52;
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_202_0 = 1;
                      stackIn_204_0 = stackOut_202_0;
                      break L52;
                    }
                    L54: {
                      var16 = stackIn_204_0;
                      if (var16 != 0) {
                        break L54;
                      } else {
                        if (var9 < 0) {
                          break L54;
                        } else {
                          if (gr.field_W == null) {
                            break L54;
                          } else {
                            L55: {
                              if (!param2) {
                                break L55;
                              } else {
                                if (qn.field_q) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            L56: {
                              ng.field_a = false;
                              if (null != e.field_c) {
                                break L56;
                              } else {
                                mn.field_t = new boolean[ol.field_A];
                                e.field_c = new byte[ol.field_A];
                                break L56;
                              }
                            }
                            gd.field_r = false;
                            var17_int = 0;
                            L57: while (true) {
                              if (~var17_int <= ~var7) {
                                L58: {
                                  uq.a(param3, var7, 20473, 0, -1, var9, -1, param2);
                                  if (fn.field_z < 2) {
                                    break L58;
                                  } else {
                                    if (!cr.field_eb[12]) {
                                      break L58;
                                    } else {
                                      gd.field_r = true;
                                      break L58;
                                    }
                                  }
                                }
                                if (gd.field_r) {
                                  break L54;
                                } else {
                                  var16 = 1;
                                  break L54;
                                }
                              } else {
                                mn.field_t[var17_int] = false;
                                var17_int++;
                                continue L57;
                              }
                            }
                          }
                        }
                      }
                    }
                    L59: {
                      var17 = var8[var9 + 1];
                      if (var4_int == 0) {
                        break L59;
                      } else {
                        if (var17.field_tb == 0) {
                          break L59;
                        } else {
                          if (!param2) {
                            if (var16 != 0) {
                              break L59;
                            } else {
                              if (~param3.field_fc[var7] == ~(byte)var9) {
                                break L59;
                              } else {
                                param3.field_fc[var7] = (byte)var9;
                                var5 = 1;
                                break L59;
                              }
                            }
                          } else {
                            if (var9 != -1) {
                              dj.field_a[(var9 - -var6) / 8] = (byte)tk.a((int) dj.field_a[(var9 + var6) / 8], 1 << b.a(7, var9 + var6));
                              break L59;
                            } else {
                              var18 = var6;
                              L60: while (true) {
                                if (~var18 <= ~(var30.length + (var6 + -1))) {
                                  break L59;
                                } else {
                                  dj.field_a[var18 / 8] = (byte)b.a((int) dj.field_a[var18 / 8], ~(1 << b.a(7, var18)));
                                  var18++;
                                  continue L60;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L61: {
                      if (!param2) {
                        break L61;
                      } else {
                        if (var16 == 0) {
                          break L61;
                        } else {
                          dj.field_a[(var6 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6 + var9) / 8], ~(1 << b.a(7, var6 + var9)));
                          break L61;
                        }
                      }
                    }
                    L62: {
                      if (var9 < 0) {
                        break L62;
                      } else {
                        if (var17.field_G) {
                          L63: {
                            if (null != rf.field_m) {
                              if (rf.field_m[var7] != null) {
                                var18_ref_String = rf.field_m[var7][var9];
                                break L63;
                              } else {
                                var18_ref_String = null;
                                break L63;
                              }
                            } else {
                              var18_ref_String = null;
                              break L63;
                            }
                          }
                          L64: {
                            if (an.field_f == null) {
                              var19 = null;
                              break L64;
                            } else {
                              if (null != an.field_f[var7]) {
                                var19 = (Object) (Object) an.field_f[var7][var9];
                                break L64;
                              } else {
                                var19 = null;
                                break L64;
                              }
                            }
                          }
                          L65: {
                            var20 = null;
                            if (var19 == null) {
                              break L65;
                            } else {
                              if (!((String) var19).equals((Object) (Object) var18_ref_String)) {
                                var20 = var19;
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                          }
                          L66: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L67: {
                                  if (var11 != 0) {
                                    var22_int = qh.field_e[var7][var9] - qn.field_w;
                                    if (var22_int == 1) {
                                      var21 = (Object) (Object) jm.field_D;
                                      break L67;
                                    } else {
                                      var21 = (Object) (Object) Vertigo2.a(new String[1], kk.field_h, 53);
                                      break L67;
                                    }
                                  } else {
                                    break L67;
                                  }
                                }
                                L68: {
                                  if (var12 != 0) {
                                    var31 = Vertigo2.a(new String[2], mf.field_a, -120);
                                    var21 = (Object) (Object) var31;
                                    var21 = (Object) (Object) var31;
                                    if (var21 == null) {
                                      var21 = (Object) (Object) var31;
                                      break L68;
                                    } else {
                                      var21 = (Object) (Object) (var21 + "<br>" + var31);
                                      break L68;
                                    }
                                  } else {
                                    break L68;
                                  }
                                }
                                if (var14 != 0) {
                                  L69: {
                                    var22_ref = ld.field_c;
                                    if (0 >= var15) {
                                      break L69;
                                    } else {
                                      if (null == ck.field_H) {
                                        break L69;
                                      } else {
                                        if (~var15 < ~ck.field_H.length) {
                                          break L69;
                                        } else {
                                          if (ck.field_H[var15 + -1] != null) {
                                            var22_ref = ck.field_H[var15 + -1][0];
                                            break L69;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = (Object) (Object) var22_ref;
                                    break L66;
                                  } else {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L66;
                                  }
                                } else {
                                  break L66;
                                }
                              } else {
                                var21 = (Object) (Object) tr.field_d;
                                break L66;
                              }
                            } else {
                              var21 = (Object) (Object) le.field_b;
                              break L66;
                            }
                          }
                          L70: {
                            if (var4_int == 0) {
                              break L70;
                            } else {
                              if (!gd.field_r) {
                                L71: {
                                  var22_ref = null;
                                  if (ng.field_a) {
                                    var22_ref = "</col>" + rq.field_v + "<col=A00000>";
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var21 = (Object) (Object) var22_ref;
                                    break L71;
                                  } else {
                                    break L71;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L72: while (true) {
                                  if (~var24 <= ~var7) {
                                    if (var23 != 0) {
                                      var21 = (Object) (Object) (qc.field_u + var22_ref);
                                      break L70;
                                    } else {
                                      var21 = (Object) (Object) Vertigo2.a(new String[1], ir.field_b, -124);
                                      break L70;
                                    }
                                  } else {
                                    L73: {
                                      if (mn.field_t[var24]) {
                                        var25 = "</col>" + md.field_C[var24] + "<col=A00000>";
                                        var22_ref = var25;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25;
                                        if (var22_ref != null) {
                                          var22_ref = var22_ref + ", " + var25;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var23 = 1;
                                          break L73;
                                        } else {
                                          var22_ref = var25;
                                          break L73;
                                        }
                                      } else {
                                        break L73;
                                      }
                                    }
                                    var24++;
                                    continue L72;
                                  }
                                }
                              } else {
                                break L70;
                              }
                            }
                          }
                          L74: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = uj.a("<br>", "<br><col=A00000>", 0, var32);
                              if (var20 == null) {
                                var20 = (Object) (Object) var33;
                                break L74;
                              } else {
                                var20 = (Object) (Object) (var20 + "<br>" + var33);
                                break L74;
                              }
                            } else {
                              break L74;
                            }
                          }
                          if (var20 == null) {
                            break L62;
                          } else {
                            ko.field_S = (String) var20;
                            break L62;
                          }
                        } else {
                          break L62;
                        }
                      }
                    }
                    L75: {
                      if (!param2) {
                        L76: {
                          L77: {
                            stackOut_312_0 = (nk) var17;
                            stackIn_315_0 = stackOut_312_0;
                            stackIn_313_0 = stackOut_312_0;
                            if (!gd.field_r) {
                              break L77;
                            } else {
                              stackOut_313_0 = (nk) (Object) stackIn_313_0;
                              stackIn_315_0 = stackOut_313_0;
                              stackIn_314_0 = stackOut_313_0;
                              if (param3.field_fc[var7] != (byte)var9) {
                                break L77;
                              } else {
                                stackOut_314_0 = (nk) (Object) stackIn_314_0;
                                stackOut_314_1 = 1;
                                stackIn_316_0 = stackOut_314_0;
                                stackIn_316_1 = stackOut_314_1;
                                break L76;
                              }
                            }
                          }
                          stackOut_315_0 = (nk) (Object) stackIn_315_0;
                          stackOut_315_1 = 0;
                          stackIn_316_0 = stackOut_315_0;
                          stackIn_316_1 = stackOut_315_1;
                          break L76;
                        }
                        stackIn_316_0.field_V = stackIn_316_1 != 0;
                        break L75;
                      } else {
                        if (-1 != var9) {
                          L78: {
                            stackOut_308_0 = (nk) var17;
                            stackIn_310_0 = stackOut_308_0;
                            stackIn_309_0 = stackOut_308_0;
                            if ((dj.field_a[(var9 + var6) / 8] & 1 << (7 & var6 - -var9)) == 0) {
                              stackOut_310_0 = (nk) (Object) stackIn_310_0;
                              stackOut_310_1 = 0;
                              stackIn_311_0 = stackOut_310_0;
                              stackIn_311_1 = stackOut_310_1;
                              break L78;
                            } else {
                              stackOut_309_0 = (nk) (Object) stackIn_309_0;
                              stackOut_309_1 = 1;
                              stackIn_311_0 = stackOut_309_0;
                              stackIn_311_1 = stackOut_309_1;
                              break L78;
                            }
                          }
                          stackIn_311_0.field_V = stackIn_311_1 != 0;
                          break L75;
                        } else {
                          var17.field_V = true;
                          var27 = var6;
                          var18 = var27;
                          L79: while (true) {
                            if (~var27 <= ~(var30.length + var6 - 1)) {
                              break L75;
                            } else {
                              L80: {
                                stackOut_304_0 = (nk) var17;
                                stackOut_304_1 = var17.field_V;
                                stackIn_306_0 = stackOut_304_0;
                                stackIn_306_1 = stackOut_304_1;
                                stackIn_305_0 = stackOut_304_0;
                                stackIn_305_1 = stackOut_304_1;
                                if ((dj.field_a[var27 / 8] & 1 << (var27 & 7)) != 0) {
                                  stackOut_306_0 = (nk) (Object) stackIn_306_0;
                                  stackOut_306_1 = stackIn_306_1;
                                  stackOut_306_2 = 0;
                                  stackIn_307_0 = stackOut_306_0;
                                  stackIn_307_1 = stackOut_306_1;
                                  stackIn_307_2 = stackOut_306_2;
                                  break L80;
                                } else {
                                  stackOut_305_0 = (nk) (Object) stackIn_305_0;
                                  stackOut_305_1 = stackIn_305_1;
                                  stackOut_305_2 = 1;
                                  stackIn_307_0 = stackOut_305_0;
                                  stackIn_307_1 = stackOut_305_1;
                                  stackIn_307_2 = stackOut_305_2;
                                  break L80;
                                }
                              }
                              stackIn_307_0.field_V = stackIn_307_1 & stackIn_307_2 != 0;
                              var27++;
                              continue L79;
                            }
                          }
                        }
                      }
                    }
                    L81: {
                      L82: {
                        stackOut_317_0 = (nk) var17;
                        stackIn_320_0 = stackOut_317_0;
                        stackIn_318_0 = stackOut_317_0;
                        if (var4_int == 0) {
                          break L82;
                        } else {
                          stackOut_318_0 = (nk) (Object) stackIn_318_0;
                          stackIn_320_0 = stackOut_318_0;
                          stackIn_319_0 = stackOut_318_0;
                          if (var16 != 0) {
                            break L82;
                          } else {
                            stackOut_319_0 = (nk) (Object) stackIn_319_0;
                            stackOut_319_1 = 1;
                            stackIn_321_0 = stackOut_319_0;
                            stackIn_321_1 = stackOut_319_1;
                            break L81;
                          }
                        }
                      }
                      stackOut_320_0 = (nk) (Object) stackIn_320_0;
                      stackOut_320_1 = 0;
                      stackIn_321_0 = stackOut_320_0;
                      stackIn_321_1 = stackOut_320_1;
                      break L81;
                    }
                    stackIn_321_0.field_lb = stackIn_321_1 != 0;
                    var9++;
                    continue L41;
                  }
                }
              }
            }
          } else {
            L83: {
              var28 = field_S[2][var6];
              if (var4_int == 0) {
                break L83;
              } else {
                if (0 != var28.field_tb) {
                  if (!param2) {
                    if (param3.field_xc != var6) {
                      param3.field_xc = var6;
                      var5 = 1;
                      break L83;
                    } else {
                      break L83;
                    }
                  } else {
                    if (var6 != 0) {
                      kg.field_y = kg.field_y ^ var6;
                      break L83;
                    } else {
                      kg.field_y = 0;
                      break L83;
                    }
                  }
                } else {
                  break L83;
                }
              }
            }
            L84: {
              if (!param2) {
                L85: {
                  stackOut_112_0 = (nk) var28;
                  stackIn_114_0 = stackOut_112_0;
                  stackIn_113_0 = stackOut_112_0;
                  if (0 == (param3.field_xc & var6)) {
                    stackOut_114_0 = (nk) (Object) stackIn_114_0;
                    stackOut_114_1 = 0;
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    break L85;
                  } else {
                    stackOut_113_0 = (nk) (Object) stackIn_113_0;
                    stackOut_113_1 = 1;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    break L85;
                  }
                }
                stackIn_115_0.field_V = stackIn_115_1 != 0;
                break L84;
              } else {
                if (var6 != 0) {
                  L86: {
                    stackOut_108_0 = (nk) var28;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if ((var6 & kg.field_y) == 0) {
                      stackOut_110_0 = (nk) (Object) stackIn_110_0;
                      stackOut_110_1 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L86;
                    } else {
                      stackOut_109_0 = (nk) (Object) stackIn_109_0;
                      stackOut_109_1 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L86;
                    }
                  }
                  stackIn_111_0.field_V = stackIn_111_1 != 0;
                  break L84;
                } else {
                  L87: {
                    stackOut_104_0 = (nk) var28;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (kg.field_y != 0) {
                      stackOut_106_0 = (nk) (Object) stackIn_106_0;
                      stackOut_106_1 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L87;
                    } else {
                      stackOut_105_0 = (nk) (Object) stackIn_105_0;
                      stackOut_105_1 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L87;
                    }
                  }
                  stackIn_107_0.field_V = stackIn_107_1 != 0;
                  break L84;
                }
              }
            }
            L88: {
              stackOut_116_0 = (nk) var28;
              stackIn_118_0 = stackOut_116_0;
              stackIn_117_0 = stackOut_116_0;
              if (var4_int == 0) {
                stackOut_118_0 = (nk) (Object) stackIn_118_0;
                stackOut_118_1 = 0;
                stackIn_119_0 = stackOut_118_0;
                stackIn_119_1 = stackOut_118_1;
                break L88;
              } else {
                stackOut_117_0 = (nk) (Object) stackIn_117_0;
                stackOut_117_1 = 1;
                stackIn_119_0 = stackOut_117_0;
                stackIn_119_1 = stackOut_117_1;
                break L88;
              }
            }
            stackIn_119_0.field_lb = stackIn_119_1 != 0;
            var6++;
            continue L29;
          }
        }
    }

    public static void h() {
        field_L = null;
        field_G = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_S = null;
        field_N = null;
        field_T = null;
    }

    final String a(boolean param0) {
        int var2 = ((mg) this).field_C.field_p ? 1 : 0;
        ((mg) this).field_C.field_p = ((mg) this).field_p;
        String var3 = ((mg) this).field_C.a(param0);
        ((mg) this).field_C.field_p = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[8192];
        field_N = new nj();
        field_T = "Cancel draw";
        field_G = "The following settings need to be changed:  ";
        field_L = "Breaking real-world laws";
    }
}
