/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String[] field_a;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, le param5, int param6, int param7) {
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
        ca var21_ref = null;
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
        le var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        ca stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        short stackOut_21_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        ca stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var40 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (var45.field_x == null) {
                  break L2;
                } else {
                  if (var45.field_n <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_x;
                    te.a((byte) -112, var62, t.field_a, 0, 0);
                    break L1;
                  }
                }
              }
              ia.b(0);
              break L1;
            }
            field_a = null;
            var66 = new int[param5.field_y];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param5.field_y];
            var63 = gk.field_g;
            var64 = hb.field_o;
            var65 = bl.field_b;
            var13 = 0;
            L3: while (true) {
              if (param5.field_y <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= kg.field_c) {
                    break L0;
                  } else {
                    L5: {
                      var14 = cb.field_e[var44];
                      var15 = param5.field_p[var14];
                      var16 = param5.field_C[var14];
                      var17 = param5.field_I[var14];
                      if (gk.field_g.length <= param5.field_c[var14]) {
                        stackOut_22_0 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        stackOut_21_0 = param5.field_c[var14];
                        stackIn_23_0 = stackOut_21_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_23_0;
                      if (param5.field_Q[var14] < gk.field_g.length) {
                        stackOut_25_0 = param5.field_Q[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_26_0;
                      if (gk.field_g.length <= param5.field_d[var14]) {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = param5.field_d[var14];
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_29_0;
                        if (null == oh.field_a) {
                          break L9;
                        } else {
                          if (param5.field_O == null) {
                            break L9;
                          } else {
                            if (var14 >= param5.field_O.length) {
                              break L9;
                            } else {
                              if (param5.field_O[var14] == -1) {
                                break L9;
                              } else {
                                if (oh.field_a.length <= param5.field_O[var14]) {
                                  break L9;
                                } else {
                                  stackOut_34_0 = oh.field_a[param5.field_O[var14]];
                                  stackIn_36_0 = stackOut_34_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_35_0 = null;
                      stackIn_36_0 = (ca) (Object) stackOut_35_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_36_0;
                        var22 = nl.field_A[var15];
                        var23 = d.field_c[var15];
                        var24 = nl.field_A[var16];
                        var25 = d.field_c[var16];
                        var26 = nl.field_A[var17];
                        var27 = d.field_c[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_45_0 = var21_ref.field_b;
                                stackIn_46_0 = stackOut_45_0;
                                break L12;
                              } else {
                                stackOut_44_0 = 8355711;
                                stackIn_46_0 = stackOut_44_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_46_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (16711720 & var32 * var28) >>> 8 | -486604545 & var28 * var31 >>> 8;
                            var33 = var33 + var29 * 65793;
                            pj.a(var25, 0, var22, var24, var27, (var33 & 16711422) >> 1, var26, var23);
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
                        if (var21_ref == null) {
                          stackOut_41_0 = 8355711;
                          stackIn_42_0 = stackOut_41_0;
                          break L13;
                        } else {
                          stackOut_40_0 = var21_ref.field_b;
                          stackIn_42_0 = stackOut_40_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_42_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 1006567679 & var35 * var28 >>> 8 | var36 * var28 >>> 8 & -402587904;
                      var38 = (-16711765 & var35 * var29) >>> 8 | (var36 * var29 & 16711734) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + var31 * 65793;
                      var39 = var30 * var35 >>> 8 & 1946091775 | var36 * var30 >>> 8 & -486473984;
                      var39 = var39 + var33 * 65793;
                      gk.a(var24, var23, var39 >> 16, var22, var37 >> 16, (65401 & var37) >> 8, (var38 & 65386) >> 8, var39 >> 8 & 255, var39 & 255, var38 & 255, var27, var26, -719, var38 >> 16, var25, 255 & var37);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var63[var13] + (var64[var13] * param2 - -(param4 * var65[var13])) >> 8;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_13_0 = 128;
                    stackIn_14_0 = stackOut_13_0;
                    break L15;
                  } else {
                    if (var14 >= 128) {
                      stackOut_12_0 = 256;
                      stackIn_14_0 = stackOut_12_0;
                      break L15;
                    } else {
                      stackOut_11_0 = 128 - -var14;
                      stackIn_14_0 = stackOut_11_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_14_0;
                  var15 = var65[var13] * param0 + param1 * var63[var13] - -(param7 * var64[var13]) >> 8;
                  stackOut_14_0 = qk.field_f;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (0 <= var15) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L16;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = -var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L16;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = var14 * (256 - var15) >>> 8;
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
            stackOut_49_0 = (RuntimeException) var8;
            stackOut_49_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(false).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static o[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = wizardrun.field_H;
        o[] var1 = new o[wb.field_f];
        for (var2 = 0; var2 < wb.field_f; var2++) {
            var3 = tf.field_b[var2] * cg.field_k[var2];
            var4 = mf.field_j[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ic.field_b[kl.b(255, (int) var4[var6])];
            }
            var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var5);
        }
        eb.a(0);
        return var1;
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        kh stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        kh stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0.length <= 136) {
                field_a = null;
                stackOut_6_0 = (byte[]) param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = new kh();
                ((dj) (Object) var3).a(param0, 121);
                stackOut_4_0 = (kh) var3;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("pi.B(");
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 0 + ',' + false + ')');
        }
        return (Object) (Object) stackIn_7_0;
    }

    public static void a(int param0) {
        if (param0 != 32348) {
            pi.a(98);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
