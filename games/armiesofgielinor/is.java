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
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        if (param1 >= 0) {
          if (-1583 >= (param1 ^ -1)) {
            if (0 != param1 % param0) {
              return false;
            } else {
              if (0 != param1 % 100) {
                return true;
              } else {
                if (-1 == (param1 % 400 ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            L0: {
              if (param1 % 4 != 0) {
                stackIn_9_0 = 0;
                break L0;
              } else {
                stackIn_9_0 = 1;
                break L0;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          L1: {
            if (-1 != ((param1 + 1) % 4 ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 != -5) {
          field_d = (String) null;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
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
