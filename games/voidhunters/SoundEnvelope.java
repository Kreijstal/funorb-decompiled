/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    int start;
    private int nextBoundary;
    private int amplitudeStep;
    int waveform;
    int end;
    private int segmentIndex;
    private int amplitude;
    private int[] durations;
    private int[] phases;
    private int sampleIndex;
    private int segmentCount;

    final void reset() {
        this.nextBoundary = 0;
        this.segmentIndex = 0;
        this.amplitudeStep = 0;
        this.amplitude = 0;
        this.sampleIndex = 0;
    }

    final void decodeSegments(PacketBuffer param0) {
        int var2 = 0;
        this.segmentCount = param0.readUnsignedByte((byte) -113);
        this.durations = new int[this.segmentCount];
        this.phases = new int[this.segmentCount];
        for (var2 = 0; var2 < this.segmentCount; var2++) {
          this.durations[var2] = param0.readUnsignedShort(1869);
          this.phases[var2] = param0.readUnsignedShort(1869);
        }
    }

    final int step(int param0) {
        int fieldTemp$0 = 0;
        if (this.sampleIndex >= this.nextBoundary) {
          fieldTemp$0 = this.segmentIndex;
          this.segmentIndex = this.segmentIndex + 1;
          this.amplitude = this.phases[fieldTemp$0] << 15;
          if (this.segmentIndex >= this.segmentCount) {
            this.segmentIndex = this.segmentCount - 1;
          }
          this.nextBoundary = (int)((double)this.durations[this.segmentIndex] / 65536.0 * (double)param0);
          if (this.nextBoundary > this.sampleIndex) {
            this.amplitudeStep = ((this.phases[this.segmentIndex] << 15) - this.amplitude) / (this.nextBoundary - this.sampleIndex);
          }
        }
        this.amplitude = this.amplitude + this.amplitudeStep;
        this.sampleIndex = this.sampleIndex + 1;
        return this.amplitude - this.amplitudeStep >> 15;
    }

    final void decode(PacketBuffer param0) {
        this.waveform = param0.readUnsignedByte((byte) -110);
        this.start = param0.readInt(19);
        this.end = param0.readInt(63);
        this.decodeSegments(param0);
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.durations = new int[2];
        this.phases = new int[2];
        this.durations[0] = 0;
        this.durations[1] = 65535;
        this.phases[0] = 0;
        this.phases[1] = 65535;
    }
}
