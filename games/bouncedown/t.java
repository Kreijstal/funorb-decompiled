/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends eg {
    static String[] field_r;
    private Object field_s;
    static String field_t;

    final boolean c(byte param0) {
        boolean discarded$0 = false;
        if (param0 > -123) {
            discarded$0 = this.c((byte) -60);
            return false;
        }
        return false;
    }

    t(Object param0, int param1) {
        super(param1);
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != -32504) {
            field_r = (String[]) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    final Object e(int param0) {
        int var2 = 12 % ((-47 - param0) / 47);
        return this.field_s;
    }

    static {
    }
}
