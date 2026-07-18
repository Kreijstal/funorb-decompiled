/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static tf field_a;
    static hd field_b;
    static int field_e;
    static kg[][] field_c;
    static int[] field_d;

    final static void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        et.field_d.field_h = !param5 ? true : false;
        et.field_d.field_l = !param2 ? true : false;
        et.field_d.field_A = !param6 ? true : false;
        et.field_d.field_Y = !param1 ? true : false;
        et.field_d.field_y = !param4 ? true : false;
        et.field_d.field_z = !param3 ? true : false;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 > -60) {
          ps.b(-77);
          var2 = param1 >>> 1;
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        } else {
          var2 = param1 >>> 1;
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != -27680) {
            field_c = null;
        }
    }

    final static boolean a(int param0) {
        if (!(ms.field_b != -1)) {
            if (!(uj.a((byte) 52, 1))) {
                return false;
            }
            ms.field_b = un.field_e.h((byte) -106);
            un.field_e.field_n = 0;
        }
        if (ms.field_b != -2) {
            return uj.a((byte) -114, ms.field_b);
        }
        if (!(uj.a((byte) 29, 2))) {
            return false;
        }
        ms.field_b = un.field_e.a((byte) 81);
        un.field_e.field_n = 0;
        return uj.a((byte) -114, ms.field_b);
    }

    abstract kj a(byte param0);

    abstract void a(iw param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new tf();
        field_d = new int[7];
        field_d[6] = 14000;
        field_d[0] = 0;
        field_d[5] = 7000;
        field_d[2] = 180;
        field_d[4] = 1700;
        field_d[3] = 560;
        field_d[1] = 10;
    }
}
