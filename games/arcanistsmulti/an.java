/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends bd {
    private String field_k;
    private String field_i;
    static eg field_o;
    static int field_g;
    static int field_f;
    static int field_j;
    static String field_n;
    static String field_m;
    static int[] field_e;
    static int[] field_h;
    static boolean field_l;

    final void a(wk param0, int param1) {
        param0.a(((an) this).field_k, (byte) -89);
        int var3 = 124 / ((-35 - param1) / 36);
        param0.a((byte) 7, ((an) this).field_i);
    }

    public static void a(byte param0) {
        field_e = null;
        field_n = null;
        field_o = null;
        int var1 = 25 / ((param0 - 39) / 52);
        field_m = null;
        field_h = null;
    }

    final ch a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return k.field_q;
    }

    an(String param0, String param1) {
        ((an) this).field_k = param0;
        ((an) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Grassy Hills:";
        field_f = 640;
        field_h = new int[5];
        field_l = false;
        field_j = 480;
        field_g = 0;
        field_e = new int[12];
        field_n = "Wands can be spent on the '<%0>' screen to acquire new spells for your spellbook.";
    }
}
