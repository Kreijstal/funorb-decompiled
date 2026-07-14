/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static double[] field_a;
    static String field_d;
    static nh field_f;
    static String field_b;
    static int[] field_c;
    static int[] field_e;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 <= 66) {
            Object var2 = null;
            nh[] discarded$0 = vh.a((vj) null, -113, 38, -65);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static nh[] a(vj param0, int param1, int param2, int param3) {
        if (param2 <= -15) {
          if (!fl.a(param3, param0, param1, (byte) -98)) {
            return null;
          } else {
            return hd.c(true);
          }
        } else {
          vh.a(-113);
          if (!fl.a(param3, param0, param1, (byte) -98)) {
            return null;
          } else {
            return hd.c(true);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_a = new double[]{0.3, 0.3, 1.0, 0.5, 0.5, 0.5, 0.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.3, 0.0, 0.25, 0.3, 1.0, 0.3, 1.0, 0.5, 1.0, 1.0, 1.0, 0.5, 0.2, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        field_d = "Level complete!";
        field_f = new nh(270, 70);
        field_e = new int[]{0, 8, 8, 8, 8, 8, 12, 6, 5, 4, 6, -1, 8, 6};
    }
}
