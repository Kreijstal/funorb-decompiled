/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static qf field_g;
    static long field_e;
    int field_c;
    static qr field_f;
    sf field_b;
    static String field_h;
    static String field_a;
    static gh field_d;

    public static void a() {
        field_f = null;
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static void a(byte param0, int param1) {
        if (param1 < ah.field_T) {
          return;
        } else {
          ah.field_T = param1;
          no.field_f = new boolean[param1];
          og.field_c = new int[param1];
          kq.field_c = new int[param1];
          q.field_Ab = new int[param1];
          return;
        }
    }

    sf(gm param0, int param1) {
        try {
            ((sf) this).field_c = param1;
            ((sf) this).field_b = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Type your email address again to make sure it's correct";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
