/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends bo implements Cloneable {
    static am field_q;
    static char field_p;

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
            field_p = 'ﾡ';
        }
        return ng.a(eb.field_m, param1, (f) (Object) new c((f) (Object) new kp(-1)), (byte) -83, kd.field_m);
    }

    c(f param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        L0: {
          L1: {
            var7 = -38 % ((param0 - 74) / 41);
            if (param1 != 24) {
              break L1;
            } else {
              if (-25 == (param2 ^ -1)) {
                qb.field_b.a(param4, param5 + -param2);
                break L0;
              } else {
                break L1;
              }
            }
          }
          qb.field_b.b(param4, param5 - param2, param1 * 2, param2 * 3);
          break L0;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_q = null;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, uf param1) {
        int var2 = 0;
        uf var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (null != param1.field_h) {
          L0: {
            L1: {
              if ((param1.field_d ^ -1) != param0) {
                break L1;
              } else {
                if (param1.field_l == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= jl.field_d) {
                break L0;
              } else {
                var3 = ol.field_D[var2];
                if (var3.field_f == 2) {
                  if (param1.field_d == var3.field_d) {
                    if (param1.field_l == var3.field_l) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null != param1.field_k) {
              break L3;
            } else {
              break L3;
            }
          }
          kj.a(param1, (byte) 36);
          return;
        } else {
          return;
        }
    }

    final static lb b(boolean param0) {
        if (param0) {
            c.g(83);
        }
        if (sa.field_lb == null) {
            sa.field_lb = new lb(ba.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, ba.field_i.field_o, -1, 2147483647, true);
        }
        return sa.field_lb;
    }

    public static void g(int param0) {
        if (param0 != -1) {
            return;
        }
        field_q = null;
    }

    static {
    }
}
