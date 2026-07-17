/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class rc extends le {
    int field_o;
    int field_t;
    static sm field_h;
    int field_l;
    int field_i;
    int field_q;
    static String field_r;
    long field_s;
    int field_m;
    int field_n;
    static String field_j;
    static vn field_v;
    static int field_p;
    static String field_w;
    int[] field_k;
    static int[] field_u;
    static int field_x;

    final static void a(byte param0, int param1, int param2, gd param3, int param4, int param5, int param6, int param7) {
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
        f var21_ref = null;
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
        gd var45 = null;
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
        f stackIn_41_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        short stackOut_31_0 = 0;
        f stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var40 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param3;
                if (null == var45.field_F) {
                  break L2;
                } else {
                  if (var45.field_p > 1) {
                    var62 = var45.field_F;
                    ke.a(0, 0, jp.field_f, var62, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qc.a(1);
              break L1;
            }
            L3: {
              if (param0 < -67) {
                break L3;
              } else {
                rc.a(-5);
                break L3;
              }
            }
            var66 = new int[param3.field_f];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param3.field_f];
            var64 = og.field_y;
            var65 = jl.field_s;
            var63 = qb.field_c;
            var13 = 0;
            L4: while (true) {
              if (~param3.field_f >= ~var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (eh.field_A <= var44) {
                    break L0;
                  } else {
                    L6: {
                      var14 = uf.field_o[var44];
                      var15 = param3.field_g[var14];
                      var16 = param3.field_H[var14];
                      var17 = param3.field_r[var14];
                      if (param3.field_O[var14] < og.field_y.length) {
                        stackOut_26_0 = param3.field_O[var14];
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (og.field_y.length > param3.field_n[var14]) {
                        stackOut_29_0 = param3.field_n[var14];
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = -1;
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (og.field_y.length <= param3.field_v[var14]) {
                        stackOut_32_0 = -1;
                        stackIn_33_0 = stackOut_32_0;
                        break L8;
                      } else {
                        stackOut_31_0 = param3.field_v[var14];
                        stackIn_33_0 = stackOut_31_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (null == ag.field_a) {
                          break L10;
                        } else {
                          if (param3.field_x == null) {
                            break L10;
                          } else {
                            if (param3.field_x.length <= var14) {
                              break L10;
                            } else {
                              if (param3.field_x[var14] == -1) {
                                break L10;
                              } else {
                                if (~param3.field_x[var14] > ~ag.field_a.length) {
                                  stackOut_40_0 = ag.field_a[param3.field_x[var14]];
                                  stackIn_41_0 = stackOut_40_0;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_41_0 = (f) (Object) stackOut_39_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_41_0;
                        var22 = to.field_a[var15];
                        var23 = wc.field_Nb[var15];
                        var24 = to.field_a[var16];
                        var25 = wc.field_Nb[var16];
                        var26 = to.field_a[var17];
                        var27 = wc.field_Nb[var17];
                        if (~var18 != ~var19) {
                          break L12;
                        } else {
                          if (~var19 == ~var20) {
                            L13: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_50_0 = var21_ref.field_h;
                                stackIn_51_0 = stackOut_50_0;
                                break L13;
                              } else {
                                stackOut_49_0 = 8355711;
                                stackIn_51_0 = stackOut_49_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_51_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var32 * var28 & 16711929) >>> 8 | (-16711868 & var31 * var28) >>> 8;
                            var33 = var33 + var29 * 65793;
                            fp.a(var22, var27, var24, var33 >> 1 & 8355711, var25, var23, var26, (byte) 75);
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
                        if (var21_ref == null) {
                          stackOut_46_0 = 8355711;
                          stackIn_47_0 = stackOut_46_0;
                          break L14;
                        } else {
                          stackOut_45_0 = var21_ref.field_h;
                          stackIn_47_0 = stackOut_45_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (16711863 & var28 * var36) >>> 8 | var28 * var35 >>> 8 & -1090584321;
                      var38 = var29 * var35 >>> 8 & 1056899327 | var29 * var36 >>> 8 & 218169088;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var30 * var36 >>> 8 & 2013331200 | (-16711925 & var35 * var30) >>> 8;
                      var39 = var39 + 65793 * var33;
                      se.a(false, var22, 255 & var37, var38 & 255, var25, var38 >> 16, var37 >> 16, (var39 & 65350) >> 8, var39 & 255, var37 >> 8 & 255, var24, var39 >> 16, 255 & var38 >> 8, var23, var27, var26);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param6 * var63[var13] + (param4 * var64[var13] + param5 * var65[var13]) >> 8;
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
                      stackOut_16_0 = 128 + var14;
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
                  var15 = param1 * var63[var13] + (param2 * var65[var13] + var64[var13] * param7) >> 8;
                  stackOut_18_0 = jj.field_H;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var15 < 0) {
                    stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                    stackOut_20_1 = -var15;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L17;
                  } else {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = var15;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (256 + -var15) >>> 8;
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
            stackOut_54_0 = (RuntimeException) var8;
            stackOut_54_1 = new StringBuilder().append("rc.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L18;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L18;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (param0 == -1) {
                break L1;
              } else {
                rc.a(48);
                break L1;
              }
            }
            L2: {
              if (null == nj.field_X) {
                break L2;
              } else {
                if (nj.field_X.equals((Object) (Object) param1.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = (Object) (Object) nj.field_X;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                }
              }
            }
            L3: {
              if (g.field_H == null) {
                break L3;
              } else {
                if (!g.field_H.equals((Object) (Object) param1.getParameter("session"))) {
                  var4 = (Object) (Object) g.field_H;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_9_0 = jp.a((byte) 97, param2, (String) var4, (String) var3, -1);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_11_0 = var3;
            stackOut_11_1 = new StringBuilder().append("rc.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(boolean param0, byte param1) {
        e.field_S.a(0, 0, 0);
        if (param1 > -35) {
            rc.a(false, (byte) -121);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_u = null;
        if (param0 != 0) {
            return;
        }
        field_v = null;
        field_j = null;
        field_h = null;
        field_w = null;
    }

    rc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((rc) this).field_q = param2;
            int fieldTemp$0 = wg.field_p;
            wg.field_p = wg.field_p + 1;
            ((rc) this).field_i = fieldTemp$0 & 65535;
            ((rc) this).field_t = param5;
            ((rc) this).field_m = param3;
            ((rc) this).field_l = param4;
            ((rc) this).field_k = param6;
            ((rc) this).field_n = param1;
            ((rc) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rc.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Log in / Create account";
        field_h = new sm();
        field_j = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_u = new int[]{};
        field_x = 0;
        field_p = field_x;
    }
}
