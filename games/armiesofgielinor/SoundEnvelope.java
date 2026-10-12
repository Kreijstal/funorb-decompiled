/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    private int nextSegmentIndex;
    int endValue;
    private int levelStep;
    private int[] segmentLevels;
    int startValue;
    private int segmentCount;
    private int[] segmentTimes;
    private int sampleIndex;
    private int segmentEndSample;
    int waveformType;
    private int currentLevel;

    final void decode(PacketBuffer buffer) {
        this.waveformType = buffer.readUnsignedByte(0);
        this.startValue = buffer.readInt(1);
        this.endValue = buffer.readInt(1);
        this.decodeSegments(buffer);
    }

    final void reset() {
        this.segmentEndSample = 0;
        this.nextSegmentIndex = 0;
        this.levelStep = 0;
        this.currentLevel = 0;
        this.sampleIndex = 0;
    }

    final int step(int sampleCount) {
        int segmentIndex = 0;
        if (this.sampleIndex >= this.segmentEndSample) {
          segmentIndex = this.nextSegmentIndex;
          this.nextSegmentIndex = this.nextSegmentIndex + 1;
          this.currentLevel = this.segmentLevels[segmentIndex] << 15;
          if (this.nextSegmentIndex >= this.segmentCount) {
            this.nextSegmentIndex = this.segmentCount - 1;
          }
          this.segmentEndSample = (int)((double)this.segmentTimes[this.nextSegmentIndex] / 65536.0 * (double)sampleCount);
          if (this.segmentEndSample > this.sampleIndex) {
            this.levelStep = ((this.segmentLevels[this.nextSegmentIndex] << 15) - this.currentLevel) / (this.segmentEndSample - this.sampleIndex);
          }
        }
        this.currentLevel = this.currentLevel + this.levelStep;
        this.sampleIndex = this.sampleIndex + 1;
        return this.currentLevel - this.levelStep >> 15;
    }

    final void decodeSegments(PacketBuffer buffer) {
        int segmentIndex = 0;
        this.segmentCount = buffer.readUnsignedByte(0);
        this.segmentTimes = new int[this.segmentCount];
        this.segmentLevels = new int[this.segmentCount];
        for (segmentIndex = 0; segmentIndex < this.segmentCount; segmentIndex++) {
          this.segmentTimes[segmentIndex] = buffer.readUnsignedShort((byte) -104);
          this.segmentLevels[segmentIndex] = buffer.readUnsignedShort((byte) -104);
        }
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
