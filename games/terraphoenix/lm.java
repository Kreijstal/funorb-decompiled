/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_f;
    static int field_d;
    static bg field_g;
    static int[] field_a;
    static int field_c;
    static ci field_e;
    static int field_b;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final static void a(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        dj var21_ref = null;
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
        ee var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        dj stackIn_38_0 = null;
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
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        dj stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
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
        var40 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param0;
                if (var45.field_f == null) {
                  break L2;
                } else {
                  if (var45.field_I > 1) {
                    var62 = var45.field_f;
                    hk.a(0, -57, var62, 0, dk.field_c);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              th.a(true);
              break L1;
            }
            var66 = new int[param0.field_o];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param0.field_o];
            var64 = ph.field_m;
            var63 = k.field_e;
            var65 = mg.field_p;
            var13 = 0;
            L3: while (true) {
              if (param0.field_o <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (~ae.field_I >= ~var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = qh.field_c[var44];
                      var15 = param0.field_E[var14];
                      var16 = param0.field_n[var14];
                      var17 = param0.field_p[var14];
                      if (~ph.field_m.length < ~param0.field_C[var14]) {
                        stackOut_24_0 = param0.field_C[var14];
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (~ph.field_m.length < ~param0.field_k[var14]) {
                        stackOut_27_0 = param0.field_k[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (ph.field_m.length <= param0.field_g[var14]) {
                        stackOut_30_0 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = param0.field_g[var14];
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (qk.field_l == null) {
                          break L9;
                        } else {
                          if (param0.field_x == null) {
                            break L9;
                          } else {
                            if (param0.field_x.length <= var14) {
                              break L9;
                            } else {
                              if (param0.field_x[var14] == -1) {
                                break L9;
                              } else {
                                if (~param0.field_x[var14] <= ~qk.field_l.length) {
                                  break L9;
                                } else {
                                  stackOut_36_0 = qk.field_l[param0.field_x[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (dj) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = gm.field_l[var15];
                        var23 = nb.field_c[var15];
                        var24 = gm.field_l[var16];
                        var25 = nb.field_c[var16];
                        var26 = gm.field_l[var17];
                        var27 = nb.field_c[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_47_0 = var21_ref.field_b;
                                stackIn_48_0 = stackOut_47_0;
                                break L12;
                              } else {
                                stackOut_46_0 = 8355711;
                                stackIn_48_0 = stackOut_46_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (var28 * var31 & -16711701) >>> 8 | (16711762 & var32 * var28) >>> 8;
                            var33 = var33 + 65793 * var29;
                            ag.a(var24, var25, var22, var23, 29842, var33 >> 1 & 8355711, var27, var26);
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
                          stackOut_43_0 = var21_ref.field_b;
                          stackIn_44_0 = stackOut_43_0;
                          break L13;
                        } else {
                          stackOut_42_0 = 8355711;
                          stackIn_44_0 = stackOut_42_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = -1879113473 & var35 * var28 >>> 8 | (16711910 & var36 * var28) >>> 8;
                      var38 = -318832385 & var35 * var29 >>> 8 | var36 * var29 >>> 8 & 1375796992;
                      var38 = var38 + var32 * 65793;
                      var39 = (var35 * var30 & -16711875) >>> 8 | 100728576 & var36 * var30 >>> 8;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + var33 * 65793;
                      ak.a(255 & var39, var39 >> 16, (var37 & 65286) >> 8, (var39 & 65475) >> 8, var23, (byte) 116, var24, var22, var27, 255 & var37, var38 & 255, var38 >> 16, var26, 255 & var38 >> 8, var25, var37 >> 16);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var63[var13] + (var64[var13] * param2 - -(var65[var13] * param4)) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 >= 0) {
                    if (var14 < 128) {
                      stackOut_15_0 = 128 + var14;
                      stackIn_16_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_16_0 = stackOut_14_0;
                      break L15;
                    }
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_16_0 = stackOut_12_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_16_0;
                  var15 = var63[var13] * param1 + (param3 * var64[var13] - -(var65[var13] * param7)) >> 8;
                  stackOut_16_0 = me.field_m;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var15 < 0) {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = -var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L16;
                  } else {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L16;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
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
            stackOut_51_0 = (RuntimeException) var8;
            stackOut_51_1 = new StringBuilder().append("lm.C(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + 0 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var9_int = param6 + param2.field_p + param0;
            var10 = param6 + param0 + (param2.field_p + 30);
            var11 = (param2.field_t >> 1) + param2.field_v + param5;
            l.i(var9_int, 0, var10, var11);
            param2.d(-1 + param0, param5 - 1, 80);
            param2.d(param0 - 1, param5 + 1, 80);
            l.a(rb.field_a);
            l.i(1 + var9_int, 0, var10 + 1, var11);
            param2.d(param0 + 1, -1 + param5, 80);
            param2.d(param0 - -1, param5 + 1, 80);
            l.a(rb.field_a);
            var9_int = -30 + -param6 + (param0 + param2.field_p) + param2.field_r;
            var10 = -param6 + (param2.field_r + param2.field_p + param0);
            l.i(var9_int, var11, var10, 480);
            param2.d(-1 + param0, param5 + -1, 80);
            param2.d(param0 - 1, param5 + 1, 80);
            l.a(rb.field_a);
            l.i(1 + var9_int, var11, var10 + 1, 480);
            param2.d(param0 - -1, param5 + -1, 80);
            param2.d(1 + param0, param5 + 1, 80);
            l.a(rb.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("lm.A(").append(param0).append(',').append(30).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 0 + ',' + 126 + ',' + param5 + ',' + param6 + ',' + 0 + ',' + 80 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Clipsize: ";
        field_a = new int[8192];
        field_c = 0;
    }
}
