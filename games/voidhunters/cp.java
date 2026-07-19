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
        this.field_k = param6;
        this.field_r = param1;
        this.field_i = param2;
        this.field_o = param7;
        this.field_h = param3;
        this.field_m = param5;
        this.field_p = param4;
        this.field_l = param0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = this.field_l * param2 >> -63330516;
        int var5 = param1 * this.field_r >> -1346969460;
        int var6 = param2 * this.field_i >> 1345789132;
        int var7 = param1 * this.field_h >> 1384563692;
        int var8 = this.field_p * param2 >> -1128074164;
        int var9 = param1 * this.field_m >> 1291727468;
        int var12 = -88 / ((param0 - -48) / 40);
        int var10 = param2 * this.field_k >> -1817053140;
        int var11 = this.field_o * param1 >> 945022412;
        pqa.a(var9, var5, var4, this.field_d, var6, var7, var8, 88, var11, var10);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 != 110) {
            this.b((byte) 79, 23, -77);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 > -121) {
            return;
        }
        field_j = null;
        field_n = null;
        field_q = null;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -112) {
            this.field_l = -85;
        }
    }

    static {
        field_q = new gl(6);
        field_g = "Please select an option in the '<%0>' row.";
        field_j = "<%0> would need a rating of <%1> to play with the current options.";
        field_f = 0;
    }
}
