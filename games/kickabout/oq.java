/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    int[] field_a;
    int field_b;
    int[] field_d;
    int field_c;

    oq() {
        int var1 = 0;
        int discarded$7 = tg.e(16);
        ((oq) this).field_b = tg.b() != 0 ? tg.e(4) + 1 : 1;
        if (tg.b() != 0) {
            int discarded$8 = tg.e(8);
        }
        int discarded$12 = tg.e(2);
        if (((oq) this).field_b > 1) {
            ((oq) this).field_c = tg.e(4);
        }
        ((oq) this).field_a = new int[((oq) this).field_b];
        ((oq) this).field_d = new int[((oq) this).field_b];
        for (var1 = 0; var1 < ((oq) this).field_b; var1++) {
            int discarded$13 = tg.e(8);
            ((oq) this).field_a[var1] = tg.e(8);
            ((oq) this).field_d[var1] = tg.e(8);
        }
    }
}
