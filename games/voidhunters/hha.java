/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hha extends rqa {
    static boolean field_o;
    static khb field_p;

    hha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        gcb.field_p = param0[0].a(false);
        if (param1 > -119) {
          field_o = true;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_p = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (-256 != (param6 ^ -1)) {
          if (param1 == 66) {
            if (!li.field_i) {
              dma.b(param0, param3, param2, param5, param4, param6);
              return;
            } else {
              rnb.a(param6 << 1403185624 | param4, (byte) 73, param3, param0, param5, param2);
              return;
            }
          } else {
            hha.a(38, (byte) -85, -31, 24, 124, 91, -113);
            if (!li.field_i) {
              dma.b(param0, param3, param2, param5, param4, param6);
              return;
            } else {
              rnb.a(param6 << 1403185624 | param4, (byte) 73, param3, param0, param5, param2);
              return;
            }
          }
        } else {
          c.a(param5, param2, param0, param3, -16777216, param4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new khb("usename");
    }
}
