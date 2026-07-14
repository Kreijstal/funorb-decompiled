/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    int field_b;
    int[] field_c;
    int field_a;

    final void a() {
        int var1 = 0;
        ((qc) this).field_b = 0;
        for (var1 = 0; var1 < ((qc) this).field_c.length; var1++) {
            ((qc) this).field_c[var1] = 0;
        }
    }

    qc(int param0) {
        ((qc) this).field_c = new int[param0];
    }
}
