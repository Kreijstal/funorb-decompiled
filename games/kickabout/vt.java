/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt {
    static String field_a;
    static byte[][] field_d;
    static String field_b;
    static nu field_c;

    public static void a(int param0) {
        int var1 = 11 % ((36 - param0) / 52);
        field_c = null;
        field_d = (byte[][]) null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (!param1) {
          field_c = (nu) null;
          if (param0 < 48) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (97 > param0) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 57) {
            return true;
          }
          if (param0 < 65) {
            if (97 > param0) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_28_0 = (97 <= param0) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (97 > param0) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_64_0 = (97 <= param0) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 < 65) {
          if (97 > param0) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (param0 <= 90) {
          return true;
        }
        stackIn_50_0 = (97 <= param0) && (param0 <= 122);
        return stackIn_50_0;
    }

    static {
        field_b = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new byte[50][];
        field_a = "Cancel";
    }
}
