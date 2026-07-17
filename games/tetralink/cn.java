/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends RuntimeException {
    Throwable field_a;
    String field_d;
    static int field_f;
    static float field_g;
    static String field_c;
    static nh[][] field_e;
    static String field_b;

    final static hl a() {
        return qj.b(0);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        lj.a((byte) -97);
        if (0 <= aa.field_Pb) {
          uh.field_e.field_jb = sk.a(new String[1], wb.field_b, 120);
          return;
        } else {
          uh.field_e.field_jb = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_c = null;
    }

    cn(Throwable param0, String param1) {
        ((cn) this).field_a = param0;
        ((cn) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This option cannot be combined with the current '<%0>' setting.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
