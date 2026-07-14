/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int field_b;
    static String field_a;
    static String field_f;
    static String field_c;
    static String[] field_e;
    static String[] field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ee param0, int param1) {
        if (rl.field_J == null) {
          rl.field_J = new ah();
          if (param1 == -15676) {
            ch.field_i = param0;
            return;
          } else {
            sa.a((byte) 33);
            ch.field_i = param0;
            return;
          }
        } else {
          rk.a((byte) 107);
          if (param1 == -15676) {
            ch.field_i = param0;
            return;
          } else {
            sa.a((byte) 33);
            ch.field_i = param0;
            return;
          }
        }
    }

    final static wd a(wd param0, float param1, byte param2) {
        if (param2 >= -69) {
            field_f = null;
            return wc.a(param0, param1, 1.0f, (byte) -115);
        }
        return wc.a(param0, param1, 1.0f, (byte) -115);
    }

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -45 / ((param0 - -84) / 37);
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Mode: ";
        field_f = "Discard";
        field_e = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_c = "End Tutorial";
        field_d = new String[]{"Grass and tarmac", "Sand and dust", "Ice and snow", "Are you afraid of the dark?"};
    }
}
