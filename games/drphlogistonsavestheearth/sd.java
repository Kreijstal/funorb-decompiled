/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String[] field_b;
    static he[] field_d;
    static j field_a;
    static he[] field_c;
    static int field_e;
    private String field_f;

    final void a(java.applet.Applet param0, byte param1) {
        jk.a(0, ((sd) this).field_f, 31536000L, param0, "jagex-last-login-method");
        if (param1 != -50) {
            sd.a(88);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2) {
          field_e = 123;
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        if (param1 < 100) {
            return true;
        }
        return ((sd) this).field_f.equals((Object) (Object) param0);
    }

    final static void a(byte param0) {
        ng.field_c.j(300);
        if (null != af.field_g) {
          ng.field_c.a((byte) -95, (vg) (Object) af.field_g);
          if (param0 != -124) {
            field_e = 33;
            return;
          } else {
            return;
          }
        } else {
          af.field_g = new tf(ng.field_c, mf.field_u);
          ng.field_c.a((byte) -95, (vg) (Object) af.field_g);
          if (param0 == -124) {
            return;
          } else {
            field_e = 33;
            return;
          }
        }
    }

    sd(String param0) {
        ((sd) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 2;
    }
}
