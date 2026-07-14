/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    int field_d;
    int field_b;
    int[] field_c;
    int[] field_a;

    nf() {
        int var1 = 0;
        int discarded$7 = sn.f(16);
        ((nf) this).field_d = sn.b() != 0 ? sn.f(4) + 1 : 1;
        if (sn.b() != 0) {
            int discarded$8 = sn.f(8);
        }
        int discarded$12 = sn.f(2);
        if (((nf) this).field_d > 1) {
            ((nf) this).field_b = sn.f(4);
        }
        ((nf) this).field_a = new int[((nf) this).field_d];
        ((nf) this).field_c = new int[((nf) this).field_d];
        for (var1 = 0; var1 < ((nf) this).field_d; var1++) {
            int discarded$13 = sn.f(8);
            ((nf) this).field_a[var1] = sn.f(8);
            ((nf) this).field_c[var1] = sn.f(8);
        }
    }
}
