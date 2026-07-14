/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int field_a;
    int field_d;
    int[] field_h;
    String field_c;
    static String field_b;
    private String field_f;
    int field_i;
    private boolean field_g;
    static int[] field_m;
    static pc field_l;
    private long field_j;
    static int field_e;
    private int field_k;

    final int a(int param0) {
        int var2 = 0;
        if (!((oc) this).field_g) {
          if (-3 == (((oc) this).field_a ^ -1)) {
            if ((((oc) this).field_k ^ -1) >= -1) {
              if (((oc) this).field_j == he.field_e) {
                return 1;
              } else {
                if (rk.field_d == 2) {
                  if (!bj.a(true, ((oc) this).field_f)) {
                    var2 = -28 % ((9 - param0) / 60);
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  var2 = -28 % ((9 - param0) / 60);
                  return 0;
                }
              }
            } else {
              return 2;
            }
          } else {
            if (((oc) this).field_j == he.field_e) {
              return 1;
            } else {
              if (rk.field_d == 2) {
                if (!bj.a(true, ((oc) this).field_f)) {
                  var2 = -28 % ((9 - param0) / 60);
                  return 0;
                } else {
                  return 1;
                }
              } else {
                var2 = -28 % ((9 - param0) / 60);
                return 0;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Confined.field_J ? 1 : 0;
        boolean discarded$12 = vg.field_Z.a(true, true, ih.field_b, jf.field_k);
        vg.field_Z.i((byte) 70);
        L0: while (true) {
          if (!nm.e((byte) -96)) {
            if (0 != (qn.field_n ^ -1)) {
              var1 = qn.field_n;
              vf.a((byte) -115, -1);
              return var1;
            } else {
              if (param0 == 1) {
                if (s.field_K) {
                  return 3;
                } else {
                  if (wh.field_fb == na.field_S) {
                    return 1;
                  } else {
                    if (!fb.field_a.c(17237)) {
                      return 1;
                    } else {
                      if (wh.field_fb == oe.field_Q) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              } else {
                field_b = null;
                if (s.field_K) {
                  return 3;
                } else {
                  if (wh.field_fb == na.field_S) {
                    return 1;
                  } else {
                    if (!fb.field_a.c(17237)) {
                      return 1;
                    } else {
                      if (wh.field_fb == oe.field_Q) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              }
            }
          } else {
            boolean discarded$13 = vg.field_Z.a((byte) 101, ad.field_h, gk.field_r);
            continue L0;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Confined.field_J ? 1 : 0;
        while (true) {
            param8--;
            if (-1 < (param8 ^ -1)) {
                break;
            }
            var17 = param1;
            var10_ref_int__ = var17;
            var11 = param0;
            var12 = param3;
            var13 = param4;
            var14 = param5;
            var15 = (16711422 & var17[var11]) >> 1339084289;
            var10_ref_int__[var11] = var15 - -(va.a(var12, 33423360) >> 1608153985) - -va.a(var13 >> -205603735, 65280) - -(va.a(33487527, var14) >> -1526582223);
            param4 = param4 + param9;
            param3 = param3 + param7;
            param5 = param5 + param6;
            param0++;
        }
        int var10 = -119 / ((param2 - 2) / 51);
    }

    public static void c(int param0) {
        field_l = null;
        field_b = null;
        int var1 = 26 % ((-60 - param0) / 41);
        field_m = null;
    }

    oc(boolean param0) {
        ((oc) this).field_i = qd.field_d;
        ((oc) this).field_j = rl.field_x;
        if (!param0) {
            ((oc) this).field_h = null;
        } else {
            ((oc) this).field_h = lk.field_b;
        }
        ((oc) this).field_f = ej.field_d;
        ((oc) this).field_g = im.field_c;
        ((oc) this).field_c = q.field_j;
        ((oc) this).field_a = cc.field_m;
        ((oc) this).field_d = ha.field_e;
        ((oc) this).field_k = ve.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create a free account to start using this feature";
        field_e = 67;
    }
}
