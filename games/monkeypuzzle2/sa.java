/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    int field_c;
    int[] field_b;
    int[] field_a;
    int field_d;

    sa() {
        int var1 = 0;
        int discarded$7 = sf.f(16);
        ((sa) this).field_c = sf.b() != 0 ? sf.f(4) + 1 : 1;
        if (sf.b() != 0) {
            int discarded$8 = sf.f(8);
        }
        int discarded$12 = sf.f(2);
        if (((sa) this).field_c > 1) {
            ((sa) this).field_d = sf.f(4);
        }
        ((sa) this).field_a = new int[((sa) this).field_c];
        ((sa) this).field_b = new int[((sa) this).field_c];
        for (var1 = 0; var1 < ((sa) this).field_c; var1++) {
            int discarded$13 = sf.f(8);
            ((sa) this).field_a[var1] = sf.f(8);
            ((sa) this).field_b[var1] = sf.f(8);
        }
    }
}
