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
        int[] var8 = null;
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
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        f stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        f stackOut_39_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          L1: {
            var40 = ZombieDawn.field_J;
            var45 = param3;
            if (null == var45.field_F) {
              break L1;
            } else {
              if ((var45.field_p ^ -1) < -2) {
                var62 = var45.field_F;
                ke.a(0, 0, jp.field_f, var62, 0);
                break L0;
              } else {
                break L1;
              }
            }
          }
          qc.a(1);
          break L0;
        }
        L2: {
          if (param0 < -67) {
            break L2;
          } else {
            rc.a(-5);
            break L2;
          }
        }
        var66 = new int[param3.field_f];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param3.field_f];
        var64 = og.field_y;
        var65 = jl.field_s;
        var63 = qb.field_c;
        var13 = 0;
        L3: while (true) {
          if ((param3.field_f ^ -1) >= (var13 ^ -1)) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (eh.field_A <= var44) {
                return;
              } else {
                L5: {
                  var14 = uf.field_o[var44];
                  var15 = param3.field_g[var14];
                  var16 = param3.field_H[var14];
                  var17 = param3.field_r[var14];
                  if (param3.field_O[var14] < og.field_y.length) {
                    stackOut_25_0 = param3.field_O[var14];
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_26_0;
                  if (og.field_y.length > param3.field_n[var14]) {
                    stackOut_28_0 = param3.field_n[var14];
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_29_0;
                  if (og.field_y.length <= param3.field_v[var14]) {
                    stackOut_31_0 = -1;
                    stackIn_32_0 = stackOut_31_0;
                    break L7;
                  } else {
                    stackOut_30_0 = param3.field_v[var14];
                    stackIn_32_0 = stackOut_30_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_32_0;
                    if (null == ag.field_a) {
                      break L9;
                    } else {
                      if (param3.field_x == null) {
                        break L9;
                      } else {
                        if (param3.field_x.length <= var14) {
                          break L9;
                        } else {
                          if (0 == (param3.field_x[var14] ^ -1)) {
                            break L9;
                          } else {
                            if ((param3.field_x[var14] ^ -1) > (ag.field_a.length ^ -1)) {
                              stackOut_39_0 = ag.field_a[param3.field_x[var14]];
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
                  stackIn_40_0 = (f) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  L11: {
                    var21_ref = stackIn_40_0;
                    var22 = to.field_a[var15];
                    var23 = wc.field_Nb[var15];
                    var24 = to.field_a[var16];
                    var25 = wc.field_Nb[var16];
                    var26 = to.field_a[var17];
                    var27 = wc.field_Nb[var17];
                    if ((var18 ^ -1) != (var19 ^ -1)) {
                      break L11;
                    } else {
                      if ((var19 ^ -1) == (var20 ^ -1)) {
                        L12: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21_ref != null) {
                            stackOut_49_0 = var21_ref.field_h;
                            stackIn_50_0 = stackOut_49_0;
                            break L12;
                          } else {
                            stackOut_48_0 = 8355711;
                            stackIn_50_0 = stackOut_48_0;
                            break L12;
                          }
                        }
                        var30 = stackIn_50_0;
                        var31 = 16711935 & var30;
                        var32 = var30 & 65280;
                        var33 = (var32 * var28 & 16711929) >>> 1437466536 | (-16711868 & var31 * var28) >>> 1641880520;
                        var33 = var33 + var29 * 65793;
                        fp.a(var22, var27, var24, var33 >> -936543775 & 8355711, var25, var23, var26, (byte) 75);
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
                      stackOut_44_0 = var21_ref.field_h;
                      stackIn_46_0 = stackOut_44_0;
                      break L13;
                    }
                  }
                  var34 = stackIn_46_0;
                  var35 = var34 & 16711935;
                  var36 = 65280 & var34;
                  var37 = (16711863 & var28 * var36) >>> 781265128 | var28 * var35 >>> -2124360792 & -1090584321;
                  var38 = var29 * var35 >>> -166623960 & 1056899327 | var29 * var36 >>> 102037288 & 218169088;
                  var37 = var37 + var31 * 65793;
                  var38 = var38 + var32 * 65793;
                  var39 = var30 * var36 >>> 1143014056 & 2013331200 | (-16711925 & var35 * var30) >>> -968519448;
                  var39 = var39 + 65793 * var33;
                  se.a(false, var22, 255 & var37, var38 & 255, var25, var38 >> -263535792, var37 >> -1322420752, (var39 & 65350) >> 501221320, var39 & 255, var37 >> -2102971928 & 255, var24, var39 >> -1946111824, 255 & var38 >> -1117380824, var23, var27, var26);
                  break L10;
                }
                var44++;
                continue L4;
              }
            }
          } else {
            L14: {
              var14 = param6 * var63[var13] + (param4 * var64[var13] + param5 * var65[var13]) >> 1513673032;
              if ((var14 ^ -1) > -1) {
                var14 = -var14;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-1 >= (var14 ^ -1)) {
                if ((var14 ^ -1) <= -129) {
                  stackOut_16_0 = 256;
                  stackIn_17_0 = stackOut_16_0;
                  break L15;
                } else {
                  stackOut_15_0 = 128 + var14;
                  stackIn_17_0 = stackOut_15_0;
                  break L15;
                }
              } else {
                stackOut_13_0 = 128;
                stackIn_17_0 = stackOut_13_0;
                break L15;
              }
            }
            L16: {
              var14 = stackIn_17_0;
              var15 = param1 * var63[var13] + (param2 * var65[var13] + var64[var13] * param7) >> 1525544616;
              stackOut_17_0 = jj.field_H;
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
            var14 = var14 * (256 + -var15) >>> 1302629128;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        if (param0 != -1) {
            rc.a(48);
        }
        if (null != nj.field_X) {
            if (!nj.field_X.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = (Object) (Object) nj.field_X;
                var4 = var3;
                var4 = var3;
            }
        }
        if (g.field_H != null) {
            if (!(g.field_H.equals((Object) (Object) param1.getParameter("session")))) {
                var4 = (Object) (Object) g.field_H;
            }
        }
        return jp.a((byte) 97, param2, (String) var4, (String) var3, -1);
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
