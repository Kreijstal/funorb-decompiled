/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String[] field_a;
    static String field_c;
    static String[] field_d;
    static String field_b;

    final static boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -1) {
          return true;
        } else {
          if (param0 != 18740) {
            return true;
          } else {
            L0: {
              if (-1 == (ef.field_a & 1 << param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) di.field_O);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) di.field_O);
        cg.field_H = -1;
        if (param0 != 2670) {
            boolean discarded$0 = gj.a(83, 12);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 29748) {
          field_c = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "To Customer Support";
        field_a = new String[]{"By rating", "By win percentage"};
        field_c = "Password is valid";
        field_d = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
