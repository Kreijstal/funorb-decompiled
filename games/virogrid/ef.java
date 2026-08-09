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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 82) {
          L0: {
            ef.a(54);
            if ((param1 ^ -1) != -3) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param1 ^ -1) != -3) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
