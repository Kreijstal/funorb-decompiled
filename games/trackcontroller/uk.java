/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static String field_e;
    static String field_d;
    static int field_c;
    static int field_a;
    static int field_b;

    final static int a(int param0) {
        if (param0 != 0) {
            field_d = null;
            return pa.field_a;
        }
        return pa.field_a;
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != 10) {
            field_a = 70;
            return rd.a(8058, true, param0, 10);
        }
        return rd.a(8058, true, param0, 10);
    }

    final static hg a(String param0, kk param1, kk param2, String param3, int param4) {
        int var5 = -86 / ((param4 - 64) / 53);
        int var6 = param1.a(true, param0);
        int var7 = param1.a(param3, var6, -1);
        return qh.a(param2, var6, param1, var7, -11948);
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != 10) {
          var2 = null;
          int discarded$2 = uk.a((CharSequence) null, -37);
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Hover the mouse over items on the screen for tips on what they do.";
        field_e = "Cancel";
        field_c = -1;
        field_a = 0;
    }
}
