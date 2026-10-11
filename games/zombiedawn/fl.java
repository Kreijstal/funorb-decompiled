/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static eo a(int param0, boolean param1) {
        eo var2 = null;
        if (param0 == 5) {
          var2 = new eo(true);
          var2.field_d = param1 ? true : false;
          return var2;
        }
        return (eo) null;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 == -54) {
          field_b = null;
          field_c = null;
          return;
        }
        fl.a(44, false);
        field_b = null;
        field_c = null;
    }

    static {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = new int[]{170, 150, 140, 160};
        field_e = 5;
    }
}
