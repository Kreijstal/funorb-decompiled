/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    int[] field_c;
    int[] field_b;
    int field_a;
    int field_d;

    rk() {
        int var1 = 0;
        qf.readBits(16);
        this.field_a = qf.readBit() != 0 ? qf.readBits(4) + 1 : 1;
        if (qf.readBit() != 0) {
          qf.readBits(8);
        }
        qf.readBits(2);
        if (this.field_a > 1) {
          this.field_d = qf.readBits(4);
        }
        this.field_b = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
          qf.readBits(8);
          this.field_b[var1] = qf.readBits(8);
          this.field_c[var1] = qf.readBits(8);
        }
    }
}
