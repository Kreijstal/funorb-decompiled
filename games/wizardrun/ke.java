/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends qb {
    static oi field_u;
    static boolean field_w;
    static String field_v;
    static String[] field_t;

    ke(int param0) {
        this(gh.field_b, param0);
    }

    private ke(vd param0, int param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_u = null;
        field_t = null;
        if (param0 >= -63) {
            return;
        }
        field_v = null;
    }

    final String b(ub param0, byte param1) {
        if (param1 != -57) {
          field_u = null;
          return oa.a((byte) -95, '*', param0.field_k.length());
        } else {
          return oa.a((byte) -95, '*', param0.field_k.length());
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Checking";
        field_u = new oi();
    }
}
