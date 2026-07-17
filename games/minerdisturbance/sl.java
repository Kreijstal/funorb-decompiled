/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pi {
    int field_p;
    static we field_q;
    int field_o;
    int field_n;
    int field_r;
    static String[][] field_u;
    int field_t;
    int field_s;
    static String field_v;

    final static void a(int param0, int param1, int param2, int param3, pb param4, int param5, int param6, int param7) {
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
        ud var21_ref = null;
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
        pb var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ud stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        short stackOut_31_0 = 0;
        ud stackOut_38_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_x == null) {
                  break L2;
                } else {
                  if (1 < var45.field_E) {
                    var62 = var45.field_x;
                    re.a(0, var62, di.field_V, 0, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              wc.c((byte) -29);
              break L1;
            }
            L3: {
              var66 = new int[param4.field_g];
              var60 = var66;
              var55 = var60;
              var50 = var55;
              var41 = var50;
              var8_array = var41;
              var67 = new int[param4.field_g];
              var64 = fb.field_b;
              if (param0 == -1) {
                break L3;
              } else {
                vi discarded$1 = sl.e(-76);
                break L3;
              }
            }
            var65 = sf.field_a;
            var63 = h.field_a;
            var13 = 0;
            L4: while (true) {
              if (param4.field_g <= var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (ik.field_T <= var44) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ta.field_d[var44];
                      var15 = param4.field_e[var14];
                      var16 = param4.field_O[var14];
                      var17 = param4.field_F[var14];
                      if (param4.field_f[var14] >= fb.field_b.length) {
                        stackOut_26_0 = -1;
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = param4.field_f[var14];
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (param4.field_w[var14] >= fb.field_b.length) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = param4.field_w[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (fb.field_b.length <= param4.field_d[var14]) {
                        stackOut_32_0 = -1;
                        stackIn_33_0 = stackOut_32_0;
                        break L8;
                      } else {
                        stackOut_31_0 = param4.field_d[var14];
                        stackIn_33_0 = stackOut_31_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (bl.field_v == null) {
                          break L10;
                        } else {
                          if (null == param4.field_G) {
                            break L10;
                          } else {
                            if (var14 >= param4.field_G.length) {
                              break L10;
                            } else {
                              if (param4.field_G[var14] == -1) {
                                break L10;
                              } else {
                                if (param4.field_G[var14] >= bl.field_v.length) {
                                  break L10;
                                } else {
                                  stackOut_38_0 = bl.field_v[param4.field_G[var14]];
                                  stackIn_40_0 = stackOut_38_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = (ud) (Object) stackOut_39_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_40_0;
                        var22 = wa.field_d[var15];
                        var23 = ti.field_O[var15];
                        var24 = wa.field_d[var16];
                        var25 = ti.field_O[var16];
                        var26 = wa.field_d[var17];
                        var27 = ti.field_O[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_44_0 = 8355711;
                                stackIn_45_0 = stackOut_44_0;
                                break L13;
                              } else {
                                stackOut_43_0 = var21_ref.field_d;
                                stackIn_45_0 = stackOut_43_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_45_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (var28 * var31 & -16711816) >>> 8 | (var28 * var32 & 16711867) >>> 8;
                            var33 = var33 + var29 * 65793;
                            cn.a(var27, ~param0, var22, var25, var26, var23, var24, (16711422 & var33) >> 1);
                            break L11;
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
                          stackOut_48_0 = var21_ref.field_d;
                          stackIn_49_0 = stackOut_48_0;
                          break L14;
                        } else {
                          stackOut_47_0 = 8355711;
                          stackIn_49_0 = stackOut_47_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_49_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (var28 * var35 & -16711787) >>> 8 | 2013331200 & var28 * var36 >>> 8;
                      var38 = var29 * var35 >>> 8 & -2113994497 | (16711884 & var36 * var29) >>> 8;
                      var39 = -234815744 & var36 * var30 >>> 8 | 402587903 & var35 * var30 >>> 8;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + 65793 * var33;
                      pd.a(var38 >> 16, var27, var38 & 255, (var37 & 65456) >> 8, var39 >> 8 & 255, var37 >> 16, var24, var22, var23, (byte) -60, var39 & 255, 255 & var37, var26, var25, var39 >> 16, (var38 & 65441) >> 8);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param6 * var63[var13] + param3 * var64[var13] - -(param1 * var65[var13]) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var14 >= 0) {
                    if (var14 >= 128) {
                      stackOut_17_0 = 256;
                      stackIn_18_0 = stackOut_17_0;
                      break L16;
                    } else {
                      stackOut_16_0 = var14 + 128;
                      stackIn_18_0 = stackOut_16_0;
                      break L16;
                    }
                  } else {
                    stackOut_14_0 = 128;
                    stackIn_18_0 = stackOut_14_0;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = param5 * var65[var13] + param2 * var64[var13] - -(var63[var13] * param7) >> 8;
                  stackOut_18_0 = w.field_R;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var15 >= 0) {
                    stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                    stackOut_20_1 = var15;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L17;
                  } else {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = -var15;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (-var15 + 256) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("sl.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_q = null;
        field_v = null;
        if (param0 != -3035) {
            field_v = null;
        }
    }

    final static vi e(int param0) {
        if (!(cn.field_v != null)) {
            cn.field_v = new vi();
            cn.field_v.a(65793, bn.field_d);
            cn.field_v.field_n = 14;
            cn.field_v.field_i = 0;
            cn.field_v.field_l = 4;
            cn.field_v.field_r = 6;
            cn.field_v.field_g = 7697781;
            cn.field_v.field_k = 2763306;
            cn.field_v.field_p = field_q;
            cn.field_v.field_d = 5;
        }
        if (param0 <= 91) {
            Object var2 = null;
            sl.a(24, -111, 101, 55, (pb) null, -25, -121, -35);
        }
        return cn.field_v;
    }

    final static hn a(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hn stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hn stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param0 == 86) {
                break L1;
              } else {
                vi discarded$2 = sl.e(78);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var7 = (CharSequence) (Object) param1;
                var4_long = ah.a(-97, var7);
                break L2;
              } else {
                var6 = (Object) (Object) param1;
                break L2;
              }
            }
            stackOut_5_0 = qg.a(var4_long, param2, 0, (String) var6, false);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("sl.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        return stackIn_6_0;
    }

    sl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((sl) this).field_t = param2;
        ((sl) this).field_s = param3;
        ((sl) this).field_p = param1;
        ((sl) this).field_o = param5;
        ((sl) this).field_n = param0;
        ((sl) this).field_r = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[][]{new String[10], new String[9], new String[7], new String[10], new String[7], new String[9], new String[12], new String[9], new String[11], new String[7], new String[9], new String[9], new String[7], new String[7], new String[6]};
        field_v = "Type your password again to make sure it's correct";
    }
}
