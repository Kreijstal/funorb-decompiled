/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static boolean[] field_a;
    static ea[] field_b;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, bj param1, hg param2, int param3) {
        try {
            kc.field_d = param3 * pl.b((byte) -116) / 1000;
            gn.a(param1, (byte) -101);
            hj.a(param1, 347664612);
            dn.a(param1, (byte) 29);
            ul.a(8);
            ii.a(140);
            mn.field_x = -kc.field_d;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fi.A(" + 104 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[35];
        field_a[16] = true;
        field_a[26] = true;
        field_a[10] = true;
        field_a[34] = true;
        field_a[1] = true;
        field_a[0] = true;
        field_a[6] = true;
        field_a[4] = true;
        field_a[32] = true;
        field_a[29] = true;
        field_a[9] = true;
    }
}
