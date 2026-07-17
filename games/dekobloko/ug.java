/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        dh var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        vg var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        dh stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        dh stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var40 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param0;
                if (var45.field_Q == null) {
                  break L2;
                } else {
                  if (var45.field_B <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_Q;
                    sh.a(var62, -25724, 0, nm.field_Nb, 0);
                    break L1;
                  }
                }
              }
              int discarded$1 = 2;
              kh.a();
              break L1;
            }
            var66 = new int[param0.field_D];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param0.field_D];
            var64 = id.field_M;
            var63 = bc.field_I;
            var65 = sf.field_C;
            var13 = 0;
            L3: while (true) {
              if (param0.field_D <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= ta.field_d) {
                    break L0;
                  } else {
                    L5: {
                      var14 = hb.field_Vb[var44];
                      var15 = param0.field_M[var14];
                      var16 = param0.field_c[var14];
                      var17 = param0.field_A[var14];
                      if (id.field_M.length > param0.field_F[var14]) {
                        stackOut_23_0 = param0.field_F[var14];
                        stackIn_24_0 = stackOut_23_0;
                        break L5;
                      } else {
                        stackOut_22_0 = -1;
                        stackIn_24_0 = stackOut_22_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_24_0;
                      if (id.field_M.length > param0.field_t[var14]) {
                        stackOut_26_0 = param0.field_t[var14];
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (id.field_M.length <= param0.field_r[var14]) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = param0.field_r[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (null == l.field_i) {
                          break L9;
                        } else {
                          if (null == param0.field_j) {
                            break L9;
                          } else {
                            if (param0.field_j.length <= var14) {
                              break L9;
                            } else {
                              if (param0.field_j[var14] == -1) {
                                break L9;
                              } else {
                                if (l.field_i.length <= param0.field_j[var14]) {
                                  break L9;
                                } else {
                                  stackOut_35_0 = l.field_i[param0.field_j[var14]];
                                  stackIn_37_0 = stackOut_35_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = (dh) (Object) stackOut_36_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_37_0;
                        var22 = kl.field_n[var15];
                        var23 = rn.field_b[var15];
                        var24 = kl.field_n[var16];
                        var25 = rn.field_b[var16];
                        var26 = kl.field_n[var17];
                        var27 = rn.field_b[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_46_0 = var21_ref.field_a;
                                stackIn_47_0 = stackOut_46_0;
                                break L12;
                              } else {
                                stackOut_45_0 = 8355711;
                                stackIn_47_0 = stackOut_45_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_47_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = 1476460288 & var32 * var28 >>> 8 | -268500737 & var31 * var28 >>> 8;
                            var33 = var33 + 65793 * var29;
                            tb.a(var23, var27, var22, var33 >> 1 & 8355711, var24, var25, 127, var26);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_42_0 = var21_ref.field_a;
                          stackIn_43_0 = stackOut_42_0;
                          break L13;
                        } else {
                          stackOut_41_0 = 8355711;
                          stackIn_43_0 = stackOut_41_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_43_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = (16711810 & var36 * var28) >>> 8 | (var35 * var28 & -16711879) >>> 8;
                      var38 = var35 * var29 >>> 8 & 285147391 | var36 * var29 >>> 8 & 1291910912;
                      var39 = -755040001 & var35 * var30 >>> 8 | var36 * var30 >>> 8 & -2046755072;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + var33 * 65793;
                      wf.a(var37 & 255, var25, var22, var39 >> 16, var24, var37 >> 16, var39 & 255, 255 & var38, var27, var38 >> 16, var39 >> 8 & 255, var23, true, var37 >> 8 & 255, var26, 255 & var38 >> 8);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var63[var13] * param1 + var64[var13] * param3 + var65[var13] * param6 >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (0 > var14) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_13_0 = var14 + 128;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = 256;
                      stackIn_15_0 = stackOut_12_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = param2 * var64[var13] + var63[var13] * param7 - -(var65[var13] * param5) >> 8;
                  stackOut_15_0 = ch.field_b;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 >= 0) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (256 + -var15) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var8;
            stackOut_50_1 = new StringBuilder().append("ug.B(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 0 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static boolean a(CharSequence param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            int discarded$11 = 4564;
            if (!cb.a(false, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param0.length()) {
                  var4 = 0;
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (!ci.a(param0.charAt(var3_int), (byte) 82)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ug.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 44 + 100 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public static void a() {
        field_q = null;
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (160 == param0) {
              break L1;
            } else {
              if (param0 == 32) {
                break L1;
              } else {
                if (param0 == 95) {
                  break L1;
                } else {
                  if (param0 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "The Controls";
    }
}
