/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static di[] field_d;
    static String field_b;
    static long field_c;
    static q field_f;
    static String field_e;
    static String field_g;
    static String field_a;

    final static mb b(byte param0) {
        if (param0 <= 119) {
            field_a = null;
            return wa.field_j;
        }
        return wa.field_j;
    }

    final static Boolean a(byte param0) {
        Boolean var1 = fj.field_e;
        fj.field_e = null;
        return var1;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Saurus Slink";
        field_e = "<col=FF0000>Lethal</col>, if raider fails a defence roll.";
        field_a = "Player";
        field_g = "You have 1 unread message!";
    }
}
