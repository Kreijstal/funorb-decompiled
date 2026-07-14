/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 80 / ((51 - param0) / 39);
    }

    final static int a(CharSequence param0, byte param1) {
        if (param1 != -33) {
            field_a = null;
            return tj.a(10, param0, true, true);
        }
        return tj.a(10, param0, true, true);
    }

    final static void a(boolean param0) {
        if (!(sh.field_e == null)) {
            sh.field_e.b(-1);
            sh.field_e = null;
        }
        if (!param0) {
            field_a = null;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player names can be up to 12 letters, numbers and underscores";
    }
}
