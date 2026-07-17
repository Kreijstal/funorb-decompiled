/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends rk {
    static String field_m;
    static String field_o;
    static int[] field_n;
    static java.math.BigInteger field_r;
    int field_s;
    static int[] field_p;
    static bi field_q;

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        if (param0 != -484803804) {
          an.b(91);
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param1 & ~var2;
        } else {
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param1 & ~var2;
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_m = null;
        if (param0 != -22861) {
            return;
        }
        field_p = null;
        field_n = null;
        field_q = null;
        field_r = null;
    }

    an(int param0) {
        ((an) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Not yet achieved";
        field_o = "Player";
        field_r = new java.math.BigInteger("65537");
    }
}
