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
        if (param0 != -13) {
          return;
        } else {
          field_b = (ka[][][]) null;
          field_i = (byte[][][]) null;
          field_g = null;
          field_e = null;
          field_h = (boolean[][]) null;
          field_a = null;
          field_f = (int[][]) null;
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == hl.field_d) {
          if (param0 != -102) {
            field_f = (int[][]) null;
            return;
          } else {
            return;
          }
        } else {
          var1 = hl.field_d;
          synchronized (var1) {
            L0: {
              hl.field_d = null;
              break L0;
            }
          }
          L1: {
            if (param0 == -102) {
              break L1;
            } else {
              field_f = (int[][]) null;
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_a = new fe[17];
        field_c = new String[]{"Tower0", "Tower1", "Tower2", "Tower3", "Tower4", "Tower5", "boss1", "boss2", "boss3"};
        field_e = new int[2];
        field_b = new ka[3][2][32];
        field_f = new int[][]{new int[]{0, 2, 0, 60, 140, 80}, new int[]{0, 1, 0, 60, 140, 80}, new int[]{0, 3, 0, 80, 120, 80}, new int[]{3, 5, 1, 160, 200, 0}, new int[]{0, 2, 0, 100, 40, 80}, new int[]{-1}, new int[]{3, 5, 1, 160, 200, 0}};
        field_h = new boolean[][]{new boolean[]{false, false, true, false, true, true}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, true, false, true, false}};
    }
}
