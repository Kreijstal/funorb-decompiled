/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static int field_e;
    static int field_f;
    static String[] field_g;
    static long field_b;
    static ja field_h;
    static String[] field_d;
    static String field_a;
    static md[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 < 60) {
            return;
        }
        field_d = null;
    }

    final static void a(int param0) {
        if (!n.a((byte) -74)) {
            return;
        }
        eb.a(false, false, 4);
    }

    final static ja[] a(int param0, int param1, int param2, int param3) {
        if (param0 <= 29) {
          field_f = -44;
          return qp.a(param3, 1, -102, param2, param1);
        } else {
          return qp.a(param3, 1, -102, param2, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_h = new ja(80, 80);
        field_a = "Asking for or providing contact information";
        field_d = new String[]{"Control scheme: Classic", "Control scheme: Modern"};
    }
}
