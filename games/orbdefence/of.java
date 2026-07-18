/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends s {
    static long field_L;
    static String field_I;
    static String[] field_N;
    static String field_H;
    static int field_K;
    static int field_G;

    of(String param0, ag param1, boolean param2) {
        this(param0, param1);
        try {
            ((of) this).field_D = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private of(String param0, td param1, ag param2) {
        super(param0, param1, param2);
        try {
            ((of) this).field_j = mb.field_a.field_e;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_H = null;
        field_N = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((of) this).field_D = !((of) this).field_D ? true : false;
        super.b(param0, param1, param2, param3);
    }

    private of(String param0, ag param1) {
        this(param0, mb.field_a.field_l, param1);
        try {
            ((of) this).field_j = mb.field_a.field_e;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_I = "This level is only available to members.";
        field_G = 0;
    }
}
