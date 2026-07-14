/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ii extends sh {
    static String field_d;
    private long field_b;
    private String field_f;
    static String field_a;
    static im field_c;
    static String field_e;

    final void a(mg param0, int param1) {
        param0.a(((ii) this).field_b, -16943);
        if (param1 != 27557) {
          field_d = null;
          param0.a((byte) 113, ((ii) this).field_f);
          return;
        } else {
          param0.a((byte) 113, ((ii) this).field_f);
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != -26268) {
            ii.b(-100);
            field_a = null;
            return;
        }
        field_a = null;
    }

    fk a(int param0) {
        if (param0 != 10277) {
            ii.b(77);
            return oj.field_j;
        }
        return oj.field_j;
    }

    ii(long param0, String param1) {
        ((ii) this).field_b = param0;
        ((ii) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading instruments";
        field_e = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = "to keep fullscreen or";
    }
}
