/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    int[] field_d;
    int[] field_b;
    int field_a;
    int field_c;

    bf() {
        int var1 = 0;
        int discarded$7 = tl.d(16);
        ((bf) this).field_c = tl.c() != 0 ? tl.d(4) + 1 : 1;
        if (tl.c() != 0) {
            int discarded$8 = tl.d(8);
        }
        int discarded$12 = tl.d(2);
        if (((bf) this).field_c > 1) {
            ((bf) this).field_a = tl.d(4);
        }
        ((bf) this).field_b = new int[((bf) this).field_c];
        ((bf) this).field_d = new int[((bf) this).field_c];
        for (var1 = 0; var1 < ((bf) this).field_c; var1++) {
            int discarded$13 = tl.d(8);
            ((bf) this).field_b[var1] = tl.d(8);
            ((bf) this).field_d[var1] = tl.d(8);
        }
    }
}
