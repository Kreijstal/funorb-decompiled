/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static int field_e;
    int field_b;
    static String field_c;
    static int field_d;

    final static void a(String param0, int param1) {
        if (param1 > -90) {
            field_d = 111;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          ti.a((String) null, 103);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = "Cancel";
        field_d = 0;
    }
}
