/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    int field_b;
    int field_a;
    int[] field_c;
    int[] field_d;

    qc() {
        int var1 = 0;
        int discarded$7 = ml.f(16);
        ((qc) this).field_b = ml.a() != 0 ? ml.f(4) + 1 : 1;
        if (ml.a() != 0) {
            int discarded$8 = ml.f(8);
        }
        int discarded$12 = ml.f(2);
        if (((qc) this).field_b > 1) {
            ((qc) this).field_a = ml.f(4);
        }
        ((qc) this).field_c = new int[((qc) this).field_b];
        ((qc) this).field_d = new int[((qc) this).field_b];
        for (var1 = 0; var1 < ((qc) this).field_b; var1++) {
            int discarded$13 = ml.f(8);
            ((qc) this).field_c[var1] = ml.f(8);
            ((qc) this).field_d[var1] = ml.f(8);
        }
    }
}
