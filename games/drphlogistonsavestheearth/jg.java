/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    int field_b;
    int field_a;
    int[] field_d;
    int[] field_c;

    jg() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = tk.d(16);
        this.field_b = tk.a() != 0 ? tk.d(4) + 1 : 1;
        if (tk.a() != 0) {
            discarded$8 = tk.d(8);
        }
        int discarded$12 = tk.d(2);
        if (this.field_b > 1) {
            this.field_a = tk.d(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = tk.d(8);
            this.field_d[var1] = tk.d(8);
            this.field_c[var1] = tk.d(8);
        }
    }
}
