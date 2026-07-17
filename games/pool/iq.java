/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iq {
    int[] field_h;
    static boolean field_i;
    static String field_b;
    static db field_f;
    static boolean field_j;
    int field_e;
    java.awt.Image field_c;
    static java.awt.Frame field_l;
    static dd[] field_a;
    int field_k;
    static String field_g;
    static dd field_d;

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    public static void a() {
        field_a = null;
        field_d = null;
        field_l = null;
        field_g = null;
        field_b = null;
        field_f = null;
    }

    final void b(int param0) {
        qh.a(((iq) this).field_h, ((iq) this).field_e, ((iq) this).field_k);
        if (param0 != 15100) {
            ((iq) this).b(78);
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Foul! <%0>-second time penalty incurred!";
        field_i = false;
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}
