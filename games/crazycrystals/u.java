/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int field_a;
    static long field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, hj param1, int param2, int param3) {
        try {
            aj.field_t = param3;
            la.field_a = param1;
            if (param2 != 250) {
                Object var5 = null;
                u.a(-59, (hj) null, -43, 103);
            }
            vh.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "u.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 250;
    }
}
