/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq extends wf {
    int field_f;
    static gk field_h;
    static String[] field_g;
    static gk field_e;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -119) {
            return;
        }
        field_h = null;
        field_g = null;
    }

    iq(int param0) {
        ((iq) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"hit1", "hit2", "hit3", "hit4"};
    }
}
