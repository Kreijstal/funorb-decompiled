/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jga implements dja {
    static int field_a;
    static String field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new pe[param1];
    }

    public static void a(int param0) {
        if (param0 >= -31) {
            return;
        }
        field_b = null;
    }

    public final tv a(byte param0) {
        int var2 = -80 / ((-64 - param0) / 50);
        return (tv) (Object) new pe();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 256;
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
