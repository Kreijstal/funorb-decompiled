/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ug {
    static int field_g;
    int field_o;
    int field_h;
    int field_j;
    static cd field_k;
    int field_m;
    int field_e;
    static int[] field_f;
    static String field_p;
    static boolean field_i;
    int[] field_l;
    int field_n;

    final static int a(int param0) {
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1 = param0;
        ki var2 = (ki) (Object) ok.field_a.a((byte) -117);
        while (var2 != null) {
            if (var2.field_q - (float)var2.field_y > (float)var1) {
                var1 = (int)((float)(-var2.field_y) + var2.field_q);
            }
            var2 = (ki) (Object) ok.field_a.d((byte) 63);
        }
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        ((jf) this).field_l = param7;
        ((jf) this).field_e = param5;
        ((jf) this).field_o = param1;
        ((jf) this).field_j = param6;
        ((jf) this).field_m = param3;
        ((jf) this).field_n = param4;
        ((jf) this).field_h = param0;
        if (param2 <= 103) {
            Object var10 = null;
            ((jf) this).a(67, 55, 21, -107, -21, 22, 114, (int[]) null);
        }
    }

    jf() {
    }

    public static void e(int param0) {
        field_p = null;
        field_f = null;
        field_k = null;
        if (param0 > -15) {
            int discarded$0 = jf.a(-105);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_k = new cd("");
        field_f = new int[10];
        field_p = "Accept";
    }
}
