/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static boolean field_b;

    public static void a(int param0) {
        if (param0 != -123) {
          hm.a(-6);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_27_0 = false;
        if (param0 <= 89) {
          return false;
        }
        if (48 > param1) {
          if (param1 < 65) {
            if (param1 >= 97 &&
              param1 <= 122) {
              return true;
            }
            return false;
          }
          if (90 >= param1) {
            return true;
          }
          stackIn_27_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_27_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 >= 65 &&
          90 >= param1) {
          return true;
        }
        if (param1 < 97) {
          return false;
        }
        if (param1 > 122) {
          return false;
        }
        return true;
    }

    static {
        field_a = "Confirm Password: ";
    }
}
