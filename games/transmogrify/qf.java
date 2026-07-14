/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static int field_d;
    static int field_e;
    static String[] field_a;
    static long field_b;
    static String[] field_c;

    final static ii a(ii param0, int[] param1, int param2) {
        ii var3 = null;
        Object var4 = null;
        if (param2 != -2) {
          var4 = null;
          ii discarded$1 = qf.a((ii) null, (int[]) null, 115);
          var3 = new ii(0, 0, 0);
          var3.field_d = param0.field_d;
          var3.field_i = param0.field_i;
          var3.field_f = param0.field_f;
          var3.field_c = param0.field_c;
          var3.field_h = param0.field_h;
          var3.field_g = param0.field_g;
          var3.field_j = param1;
          var3.field_b = param0.field_b;
          return var3;
        } else {
          var3 = new ii(0, 0, 0);
          var3.field_d = param0.field_d;
          var3.field_i = param0.field_i;
          var3.field_f = param0.field_f;
          var3.field_c = param0.field_c;
          var3.field_h = param0.field_h;
          var3.field_g = param0.field_g;
          var3.field_j = param1;
          var3.field_b = param0.field_b;
          return var3;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 330138;
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
