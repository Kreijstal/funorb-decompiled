/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    int field_b;
    int field_a;
    int[] field_d;
    int[] field_c;

    jg() {
        int var1 = 0;
        tk.readBits(16);
        this.field_b = tk.readBit() != 0 ? tk.readBits(4) + 1 : 1;
        if (tk.readBit() != 0) {
          tk.readBits(8);
        }
        tk.readBits(2);
        if (this.field_b > 1) {
          this.field_a = tk.readBits(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          tk.readBits(8);
          this.field_d[var1] = tk.readBits(8);
          this.field_c[var1] = tk.readBits(8);
        }
    }
}
