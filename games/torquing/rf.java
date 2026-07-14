/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends pc {
    static int[][] field_q;
    private int field_y;
    static boolean[] field_x;
    private int field_v;
    private t[] field_s;
    private int field_w;
    static String field_u;
    static ei field_t;
    static int[] field_r;

    final static sm[] a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (param0 != 66) {
            return null;
        }
        sm[] var1 = new sm[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
            var1[var2] = new sm(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], pn.field_b[var2], cq.field_y);
        }
        go.b(0);
        return var1;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          if (!param4.field_s) {
            if (param4.g(2)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_6_0;
          if (param0 > 89) {
            break L1;
          } else {
            var9 = null;
            ((rf) this).a(-79, -81, -76, false, (gm) null);
            break L1;
          }
        }
        L2: {
          if (!(param4 instanceof lg)) {
            break L2;
          } else {
            param3 = param3 & ((lg) (Object) param4).field_x;
            break L2;
          }
        }
        L3: {
          if (param3) {
            if (var6 != 0) {
              stackOut_14_0 = ((rf) this).field_v;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = ((rf) this).field_w;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            }
          } else {
            stackOut_11_0 = ((rf) this).field_y;
            stackIn_15_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var7 = stackIn_15_0;
          if (!param3) {
            stackOut_17_0 = 7105644;
            stackIn_18_0 = stackOut_17_0;
            break L4;
          } else {
            stackOut_16_0 = 16777215;
            stackIn_18_0 = stackOut_16_0;
            break L4;
          }
        }
        var8 = stackIn_18_0;
        wp.a(param1 + (param4.field_k + (-((rf) this).field_s[0].field_u + param4.field_o >> 1640841537)), var7, param4.field_p, false, param4.field_w + param2, ((rf) this).field_s);
        int discarded$2 = ((rf) this).field_m.a(param4.field_m, param2 + param4.field_w, -2 + (param1 + param4.field_k), param4.field_p, param4.field_o, var8, -1, 1, 1, ((rf) this).field_m.field_x);
    }

    public static void b(byte param0) {
        field_x = null;
        field_q = null;
        field_r = null;
        field_t = null;
        if (param0 < 59) {
            field_r = null;
        }
        field_u = null;
    }

    final static int a(String[] args, uc param1, int param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Torquing.field_u;
          var5 = param1.a(param4);
          if (param2 < var5) {
            break L0;
          } else {
            if (-1 == param4.indexOf("<br>")) {
              args[0] = (String) (Object) args;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (-1 + param2 + var5) / param2;
          param2 = var5 / var6;
          var6 = 0;
          if (param3 >= 51) {
            break L1;
          } else {
            field_u = null;
            break L1;
          }
        }
        var7 = 0;
        var8 = param4.length();
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                var6++;
                args[var6] = param4.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param4.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param1.a(var11);
              if (param2 <= var12) {
                var6++;
                args[var6] = var11;
                var7 = var9 + 1;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                var6++;
                args[var6] = param4.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    public rf() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param1 <= 35) {
            field_r = null;
        }
        qp.field_j = (param0 & 63) >> -1649279804;
        if ((qp.field_j ^ -1) < -3) {
            qp.field_j = 2;
        }
        fj.field_k = param0 >> -2139565534 & 3;
        if (fj.field_k > 2) {
            fj.field_k = 2;
        }
        m.field_l = param0 & 3;
        if (m.field_l > 2) {
            m.field_l = 2;
        }
    }

    private rf(int param0, int param1, int param2) {
        ((rf) this).field_s = dg.field_g;
        ((rf) this).field_y = param2;
        ((rf) this).field_v = param1;
        ((rf) this).field_w = param0;
        ((rf) this).field_m = pe.field_E;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[][]{new int[9], new int[6], new int[2], new int[3], new int[3], new int[0], new int[2], new int[2], new int[2], new int[5], new int[1], new int[2]};
        field_x = new boolean[field_q.length];
        field_x[4] = true;
        field_x[11] = true;
        field_x[3] = true;
        field_t = new ei();
    }
}
