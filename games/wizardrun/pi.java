/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String[] field_a;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, le param5, int param6, int param7) {
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
        ca var21_ref = null;
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
        le var45 = null;
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
        ca stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        ca stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var40 = wizardrun.field_H;
            var45 = param5;
            if (var45.field_x == null) {
              break L1;
            } else {
              if (-2 <= (var45.field_n ^ -1)) {
                break L1;
              } else {
                var62 = var45.field_x;
                te.a((byte) -112, var62, t.field_a, 0, 0);
                break L0;
              }
            }
          }
          ia.b(0);
          break L0;
        }
        L2: {
          if (!param3) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
        var66 = new int[param5.field_y];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param5.field_y];
        var63 = gk.field_g;
        var64 = hb.field_o;
        var65 = bl.field_b;
        var13 = 0;
        L3: while (true) {
          if (param5.field_y <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= kg.field_c) {
                return;
              } else {
                L5: {
                  var14 = cb.field_e[var44];
                  var15 = param5.field_p[var14];
                  var16 = param5.field_C[var14];
                  var17 = param5.field_I[var14];
                  if (gk.field_g.length <= param5.field_c[var14]) {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = param5.field_c[var14];
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_24_0;
                  if (param5.field_Q[var14] < gk.field_g.length) {
                    stackOut_26_0 = param5.field_Q[var14];
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_27_0;
                  if (gk.field_g.length <= param5.field_d[var14]) {
                    stackOut_29_0 = -1;
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  } else {
                    stackOut_28_0 = param5.field_d[var14];
                    stackIn_30_0 = stackOut_28_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_30_0;
                    if (null == oh.field_a) {
                      break L9;
                    } else {
                      if (param5.field_O == null) {
                        break L9;
                      } else {
                        if (var14 >= param5.field_O.length) {
                          break L9;
                        } else {
                          if (0 == (param5.field_O[var14] ^ -1)) {
                            break L9;
                          } else {
                            if (oh.field_a.length <= param5.field_O[var14]) {
                              break L9;
                            } else {
                              stackOut_35_0 = oh.field_a[param5.field_O[var14]];
                              stackIn_37_0 = stackOut_35_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_37_0 = (ca) (Object) stackOut_36_0;
                  break L8;
                }
                L10: {
                  var21_ref = stackIn_37_0;
                  var22 = nl.field_A[var15];
                  var23 = d.field_c[var15];
                  var24 = nl.field_A[var16];
                  var25 = d.field_c[var16];
                  var26 = nl.field_A[var17];
                  var27 = d.field_c[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 == var20) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21_ref != null) {
                          stackOut_46_0 = var21_ref.field_b;
                          stackIn_47_0 = stackOut_46_0;
                          break L11;
                        } else {
                          stackOut_45_0 = 8355711;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_47_0;
                      var31 = 16711935 & var30;
                      var32 = 65280 & var30;
                      var33 = (16711720 & var32 * var28) >>> 1881586600 | -486604545 & var28 * var31 >>> -1044194744;
                      var33 = var33 + var29 * 65793;
                      pj.a(var25, 0, var22, var24, var27, (var33 & 16711422) >> -42153183, var26, var23);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21_ref == null) {
                    stackOut_42_0 = 8355711;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_41_0 = var21_ref.field_b;
                    stackIn_43_0 = stackOut_41_0;
                    break L12;
                  }
                }
                var34 = stackIn_43_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = 1006567679 & var35 * var28 >>> 1174843016 | var36 * var28 >>> -431808024 & -402587904;
                var38 = (-16711765 & var35 * var29) >>> 1634743112 | (var36 * var29 & 16711734) >>> 752416712;
                var38 = var38 + 65793 * var32;
                var37 = var37 + var31 * 65793;
                var39 = var30 * var35 >>> 254629032 & 1946091775 | var36 * var30 >>> -756146104 & -486473984;
                var39 = var39 + var33 * 65793;
                gk.a(var24, var23, var39 >> 1999477584, var22, var37 >> -1546153520, (65401 & var37) >> -505338168, (var38 & 65386) >> 163685288, var39 >> -1884321496 & 255, var39 & 255, var38 & 255, var27, var26, -719, var38 >> -1574462704, var25, 255 & var37);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param6 * var63[var13] + (var64[var13] * param2 - -(param4 * var65[var13])) >> -1992947672;
              if (var14 >= 0) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (var14 < 0) {
                stackOut_14_0 = 128;
                stackIn_15_0 = stackOut_14_0;
                break L14;
              } else {
                if (var14 >= 128) {
                  stackOut_13_0 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  break L14;
                } else {
                  stackOut_12_0 = 128 - -var14;
                  stackIn_15_0 = stackOut_12_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_15_0;
              var15 = var65[var13] * param0 + param1 * var63[var13] - -(param7 * var64[var13]) >> 234490728;
              stackOut_15_0 = qk.field_f;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (0 <= var15) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L15;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = -var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L15;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = var14 * (256 - var15) >>> -541425240;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static o[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = wizardrun.field_H;
        o[] var1 = new o[wb.field_f];
        for (var2 = param0; var2 < wb.field_f; var2++) {
            var3 = tf.field_b[var2] * cg.field_k[var2];
            var4 = mf.field_j[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ic.field_b[kl.b(255, (int) var4[var6])];
            }
            var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var5);
        }
        eb.a(param0 ^ 0);
        return var1;
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        kh var3 = null;
        if (param0 == null) {
            return null;
        }
        if (-137 > (param0.length ^ -1)) {
            var3 = new kh();
            ((dj) (Object) var3).a(param0, 121);
            return (Object) (Object) var3;
        }
        if (param1 != 0) {
            field_a = null;
        }
        if (!param2) {
            return (Object) (Object) param0;
        }
        return (Object) (Object) vg.a(param0, -125);
    }

    public static void a(int param0) {
        if (param0 != 32348) {
            pi.a(98);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
