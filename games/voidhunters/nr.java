/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends rqa {
    static String field_o;
    static boolean field_p;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nr.a((kla) null, -72, 98, -34, -112, -87);
          return new nc((Object) (Object) frb.a(57, 92));
        } else {
          return new nc((Object) (Object) frb.a(57, 92));
        }
    }

    nr(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(kla param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = (-dma.field_g + ip.field_p.width) / param3;
        int var7 = ip.field_p.height + -dma.field_j;
        int var8 = param5 + var6;
        int var9 = var7 + param4;
        int var10 = param1 - -var6;
        int var11 = var7 + param2;
        param0.a(var8, var10, var9, var11, (byte) -85);
        og.field_r.SA(var6, param4 + var7, dma.field_g, param2 + -param4, dma.field_i, param4 * dma.field_g, dma.field_g);
        param0.a(true);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -124) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Hold right click to grab ship components";
    }
}
