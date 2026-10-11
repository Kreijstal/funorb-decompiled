/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static String field_c;
    static vf field_a;
    static String field_d;
    static tg[] field_b;

    public static void a(byte param0) {
        if (param0 == 47) {
          field_c = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_b = (tg[]) null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -660) {
          return;
        }
        if (null == nj.field_o) {
          return;
        }
        var1 = nj.field_o;
        synchronized (var1) {
          nj.field_o = null;
        }
    }

    static {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = new vf();
    }
}
