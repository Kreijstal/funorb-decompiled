/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    int[] field_b;
    int[] field_a;
    int field_d;
    int field_c;

    oi() {
        int var1 = 0;
        int discarded$7 = hi.d(16);
        ((oi) this).field_c = hi.b() != 0 ? hi.d(4) + 1 : 1;
        if (hi.b() != 0) {
            int discarded$8 = hi.d(8);
        }
        int discarded$12 = hi.d(2);
        if (((oi) this).field_c > 1) {
            ((oi) this).field_d = hi.d(4);
        }
        ((oi) this).field_a = new int[((oi) this).field_c];
        ((oi) this).field_b = new int[((oi) this).field_c];
        for (var1 = 0; var1 < ((oi) this).field_c; var1++) {
            int discarded$13 = hi.d(8);
            ((oi) this).field_a[var1] = hi.d(8);
            ((oi) this).field_b[var1] = hi.d(8);
        }
    }
}
