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
        if (param1 != -23249) {
            field_c = true;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 56082116) {
          field_c = true;
          return param1 >>> -1475811460 | param1 << 56082116;
        } else {
          return param1 >>> -1475811460 | param1 << 56082116;
        }
    }

    final static gq a(int param0) {
        if (param0 != 55) {
            ia.a((byte) 3);
            return mg.field_a;
        }
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
        field_e = new char[]{(char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57, (char)48};
        field_b = "Don't mind";
    }
}
