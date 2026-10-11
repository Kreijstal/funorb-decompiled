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
        if (param0 < -21) {
          field_e = null;
          field_g = null;
          field_f = null;
          field_d = null;
          return;
        }
        tm.a(97);
        field_e = null;
        field_g = null;
        field_f = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (cr.a((byte) -114)) {
          param0 = false;
        }
        dk.e(param0, -7579);
        if (sa.field_f) {
          oo.f(em.field_U.field_c.field_x, em.field_U.field_c.field_Q, em.field_U.field_c.field_zb, em.field_U.field_c.field_z);
          em.field_U.field_c.c(param0, -1);
          if (param1) {
            field_a = (String[]) null;
            an.a(1, param0);
            return;
          }
          an.a(1, param0);
          return;
        }
        if (!param1) {
          an.a(1, param0);
          return;
        }
        field_a = (String[]) null;
        an.a(1, param0);
    }

    static {
        field_g = "Match over";
        field_d = "ESC - cancel private message";
        field_a = new String[]{"The Mall", "Power Plant", "Precinct", "White House", "Locked"};
        field_e = "Ignore";
    }
}
