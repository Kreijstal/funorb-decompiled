/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ng {
    static String field_T;
    private int field_S;
    static boolean field_P;
    static eg field_R;
    static int[] field_Q;
    private wd field_O;

    public static void c(byte param0) {
        field_T = null;
        if (param0 < 68) {
            field_R = null;
        }
        field_Q = null;
        field_R = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        var5 = vb.field_a[param3][param0];
        var6 = 1 + var5;
        var7 = var5 - 1;
        var8 = gl.field_l[param3][param0][1][0];
        var9 = gl.field_l[param3][param0][1][1];
        var10 = var9 + -var8;
        if (var10 > 0) {
          L0: {
            var11 = ic.field_E[vb.field_a[param3][param0]][param2];
            if ((var11 & 32 ^ -1) >= -1) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var12 = stackIn_5_0;
            var13 = 0;
            if ((var7 ^ -1) <= -1) {
              break L1;
            } else {
              var7 += 64;
              break L1;
            }
          }
          L2: {
            if (64 > var6) {
              break L2;
            } else {
              var6 -= 64;
              break L2;
            }
          }
          L3: {
            var14 = 0;
            var11 = ic.field_E[var6][param2];
            if ((var11 & 32) <= 0) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L3;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L3;
            }
          }
          L4: {
            var13 = stackIn_12_0;
            var11 = ic.field_E[var7][param2];
            if ((var11 & 32) <= 0) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L4;
            } else {
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            }
          }
          L5: {
            var14 = stackIn_15_0;
            if (null == kj.field_C) {
              break L5;
            } else {
              if (null == kj.field_C[0]) {
                break L5;
              } else {
                L6: {
                  var15 = kj.field_C[0].field_v;
                  var16 = param1 + (64 - var15);
                  var17 = var16;
                  var18 = param1 + param4;
                  var19 = 0;
                  if (var14 == 0) {
                    if (var12 == 0) {
                      if (var13 != 0) {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = 0;
                        stackIn_27_0 = stackOut_24_0;
                        break L6;
                      }
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_27_0 = stackOut_22_0;
                      break L6;
                    }
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_27_0 = stackOut_20_0;
                    break L6;
                  }
                }
                var19 = stackIn_27_0;
                if (var19 == 0) {
                  return;
                } else {
                  ll.a(var17, 0, var8, var5, var14 != 0, var13 != 0, var12 != 0, var16, -1, var18, true, var9);
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(ee param0, int param1) {
        if (param1 != 0) {
            ((tk) this).a(-59, 121, false, 81);
        }
        return false;
    }

    final static void a(int param0) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        byte[] var14 = bh.field_q.a(-2, "font", "");
        byte[] var12 = var14;
        byte[] var10 = var12;
        byte[] var8 = var10;
        byte[] var7 = var8;
        byte[] var1 = var7;
        ge[] var2 = mh.a(122, ic.field_C, "font", "");
        fc.field_p = id.a(var14, var2, 256);
        rh var3 = vh.a(var2, 2, 33, var14, 16301089, 8015912);
        tf.field_x = (eg) (Object) var3;
        if (param0 < 101) {
            tk.c((byte) 15);
        }
        int[] var15 = var3.field_O[0];
        int[] var13 = var15;
        int[] var11 = var13;
        int[] var9 = var11;
        int[] var4 = var9;
        if ((var3.field_O.length ^ -1) > -2) {
            var3.field_O = new int[1][];
        }
        var3.field_O[0] = var15;
        for (var5 = 1; var5 < 2; var5++) {
            var3.field_O[var5] = new int[var15.length];
            he.a(var4, 0, var3.field_O[var5], 0, var15.length);
        }
        var3.field_O[1][2] = 8015912;
        var3.field_O[1][1] = 16301089;
        var3.field_x = 17;
        var3.field_O[0][1] = 15057307;
        var3.field_O[0][2] = 6488064;
        var3.field_K = 5;
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        if (param2 > -97) {
            return;
        }
        ((tk) this).field_S = ((tk) this).field_S + 1;
        super.a(param0, param1, (byte) -112, param3);
    }

    final String b(boolean param0) {
        if (param0) {
            tk.b(-20, -30, -128, 99, -33);
        }
        if (!((tk) this).field_w) {
            return null;
        }
        return ((tk) this).field_O.a((byte) -10);
    }

    final static String a(String param0, lj param1, String param2, int param3) {
        if (param3 != 256) {
            field_R = null;
        }
        if (!(param1.b(param3 + -8213))) {
            return param0;
        }
        return param2 + " - " + param1.c(param3 + -197) + "%";
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ka var12 = null;
        ka var13 = null;
        ka var14 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (-1 == (param3 ^ -1)) {
          L0: {
            if (!param2) {
              break L0;
            } else {
              field_Q = null;
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = ((tk) this).field_m + param1 + (((tk) this).field_p >> 396851905);
              var6 = (((tk) this).field_l >> -1753820863) + ((tk) this).field_i + param0;
              var8 = ((tk) this).field_O.b(-53);
              if (bl.field_S == var8) {
                break L2;
              } else {
                if (jh.field_c != var8) {
                  if (lk.field_c == var8) {
                    var14 = ub.field_f[2];
                    var14.b(var5 + -(var14.field_u >> 120178721), var6 - (var14.field_x >> -293639935), 256);
                    break L1;
                  } else {
                    if (var8 == tf.field_w) {
                      var13 = ub.field_f[1];
                      var13.b(-(var13.field_u >> -1697952255) + var5, var6 + -(var13.field_x >> 1040006945), 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                var12 = ub.field_f[0];
                var9 = var12.field_q << 214653569;
                var10 = var12.field_v << -1271572383;
                if (lh.field_v == null) {
                  break L4;
                } else {
                  if (var9 > lh.field_v.field_u) {
                    break L4;
                  } else {
                    if (var10 <= lh.field_v.field_x) {
                      ad.a(-50, lh.field_v);
                      qg.b();
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              lh.field_v = new ka(var9, var10);
              ad.a(120, lh.field_v);
              break L3;
            }
            var12.b(112, 144, var12.field_q << 669511684, var12.field_v << -1669722332, -((tk) this).field_S << 2089716394, 4096);
            ie.b((byte) -9);
            lh.field_v.b(var5 + -var12.field_q, var6 - var12.field_v, 256);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    tk(wd param0) {
        ((tk) this).field_O = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "to return to the normal view.";
        field_Q = new int[]{6, 6, 7, 7, 7, 7};
    }
}
