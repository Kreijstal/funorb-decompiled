/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends bb {
    static int field_L;
    static volatile int field_O;
    static String field_K;
    static String field_M;
    static java.security.SecureRandom field_N;

    public static void c(boolean param0) {
        field_K = null;
        field_M = null;
        field_N = null;
    }

    private vk(String param0, ch param1, kd param2) {
        super(param0, param1, param2);
        try {
            ((vk) this).field_p = nf.field_M.field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    vk(String param0, kd param1, boolean param2) {
        this(param0, param1);
        try {
            ((vk) this).field_G = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private vk(String param0, kd param1) {
        this(param0, nf.field_M.field_p, param1);
        try {
            ((vk) this).field_p = nf.field_M.field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((vk) this).field_G = !((vk) this).field_G ? true : false;
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = 0;
        field_K = "Quit to website";
        field_O = 0;
        field_M = "Achieved";
    }
}
