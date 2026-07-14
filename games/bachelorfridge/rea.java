/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends bw {
    static sna field_g;
    double field_o;
    double field_m;
    int field_n;
    double field_j;
    double field_l;
    int field_i;
    static String field_f;
    static kv field_k;
    int field_h;

    public static void c(byte param0) {
        Object var2 = null;
        field_g = null;
        if (param0 > -105) {
          var2 = null;
          rea.a((eaa) null, -84, 24, (byte) -29, -110, -31);
          field_k = null;
          field_f = null;
          return;
        } else {
          field_k = null;
          field_f = null;
          return;
        }
    }

    final static void a(eaa param0, int param1, int param2, byte param3, int param4, int param5) {
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        int var6 = -35 % ((param3 - -3) / 43);
        rea var7 = (rea) (Object) param0.b((byte) 90);
        while (var7 != null) {
            var8 = (630 & (int)var7.field_m * 8357 - -(326565 * (int)var7.field_j)) + (var7.field_n >> -743846559);
            if ((var8 ^ -1) < -257) {
                var8 = 256;
            }
            qna.field_l[var7.field_i].a((int)var7.field_m + param2 - 128, param5 + ((int)var7.field_l + -64 - 16), 4 * var7.field_n);
            var7 = (rea) (Object) param0.c(0);
        }
    }

    rea(int param0, int param1, int param2, int param3) {
        ((rea) this).field_l = (double)param2;
        ((rea) this).field_i = param3;
        ((rea) this).field_j = (double)param1;
        ((rea) this).field_m = (double)param0;
        ((rea) this).field_h = -2;
        ((rea) this).field_n = 256;
        ((rea) this).field_o = 0.0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Join";
    }
}
