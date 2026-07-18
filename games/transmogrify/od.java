/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends wf {
    int field_k;
    static String field_h;
    wf field_i;
    static ta[] field_l;
    bb field_j;
    static j field_g;

    od(bb param0, wf param1) {
        try {
            ((od) this).field_j = param0;
            ((od) this).field_k = param0.h();
            ((od) this).field_i = param1;
            ((od) this).field_j.i(128 + kc.field_g * ((od) this).field_k >> 8);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_g = null;
        field_h = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_l = new ta[255];
        for (var0 = 0; var0 < field_l.length; var0++) {
            field_l[var0] = new ta();
        }
        field_g = new j(12, 34, 114);
    }
}
