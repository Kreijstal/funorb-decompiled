/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private ed[] field_c;
    static String[] field_f;
    static String field_d;
    static String field_a;
    static String field_b;
    static String field_e;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ld.a(param4, ((fd) this).field_c, 4, param1, param0, param3);
        if (param2 != -96) {
            ((fd) this).a(45, 104, 124, -52, 19);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
    }

    fd(ed[] param0) {
        try {
            ((fd) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        if (160 != param1) {
          if (param1 != 32) {
            if (param1 != 95) {
              if (param1 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Become a member to get this expansion and...";
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_b = "Name is available";
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_e = "Tether will not reach - please land closer";
    }
}
