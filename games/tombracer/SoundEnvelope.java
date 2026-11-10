/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int field_f;
    private int field_h;
    private int field_c;
    int field_e;
    private int[] field_d;
    int field_a;
    private int field_k;
    private int[] field_g;
    private int field_j;
    int field_i;
    private int field_b;

    final void decodeSegments(PacketBuffer param0) {
        int var2 = 0;
        this.field_f = param0.readUnsignedByte(255);
        this.field_d = new int[this.field_f];
        this.field_g = new int[this.field_f];
        for (var2 = 0; var2 < this.field_f; var2++) {
          this.field_d[var2] = param0.readUnsignedShort(122);
          this.field_g[var2] = param0.readUnsignedShort(124);
        }
    }

    final void decode(PacketBuffer param0) {
        this.field_a = param0.readUnsignedByte(255);
        this.field_e = param0.readInt(119);
        this.field_i = param0.readInt(110);
        this.decodeSegments(param0);
    }

    final void a() {
        this.field_h = 0;
        this.field_c = 0;
        this.field_b = 0;
        this.field_k = 0;
        this.field_j = 0;
    }

    final int advance(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_j >= this.field_h) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          this.field_k = this.field_g[fieldTemp$0] << 15;
          if (this.field_c >= this.field_f) {
            this.field_c = this.field_f - 1;
          }
          this.field_h = (int)((double)this.field_d[this.field_c] / 65536.0 * (double)param0);
          if (this.field_h > this.field_j) {
            this.field_b = ((this.field_g[this.field_c] << 15) - this.field_k) / (this.field_h - this.field_j);
          }
        }
        this.field_k = this.field_k + this.field_b;
        this.field_j = this.field_j + 1;
        return this.field_k - this.field_b >> 15;
    }

    SoundEnvelope() {
        this.field_f = 2;
        this.field_d = new int[2];
        this.field_g = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_g[0] = 0;
        this.field_g[1] = 65535;
    }
}
