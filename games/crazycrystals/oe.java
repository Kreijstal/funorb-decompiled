/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int[] field_b;
    static String[] field_d;
    static int[] field_c;
    static fq[] field_a;

    final static si a(boolean param0, byte param1) {
        si var2 = new si(true);
        var2.field_f = param0 ? true : false;
        if (param1 <= 93) {
          return (si) null;
        }
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 >= -97) {
          oe.a(50);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_b = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_b[var1] = var0;
        }
        field_d = new String[]{"fgtiles_brick", "fgtiles_hedge", "fgtiles_steel", "fgtiles_concrete"};
        field_c = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 8, 8, 0, 0, 0, 0, 0, 0, 4, 0};
    }
}
