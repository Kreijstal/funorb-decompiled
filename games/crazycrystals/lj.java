/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_b;
    static String field_a;

    final static dh a(db param0, String param1, db param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param4 != 17153) {
          var7 = null;
          lj.a(96, (we) null, -65);
          var5 = param0.a(param1, param4 ^ -17154);
          var6 = param0.a(-2862, param3, var5);
          return ve.a(103, param0, var6, param2, var5);
        } else {
          var5 = param0.a(param1, param4 ^ -17154);
          var6 = param0.a(-2862, param3, var5);
          return ve.a(103, param0, var6, param2, var5);
        }
    }

    final static void a(int param0, we param1, int param2) {
        tb.field_b.b(0, (jb) (Object) param1);
        pm.a(param0, param1, (byte) 71);
        if (param2 > -38) {
            field_b = -2;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 30447) {
            Object var2 = null;
            lj.a(45, (we) null, 63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This entry doesn't match";
    }
}
