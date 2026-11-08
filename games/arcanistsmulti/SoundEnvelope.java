/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int field_i;
    private int field_d;
    int field_g;
    int field_k;
    private int[] field_a;
    private int field_c;
    private int field_b;
    int field_e;
    private int field_j;
    private int[] field_h;
    private int field_f;

    final void reset() {
        this.field_i = 0;
        this.field_d = 0;
        this.field_f = 0;
        this.field_j = 0;
        this.field_b = 0;
    }

    final void decodeSegments(PacketBuffer param0) {
        int var2 = 0;
        this.field_c = param0.readUnsignedByte((byte) -115);
        this.field_h = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
          this.field_h[var2] = param0.readUnsignedShort(-98);
          this.field_a[var2] = param0.readUnsignedShort(-98);
        }
    }

    final void decode(PacketBuffer param0) {
        this.field_g = param0.readUnsignedByte((byte) 62);
        this.field_k = param0.readInt(-10674);
        this.field_e = param0.readInt(-10674);
        this.decodeSegments(param0);
    }

    final int advance(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_b >= this.field_i) {
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          this.field_j = this.field_a[fieldTemp$0] << 15;
          if (this.field_d >= this.field_c) {
            this.field_d = this.field_c - 1;
          }
          this.field_i = (int)((double)this.field_h[this.field_d] / 65536.0 * (double)param0);
          if (this.field_i > this.field_b) {
            this.field_f = ((this.field_a[this.field_d] << 15) - this.field_j) / (this.field_i - this.field_b);
          }
        }
        this.field_j = this.field_j + this.field_f;
        this.field_b = this.field_b + 1;
        return this.field_j - this.field_f >> 15;
    }

    SoundEnvelope() {
        this.field_c = 2;
        this.field_h = new int[2];
        this.field_a = new int[2];
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
    }
}
