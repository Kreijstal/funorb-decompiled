/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class df {
    static int field_f;
    int field_e;
    int field_d;
    int field_a;
    int field_h;
    static String field_g;
    int field_b;
    int field_c;

    final static boolean a(char param0, int param1) {
        int var2 = 0;
        var2 = -120 / ((param1 - 22) / 39);
        if (param0 < 65) {
          if (param0 >= 97) {
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
            if (param0 >= 97) {
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

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        int var1 = 20 / ((param0 - -5) / 46);
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "No highscores";
    }
}
