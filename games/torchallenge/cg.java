/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static String[] field_c;
    static byte[][][] field_i;
    static ka field_g;
    static ka[] field_d;
    static fe[] field_a;
    static int[] field_e;
    static boolean[][] field_h;
    static ka[][][] field_b;
    static int[][] field_f;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_f = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == hl.field_d) {
          return;
        } else {
          var1 = (Object) (Object) hl.field_d;
          synchronized (var1) {
            L0: {
              hl.field_d = null;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fe[17];
        field_c = new String[]{"Tower0", "Tower1", "Tower2", "Tower3", "Tower4", "Tower5", "boss1", "boss2", "boss3"};
        field_e = new int[2];
        field_b = new ka[3][2][32];
        field_f = new int[][]{new int[6], new int[6], new int[6], new int[6], new int[6], new int[1], new int[6]};
        field_h = new boolean[][]{new boolean[6], new boolean[6], new boolean[6]};
    }
}
