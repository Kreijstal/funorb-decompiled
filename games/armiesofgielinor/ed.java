/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static nr field_d;
    static String field_b;
    static String field_a;
    static je field_e;
    static String field_c;

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 == 15000) {
          field_a = null;
          field_b = null;
          return;
        }
        field_c = (String) null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 <= -66) {
          st.field_C = true;
          jl.field_a = vi.b(124) + 15000L;
          return 11 == p.field_b ? true : false;
        }
        return true;
    }

    final static void a(boolean param0) {
        if (!bl.field_b) {
          throw new IllegalStateException();
        }
        it.field_b = true;
        if (!param0) {
          wc.a(true, -49);
          p.field_b = 0;
          return;
        }
        ed.a(-80);
        wc.a(true, -49);
        p.field_b = 0;
    }

    static {
        field_b = "No highscores";
        field_a = "Weapons will increase the force with which your units strike. Different attack types require different weapons, and units can only carry one weapon at a time. Equipping a unit with a new weapon will cause their current weapon to be discarded.";
        field_c = "Create";
    }
}
