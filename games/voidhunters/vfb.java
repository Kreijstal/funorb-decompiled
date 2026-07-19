/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vfb implements dja {
    static String field_a;

    public static void a(int param0) {
        if (param0 < 16) {
            return;
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = -35 % ((-64 - param0) / 50);
        return (tv) ((Object) new tja());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new tja[param1]);
    }

    static {
        field_a = "Waiting for music";
    }
}
