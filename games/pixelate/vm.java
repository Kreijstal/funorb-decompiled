/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static String[] field_c;
    static String[] field_e;
    static String field_f;
    static vg field_b;
    static io field_a;
    static boolean field_d;
    static String field_g;

    final static eq a(int param0, byte param1) {
        return null == dg.field_f ? null : (eq) (Object) dg.field_f.a(-11434, (long)param0);
    }

    final static fm a(boolean param0, byte param1, boolean param2, int param3) {
        return el.a(-107, true, false, param3, 1, false);
    }

    final static void b(int param0) {
        io.field_e = 3 & param0 >> 4;
        if (io.field_e > 2) {
            io.field_e = 2;
            gh.field_v = (14 & param0) >> 2;
            if (!(gh.field_v <= 2)) {
                gh.field_v = 2;
            }
            ib.field_e = param0 & 3;
            if (ib.field_e <= 2) {
                return;
            }
            ib.field_e = 2;
            return;
        }
        gh.field_v = (14 & param0) >> 2;
        if (!(gh.field_v <= 2)) {
            gh.field_v = 2;
        }
        ib.field_e = param0 & 3;
        if (ib.field_e > 2) {
            ib.field_e = 2;
            return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 77) {
          vm.a(11);
          field_b = null;
          field_g = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Try Again";
        field_a = new io("usename");
        field_g = "Cancel";
    }
}
