/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pm extends fn {
    private String field_c;
    private long field_e;
    static String field_d;

    eo a(int param0) {
        if (param0 >= -51) {
            field_d = (String) null;
            return ds.field_e;
        }
        return ds.field_e;
    }

    pm(long param0, String param1) {
        ((pm) this).field_e = param0;
        ((pm) this).field_c = param1;
    }

    public static void b(int param0) {
        if (param0 <= 82) {
            pm.b(122);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(rb param0, boolean param1) {
        param0.b((byte) -102, ((pm) this).field_e);
        param0.b(0, ((pm) this).field_c);
        if (!param1) {
            eo discarded$0 = ((pm) this).a(-32);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "ACHIEVEMENTS THIS GAME";
    }
}
