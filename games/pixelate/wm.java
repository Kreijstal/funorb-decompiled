/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    int field_e;
    int field_b;
    static ak field_d;
    static ge field_a;
    static int field_c;

    final static void a(int param0, boolean[] param1) {
        int var2_int = 0;
        try {
            var2_int = param1[0] ? 1 : 0;
            param1[0] = param1[2];
            if (param0 != -11825) {
                field_a = (ge) null;
            }
            param1[2] = param1[3];
            param1[3] = param1[1];
            param1[1] = var2_int != 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    wm(int param0, int param1, int param2, int param3) {
        this.field_b = param0;
        this.field_e = param3;
    }

    static {
        field_c = 0;
        field_a = new ge();
    }
}
