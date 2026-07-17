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
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        f stackIn_39_0 = null;
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
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        f stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
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
            L3: while (true) {
              if (~param3.field_f >= ~var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (eh.field_A <= var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = uf.field_o[var44];
                      var15 = param3.field_g[var14];
                      var16 = param3.field_H[var14];
                      var17 = param3.field_r[var14];
                      if (param3.field_O[var14] < og.field_y.length) {
                        stackOut_24_0 = param3.field_O[var14];
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
                      if (og.field_y.length > param3.field_n[var14]) {
                        stackOut_27_0 = param3.field_n[var14];
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
                      if (og.field_y.length <= param3.field_v[var14]) {
                        stackOut_30_0 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = param3.field_v[var14];
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (null == ag.field_a) {
                          break L9;
                        } else {
                          if (param3.field_x == null) {
                            break L9;
                          } else {
                            if (param3.field_x.length <= var14) {
                              break L9;
                            } else {
                              if (param3.field_x[var14] == -1) {
                                break L9;
                              } else {
                                if (~param3.field_x[var14] > ~ag.field_a.length) {
                                  stackOut_38_0 = ag.field_a[param3.field_x[var14]];
                                  stackIn_39_0 = stackOut_38_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_39_0 = (f) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_39_0;
                        var22 = to.field_a[var15];
                        var23 = wc.field_Nb[var15];
                        var24 = to.field_a[var16];
                        var25 = wc.field_Nb[var16];
                        var26 = to.field_a[var17];
                        var27 = wc.field_Nb[var17];
                        if (~var18 != ~var19) {
                          break L11;
                        } else {
                          if (~var19 == ~var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_48_0 = var21_ref.field_h;
                                stackIn_49_0 = stackOut_48_0;
                                break L12;
                              } else {
                                stackOut_47_0 = 8355711;
                                stackIn_49_0 = stackOut_47_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var32 * var28 & 16711929) >>> 8 | (-16711868 & var31 * var28) >>> 8;
                            var33 = var33 + var29 * 65793;
                            int discarded$1 = 75;
                            fp.a(var22, var27, var24, var33 >> 1 & 8355711, var25, var23, var26);
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
                          stackOut_44_0 = 8355711;
                          stackIn_45_0 = stackOut_44_0;
                          break L13;
                        } else {
                          stackOut_43_0 = var21_ref.field_h;
                          stackIn_45_0 = stackOut_43_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (16711863 & var28 * var36) >>> 8 | var28 * var35 >>> 8 & -1090584321;
                      var38 = var29 * var35 >>> 8 & 1056899327 | var29 * var36 >>> 8 & 218169088;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var30 * var36 >>> 8 & 2013331200 | (-16711925 & var35 * var30) >>> 8;
                      var39 = var39 + 65793 * var33;
                      se.a(false, var22, 255 & var37, var38 & 255, var25, var38 >> 16, var37 >> 16, (var39 & 65350) >> 8, var39 & 255, var37 >> 8 & 255, var24, var39 >> 16, 255 & var38 >> 8, var23, var27, var26);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var63[var13] + (param4 * var64[var13] + param5 * var65[var13]) >> 8;
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
                      stackOut_15_0 = 256;
                      stackIn_16_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 128 + var14;
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
                  var15 = param1 * var63[var13] + (param2 * var65[var13] + var64[var13] * param7) >> 8;
                  stackOut_16_0 = jj.field_H;
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
                var14 = var14 * (256 + -var15) >>> 8;
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
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("rc.D(").append(-111).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param3 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == nj.field_X) {
                break L1;
              } else {
                if (nj.field_X.equals((Object) (Object) param1.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) nj.field_X;
                  break L1;
                }
              }
            }
            L2: {
              if (g.field_H == null) {
                break L2;
              } else {
                if (!g.field_H.equals((Object) (Object) param1.getParameter("session"))) {
                  var4 = (Object) (Object) g.field_H;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            int discarded$2 = -1;
            stackOut_7_0 = jp.a((byte) 97, param2, (String) var4, (String) var3);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_9_0 = var3;
            stackOut_9_1 = new StringBuilder().append("rc.C(").append(-1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0, byte param1) {
        e.field_S.a(0, 0, 0);
        if (param1 > -35) {
            rc.a(false, (byte) -121);
        }
    }

    public static void a() {
        field_r = null;
        field_u = null;
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
