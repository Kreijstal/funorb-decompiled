/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static String[] field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -3) {
          ef.a((byte) 103, 47);
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 == 82) {
          return param1 == 2 ? true : false;
        }
        ef.a(54);
        return param1 == 2 ? true : false;
    }

    static {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
