/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hlb extends rqa {
    static int field_p;
    static String field_o;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 != 255) {
          int discarded$2 = hlb.a(75, 111);
          var2 = param0 + -50;
          return Math.min(255 * var2 / 50, 255);
        } else {
          var2 = param0 + -50;
          return Math.min(255 * var2 / 50, 255);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(58, 90));
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param3 <= 44) {
          field_o = null;
          qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        } else {
          qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        }
    }

    hlb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 66) {
            hlb.e((byte) 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Left wing";
        field_p = 256;
    }
}
