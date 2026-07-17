/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static String field_b;
    static char[] field_c;
    static ah[] field_a;
    static int[] field_d;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0) {
            aa.a(true);
        }
    }

    final static void a(wi param0, boolean param1, ud param2, byte param3, int param4, java.awt.Component param5) {
        if (param3 > -104) {
            return;
        }
        try {
            hw.a(param5, param4, param4, (byte) 123, param1, param2, param0, 1024);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "aa.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Arcade Mode unlocked!";
        field_c = new char[128];
        field_d = new int[8192];
        er discarded$0 = new er(1);
    }
}
