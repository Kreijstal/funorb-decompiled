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
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  param1 = th.a(param1, 110, '_', "");
                  var3 = qc.a(param2, 1);
                  if ((param1.indexOf(param2) ^ -1) != 0) {
                    break L2;
                  } else {
                    if (0 == (param1.indexOf(var3) ^ -1)) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("vh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void c(int param0) {
        field_s = null;
        if (param0 != 95) {
          field_q = (int[][]) null;
          field_k = null;
          field_q = (int[][]) null;
          field_h = null;
          field_r = null;
          field_i = null;
          return;
        } else {
          field_k = null;
          field_q = (int[][]) null;
          field_h = null;
          field_r = null;
          field_i = null;
          return;
        }
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_o = param0;
            this.field_g = param3;
            this.field_t = param7;
            this.field_m = param2;
            this.field_f = param5;
            if (param1 != 95) {
                this.field_o = (int[]) null;
            }
            this.field_l = param6;
            this.field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "vh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    vh() {
    }

    static {
        field_s = new df("usename");
        field_h = new qd();
        field_q = new int[9][];
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_i = "Instructions";
    }
}
