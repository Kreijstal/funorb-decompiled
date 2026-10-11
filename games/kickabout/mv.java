/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    static String field_a;
    static int field_b;

    final static up b(boolean param0) {
        up var2 = null;
        up var1 = null;
        if (!param0) {
          var2 = new up();
          var1 = var2;
          var1.field_n = 50;
          var1.field_g = 50;
          var2.field_h = new int[]{110};
          var1.field_q = 4;
          var1.field_o = 50;
          return var1;
        }
        return (up) null;
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        if (param0 > 104) {
          gu.b(1, (byte) 60, vc.field_E[3]);
          gu.b(2, (byte) 60, vc.field_E[5]);
          ui.a(0, fn.field_c, vc.field_E[0], 2147483647);
          return;
        }
        field_b = 48;
        gu.b(1, (byte) 60, vc.field_E[3]);
        gu.b(2, (byte) 60, vc.field_E[5]);
        ui.a(0, fn.field_c, vc.field_E[0], 2147483647);
    }

    static {
        field_b = 3;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$6121ff5511c4(int param0) {
        if (param0 > 104) {
          gu.b(1, (byte) 60, vc.field_E[3]);
          gu.b(2, (byte) 60, vc.field_E[5]);
          ui.a(0, fn.field_c, vc.field_E[0], 2147483647);
          return;
        }
        field_b = 48;
        gu.b(1, (byte) 60, vc.field_E[3]);
        gu.b(2, (byte) 60, vc.field_E[5]);
        ui.a(0, fn.field_c, vc.field_E[0], 2147483647);
    }
}
