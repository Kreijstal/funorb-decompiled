/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    static String field_a;
    static int field_b;

    final static up b() {
        up var2 = new up();
        up var1 = var2;
        var1.field_n = 50;
        var1.field_g = 50;
        var2.field_h = new int[]{110};
        var1.field_q = 4;
        var1.field_o = 50;
        return var1;
    }

    public static void a() {
        field_a = null;
    }

    final static void a(byte param0) {
        if (param0 <= 104) {
          field_b = 48;
          gu.b(1, (byte) 60, vc.field_E[3]);
          gu.b(2, (byte) 60, vc.field_E[5]);
          int discarded$4 = 2147483647;
          ui.a(0, fn.field_c, vc.field_E[0]);
          return;
        } else {
          gu.b(1, (byte) 60, vc.field_E[3]);
          gu.b(2, (byte) 60, vc.field_E[5]);
          int discarded$5 = 2147483647;
          ui.a(0, fn.field_c, vc.field_E[0]);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 3;
    }
}
