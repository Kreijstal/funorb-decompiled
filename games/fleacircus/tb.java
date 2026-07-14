/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static boolean field_c;
    static java.applet.Applet field_d;
    static String field_e;
    static String field_b;
    static String field_a;
    static dd field_f;

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        ha var4_ref_ha = null;
        int var4 = 0;
        int var5_int = 0;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = fleas.field_A ? 1 : 0;
        if (rh.field_k != fh.field_b) {
          return false;
        } else {
          L0: {
            var2 = lj.a((byte) -83);
            if (-1 == (ja.field_P ^ -1)) {
              break L0;
            } else {
              if (0 <= il.field_h) {
                break L0;
              } else {
                var4_ref_ha = (ha) (Object) bj.field_n.c((byte) 47);
                if (var4_ref_ha == null) {
                  break L0;
                } else {
                  if ((var4_ref_ha.field_q ^ -1L) > (var2 ^ -1L)) {
                    var4_ref_ha.c(-1);
                    pd.field_l = var4_ref_ha.field_r.length;
                    ae.field_a.field_i = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (pd.field_l <= var5_int) {
                        hc.field_j = rj.field_k;
                        rj.field_k = vi.field_a;
                        vi.field_a = be.field_a;
                        be.field_a = var4_ref_ha.field_n;
                        return true;
                      } else {
                        ae.field_a.field_k[var5_int] = var4_ref_ha.field_r[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L2: {
            if (param0 <= -54) {
              break L2;
            } else {
              var8 = null;
              int discarded$1 = tb.a((CharSequence) null, false);
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if ((il.field_h ^ -1) <= -1) {
                break L4;
              } else {
                ae.field_a.field_i = 0;
                if (gi.a(1, true)) {
                  il.field_h = ae.field_a.f((byte) 47);
                  ae.field_a.field_i = 0;
                  pd.field_l = param1[il.field_h];
                  break L4;
                } else {
                  return false;
                }
              }
            }
            if (gf.b(-9)) {
              if (ja.field_P != 0) {
                L5: {
                  var4 = ja.field_P;
                  if (g.field_u == 0.0) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + jj.field_R.nextGaussian() * g.field_u);
                    if ((var4 ^ -1) <= -1) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                }
                var5 = new ha((long)var4 + var2, il.field_h, new byte[pd.field_l]);
                var6 = 0;
                L6: while (true) {
                  if (pd.field_l <= var6) {
                    bj.field_n.a(false, (lh) (Object) var5);
                    il.field_h = -1;
                    continue L3;
                  } else {
                    var5.field_r[var6] = ae.field_a.field_k[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                hc.field_j = rj.field_k;
                rj.field_k = vi.field_a;
                vi.field_a = be.field_a;
                be.field_a = il.field_h;
                il.field_h = -1;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -43) {
            field_d = null;
        }
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        int var2 = param0.length();
        int var3 = 0;
        if (param1) {
            return 40;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = rc.a(param0.charAt(var4), 22861) + ((var3 << -157896507) + -var3);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Right slope: ";
        field_b = "Tiles in the level (1/3)";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
