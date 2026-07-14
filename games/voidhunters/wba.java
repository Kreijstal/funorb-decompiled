/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba extends rqa {
    static int[] field_o;
    static ge field_p;

    final static aja a(byte param0, ha param1, phb param2) {
        jva var6 = null;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (!(param2 instanceof jva)) {
            var6 = new jva(param2.field_q, param2.field_p);
            var6.field_l = param2.field_l;
            var6.field_n = param2.field_n;
            var6.field_m = param2.field_m;
            var6.field_k = param2.field_k;
            for (var4 = 0; var6.field_r.length > var4; var4++) {
                var6.field_r[var4] = 0 == param2.field_r[var4] ? 0 : knb.a(-16777216, param2.field_r[var4]);
            }
            param2 = (phb) (Object) var6;
        }
        if (param0 > -61) {
            field_o = null;
        }
        aja var3 = param1.a(param2.field_m, param2.field_m, param2.field_r, 0, (byte) 64, param2.field_n);
        return var3;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          wba.a(73);
          return new nc((Object) (Object) frb.a(190, 116));
        } else {
          return new nc((Object) (Object) frb.a(190, 116));
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 > -70) {
            field_p = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    wba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
