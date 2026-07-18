/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static eh field_f;
    static ln field_d;
    static String field_a;
    static eg field_b;
    static String field_e;
    static int field_c;

    final static void a(ha param0, boolean param1, byte param2) {
        try {
            sb.a(true, (byte) -33, param0, 256);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "da.C(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + -119 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 115) {
          field_d = null;
          ec.a(65280);
          de.a(param3, param4, param0, param1);
          return;
        } else {
          ec.a(65280);
          de.a(param3, param4, param0, param1);
          return;
        }
    }

    final static void a(pg param0, int param1, pg param2) {
        try {
            if (param2.field_a != null) {
                param2.a(true);
            }
            param2.field_a = param0.field_a;
            param2.field_b = param0;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "da.A(" + (param0 != null ? "{...}" : "null") + ',' + 20 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 0;
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        ff.field_c = tj.field_t.b(ce.field_g[20]);
        var1 = tj.field_t.b(ce.field_g[21]);
        if (ff.field_c < var1) {
          ff.field_c = var1;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Rankings";
        field_f = new eh();
        field_e = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
