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
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ca stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        ca stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var40 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (var45.field_x == null) {
                  break L2;
                } else {
                  if (-2 <= (var45.field_n ^ -1)) {
                    break L2;
                  } else {
                    var61 = var45.field_x;
                    te.a((byte) -112, var61, t.field_a, 0, 0);
                    break L1;
                  }
                }
              }
              ia.b(0);
              break L1;
            }
            L3: {
              if (!param3) {
                break L3;
              } else {
                field_a = (String[]) null;
                break L3;
              }
            }
            var55 = new int[param5.field_y];
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var65 = new int[param5.field_y];
            var62 = gk.field_g;
            var63 = hb.field_o;
            var64 = bl.field_b;
            var13 = 0;
            L4: while (true) {
              if (param5.field_y <= var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= kg.field_c) {
                    break L0;
                  } else {
                    L6: {
                      var14 = cb.field_e[var44];
                      var15 = param5.field_p[var14];
                      var16 = param5.field_C[var14];
                      var17 = param5.field_I[var14];
                      if (gk.field_g.length <= param5.field_c[var14]) {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      } else {
                        stackOut_23_0 = param5.field_c[var14];
                        stackIn_25_0 = stackOut_23_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (param5.field_Q[var14] < gk.field_g.length) {
                        stackOut_27_0 = param5.field_Q[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L7;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (gk.field_g.length <= param5.field_d[var14]) {
                        stackOut_30_0 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        break L8;
                      } else {
                        stackOut_29_0 = param5.field_d[var14];
                        stackIn_31_0 = stackOut_29_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (null == oh.field_a) {
                          break L10;
                        } else {
                          if (param5.field_O == null) {
                            break L10;
                          } else {
                            if (var14 >= param5.field_O.length) {
                              break L10;
                            } else {
                              if (0 == (param5.field_O[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (oh.field_a.length <= param5.field_O[var14]) {
                                  break L10;
                                } else {
                                  stackOut_36_0 = oh.field_a[param5.field_O[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (ca) ((Object) stackOut_37_0);
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_38_0;
                        var22 = nl.field_A[var15];
                        var23 = d.field_c[var15];
                        var24 = nl.field_A[var16];
                        var25 = d.field_c[var16];
                        var26 = nl.field_A[var17];
                        var27 = d.field_c[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 == var20) {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21_ref != null) {
                                stackOut_47_0 = var21_ref.field_b;
                                stackIn_48_0 = stackOut_47_0;
                                break L13;
                              } else {
                                stackOut_46_0 = 8355711;
                                stackIn_48_0 = stackOut_46_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (16711720 & var32 * var28) >>> 1881586600 | -486604545 & var28 * var31 >>> -1044194744;
                            var33 = var33 + var29 * 65793;
                            pj.a(var25, 0, var22, var24, var27, (var33 & 16711422) >> -42153183, var26, var23);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21_ref == null) {
                          stackOut_43_0 = 8355711;
                          stackIn_44_0 = stackOut_43_0;
                          break L14;
                        } else {
                          stackOut_42_0 = var21_ref.field_b;
                          stackIn_44_0 = stackOut_42_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 1006567679 & var35 * var28 >>> 1174843016 | var36 * var28 >>> -431808024 & -402587904;
                      var38 = (-16711765 & var35 * var29) >>> 1634743112 | (var36 * var29 & 16711734) >>> 752416712;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + var31 * 65793;
                      var39 = var30 * var35 >>> 254629032 & 1946091775 | var36 * var30 >>> -756146104 & -486473984;
                      var39 = var39 + var33 * 65793;
                      gk.a(var24, var23, var39 >> 1999477584, var22, var37 >> -1546153520, (65401 & var37) >> -505338168, (var38 & 65386) >> 163685288, var39 >> -1884321496 & 255, var39 & 255, var38 & 255, var27, var26, -719, var38 >> -1574462704, var25, 255 & var37);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param6 * var62[var13] + (var63[var13] * param2 - -(param4 * var64[var13])) >> -1992947672;
                  if (var14 >= 0) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (var14 < 0) {
                    stackOut_15_0 = 128;
                    stackIn_16_0 = stackOut_15_0;
                    break L16;
                  } else {
                    if (var14 >= 128) {
                      stackOut_14_0 = 256;
                      stackIn_16_0 = stackOut_14_0;
                      break L16;
                    } else {
                      stackOut_13_0 = 128 - -var14;
                      stackIn_16_0 = stackOut_13_0;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_16_0;
                  var15 = var64[var13] * param0 + param1 * var62[var13] - -(param7 * var63[var13]) >> 234490728;
                  stackOut_16_0 = qk.field_f;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (0 <= var15) {
                    stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                    stackOut_18_1 = var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L17;
                  } else {
                    stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = -var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L17;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (256 - var15) >>> -541425240;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var8);
            stackOut_51_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param5 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param6 + ',' + param7 + ')');
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
        for (var2 = param0; var2 < wb.field_f; var2++) {
            var3 = tf.field_b[var2] * cg.field_k[var2];
            var4 = mf.field_j[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ic.field_b[kl.b(255, (int) var4[var6])];
            }
            var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var5);
        }
        eb.a(param0 ^ 0);
        return var1;
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        kh stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_9_0 = null;
        kh stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              if (-137 <= (param0.length ^ -1)) {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    field_a = (String[]) null;
                    break L1;
                  }
                }
                if (param2) {
                  stackOut_11_0 = vg.a(param0, -125);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = (byte[]) (param0);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = new kh();
                ((dj) ((Object) var3)).a(param0, 121);
                stackOut_4_0 = (kh) (var3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("pi.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 32348) {
            pi.a(98);
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
