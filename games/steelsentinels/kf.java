/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ck {
    String[][] field_x;
    static String field_o;
    static boolean field_s;
    static int[] field_t;
    int[][] field_z;
    static String field_r;
    int field_C;
    static String field_v;
    int field_u;
    boolean field_q;
    long[][] field_D;
    int field_w;
    static int field_p;
    static String field_B;
    static String[] field_A;
    static gh field_y;

    public static void d() {
        field_r = null;
        field_B = null;
        field_t = null;
        field_A = null;
        field_o = null;
        field_v = null;
        field_y = null;
    }

    kf() {
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        var2 = -27 % ((10 - param1) / 49);
        if (param0 < 65) {
          if (97 <= param0) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (90 < param0) {
            if (97 <= param0) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "WEAPONS";
        field_r = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_v = "<%1> plummeted like a stalled brick";
        field_p = 0;
    }
}
