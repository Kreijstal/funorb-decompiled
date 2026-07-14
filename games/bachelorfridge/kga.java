/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga {
    static kg field_c;
    static kv field_d;
    static kv field_a;
    int[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 15238) {
            return;
        }
        field_c = null;
    }

    kga(int param0, int[] param1) {
        int var3 = 0;
        int var4 = 0;
        ((kga) this).field_b = param1;
        for (var3 = 0; var3 < ((kga) this).field_b.length; var3++) {
            for (var4 = 0; ((kga) this).field_b.length > var4; var4++) {
                if (((kga) this).field_b[var4] != ((kga) this).field_b[var3]) {
                }
            }
        }
    }

    static {
    }
}
