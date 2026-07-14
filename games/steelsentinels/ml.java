/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static tg field_g;
    static gk[] field_c;
    static fm field_b;
    static int field_e;
    static int[] field_f;
    static int field_a;
    static String field_d;

    final static void a(int param0, int param1) {
        int var3 = 0;
        ud var4 = null;
        var3 = SteelSentinels.field_G;
        if (param0 > -29) {
          return;
        } else {
          var4 = (ud) (Object) uf.field_f.e(13058);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              r.a(27153, var4, param1);
              var4 = (ud) (Object) uf.field_f.a((byte) -36);
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, cf param1, int param2) {
        kj var3 = mm.field_g;
        var3.a(param2, (byte) -117);
        var3.field_p = var3.field_p + 1;
        int var4 = var3.field_p;
        var3.a((byte) 117, param0);
        var3.a((byte) 114, param1.field_r);
        var3.a((byte) 121, param1.field_B);
        var3.b(true, param1.field_C);
        var3.b(true, param1.field_E);
        var3.b(true, param1.field_z);
        var3.b(true, param1.field_y);
        int discarded$0 = var3.f(-72, var4);
        var3.b((byte) -115, var3.field_p - var4);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 <= 12) {
          ml.a((byte) 119, -100);
          field_c = null;
          field_f = null;
          field_g = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_f = null;
          field_g = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        kj var2 = null;
        Object var3 = null;
        var2 = mm.field_g;
        if (param0 != 12) {
          var3 = null;
          ml.a(-28, (cf) null, 56);
          var2.a(param1, (byte) -117);
          var2.a((byte) 118, 1);
          var2.a((byte) 125, 3);
          return;
        } else {
          var2.a(param1, (byte) -117);
          var2.a((byte) 118, 1);
          var2.a((byte) 125, 3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[128];
        field_d = "Message lobby";
        field_a = 500;
        field_b = new fm(13, 0, 1, 0);
    }
}
