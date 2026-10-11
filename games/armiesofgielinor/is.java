/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    static String field_f;
    static String field_d;
    static int field_b;
    static String field_a;
    static String field_c;
    static int[] field_e;
    static String field_g;

    final static boolean a(int param0, int param1) {
        if (param1 < 0) {
          return (param1 + 1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return param1 % 4 == 0 ? true : false;
        }
        if (0 != param1 % param0) {
          return false;
        }
        if (0 != param1 % 100) {
          return true;
        }
        if (param1 % 400 != 0) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 == -5) {
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_d = (String) null;
        field_g = null;
        field_c = null;
        field_f = null;
    }

    static {
        field_d = "Loading music";
        field_f = "Waiting for fonts";
        field_a = "You must be a member to play with the current options.";
        field_c = "Cancel rematch";
        field_g = "Honour";
        field_e = new int[8192];
    }
}
