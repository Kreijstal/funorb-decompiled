/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_c;
    int[] field_a;
    int[] field_b;
    int field_d;

    jf() {
        int var1 = 0;
        int discarded$7 = ag.d(16);
        ((jf) this).field_d = ag.c() != 0 ? ag.d(4) + 1 : 1;
        if (ag.c() != 0) {
            int discarded$8 = ag.d(8);
        }
        int discarded$12 = ag.d(2);
        if (((jf) this).field_d > 1) {
            ((jf) this).field_c = ag.d(4);
        }
        ((jf) this).field_b = new int[((jf) this).field_d];
        ((jf) this).field_a = new int[((jf) this).field_d];
        for (var1 = 0; var1 < ((jf) this).field_d; var1++) {
            int discarded$13 = ag.d(8);
            ((jf) this).field_b[var1] = ag.d(8);
            ((jf) this).field_a[var1] = ag.d(8);
        }
    }
}
