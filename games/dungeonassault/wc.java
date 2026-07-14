/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_c;
    int[] field_a;
    int[] field_b;
    int field_d;

    wc() {
        int var1 = 0;
        int discarded$7 = jp.a(16);
        ((wc) this).field_c = jp.b() != 0 ? jp.a(4) + 1 : 1;
        if (jp.b() != 0) {
            int discarded$8 = jp.a(8);
        }
        int discarded$12 = jp.a(2);
        if (((wc) this).field_c > 1) {
            ((wc) this).field_d = jp.a(4);
        }
        ((wc) this).field_a = new int[((wc) this).field_c];
        ((wc) this).field_b = new int[((wc) this).field_c];
        for (var1 = 0; var1 < ((wc) this).field_c; var1++) {
            int discarded$13 = jp.a(8);
            ((wc) this).field_a[var1] = jp.a(8);
            ((wc) this).field_b[var1] = jp.a(8);
        }
    }
}
