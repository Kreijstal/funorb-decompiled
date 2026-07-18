/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static kk field_b;
    ga field_g;
    static String field_a;
    static hh field_j;
    ga field_e;
    ga field_k;
    ga field_c;
    ga field_d;
    ga field_i;
    ga field_f;
    static boolean field_h;

    final static void b() {
        if (!(bo.field_F == null)) {
            bo.field_F.p(0);
        }
        if (!(jb.field_r == null)) {
            jb.field_r.d(true);
        }
        int discarded$0 = 0;
        dl.a();
    }

    final static void a(int param0, int[] param1, int[] param2) {
        try {
            gi.a(-1 + param1.length, param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "uk.B(" + -1 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ia param5, int param6, int param7) {
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
        ui var21_ref = null;
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
        ia var45 = null;
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
        ui stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        ui stackOut_39_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var40 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (var45.field_n == null) {
                  break L2;
                } else {
                  if (var45.field_I <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_n;
                    g.a(var62, 0, ul.field_I, 114, 0);
                    break L1;
                  }
                }
              }
              int discarded$1 = 46;
              od.f();
              break L1;
            }
            var66 = new int[param5.field_M];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param5.field_M];
            var64 = oi.field_L;
            var65 = df.field_f;
            var63 = oe.field_xb;
            var13 = 0;
            L3: while (true) {
              if (param5.field_M <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= aj.field_d) {
                    break L0;
                  } else {
                    L5: {
                      var14 = bc.field_f[var44];
                      var15 = param5.field_e[var14];
                      var16 = param5.field_o[var14];
                      var17 = param5.field_f[var14];
                      if (param5.field_h[var14] >= oi.field_L.length) {
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_24_0 = param5.field_h[var14];
                        stackIn_26_0 = stackOut_24_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_26_0;
                      if (param5.field_u[var14] >= oi.field_L.length) {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        break L6;
                      } else {
                        stackOut_27_0 = param5.field_u[var14];
                        stackIn_29_0 = stackOut_27_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_29_0;
                      if (param5.field_j[var14] < oi.field_L.length) {
                        stackOut_31_0 = param5.field_j[var14];
                        stackIn_32_0 = stackOut_31_0;
                        break L7;
                      } else {
                        stackOut_30_0 = -1;
                        stackIn_32_0 = stackOut_30_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_32_0;
                        if (tj.field_y == null) {
                          break L9;
                        } else {
                          if (param5.field_m == null) {
                            break L9;
                          } else {
                            if (var14 >= param5.field_m.length) {
                              break L9;
                            } else {
                              if (param5.field_m[var14] == -1) {
                                break L9;
                              } else {
                                if (param5.field_m[var14] < tj.field_y.length) {
                                  stackOut_39_0 = tj.field_y[param5.field_m[var14]];
                                  stackIn_40_0 = stackOut_39_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_40_0 = (ui) (Object) stackOut_38_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_40_0;
                        var22 = on.field_g[var15];
                        var23 = ni.field_D[var15];
                        var24 = on.field_g[var16];
                        var25 = ni.field_D[var16];
                        var26 = on.field_g[var17];
                        var27 = ni.field_D[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_49_0 = 8355711;
                                stackIn_50_0 = stackOut_49_0;
                                break L12;
                              } else {
                                stackOut_48_0 = var21_ref.field_c;
                                stackIn_50_0 = stackOut_48_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_50_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var32 * var28 >>> 8 & -805241088 | -2030108417 & var31 * var28 >>> 8;
                            var33 = var33 + 65793 * var29;
                            rc.a(var26, var22, var27, var33 >> 1 & 8355711, true, var23, var24, var25);
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
                          stackOut_45_0 = 8355711;
                          stackIn_46_0 = stackOut_45_0;
                          break L13;
                        } else {
                          stackOut_44_0 = var21_ref.field_c;
                          stackIn_46_0 = stackOut_44_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_46_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = (var28 * var36 & 16711908) >>> 8 | var28 * var35 >>> 8 & 1090453759;
                      var38 = (16711930 & var29 * var36) >>> 8 | -1778450177 & var35 * var29 >>> 8;
                      var37 = var37 + 65793 * var31;
                      var39 = (16711870 & var30 * var36) >>> 8 | (var35 * var30 & -16711760) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var39 = var39 + 65793 * var33;
                      ei.a(var24, var23, var22, 255 & var39 >> 8, var38 >> 16, var27, var39 >> 16, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 16, var38 & 255, (var37 & 65293) >> 8, 255 & var38 >> 8);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var63[var13] + param2 * var64[var13] - -(param7 * var65[var13]) >> 8;
                  if (0 > var14) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L15;
                  } else {
                    if (128 <= var14) {
                      stackOut_15_0 = 256;
                      stackIn_17_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 128 + var14;
                      stackIn_17_0 = stackOut_14_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_17_0;
                  var15 = param4 * var63[var13] + var64[var13] * param3 - -(param0 * var65[var13]) >> 8;
                  stackOut_17_0 = pb.field_c;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var15 < 0) {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = -var15;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L16;
                  } else {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = var15;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L16;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
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
            stackOut_53_0 = (RuntimeException) var8;
            stackOut_53_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(-16711760).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw t.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    uk() {
        ((uk) this).field_e = new ga(0, 0);
        ((uk) this).field_g = new ga(0, 0);
        ((uk) this).field_c = new ga(0, 0);
        ((uk) this).field_d = new ga(0, 0);
        ((uk) this).field_k = new ga(0, 0);
        ((uk) this).field_f = new ga(0, 0);
        ((uk) this).field_i = new ga(0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Score: ";
        field_h = false;
    }
}
