/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pga extends rqa {
    static String field_o;

    final static void a(java.awt.Canvas param0, boolean param1) {
        L0: {
          if (-12 == (qmb.field_q ^ -1)) {
            ana.c((byte) 111);
            break L0;
          } else {
            break L0;
          }
        }
        uob.a(dga.field_a, (byte) 106, mnb.field_g, dkb.field_b);
        if (!param1) {
          pga.a(73);
          dh.a(param0, 0, 0, 0);
          return;
        } else {
          dh.a(param0, 0, 0, 0);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -29417) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    pga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(124, 77));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Start Game";
    }
}
