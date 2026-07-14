/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static ts field_b;
    static String field_c;
    static dk field_a;
    private static String field_z;

    final static su a(Throwable param0, String param1) {
        su var2_ref = null;
        su var2 = null;
        if (param0 instanceof su) {
            var2 = (su) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2_ref = new su(param0, param1);
        }
        return var2_ref;
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          su discarded$2 = qo.a((Throwable) null, (String) null);
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qo.B(";
        field_b = new ts(11, 0, 1, 2);
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
        field_a = new dk();
    }
}
