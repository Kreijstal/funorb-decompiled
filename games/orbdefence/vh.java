/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ca {
    int field_p;
    int field_f;
    int field_m;
    int field_t;
    int[] field_o;
    static df field_s;
    int field_g;
    int field_l;
    static qd field_h;
    static String field_k;
    static int[][] field_q;
    static String field_i;
    static String[] field_r;
    static int field_n;
    static boolean field_j;

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          param1 = th.a(param1, 110, '_', "");
          var3 = qc.a(param2, 1);
          if (param1.indexOf(param2) == 0) {
            if (0 != param1.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public static void c(int param0) {
        field_s = null;
        if (param0 != 95) {
          field_q = null;
          field_k = null;
          field_q = null;
          field_h = null;
          field_r = null;
          field_i = null;
          return;
        } else {
          field_k = null;
          field_q = null;
          field_h = null;
          field_r = null;
          field_i = null;
          return;
        }
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((vh) this).field_o = param0;
        ((vh) this).field_g = param3;
        ((vh) this).field_t = param7;
        ((vh) this).field_m = param2;
        ((vh) this).field_f = param5;
        if (param1 != 95) {
          ((vh) this).field_o = null;
          ((vh) this).field_l = param6;
          ((vh) this).field_p = param4;
          return;
        } else {
          ((vh) this).field_l = param6;
          ((vh) this).field_p = param4;
          return;
        }
    }

    vh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new df("usename");
        field_h = new qd();
        field_q = new int[9][];
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_i = "Instructions";
    }
}
