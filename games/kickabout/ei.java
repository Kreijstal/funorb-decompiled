/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements gj {
    private hu field_k;
    static String field_c;
    static boolean field_n;
    static String field_f;
    private int field_i;
    private int field_h;
    static int field_e;
    static hd field_b;
    private int field_a;
    private int field_g;
    private int field_l;
    static al field_d;
    private int field_j;
    private int field_m;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        s var15 = null;
        fd stackIn_3_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        fd stackOut_1_0 = null;
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
              if (!(param3 instanceof s)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (fd) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (fd) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (s) (Object) stackIn_3_0;
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              on.a(param4 + param3.field_t, param2 - -param3.field_g, param3.field_n, param3.field_i, ((ei) this).field_m);
              var7 = param4 + (param3.field_t - -var15.field_H);
              var8 = param3.field_g + (param2 - -var15.field_G);
              on.d(var7, var8, var15.field_J, ((ei) this).field_i);
              var12 = -80 % ((59 - param0) / 53);
              if (var15.field_I == -1) {
                break L3;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var15.field_I) / (double)var15.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
                var13 = (int)(Math.cos(var9) * (double)var15.field_J);
                on.d(var11 + var7, var13 + var8, 1, ((ei) this).field_g);
                break L3;
              }
            }
            L4: {
              on.d(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var15.field_L) / (double)var15.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
              var13 = (int)(Math.cos(var9) * (double)var15.field_J);
              on.b(var7, var8, var11 + var7, var13 + var8, 1);
              if (((ei) this).field_k != null) {
                var14 = ((ei) this).field_h + (var15.field_J + var15.field_H);
                int discarded$1 = ((ei) this).field_k.a(param3.field_q, param4 - (-param3.field_t - var14), param2 + (param3.field_g - -((ei) this).field_a), -var14 + -((ei) this).field_h + param3.field_n, param3.field_i + -(((ei) this).field_h << 1), ((ei) this).field_l, ((ei) this).field_j, 1, 1, 0);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, kk param6, int param7) {
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
        gf var21_ref = null;
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
        kk var45 = null;
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
        gf stackIn_37_0 = null;
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
        int stackOut_22_0 = 0;
        short stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        gf stackOut_36_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var40 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param6;
                if (null == var45.field_G) {
                  break L2;
                } else {
                  if (1 >= var45.field_u) {
                    break L2;
                  } else {
                    var62 = var45.field_G;
                    th.a(0, 0, var62, vu.field_zb, 0);
                    break L1;
                  }
                }
              }
              or.b(false);
              break L1;
            }
            var66 = new int[param6.field_k];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param6.field_k];
            var64 = pv.field_F;
            var65 = ba.field_q;
            var63 = el.field_E;
            var13 = 0;
            L3: while (true) {
              if (~param6.field_k >= ~var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= sp.field_Ob) {
                    break L0;
                  } else {
                    L5: {
                      var14 = nb.field_e[var44];
                      var15 = param6.field_n[var14];
                      var16 = param6.field_z[var14];
                      var17 = param6.field_T[var14];
                      if (~pv.field_F.length >= ~param6.field_M[var14]) {
                        stackOut_22_0 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        stackOut_21_0 = param6.field_M[var14];
                        stackIn_23_0 = stackOut_21_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_23_0;
                      if (param6.field_U[var14] >= pv.field_F.length) {
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = param6.field_U[var14];
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_26_0;
                      if (param6.field_l[var14] >= pv.field_F.length) {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = param6.field_l[var14];
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_29_0;
                        if (sq.field_H == null) {
                          break L9;
                        } else {
                          if (null == param6.field_o) {
                            break L9;
                          } else {
                            if (param6.field_o.length <= var14) {
                              break L9;
                            } else {
                              if (-1 == param6.field_o[var14]) {
                                break L9;
                              } else {
                                if (param6.field_o[var14] < sq.field_H.length) {
                                  stackOut_36_0 = sq.field_H[param6.field_o[var14]];
                                  stackIn_37_0 = stackOut_36_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_35_0 = null;
                      stackIn_37_0 = (gf) (Object) stackOut_35_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_37_0;
                        var22 = fb.field_M[var15];
                        var23 = fk.field_k[var15];
                        var24 = fb.field_M[var16];
                        var25 = fk.field_k[var16];
                        var26 = fb.field_M[var17];
                        var27 = fk.field_k[var17];
                        if (~var18 != ~var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_46_0 = var21_ref.field_g;
                                stackIn_47_0 = stackOut_46_0;
                                break L12;
                              } else {
                                stackOut_45_0 = 8355711;
                                stackIn_47_0 = stackOut_45_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_47_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = var28 * var31 >>> 8 & -671153921 | -1090453760 & var28 * var32 >>> 8;
                            var33 = var33 + var29 * 65793;
                            lw.a(var23, var27, var25, (byte) -56, var22, var24, var26, (var33 & 16711422) >> 1);
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
                          stackOut_42_0 = var21_ref.field_g;
                          stackIn_43_0 = stackOut_42_0;
                          break L13;
                        } else {
                          stackOut_41_0 = 8355711;
                          stackIn_43_0 = stackOut_41_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_43_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (var28 * var35 & -16711794) >>> 8 | (var28 * var36 & 16711732) >>> 8;
                      var38 = var35 * var29 >>> 8 & -335609601 | (var36 * var29 & 16711773) >>> 8;
                      var39 = (16711933 & var36 * var30) >>> 8 | (-16711773 & var35 * var30) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + 65793 * var33;
                      os.a(var26, (var38 & 65313) >> 8, var25, (65336 & var37) >> 8, var37 & 255, 255 & var39, (var39 & 65385) >> 8, var37 >> 16, var38 >> 16, var38 & 255, var24, var39 >> 16, var23, -15343, var27, var22);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param3 * var63[var13] + (var64[var13] * param1 - -(param0 * var65[var13])) >> 8;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (0 > var14) {
                    stackOut_13_0 = 128;
                    stackIn_14_0 = stackOut_13_0;
                    break L15;
                  } else {
                    if (var14 >= 128) {
                      stackOut_12_0 = 256;
                      stackIn_14_0 = stackOut_12_0;
                      break L15;
                    } else {
                      stackOut_11_0 = 128 + var14;
                      stackIn_14_0 = stackOut_11_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_14_0;
                  var15 = param4 * var65[var13] + param2 * var64[var13] - -(var63[var13] * param7) >> 8;
                  stackOut_14_0 = mr.field_Y;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var15 < 0) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L16;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L16;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = var14 * (-var15 + 256) >>> 8;
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
            stackOut_50_1 = new StringBuilder().append("ei.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(-125).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param6 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -23) {
            field_f = null;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
            return param0 < 6144 ? -mg.field_b[param0 - 4096] : -mg.field_b[8192 - param0];
        }
        return param0 >= 2048 ? mg.field_b[-param0 + 4096] : mg.field_b[param0];
    }

    ei(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ei) this).field_g = param6;
            ((ei) this).field_j = param4;
            ((ei) this).field_l = param3;
            ((ei) this).field_m = param7;
            ((ei) this).field_h = param1;
            ((ei) this).field_a = param2;
            ((ei) this).field_i = param5;
            ((ei) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        er.a((byte) 71, param0);
        if (!(null == sn.field_e)) {
            ar.a(15707, sn.field_e);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0>%";
        field_f = "Previous";
        field_n = true;
    }
}
