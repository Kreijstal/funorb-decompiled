/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int field_f;
    private int[] durations;
    private int field_k;
    private int[] amplitudes;
    private int field_h;
    private int field_i;
    int waveform;
    private int segmentCount;
    int end;
    private int field_j;
    int start;

    final void reset() {
        this.field_h = 0;
        this.field_f = 0;
        this.field_k = 0;
        this.field_i = 0;
        this.field_j = 0;
    }

    final int step(int sampleCount) {
        int fieldTemp$0 = 0;
        if (this.field_j >= this.field_h) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          this.field_i = this.amplitudes[fieldTemp$0] << 15;
          if (this.field_f >= this.segmentCount) {
            this.field_f = this.segmentCount - 1;
          }
          this.field_h = (int)((double)this.durations[this.field_f] / 65536.0 * (double)sampleCount);
          if (this.field_h > this.field_j) {
            this.field_k = ((this.amplitudes[this.field_f] << 15) - this.field_i) / (this.field_h - this.field_j);
          }
        }
        this.field_i = this.field_i + this.field_k;
        this.field_j = this.field_j + 1;
        return this.field_i - this.field_k >> 15;
    }

    final void decodeSegments(PacketBuffer buffer) {
        int var2 = 0;
        this.segmentCount = buffer.e(-31302);
        this.durations = new int[this.segmentCount];
        this.amplitudes = new int[this.segmentCount];
        for (var2 = 0; var2 < this.segmentCount; var2++) {
          this.durations[var2] = buffer.a(255);
          this.amplitudes[var2] = buffer.a(255);
        }
    }

    final void decode(PacketBuffer buffer) {
        this.waveform = buffer.e(-31302);
        this.start = buffer.c(true);
        this.end = buffer.c(true);
        this.decodeSegments(buffer);
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.durations = new int[2];
        this.amplitudes = new int[2];
        this.durations[0] = 0;
        this.durations[1] = 65535;
        this.amplitudes[0] = 0;
        this.amplitudes[1] = 65535;
    }
}
