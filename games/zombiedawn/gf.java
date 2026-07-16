/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_c;
    static sm field_b;
    static boolean field_a;

    final static boolean a(int[] param0, byte param1) {
        int var2 = 0;
        long var3 = 0L;
        bg var5_ref_bg = null;
        int var5 = 0;
        int var6_int = 0;
        bg var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if (ic.field_T == df.field_j) {
          L0: {
            L1: {
              var2 = 26 % ((-18 - param1) / 33);
              var3 = pd.a(-22826);
              if ((jh.field_h ^ -1) == -1) {
                break L1;
              } else {
                if (-1 >= (l.field_e ^ -1)) {
                  break L1;
                } else {
                  var5_ref_bg = (bg) (Object) ui.field_f.b((byte) 26);
                  if (var5_ref_bg == null) {
                    break L0;
                  } else {
                    if (var5_ref_bg.field_h < var3) {
                      var5_ref_bg.b(-27598);
                      jd.field_b = var5_ref_bg.field_m.length;
                      fj.field_g.field_j = 0;
                      var6_int = 0;
                      L2: while (true) {
                        if ((var6_int ^ -1) <= (jd.field_b ^ -1)) {
                          em.field_U = wb.field_t;
                          wb.field_t = e.field_P;
                          e.field_P = l.field_d;
                          l.field_d = var5_ref_bg.field_j;
                          return true;
                        } else {
                          fj.field_g.field_h[var6_int] = var5_ref_bg.field_m[var6_int];
                          var6_int++;
                          continue L2;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            break L0;
          }
          L3: while (true) {
            L4: {
              if (0 <= l.field_e) {
                break L4;
              } else {
                fj.field_g.field_j = 0;
                if (!ck.a((byte) -117, 1)) {
                  return false;
                } else {
                  l.field_e = fj.field_g.i((byte) 126);
                  fj.field_g.field_j = 0;
                  jd.field_b = param0[l.field_e];
                  break L4;
                }
              }
            }
            if (!nn.a(-2887)) {
              return false;
            } else {
              if (0 != jh.field_h) {
                L5: {
                  var5 = jh.field_h;
                  if (ca.field_a != 0.0) {
                    var5 = (int)((double)var5 + p.field_b.nextGaussian() * ca.field_a);
                    if (var5 < 0) {
                      var5 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var6 = new bg((long)var5 + var3, l.field_e, new byte[jd.field_b]);
                var7 = 0;
                L6: while (true) {
                  if (jd.field_b <= var7) {
                    ui.field_f.a(0, (le) (Object) var6);
                    l.field_e = -1;
                    continue L3;
                  } else {
                    var6.field_m[var7] = fj.field_g.field_h[var7];
                    var7++;
                    continue L6;
                  }
                }
              } else {
                em.field_U = wb.field_t;
                wb.field_t = e.field_P;
                e.field_P = l.field_d;
                l.field_d = l.field_e;
                l.field_e = -1;
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            vn discarded$0 = gf.a((dj) null, (String) null, -54, (String) null);
        }
        field_b = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != 0) {
            Object var3 = null;
            vn discarded$0 = gf.a((dj) null, (String) null, 11, (String) null);
        }
        return ni.a(param1.length, 0, param0 + 127, param1);
    }

    final static vn a(dj param0, String param1, int param2, String param3) {
        if (param2 != 8) {
            return null;
        }
        int var4 = param0.a(param3, (byte) 8);
        int var5 = param0.a(var4, param1, true);
        return hg.a(var5, var4, param0, -2);
    }

    final static void a(byte param0) {
        ig.m((byte) -102);
        if (param0 != 41) {
            field_a = true;
        }
        mp.field_e = true;
        nm.field_c = true;
        e.field_S.j(-636330975);
        ti.a(tg.field_a, false, false);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param0 ^ -1) == -1) {
            return 0;
        }
        if (param0 > 0) {
            var2 = 1;
            if (!(param0 <= 65535)) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(-4 <= (param0 ^ -1))) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (1 < param0) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        int var3 = 23 % ((param1 - -72) / 44);
        if (!((param0 ^ -1) <= 65535)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!((param0 ^ -1) <= 15)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (1 < (param0 ^ -1)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 2;
        field_b = new sm();
        field_a = false;
    }
}
