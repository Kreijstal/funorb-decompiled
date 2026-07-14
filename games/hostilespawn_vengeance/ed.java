/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed implements Iterable {
    static bd field_a;
    private am field_c;
    static String field_e;
    am[] field_f;
    static String field_d;
    int field_b;

    final static void a(ln param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (3 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (qb.field_i <= var2) {
                L2: {
                  ra.field_i[param0.a(param1)] = ra.field_i[param0.a(param1)] + 1;
                  var2 = 0;
                  if (!param1) {
                    break L2;
                  } else {
                    ed.b(-18);
                    break L2;
                  }
                }
                var3 = 0;
                L3: while (true) {
                  if (var3 >= qb.field_i) {
                    qb.field_i = var2;
                    qb.field_i = qb.field_i + 1;
                    rj.field_J[qb.field_i] = param0;
                    return;
                  } else {
                    L4: {
                      if (rj.field_J[var3].field_f != param0.field_f) {
                        break L4;
                      } else {
                        var4 = rj.field_J[var3].a(false);
                        if (ra.field_i[var4] <= uj.field_n) {
                          break L4;
                        } else {
                          ra.field_i[var4] = ra.field_i[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    rj.field_J[var2] = rj.field_J[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param0.field_f == rj.field_J[var2].field_f) {
                  ra.field_i[rj.field_J[var2].a(false)] = ra.field_i[rj.field_J[var2].a(false)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ra.field_i[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new oe((ed) this);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (!li.field_o) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            Object var2 = null;
            ed.a((ln) null, true);
        }
        if (null != jj.field_d) {
            jj.field_d.g((byte) -19);
        }
        String var1 = bn.b(-104);
        ib.field_e = new lk(var1, (String) null, true, false, false);
        im.field_e.c((ag) (Object) ke.field_s, 86);
        ke.field_s.b((ag) (Object) ib.field_e, (byte) 110);
        ke.field_s.m(param0 ^ -108);
    }

    final am a(long param0, int param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = ((ed) this).field_f[(int)(param0 & (long)(((ed) this).field_b + param1))];
        ((ed) this).field_c = var4.field_g;
        while (((ed) this).field_c != var4) {
            if (!(param0 != ((ed) this).field_c.field_c)) {
                var5 = ((ed) this).field_c;
                ((ed) this).field_c = ((ed) this).field_c.field_g;
                return var5;
            }
            ((ed) this).field_c = ((ed) this).field_c.field_g;
        }
        ((ed) this).field_c = null;
        return null;
    }

    final void a(byte param0, long param1, am param2) {
        if (null != param2.field_f) {
            param2.b(120);
        }
        am var5 = ((ed) this).field_f[(int)(param1 & (long)(-1 + ((ed) this).field_b))];
        if (param0 <= 59) {
            return;
        }
        param2.field_g = var5;
        param2.field_f = var5.field_f;
        param2.field_f.field_g = param2;
        param2.field_c = param1;
        param2.field_g.field_f = param2;
    }

    final static void a(int param0, byte param1) {
        int var3 = HostileSpawn.field_I ? 1 : 0;
        wj.field_O = param0;
        if (param1 >= -22) {
            return;
        }
        qb var2 = (qb) (Object) jn.field_H.g(-9);
        while (var2 != null) {
            if (var2.field_j.a(3000)) {
                var2.field_h.f(var2.field_l * wj.field_O + 128 >> 22915208);
            } else {
                var2.b(-69);
            }
            var2 = (qb) (Object) jn.field_H.a(12684);
        }
        if (ej.field_g == null) {
        } else {
            var2 = (qb) (Object) ej.field_g.g(-69);
            while (var2 != null) {
                if (!var2.field_j.a(3000)) {
                    var2.b(119);
                } else {
                    var2.field_h.f(var2.field_l * wj.field_O - -128 >> -13611768);
                }
                var2 = (qb) (Object) ej.field_g.a(12684);
            }
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Log in / Create account";
        field_e = null;
    }
}
