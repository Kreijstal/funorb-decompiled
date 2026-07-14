/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e extends bc {
    private String field_c;
    static String field_d;
    private long field_e;
    static la field_b;
    static int field_f;

    public static void b(boolean param0) {
        field_d = null;
        if (!param0) {
            field_d = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(fj param0, byte param1) {
        param0.a(118, ((e) this).field_e);
        param0.a((byte) 107, ((e) this).field_c);
        if (param1 != -71) {
            e.b(true);
        }
    }

    e(long param0, String param1) {
        ((e) this).field_e = param0;
        ((e) this).field_c = param1;
    }

    gq a(boolean param0) {
        if (param0) {
            field_d = null;
            return hg.field_f;
        }
        return hg.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This game has been updated! Please reload this page.";
    }
}
