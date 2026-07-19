/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    static int field_f;
    static boolean field_d;
    static tf[] field_c;
    static String field_a;
    static int field_b;
    static int[][] field_e;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            field_d = false;
            field_e = (int[][]) null;
            return;
        }
        field_e = (int[][]) null;
    }

    final static void a(int param0, qe param1) {
        try {
            param1.field_t = new char[]{(char)63};
            param1.field_D = new int[]{param0};
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = -1;
        field_d = true;
        field_a = null;
    }
}
