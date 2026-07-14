/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd {
    int field_k;
    static tf field_c;
    static boolean[][] field_e;
    int field_h;
    static vn[] field_j;
    int field_b;
    int field_d;
    static int field_g;
    int field_i;
    int field_a;
    static String field_f;

    final static void b(int param0, int param1) {
        kt.field_j = param1;
        if (param0 != 38) {
            field_f = null;
        }
    }

    abstract void a(int param0, int param1);

    final static void a(int param0, tf param1, java.awt.Point[] param2) {
        wv.a((byte) -108, 38, param1, param2);
        if (param0 >= -39) {
            field_f = null;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_f = null;
        if (param0 > -67) {
          var2 = null;
          qd.a(-75, (tf) null, (java.awt.Point[]) null);
          field_j = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static void a(byte param0, String param1) {
        et.field_b = true;
        if (param0 != -67) {
            Object var3 = null;
            qd.a((byte) -25, (String) null);
            if (!(!vl.a(false))) {
                return;
            }
            wp.field_h = param1;
            fp.field_e = 1;
            return;
        }
        if (!(!vl.a(false))) {
            return;
        }
        wp.field_h = param1;
        fp.field_e = 1;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_f = "Camera Detached";
    }
}
