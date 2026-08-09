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
          return (ad[]) null;
        } else {
          return new ad[]{hl.field_c, am.field_b, tp.field_y, m.field_d, kj.field_p, u.field_U, og.field_c, ib.field_h, cm.field_T, ve.field_e, pm.field_l, hf.field_wb, sj.field_hb, lg.field_n};
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, cn[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param0 <= 0) {
                  break L1;
                } else {
                  var6_int = param5[0].field_E;
                  var8 = 96 / ((79 - param3) / 43);
                  var7 = param5[2].field_E;
                  var9 = param5[1].field_E;
                  param5[0].a(param2, param1, param4);
                  param5[2].a(-var7 + param2 + param0, param1, param4);
                  gf.a(mk.field_i);
                  gf.a(var6_int + param2, param1, param0 + param2 + -var7, param5[1].field_G + param1);
                  var10 = param2 - -var6_int;
                  var11 = param0 + (param2 - var7);
                  param2 = var10;
                  L2: while (true) {
                    if (var11 <= param2) {
                      gf.b(mk.field_i);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5[1].a(param2, param1, param4);
                      param2 = param2 + var9;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("ad.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
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
        this.field_b = param0;
        this.field_a = param3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, qh param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        sm stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
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
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        var40 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param7;
                if (null == var45.field_y) {
                  break L2;
                } else {
                  if (1 < var45.field_w) {
                    var61 = var45.field_y;
                    ll.a(0, var61, true, 0, hk.field_b);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              sf.d(3);
              break L1;
            }
            var55 = new int[param7.field_c];
            var50 = var55;
            var41 = var50;
            var8 = var41;
            var65 = new int[param7.field_c];
            var64 = hk.field_c;
            var63 = p.field_x;
            var62 = hd.field_j;
            var13 = 0;
            L3: while (true) {
              if (param7.field_c <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (ab.field_c <= var44) {
                    var14 = -34 / ((-24 - param4) / 58);
                    break L0;
                  } else {
                    L5: {
                      var14 = hf.field_yb[var44];
                      var15 = param7.field_A[var14];
                      var16 = param7.field_x[var14];
                      var17 = param7.field_N[var14];
                      if ((param7.field_e[var14] ^ -1) <= (hk.field_c.length ^ -1)) {
                        stackIn_24_0 = -1;
                        break L5;
                      } else {
                        stackIn_24_0 = param7.field_e[var14];
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_24_0;
                      if (hk.field_c.length <= param7.field_s[var14]) {
                        stackIn_27_0 = -1;
                        break L6;
                      } else {
                        stackIn_27_0 = param7.field_s[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (param7.field_F[var14] < hk.field_c.length) {
                        stackIn_30_0 = param7.field_F[var14];
                        break L7;
                      } else {
                        stackIn_30_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (ch.field_n == null) {
                          break L9;
                        } else {
                          if (null == param7.field_o) {
                            break L9;
                          } else {
                            if (param7.field_o.length <= var14) {
                              break L9;
                            } else {
                              if (-1 == param7.field_o[var14]) {
                                break L9;
                              } else {
                                if (ch.field_n.length > param7.field_o[var14]) {
                                  stackIn_38_0 = ch.field_n[param7.field_o[var14]];
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_38_0 = null;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21 = stackIn_38_0;
                        var22 = nj.field_g[var15];
                        var23 = ra.field_b[var15];
                        var24 = nj.field_g[var16];
                        var25 = ra.field_b[var16];
                        var26 = nj.field_g[var17];
                        var27 = ra.field_b[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var19 != var20) {
                            break L11;
                          } else {
                            L12: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21 != null) {
                                stackIn_43_0 = var21.field_d;
                                break L12;
                              } else {
                                stackIn_43_0 = 8355711;
                                break L12;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var31 * var28 >>> 889904488 & -352386817 | (var32 * var28 & 16711692) >>> -2045898648;
                            var33 = var33 + 65793 * var29;
                            kd.a(var24, var22, var26, var23, 29108, 8355711 & var33 >> -377316671, var27, var25);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21 != null) {
                          stackIn_47_0 = var21.field_d;
                          break L13;
                        } else {
                          stackIn_47_0 = 8355711;
                          break L13;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = 1040122111 & var35 * var28 >>> 1129075784 | var28 * var36 >>> 1505705224 & 218169088;
                      var38 = -889257729 & var35 * var29 >>> 1738047720 | (var29 * var36 & 16711759) >>> -1204791064;
                      var39 = var36 * var30 >>> -402316920 & -436142336 | (-16711837 & var30 * var35) >>> -1231302904;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + 65793 * var32;
                      var39 = var39 + var33 * 65793;
                      fg.a(var27, var39 & 255, var25, var23, 255 & var37 >> -945003256, var39 >> 1404147472, var38 >> 1571767280, var39 >> -1795086008 & 255, (var38 & 65466) >> -711620184, var37 >> 1882332016, 255 & var38, var22, (byte) -86, 255 & var37, var24, var26);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var62[var13] + (param1 * var63[var13] + var64[var13] * param2) >> -1393140184;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackIn_15_0 = 128;
                    break L15;
                  } else {
                    if ((var14 ^ -1) > -129) {
                      stackIn_15_0 = 128 + var14;
                      break L15;
                    } else {
                      stackIn_15_0 = 256;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = var62[var13] * param3 + param0 * var63[var13] + var64[var13] * param5 >> -415611032;
                  stackIn_17_0 = jk.field_Bb;

                  if (0 <= var15) {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = var15;
                    break L16;
                  } else {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = -var15;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (-var15 + 256) * var14 >>> 1625693384;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8_ref = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var8_ref);

            stackIn_53_1 = new StringBuilder().append("ad.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L17;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L17;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
    }

    static {
        field_c = "Passwords can only contain letters and numbers";
    }
}
