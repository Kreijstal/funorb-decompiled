/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static int[] field_a;
    short field_e;
    int field_k;
    int field_m;
    int field_j;
    int field_l;
    static int[] field_h;
    short field_f;
    static String[] field_d;
    byte field_c;
    boolean field_g;
    short field_i;
    int field_b;
    static long field_n;

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        if (param0 != 79) {
            field_n = 63L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    pm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11) {
        this.field_b = param3;
        this.field_k = param2;
        this.field_m = param1;
        this.field_j = param11;
        this.field_f = (short)param6;
        this.field_l = param0;
        this.field_c = (byte)param8;
        this.field_e = (short)param5;
        this.field_i = (short)param4;
        this.field_g = param10 ? true : false;
    }

    static {
        field_h = new int[13];
        field_h[8] = 40;
        field_h[7] = 30;
        field_h[11] = 40;
        field_h[0] = 10;
        field_h[5] = 20;
        field_h[10] = 40;
        field_h[2] = 20;
        field_h[12] = 35;
        field_h[4] = 20;
        field_h[3] = 20;
        field_h[1] = 0;
        field_h[6] = 20;
        field_h[9] = 20;
        field_a = new int[5];
    }
}
