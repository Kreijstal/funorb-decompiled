/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ok {
    static int[] field_K;
    static String field_J;
    static vd field_H;
    static qj field_E;
    static int field_L;

    public static void b(boolean param0) {
        field_J = null;
        field_K = null;
        field_H = null;
        if (param0) {
            return;
        }
        field_E = null;
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        fj var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            var7 = rf.field_e;
            if (var7 != null) {
                if (!this.a(param5, param3, param4, false, param2)) {
                    return;
                }
                if (this.field_l instanceof n) {
                    ((n) ((Object) this.field_l)).a(var7, (mc) (this), 21277);
                    rf.field_e = null;
                    return;
                }
                if (!(var7.field_l instanceof n)) {
                    return;
                }
                ((n) ((Object) var7.field_l)).a(var7, (mc) (this), 21277);
                rf.field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "mc.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private mc(int param0, int param1, int param2, int param3, t param4, tg param5, al param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "mc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, ti param2) {
        la var3 = null;
        try {
            var3 = ra.field_C;
            if (param0) {
                field_E = (qj) null;
            }
            var3.c(param1, 7);
            var3.a(5, (byte) -123);
            var3.a(0, (byte) -114);
            var3.b(param2.field_i, (byte) -127);
            var3.a(param2.field_l, (byte) -89);
            var3.a(param2.field_k, (byte) -68);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "mc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[128];
        field_L = -1;
        field_J = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
