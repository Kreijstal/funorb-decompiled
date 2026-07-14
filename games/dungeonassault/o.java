/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends ne {
    static String field_l;
    static long field_j;
    static wm field_n;
    int field_p;
    fa field_k;
    static ae field_i;
    static String field_q;
    static int field_m;
    static gj field_o;

    final static void a(int param0, int param1, jd param2) {
        wj var3 = ac.field_B;
        var3.d((byte) -122, param0);
        int var4 = -95 % ((-66 - param1) / 54);
        var3.a(6, param2.field_m);
        var3.i(param2.field_k, -128);
    }

    public static void d(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_l = null;
        field_o = null;
        field_i = null;
        field_q = null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 31) {
            return true;
        }
        return ua.a((byte) 122, false, param1);
    }

    final static void a(int param0, String param1, int param2) {
        ac var3 = gh.field_i[param2];
        if (param0 != 11404) {
            return;
        }
        if (!(var3 != null)) {
            return;
        }
        var3.field_d = tp.a(kf.field_p, "idle", param1, param0 ^ -11074);
        var3.field_u = tp.a(kf.field_p, "victory", param1, -1998);
        var3.field_m = tp.a(kf.field_p, "defeat", param1, -1998);
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param0 != 16711680) {
            Object var5 = null;
            o.a(-52, (String) null, 46);
        }
        return wk.c(false);
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = tg.field_f[param0][param2];
        if (!(!ke.a(57, var3))) {
            return 439;
        }
        if (param1 < 93) {
            field_i = null;
        }
        return param2 * tg.field_d[param0] + tg.field_h[param0];
    }

    final static boolean a(int[] param0, int[] param1, int param2, lb param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var7 = DungeonAssault.field_K;
        if (mh.a(116, param2)) {
          if (param2 == ek.field_c) {
            return true;
          } else {
            param2 = param2 & 127;
            if (wh.field_a > param2) {
              if (param2 >= cp.field_R) {
                L0: {
                  L1: {
                    if (param1 == null) {
                      break L1;
                    } else {
                      if (!vl.a(param2 + -cp.field_R, -109, param1)) {
                        break L1;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                }
                return stackIn_13_0 != 0;
              } else {
                if (ok.field_z > param2) {
                  L2: {
                    if (param4) {
                      break L2;
                    } else {
                      var8 = null;
                      o.a(52, -4, (int[]) null, -63, (int[]) null, -53, -87, 107, -97, 7, 14);
                      break L2;
                    }
                  }
                  if (gn.field_d <= param2) {
                    L3: {
                      if (ci.field_s[param2 + -gn.field_d] > param3.field_z) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L3;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        break L3;
                      }
                    }
                    return stackIn_23_0 != 0;
                  } else {
                    if (uf.field_a > param2) {
                      if (wm.field_a <= param2) {
                        L4: {
                          if (dc.field_p[-wm.field_a + param2] > param3.field_f) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            break L4;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            break L4;
                          }
                        }
                        return stackIn_37_0 != 0;
                      } else {
                        return false;
                      }
                    } else {
                      var5 = 0;
                      var6 = 0;
                      L5: while (true) {
                        if ((var6 ^ -1) <= -7) {
                          L6: {
                            if (var5 < hb.field_m[param2 - uf.field_a]) {
                              stackOut_30_0 = 0;
                              stackIn_31_0 = stackOut_30_0;
                              break L6;
                            } else {
                              stackOut_29_0 = 1;
                              stackIn_31_0 = stackOut_29_0;
                              break L6;
                            }
                          }
                          return stackIn_31_0 != 0;
                        } else {
                          var5 = var5 + param3.field_J[var6];
                          var6++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  return vl.a(bl.field_n[-ok.field_z + param2], -93, param0);
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    o(fa param0, int param1) {
        ((o) this).field_p = param1;
        ((o) this).field_k = param0;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = DungeonAssault.field_K;
        if (param8 != 0) {
            return;
        }
        int var11 = -param6 + 256;
        for (var12 = -param5; 0 > var12; var12++) {
            for (var13 = -param0; 0 > var13; var13++) {
                param3++;
                param1 = param4[param3];
                var14 = param2[param7];
                param7++;
                param2[param7] = mp.a(nb.a(param6 * nb.a(65280, param1) + nb.a(var14, 65280) * var11, 16711680), nb.a(-16711936, nb.a(16711935, param1) * param6 - -(nb.a(16711935, var14) * var11))) >>> -341855000;
            }
            param7 = param7 + param9;
            param3 = param3 + param10;
        }
    }

    final static void a(int param0) {
        kn.field_g = false;
        if (param0 <= 110) {
            Object var2 = null;
            o.a(-101, (String) null, 102);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Thief";
        field_n = new wm(25);
        field_q = "Single-player game";
    }
}
