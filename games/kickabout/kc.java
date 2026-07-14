/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    private gn field_e;
    private int field_a;
    private gn[] field_d;
    private gn field_c;
    static String field_f;
    private int field_b;
    static ut[] field_g;

    final gn b(int param0) {
        ((kc) this).field_a = param0;
        return ((kc) this).a(-1);
    }

    final void a(gn param0, int param1, long param2) {
        if (!(param0.field_b == null)) {
            param0.c((byte) -109);
        }
        gn var5 = ((kc) this).field_d[(int)((long)(((kc) this).field_b + -1) & param2)];
        param0.field_b = var5.field_b;
        int var6 = -58 % ((param1 - 27) / 42);
        param0.field_d = var5;
        param0.field_b.field_d = param0;
        param0.field_d.field_b = param0;
        param0.field_a = param2;
    }

    final gn a(boolean param0, long param1) {
        gn var5 = null;
        int var6 = Kickabout.field_G;
        gn var4 = ((kc) this).field_d[(int)(param1 & (long)(((kc) this).field_b - 1))];
        ((kc) this).field_c = var4.field_d;
        while (((kc) this).field_c != var4) {
            if (!(param1 != ((kc) this).field_c.field_a)) {
                var5 = ((kc) this).field_c;
                ((kc) this).field_c = ((kc) this).field_c.field_d;
                return var5;
            }
            ((kc) this).field_c = ((kc) this).field_c.field_d;
        }
        ((kc) this).field_c = null;
        if (param0) {
            return null;
        }
        ((kc) this).field_c = null;
        return null;
    }

    final static void a(int param0, int param1) {
        ua.field_l = param0;
        if (param1 != 415422632) {
            return;
        }
        cf.field_Db = param0;
        dc.field_d = 0;
        wm.field_s = 1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        gn var3 = null;
        gn var4 = null;
        int var5 = Kickabout.field_G;
        if (!param0) {
            return;
        }
        for (var2 = 0; var2 < ((kc) this).field_b; var2++) {
            var3 = ((kc) this).field_d[var2];
            while (true) {
                var4 = var3.field_d;
                if (var4 == var3) {
                    break;
                }
                var4.c((byte) -109);
            }
        }
        ((kc) this).field_c = null;
        ((kc) this).field_e = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 != -111) {
            field_f = null;
        }
    }

    final gn a(int param0) {
        gn var2 = null;
        int var3 = Kickabout.field_G;
        if (0 < ((kc) this).field_a) {
            if (!(((kc) this).field_e == ((kc) this).field_d[-1 + ((kc) this).field_a])) {
                var2 = ((kc) this).field_e;
                ((kc) this).field_e = var2.field_d;
                return var2;
            }
        }
        if (param0 != -1) {
            ((kc) this).field_b = -73;
        }
        do {
            if (((kc) this).field_b <= ((kc) this).field_a) {
                return null;
            }
            ((kc) this).field_a = ((kc) this).field_a + 1;
            var2 = ((kc) this).field_d[((kc) this).field_a].field_d;
        } while (((kc) this).field_d[((kc) this).field_a + -1] == var2);
        ((kc) this).field_e = var2.field_d;
        return var2;
    }

    final static void a(boolean param0, ut[] param1) {
        int var2 = 0;
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        ug.field_c = param1;
        sp.field_Hb = new ut[ug.field_c.length];
        var2 = 0;
        L0: while (true) {
          if (var2 >= ug.field_c.length) {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            return;
          } else {
            var3 = ug.field_c[var2].b();
            var4 = 0;
            var5 = 0;
            var6 = -1 + var3.field_y.length;
            L2: while (true) {
              if (var6 < 0) {
                sp.field_Hb[var2] = var3;
                var2++;
                continue L0;
              } else {
                L3: {
                  if (var3.field_y[var6] < -1) {
                    var3.field_y[var6] = var4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 == var6 % var3.field_o) {
                  var5++;
                  var4 = 0;
                  var4 = var4 | var5 + var5;
                  var4 = var4 | var5 / 2 + var5 << 415422632;
                  var4 = var4 | var5 << -712096112;
                  var6--;
                  continue L2;
                } else {
                  var6--;
                  continue L2;
                }
              }
            }
          }
        }
    }

    kc(int param0) {
        int var2 = 0;
        gn var3 = null;
        ((kc) this).field_a = 0;
        ((kc) this).field_d = new gn[param0];
        ((kc) this).field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new gn();
            ((kc) this).field_d[var2] = new gn();
            var3.field_b = var3;
            var3.field_d = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "ESC - cancel private message";
        field_g = (ut[]) (Object) new ot[7];
    }
}
