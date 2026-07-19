/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jja implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -54 % ((-64 - param0) / 50);
        return (tv) ((Object) new pwa());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = (String) null;
            return (tv[]) ((Object) new pwa[param1]);
        }
        return (tv[]) ((Object) new pwa[param1]);
    }

    public static void b(byte param0) {
        if (param0 > -98) {
            field_b = (String) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "No spectators";
        field_a = "Age:";
    }
}
