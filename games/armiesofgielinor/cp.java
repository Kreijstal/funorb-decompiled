/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static ru[] field_e;
    static boolean field_h;
    static String field_g;
    static int field_a;
    static String field_c;
    static String[] field_b;
    static String field_f;
    static je field_d;

    final static vb a(ic param0, int param1, ha param2, boolean param3, oj param4, eo param5) {
        vb var6 = null;
        if (param1 == 10120) {
          var6 = new vb(param0, param2, param5, param4, param3);
          if (!var6.e(-19702)) {
            return null;
          } else {
            return var6;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0) {
          var2 = null;
          vb discarded$2 = cp.a((ic) null, -1, (ha) null, false, (oj) null, (eo) null);
          field_b = null;
          field_g = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "In-game Equipment";
        field_g = "Hide players in <%0>'s game";
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_f = "<%0> has dropped out.";
    }
}
