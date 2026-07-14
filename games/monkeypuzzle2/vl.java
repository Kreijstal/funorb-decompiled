/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends ug {
    static ul field_f;
    static int field_g;
    int field_e;
    int field_m;
    static boolean field_j;
    int field_l;
    int field_i;
    static qf field_h;
    int field_n;
    int field_k;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            vl.a(true);
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static le[] a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
          vl.a(false);
          return he.a((byte) 67, 1, param1, param0, param2);
        } else {
          return he.a((byte) 67, 1, param1, param0, param2);
        }
    }

    vl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((vl) this).field_k = param5;
        ((vl) this).field_l = param2;
        ((vl) this).field_m = param0;
        ((vl) this).field_n = param1;
        ((vl) this).field_i = param3;
        ((vl) this).field_e = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
