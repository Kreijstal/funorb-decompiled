/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spb {
    static String field_a;

    final static void a(byte param0) {
        if (!(null != psb.field_b)) {
            return;
        }
    }

    public static void b(int param0) {
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 >= -54) {
            return true;
        }
        if (!(fva.field_p)) {
            return false;
        }
        if (ow.field_b == 0) {
            return true;
        }
        return false;
    }

    final static void a(byte param0, dqb param1) {
        try {
            eob.field_o = param1;
            int var2_int = 12 % ((param0 - 19) / 37);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "spb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponent";
    }
}
