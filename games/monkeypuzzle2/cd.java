/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;

    final void a(boolean param0, java.applet.Applet param1) {
        if (param0) {
            ((cd) this).field_a = null;
        }
        wg.a("jagex-last-login-method", param1, ((cd) this).field_a, -26372, 31536000L);
    }

    cd(String param0) {
        ((cd) this).field_a = param0;
    }

    final boolean a(String param0, int param1) {
        if (param1 != -1) {
            cd.a(51);
        }
        return ((cd) this).field_a.equals((Object) (Object) param0);
    }

    final static void b(int param0) {
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(vh.c((byte) -93))) {
            if (null != ba.field_f) {
                if (!(!ba.field_f.field_d)) {
                    wl.e((byte) 120);
                    si.field_o.b((byte) -56, (we) (Object) new s(si.field_o, cg.field_c));
                }
            }
            return;
        }
        int var1 = 63 / ((59 - param0) / 47);
        boolean discarded$8 = si.field_o.a(mb.field_a, mb.field_d, true, true);
        si.field_o.l(-43);
        while (ba.a(-1)) {
            boolean discarded$9 = si.field_o.a(oa.field_H, 121, rd.field_p);
        }
    }

    final static void a(int param0) {
        fk.field_a = false;
        ah.field_h = false;
        qh.a(param0, true);
        ed.field_c = di.field_a;
        ch.field_d = di.field_a;
    }

    final static void a(hl param0, byte param1) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0.field_c != null) {
          L0: {
            L1: {
              if (-1 != param0.field_g) {
                break L1;
              } else {
                if (-1 != param0.field_k) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= ea.field_c) {
                break L0;
              } else {
                var3 = pg.field_e[var2];
                if (-3 == (var3.field_i ^ -1)) {
                  if (var3.field_g == param0.field_g) {
                    if (var3.field_k == param0.field_k) {
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
            if (param0.field_l == null) {
              break L3;
            } else {
              break L3;
            }
          }
          if (param1 == 20) {
            qh.a(param0, 6191);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
