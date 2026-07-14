/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    int field_d;
    int field_c;
    int[] field_b;
    int[] field_a;

    wf() {
        int var1 = 0;
        int discarded$7 = uk.e(16);
        ((wf) this).field_c = uk.b() != 0 ? uk.e(4) + 1 : 1;
        if (uk.b() != 0) {
            int discarded$8 = uk.e(8);
        }
        int discarded$12 = uk.e(2);
        if (((wf) this).field_c > 1) {
            ((wf) this).field_d = uk.e(4);
        }
        ((wf) this).field_b = new int[((wf) this).field_c];
        ((wf) this).field_a = new int[((wf) this).field_c];
        for (var1 = 0; var1 < ((wf) this).field_c; var1++) {
            int discarded$13 = uk.e(8);
            ((wf) this).field_b[var1] = uk.e(8);
            ((wf) this).field_a[var1] = uk.e(8);
        }
    }
}
