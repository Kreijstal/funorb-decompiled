/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static gb field_a;
    static bd field_b;

    public static void a(byte param0) {
        if (param0 != 69) {
            field_b = null;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        ei var4_ref_ei = null;
        int var4 = 0;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        if (ci.field_d != rc.field_a) {
          return false;
        } else {
          L0: {
            var2 = hn.a((byte) 80);
            if (-1 == (bl.field_b ^ -1)) {
              break L0;
            } else {
              if ((tc.field_a ^ -1) <= -1) {
                break L0;
              } else {
                var4_ref_ei = (ei) (Object) ck.field_u.g(-69);
                if (var4_ref_ei == null) {
                  break L0;
                } else {
                  if ((var4_ref_ei.field_j ^ -1L) > (var2 ^ -1L)) {
                    var4_ref_ei.b(-115);
                    jd.field_q = var4_ref_ei.field_r.length;
                    sc.field_g.field_i = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= jd.field_q) {
                        bj.field_f = ae.field_u;
                        ae.field_u = ne.field_o;
                        ne.field_o = wa.field_k;
                        wa.field_k = var4_ref_ei.field_s;
                        return true;
                      } else {
                        sc.field_g.field_n[var5_int] = var4_ref_ei.field_r[var5_int];
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
          if (param0 == 23278) {
            L2: while (true) {
              L3: {
                if (-1 < (tc.field_a ^ -1)) {
                  sc.field_g.field_i = 0;
                  if (re.c((byte) 33, 1)) {
                    tc.field_a = sc.field_g.p(param0 + -23214);
                    sc.field_g.field_i = 0;
                    jd.field_q = param1[tc.field_a];
                    break L3;
                  } else {
                    return false;
                  }
                } else {
                  break L3;
                }
              }
              if (eb.a(13372)) {
                if (-1 == (bl.field_b ^ -1)) {
                  bj.field_f = ae.field_u;
                  ae.field_u = ne.field_o;
                  ne.field_o = wa.field_k;
                  wa.field_k = tc.field_a;
                  tc.field_a = -1;
                  return true;
                } else {
                  L4: {
                    var4 = bl.field_b;
                    if (sb.field_a == 0.0) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + jk.field_b.nextGaussian() * sb.field_a);
                      if (0 > var4) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = new ei(var2 + (long)var4, tc.field_a, new byte[jd.field_q]);
                  var6 = 0;
                  L5: while (true) {
                    if (jd.field_q <= var6) {
                      ck.field_u.a((am) (Object) var5, 111);
                      tc.field_a = -1;
                      continue L2;
                    } else {
                      var5.field_r[var6] = sc.field_g.field_n[var6];
                      var6++;
                      continue L5;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
