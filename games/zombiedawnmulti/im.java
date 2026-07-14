/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    int[] field_b;
    int field_d;
    int field_c;
    int[] field_a;

    im() {
        int var1 = 0;
        int discarded$7 = ac.a(16);
        ((im) this).field_c = ac.b() != 0 ? ac.a(4) + 1 : 1;
        if (ac.b() != 0) {
            int discarded$8 = ac.a(8);
        }
        int discarded$12 = ac.a(2);
        if (((im) this).field_c > 1) {
            ((im) this).field_d = ac.a(4);
        }
        ((im) this).field_b = new int[((im) this).field_c];
        ((im) this).field_a = new int[((im) this).field_c];
        for (var1 = 0; var1 < ((im) this).field_c; var1++) {
            int discarded$13 = ac.a(8);
            ((im) this).field_b[var1] = ac.a(8);
            ((im) this).field_a[var1] = ac.a(8);
        }
    }
}
