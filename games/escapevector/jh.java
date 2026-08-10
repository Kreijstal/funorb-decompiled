/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends hg {
    boolean field_h;
    boolean field_g;
    static hh field_k;
    static String field_j;
    int[] field_i;

    public static void a(boolean param0) {
        if (param0) {
            jh.d(71);
            field_k = null;
            field_j = null;
            return;
        }
        field_k = null;
        field_j = null;
    }

    final static boolean d(int param0) {
        if (param0 != -4292) {
            String var2 = (String) null;
            jh.a(false, (String) null, true, (String) null);
            return hf.field_a;
        }
        return hf.field_a;
    }

    final static void a(boolean param0, String param1, boolean param2, String param3) {
        try {
            bm.field_g = param3;
            vk.field_v = param1;
            uf.a((byte) 71, mm.field_a, param0);
            if (param2) {
                jh.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    jh() {
        this.field_h = false;
        this.field_g = true;
    }

    static {
        field_j = "Accept";
    }
}
