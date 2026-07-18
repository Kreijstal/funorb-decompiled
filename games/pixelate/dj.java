/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static boolean field_c;
    static ak field_a;
    static int[] field_b;

    final static void a(byte param0, jl param1, jl param2, int param3) {
        try {
            if (param0 >= -98) {
                Object var5 = null;
                dj.a((byte) -124, (jl) null, (jl) null, -15);
            }
            wb.field_c = param3;
            bg.field_j = param2;
            ma.field_y = param1;
            op.b(t.field_d / 2, t.field_j / 2, true);
            jj.a(param2.field_z + param2.field_D, false, param1.field_D, param2.field_D, param1.field_D + param1.field_z);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, tf[] param2, int param3) {
        try {
            nl.field_c = new sb(param2);
            ao.field_d = param1;
            v.field_d = param0;
            dj.a(-1501881951);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dj.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + -1501881951 + ')');
        }
    }

    private final static void a(int param0) {
        int var1 = ka.m(22);
        int var2 = go.c(107);
        nl.field_c.a(-ao.field_d + ce.field_c, (ao.field_d << 1) + var2, -1, (v.field_d << 1) + var1, -v.field_d + qn.field_o);
        vh.a(88);
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
