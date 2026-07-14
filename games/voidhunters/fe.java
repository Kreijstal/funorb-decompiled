/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends rqa {
    static int[] field_o;
    static int field_p;

    fe(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 6425) {
            fe.a(-116);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static oib a(String param0, String param1, boolean param2, byte param3) {
        CharSequence var8 = null;
        long var4 = 0L;
        int var7 = 47 % ((param3 - 87) / 33);
        String var6 = null;
        if (-1 != param0.indexOf('@')) {
            var6 = param0;
        } else {
            var8 = (CharSequence) (Object) param0;
            var4 = agb.a(var8, -49);
        }
        return sia.a(90, var4, var6, param2, param1);
    }

    final nc a(nc[] param0, int param1) {
        si.a(94, 62, param0[0].a(12));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{2, 21, 4, 3, 11};
        field_p = -1;
    }
}
