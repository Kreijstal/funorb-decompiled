/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int field_c;
    static ck[] field_d;
    static int field_f;
    static ck field_b;
    static String field_e;
    static dh[] field_i;
    static ck field_j;
    static w field_a;
    static long field_h;
    static int[] field_g;

    final static w a(int param0) {
        return wf.c(-122);
    }

    final static int[] c(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        int[] var4 = new int[4];
        int[] var1 = var4;
        for (var2 = 0; var2 < 4; var2++) {
            var4[var2] = bf.field_y.nextInt();
        }
        return var1;
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_b = null;
        field_d = null;
        field_g = null;
    }

    static {
        int var0 = 0;
        field_d = new ck[64];
        field_f = 0;
        field_e = "City";
        for (var0 = 0; var0 < 64; var0++) {
            field_d[var0] = new ck(9, 9);
        }
        field_h = 0L;
        field_g = new int[8];
    }
}
