/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends rqa {
    static float field_p;
    static String field_q;
    static String field_r;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(166, 62, param0[0].a(113));
          return new nc((Object) (Object) "void");
        }
    }

    jj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, int param2, float param3, int param4, int param5) {
        if (param1 == 7) {
          if (li.field_i) {
            if (lfa.field_j) {
              og.field_r.a(param0 | param4 << -821705192, Math.max(1, (int)param3), param5, param2, (byte) -113);
              return;
            } else {
              return;
            }
          } else {
            dma.e(param5, param2, (int)param3, param0, param4);
            return;
          }
        } else {
          jj.a(-51, (byte) -126, 78, -1.8534518480300903f, -88, 102);
          if (li.field_i) {
            if (!lfa.field_j) {
              return;
            } else {
              og.field_r.a(param0 | param4 << -821705192, Math.max(1, (int)param3), param5, param2, (byte) -113);
              return;
            }
          } else {
            dma.e(param5, param2, (int)param3, param0, param4);
            return;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -32 / ((param0 - 39) / 32);
        field_q = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1.0f;
        field_q = "Add friend";
        field_r = null;
        field_o = 192;
    }
}
