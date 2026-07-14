/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kn {
    int field_R;
    static int field_S;
    static int field_T;
    static boolean field_U;
    static String field_P;
    static boolean field_O;
    static String field_Q;
    static String field_N;

    public static void j(int param0) {
        field_N = null;
        field_P = null;
        field_Q = null;
        if (param0 != 1839839976) {
            lf.a(77, (byte) -29, 121, -13, -95, 88);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        gb.field_A[ed.field_b] = param3;
        vn.field_Ab[ed.field_b] = ed.field_b;
        hg.field_d[ed.field_b] = param5;
        if (!(nj.field_t <= param5)) {
            bh.field_F = param5;
        }
        if (param5 > bj.field_gb) {
            eb.field_y = param5;
        }
        hn.field_e[ed.field_b] = param0;
        in.field_j[ed.field_b] = param2;
        oc.field_n[ed.field_b] = param4;
        int var6 = param4 + param2 + param0;
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param0 / var6;
        gh.field_a[ed.field_b] = var7;
        if (bh.field_F > var7) {
            bh.field_F = var7;
        }
        if (param1 != 117) {
            lf.a(-126, (byte) -125, 10, 121, 120, 92);
        }
        ed.field_b = ed.field_b + 1;
        if (eb.field_y < var7) {
            eb.field_y = var7;
        }
    }

    final static void a(int param0, em param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        fn var21 = null;
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
        em var45 = null;
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
        fn stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        fn stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
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
            var40 = Chess.field_G;
            var45 = param1;
            if (var45.field_y == null) {
              break L1;
            } else {
              if (1 < var45.field_j) {
                var62 = var45.field_y;
                h.a(var62, 0, param4 ^ 1187586933, lc.field_n, 0);
                break L0;
              } else {
                break L1;
              }
            }
          }
          d.l(465918340);
          break L0;
        }
        L2: {
          var66 = new int[param1.field_t];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param1.field_t];
          var64 = lk.field_c;
          var65 = ab.field_r;
          var63 = pa.field_o;
          if (param4 == 29521) {
            break L2;
          } else {
            int discarded$1 = lf.i(-127);
            break L2;
          }
        }
        var13 = 0;
        L3: while (true) {
          if (param1.field_t <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (um.field_a <= var44) {
                return;
              } else {
                L5: {
                  var14 = ve.field_Hb[var44];
                  var15 = param1.field_g[var14];
                  var16 = param1.field_A[var14];
                  var17 = param1.field_J[var14];
                  if (param1.field_l[var14] >= lk.field_c.length) {
                    stackOut_25_0 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = param1.field_l[var14];
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_26_0;
                  if (lk.field_c.length > param1.field_C[var14]) {
                    stackOut_28_0 = param1.field_C[var14];
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
                  if (lk.field_c.length > param1.field_E[var14]) {
                    stackOut_31_0 = param1.field_E[var14];
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
                    if (null == m.field_e) {
                      break L9;
                    } else {
                      if (null == param1.field_G) {
                        break L9;
                      } else {
                        if (param1.field_G.length <= var14) {
                          break L9;
                        } else {
                          if (-1 == param1.field_G[var14]) {
                            break L9;
                          } else {
                            if (m.field_e.length <= param1.field_G[var14]) {
                              break L9;
                            } else {
                              stackOut_37_0 = m.field_e[param1.field_G[var14]];
                              stackIn_39_0 = stackOut_37_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_38_0 = null;
                  stackIn_39_0 = (fn) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  var21 = (fn) (Object) stackIn_39_0;
                  var22 = qm.field_c[var15];
                  var23 = tc.field_w[var15];
                  var24 = qm.field_c[var16];
                  var25 = tc.field_w[var16];
                  var26 = qm.field_c[var17];
                  var27 = tc.field_w[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 != var20) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_43_0 = var21.field_g;
                          stackIn_44_0 = stackOut_43_0;
                          break L11;
                        } else {
                          stackOut_42_0 = 8355711;
                          stackIn_44_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_44_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = (var32 * var28 & 16711796) >>> 510025928 | (var31 * var28 & -16711780) >>> -1191603064;
                      var33 = var33 + 65793 * var29;
                      bb.a(var22, var26, 8355711 & var33 >> -850999391, var25, var24, var23, 1, var27);
                      var44++;
                      continue L4;
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
                  if (var21 != null) {
                    stackOut_47_0 = var21.field_g;
                    stackIn_48_0 = stackOut_47_0;
                    break L12;
                  } else {
                    stackOut_46_0 = 8355711;
                    stackIn_48_0 = stackOut_46_0;
                    break L12;
                  }
                }
                var34 = stackIn_48_0;
                var35 = 16711935 & var34;
                var36 = var34 & 65280;
                var37 = var36 * var28 >>> -1047011448 & -1258225920 | var35 * var28 >>> -1625638328 & -687931137;
                var38 = 1107361536 & var36 * var29 >>> 722503176 | (-16711811 & var29 * var35) >>> -1900373624;
                var37 = var37 + var31 * 65793;
                var38 = var38 + var32 * 65793;
                var39 = (16711928 & var36 * var30) >>> 1839839976 | -1929445121 & var30 * var35 >>> 1355156232;
                var39 = var39 + var33 * 65793;
                qn.a(var26, var37 >> 1686917640 & 255, 255 & var37, param4 ^ 29521, var27, var37 >> -213468112, var23, var25, var38 >> -1653892304, 255 & var38 >> -1379460376, var24, 255 & var38, 255 & var39, var22, var39 >> 1439970160, (var39 & 65501) >> 271842184);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param3 + (var64[var13] * param7 - -(var65[var13] * param0)) >> 497903912;
              if (-1 < (var14 ^ -1)) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((var14 ^ -1) <= -1) {
                if (128 <= var14) {
                  stackOut_16_0 = 256;
                  stackIn_17_0 = stackOut_16_0;
                  break L14;
                } else {
                  stackOut_15_0 = 128 - -var14;
                  stackIn_17_0 = stackOut_15_0;
                  break L14;
                }
              } else {
                stackOut_13_0 = 128;
                stackIn_17_0 = stackOut_13_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_17_0;
              var15 = param5 * var64[var13] - -(param6 * var65[var13]) - -(param2 * var63[var13]) >> -795510104;
              stackOut_17_0 = gf.field_b;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (0 <= var15) {
                stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                stackOut_19_1 = var15;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L15;
              } else {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = -var15;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L15;
              }
            }
            var15 = stackIn_20_0[stackIn_20_1];
            var14 = (-var15 + 256) * var14 >>> -1689306264;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    public lf() {
        super(0, 0, 0, 0, (jm) null, (rg) null);
        ((lf) this).field_R = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        km var7 = null;
        if (param1 != 0) {
          return;
        } else {
          if (null != ((lf) this).field_M) {
            if (((lf) this).field_R != -1) {
              if (-257 == ((lf) this).field_R) {
                ((lf) this).field_M.a(param0 + ((lf) this).field_r, param1, -108, param3 - -((lf) this).field_u);
                return;
              } else {
                L0: {
                  var7 = new km(((lf) this).field_M.field_y, ((lf) this).field_M.field_C);
                  tl.a((byte) -67, var7);
                  ((lf) this).field_M.a(0, param1, -110, 0);
                  fd.a(28773);
                  var7.b(((lf) this).field_u + param3, param0 - -((lf) this).field_r, ((lf) this).field_R);
                  if (param2 <= -80) {
                    break L0;
                  } else {
                    var6 = null;
                    lf.a(-25, (em) null, -102, -7, -85, 43, 21, 65);
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            field_T = -61;
        }
        if (0 < an.field_e) {
            if (!(!fm.field_V)) {
                wb.g(0, 0, wb.field_h, uh.field_m.field_wb);
                la.field_c.a(false, param1);
            }
        }
        if (0 >= aj.field_c) {
            // if_icmpge L101
        }
        if (jh.field_a) {
            wb.g(0, 0, wb.field_h, uh.field_m.field_wb);
            ah.field_i.a(false, param1);
        }
    }

    lf(mf param0) {
        super(param0.field_u, param0.field_r, param0.field_y, param0.field_C, (jm) null, (rg) null);
        param0.a(0, 34, ((lf) this).field_C, ((lf) this).field_y, 0);
        ((lf) this).field_M = param0;
        ((lf) this).field_R = 256;
    }

    final static int i(int param0) {
        Object var2 = null;
        if (-3 >= (il.field_a ^ -1)) {
          L0: {
            if (param0 >= 90) {
              break L0;
            } else {
              var2 = null;
              lf.a(40, (em) null, 32, -29, 40, -127, 89, -102);
              break L0;
            }
          }
          if (se.field_V == 0) {
            if (!fl.field_m.c((byte) 123)) {
              return 20;
            } else {
              if (!fl.field_m.b("commonui", 100)) {
                return 40;
              } else {
                if (!Chess.field_B.c((byte) 127)) {
                  return 50;
                } else {
                  if (Chess.field_B.b("commonui", 100)) {
                    if (bi.field_a.c((byte) 121)) {
                      if (!bi.field_a.b((byte) -40)) {
                        return 80;
                      } else {
                        return 100;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                }
              }
            }
          } else {
            L1: {
              if (null != qa.field_c) {
                if (!qa.field_c.c((byte) 124)) {
                  return 14;
                } else {
                  if (qa.field_c.a(4, "")) {
                    if (!qa.field_c.b("", 100)) {
                      return 29;
                    } else {
                      break L1;
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                break L1;
              }
            }
            if (fl.field_m.c((byte) 124)) {
              if (!fl.field_m.b("commonui", 100)) {
                return 57;
              } else {
                if (!Chess.field_B.c((byte) 126)) {
                  return 71;
                } else {
                  if (Chess.field_B.b("commonui", 100)) {
                    if (bi.field_a.c((byte) 125)) {
                      if (!bi.field_a.b((byte) -40)) {
                        return 86;
                      } else {
                        return 100;
                      }
                    } else {
                      return 82;
                    }
                  } else {
                    return 80;
                  }
                }
              }
            } else {
              return 43;
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 80;
        field_T = -1;
        field_Q = "This game option is only available to members.";
        field_P = "You have declined the invitation.";
        field_U = true;
        field_O = false;
    }
}
