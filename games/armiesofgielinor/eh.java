/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int[] field_a;
    int field_b;
    int field_d;
    int[] field_c;

    eh() {
        int var1 = 0;
        int discarded$7 = qs.a(16);
        ((eh) this).field_b = qs.a() != 0 ? qs.a(4) + 1 : 1;
        if (qs.a() != 0) {
            int discarded$8 = qs.a(8);
        }
        int discarded$12 = qs.a(2);
        if (((eh) this).field_b > 1) {
            ((eh) this).field_d = qs.a(4);
        }
        ((eh) this).field_c = new int[((eh) this).field_b];
        ((eh) this).field_a = new int[((eh) this).field_b];
        for (var1 = 0; var1 < ((eh) this).field_b; var1++) {
            int discarded$13 = qs.a(8);
            ((eh) this).field_c[var1] = qs.a(8);
            ((eh) this).field_a[var1] = qs.a(8);
        }
    }
}
