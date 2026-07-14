/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static String field_a;
    static int[][] field_c;
    static String field_g;
    static String field_d;
    static String field_e;
    static kl field_b;
    static int[] field_f;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = sm.field_d;
        var3 = ko.field_b;
        var4 = eq.field_h.field_Z.c(param1, 500);
        var5 = 6 + eq.field_h.field_Z.a(param1, 500);
        var6 = 2 + var4 * jn.field_d;
        if (param0 >= -105) {
          return;
        } else {
          var7 = jp.a(var2, 12, var5, -1);
          var8 = pd.a(var6, 0, var3, 20);
          qn.b(var7, var8, var5, var6, 0);
          qn.f(1 + var7, var8 + 1, var5 - 2, -2 + var6, 16777088);
          int discarded$1 = eq.field_h.field_Z.a(param1, 3 + var7, -eq.field_h.field_Z.field_H + is.field_b + (var8 + 1), 500, 1000, 0, -1, 0, 0, jn.field_d);
          return;
        }
    }

    final static void a(int param0, int param1, nr param2, nr param3, int param4, int param5) {
        df.field_E = param1;
        ar.field_w = param0;
        ed.field_d = param3;
        rd.field_b = param5;
        int var6 = -13 / ((53 - param4) / 48);
        ov.field_m = param2;
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        Object var4 = null;
        rs var5 = null;
        Object var6 = null;
        on var6_ref = null;
        var6 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = (rs) (Object) gg.field_F.e((byte) 94);
        L0: while (true) {
          if (var5 == null) {
            if (param1) {
              var6_ref = (on) (Object) ss.field_t.e((byte) 112);
              L1: while (true) {
                if (var6_ref == null) {
                  return;
                } else {
                  s.a(127, param0, var6_ref);
                  var6_ref = (on) (Object) ss.field_t.a((byte) 123);
                  continue L1;
                }
              }
            } else {
              var4 = null;
              op.a(108, -59, (nr) null, (nr) null, -23, 0);
              var6_ref = (on) (Object) ss.field_t.e((byte) 112);
              L2: while (true) {
                if (var6_ref == null) {
                  return;
                } else {
                  s.a(127, param0, var6_ref);
                  var6_ref = (on) (Object) ss.field_t.a((byte) 123);
                  continue L2;
                }
              }
            }
          } else {
            tc.a(param0, var5, (byte) 105);
            var5 = (rs) (Object) gg.field_F.a((byte) 123);
            continue L0;
          }
        }
    }

    final static String a(int param0, String param1, int param2) {
        int var4 = 0;
        bv var6 = null;
        bv var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param1;
        if (hg.a((byte) -18, var8)) {
          if (2 != th.field_a) {
            return iv.field_c;
          } else {
            if (!gt.a(param1, (byte) -89)) {
              if (jj.a(param0 ^ 58, param1)) {
                return fo.a(4800, i.field_Ob, new String[1]);
              } else {
                if (dj.field_a < 100) {
                  if (dj.field_a < 200) {
                    if (!si.a(param1, -3404)) {
                      var7 = vl.field_n;
                      var7.h(32161, param2);
                      var7.field_q = var7.field_q + 1;
                      var4 = var7.field_q;
                      var7.b(1, 0);
                      if (param0 != 20) {
                        return null;
                      } else {
                        var7.b(param1, 13851);
                        var7.e(-var4 + var7.field_q, 5930);
                        return null;
                      }
                    } else {
                      return fo.a(4800, km.field_a, new String[1]);
                    }
                  } else {
                    return lo.field_m;
                  }
                } else {
                  if (-1 > (df.field_M ^ -1)) {
                    if (dj.field_a < 200) {
                      if (!si.a(param1, -3404)) {
                        var6 = vl.field_n;
                        var6.h(32161, param2);
                        var6.field_q = var6.field_q + 1;
                        var4 = var6.field_q;
                        var6.b(1, 0);
                        if (param0 != 20) {
                          return null;
                        } else {
                          var6.b(param1, 13851);
                          var6.e(-var4 + var6.field_q, 5930);
                          return null;
                        }
                      } else {
                        return fo.a(4800, km.field_a, new String[1]);
                      }
                    } else {
                      return lo.field_m;
                    }
                  } else {
                    return lo.field_m;
                  }
                }
              }
            } else {
              return am.field_F;
            }
          }
        } else {
          return bc.field_d;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (!param0) {
          return;
        } else {
          field_c = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Need to move others first";
        field_c = new int[][]{new int[8], new int[8]};
        field_a = "This is <%0>'s RuneScape clan if they have one.";
        field_e = "Ignore";
        field_d = "Security";
        field_f = new int[]{2, 17, 18, 36, 37, 38, 6, 43};
    }
}
