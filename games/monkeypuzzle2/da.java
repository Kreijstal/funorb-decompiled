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
          field_b = (float[][]) null;
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
        field_b = (float[][]) null;
    }

    static {
        field_b = new float[][]{new float[]{65.0f, 300.0f}, new float[]{128.0f, 325.0f}, new float[]{162.0f, 360.0f}, new float[]{208.0f, 361.0f}, new float[]{239.0f, 356.0f}, new float[]{284.0f, 355.0f}, new float[]{315.0f, 366.0f}, new float[]{370.0f, 360.0f}, new float[]{402.0f, 359.0f}, new float[]{466.0f, 367.0f}, new float[]{505.0f, 356.0f}, new float[]{547.0f, 352.0f}};
    }
}
