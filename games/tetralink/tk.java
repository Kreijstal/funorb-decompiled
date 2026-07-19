/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static char field_a;
    static String field_d;
    static String field_f;
    static String field_e;
    static String field_c;
    static boolean field_b;

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 81) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != -161) {
            tk.a(-94);
        }
    }

    static {
        field_d = "You must play <%1> more rated games before playing with the current options.";
        field_e = "Withdraw request to join <%0>'s game";
        field_c = "Rating";
        field_a = '/';
        field_f = "<%0> has resigned and left.";
    }
}
