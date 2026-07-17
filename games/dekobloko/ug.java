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
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        dh stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_46_10 = 0;
        int stackIn_46_11 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        int stackIn_47_11 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int stackIn_48_8 = 0;
        int stackIn_48_9 = 0;
        int stackIn_48_10 = 0;
        int stackIn_48_11 = 0;
        int stackIn_48_12 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        dh stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_45_10 = 0;
        int stackOut_45_11 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int stackOut_47_8 = 0;
        int stackOut_47_9 = 0;
        int stackOut_47_10 = 0;
        int stackOut_47_11 = 0;
        int stackOut_47_12 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_46_10 = 0;
        int stackOut_46_11 = 0;
        int stackOut_46_12 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var40 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var45 = param0;
              if (!param4) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var45.field_Q == null) {
                  break L3;
                } else {
                  if (var45.field_B <= 1) {
                    break L3;
                  } else {
                    var62 = var45.field_Q;
                    sh.a(var62, -25724, 0, nm.field_Nb, 0);
                    break L2;
                  }
                }
              }
              kh.a(2);
              break L2;
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
            L4: while (true) {
              if (param0.field_D <= var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= ta.field_d) {
                    break L0;
                  } else {
                    L6: {
                      var14 = hb.field_Vb[var44];
                      var15 = param0.field_M[var14];
                      var16 = param0.field_c[var14];
                      var17 = param0.field_A[var14];
                      if (id.field_M.length > param0.field_F[var14]) {
                        stackOut_25_0 = param0.field_F[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (id.field_M.length > param0.field_t[var14]) {
                        stackOut_28_0 = param0.field_t[var14];
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (id.field_M.length <= param0.field_r[var14]) {
                        stackOut_31_0 = -1;
                        stackIn_32_0 = stackOut_31_0;
                        break L8;
                      } else {
                        stackOut_30_0 = param0.field_r[var14];
                        stackIn_32_0 = stackOut_30_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (null == l.field_i) {
                          break L10;
                        } else {
                          if (null == param0.field_j) {
                            break L10;
                          } else {
                            if (param0.field_j.length <= var14) {
                              break L10;
                            } else {
                              if (param0.field_j[var14] == -1) {
                                break L10;
                              } else {
                                if (l.field_i.length <= param0.field_j[var14]) {
                                  break L10;
                                } else {
                                  stackOut_37_0 = l.field_i[param0.field_j[var14]];
                                  stackIn_39_0 = stackOut_37_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = (dh) (Object) stackOut_38_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_39_0;
                        var22 = kl.field_n[var15];
                        var23 = rn.field_b[var15];
                        var24 = kl.field_n[var16];
                        var25 = rn.field_b[var16];
                        var26 = kl.field_n[var17];
                        var27 = rn.field_b[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_51_0 = var21_ref.field_a;
                                stackIn_52_0 = stackOut_51_0;
                                break L13;
                              } else {
                                stackOut_50_0 = 8355711;
                                stackIn_52_0 = stackOut_50_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_52_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = 1476460288 & var32 * var28 >>> 8 | -268500737 & var31 * var28 >>> 8;
                            var33 = var33 + 65793 * var29;
                            tb.a(var23, var27, var22, var33 >> 1 & 8355711, var24, var25, 127, var26);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_44_0 = var21_ref.field_a;
                          stackIn_45_0 = stackOut_44_0;
                          break L14;
                        } else {
                          stackOut_43_0 = 8355711;
                          stackIn_45_0 = stackOut_43_0;
                          break L14;
                        }
                      }
                      L15: {
                        var34 = stackIn_45_0;
                        var35 = var34 & 16711935;
                        var36 = var34 & 65280;
                        var37 = (16711810 & var36 * var28) >>> 8 | (var35 * var28 & -16711879) >>> 8;
                        var38 = var35 * var29 >>> 8 & 285147391 | var36 * var29 >>> 8 & 1291910912;
                        var39 = -755040001 & var35 * var30 >>> 8 | var36 * var30 >>> 8 & -2046755072;
                        var37 = var37 + var31 * 65793;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + var33 * 65793;
                        stackOut_45_0 = var37 & 255;
                        stackOut_45_1 = var25;
                        stackOut_45_2 = var22;
                        stackOut_45_3 = var39 >> 16;
                        stackOut_45_4 = var24;
                        stackOut_45_5 = var37 >> 16;
                        stackOut_45_6 = var39 & 255;
                        stackOut_45_7 = 255 & var38;
                        stackOut_45_8 = var27;
                        stackOut_45_9 = var38 >> 16;
                        stackOut_45_10 = var39 >> 8 & 255;
                        stackOut_45_11 = var23;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_47_2 = stackOut_45_2;
                        stackIn_47_3 = stackOut_45_3;
                        stackIn_47_4 = stackOut_45_4;
                        stackIn_47_5 = stackOut_45_5;
                        stackIn_47_6 = stackOut_45_6;
                        stackIn_47_7 = stackOut_45_7;
                        stackIn_47_8 = stackOut_45_8;
                        stackIn_47_9 = stackOut_45_9;
                        stackIn_47_10 = stackOut_45_10;
                        stackIn_47_11 = stackOut_45_11;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        stackIn_46_3 = stackOut_45_3;
                        stackIn_46_4 = stackOut_45_4;
                        stackIn_46_5 = stackOut_45_5;
                        stackIn_46_6 = stackOut_45_6;
                        stackIn_46_7 = stackOut_45_7;
                        stackIn_46_8 = stackOut_45_8;
                        stackIn_46_9 = stackOut_45_9;
                        stackIn_46_10 = stackOut_45_10;
                        stackIn_46_11 = stackOut_45_11;
                        if (param4) {
                          stackOut_47_0 = stackIn_47_0;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = stackIn_47_2;
                          stackOut_47_3 = stackIn_47_3;
                          stackOut_47_4 = stackIn_47_4;
                          stackOut_47_5 = stackIn_47_5;
                          stackOut_47_6 = stackIn_47_6;
                          stackOut_47_7 = stackIn_47_7;
                          stackOut_47_8 = stackIn_47_8;
                          stackOut_47_9 = stackIn_47_9;
                          stackOut_47_10 = stackIn_47_10;
                          stackOut_47_11 = stackIn_47_11;
                          stackOut_47_12 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          stackIn_48_2 = stackOut_47_2;
                          stackIn_48_3 = stackOut_47_3;
                          stackIn_48_4 = stackOut_47_4;
                          stackIn_48_5 = stackOut_47_5;
                          stackIn_48_6 = stackOut_47_6;
                          stackIn_48_7 = stackOut_47_7;
                          stackIn_48_8 = stackOut_47_8;
                          stackIn_48_9 = stackOut_47_9;
                          stackIn_48_10 = stackOut_47_10;
                          stackIn_48_11 = stackOut_47_11;
                          stackIn_48_12 = stackOut_47_12;
                          break L15;
                        } else {
                          stackOut_46_0 = stackIn_46_0;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = stackIn_46_2;
                          stackOut_46_3 = stackIn_46_3;
                          stackOut_46_4 = stackIn_46_4;
                          stackOut_46_5 = stackIn_46_5;
                          stackOut_46_6 = stackIn_46_6;
                          stackOut_46_7 = stackIn_46_7;
                          stackOut_46_8 = stackIn_46_8;
                          stackOut_46_9 = stackIn_46_9;
                          stackOut_46_10 = stackIn_46_10;
                          stackOut_46_11 = stackIn_46_11;
                          stackOut_46_12 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          stackIn_48_3 = stackOut_46_3;
                          stackIn_48_4 = stackOut_46_4;
                          stackIn_48_5 = stackOut_46_5;
                          stackIn_48_6 = stackOut_46_6;
                          stackIn_48_7 = stackOut_46_7;
                          stackIn_48_8 = stackOut_46_8;
                          stackIn_48_9 = stackOut_46_9;
                          stackIn_48_10 = stackOut_46_10;
                          stackIn_48_11 = stackOut_46_11;
                          stackIn_48_12 = stackOut_46_12;
                          break L15;
                        }
                      }
                      wf.a(stackIn_48_0, stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4, stackIn_48_5, stackIn_48_6, stackIn_48_7, stackIn_48_8, stackIn_48_9, stackIn_48_10, stackIn_48_11, stackIn_48_12 != 0, var37 >> 8 & 255, var26, 255 & var38 >> 8);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L16: {
                  var14 = var63[var13] * param1 + var64[var13] * param3 + var65[var13] * param6 >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (0 > var14) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L17;
                  } else {
                    if (var14 < 128) {
                      stackOut_15_0 = var14 + 128;
                      stackIn_17_0 = stackOut_15_0;
                      break L17;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_17_0 = stackOut_14_0;
                      break L17;
                    }
                  }
                }
                L18: {
                  var14 = stackIn_17_0;
                  var15 = param2 * var64[var13] + var63[var13] * param7 - -(var65[var13] * param5) >> 8;
                  stackOut_17_0 = ch.field_b;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var15 >= 0) {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = var15;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L18;
                  } else {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = -var15;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L18;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = (256 + -var15) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var8 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var8;
            stackOut_55_1 = new StringBuilder().append("ug.B(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L19;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L19;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
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
            if (!cb.a(param1, param0, 4564)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param0.length()) {
                  var4 = -86 % ((-31 - param2) / 56);
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
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public static void a(int param0) {
        field_q = null;
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0, int param1) {
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
