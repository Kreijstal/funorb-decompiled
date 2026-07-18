/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_g;
    static String field_c;
    static ri field_f;
    static String field_d;
    static String field_e;
    static String[] field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -21) {
          tm.a(97);
          field_e = null;
          field_g = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        L0: {
          if (!cr.a((byte) -114)) {
            break L0;
          } else {
            param0 = false;
            break L0;
          }
        }
        dk.e(param0, -7579);
        if (sa.field_f) {
          oo.f(em.field_U.field_c.field_x, em.field_U.field_c.field_Q, em.field_U.field_c.field_zb, em.field_U.field_c.field_z);
          em.field_U.field_c.c(param0, -1);
          field_a = null;
          an.a(1, param0);
          return;
        } else {
          field_a = null;
          an.a(1, param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Match over";
        field_d = "ESC - cancel private message";
        field_a = new String[]{"The Mall", "Power Plant", "Precinct", "White House", "Locked"};
        field_e = "Ignore";
    }
}
