/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static nh field_f;
    static int field_g;
    static String[] field_e;
    static String field_d;
    static int[] field_h;
    static he field_b;
    static int field_c;
    static java.awt.Frame field_a;

    final boolean a(boolean param0) {
        if (param0) {
          bb.a((byte) 20);
          if (this == uf.field_c) {
            return true;
          }
          if (this != sg.field_d) {
            return this == ik.field_d ? true : false;
          }
          return true;
        }
        if (this == uf.field_c) {
          return true;
        }
        if (this == sg.field_d) {
          return true;
        }
        if (this != ik.field_d) {
          return false;
        }
        return true;
    }

    final static boolean a(byte param0) {
        oh.field_a = true;
        ab.field_a = 15000L + la.a(false);
        if (param0 == -103) {
          return af.field_b == 11 ? true : false;
        }
        field_g = -116;
        return af.field_b == 11 ? true : false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_f = null;
        field_b = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_f = new nh(540, 140);
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_d = "To Customer Support";
        field_c = 20;
    }
}
