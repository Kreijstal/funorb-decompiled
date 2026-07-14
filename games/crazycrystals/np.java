/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    int field_b;
    int field_a;
    int[] field_d;
    int[] field_c;

    np() {
        int var1 = 0;
        int discarded$7 = bl.a(16);
        ((np) this).field_b = bl.b() != 0 ? bl.a(4) + 1 : 1;
        if (bl.b() != 0) {
            int discarded$8 = bl.a(8);
        }
        int discarded$12 = bl.a(2);
        if (((np) this).field_b > 1) {
            ((np) this).field_a = bl.a(4);
        }
        ((np) this).field_c = new int[((np) this).field_b];
        ((np) this).field_d = new int[((np) this).field_b];
        for (var1 = 0; var1 < ((np) this).field_b; var1++) {
            int discarded$13 = bl.a(8);
            ((np) this).field_c[var1] = bl.a(8);
            ((np) this).field_d[var1] = bl.a(8);
        }
    }
}
