/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    int field_c;
    int[] field_b;
    int[] field_d;
    int field_a;

    ig() {
        int var1 = 0;
        int discarded$7 = wg.d(16);
        ((ig) this).field_c = wg.a() != 0 ? wg.d(4) + 1 : 1;
        if (wg.a() != 0) {
            int discarded$8 = wg.d(8);
        }
        int discarded$12 = wg.d(2);
        if (((ig) this).field_c > 1) {
            ((ig) this).field_a = wg.d(4);
        }
        ((ig) this).field_d = new int[((ig) this).field_c];
        ((ig) this).field_b = new int[((ig) this).field_c];
        for (var1 = 0; var1 < ((ig) this).field_c; var1++) {
            int discarded$13 = wg.d(8);
            ((ig) this).field_d[var1] = wg.d(8);
            ((ig) this).field_b[var1] = wg.d(8);
        }
    }
}
