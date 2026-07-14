/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    int field_b;
    short field_l;
    static su field_d;
    byte field_f;
    static int[] field_g;
    int field_m;
    short field_a;
    boolean field_e;
    int field_k;
    int field_c;
    short field_j;
    int field_i;
    static String field_h;

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 <= 78) {
            int discarded$0 = ll.a(-66, -115);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        g[] var2 = null;
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        g[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = qg.field_a;
        var2 = var6;
        var3 = param1;
        L0: while (true) {
          if (var6.length > var3) {
            var4 = var6[var3];
            if (var4.field_f == param0) {
              return var4.field_a;
            } else {
              var3++;
              continue L0;
            }
          } else {
            return -1;
          }
        }
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11) {
        ((ll) this).field_a = (short)param5;
        ((ll) this).field_k = param3;
        ((ll) this).field_f = (byte)param8;
        ((ll) this).field_i = param2;
        ((ll) this).field_l = (short)param6;
        ((ll) this).field_c = param1;
        ((ll) this).field_j = (short)param4;
        ((ll) this).field_m = param0;
        ((ll) this).field_b = param11;
        ((ll) this).field_e = param10 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{36, 37, 38, 39, 40, 7, 5, 6, 0};
        field_d = new su(4, 1, 1, 1);
        field_h = "More suggestions";
    }
}
