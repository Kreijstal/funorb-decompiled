/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    static int field_a;

    final static void a(fla param0, int param1) {
        try {
            int var2_int = 104 % ((param1 - 4) / 38);
            nl.field_f.b((byte) -77, (vg) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rs.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static int a() {
        if (!lca.a(false)) {
            return -1;
        }
        return wu.field_a.d(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
    }
}
