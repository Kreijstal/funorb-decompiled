/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends fc {
    fc field_k;
    int field_m;
    static String field_l;
    bh field_j;
    static boolean field_i;

    final static String d() {
        if (ue.field_a == null) {
            return "";
        }
        return ue.field_a;
    }

    public static void a() {
        field_l = null;
        int var1 = 0;
    }

    li(bh param0, fc param1) {
        try {
            ((li) this).field_j = param0;
            ((li) this).field_m = param0.e();
            ((li) this).field_k = param1;
            ((li) this).field_j.g(qd.field_d * ((li) this).field_m + 128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "li.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
