/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends hg {
    bl field_k;
    int field_i;
    static String[] field_l;
    static int field_h;
    int field_n;
    int field_g;
    int field_j;
    int field_m;

    final static te[] a(int param0, int param1, mf param2, int param3) {
        Object var5 = null;
        if (uc.a(param2, 100, param3, param0)) {
          if (param1 != 255) {
            var5 = null;
            te[] discarded$2 = bl.a(49, -40, (mf) null, 15);
            return fg.a(13029);
          } else {
            return fg.a(13029);
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 255) {
            bl.d(125);
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4) {
        ((bl) this).field_i = param1;
        ((bl) this).field_g = param2;
        ((bl) this).field_j = param3;
        ((bl) this).field_m = param0;
        ((bl) this).field_n = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[255];
    }
}
