/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_a;
    int[] field_d;
    int field_c;
    int field_b;

    sj() {
        int var1 = 0;
        int discarded$7 = ai.d(16);
        ((sj) this).field_b = ai.a() != 0 ? ai.d(4) + 1 : 1;
        if (ai.a() != 0) {
            int discarded$8 = ai.d(8);
        }
        int discarded$12 = ai.d(2);
        if (((sj) this).field_b > 1) {
            ((sj) this).field_c = ai.d(4);
        }
        ((sj) this).field_a = new int[((sj) this).field_b];
        ((sj) this).field_d = new int[((sj) this).field_b];
        for (var1 = 0; var1 < ((sj) this).field_b; var1++) {
            int discarded$13 = ai.d(8);
            ((sj) this).field_a[var1] = ai.d(8);
            ((sj) this).field_d[var1] = ai.d(8);
        }
    }
}
