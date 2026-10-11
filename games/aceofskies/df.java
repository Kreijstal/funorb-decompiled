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
        int var2 = -120 / ((param1 - 22) / 39);
        if (param0 >= 65) {
          if (90 >= param0) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        int var1 = 20 / ((param0 + 5) / 46);
        field_g = null;
    }

    static {
        field_g = "No highscores";
    }
}
