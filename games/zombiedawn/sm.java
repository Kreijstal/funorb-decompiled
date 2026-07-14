/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static int field_c;
    static int field_a;
    static String field_b;

    final static int a(int param0, boolean param1, String param2) {
        if (param0 == 32564) {
          if (param1) {
            return wb.field_m.b(param2);
          } else {
            return re.field_g.b(param2);
          }
        } else {
          sm.a(true);
          if (param1) {
            return wb.field_m.b(param2);
          } else {
            return re.field_g.b(param2);
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            int discarded$0 = sm.a(22, false, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Open in popup window";
        field_c = 240;
    }
}
