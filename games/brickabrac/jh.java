/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_e;
    static int field_a;
    static int[] field_b;
    static jp field_d;
    static String field_c;

    final static jp a(int param0, jp param1) {
        jp var2 = new jp(param1.field_x / 2, param1.field_z / 2);
        var2.g();
        param1.a(param0, 0, param1.field_x / 2, param1.field_z / 2);
        kc.field_q.a((byte) 102);
        return var2;
    }

    public static void a(byte param0) {
        int var1 = 54 / ((-65 - param0) / 48);
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static void a(boolean param0, mh param1) {
        mh var2 = null;
        int var3 = 0;
        mh var4 = null;
        mh var5 = null;
        mh var5_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        var4 = (mh) (Object) param1.field_bb.d(-104);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              jh.a((byte) -19);
              param1.field_zb = 0;
              param1.field_Db = 0;
              param1.field_cb = 0;
              param1.field_C = 0;
              return;
            } else {
              param1.field_zb = 0;
              param1.field_Db = 0;
              param1.field_cb = 0;
              param1.field_C = 0;
              return;
            }
          } else {
            var4.field_Db = 0;
            var4.field_cb = 0;
            var4.field_C = 0;
            var4.field_zb = 0;
            var5 = (mh) (Object) param1.field_bb.a((byte) 116);
            var5_ref = var5;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Good grief!";
        field_a = 250;
    }
}
