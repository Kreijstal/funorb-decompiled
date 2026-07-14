/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_a;
    static int field_b;
    static ll[] field_f;
    static String field_c;
    static String field_e;
    static int field_d;
    static int[] field_g;

    final static void b(int param0) {
        int var1 = -65 / ((param0 - -81) / 41);
        qj.field_i = tc.field_C + " <b>" + ln.field_R + "</b> " + li.field_G + " <b>" + ki.field_t + "</b> " + we.field_d + "<br>" + "<br>" + p.field_f;
    }

    final static void a(int param0, int param1, int param2, int param3, vg param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        gl var21 = null;
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
        gl stackIn_36_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        gl stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
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
            var40 = ArcanistsMulti.field_G ? 1 : 0;
            var45 = param4;
            if (var45.field_H == null) {
              break L1;
            } else {
              if (1 >= var45.field_F) {
                break L1;
              } else {
                var62 = var45.field_H;
                to.a(var62, false, jb.field_s, 0, 0);
                break L0;
              }
            }
          }
          ol.a((byte) 91);
          break L0;
        }
        var66 = new int[param4.field_A];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param4.field_A];
        var65 = dc.field_k;
        var64 = nf.field_Lb;
        var63 = mf.field_b;
        var13 = 0;
        L2: while (true) {
          if (param4.field_A <= var13) {
            var44 = 0;
            var13 = var44;
            L3: while (true) {
              if (ol.field_i <= var44) {
                L4: {
                  if (param3 == 20133) {
                    break L4;
                  } else {
                    field_b = -66;
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  var14 = w.field_Lb[var44];
                  var15 = param4.field_U[var14];
                  var16 = param4.field_T[var14];
                  var17 = param4.field_O[var14];
                  if (param4.field_w[var14] < dc.field_k.length) {
                    stackOut_22_0 = param4.field_w[var14];
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
                  if (dc.field_k.length > param4.field_q[var14]) {
                    stackOut_25_0 = param4.field_q[var14];
                    stackIn_26_0 = stackOut_25_0;
                    break L6;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_26_0;
                  if (param4.field_u[var14] >= dc.field_k.length) {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    break L7;
                  } else {
                    stackOut_27_0 = param4.field_u[var14];
                    stackIn_29_0 = stackOut_27_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_29_0;
                    if (ph.field_e == null) {
                      break L9;
                    } else {
                      if (param4.field_z == null) {
                        break L9;
                      } else {
                        if (var14 >= param4.field_z.length) {
                          break L9;
                        } else {
                          if ((param4.field_z[var14] ^ -1) == 0) {
                            break L9;
                          } else {
                            if (ph.field_e.length <= param4.field_z[var14]) {
                              break L9;
                            } else {
                              stackOut_34_0 = ph.field_e[param4.field_z[var14]];
                              stackIn_36_0 = stackOut_34_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_35_0 = null;
                  stackIn_36_0 = (gl) (Object) stackOut_35_0;
                  break L8;
                }
                L10: {
                  var21 = (gl) (Object) stackIn_36_0;
                  var22 = ud.field_p[var15];
                  var23 = v.field_g[var15];
                  var24 = ud.field_p[var16];
                  var25 = v.field_g[var16];
                  var26 = ud.field_p[var17];
                  var27 = v.field_g[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 != var20) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_40_0 = 8355711;
                          stackIn_41_0 = stackOut_40_0;
                          break L11;
                        } else {
                          stackOut_39_0 = var21.field_e;
                          stackIn_41_0 = stackOut_39_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_41_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = (16711781 & var32 * var28) >>> 285968936 | (-16711761 & var28 * var31) >>> 1588260008;
                      var33 = var33 + var29 * 65793;
                      c.a(var25, 83, (var33 & 16711422) >> -241180383, var23, var22, var27, var24, var26);
                      var44++;
                      continue L3;
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
                    stackOut_44_0 = 8355711;
                    stackIn_45_0 = stackOut_44_0;
                    break L12;
                  } else {
                    stackOut_43_0 = var21.field_e;
                    stackIn_45_0 = stackOut_43_0;
                    break L12;
                  }
                }
                var34 = stackIn_45_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = var28 * var36 >>> -1402220664 & -100598016 | var35 * var28 >>> 1072045256 & -755040001;
                var38 = var29 * var35 >>> 217872424 & -721485569 | var29 * var36 >>> -2004214840 & 1778450176;
                var38 = var38 + var32 * 65793;
                var39 = -989921025 & var35 * var30 >>> -992712824 | (var36 * var30 & 16711858) >>> -418996920;
                var37 = var37 + 65793 * var31;
                var39 = var39 + var33 * 65793;
                tn.a(255 & var37 >> 1648221512, var24, 255 & var38 >> 796612616, var23, -109, var37 >> 1787660272, var27, var38 >> 647816752, 255 & var37, var22, var39 >> 701458864, var25, var26, (var39 & 65321) >> 2024544584, 255 & var39, 255 & var38);
                var44++;
                continue L3;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param5 + var64[var13] * param0 + var65[var13] * param6 >> 1595783080;
              if (var14 < 0) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (0 <= var14) {
                if (var14 < 128) {
                  stackOut_13_0 = var14 + 128;
                  stackIn_14_0 = stackOut_13_0;
                  break L14;
                } else {
                  stackOut_12_0 = 256;
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
              var15 = param2 * var65[var13] - (-(param1 * var64[var13]) - var63[var13] * param7) >> 324749576;
              stackOut_14_0 = vf.field_n;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if ((var15 ^ -1) > -1) {
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
            var14 = var14 * (256 - var15) >>> -1755887768;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0) {
        if (param0 >= -98) {
          return;
        } else {
          L0: {
            if (!oj.field_i) {
              break L0;
            } else {
              de.b(de.field_i, de.field_c, de.field_h + -de.field_i, de.field_k + -de.field_c);
              co.field_f.a(false, true);
              break L0;
            }
          }
          return;
        }
    }

    final static int a(boolean param0, byte param1, int param2, hc param3, int param4, hc param5, String param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        wk stackIn_15_0 = null;
        wk stackIn_16_0 = null;
        wk stackIn_17_0 = null;
        String stackIn_17_1 = null;
        wk stackIn_18_0 = null;
        wk stackIn_19_0 = null;
        wk stackIn_20_0 = null;
        String stackIn_20_1 = null;
        wk stackOut_14_0 = null;
        wk stackOut_16_0 = null;
        String stackOut_16_1 = null;
        wk stackOut_15_0 = null;
        String stackOut_15_1 = null;
        wk stackOut_17_0 = null;
        wk stackOut_19_0 = null;
        String stackOut_19_1 = null;
        wk stackOut_18_0 = null;
        String stackOut_18_1 = null;
        L0: {
          var16 = null;
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          var15 = param5.b(85);
          var11_ref = var15;
          var11_ref = var15;
          var8 = param3.b(-68);
          var11_ref = var8;
          var11_ref = var8;
          if (ch.field_c == null) {
            if (!ie.a(-89, false)) {
              return -1;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == -91) {
            break L1;
          } else {
            var14 = null;
            cj.a(-75, -92, 61, -80, (vg) null, 40, 3, -5);
            break L1;
          }
        }
        L2: {
          if (ob.field_eb != pc.field_g) {
            break L2;
          } else {
            L3: {
              kj.field_e = null;
              he.field_e.field_g = 0;
              if (param6 == null) {
                L4: {
                  jf.field_a.field_g = 0;
                  jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                  jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                  stackOut_14_0 = jf.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (param5.a(true)) {
                    stackOut_16_0 = (wk) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_15_0 = (wk) (Object) stackIn_15_0;
                    stackOut_15_1 = "";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
                L5: {
                  ((wk) (Object) stackIn_17_0).a((String) (Object) stackIn_17_1, (byte) -115);
                  stackOut_17_0 = jf.field_a;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (param3.a(true)) {
                    stackOut_19_0 = (wk) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) var8;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L5;
                  } else {
                    stackOut_18_0 = (wk) (Object) stackIn_18_0;
                    stackOut_18_1 = "";
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L5;
                  }
                }
                ((wk) (Object) stackIn_20_0).a((String) (Object) stackIn_20_1, (byte) -92);
                he.field_e.f(16, (byte) -75);
                he.field_e.field_g = he.field_e.field_g + 1;
                var9 = he.field_e.field_g;
                vd.a(false, (wk) (Object) he.field_e, nl.field_Jb, jf.field_a, q.field_K);
                he.field_e.b(he.field_e.field_g + -var9, (byte) 43);
                break L3;
              } else {
                L6: {
                  var9 = 0;
                  jf.field_a.field_g = 0;
                  if (!param0) {
                    break L6;
                  } else {
                    var9 = var9 | 1;
                    break L6;
                  }
                }
                L7: {
                  jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                  jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
                  jf.field_a.a(var15, (byte) -100);
                  jf.field_a.a(var8, (byte) -96);
                  var17 = (CharSequence) (Object) param6;
                  jf.field_a.a(vl.a((byte) 106, var17), (byte) -92);
                  jf.field_a.c(param4, (byte) -73);
                  jf.field_a.f(param2, (byte) -118);
                  jf.field_a.f(var9, (byte) -62);
                  he.field_e.f(18, (byte) -114);
                  he.field_e.field_g = he.field_e.field_g + 2;
                  var10 = he.field_e.field_g;
                  var11_ref = gb.a(cd.e(121), param1 ^ 32);
                  if (var11_ref != null) {
                    break L7;
                  } else {
                    var11_ref = "";
                    break L7;
                  }
                }
                he.field_e.a(var11_ref, 23333);
                vd.a(false, (wk) (Object) he.field_e, nl.field_Jb, jf.field_a, q.field_K);
                he.field_e.a(he.field_e.field_g - var10, -19571);
                break L3;
              }
            }
            we.a(-1, (byte) 113);
            ob.field_eb = sb.field_f;
            break L2;
          }
        }
        L8: {
          if (ob.field_eb == sb.field_f) {
            if (pe.a((byte) -86, 1)) {
              L9: {
                var9 = df.field_z.e((byte) 56);
                df.field_z.field_g = 0;
                if ((var9 ^ -1) > -101) {
                  break L9;
                } else {
                  if ((var9 ^ -1) < -106) {
                    break L9;
                  } else {
                    ob.field_eb = ej.field_R;
                    ul.field_M = new String[-100 + var9];
                    break L8;
                  }
                }
              }
              if ((var9 ^ -1) == -249) {
                df.a(1, cd.e(param1 ^ -40));
                me.field_E = fo.field_c;
                ka.b(false);
                bb.field_h = false;
                return var9;
              } else {
                if (99 != var9) {
                  ob.field_eb = di.field_i;
                  fj.field_h = -1;
                  on.field_g = var9;
                  break L8;
                } else {
                  boolean discarded$1 = pe.a((byte) -86, oi.b(88));
                  kj.field_e = new Boolean(jo.a((wk) (Object) df.field_z, param1 + 89));
                  df.field_z.field_g = 0;
                  break L8;
                }
              }
            } else {
              break L8;
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (ob.field_eb != ej.field_R) {
            break L10;
          } else {
            var9 = 2;
            if (!pe.a((byte) -86, var9)) {
              break L10;
            } else {
              var10 = df.field_z.n(-98);
              df.field_z.field_g = 0;
              if (pe.a((byte) -86, var10)) {
                var11 = ul.field_M.length;
                var12 = 0;
                L11: while (true) {
                  if (var11 <= var12) {
                    ka.b(false);
                    bb.field_h = false;
                    return var11 + 100;
                  } else {
                    ul.field_M[var12] = df.field_z.e(-32461);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
        }
        L12: {
          if (ob.field_eb != di.field_i) {
            break L12;
          } else {
            if (!pn.b(-12564)) {
              break L12;
            } else {
              L13: {
                if ((on.field_g ^ -1) != -256) {
                  me.field_E = df.field_z.l(param1 + 90);
                  break L13;
                } else {
                  var9_ref = df.field_z.g(-112);
                  if (var9_ref != null) {
                    jf.a(var9_ref, cd.e(110), 0);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              ka.b(false);
              bb.field_h = false;
              return on.field_g;
            }
          }
        }
        if (null == ch.field_c) {
          if (!bb.field_h) {
            var9 = ng.field_G;
            ng.field_G = dh.field_Lb;
            dh.field_Lb = var9;
            bb.field_h = true;
            return -1;
          } else {
            L14: {
              if (-30001L <= (rk.a(-78) ^ -1L)) {
                me.field_E = wl.field_R;
                break L14;
              } else {
                me.field_E = tg.field_a;
                break L14;
              }
            }
            bb.field_h = false;
            return 249;
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show lobby chat from my friends";
        field_a = new int[]{24, 25, 26};
        field_e = "This password is part of your Player Name, and would be easy to guess";
    }
}
