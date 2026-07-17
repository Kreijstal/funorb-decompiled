/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_d;
    static ef field_b;
    static int field_c;
    static int field_e;
    static int[] field_a;

    final static void a() {
        int discarded$80 = 930;
        ib.a();
        if (null != c.field_h) {
          L0: {
            int discarded$81 = -32;
            pd.a(c.field_h);
            int discarded$82 = -32;
            hf.i();
            fd.a(52);
            lm.b((byte) -99);
            int discarded$83 = 0;
            if (ef.b()) {
              ac.field_B.d((byte) -87, 1);
              op.a(0, 0);
              break L0;
            } else {
              break L0;
            }
          }
          tl.a(-71);
          return;
        } else {
          L1: {
            int discarded$84 = -32;
            hf.i();
            fd.a(52);
            lm.b((byte) -99);
            int discarded$85 = 0;
            if (ef.b()) {
              ac.field_B.d((byte) -87, 1);
              op.a(0, 0);
              break L1;
            } else {
              break L1;
            }
          }
          tl.a(-71);
          return;
        }
    }

    public static void b() {
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are not currently logged in to the game.";
        field_b = new ef();
    }
}
