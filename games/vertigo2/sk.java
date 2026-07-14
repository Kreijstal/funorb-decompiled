/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_c;
    static int field_b;
    static String[] field_f;
    static short field_a;
    static String field_d;
    static int field_e;
    static boolean field_g;

    final static int a(String param0, int param1, int param2, int param3, String param4, String param5, boolean param6) {
        qj var7 = null;
        qj var8 = null;
        Object var9 = null;
        var7 = new qj(param4);
        if (param1 != -1) {
          var9 = null;
          int discarded$2 = sk.a((String) null, -93, -32, -91, (String) null, (String) null, true);
          var8 = new qj(param5);
          return wn.a(false, param2, var7, param3, param0, param6, var8);
        } else {
          var8 = new qj(param5);
          return wn.a(false, param2, var7, param3, param0, param6, var8);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
            field_a = (short) -123;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = (short) 0;
        field_d = "This game is full.";
        field_e = -1;
        field_c = "Honour";
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
