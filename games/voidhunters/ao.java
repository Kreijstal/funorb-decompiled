/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends rqa {
    static int field_o;

    ao(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                ao.a((byte) -16, false);
                break L1;
              }
            }
            chb.field_a = param0[0].a(108);
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ao.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static kua a(cbb param0, int[] param1, int param2, int param3) {
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        kua stackIn_50_0 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        kua stackOut_49_0 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        Object stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4 = null;
              if (param3 == -3) {
                break L1;
              } else {
                field_o = 121;
                break L1;
              }
            }
            L2: {
              var5 = null;
              var6 = null;
              var7 = null;
              if (null == param0.field_M) {
                break L2;
              } else {
                var8 = param0.field_B;
                var45 = new int[var8];
                var46 = new int[var8];
                var47 = new int[var8];
                var48 = new int[var8];
                var49 = new int[var8];
                var50 = new int[var8];
                var15 = 0;
                L3: while (true) {
                  if (var8 <= var15) {
                    var24 = new int[var8];
                    var4 = var24;
                    var15 = 0;
                    L4: while (true) {
                      if (var15 >= param2) {
                        var26 = new int[var8];
                        var6 = var26;
                        var25 = new int[var8];
                        var5 = var25;
                        var7 = new float[var8][];
                        var15 = 0;
                        L5: while (true) {
                          if (var8 <= var15) {
                            break L2;
                          } else {
                            L6: {
                              var16 = param0.field_e[var15];
                              if ((var16 ^ -1) < -1) {
                                L7: {
                                  var24[var15] = (var45[var15] - -var46[var15]) / 2;
                                  var25[var15] = (var47[var15] - -var48[var15]) / 2;
                                  var26[var15] = (var49[var15] + var50[var15]) / 2;
                                  if (1 == var16) {
                                    L8: {
                                      var20 = param0.field_F[var15];
                                      if (0 != var20) {
                                        if (var20 > 0) {
                                          var19 = (float)var20 / 1024.0f;
                                          var17 = 1.0f;
                                          break L8;
                                        } else {
                                          var19 = 1.0f;
                                          var17 = (float)(-var20) / 1024.0f;
                                          break L8;
                                        }
                                      } else {
                                        var19 = 1.0f;
                                        var17 = 1.0f;
                                        break L8;
                                      }
                                    }
                                    var18 = 64.0f / (float)param0.field_a[var15];
                                    break L7;
                                  } else {
                                    if (-3 == (var16 ^ -1)) {
                                      var19 = 64.0f / (float)param0.field_C[var15];
                                      var18 = 64.0f / (float)param0.field_a[var15];
                                      var17 = 64.0f / (float)param0.field_F[var15];
                                      break L7;
                                    } else {
                                      var19 = (float)param0.field_C[var15] / 1024.0f;
                                      var18 = (float)param0.field_a[var15] / 1024.0f;
                                      var17 = (float)param0.field_F[var15] / 1024.0f;
                                      break L7;
                                    }
                                  }
                                }
                                ((Object[]) (var7))[var15] = ck.a(var19, 0, (int) param0.field_t[var15], dla.a((int) param0.field_J[var15], 255), var18, (int) param0.field_i[var15], (int) param0.field_H[var15], var17);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var15++;
                            continue L5;
                          }
                        }
                      } else {
                        L9: {
                          var16 = param1[var15];
                          if (-1 == param0.field_M[var16]) {
                            break L9;
                          } else {
                            var17_int = 255 & param0.field_M[var16];
                            var18_int = 0;
                            L10: while (true) {
                              if (var18_int >= 3) {
                                break L9;
                              } else {
                                L11: {
                                  if (var18_int != 0) {
                                    if (var18_int != 1) {
                                      var19_int = param0.field_K[var16];
                                      break L11;
                                    } else {
                                      var19_int = param0.field_o[var16];
                                      break L11;
                                    }
                                  } else {
                                    var19_int = param0.field_k[var16];
                                    break L11;
                                  }
                                }
                                L12: {
                                  var20 = param0.field_v[var19_int];
                                  var21 = param0.field_G[var19_int];
                                  var22 = param0.field_x[var19_int];
                                  if (var20 >= var45[var17_int]) {
                                    break L12;
                                  } else {
                                    var45[var17_int] = var20;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (var46[var17_int] >= var20) {
                                    break L13;
                                  } else {
                                    var46[var17_int] = var20;
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (var21 < var47[var17_int]) {
                                    var47[var17_int] = var21;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (var21 <= var48[var17_int]) {
                                    break L15;
                                  } else {
                                    var48[var17_int] = var21;
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (var22 >= var49[var17_int]) {
                                    break L16;
                                  } else {
                                    var49[var17_int] = var22;
                                    break L16;
                                  }
                                }
                                L17: {
                                  if (var50[var17_int] < var22) {
                                    var50[var17_int] = var22;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var18_int++;
                                continue L10;
                              }
                            }
                          }
                        }
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    var45[var15] = 2147483647;
                    var46[var15] = -2147483647;
                    var47[var15] = 2147483647;
                    var48[var15] = -2147483647;
                    var49[var15] = 2147483647;
                    var50[var15] = -2147483647;
                    var15++;
                    continue L3;
                  }
                }
              }
            }
            stackOut_49_0 = new kua((int[]) (var4), (int[]) (var5), (int[]) (var6), (float[][]) (var7));
            stackIn_50_0 = stackOut_49_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_51_0 = var4;
            stackOut_51_1 = new StringBuilder().append("ao.B(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = stackIn_53_0;
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = stackIn_52_0;
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          L19: {
            stackOut_54_0 = stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_56_0 = stackIn_56_0;
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = stackIn_55_0;
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_50_0;
    }

    final static void a(byte param0, boolean param1) {
        if (wq.e((byte) 105)) {
            param1 = false;
        }
        mc.a(-119, param1);
        ria.e((byte) 89);
        int var2 = 103 / ((param0 - -19) / 55);
    }

    static {
        field_o = 0;
    }
}
