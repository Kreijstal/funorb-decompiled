/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pi {
    int field_p;
    static we field_q;
    int field_o;
    int field_n;
    int field_r;
    static String[][] field_u;
    int field_t;
    int field_s;
    static String field_v;

    final static void a(int param0, int param1, int param2, int param3, pb param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ud var21 = null;
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
        pb var45 = null;
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
        ud stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        ud stackOut_37_0 = null;
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
            var40 = MinerDisturbance.field_ab;
            var45 = param4;
            if (var45.field_x == null) {
              break L1;
            } else {
              if (1 < var45.field_E) {
                var62 = var45.field_x;
                re.a(0, var62, di.field_V, 0, 0);
                break L0;
              } else {
                break L1;
              }
            }
          }
          wc.c((byte) -29);
          break L0;
        }
        L2: {
          var66 = new int[param4.field_g];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param4.field_g];
          var64 = fb.field_b;
          if (param0 == -1) {
            break L2;
          } else {
            vi discarded$1 = sl.e(-76);
            break L2;
          }
        }
        var65 = sf.field_a;
        var63 = h.field_a;
        var13 = 0;
        L3: while (true) {
          if (param4.field_g <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (ik.field_T <= var44) {
                return;
              } else {
                L5: {
                  var14 = ta.field_d[var44];
                  var15 = param4.field_e[var14];
                  var16 = param4.field_O[var14];
                  var17 = param4.field_F[var14];
                  if (param4.field_f[var14] >= fb.field_b.length) {
                    stackOut_25_0 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = param4.field_f[var14];
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_26_0;
                  if (param4.field_w[var14] >= fb.field_b.length) {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = param4.field_w[var14];
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_29_0;
                  if (fb.field_b.length <= param4.field_d[var14]) {
                    stackOut_31_0 = -1;
                    stackIn_32_0 = stackOut_31_0;
                    break L7;
                  } else {
                    stackOut_30_0 = param4.field_d[var14];
                    stackIn_32_0 = stackOut_30_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_32_0;
                    if (bl.field_v == null) {
                      break L9;
                    } else {
                      if (null == param4.field_G) {
                        break L9;
                      } else {
                        if (var14 >= param4.field_G.length) {
                          break L9;
                        } else {
                          if (param4.field_G[var14] == -1) {
                            break L9;
                          } else {
                            if (param4.field_G[var14] >= bl.field_v.length) {
                              break L9;
                            } else {
                              stackOut_37_0 = bl.field_v[param4.field_G[var14]];
                              stackIn_39_0 = stackOut_37_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_38_0 = null;
                  stackIn_39_0 = (ud) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_39_0;
                  var22 = wa.field_d[var15];
                  var23 = ti.field_O[var15];
                  var24 = wa.field_d[var16];
                  var25 = ti.field_O[var16];
                  var26 = wa.field_d[var17];
                  var27 = ti.field_O[var17];
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
                          stackOut_43_0 = 8355711;
                          stackIn_44_0 = stackOut_43_0;
                          break L11;
                        } else {
                          stackOut_42_0 = var21.field_d;
                          stackIn_44_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_44_0;
                      var31 = 16711935 & var30;
                      var32 = 65280 & var30;
                      var33 = (var28 * var31 & -16711816) >>> 261377096 | (var28 * var32 & 16711867) >>> -718191544;
                      var33 = var33 + var29 * 65793;
                      cn.a(var27, param0 ^ -1, var22, var25, var26, var23, var24, (16711422 & var33) >> -965410335);
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
                    stackOut_47_0 = var21.field_d;
                    stackIn_48_0 = stackOut_47_0;
                    break L12;
                  } else {
                    stackOut_46_0 = 8355711;
                    stackIn_48_0 = stackOut_46_0;
                    break L12;
                  }
                }
                var34 = stackIn_48_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = (var28 * var35 & -16711787) >>> -1868869848 | 2013331200 & var28 * var36 >>> 1904342248;
                var38 = var29 * var35 >>> -2097522936 & -2113994497 | (16711884 & var36 * var29) >>> 1516785960;
                var39 = -234815744 & var36 * var30 >>> 705494760 | 402587903 & var35 * var30 >>> 185046952;
                var38 = var38 + 65793 * var32;
                var37 = var37 + 65793 * var31;
                var39 = var39 + 65793 * var33;
                pd.a(var38 >> -220443472, var27, var38 & 255, (var37 & 65456) >> -1688209464, var39 >> 911807464 & 255, var37 >> -821951664, var24, var22, var23, (byte) -60, var39 & 255, 255 & var37, var26, var25, var39 >> 1325190416, (var38 & 65441) >> 1130205928);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param6 * var63[var13] + param3 * var64[var13] - -(param1 * var65[var13]) >> -752391992;
              if (-1 < var14) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-1 <= var14) {
                if ((var14 ^ -1) <= -129) {
                  stackOut_16_0 = 256;
                  stackIn_17_0 = stackOut_16_0;
                  break L14;
                } else {
                  stackOut_15_0 = var14 + 128;
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
              var15 = param5 * var65[var13] + param2 * var64[var13] - -(var63[var13] * param7) >> 2116216840;
              stackOut_17_0 = w.field_R;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((var15 ^ -1) <= -1) {
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
            var14 = var14 * (-var15 + 256) >>> -13617368;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_q = null;
        field_v = null;
        if (param0 != -3035) {
            field_v = null;
        }
    }

    final static vi e(int param0) {
        if (!(cn.field_v != null)) {
            cn.field_v = new vi();
            cn.field_v.a(65793, bn.field_d);
            cn.field_v.field_n = 14;
            cn.field_v.field_i = 0;
            cn.field_v.field_l = 4;
            cn.field_v.field_r = 6;
            cn.field_v.field_g = 7697781;
            cn.field_v.field_k = 2763306;
            cn.field_v.field_p = field_q;
            cn.field_v.field_d = 5;
        }
        if (param0 <= 91) {
            Object var2 = null;
            sl.a(24, -111, 101, 55, (pb) null, -25, -121, -35);
        }
        return cn.field_v;
    }

    final static hn a(byte param0, String param1, String param2, boolean param3) {
        CharSequence var7 = null;
        long var4 = 0L;
        if (param0 != 86) {
            vi discarded$0 = sl.e(78);
        }
        String var6 = null;
        if ((param1.indexOf('@') ^ -1) != 0) {
            var6 = param1;
        } else {
            var7 = (CharSequence) (Object) param1;
            var4 = ah.a(-97, var7);
        }
        return qg.a(var4, param2, 0, var6, param3);
    }

    sl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((sl) this).field_t = param2;
        ((sl) this).field_s = param3;
        ((sl) this).field_p = param1;
        ((sl) this).field_o = param5;
        ((sl) this).field_n = param0;
        ((sl) this).field_r = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[][]{new String[10], new String[9], new String[7], new String[10], new String[7], new String[9], new String[12], new String[9], new String[11], new String[7], new String[9], new String[9], new String[7], new String[7], new String[6]};
        field_v = "Type your password again to make sure it's correct";
    }
}
