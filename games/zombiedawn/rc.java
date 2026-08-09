/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        f stackIn_41_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        f var21 = null;
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
        gd var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param3;
                if (null == var44.field_F) {
                  break L2;
                } else {
                  if ((var44.field_p ^ -1) < -2) {
                    var60 = var44.field_F;
                    ke.a(0, 0, jp.field_f, var60, 0);
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
            var54 = new int[param3.field_f];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param3.field_f];
            var62 = og.field_y;
            var63 = jl.field_s;
            var61 = qb.field_c;
            var13 = 0;
            L4: while (true) {
              if (param3.field_f <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (eh.field_A <= var13) {
                    break L0;
                  } else {
                    L6: {
                      var14 = uf.field_o[var13];
                      var15 = param3.field_g[var14];
                      var16 = param3.field_H[var14];
                      var17 = param3.field_r[var14];
                      if (param3.field_O[var14] < og.field_y.length) {
                        stackIn_27_0 = param3.field_O[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (og.field_y.length > param3.field_n[var14]) {
                        stackIn_30_0 = param3.field_n[var14];
                        break L7;
                      } else {
                        stackIn_30_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (og.field_y.length <= param3.field_v[var14]) {
                        stackIn_33_0 = -1;
                        break L8;
                      } else {
                        stackIn_33_0 = param3.field_v[var14];
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
                              if (0 == (param3.field_x[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (param3.field_x[var14] < ag.field_a.length) {
                                  stackIn_41_0 = ag.field_a[param3.field_x[var14]];
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_41_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_41_0;
                        var22 = to.field_a[var15];
                        var23 = wc.field_Nb[var15];
                        var24 = to.field_a[var16];
                        var25 = wc.field_Nb[var16];
                        var26 = to.field_a[var17];
                        var27 = wc.field_Nb[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 == var20) {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_51_0 = var21.field_h;
                                break L13;
                              } else {
                                stackIn_51_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_51_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var32 * var28 & 16711929) >>> 1437466536 | (-16711868 & var31 * var28) >>> 1641880520;
                            var33 = var33 + var29 * 65793;
                            fp.a(var22, var27, var24, var33 >> -936543775 & 8355711, var25, var23, var26, (byte) 75);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 == null) {
                          stackIn_47_0 = 8355711;
                          break L14;
                        } else {
                          stackIn_47_0 = var21.field_h;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (16711863 & var28 * var36) >>> 781265128 | var28 * var35 >>> -2124360792 & -1090584321;
                      var38 = var29 * var35 >>> -166623960 & 1056899327 | var29 * var36 >>> 102037288 & 218169088;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var30 * var36 >>> 1143014056 & 2013331200 | (-16711925 & var35 * var30) >>> -968519448;
                      var39 = var39 + 65793 * var33;
                      se.a(false, var22, 255 & var37, var38 & 255, var25, var38 >> -263535792, var37 >> -1322420752, (var39 & 65350) >> 501221320, var39 & 255, var37 >> -2102971928 & 255, var24, var39 >> -1946111824, 255 & var38 >> -1117380824, var23, var27, var26);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param6 * var61[var13] + (param4 * var62[var13] + param5 * var63[var13]) >> 1513673032;
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-1 >= (var14 ^ -1)) {
                    if ((var14 ^ -1) <= -129) {
                      stackIn_18_0 = 256;
                      break L16;
                    } else {
                      stackIn_18_0 = 128 + var14;
                      break L16;
                    }
                  } else {
                    stackIn_18_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = param1 * var61[var13] + (param2 * var63[var13] + var62[var13] * param7) >> 1525544616;
                  stackIn_20_0 = jj.field_H;

                  if (var15 < 0) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = -var15;
                    break L17;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = var15;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (256 + -var15) >>> 1302629128;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var8_ref);

            stackIn_56_1 = new StringBuilder().append("rc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L18;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L18;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                if (nj.field_X.equals(param1.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = nj.field_X;
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
                if (!g.field_H.equals(param1.getParameter("session"))) {
                  var4 = g.field_H;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_10_0 = jp.a((byte) 97, param2, (String) (var4), (String) (var3), -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("rc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
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
        int fieldTemp$0 = 0;
        try {
            this.field_q = param2;
            fieldTemp$0 = wg.field_p;
            wg.field_p = wg.field_p + 1;
            this.field_i = fieldTemp$0 & 65535;
            this.field_t = param5;
            this.field_m = param3;
            this.field_l = param4;
            this.field_k = param6;
            this.field_n = param1;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "rc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Log in / Create account";
        field_h = new sm();
        field_j = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_u = new int[]{};
        field_x = 0;
        field_p = field_x;
    }
}
