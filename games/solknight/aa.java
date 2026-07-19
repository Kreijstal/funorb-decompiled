/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    abstract void a(int param0, gb param1);

    final static void a(byte param0, int param1) {
        jf.field_b = di.field_j[param1];
        if (param0 < 25) {
            return;
        }
        wa.field_a = qj.field_a[param1];
        uf.field_r = qb.field_W[param1];
    }

    abstract wb a(int param0);

    final static void a(int param0, byte param1, mg param2, int param3, int param4, o[] param5, int param6, int param7, int param8, mg param9, o[] param10, int param11, int param12, int param13) {
        if (param1 != -93) {
            return;
        }
        try {
            sf.b(false);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "aa.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    static {
    }
}
