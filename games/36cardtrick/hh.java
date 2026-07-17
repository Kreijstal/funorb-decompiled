/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends qb {
    static sc field_g;
    int field_h;

    public static void a() {
        field_g = null;
    }

    final static String b() {
        String var1 = "";
        if (!(null == i.field_a)) {
            var1 = i.field_a.d((byte) -99);
        }
        if (!(-1 != var1.length())) {
            int discarded$0 = 114;
            var1 = sg.b();
        }
        if (-1 == var1.length()) {
            var1 = vd.field_l;
        }
        return var1;
    }

    hh(int param0) {
        ((hh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sc();
    }
}
