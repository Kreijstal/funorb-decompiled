/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nrb implements wwa {
    static pgb[] field_b;
    static String field_a;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        try {
            int var6_int = 34 % ((-27 - param0) / 35);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nrb.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 11227) {
            nrb.a(-127);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        blb discarded$0 = new blb();
        field_a = "Decline invitation to <%0>'s game";
    }
}
