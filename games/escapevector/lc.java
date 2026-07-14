/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    int field_a;
    int[] field_b;

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((lc) this).field_b.length; var1++) {
            ((lc) this).field_b[var1] = 0;
        }
    }

    lc(int param0) {
        ((lc) this).field_b = new int[param0];
    }
}
