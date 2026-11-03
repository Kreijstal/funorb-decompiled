/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int[] field_j;
    private int segmentCount;
    int field_a;
    private int field_f;
    private int field_d;
    private int[] segmentTimes;
    private int segmentIndex;
    private int field_b;
    int field_c;
    int field_g;
    private int field_k;

    final void reset() {
        this.field_k = 0;
        this.segmentIndex = 0;
        this.field_b = 0;
        this.field_d = 0;
        this.field_f = 0;
    }

    final void decode(PacketBuffer param0) {
        this.field_a = param0.readUnsignedByte(255);
        this.field_c = param0.readInt(0);
        this.field_g = param0.readInt(0);
        this.decodeSegments(param0);
    }

    final int advance(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_k) {
          fieldTemp$0 = this.segmentIndex;
          this.segmentIndex = this.segmentIndex + 1;
          this.field_d = this.field_j[fieldTemp$0] << 15;
          if (this.segmentIndex >= this.segmentCount) {
            this.segmentIndex = this.segmentCount - 1;
          }
          this.field_k = (int)((double)this.segmentTimes[this.segmentIndex] / 65536.0 * (double)param0);
          if (this.field_k > this.field_f) {
            this.field_b = ((this.field_j[this.segmentIndex] << 15) - this.field_d) / (this.field_k - this.field_f);
          }
        }
        this.field_d = this.field_d + this.field_b;
        this.field_f = this.field_f + 1;
        return this.field_d - this.field_b >> 15;
    }

    final void decodeSegments(PacketBuffer param0) {
        int var2 = 0;
        this.segmentCount = param0.readUnsignedByte(255);
        this.segmentTimes = new int[this.segmentCount];
        this.field_j = new int[this.segmentCount];
        for (var2 = 0; var2 < this.segmentCount; var2++) {
          this.segmentTimes[var2] = param0.a((byte) -120);
          this.field_j[var2] = param0.a((byte) -125);
        }
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.segmentTimes = new int[2];
        this.field_j = new int[2];
        this.segmentTimes[0] = 0;
        this.segmentTimes[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
