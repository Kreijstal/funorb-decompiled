/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp {
    static String field_d;
    static cb field_c;
    static String[] field_a;
    static long field_e;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 329408528) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param2 >> 16;
        if (!param0) {
          int discarded$1 = fp.a(false, 87, -10);
          var4 = param2 & 65535;
          var5 = param1 >> 16;
          var6 = 65535 & param1;
          return (var4 * var6 >> 16) + var3 * param1 - -(var5 * var4);
        } else {
          var4 = param2 & 65535;
          var5 = param1 >> 16;
          var6 = 65535 & param1;
          return (var4 * var6 >> 16) + var3 * param1 - -(var5 * var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = "Accept invitation to <%0>'s game";
    }
}
