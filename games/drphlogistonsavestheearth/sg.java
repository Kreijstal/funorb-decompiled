/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static he field_e;
    static bb field_d;
    static bb field_b;
    static String[] field_f;
    static boolean field_a;
    static String[] field_c;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 != -6988) {
                sg.a((byte) -81);
            }
            hg.a(param1, -1, "");
            bf.a(63, param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "sg.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != -57) {
            return;
        }
        field_b = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_e = null;
    }

    final static void a(boolean param0) {
        if (!param0) {
            sg.a((byte) 45);
            sf.a(17, 11649);
            return;
        }
        sf.a(17, 11649);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bb();
        field_b = new bb();
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
