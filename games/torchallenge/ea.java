/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static int field_f;
    static int field_c;
    static qe[] field_g;
    static ka field_h;
    static int field_e;
    static int[] field_a;
    static int[] field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_h = null;
        if (param0 > -78) {
          return;
        }
        field_g = null;
        field_a = null;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 > -113) {
          field_c = -89;
          if (param0 < 48) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (57 >= param0) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
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
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 < 97) {
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
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (57 >= param0) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
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
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    static {
        field_h = null;
        field_e = 0;
        field_c = 100;
        field_d = new int[16];
        field_b = "Login: ";
    }
}
