/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_d;
    static ef field_b;
    static int field_c;
    static int field_e;
    static int[] field_a;

    final static void a(int param0) {
        ib.a(930);
        if (null != c.field_h) {
          L0: {
            pd.a(c.field_h, -32);
            hf.i((byte) -32);
            fd.a(52);
            lm.b((byte) -99);
            if (ef.b(0)) {
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
            hf.i((byte) -32);
            fd.a(52);
            lm.b((byte) -99);
            if (ef.b(0)) {
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

    public static void b(int param0) {
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
