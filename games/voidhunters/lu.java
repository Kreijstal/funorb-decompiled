/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lu {
    static int[] field_f;
    int field_g;
    static boolean field_d;
    static String field_a;
    ml field_b;
    int field_e;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_a = null;
        if (param0 != 87) {
            lu.a((byte) 17);
        }
    }

    lu(int param0, ml param1, int param2) {
        try {
            ((lu) this).field_g = param2;
            ((lu) this).field_e = param0;
            ((lu) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "lu.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[11];
        field_a = "WASD<br>QE<br>Left mouse button<br>Right mouse button<br>Mouse wheel or + and - keys";
        field_c = "Remove <%0> from ignore list";
    }
}
