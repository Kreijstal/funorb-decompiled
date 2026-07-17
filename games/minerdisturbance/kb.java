/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static ik field_b;
    static int field_c;
    static bg field_e;
    static String field_d;
    static int field_a;

    public static void a() {
        int var1 = 0;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static String a(int param0) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = '*';
        }
        int discarded$0 = 81;
        kb.a();
        return new String(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new bg(1, 2, 2, 0);
        field_d = "Click here to collapse or expand the map.";
    }
}
