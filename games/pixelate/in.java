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

    final static void a(java.awt.Component param0) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) mc.field_r);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) mc.field_r);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "in.D(" + (param0 != null ? "{...}" : "null") + 44 + 57 + 41);
        }
    }

    final static boolean e() {
        if (-1 == jj.field_b) {
            if (!(rd.a(1, false))) {
                return false;
            }
            jj.field_b = vi.field_o.f(255);
            vi.field_o.field_m = 0;
        }
        if (!(-2 != jj.field_b)) {
            if (rd.a(2, false)) {
                jj.field_b = vi.field_o.a((byte) -113);
                vi.field_o.field_m = 0;
                return rd.a(jj.field_b, false);
            }
            return false;
        }
        return rd.a(jj.field_b, false);
    }

    final void a(boolean param0) {
        ((in) this).field_G = null;
        ((in) this).field_q = null;
        ((in) this).field_F = null;
        if (param0) {
          field_p = null;
          ((in) this).field_x = null;
          return;
        } else {
          ((in) this).field_x = null;
          return;
        }
    }

    public static void a() {
        field_J = null;
        field_B = null;
        field_s = null;
        field_p = null;
    }

    in() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new bb();
    }
}
