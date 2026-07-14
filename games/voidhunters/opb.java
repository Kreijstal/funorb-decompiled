/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opb extends rqa {
    static int field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          opb.a(-89, 5, (byte) -112, -51, 115, 72, 68);
          return new nc((Object) (Object) frb.a(13, 103));
        } else {
          return new nc((Object) (Object) frb.a(13, 103));
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 == -128) {
          if (li.field_i) {
            if (fua.field_o) {
              og.field_r.a(72, param1, param6, param4 << -1115023848 | param5, param0, param3);
              return;
            } else {
              return;
            }
          } else {
            dma.d(param0, param1, param6, param3, param5, param4);
            return;
          }
        } else {
          field_o = -36;
          if (li.field_i) {
            if (!fua.field_o) {
              return;
            } else {
              og.field_r.a(72, param1, param6, param4 << -1115023848 | param5, param0, param3);
              return;
            }
          } else {
            dma.d(param0, param1, param6, param3, param5, param4);
            return;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 <= 57) {
            opb.a(-77, 127, (byte) 35, -88, 55, 91, -105);
            field_p = null;
            return;
        }
        field_p = null;
    }

    opb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Show lobby chat from my friends";
        field_o = 25;
    }
}
