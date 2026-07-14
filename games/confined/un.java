/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static mi field_a;
    static bi field_h;
    static byte[][] field_i;
    static String field_b;
    static String field_d;
    private hn field_c;
    private kn field_g;
    private double[] field_f;
    private int field_e;

    final void a(int param0) {
        int var2 = 0;
        L0: {
          ((un) this).field_c.field_m.field_Y = ((un) this).field_c.field_m.field_Y + 0.002;
          if (((un) this).field_c.field_m.field_Y > 1.0) {
            ((un) this).field_c.field_m.field_Y = 1.0;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 53 / ((param0 - -47) / 52);
        if (((un) this).field_c.field_x.field_a <= 1) {
          if (-513 >= (((un) this).field_e ^ -1)) {
            ((un) this).field_c.field_B.field_jb.a((byte) 85, ((un) this).field_f);
            ((un) this).field_g.a(26214, ((un) this).field_f, 0.000009765625 * (double)((un) this).field_e);
            return;
          } else {
            ((un) this).field_e = ((un) this).field_e + 1;
            ((un) this).field_c.field_B.field_jb.a((byte) 85, ((un) this).field_f);
            ((un) this).field_g.a(26214, ((un) this).field_f, 0.000009765625 * (double)((un) this).field_e);
            return;
          }
        } else {
          return;
        }
    }

    public static void d(int param0) {
        field_a = null;
        if (param0 != 1) {
          un.c(21);
          field_d = null;
          field_i = null;
          field_b = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_i = null;
          field_b = null;
          field_h = null;
          return;
        }
    }

    final static void c(int param0) {
        tj.a(param0 ^ 18996, rd.field_Jb, (String) null);
        if (param0 != -18997) {
            field_h = null;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        if (param0 > -55) {
          L0: {
            ((un) this).field_g = null;
            var2 = (int)(((un) this).field_c.a((byte) 81, 256.0) + 0.5);
            if (((un) this).field_e != 0) {
              var3 = 0.000009765625 * (double)((un) this).field_e;
              ((un) this).field_g.a(var2, ((un) this).field_f[9] * var3, ((un) this).field_f[10] * var3, var3 * ((un) this).field_f[11], ((un) this).field_c.field_m, -1212126616);
              break L0;
            } else {
              ((un) this).field_g.a((byte) -121, var2, ((un) this).field_c.field_m);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var2 = (int)(((un) this).field_c.a((byte) 81, 256.0) + 0.5);
            if (((un) this).field_e != 0) {
              var3 = 0.000009765625 * (double)((un) this).field_e;
              ((un) this).field_g.a(var2, ((un) this).field_f[9] * var3, ((un) this).field_f[10] * var3, var3 * ((un) this).field_f[11], ((un) this).field_c.field_m, -1212126616);
              break L1;
            } else {
              ((un) this).field_g.a((byte) -121, var2, ((un) this).field_c.field_m);
              break L1;
            }
          }
          return;
        }
    }

    un(hn param0) {
        ((un) this).field_g = new kn();
        ((un) this).field_f = new double[12];
        ((un) this).field_e = 0;
        ((un) this).field_c = param0;
        param0.field_M = true;
        rm.field_f = new eg(100);
        bg.field_f = 0;
        ie.field_a = true;
        hc.field_u = ve.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for models";
        field_d = "Creating your account";
    }
}
