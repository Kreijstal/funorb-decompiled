/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dva extends rqa {
    static long field_p;
    static boolean field_o;

    dva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = -121L;
          return new nc((Object) (Object) frb.a(142, 97));
        } else {
          return new nc((Object) (Object) frb.a(142, 97));
        }
    }

    final static void a(int param0, lta param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        hha.a(param1.a(param0, (byte) 127), (byte) 66, param1.a(param7, (byte) 123), param1.b(true, param4), param5, param1.b(true, param2), param6);
        int var8 = -param0 + param7;
        int var9 = param2 + -param4;
        int var10 = -(var9 / 8) + param0 + var8 * 3 / 4;
        int var11 = var8 / 8 + (3 * var9 / 4 + param4);
        hha.a(param1.a(var10, (byte) 116), (byte) 66, param1.a(param7, (byte) 116), param1.b(true, var11), param5, param1.b(true, param2), param6);
        var10 = param0 - (-(3 * var8 / 4) + -(var9 / 8));
        var11 = -(var8 / 8) + param4 - -(param3 * var9 / 4);
        hha.a(param1.a(var10, (byte) 125), (byte) 66, param1.a(param7, (byte) 121), param1.b(true, var11), param5, param1.b(true, param2), param6);
    }

    final static void e(byte param0) {
        fja.a(11);
        ce.b(false);
        wlb.f((byte) 64);
        jk.h(118);
        if (param0 <= 87) {
            field_o = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0L;
        field_o = false;
    }
}
