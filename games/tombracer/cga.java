/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cga extends vg {
    static jea field_g;
    int field_m;
    int field_j;
    int field_o;
    static String field_i;
    static int field_f;
    int field_n;
    int field_h;
    int field_k;
    static String field_l;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -82 / ((-4 - param1) / 47);
        return 0 != (param0 & 34) ? true : false;
    }

    public static void a(boolean param0) {
        boolean discarded$0 = false;
        field_i = null;
        field_l = null;
        if (!param0) {
            discarded$0 = cga.a(67, -110, -111);
            field_g = null;
            return;
        }
        field_g = null;
    }

    private cga() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Message lobby";
        field_l = "No Reward (timeout)";
    }
}
