/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    int field_d;
    int field_g;
    private int field_a;
    private int field_j;
    private int[] field_c;
    private int field_k;
    private int field_i;
    private int field_f;
    private int field_b;
    private int[] field_h;
    int field_e;

    final void b(PacketBuffer param0) {
        this.field_e = param0.readUnsignedByte((byte) -120);
        this.field_d = param0.readInt(-105);
        this.field_g = param0.readInt(-58);
        this.decodeSegments(param0);
    }

    final void reset() {
        this.field_i = 0;
        this.field_f = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_a = 0;
    }

    final int advance(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_i) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          this.field_j = this.field_c[fieldTemp$0] << 15;
          if (this.field_f >= this.field_k) {
            this.field_f = this.field_k - 1;
          }
          this.field_i = (int)((double)this.field_h[this.field_f] / 65536.0 * (double)param0);
          if (this.field_i > this.field_a) {
            this.field_b = ((this.field_c[this.field_f] << 15) - this.field_j) / (this.field_i - this.field_a);
          }
        }
        this.field_j = this.field_j + this.field_b;
        this.field_a = this.field_a + 1;
        return this.field_j - this.field_b >> 15;
    }

    final void decodeSegments(PacketBuffer param0) {
        int var2 = 0;
        this.field_k = param0.readUnsignedByte((byte) -120);
        this.field_h = new int[this.field_k];
        this.field_c = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
          this.field_h[var2] = param0.readUnsignedShort(2);
          this.field_c[var2] = param0.readUnsignedShort(2);
        }
    }

    ko() {
        this.field_k = 2;
        this.field_h = new int[2];
        this.field_c = new int[2];
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }
}
