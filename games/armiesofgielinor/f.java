/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends uq {
    static int[] field_D;
    private Object field_B;
    static je field_C;
    static int field_E;
    static String field_A;

    final boolean a(boolean param0) {
        if (!param0) {
            field_E = -65;
            return false;
        }
        return false;
    }

    public static void c(boolean param0) {
        field_A = null;
        field_D = null;
        field_C = null;
        if (!param0) {
            f.c(true);
        }
    }

    final Object b(boolean param0) {
        if (param0) {
            return (Object) null;
        }
        return this.field_B;
    }

    f(Object param0, int param1) {
        super(param1);
        try {
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_D = new int[]{83};
        field_A = "Type your age in years";
    }
}
