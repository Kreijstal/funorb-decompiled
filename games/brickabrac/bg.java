/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends IntrusiveNode {
    byte[][][] field_m;
    int field_s;
    static java.security.SecureRandom field_p;
    PlatformTask[] field_j;
    int[] field_q;
    static int[] parisBackgroundColors;
    static int field_r;
    int[] field_t;
    static String field_o;
    static int[][] field_n;
    int[] field_k;
    PlatformTask[] field_l;
    int field_i;

    final static int a(int param0, int param1, int param2) {
        if (param1 != 29) {
          bg.a(6);
          if (param2 != 1) {
            return rh.field_b[param2];
          }
          if (gq.b(param0, -1)) {
            return 29;
          }
          return rh.field_b[param2];
        }
        if (param2 != 1) {
          return rh.field_b[param2];
        }
        if (gq.b(param0, -1)) {
          return 29;
        }
        return rh.field_b[param2];
    }

    public static void a(int param0) {
        if (param0 != 6) {
          return;
        }
        field_n = (int[][]) null;
        field_o = null;
        parisBackgroundColors = null;
        field_p = null;
    }

    final static boolean containsRectanglePoint(int left, int rectangleHeight, int rectangleWidth, byte obfuscationGuard, int pointY, int pointX, int top) {
        if (obfuscationGuard <= 32) {
          field_r = -47;
          if (pointX < left) {
            return false;
          }
          if (left + rectangleWidth <= pointX) {
            return false;
          }
          if (top > pointY) {
            return false;
          }
          if (rectangleHeight + top > pointY) {
            return true;
          }
          return false;
        }
        if (pointX < left) {
          return false;
        }
        if (left + rectangleWidth <= pointX) {
          return false;
        }
        if (top > pointY) {
          return false;
        }
        if (rectangleHeight + top > pointY) {
          return true;
        }
        return false;
    }

    bg() {
    }

    static {
        field_o = "Awesome!";
        field_n = new int[9][];
        parisBackgroundColors = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_n[3] = new int[]{1, 4473924, 1};
        field_n[5] = new int[]{1, 128, 1};
        field_n[4] = new int[]{1, 255, 1};
        field_n[8] = new int[]{1, 12303291, 1};
        field_n[1] = new int[]{1, 13966189, 1};
        field_n[7] = new int[]{1, 5367552, 1};
        field_n[6] = new int[]{1, 0, 1};
        field_n[0] = new int[]{1, 4826854, 1};
        field_n[2] = new int[]{1, 16777215, 1};
    }
}
