/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    int field_d;
    int[] field_b;
    int[] field_a;
    int field_c;

    fq() {
        int var1 = 0;
        int discarded$7 = fd.a(16);
        ((fq) this).field_c = fd.c() != 0 ? fd.a(4) + 1 : 1;
        if (fd.c() != 0) {
            int discarded$8 = fd.a(8);
        }
        int discarded$12 = fd.a(2);
        if (((fq) this).field_c > 1) {
            ((fq) this).field_d = fd.a(4);
        }
        ((fq) this).field_b = new int[((fq) this).field_c];
        ((fq) this).field_a = new int[((fq) this).field_c];
        for (var1 = 0; var1 < ((fq) this).field_c; var1++) {
            int discarded$13 = fd.a(8);
            ((fq) this).field_b[var1] = fd.a(8);
            ((fq) this).field_a[var1] = fd.a(8);
        }
    }
}
