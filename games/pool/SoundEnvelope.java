/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int segmentIndex;
    private int segmentEndSample;
    int field_f;
    private int[] segmentTimes;
    private int[] segmentLevels;
    private int segmentCount;
    private int amplitudeStepQ15;
    int field_a;
    private int field_i;
    private int amplitudeQ15;
    int field_b;

    final void b(PacketBuffer param0) {
        this.field_b = param0.readUnsignedByte(-67);
        this.field_f = param0.readInt(true);
        this.field_a = param0.readInt(true);
        this.a(param0);
    }

    final void a(PacketBuffer param0) {
        int var2 = 0;
        this.segmentCount = param0.readUnsignedByte(-128);
        this.segmentTimes = new int[this.segmentCount];
        this.segmentLevels = new int[this.segmentCount];
        for (var2 = 0; var2 < this.segmentCount; var2++) {
          this.segmentTimes[var2] = param0.readUnsignedShort(-1034);
          this.segmentLevels[var2] = param0.readUnsignedShort(-1034);
        }
    }

    final void reset() {
        this.segmentEndSample = 0;
        this.segmentIndex = 0;
        this.amplitudeStepQ15 = 0;
        this.amplitudeQ15 = 0;
        this.field_i = 0;
    }

    final int advance(int sampleCount) {
        int fieldTemp$0 = 0;
        if (this.field_i >= this.segmentEndSample) {
          fieldTemp$0 = this.segmentIndex;
          this.segmentIndex = this.segmentIndex + 1;
          this.amplitudeQ15 = this.segmentLevels[fieldTemp$0] << 15;
          if (this.segmentIndex >= this.segmentCount) {
            this.segmentIndex = this.segmentCount - 1;
          }
          this.segmentEndSample = (int)((double)this.segmentTimes[this.segmentIndex] / 65536.0 * (double)sampleCount);
          if (this.segmentEndSample > this.field_i) {
            this.amplitudeStepQ15 = ((this.segmentLevels[this.segmentIndex] << 15) - this.amplitudeQ15) / (this.segmentEndSample - this.field_i);
          }
        }
        this.amplitudeQ15 = this.amplitudeQ15 + this.amplitudeStepQ15;
        this.field_i = this.field_i + 1;
        return this.amplitudeQ15 - this.amplitudeStepQ15 >> 15;
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.segmentTimes = new int[2];
        this.segmentLevels = new int[2];
        this.segmentTimes[0] = 0;
        this.segmentTimes[1] = 65535;
        this.segmentLevels[0] = 0;
        this.segmentLevels[1] = 65535;
    }
}
