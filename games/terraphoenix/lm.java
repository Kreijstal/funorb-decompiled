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
        if (param0) {
            return;
        }
        field_e = null;
    }

    final static void a(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dj var21 = null;
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
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        dj stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        dj stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var40 = Terraphoenix.field_V;
            var45 = param0;
            if (var45.field_f == null) {
              break L1;
            } else {
              if ((var45.field_I ^ -1) < -2) {
                var62 = var45.field_f;
                hk.a(0, -57, var62, 0, dk.field_c);
                break L0;
              } else {
                break L1;
              }
            }
          }
          th.a(true);
          break L0;
        }
        var66 = new int[param0.field_o];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param0.field_o];
        var64 = ph.field_m;
        var63 = k.field_e;
        var65 = mg.field_p;
        var13 = 0;
        L2: while (true) {
          if (param0.field_o <= var13) {
            var44 = param5;
            var13 = var44;
            L3: while (true) {
              if (ae.field_I <= var44) {
                return;
              } else {
                L4: {
                  var14 = qh.field_c[var44];
                  var15 = param0.field_E[var14];
                  var16 = param0.field_n[var14];
                  var17 = param0.field_p[var14];
                  if (ph.field_m.length > param0.field_C[var14]) {
                    stackOut_23_0 = param0.field_C[var14];
                    stackIn_24_0 = stackOut_23_0;
                    break L4;
                  } else {
                    stackOut_22_0 = -1;
                    stackIn_24_0 = stackOut_22_0;
                    break L4;
                  }
                }
                L5: {
                  var18 = stackIn_24_0;
                  if (ph.field_m.length > param0.field_k[var14]) {
                    stackOut_26_0 = param0.field_k[var14];
                    stackIn_27_0 = stackOut_26_0;
                    break L5;
                  } else {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    break L5;
                  }
                }
                L6: {
                  var19 = stackIn_27_0;
                  if (ph.field_m.length <= param0.field_g[var14]) {
                    stackOut_29_0 = -1;
                    stackIn_30_0 = stackOut_29_0;
                    break L6;
                  } else {
                    stackOut_28_0 = param0.field_g[var14];
                    stackIn_30_0 = stackOut_28_0;
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var20 = stackIn_30_0;
                    if (qk.field_l == null) {
                      break L8;
                    } else {
                      if (param0.field_x == null) {
                        break L8;
                      } else {
                        if (param0.field_x.length <= var14) {
                          break L8;
                        } else {
                          if (0 == (param0.field_x[var14] ^ -1)) {
                            break L8;
                          } else {
                            if (param0.field_x[var14] >= qk.field_l.length) {
                              break L8;
                            } else {
                              stackOut_35_0 = qk.field_l[param0.field_x[var14]];
                              stackIn_37_0 = stackOut_35_0;
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_37_0 = (dj) (Object) stackOut_36_0;
                  break L7;
                }
                L9: {
                  var21 = stackIn_37_0;
                  var22 = gm.field_l[var15];
                  var23 = nb.field_c[var15];
                  var24 = gm.field_l[var16];
                  var25 = nb.field_c[var16];
                  var26 = gm.field_l[var17];
                  var27 = nb.field_c[var17];
                  if (var18 != var19) {
                    break L9;
                  } else {
                    if (var20 == var19) {
                      L10: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_46_0 = var21.field_b;
                          stackIn_47_0 = stackOut_46_0;
                          break L10;
                        } else {
                          stackOut_45_0 = 8355711;
                          stackIn_47_0 = stackOut_45_0;
                          break L10;
                        }
                      }
                      var30 = stackIn_47_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = (var28 * var31 & -16711701) >>> 177698600 | (16711762 & var32 * var28) >>> 805656712;
                      var33 = var33 + 65793 * var29;
                      ag.a(var24, var25, var22, var23, 29842, var33 >> 827491425 & 8355711, var27, var26);
                      var44++;
                      continue L3;
                    } else {
                      break L9;
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
                    stackOut_42_0 = var21.field_b;
                    stackIn_43_0 = stackOut_42_0;
                    break L11;
                  } else {
                    stackOut_41_0 = 8355711;
                    stackIn_43_0 = stackOut_41_0;
                    break L11;
                  }
                }
                var34 = stackIn_43_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = -1879113473 & var35 * var28 >>> 1034123560 | (16711910 & var36 * var28) >>> -2110632728;
                var38 = -318832385 & var35 * var29 >>> -1872182200 | var36 * var29 >>> -1309656792 & 1375796992;
                var38 = var38 + var32 * 65793;
                var39 = (var35 * var30 & -16711875) >>> 1378073608 | 100728576 & var36 * var30 >>> -686246968;
                var37 = var37 + 65793 * var31;
                var39 = var39 + var33 * 65793;
                ak.a(255 & var39, var39 >> -1003626864, (var37 & 65286) >> 374420072, (var39 & 65475) >> -1279561432, var23, (byte) 116, var24, var22, var27, 255 & var37, var38 & 255, var38 >> 1881239568, var26, 255 & var38 >> 1165388136, var25, var37 >> -209808912);
                var44++;
                continue L3;
              }
            }
          } else {
            L12: {
              var14 = param6 * var63[var13] + (var64[var13] * param2 - -(var65[var13] * param4)) >> 1681758568;
              if (var14 < 0) {
                var14 = -var14;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (var14 <= -1) {
                if (-129 > var14) {
                  stackOut_14_0 = 128 + var14;
                  stackIn_15_0 = stackOut_14_0;
                  break L13;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  break L13;
                }
              } else {
                stackOut_11_0 = 128;
                stackIn_15_0 = stackOut_11_0;
                break L13;
              }
            }
            L14: {
              var14 = stackIn_15_0;
              var15 = var63[var13] * param1 + (param3 * var64[var13] - -(var65[var13] * param7)) >> 1384452808;
              stackOut_15_0 = me.field_m;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (var15 < 0) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L14;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L14;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = (-var15 + 256) * var14 >>> -1979343000;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = param6 + param2.field_p + param0 + -param7;
        var10 = param6 + param0 + (param2.field_p + param1);
        var11 = (param2.field_t >> 926142657) + param2.field_v + param5;
        l.i(var9, 0, var10, var11 - -param3);
        param2.d(-1 + param0, param5 - 1, param8);
        param2.d(param0 - 1, param5 + 1, param8);
        l.a(rb.field_a);
        l.i(1 + var9, 0, var10 + 1, var11 - -param3);
        param2.d(param0 + 1, -1 + param5, param8);
        param2.d(param0 - -1, param5 + 1, param8);
        l.a(rb.field_a);
        var9 = -param1 + -param6 + (param0 + param2.field_p) + param2.field_r;
        var10 = -param7 + (-param6 + (param2.field_r + param2.field_p + param0));
        l.i(var9, -param3 + var11, var10, 480);
        if (param4 < 122) {
          return;
        } else {
          param2.d(-1 + param0, param5 + -1, param8);
          param2.d(param0 - 1, param5 + 1, param8);
          l.a(rb.field_a);
          l.i(1 + var9, -param3 + var11, var10 + 1, 480);
          param2.d(param0 - -1, param5 + -1, param8);
          param2.d(1 + param0, param5 + 1, param8);
          l.a(rb.field_a);
          return;
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
