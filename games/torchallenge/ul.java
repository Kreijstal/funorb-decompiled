/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends da {
    static ka field_k;
    static int field_j;
    static int field_l;
    static int field_n;
    static int field_m;
    int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, vg param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ti var21 = null;
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
        vg var45 = null;
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
        ti stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        ti stackOut_36_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = TorChallenge.field_F ? 1 : 0;
            var45 = param5;
            if (null == var45.field_z) {
              break L1;
            } else {
              if (1 >= var45.field_s) {
                break L1;
              } else {
                var62 = var45.field_z;
                mh.a(0, var62, m.field_i, 0, false);
                break L0;
              }
            }
          }
          db.j(2);
          break L0;
        }
        var66 = new int[param5.field_c];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param5.field_c];
        var64 = sj.field_S;
        var65 = kl.field_b;
        var63 = kd.field_o;
        var13 = 0;
        L2: while (true) {
          if (param5.field_c <= var13) {
            var44 = 0;
            var13 = var44;
            L3: while (true) {
              if (var44 >= ni.field_f) {
                L4: {
                  if (param7 == -16711780) {
                    break L4;
                  } else {
                    field_m = 89;
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  var14 = k.field_e[var44];
                  var15 = param5.field_i[var14];
                  var16 = param5.field_w[var14];
                  var17 = param5.field_F[var14];
                  if (param5.field_f[var14] < sj.field_S.length) {
                    stackOut_22_0 = param5.field_f[var14];
                    stackIn_23_0 = stackOut_22_0;
                    break L5;
                  } else {
                    stackOut_21_0 = -1;
                    stackIn_23_0 = stackOut_21_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_23_0;
                  if (param5.field_k[var14] >= sj.field_S.length) {
                    stackOut_25_0 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    break L6;
                  } else {
                    stackOut_24_0 = param5.field_k[var14];
                    stackIn_26_0 = stackOut_24_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_26_0;
                  if (sj.field_S.length <= param5.field_G[var14]) {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    break L7;
                  } else {
                    stackOut_27_0 = param5.field_G[var14];
                    stackIn_29_0 = stackOut_27_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_29_0;
                    if (null == ll.field_h) {
                      break L9;
                    } else {
                      if (null == param5.field_M) {
                        break L9;
                      } else {
                        if (param5.field_M.length <= var14) {
                          break L9;
                        } else {
                          if (-1 == param5.field_M[var14]) {
                            break L9;
                          } else {
                            if (param5.field_M[var14] < ll.field_h.length) {
                              stackOut_36_0 = ll.field_h[param5.field_M[var14]];
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
                  stackIn_37_0 = (ti) (Object) stackOut_35_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_37_0;
                  var22 = tj.field_a[var15];
                  var23 = si.field_K[var15];
                  var24 = tj.field_a[var16];
                  var25 = si.field_K[var16];
                  var26 = tj.field_a[var17];
                  var27 = si.field_K[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var19 == var20) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_46_0 = 8355711;
                          stackIn_47_0 = stackOut_46_0;
                          break L11;
                        } else {
                          stackOut_45_0 = var21.field_b;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_47_0;
                      var31 = var30 & 16711935;
                      var32 = 65280 & var30;
                      var33 = (-16711691 & var28 * var31) >>> -1809338008 | (var28 * var32 & 16711883) >>> 652658440;
                      var33 = var33 + 65793 * var29;
                      aa.a(var24, var22, var26, 8355711 & var33 >> 1729836545, var27, 0, var23, var25);
                      var44++;
                      continue L3;
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
                  if (var21 == null) {
                    stackOut_42_0 = 8355711;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_41_0 = var21.field_b;
                    stackIn_43_0 = stackOut_41_0;
                    break L12;
                  }
                }
                var34 = stackIn_43_0;
                var35 = 16711935 & var34;
                var36 = var34 & 65280;
                var37 = var28 * var35 >>> -238055064 & 587137279 | (var28 * var36 & 16711859) >>> -2005934072;
                var38 = -771817217 & var35 * var29 >>> -422171928 | (16711855 & var36 * var29) >>> 236887656;
                var38 = var38 + var32 * 65793;
                var39 = -1375666432 & var30 * var36 >>> 112806664 | (var30 * var35 & -16711780) >>> -1656370552;
                var37 = var37 + var31 * 65793;
                var39 = var39 + var33 * 65793;
                vi.a(var38 >> -434021520, var37 >> 1160337520, var26, var24, (var39 & 65303) >> -1506243832, var38 & 255, var23, var25, var39 >> 678960752, 255 & var37 >> 850875144, var37 & 255, var27, 255 & var39, param7 ^ -16711780, var22, (65338 & var38) >> -954326072);
                var44++;
                continue L3;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param6 + (param0 * var64[var13] - -(var65[var13] * param1)) >> 617591368;
              if (var14 < 0) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((var14 ^ -1) <= -1) {
                if ((var14 ^ -1) <= -129) {
                  stackOut_13_0 = 256;
                  stackIn_14_0 = stackOut_13_0;
                  break L14;
                } else {
                  stackOut_12_0 = 128 + var14;
                  stackIn_14_0 = stackOut_12_0;
                  break L14;
                }
              } else {
                stackOut_10_0 = 128;
                stackIn_14_0 = stackOut_10_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_14_0;
              var15 = var63[var13] * param3 + param4 * var64[var13] - -(var65[var13] * param2) >> -1795883320;
              stackOut_14_0 = ch.field_b;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (0 > var15) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = -var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L15;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L15;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = (-var15 + 256) * var14 >>> 2140417480;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != -31397) {
            field_n = -111;
        }
    }

    final static void a(int param0, ji param1, int param2) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        pa var7 = dk.field_s;
        pa var8 = var7;
        var8.d(25, param2);
        var8.field_q = var8.field_q + 1;
        int var4 = var8.field_q;
        var8.d(1, (byte) 122);
        var8.a(param1.field_l, (byte) 106);
        var8.a(param1.field_o, (byte) 106);
        var8.a(param1.field_t, (byte) 106);
        var8.a(param1.field_s, false);
        var8.a(param1.field_i, false);
        var8.a(param1.field_v, false);
        var8.a(param1.field_j, false);
        if (param0 != -18261) {
            return;
        }
        var8.d(param1.field_w.length, (byte) 122);
        for (var5 = 0; param1.field_w.length > var5; var5++) {
            var7.a(param1.field_w[var5], false);
        }
        int discarded$0 = var8.b(var4, 14430);
        var8.a(var8.field_q + -var4, -120);
    }

    final static void c(int param0) {
        kl.field_e = of.b(param0 ^ 1259);
        t.field_b = new si();
        if (param0 != -1247) {
            return;
        }
        ee.a(true, 1, true);
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            return false;
        }
        return wf.field_i.a(-11982);
    }

    final static void a(lj param0, int param1, lj param2) {
        sf.field_a = param2;
        fd.field_c = param0;
        if (param1 != -1656370552) {
            Object var4 = null;
            ul.a(-64, -22, 5, -39, 95, (vg) null, -87, -81);
        }
    }

    ul(int param0) {
        ((ul) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ka(270, 70);
        field_j = -1;
        field_n = -1;
        field_m = 0;
        field_l = 64;
    }
}
