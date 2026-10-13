/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    int waveform;
    private int nextSegment;
    private int segmentEndSample;
    private int amplitudeQ15;
    private int samplePosition;
    int start;
    private int[] segmentValues;
    private int[] segmentTimes;
    private int amplitudeStepQ15;
    int end;
    private int segmentCount;

    final int nextValue(int sampleCount) {
        int currentSegment = 0;
        if (this.samplePosition >= this.segmentEndSample) {
          currentSegment = this.nextSegment;
          this.nextSegment = this.nextSegment + 1;
          this.amplitudeQ15 = this.segmentValues[currentSegment] << 15;
          if (this.nextSegment >= this.segmentCount) {
            this.nextSegment = this.segmentCount - 1;
          }
          this.segmentEndSample = (int)((double)this.segmentTimes[this.nextSegment] / 65536.0 * (double)sampleCount);
          if (this.segmentEndSample > this.samplePosition) {
            this.amplitudeStepQ15 = ((this.segmentValues[this.nextSegment] << 15) - this.amplitudeQ15) / (this.segmentEndSample - this.samplePosition);
          }
        }
        this.amplitudeQ15 = this.amplitudeQ15 + this.amplitudeStepQ15;
        this.samplePosition = this.samplePosition + 1;
        return this.amplitudeQ15 - this.amplitudeStepQ15 >> 15;
    }

    final void decode(PacketBuffer packet) {
        this.waveform = packet.readUnsignedByte(255);
        this.start = packet.readInt(255);
        this.end = packet.readInt(255);
        this.decodeSegments(packet);
    }

    final void reset() {
        this.segmentEndSample = 0;
        this.nextSegment = 0;
        this.amplitudeStepQ15 = 0;
        this.amplitudeQ15 = 0;
        this.samplePosition = 0;
    }

    final void decodeSegments(PacketBuffer packet) {
        int segmentIndex = 0;
        this.segmentCount = packet.readUnsignedByte(255);
        this.segmentTimes = new int[this.segmentCount];
        this.segmentValues = new int[this.segmentCount];
        for (segmentIndex = 0; segmentIndex < this.segmentCount; segmentIndex++) {
          this.segmentTimes[segmentIndex] = packet.readUnsignedShort(65280);
          this.segmentValues[segmentIndex] = packet.readUnsignedShort(65280);
        }
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.segmentTimes = new int[2];
        this.segmentValues = new int[2];
        this.segmentTimes[0] = 0;
        this.segmentTimes[1] = 65535;
        this.segmentValues[0] = 0;
        this.segmentValues[1] = 65535;
    }
}
