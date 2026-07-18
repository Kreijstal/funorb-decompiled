/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends ev {
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_p;
    private int field_i;
    private int field_m;
    private int field_r;
    private int field_o;
    static gl field_q;
    static String field_j;
    static String field_g;
    static eab field_n;
    static int field_f;

    cp(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        ((cp) this).field_k = param6;
        ((cp) this).field_r = param1;
        ((cp) this).field_i = param2;
        ((cp) this).field_o = param7;
        ((cp) this).field_h = param3;
        ((cp) this).field_m = param5;
        ((cp) this).field_p = param4;
        ((cp) this).field_l = param0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = ((cp) this).field_l * param2 >> 12;
        int var5 = param1 * ((cp) this).field_r >> 12;
        int var6 = param2 * ((cp) this).field_i >> 12;
        int var7 = param1 * ((cp) this).field_h >> 12;
        int var8 = ((cp) this).field_p * param2 >> 12;
        int var9 = param1 * ((cp) this).field_m >> 12;
        int var12 = -88 / ((param0 - -48) / 40);
        int var10 = param2 * ((cp) this).field_k >> 12;
        int var11 = ((cp) this).field_o * param1 >> 12;
        pqa.a(var9, var5, var4, ((cp) this).field_d, var6, var7, var8, 88, var11, var10);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 != 110) {
            ((cp) this).b((byte) 79, 23, -77);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        field_q = null;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -112) {
            ((cp) this).field_l = -85;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new gl(6);
        field_g = "Please select an option in the '<%0>' row.";
        field_j = "<%0> would need a rating of <%1> to play with the current options.";
        field_f = 0;
    }
}
