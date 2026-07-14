/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends jb {
    kg field_v;
    cp field_E;
    int field_D;
    int field_q;
    int field_o;
    int field_k;
    int field_j;
    int field_i;
    int field_x;
    int field_C;
    static int[] field_n;
    int field_l;
    int field_f;
    int field_m;
    int field_r;
    int field_z;
    static int field_g;
    int field_u;
    int field_y;
    dk field_A;
    int field_p;
    static String field_s;
    ko field_t;
    int field_w;
    static dl[] field_B;
    static ko field_h;

    final void d(int param0) {
        ((pl) this).field_v = null;
        ((pl) this).field_E = null;
        if (param0 != 12426) {
          field_B = null;
          ((pl) this).field_t = null;
          ((pl) this).field_A = null;
          return;
        } else {
          ((pl) this).field_t = null;
          ((pl) this).field_A = null;
          return;
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (param2 == -59) {
          if ((eq.field_j ^ -1) <= -11) {
            if (ji.f(250)) {
              if (0 != hp.field_s) {
                to.a(0, param1);
                return;
              } else {
                dc.a(param0, (byte) 107, false);
                bq.a(param1, 0, 0, 4);
                return;
              }
            } else {
              kh.a();
              bc.a(240, param2 ^ -72, 320);
              bq.a(param1, 0, 0, 4);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (al.field_f) {
                var3 = 1;
                al.field_f = false;
                break L0;
              } else {
                break L0;
              }
            }
            ud.a(rn.d(-3), param2 + 60, oo.e((byte) -110), cf.field_e, var3 != 0);
            return;
          }
        } else {
          return;
        }
    }

    final static void e(int param0) {
        dj.field_t = false;
        ne.field_d = false;
        rc.a(-25537, -1);
        lc.field_c = tl.field_e;
        sg.field_b = tl.field_e;
        if (param0 >= -116) {
            field_s = null;
        }
    }

    public static void a(int param0) {
        if (param0 > -106) {
            return;
        }
        field_s = null;
        field_B = null;
        field_n = null;
        field_h = null;
    }

    final static ef a(int param0, int param1, int param2, db param3, db param4) {
        if (gm.a(param3, param1, true, param0)) {
          if (param2 != -11) {
            return null;
          } else {
            return tn.a(param4.b(param1, 0, param0), 0);
          }
        } else {
          return null;
        }
    }

    pl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[128];
        field_g = -1;
        field_s = "This is a very bored person.";
    }
}
