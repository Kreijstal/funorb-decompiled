/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends fc {
    fc field_k;
    int field_m;
    static String field_l;
    bh field_j;
    static boolean field_i;

    final static String d(int param0) {
        if (ue.field_a == null) {
            return "";
        }
        if (param0 != -579139480) {
            field_l = (String) null;
            return ue.field_a;
        }
        return ue.field_a;
    }

    public static void a(byte param0) {
        field_l = null;
        int var1 = -101 % ((param0 - 0) / 63);
    }

    li(bh param0, fc param1) {
        try {
            this.field_j = param0;
            this.field_m = param0.e();
            this.field_k = param1;
            this.field_j.g(qd.field_d * this.field_m + 128 >> -579139480);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
