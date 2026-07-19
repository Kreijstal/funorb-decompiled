/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gmb implements dja {
    static String field_a;
    static String field_b;
    static llb field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -15) {
            gmb.a(-124);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    public final tv a(byte param0) {
        int var2 = -119 % ((param0 - -64) / 50);
        return (tv) ((Object) new twa());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = (String) null;
            return (tv[]) ((Object) new twa[param1]);
        }
        return (tv[]) ((Object) new twa[param1]);
    }

    static {
        field_a = "Missile lock";
        field_b = "Share your ship";
    }
}
