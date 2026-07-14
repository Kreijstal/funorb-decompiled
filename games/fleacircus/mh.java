/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends aa {
    static ce field_x;
    static int field_w;
    static int field_u;
    static String field_v;
    static int[] field_y;

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          mh.b(124);
          fb.field_c = param0;
          cm.field_j = param3;
          rg.field_n = param2;
          return;
        } else {
          fb.field_c = param0;
          cm.field_j = param3;
          rg.field_n = param2;
          return;
        }
    }

    mh(int param0) {
        this(ug.field_e, param0);
    }

    private mh(fa param0, int param1) {
        super(param0, param1);
    }

    final String c(int param0, qa param1) {
        if (param0 <= 21) {
            return null;
        }
        return ni.a(param1.field_i.length(), '*', (byte) 78);
    }

    public static void b(int param0) {
        field_v = null;
        field_x = null;
        if (param0 != 705) {
            field_w = 44;
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 1;
        field_v = "Tiles in the level (2/3)";
    }
}
