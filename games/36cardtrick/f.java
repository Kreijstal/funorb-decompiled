/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static kc field_a;

    public static void a(int param0) {
        if (param0 != -663255224) {
            String var2 = (String) null;
            boolean discarded$0 = f.a((String) null, 6, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        int var4_int = 0;
        gh var5_ref_gh = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        w var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = Main.field_T;
        var9 = rd.field_j;
        var2 = var9.f(-98);
        var3 = var9.f(92);
        if (param0 == (var2 ^ -1)) {
          var4 = (dl) tf.field_q.a((byte) 74);
          if (var4 == null) {
            mc.a((byte) -126);
            return;
          } else {
            L0: {
              var5 = -((w) var9).field_i + al.field_a;
              var13 = ((dl) var4).field_i;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var6 = var10;
              if (var5 <= var13.length << 1234080546) {
                break L0;
              } else {
                var5 = var13.length << 1515930850;
                break L0;
              }
            }
            var7 = 0;
            L1: while (true) {
              if (var5 <= var7) {
                var4.c(106);
                return;
              } else {
                var6[var7 >> -427153758] = var6[var7 >> -427153758] + (var9.f(-126) << (bc.a(var7, 3) << -663255224));
                var7++;
                continue L1;
              }
            }
          }
        } else {
          if (1 == var2) {
            var4_int = var9.b((byte) 59);
            var5_ref_gh = (gh) sj.field_a.a((byte) 74);
            L2: while (true) {
              if (var5_ref_gh == null) {
                if (var5_ref_gh == null) {
                  mc.a((byte) -128);
                  return;
                } else {
                  var5_ref_gh.c(param0 ^ -99);
                  return;
                }
              } else {
                L3: {
                  if (var3 != ((gh) var5_ref_gh).field_m) {
                    break L3;
                  } else {
                    if (var4_int != ((gh) var5_ref_gh).field_l) {
                      break L3;
                    } else {
                      if (var5_ref_gh == null) {
                        mc.a((byte) -128);
                        return;
                      } else {
                        var5_ref_gh.c(param0 ^ -99);
                        return;
                      }
                    }
                  }
                }
                var5_ref_gh = (gh) sj.field_a.b((byte) -106);
                continue L2;
              }
            }
          } else {
            k.a((Throwable) null, (byte) 79, "LR1: " + aj.a((byte) 92));
            mc.a((byte) -127);
            return;
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        if (hi.a(param0, 0)) {
          return false;
        } else {
          if (lc.a((byte) -33, param0)) {
            return false;
          } else {
            if (param1 > 86) {
              if (!te.a(false, param0)) {
                if (param2.length() == 0) {
                  return true;
                } else {
                  if (!gi.a(param0, -123, param2)) {
                    if (la.a(param2, (byte) -115, param0)) {
                      return false;
                    } else {
                      if (!g.a(param2, param0, -1)) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
    }
}
