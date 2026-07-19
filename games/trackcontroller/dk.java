/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static int field_a;
    static String[] field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 == 9888) {
            return;
        }
        aa discarded$0 = dk.a(99, (byte) 15);
    }

    final static aa a(int param0, byte param1) {
        aa[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        aa[] var5 = null;
        var4 = TrackController.field_F ? 1 : 0;
        var5 = fi.e(0);
        var2 = var5;
        var3 = 0;
        if (param1 == 25) {
          L0: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_c) {
                return var5[var3];
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (aa) null;
        }
    }

    static {
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
