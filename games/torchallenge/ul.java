/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends da {
    static ka field_k;
    static int field_j;
    static int field_l;
    static int field_n;
    static int field_m;
    int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, vg param5, int param6, int param7) {
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
        ti var21_ref = null;
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
        ti stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        ti stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var40 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_z) {
                  break L2;
                } else {
                  if (1 >= var45.field_s) {
                    break L2;
                  } else {
                    var62 = var45.field_z;
                    mh.a(0, var62, m.field_i, 0, false);
                    break L1;
                  }
                }
              }
              db.j(2);
              break L1;
            }
            var66 = new int[param5.field_c];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param5.field_c];
            var64 = sj.field_S;
            var65 = kl.field_b;
            var63 = kd.field_o;
            var13 = 0;
            L3: while (true) {
              if (param5.field_c <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= ni.field_f) {
                    break L0;
                  } else {
                    L5: {
                      var14 = k.field_e[var44];
                      var15 = param5.field_i[var14];
                      var16 = param5.field_w[var14];
                      var17 = param5.field_F[var14];
                      if (param5.field_f[var14] < sj.field_S.length) {
                        stackOut_23_0 = param5.field_f[var14];
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
                      if (param5.field_k[var14] >= sj.field_S.length) {
                        stackOut_26_0 = -1;
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = param5.field_k[var14];
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (sj.field_S.length <= param5.field_G[var14]) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = param5.field_G[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (null == ll.field_h) {
                          break L9;
                        } else {
                          if (null == param5.field_M) {
                            break L9;
                          } else {
                            if (param5.field_M.length <= var14) {
                              break L9;
                            } else {
                              if (-1 == param5.field_M[var14]) {
                                break L9;
                              } else {
                                if (param5.field_M[var14] < ll.field_h.length) {
                                  stackOut_37_0 = ll.field_h[param5.field_M[var14]];
                                  stackIn_38_0 = stackOut_37_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = null;
                      stackIn_38_0 = (ti) (Object) stackOut_36_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = tj.field_a[var15];
                        var23 = si.field_K[var15];
                        var24 = tj.field_a[var16];
                        var25 = si.field_K[var16];
                        var26 = tj.field_a[var17];
                        var27 = si.field_K[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_47_0 = 8355711;
                                stackIn_48_0 = stackOut_47_0;
                                break L12;
                              } else {
                                stackOut_46_0 = var21_ref.field_b;
                                stackIn_48_0 = stackOut_46_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = (-16711691 & var28 * var31) >>> 8 | (var28 * var32 & 16711883) >>> 8;
                            var33 = var33 + 65793 * var29;
                            aa.a(var24, var22, var26, 8355711 & var33 >> 1, var27, 0, var23, var25);
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
                          stackOut_43_0 = 8355711;
                          stackIn_44_0 = stackOut_43_0;
                          break L13;
                        } else {
                          stackOut_42_0 = var21_ref.field_b;
                          stackIn_44_0 = stackOut_42_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = var28 * var35 >>> 8 & 587137279 | (var28 * var36 & 16711859) >>> 8;
                      var38 = -771817217 & var35 * var29 >>> 8 | (16711855 & var36 * var29) >>> 8;
                      var38 = var38 + var32 * 65793;
                      var39 = -1375666432 & var30 * var36 >>> 8 | (var30 * var35 & -16711780) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = var39 + var33 * 65793;
                      vi.a(var38 >> 16, var37 >> 16, var26, var24, (var39 & 65303) >> 8, var38 & 255, var23, var25, var39 >> 16, 255 & var37 >> 8, var37 & 255, var27, 255 & var39, 0, var22, (65338 & var38) >> 8);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var63[var13] * param6 + (param0 * var64[var13] - -(var65[var13] * param1)) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 >= 0) {
                    if (var14 >= 128) {
                      stackOut_14_0 = 256;
                      stackIn_15_0 = stackOut_14_0;
                      break L15;
                    } else {
                      stackOut_13_0 = 128 + var14;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    }
                  } else {
                    stackOut_11_0 = 128;
                    stackIn_15_0 = stackOut_11_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = var63[var13] * param3 + param4 * var64[var13] - -(var65[var13] * param2) >> 8;
                  stackOut_15_0 = ch.field_b;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (0 > var15) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (-var15 + 256) * var14 >>> 8;
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
            stackOut_53_0 = (RuntimeException) var8;
            stackOut_53_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param6 + ',' + -16711780 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
    }

    final static void a(int param0, ji param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        pa var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var7 = dk.field_s;
            var8 = var7;
            var8.d(25, param2);
            var8.field_q = var8.field_q + 1;
            var4 = var8.field_q;
            var8.d(1, (byte) 122);
            var8.a(param1.field_l, (byte) 106);
            var8.a(param1.field_o, (byte) 106);
            var8.a(param1.field_t, (byte) 106);
            var8.a(param1.field_s, false);
            var8.a(param1.field_i, false);
            var8.a(param1.field_v, false);
            var8.a(param1.field_j, false);
            var8.d(param1.field_w.length, (byte) 122);
            var5 = 0;
            L1: while (true) {
              if (param1.field_w.length <= var5) {
                int discarded$1 = var8.b(var4, 14430);
                var8.a(var8.field_q + -var4, -120);
                break L0;
              } else {
                var7.a(param1.field_w[var5], false);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ul.F(").append(-18261).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        kl.field_e = of.b(-54);
        t.field_b = new si();
        ee.a(true, 1, true);
    }

    final static boolean a(int param0) {
        return wf.field_i.a(-11982);
    }

    final static void a(lj param0, int param1, lj param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            sf.field_a = param2;
            fd.field_c = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ul.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-1656370552).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    ul(int param0) {
        ((ul) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ka(270, 70);
        field_j = -1;
        field_n = -1;
        field_m = 0;
        field_l = 64;
    }
}
