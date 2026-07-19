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
        try {
            param0.a(this.field_k, (byte) -89);
            int var3_int = 124 / ((-35 - param1) / 36);
            param0.a((byte) 7, this.field_i);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "an.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
            return (ch) null;
        }
        return k.field_q;
    }

    an(String param0, String param1) {
        try {
            this.field_k = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
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
