/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends am {
    int[] field_s;
    static String field_t;
    int field_u;
    static int field_w;
    static long field_v;
    int field_x;
    private int field_y;

    int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var11 = Torquing.field_u;
          var16 = ((ro) this).field_r.a(15142, param1);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((ro) this).field_r.field_b) {
            break L0;
          } else {
            if (((ro) this).c(-31292)) {
              L1: {
                var4 = var16[0];
                var5 = var16[1];
                var6 = var16[2];
                if (((ro) this).field_u == um.field_o) {
                  stackOut_5_0 = param1;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((ro) this).field_u * param1 / um.field_o;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var7 = stackIn_6_0 * ((ro) this).field_x;
              if (((ro) this).field_x == ci.field_c) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    var7++;
                    var9 = ((ro) this).field_s[var7];
                    var6[var8] = ie.a(255, var9) << 1134694212;
                    var5[var8] = ie.a(65280, var9) >> -1089780060;
                    var4[var8] = ie.a(16711680, var9) >> -1214938676;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    var9 = var8 * ((ro) this).field_x / ci.field_c;
                    var10 = ((ro) this).field_s[var7 - -var9];
                    var6[var8] = ie.a(255, var10) << -1779983836;
                    var5[var8] = ie.a(65280, var10) >> 422875844;
                    var4[var8] = ie.a(16711680, var10) >> 140259180;
                    var8++;
                    continue L3;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param0 == -29116) {
          return var3;
        } else {
          return null;
        }
    }

    final int e(byte param0) {
        if (param0 <= 26) {
            return -10;
        }
        return ((ro) this).field_y;
    }

    final static String b(int param0) {
        if (2 > b.field_x) {
            return ip.field_c;
        }
        if (null != je.field_f) {
            if (!je.field_f.a(-12749)) {
                return Torquing.field_w;
            }
            return md.field_b;
        }
        if (!lp.field_a.a(-12749)) {
            return bo.field_i;
        }
        if (!(lp.field_a.a(true, "commonui"))) {
            return db.field_d + " - " + lp.field_a.a((byte) 102, "commonui") + "%";
        }
        if (param0 > -93) {
            field_t = null;
        }
        if (!eg.field_v.a(-12749)) {
            return ol.field_e;
        }
        if (!eg.field_v.a(true, "commonui")) {
            return l.field_c + " - " + eg.field_v.a((byte) 50, "commonui") + "%";
        }
        if (!(kb.field_a.a(-12749))) {
            return ci.field_d;
        }
        if (!(kb.field_a.c(-19375))) {
            return la.field_b + " - " + kb.field_a.a((byte) -32) + "%";
        }
        return pm.field_p;
    }

    public static void g(byte param0) {
        field_t = null;
        if (param0 < 112) {
            field_w = 110;
        }
    }

    final boolean c(int param0) {
        if (((ro) this).field_s != null) {
            return true;
        }
        if (param0 != -31292) {
            return true;
        }
        if ((((ro) this).field_y ^ -1) > -1) {
            return false;
        }
        tc var2 = 0 <= po.field_u ? tc.a(vf.field_a, po.field_u, ((ro) this).field_y) : tc.a(vf.field_a, ((ro) this).field_y);
        var2.b();
        ((ro) this).field_s = var2.c();
        ((ro) this).field_u = var2.field_e;
        ((ro) this).field_x = var2.field_d;
        return true;
    }

    final void a(fj param0, int param1, int param2) {
        if (param1 != 35) {
            ((ro) this).field_x = -83;
        }
        if (!(0 != param2)) {
            ((ro) this).field_y = param0.i(7088);
        }
    }

    final void d(byte param0) {
        int var2 = -128 % ((-63 - param0) / 62);
        super.d((byte) 91);
        ((ro) this).field_s = null;
    }

    public ro() {
        super(0, false);
        ((ro) this).field_y = -1;
    }

    final static boolean a(byte param0, la param1, la param2, la param3) {
        int var4 = 0;
        if (!param1.a(-12749)) {
          return false;
        } else {
          if (param1.a(true, "commonui")) {
            L0: {
              if (!param3.a(-12749)) {
                break L0;
              } else {
                if (!param3.a(true, "commonui")) {
                  break L0;
                } else {
                  L1: {
                    var4 = -28 / ((param0 - -42) / 52);
                    if (!param2.a(-12749)) {
                      break L1;
                    } else {
                      if (param2.a(true, "button.gif")) {
                        return true;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = -1;
        field_t = "LOW";
    }
}
