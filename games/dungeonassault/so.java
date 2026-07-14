/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static aj field_b;
    static String field_a;

    final static void a(byte param0, ne param1, ne param2) {
        Object var4 = null;
        if (param2.field_a == null) {
          param2.field_a = param1.field_a;
          param2.field_e = param1;
          param2.field_a.field_e = param2;
          param2.field_e.field_a = param2;
          if (param0 <= 36) {
            var4 = null;
            so.a((byte) -107, (ne) null, (ne) null);
            return;
          } else {
            return;
          }
        } else {
          param2.a(false);
          param2.field_a = param1.field_a;
          param2.field_e = param1;
          param2.field_a.field_e = param2;
          param2.field_e.field_a = param2;
          if (param0 > 36) {
            return;
          } else {
            var4 = null;
            so.a((byte) -107, (ne) null, (ne) null);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 95) {
            so.a((byte) -62);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> increased by <%1>";
    }
}
