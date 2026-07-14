/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static ne field_c;
    static int[] field_a;
    static int field_e;
    static int field_b;
    static int field_d;

    public static void a(byte param0) {
        if (param0 != 113) {
            mg.a(false, 103, -66);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, rd param1, int param2) {
        int var4 = 0;
        pa var5 = null;
        var5 = dk.field_s;
        var5.d(25, param2);
        var5.field_q = var5.field_q + 1;
        if (param0 >= -125) {
          field_a = null;
          var4 = var5.field_q;
          var5.d(1, (byte) 122);
          var5.d(param1.field_n, (byte) 122);
          var5.d(param1.field_m, (byte) 122);
          var5.a(param1.field_k, false);
          var5.a(param1.field_l, false);
          var5.a(param1.field_o, false);
          var5.a(param1.field_q, false);
          int discarded$2 = var5.b(var4, 14430);
          var5.a(var5.field_q + -var4, -127);
          return;
        } else {
          var4 = var5.field_q;
          var5.d(1, (byte) 122);
          var5.d(param1.field_n, (byte) 122);
          var5.d(param1.field_m, (byte) 122);
          var5.a(param1.field_k, false);
          var5.a(param1.field_l, false);
          var5.a(param1.field_o, false);
          var5.a(param1.field_q, false);
          int discarded$3 = var5.b(var4, 14430);
          var5.a(var5.field_q + -var4, -127);
          return;
        }
    }

    final static ef a(byte param0, String param1, int param2) {
        ef var3 = null;
        Object var4 = null;
        if (param0 < 12) {
          var4 = null;
          mg.a(34, (rd) null, -58);
          var3 = new ef(false);
          var3.field_g = param1;
          var3.field_n = param2;
          return var3;
        } else {
          var3 = new ef(false);
          var3.field_g = param1;
          var3.field_n = param2;
          return var3;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        fe var3 = null;
        int var4 = 0;
        var3 = bf.field_c[param2][param1];
        if (!param0) {
          mg.a(true, -93, -2);
          var4 = bf.field_d[param1][param2];
          e discarded$4 = ol.a(-123, var3, var4);
          return;
        } else {
          var4 = bf.field_d[param1][param2];
          e discarded$5 = ol.a(-123, var3, var4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 0};
        field_c = new ne();
    }
}
