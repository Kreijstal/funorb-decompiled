/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    int field_d;
    int[] field_c;
    int[] field_b;
    int field_a;

    uo() {
        int var1 = 0;
        int discarded$7 = t.d(16);
        ((uo) this).field_a = t.b() != 0 ? t.d(4) + 1 : 1;
        if (t.b() != 0) {
            int discarded$8 = t.d(8);
        }
        int discarded$12 = t.d(2);
        if (((uo) this).field_a > 1) {
            ((uo) this).field_d = t.d(4);
        }
        ((uo) this).field_c = new int[((uo) this).field_a];
        ((uo) this).field_b = new int[((uo) this).field_a];
        for (var1 = 0; var1 < ((uo) this).field_a; var1++) {
            int discarded$13 = t.d(8);
            ((uo) this).field_c[var1] = t.d(8);
            ((uo) this).field_b[var1] = t.d(8);
        }
    }
}
