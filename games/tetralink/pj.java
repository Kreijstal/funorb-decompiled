/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static kh[] field_a;
    static hl field_d;
    static pk field_i;
    static ji field_f;
    static String[] field_h;
    static String[] field_g;
    static int field_e;
    static String field_c;
    static ie field_b;

    final static boolean b(byte param0) {
        if (param0 < 28) {
            field_e = 38;
            return me.field_d;
        }
        return me.field_d;
    }

    final static java.awt.Container a(byte param0) {
        if (param0 > -15) {
            return (java.awt.Container) null;
        }
        if (null != ea.field_h) {
            return (java.awt.Container) ((Object) ea.field_h);
        }
        return (java.awt.Container) ((Object) lk.q(13));
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 <= 25) {
          field_c = (String) null;
          field_d = null;
          field_f = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    static {
        field_c = "You can join this game";
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
