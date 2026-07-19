/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends fa {
    static ak field_p;
    int field_l;
    int field_H;
    int field_y;
    int field_n;
    int field_z;
    pp field_G;
    int field_m;
    int field_w;
    int field_D;
    sp field_F;
    static tf field_B;
    sn field_x;
    int field_C;
    int field_k;
    un field_q;
    int field_v;
    int field_A;
    int field_E;
    int field_o;
    static int field_t;
    int field_u;
    int field_r;
    static bb field_J;
    int field_I;
    static tf field_s;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            if (param1 <= 34) {
                field_p = (ak) null;
            }
            param0.addKeyListener(mc.field_r);
            param0.addFocusListener(mc.field_r);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "in.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean e(int param0) {
        L0: {
          if (-1 != jj.field_b) {
            break L0;
          } else {
            if (!rd.a(1, false)) {
              return false;
            } else {
              jj.field_b = vi.field_o.f(255);
              vi.field_o.field_m = 0;
              break L0;
            }
          }
        }
        L1: {
          if (-2 == jj.field_b) {
            if (rd.a(2, false)) {
              jj.field_b = vi.field_o.a((byte) -113);
              vi.field_o.field_m = 0;
              break L1;
            } else {
              return false;
            }
          } else {
            break L1;
          }
        }
        if (param0 != -18481) {
          field_p = (ak) null;
          return rd.a(jj.field_b, false);
        } else {
          return rd.a(jj.field_b, false);
        }
    }

    final void a(boolean param0) {
        this.field_G = null;
        this.field_q = null;
        this.field_F = null;
        if (param0) {
          field_p = (ak) null;
          this.field_x = null;
          return;
        } else {
          this.field_x = null;
          return;
        }
    }

    public static void a(int param0) {
        field_J = null;
        field_B = null;
        field_s = null;
        if (param0 >= -1) {
            field_p = (ak) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    in() {
    }

    static {
        field_J = new bb();
    }
}
