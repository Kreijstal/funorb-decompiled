/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    int field_b;
    int[] field_c;
    int[] field_d;
    int field_a;

    pi() {
        int var1 = 0;
        int discarded$7 = nj.a(16);
        ((pi) this).field_b = nj.b() != 0 ? nj.a(4) + 1 : 1;
        if (nj.b() != 0) {
            int discarded$8 = nj.a(8);
        }
        int discarded$12 = nj.a(2);
        if (((pi) this).field_b > 1) {
            ((pi) this).field_a = nj.a(4);
        }
        ((pi) this).field_d = new int[((pi) this).field_b];
        ((pi) this).field_c = new int[((pi) this).field_b];
        for (var1 = 0; var1 < ((pi) this).field_b; var1++) {
            int discarded$13 = nj.a(8);
            ((pi) this).field_d[var1] = nj.a(8);
            ((pi) this).field_c[var1] = nj.a(8);
        }
    }
}
