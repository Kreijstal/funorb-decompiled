/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    String field_a;
    gn field_e;
    String field_c;
    String field_g;
    static oa field_i;
    static String field_h;
    int field_b;
    static kd field_d;
    static int[] field_f;

    final static void a(int param0, vn param1, vn param2, int param3, int param4, int param5) {
        pg.field_G = param5;
        qm.field_e = param2;
        if (param3 != 19362) {
            return;
        }
        na.field_p = param1;
        vf.field_w = param4;
        dc.field_bb = param0;
    }

    final static void b(byte param0) {
        kc.field_e = null;
        if (param0 != 10) {
            field_d = null;
        }
        i.field_i = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_d = null;
        field_h = null;
        if (param0 != 114) {
            field_i = null;
        }
    }

    final static void a(int param0, ij param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= in.field_e) {
                ek.field_n[param1.a(-65)] = ek.field_n[param1.a(-65)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (in.field_e <= var3) {
                    L3: {
                      in.field_e = var2;
                      in.field_e = in.field_e + 1;
                      lj.field_a[in.field_e] = param1;
                      if (param0 == 21325) {
                        break L3;
                      } else {
                        field_d = null;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      if (lj.field_a[var3].field_h != param1.field_h) {
                        break L4;
                      } else {
                        var4 = lj.field_a[var3].a(param0 ^ -21258);
                        if (se.field_i < ek.field_n[var4]) {
                          ek.field_n[var4] = ek.field_n[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2++;
                    lj.field_a[var2] = lj.field_a[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_h == lj.field_a[var2].field_h) {
                  ek.field_n[lj.field_a[var2].a(-90)] = ek.field_n[lj.field_a[var2].a(-90)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ek.field_n[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) field_d);
        if (param0 != 23147) {
            field_d = null;
        }
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) field_d);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) field_d);
        u.field_R = 0;
    }

    private ic() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new kd();
    }
}
