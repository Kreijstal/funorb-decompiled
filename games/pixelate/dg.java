/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_a;
    static fm field_d;
    static vg field_f;
    static String field_b;
    static String[] field_c;
    static String field_e;

    final static void a(boolean param0, int param1, int param2, String param3, String param4, int param5) {
        int var7 = 0;
        int discarded$1 = 0;
        pc var8 = aa.field_f;
        var8.g(param5, 15514);
        var8.field_m = var8.field_m + 1;
        if (!param0) {
            return;
        }
        try {
            var7 = var8.field_m;
            var8.e(160, param1);
            if ((param1 ^ -1) == -3) {
                var8.b((byte) -41, param4);
            }
            if (param3 != null) {
                discarded$1 = hn.a(!param0 ? true : false, param3, var8);
            } else {
                var8.b(1276387944, param2);
            }
            var8.f(var8.field_m + -var7, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1048576) {
          dg.a(-108);
          field_e = null;
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 >= -82) {
          field_e = (String) null;
          qh.a((byte) -93, 1048576, bj.field_c[param0], true);
          return;
        } else {
          qh.a((byte) -93, 1048576, bj.field_c[param0], true);
          return;
        }
    }

    static {
        field_a = true;
        field_b = "To <%0>: ";
        field_c = new String[]{"By rating", "By win percentage"};
        field_e = "Show all lobby chat";
    }
}
