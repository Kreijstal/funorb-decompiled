/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int field_e;
    static long[] field_d;
    int field_c;
    static long[][] field_a;
    static String[] field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(jk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        a var21 = null;
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
        Object var41 = null;
        int[] var42 = null;
        int var45 = 0;
        jk var46 = null;
        int[] var51 = null;
        int[] var56 = null;
        int[] var61 = null;
        byte[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        a stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        a stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
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
            var40 = Bounce.field_N;
            var46 = param0;
            if (null == var46.field_v) {
              break L1;
            } else {
              if (-2 > (var46.field_w ^ -1)) {
                var63 = var46.field_v;
                ed.a(oc.field_a, 0, -113, 0, var63);
                break L0;
              } else {
                break L1;
              }
            }
          }
          w.a(-15);
          break L0;
        }
        var67 = new int[param0.field_d];
        var61 = var67;
        var56 = var61;
        var51 = var56;
        var42 = var51;
        var8 = var42;
        var68 = new int[param0.field_d];
        var64 = uc.field_D;
        var65 = ih.field_db;
        var66 = nk.field_b;
        var13 = 0;
        L2: while (true) {
          if (var13 >= param0.field_d) {
            L3: {
              if (param7 < -77) {
                break L3;
              } else {
                var41 = null;
                eh.a((jk) null, 9, 103, 78, 54, -25, 73, 112);
                break L3;
              }
            }
            var45 = 0;
            var13 = var45;
            L4: while (true) {
              if (lb.field_b <= var45) {
                return;
              } else {
                L5: {
                  var14 = lb.field_c[var45];
                  var15 = param0.field_O[var14];
                  var16 = param0.field_P[var14];
                  var17 = param0.field_l[var14];
                  if (param0.field_F[var14] < uc.field_D.length) {
                    stackOut_24_0 = param0.field_F[var14];
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
                  if (param0.field_I[var14] < uc.field_D.length) {
                    stackOut_27_0 = param0.field_I[var14];
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
                  if (param0.field_Q[var14] >= uc.field_D.length) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param0.field_Q[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (wi.field_g == null) {
                      break L9;
                    } else {
                      if (param0.field_p == null) {
                        break L9;
                      } else {
                        if (var14 >= param0.field_p.length) {
                          break L9;
                        } else {
                          if (-1 == param0.field_p[var14]) {
                            break L9;
                          } else {
                            if (wi.field_g.length <= param0.field_p[var14]) {
                              break L9;
                            } else {
                              stackOut_36_0 = wi.field_g[param0.field_p[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (a) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = ca.field_c[var15];
                  var23 = kg.field_g[var15];
                  var24 = ca.field_c[var16];
                  var25 = kg.field_g[var16];
                  var26 = ca.field_c[var17];
                  var27 = kg.field_g[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var20 != var19) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var67[var18];
                        var29 = var68[var18];
                        if (var21 != null) {
                          stackOut_42_0 = var21.field_d;
                          stackIn_43_0 = stackOut_42_0;
                          break L11;
                        } else {
                          stackOut_41_0 = 8355711;
                          stackIn_43_0 = stackOut_41_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_43_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = 1157693184 & var32 * var28 >>> 1661822760 | -1795227393 & var31 * var28 >>> 20808488;
                      var33 = var33 + 65793 * var29;
                      gi.a(11, var23, var25, var26, var27, var33 >> -1446440191 & 8355711, var22, var24);
                      var45++;
                      continue L4;
                    }
                  }
                }
                L12: {
                  var28 = var67[var18];
                  var29 = var67[var19];
                  var30 = var67[var20];
                  var31 = var68[var18];
                  var32 = var68[var19];
                  var33 = var68[var20];
                  if (var21 != null) {
                    stackOut_46_0 = var21.field_d;
                    stackIn_47_0 = stackOut_46_0;
                    break L12;
                  } else {
                    stackOut_45_0 = 8355711;
                    stackIn_47_0 = stackOut_45_0;
                    break L12;
                  }
                }
                var34 = stackIn_47_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = (var36 * var28 & 16711927) >>> 1168908584 | (var35 * var28 & -16711881) >>> -1543485304;
                var38 = (var35 * var29 & -16711928) >>> 730152104 | (var29 * var36 & 16711731) >>> 77096008;
                var37 = var37 + var31 * 65793;
                var39 = -385941249 & var30 * var35 >>> -180546040 | (16711929 & var30 * var36) >>> -576033656;
                var38 = var38 + var32 * 65793;
                var39 = var39 + var33 * 65793;
                ud.a(var22, 255 & var37 >> -865663768, (var39 & 65522) >> -1365350744, 255 & var38, var38 >> 112177520, 255 & var37, var37 >> 887218448, 100000, var39 >> 2018904464, var25, var27, 255 & var38 >> 729013352, 255 & var39, var23, var24, var26);
                var45++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param3 * var64[var13] - -(var65[var13] * param6) - -(var66[var13] * param4) >> 1751930312;
              if (var14 >= 0) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 > var14) {
                stackOut_13_0 = 128;
                stackIn_14_0 = stackOut_13_0;
                break L14;
              } else {
                if (-129 < (var14 ^ -1)) {
                  stackOut_12_0 = var14 + 128;
                  stackIn_14_0 = stackOut_12_0;
                  break L14;
                } else {
                  stackOut_11_0 = 256;
                  stackIn_14_0 = stackOut_11_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_14_0;
              var15 = param2 * var65[var13] + (param1 * var64[var13] + param5 * var66[var13]) >> -1988652792;
              stackOut_14_0 = jl.field_b;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var15 < 0) {
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
            var14 = var14 * (-var15 + 256) >>> -776929144;
            var67[var13] = var14;
            var68[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    eh(int param0, int param1, int param2, int param3) {
        ((eh) this).field_c = param3;
        ((eh) this).field_e = param0;
    }

    final static int[] a(int param0) {
        if (param0 >= -110) {
            field_b = null;
        }
        return new int[8];
    }

    final static void a(boolean param0) {
        if (sj.field_f == null) {
            return;
        }
        mh.a((java.awt.Canvas) (Object) sj.field_f, (byte) 112);
        sj.field_f.a((byte) -113, ck.field_e);
        sj.field_f = null;
        if (vd.field_b != null) {
            vd.field_b.a((byte) -84);
        }
        if (!param0) {
            Object var2 = null;
            eh.a((jk) null, 33, -117, 56, -22, 94, 101, 77);
        }
        ch.field_h.requestFocus();
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= 51) {
            eh.a(false);
        }
        field_a = null;
    }

    final static void a(String param0, byte param1) {
        if (param1 != 21) {
            field_d = null;
        }
        kg.field_j = param0;
        oh.a(-92, 12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_a = new long[8][256];
        field_d = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 <= -257) {
            field_d[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
              } else {
                var1 = var0 * 8 - 8;
                field_d[var0] = hf.a(tk.a(255L, field_a[7][7 + var1]), hf.a(tk.a(field_a[6][6 + var1], 65280L), hf.a(tk.a(field_a[5][5 + var1], 16711680L), hf.a(hf.a(hf.a(hf.a(tk.a(field_a[1][var1 - -1], 71776119061217280L), tk.a(-72057594037927936L, field_a[0][var1])), tk.a(280375465082880L, field_a[2][var1 - -2])), tk.a(1095216660480L, field_a[3][3 + var1])), tk.a(field_a[4][var1 - -4], 4278190080L)))));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (-1 != (var0 & 1)) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 585767432);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -198422079;
              if (-257L >= (var4 ^ -1L)) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -532867903;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << -298354367;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_a[0][var0] = jd.a(var12, jd.a(jd.a(jd.a(jd.a(jd.a(var6 << -1772494040, jd.a(var2 << 1226088632, var2 << 2108866928)), var2 << -1273140896), var10 << -328941800), var8 << -35790256), var4 << -398316856));
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_a[var14][var0] = jd.a(field_a[var14 + -1][var0] << 1242028024, field_a[-1 + var14][var0] >>> -756237048);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
