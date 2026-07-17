/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends cm {
    static km[] field_z;
    static String field_x;
    static pf[] field_y;
    private Object field_A;

    el(Object param0, int param1) {
        super(param1);
        try {
            ((el) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "el.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1) {
        nk var2 = null;
        var2 = qn.field_U;
        var2.f(param1, -60);
        if (param0 != 4) {
          field_y = null;
          var2.c(1, (byte) -95);
          var2.c(2, (byte) -56);
          return;
        } else {
          var2.c(1, (byte) -95);
          var2.c(2, (byte) -56);
          return;
        }
    }

    public static void e(byte param0) {
        int var1 = 86 / ((param0 - 49) / 47);
        field_z = null;
        field_y = null;
        field_x = null;
    }

    final boolean g(int param0) {
        if (param0 > -87) {
            ((el) this).field_A = null;
            return false;
        }
        return false;
    }

    final Object f(int param0) {
        if (param0 != -10) {
            el.e((byte) 45);
            return ((el) this).field_A;
        }
        return ((el) this).field_A;
    }

    final static void h(int param0) {
        uk.a(false, 4);
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_y = new pf[7];
    }
}
