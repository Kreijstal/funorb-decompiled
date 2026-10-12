/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static IndexedSprite[] field_e;
    static boolean field_h;
    static String field_g;
    static int field_a;
    static String field_c;
    static String[] field_b;
    static String field_f;
    static je field_d;

    final static EventPresenter a(GameplayController param0, int param1, Battlefield param2, boolean param3, GameEvent param4, eo param5) {
        EventPresenter var6 = null;
        RuntimeException var6_ref = null;
        EventPresenter stackIn_2_0 = null;
        EventPresenter stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10120) {
            stackIn_2_0 = (EventPresenter) null;
            return stackIn_2_0;
          }
          var6 = new EventPresenter(param0, param2, param5, param4, param3);
          if (!var6.initialize(-19702)) {
            return null;
          }
          stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("cp.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (!param0) {
          field_b = null;
          field_g = null;
          field_c = null;
          return;
        }
        eo var2 = (eo) null;
        cp.a((GameplayController) null, -1, (Battlefield) null, false, (GameEvent) null, (eo) null);
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        field_c = "In-game Equipment";
        field_g = "Hide players in <%0>'s game";
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_f = "<%0> has dropped out.";
    }
}
