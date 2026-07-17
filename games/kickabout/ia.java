/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static tf field_d;
    int field_a;
    int field_g;
    static boolean field_c;
    static String field_h;
    int field_f;
    static char[] field_e;
    static String field_b;

    final static void a(boolean param0, int param1) {
        lc.field_e.a(param0, (byte) -124);
    }

    final static int a(int param0, int param1) {
        if (param0 != 56082116) {
          field_c = true;
          return param1 >>> 28 | param1 << 4;
        } else {
          return param1 >>> 28 | param1 << 4;
        }
    }

    final static gq a(int param0) {
        return mg.field_a;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 < 71) {
          field_c = false;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "stats";
        field_c = false;
        field_d = new tf();
        field_e = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        field_b = "Don't mind";
    }
}
