/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jrb extends rqa {
    static String field_p;
    static int field_o;

    final static llb a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return rga.field_f.field_wb;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 != -2326) {
            field_p = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          llb discarded$2 = jrb.a(24);
          jw.field_c = param0[0].a(false);
          return new nc((Object) (Object) "void");
        } else {
          jw.field_c = param0[0].a(false);
          return new nc((Object) (Object) "void");
        }
    }

    jrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static llb b(boolean param0) {
        if (param0) {
            llb discarded$0 = jrb.a(45);
            return rgb.field_f.field_wb;
        }
        return rgb.field_f.field_wb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Security";
    }
}
