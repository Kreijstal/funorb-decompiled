/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    int[] field_a;
    int field_d;
    int field_c;
    int[] field_b;

    oh() {
        int var1 = 0;
        int discarded$7 = ad.d(16);
        ((oh) this).field_d = ad.a() != 0 ? ad.d(4) + 1 : 1;
        if (ad.a() != 0) {
            int discarded$8 = ad.d(8);
        }
        int discarded$12 = ad.d(2);
        if (((oh) this).field_d > 1) {
            ((oh) this).field_c = ad.d(4);
        }
        ((oh) this).field_b = new int[((oh) this).field_d];
        ((oh) this).field_a = new int[((oh) this).field_d];
        for (var1 = 0; var1 < ((oh) this).field_d; var1++) {
            int discarded$13 = ad.d(8);
            ((oh) this).field_b[var1] = ad.d(8);
            ((oh) this).field_a[var1] = ad.d(8);
        }
    }
}
