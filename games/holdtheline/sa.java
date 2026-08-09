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
        try {
            if (rl.field_J != null) {
                rk.a((byte) 107);
            } else {
                rl.field_J = new ah();
            }
            if (param1 != -15676) {
                sa.a((byte) 33);
            }
            ch.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wd a(wd param0, float param1, byte param2) {
        RuntimeException var3 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -69) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = wc.a(param0, param1, 1.0f, (byte) -115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
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
        field_a = "Mode: ";
        field_f = "Discard";
        field_e = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_c = "End Tutorial";
        field_d = new String[]{"Grass and tarmac", "Sand and dust", "Ice and snow", "Are you afraid of the dark?"};
    }
}
