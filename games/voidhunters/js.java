/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends rqa {
    static int field_r;
    static int field_s;
    static String[] field_p;
    static boolean field_q;
    static int field_o;

    js(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          js.a(-46, -76, -106);
          return new nc((Object) (Object) frb.a(111, 80));
        } else {
          return new nc((Object) (Object) frb.a(111, 80));
        }
    }

    public static void a(int param0) {
        if (param0 != -20626) {
            js.a(43);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = pk.field_o - param2;
        int var4 = noa.field_q - param1;
        kc.field_b = var3;
        uia.field_b = var4;
        int var5 = -112 / ((param0 - -16) / 59);
        oq.field_H = var3;
        qs.field_a = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
        field_p = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_s = 50;
    }
}
