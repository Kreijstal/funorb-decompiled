/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    int field_a;
    static ph field_e;
    static java.awt.Frame field_d;
    int field_b;
    static String field_c;

    final static ad[] b(int param0) {
        if (param0 != 65280) {
          return null;
        } else {
          return new ad[]{hl.field_c, am.field_b, tp.field_y, m.field_d, kj.field_p, u.field_U, og.field_c, ib.field_h, cm.field_T, ve.field_e, pm.field_l, hf.field_wb, sj.field_hb, lg.field_n};
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, cn[] param5) {
        int var12 = DungeonAssault.field_K;
        if (param5 != null) {
            // ifle L17
        } else {
            return;
        }
        int var6 = param5[0].field_E;
        int var8 = 96 / ((79 - param3) / 43);
        int var7 = param5[2].field_E;
        int var9 = param5[1].field_E;
        param5[0].a(param2, param1, param4);
        param5[2].a(-var7 + param2 + param0, param1, param4);
        gf.a(mk.field_i);
        gf.a(var6 + param2, param1, param0 + param2 + -var7, param5[1].field_G + param1);
        int var10 = param2 - -var6;
        int var11 = param0 + (param2 - var7);
        param2 = var10;
        while (var11 > param2) {
            param5[1].a(param2, param1, param4);
            param2 = param2 + var9;
        }
        gf.b(mk.field_i);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 1) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    ad(int param0, int param1, int param2, int param3) {
        ((ad) this).field_b = param0;
        ((ad) this).field_a = param3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, qh param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        sm var21 = null;
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
        qh var45 = null;
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
        sm stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_22_0 = 0;
        short stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        sm stackOut_36_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = DungeonAssault.field_K;
            var45 = param7;
            if (null == var45.field_y) {
              break L1;
            } else {
              if (1 < var45.field_w) {
                var62 = var45.field_y;
                ll.a(0, var62, true, 0, hk.field_b);
                break L0;
              } else {
                break L1;
              }
            }
          }
          sf.d(3);
          break L0;
        }
        var66 = new int[param7.field_c];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param7.field_c];
        var65 = hk.field_c;
        var64 = p.field_x;
        var63 = hd.field_j;
        var13 = 0;
        L2: while (true) {
          if (param7.field_c <= var13) {
            var44 = 0;
            var13 = var44;
            L3: while (true) {
              if (ab.field_c <= var44) {
                var14 = -34 / ((-24 - param4) / 58);
                return;
              } else {
                L4: {
                  var14 = hf.field_yb[var44];
                  var15 = param7.field_A[var14];
                  var16 = param7.field_x[var14];
                  var17 = param7.field_N[var14];
                  if (param7.field_e[var14] >= hk.field_c.length) {
                    stackOut_22_0 = -1;
                    stackIn_23_0 = stackOut_22_0;
                    break L4;
                  } else {
                    stackOut_21_0 = param7.field_e[var14];
                    stackIn_23_0 = stackOut_21_0;
                    break L4;
                  }
                }
                L5: {
                  var18 = stackIn_23_0;
                  if (hk.field_c.length <= param7.field_s[var14]) {
                    stackOut_25_0 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = param7.field_s[var14];
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var19 = stackIn_26_0;
                  if (param7.field_F[var14] < hk.field_c.length) {
                    stackOut_28_0 = param7.field_F[var14];
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var20 = stackIn_29_0;
                    if (ch.field_n == null) {
                      break L8;
                    } else {
                      if (null == param7.field_o) {
                        break L8;
                      } else {
                        if (param7.field_o.length <= var14) {
                          break L8;
                        } else {
                          if (-1 == param7.field_o[var14]) {
                            break L8;
                          } else {
                            if (ch.field_n.length > param7.field_o[var14]) {
                              stackOut_36_0 = ch.field_n[param7.field_o[var14]];
                              stackIn_37_0 = stackOut_36_0;
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_35_0 = null;
                  stackIn_37_0 = (sm) (Object) stackOut_35_0;
                  break L7;
                }
                L9: {
                  var21 = stackIn_37_0;
                  var22 = nj.field_g[var15];
                  var23 = ra.field_b[var15];
                  var24 = nj.field_g[var16];
                  var25 = ra.field_b[var16];
                  var26 = nj.field_g[var17];
                  var27 = ra.field_b[var17];
                  if (var19 != var18) {
                    break L9;
                  } else {
                    if (var19 != var20) {
                      break L9;
                    } else {
                      L10: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_41_0 = var21.field_d;
                          stackIn_42_0 = stackOut_41_0;
                          break L10;
                        } else {
                          stackOut_40_0 = 8355711;
                          stackIn_42_0 = stackOut_40_0;
                          break L10;
                        }
                      }
                      var30 = stackIn_42_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = var31 * var28 >>> 889904488 & -352386817 | (var32 * var28 & 16711692) >>> -2045898648;
                      var33 = var33 + 65793 * var29;
                      kd.a(var24, var22, var26, var23, 29108, 8355711 & var33 >> -377316671, var27, var25);
                      var44++;
                      continue L3;
                    }
                  }
                }
                L11: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_45_0 = var21.field_d;
                    stackIn_46_0 = stackOut_45_0;
                    break L11;
                  } else {
                    stackOut_44_0 = 8355711;
                    stackIn_46_0 = stackOut_44_0;
                    break L11;
                  }
                }
                var34 = stackIn_46_0;
                var35 = 16711935 & var34;
                var36 = var34 & 65280;
                var37 = 1040122111 & var35 * var28 >>> 1129075784 | var28 * var36 >>> 1505705224 & 218169088;
                var38 = -889257729 & var35 * var29 >>> 1738047720 | (var29 * var36 & 16711759) >>> -1204791064;
                var39 = var36 * var30 >>> -402316920 & -436142336 | (-16711837 & var30 * var35) >>> -1231302904;
                var37 = var37 + var31 * 65793;
                var38 = var38 + 65793 * var32;
                var39 = var39 + var33 * 65793;
                fg.a(var27, var39 & 255, var25, var23, 255 & var37 >> -945003256, var39 >> 1404147472, var38 >> 1571767280, var39 >> -1795086008 & 255, (var38 & 65466) >> -711620184, var37 >> 1882332016, 255 & var38, var22, (byte) -86, 255 & var37, var24, var26);
                var44++;
                continue L3;
              }
            }
          } else {
            L12: {
              var14 = param6 * var63[var13] + (param1 * var64[var13] + var65[var13] * param2) >> -1393140184;
              if (var14 >= 0) {
                break L12;
              } else {
                var14 = -var14;
                break L12;
              }
            }
            L13: {
              if (var14 < 0) {
                stackOut_13_0 = 128;
                stackIn_14_0 = stackOut_13_0;
                break L13;
              } else {
                if ((var14 ^ -1) > -129) {
                  stackOut_12_0 = 128 + var14;
                  stackIn_14_0 = stackOut_12_0;
                  break L13;
                } else {
                  stackOut_11_0 = 256;
                  stackIn_14_0 = stackOut_11_0;
                  break L13;
                }
              }
            }
            L14: {
              var14 = stackIn_14_0;
              var15 = var63[var13] * param3 + param0 * var64[var13] + var65[var13] * param5 >> -415611032;
              stackOut_14_0 = jk.field_Bb;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (0 <= var15) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L14;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = -var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L14;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = (-var15 + 256) * var14 >>> 1625693384;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords can only contain letters and numbers";
    }
}
