/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha extends bw {
    int field_h;
    static boolean field_f;
    int field_g;
    static sna field_i;
    static String field_j;
    static int field_k;

    final void c(byte param0) {
        ((kha) this).field_g = ((kha) this).field_g - 1;
        int var2 = 41 % ((param0 - -14) / 40);
    }

    kha(int param0, int param1) {
        ((kha) this).field_g = param1;
        ((kha) this).field_h = param0;
    }

    public static void a(int param0) {
        if (param0 > -111) {
            kha.a(36);
            field_j = null;
            field_i = null;
            return;
        }
        field_j = null;
        field_i = null;
    }

    final void d(byte param0) {
        ((kha) this).field_g = ((kha) this).field_g + 1;
        int var2 = 115 / ((-80 - param0) / 46);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "No Awards";
    }
}
