/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int field_a;
    static float[][] field_b;
    static int[] field_c;

    final static boolean a(int param0) {
        if (param0 == 352) {
          if (ci.field_a != null) {
            if (!ci.field_a.c(-1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (ci.field_a != null) {
            if (!ci.field_a.c(-1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        if (param0 >= -32) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[][]{new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2]};
    }
}
