/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    int field_b;
    int field_c;
    int[] field_d;
    int[] field_a;

    qh() {
        int var1 = 0;
        int discarded$7 = sd.a(16);
        ((qh) this).field_b = sd.a() != 0 ? sd.a(4) + 1 : 1;
        if (sd.a() != 0) {
            int discarded$8 = sd.a(8);
        }
        int discarded$12 = sd.a(2);
        if (((qh) this).field_b > 1) {
            ((qh) this).field_c = sd.a(4);
        }
        ((qh) this).field_d = new int[((qh) this).field_b];
        ((qh) this).field_a = new int[((qh) this).field_b];
        for (var1 = 0; var1 < ((qh) this).field_b; var1++) {
            int discarded$13 = sd.a(8);
            ((qh) this).field_d[var1] = sd.a(8);
            ((qh) this).field_a[var1] = sd.a(8);
        }
    }
}
