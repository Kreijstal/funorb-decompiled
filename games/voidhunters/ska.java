/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ska extends is {
    static String[] field_n;
    static int[] field_m;
    static long field_p;
    private Object field_l;
    static bc field_o;

    final Object a(int param0) {
        if (param0 < 85) {
            Object discarded$0 = ((ska) this).a(-70);
            return ((ska) this).field_l;
        }
        return ((ska) this).field_l;
    }

    public static void e(int param0) {
        field_o = null;
        field_m = null;
        field_n = null;
    }

    ska(Object param0, int param1) {
        super(param1);
        try {
            ((ska) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(byte param0) {
        if (param0 < 29) {
            Object discarded$0 = ((ska) this).a(-56);
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_m = oea.f((byte) 95);
    }
}
