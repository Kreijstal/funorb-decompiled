/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static volatile long field_b;
    static String field_a;
    static hk field_d;
    private ll[] field_c;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            mg.a(36);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -652) {
            return;
        }
        we.a(param2, param1, param4, false, param3, ((mg) this).field_c);
    }

    final static boolean a(int param0, byte param1) {
        int var2 = -59 % ((param1 - 70) / 32);
        return param0 == (-param0 & param0) ? true : false;
    }

    final static void a(ha param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int discarded$0 = 1;
        bo var2 = fa.a(param0);
        int var3 = 40 + (vs.b(-112) + 40);
        if (param1 != 1150039905) {
            return;
        }
        try {
            var4 = 40 + un.e(-107);
            var5 = sh.field_u - var3 >> 1;
            var6 = gp.field_w + -var4 >> 1;
            param0.d(var4, var3, var6, param1 ^ -1150034421, -65281, var5);
            var2.a(var3 + var5, var5, var4 + var6, var6, param1 ^ 1150039868);
            param0.SA(0, var6, vp.field_i, var4, vp.field_j, vp.field_i * var6, vp.field_i);
            var2.a(true);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mg(ll[] param0) {
        try {
            ((mg) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
        field_a = "Create";
    }
}
