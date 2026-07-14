/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_d;
    int field_c;
    int[] field_a;
    int field_b;

    tf() {
        int var1 = 0;
        int discarded$7 = te.d(16);
        ((tf) this).field_b = te.b() != 0 ? te.d(4) + 1 : 1;
        if (te.b() != 0) {
            int discarded$8 = te.d(8);
        }
        int discarded$12 = te.d(2);
        if (((tf) this).field_b > 1) {
            ((tf) this).field_c = te.d(4);
        }
        ((tf) this).field_a = new int[((tf) this).field_b];
        ((tf) this).field_d = new int[((tf) this).field_b];
        for (var1 = 0; var1 < ((tf) this).field_b; var1++) {
            int discarded$13 = te.d(8);
            ((tf) this).field_a[var1] = te.d(8);
            ((tf) this).field_d[var1] = te.d(8);
        }
    }
}
